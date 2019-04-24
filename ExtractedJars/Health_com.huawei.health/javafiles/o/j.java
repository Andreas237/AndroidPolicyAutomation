// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.animation.*;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

public class j
{

	j()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static void a(View view, float f)
	{
		int i = view.getResources().getInteger(android.support.design.R.integer.app_bar_elevation_anim_duration);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Resources View.getResources()>
	//    2    4:getstatic       #32  <Field int android.support.design.R$integer.app_bar_elevation_anim_duration>
	//    3    7:invokevirtual   #38  <Method int Resources.getInteger(int)>
	//    4   10:istore_2        
		StateListAnimator statelistanimator = new StateListAnimator();
	//    5   11:new             #40  <Class StateListAnimator>
	//    6   14:dup             
	//    7   15:invokespecial   #41  <Method void StateListAnimator()>
	//    8   18:astore          5
		int k = android.support.design.R.attr.state_collapsible;
	//    9   20:getstatic       #46  <Field int android.support.design.R$attr.state_collapsible>
	//   10   23:istore_3        
		int l = -android.support.design.R.attr.state_collapsed;
	//   11   24:getstatic       #49  <Field int android.support.design.R$attr.state_collapsed>
	//   12   27:ineg            
	//   13   28:istore          4
		ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (view)), "elevation", new float[] {
			0.0F
		}).setDuration(i);
	//   14   30:aload_0         
	//   15   31:ldc1            #51  <String "elevation">
	//   16   33:iconst_1        
	//   17   34:newarray        float[]
	//   18   36:dup             
	//   19   37:iconst_0        
	//   20   38:fconst_0        
	//   21   39:fastore         
	//   22   40:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   23   43:iload_2         
	//   24   44:i2l             
	//   25   45:invokevirtual   #61  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   26   48:astore          6
		statelistanimator.addState(new int[] {
			0x101000e, k, l
		}, ((android.animation.Animator) (objectanimator)));
	//   27   50:aload           5
	//   28   52:iconst_3        
	//   29   53:newarray        int[]
	//   30   55:dup             
	//   31   56:iconst_0        
	//   32   57:ldc1            #62  <Int 0x101000e>
	//   33   59:iastore         
	//   34   60:dup             
	//   35   61:iconst_1        
	//   36   62:iload_3         
	//   37   63:iastore         
	//   38   64:dup             
	//   39   65:iconst_2        
	//   40   66:iload           4
	//   41   68:iastore         
	//   42   69:aload           6
	//   43   71:invokevirtual   #66  <Method void StateListAnimator.addState(int[], android.animation.Animator)>
		objectanimator = ObjectAnimator.ofFloat(((Object) (view)), "elevation", new float[] {
			f
		}).setDuration(i);
	//   44   74:aload_0         
	//   45   75:ldc1            #51  <String "elevation">
	//   46   77:iconst_1        
	//   47   78:newarray        float[]
	//   48   80:dup             
	//   49   81:iconst_0        
	//   50   82:fload_1         
	//   51   83:fastore         
	//   52   84:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   53   87:iload_2         
	//   54   88:i2l             
	//   55   89:invokevirtual   #61  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   56   92:astore          6
		statelistanimator.addState(new int[] {
			0x101000e
		}, ((android.animation.Animator) (objectanimator)));
	//   57   94:aload           5
	//   58   96:iconst_1        
	//   59   97:newarray        int[]
	//   60   99:dup             
	//   61  100:iconst_0        
	//   62  101:ldc1            #62  <Int 0x101000e>
	//   63  103:iastore         
	//   64  104:aload           6
	//   65  106:invokevirtual   #66  <Method void StateListAnimator.addState(int[], android.animation.Animator)>
		objectanimator = ObjectAnimator.ofFloat(((Object) (view)), "elevation", new float[] {
			0.0F
		}).setDuration(0L);
	//   66  109:aload_0         
	//   67  110:ldc1            #51  <String "elevation">
	//   68  112:iconst_1        
	//   69  113:newarray        float[]
	//   70  115:dup             
	//   71  116:iconst_0        
	//   72  117:fconst_0        
	//   73  118:fastore         
	//   74  119:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   75  122:lconst_0        
	//   76  123:invokevirtual   #61  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   77  126:astore          6
		statelistanimator.addState(new int[0], ((android.animation.Animator) (objectanimator)));
	//   78  128:aload           5
	//   79  130:iconst_0        
	//   80  131:newarray        int[]
	//   81  133:aload           6
	//   82  135:invokevirtual   #66  <Method void StateListAnimator.addState(int[], android.animation.Animator)>
		view.setStateListAnimator(statelistanimator);
	//   83  138:aload_0         
	//   84  139:aload           5
	//   85  141:invokevirtual   #70  <Method void View.setStateListAnimator(StateListAnimator)>
	//   86  144:return          
	}

	public static void b(View view)
	{
		view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
	//    0    0:aload_0         
	//    1    1:getstatic       #78  <Field ViewOutlineProvider ViewOutlineProvider.BOUNDS>
	//    2    4:invokevirtual   #82  <Method void View.setOutlineProvider(ViewOutlineProvider)>
	//    3    7:return          
	}

	public static void b(View view, AttributeSet attributeset, int i, int k)
	{
		Context context;
		context = view.getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method Context View.getContext()>
	//    2    4:astore          4
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, d, i, k)));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:getstatic       #14  <Field int[] d>
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #93  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    9   17:astore_1        
		if(((TypedArray) (attributeset)).hasValue(0))
	//*  10   18:aload_1         
	//*  11   19:iconst_0        
	//*  12   20:invokevirtual   #99  <Method boolean TypedArray.hasValue(int)>
	//*  13   23:ifeq            41
			view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, ((TypedArray) (attributeset)).getResourceId(0, 0)));
	//   14   26:aload_0         
	//   15   27:aload           4
	//   16   29:aload_1         
	//   17   30:iconst_0        
	//   18   31:iconst_0        
	//   19   32:invokevirtual   #103 <Method int TypedArray.getResourceId(int, int)>
	//   20   35:invokestatic    #109 <Method StateListAnimator AnimatorInflater.loadStateListAnimator(Context, int)>
	//   21   38:invokevirtual   #70  <Method void View.setStateListAnimator(StateListAnimator)>
		((TypedArray) (attributeset)).recycle();
	//   22   41:aload_1         
	//   23   42:invokevirtual   #112 <Method void TypedArray.recycle()>
		return;
	//   24   45:return          
		view;
	//   25   46:astore_0        
		((TypedArray) (attributeset)).recycle();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #112 <Method void TypedArray.recycle()>
		throw view;
	//   28   51:aload_0         
	//   29   52:athrow          
	}

	private static final int d[] = {
		0x1010448
	};

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #12  <Int 0x1010448>
	//    5    7:iastore         
	//    6    8:putstatic       #14  <Field int[] d>
	//*   7   11:return          
	}
}
