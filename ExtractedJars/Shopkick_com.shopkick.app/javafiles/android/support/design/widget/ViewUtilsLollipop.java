// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.internal.ThemeEnforcement;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

class ViewUtilsLollipop
{

	ViewUtilsLollipop()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	static void setBoundsViewOutlineProvider(View view)
	{
		view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
	//    0    0:aload_0         
	//    1    1:getstatic       #26  <Field ViewOutlineProvider ViewOutlineProvider.BOUNDS>
	//    2    4:invokevirtual   #32  <Method void View.setOutlineProvider(ViewOutlineProvider)>
	//    3    7:return          
	}

	static void setDefaultAppBarLayoutStateListAnimator(View view, float f)
	{
		int i = view.getResources().getInteger(android.support.design.R.integer.app_bar_elevation_anim_duration);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Resources View.getResources()>
	//    2    4:getstatic       #44  <Field int android.support.design.R$integer.app_bar_elevation_anim_duration>
	//    3    7:invokevirtual   #50  <Method int Resources.getInteger(int)>
	//    4   10:istore_2        
		StateListAnimator statelistanimator = new StateListAnimator();
	//    5   11:new             #52  <Class StateListAnimator>
	//    6   14:dup             
	//    7   15:invokespecial   #53  <Method void StateListAnimator()>
	//    8   18:astore          7
		int j = android.support.design.R.attr.state_liftable;
	//    9   20:getstatic       #58  <Field int android.support.design.R$attr.state_liftable>
	//   10   23:istore_3        
		int k = -android.support.design.R.attr.state_lifted;
	//   11   24:getstatic       #61  <Field int android.support.design.R$attr.state_lifted>
	//   12   27:ineg            
	//   13   28:istore          4
		ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (view)), "elevation", new float[] {
			0.0F
		});
	//   14   30:aload_0         
	//   15   31:ldc1            #63  <String "elevation">
	//   16   33:iconst_1        
	//   17   34:newarray        float[]
	//   18   36:dup             
	//   19   37:iconst_0        
	//   20   38:fconst_0        
	//   21   39:fastore         
	//   22   40:invokestatic    #69  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   23   43:astore          8
		long l = i;
	//   24   45:iload_2         
	//   25   46:i2l             
	//   26   47:lstore          5
		objectanimator = objectanimator.setDuration(l);
	//   27   49:aload           8
	//   28   51:lload           5
	//   29   53:invokevirtual   #73  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   30   56:astore          8
		statelistanimator.addState(new int[] {
			0x101000e, j, k
		}, ((android.animation.Animator) (objectanimator)));
	//   31   58:aload           7
	//   32   60:iconst_3        
	//   33   61:newarray        int[]
	//   34   63:dup             
	//   35   64:iconst_0        
	//   36   65:ldc1            #74  <Int 0x101000e>
	//   37   67:iastore         
	//   38   68:dup             
	//   39   69:iconst_1        
	//   40   70:iload_3         
	//   41   71:iastore         
	//   42   72:dup             
	//   43   73:iconst_2        
	//   44   74:iload           4
	//   45   76:iastore         
	//   46   77:aload           8
	//   47   79:invokevirtual   #78  <Method void StateListAnimator.addState(int[], android.animation.Animator)>
		objectanimator = ObjectAnimator.ofFloat(((Object) (view)), "elevation", new float[] {
			f
		}).setDuration(l);
	//   48   82:aload_0         
	//   49   83:ldc1            #63  <String "elevation">
	//   50   85:iconst_1        
	//   51   86:newarray        float[]
	//   52   88:dup             
	//   53   89:iconst_0        
	//   54   90:fload_1         
	//   55   91:fastore         
	//   56   92:invokestatic    #69  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   57   95:lload           5
	//   58   97:invokevirtual   #73  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   59  100:astore          8
		statelistanimator.addState(new int[] {
			0x101000e
		}, ((android.animation.Animator) (objectanimator)));
	//   60  102:aload           7
	//   61  104:iconst_1        
	//   62  105:newarray        int[]
	//   63  107:dup             
	//   64  108:iconst_0        
	//   65  109:ldc1            #74  <Int 0x101000e>
	//   66  111:iastore         
	//   67  112:aload           8
	//   68  114:invokevirtual   #78  <Method void StateListAnimator.addState(int[], android.animation.Animator)>
		objectanimator = ObjectAnimator.ofFloat(((Object) (view)), "elevation", new float[] {
			0.0F
		}).setDuration(0L);
	//   69  117:aload_0         
	//   70  118:ldc1            #63  <String "elevation">
	//   71  120:iconst_1        
	//   72  121:newarray        float[]
	//   73  123:dup             
	//   74  124:iconst_0        
	//   75  125:fconst_0        
	//   76  126:fastore         
	//   77  127:invokestatic    #69  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   78  130:lconst_0        
	//   79  131:invokevirtual   #73  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   80  134:astore          8
		statelistanimator.addState(new int[0], ((android.animation.Animator) (objectanimator)));
	//   81  136:aload           7
	//   82  138:iconst_0        
	//   83  139:newarray        int[]
	//   84  141:aload           8
	//   85  143:invokevirtual   #78  <Method void StateListAnimator.addState(int[], android.animation.Animator)>
		view.setStateListAnimator(statelistanimator);
	//   86  146:aload_0         
	//   87  147:aload           7
	//   88  149:invokevirtual   #82  <Method void View.setStateListAnimator(StateListAnimator)>
	//   89  152:return          
	}

	static void setStateListAnimatorFromAttrs(View view, AttributeSet attributeset, int i, int j)
	{
		android.content.Context context;
		context = view.getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method android.content.Context View.getContext()>
	//    2    4:astore          4
		attributeset = ((AttributeSet) (ThemeEnforcement.obtainStyledAttributes(context, attributeset, STATE_LIST_ANIM_ATTRS, i, j, new int[0])));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:getstatic       #14  <Field int[] STATE_LIST_ANIM_ATTRS>
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:iconst_0        
	//    9   15:newarray        int[]
	//   10   17:invokestatic    #94  <Method TypedArray ThemeEnforcement.obtainStyledAttributes(android.content.Context, AttributeSet, int[], int, int, int[])>
	//   11   20:astore_1        
		if(((TypedArray) (attributeset)).hasValue(0))
	//*  12   21:aload_1         
	//*  13   22:iconst_0        
	//*  14   23:invokevirtual   #100 <Method boolean TypedArray.hasValue(int)>
	//*  15   26:ifeq            44
			view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, ((TypedArray) (attributeset)).getResourceId(0, 0)));
	//   16   29:aload_0         
	//   17   30:aload           4
	//   18   32:aload_1         
	//   19   33:iconst_0        
	//   20   34:iconst_0        
	//   21   35:invokevirtual   #104 <Method int TypedArray.getResourceId(int, int)>
	//   22   38:invokestatic    #110 <Method StateListAnimator AnimatorInflater.loadStateListAnimator(android.content.Context, int)>
	//   23   41:invokevirtual   #82  <Method void View.setStateListAnimator(StateListAnimator)>
		((TypedArray) (attributeset)).recycle();
	//   24   44:aload_1         
	//   25   45:invokevirtual   #113 <Method void TypedArray.recycle()>
		return;
	//   26   48:return          
		view;
	//   27   49:astore_0        
		((TypedArray) (attributeset)).recycle();
	//   28   50:aload_1         
	//   29   51:invokevirtual   #113 <Method void TypedArray.recycle()>
		throw view;
	//   30   54:aload_0         
	//   31   55:athrow          
	}

	private static final int STATE_LIST_ANIM_ATTRS[] = {
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
	//    6    8:putstatic       #14  <Field int[] STATE_LIST_ANIM_ATTRS>
	//*   7   11:return          
	}
}
