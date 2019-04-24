// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.support.v4.view.ViewCompat;
import android.view.*;
import java.util.Map;
import o.al;
import o.as;

// Referenced classes of package android.support.transition:
//			Visibility, TransitionValues, Transition

public class Fade extends Visibility
{

	public Fade()
	{
		this(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #31  <Method void Fade(int)>
	//    3    5:return          
	}

	public Fade(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Visibility()>
		mFadingMode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #36  <Field int mFadingMode>
	//    5    9:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		int ai[] = new int[2];
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:astore_2        
		transitionvalues.view.getLocationOnScreen(ai);
	//    3    4:aload_1         
	//    4    5:getfield        #44  <Field View TransitionValues.view>
	//    5    8:aload_2         
	//    6    9:invokevirtual   #50  <Method void View.getLocationOnScreen(int[])>
		transitionvalues.values.put("android:fade:screenX", ((Object) (Integer.valueOf(ai[0]))));
	//    7   12:aload_1         
	//    8   13:getfield        #54  <Field Map TransitionValues.values>
	//    9   16:ldc1            #22  <String "android:fade:screenX">
	//   10   18:aload_2         
	//   11   19:iconst_0        
	//   12   20:iaload          
	//   13   21:invokestatic    #60  <Method Integer Integer.valueOf(int)>
	//   14   24:invokeinterface #66  <Method Object Map.put(Object, Object)>
	//   15   29:pop             
		transitionvalues.values.put("android:fade:screenY", ((Object) (Integer.valueOf(ai[1]))));
	//   16   30:aload_1         
	//   17   31:getfield        #54  <Field Map TransitionValues.values>
	//   18   34:ldc1            #25  <String "android:fade:screenY">
	//   19   36:aload_2         
	//   20   37:iconst_1        
	//   21   38:iaload          
	//   22   39:invokestatic    #60  <Method Integer Integer.valueOf(int)>
	//   23   42:invokeinterface #66  <Method Object Map.put(Object, Object)>
	//   24   47:pop             
	//   25   48:return          
	}

	private Animator createAnimation(View view, float f, float f1, AnimatorListenerAdapter animatorlisteneradapter)
	{
		if(f == f1)
	//*   0    0:fload_2         
	//*   1    1:fload_3         
	//*   2    2:fcmpl           
	//*   3    3:ifne            19
		{
			if(animatorlisteneradapter != null)
	//*   4    6:aload           4
	//*   5    8:ifnull          17
				animatorlisteneradapter.onAnimationEnd(((Animator) (null)));
	//    6   11:aload           4
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #74  <Method void AnimatorListenerAdapter.onAnimationEnd(Animator)>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		view = ((View) (ObjectAnimator.ofFloat(((Object) (view)), "alpha", new float[] {
			f, f1
		})));
	//   11   19:aload_1         
	//   12   20:ldc1            #76  <String "alpha">
	//   13   22:iconst_2        
	//   14   23:newarray        float[]
	//   15   25:dup             
	//   16   26:iconst_0        
	//   17   27:fload_2         
	//   18   28:fastore         
	//   19   29:dup             
	//   20   30:iconst_1        
	//   21   31:fload_3         
	//   22   32:fastore         
	//   23   33:invokestatic    #82  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   24   36:astore_1        
		if(animatorlisteneradapter != null)
	//*  25   37:aload           4
	//*  26   39:ifnull          48
			((ObjectAnimator) (view)).addListener(((android.animation.Animator.AnimatorListener) (animatorlisteneradapter)));
	//   27   42:aload_1         
	//   28   43:aload           4
	//   29   45:invokevirtual   #86  <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
		return ((Animator) (view));
	//   30   48:aload_1         
	//   31   49:areturn         
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		super.captureStartValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #90  <Method void Visibility.captureStartValues(TransitionValues)>
		captureValues(transitionvalues);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #92  <Method void captureValues(TransitionValues)>
	//    6   10:return          
	}

	public Animator onAppear(ViewGroup viewgroup, TransitionValues transitionvalues, int i, TransitionValues transitionvalues1, int j)
	{
		if((mFadingMode & 1) != 1 || transitionvalues1 == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field int mFadingMode>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          15
	//*   6   10:aload           4
	//*   7   12:ifnonnull       17
		{
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		} else
		{
			viewgroup = ((ViewGroup) (transitionvalues1.view));
	//   10   17:aload           4
	//   11   19:getfield        #44  <Field View TransitionValues.view>
	//   12   22:astore_1        
			((View) (viewgroup)).setAlpha(0.0F);
	//   13   23:aload_1         
	//   14   24:fconst_0        
	//   15   25:invokevirtual   #99  <Method void View.setAlpha(float)>
			addListener(((Transition.TransitionListener) (new Transition.TransitionListenerAdapter(((View) (viewgroup))) {

				public void onTransitionCancel(Transition transition)
				{
					b.setAlpha(1.0F);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field View b>
				//    2    4:fconst_1        
				//    3    5:invokevirtual   #38  <Method void View.setAlpha(float)>
					e = true;
				//    4    8:aload_0         
				//    5    9:iconst_1        
				//    6   10:putfield        #28  <Field boolean e>
				//    7   13:return          
				}

				public void onTransitionEnd(Transition transition)
				{
					if(!e)
				//*   0    0:aload_0         
				//*   1    1:getfield        #28  <Field boolean e>
				//*   2    4:ifne            15
						b.setAlpha(1.0F);
				//    3    7:aload_0         
				//    4    8:getfield        #23  <Field View b>
				//    5   11:fconst_1        
				//    6   12:invokevirtual   #38  <Method void View.setAlpha(float)>
				//    7   15:return          
				}

				public void onTransitionPause(Transition transition)
				{
					d = b.getAlpha();
				//    0    0:aload_0         
				//    1    1:aload_0         
				//    2    2:getfield        #23  <Field View b>
				//    3    5:invokevirtual   #45  <Method float View.getAlpha()>
				//    4    8:putfield        #47  <Field float d>
					b.setAlpha(1.0F);
				//    5   11:aload_0         
				//    6   12:getfield        #23  <Field View b>
				//    7   15:fconst_1        
				//    8   16:invokevirtual   #38  <Method void View.setAlpha(float)>
				//    9   19:return          
				}

				public void onTransitionResume(Transition transition)
				{
					b.setAlpha(d);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field View b>
				//    2    4:aload_0         
				//    3    5:getfield        #47  <Field float d>
				//    4    8:invokevirtual   #38  <Method void View.setAlpha(float)>
				//    5   11:return          
				}

				final View b;
				final Fade c;
				float d;
				boolean e;

			
			{
				c = Fade.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Fade c>
				b = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field View b>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Transition$TransitionListenerAdapter()>
				e = false;
			//    8   14:aload_0         
			//    9   15:iconst_0        
			//   10   16:putfield        #28  <Field boolean e>
			//   11   19:return          
			}
			}
)));
	//   16   28:aload_0         
	//   17   29:new             #8   <Class Fade$2>
	//   18   32:dup             
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokespecial   #102 <Method void Fade$2(Fade, View)>
	//   22   38:invokevirtual   #105 <Method Transition addListener(Transition$TransitionListener)>
	//   23   41:pop             
			return createAnimation(((View) (viewgroup)), 0.0F, 1.0F, ((AnimatorListenerAdapter) (null)));
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:fconst_0        
	//   27   45:fconst_1        
	//   28   46:aconst_null     
	//   29   47:invokespecial   #107 <Method Animator createAnimation(View, float, float, AnimatorListenerAdapter)>
	//   30   50:areturn         
		}
	}

	public Animator onDisappear(ViewGroup viewgroup, TransitionValues transitionvalues, int i, TransitionValues transitionvalues1, int j)
	{
		if((mFadingMode & 2) != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field int mFadingMode>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:iconst_2        
	//*   5    7:icmpeq          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		Object obj3 = null;
	//    8   12:aconst_null     
	//    9   13:astore          12
		Object obj2 = null;
	//   10   15:aconst_null     
	//   11   16:astore          11
		View view;
		if(transitionvalues != null)
	//*  12   18:aload_2         
	//*  13   19:ifnull          31
			view = transitionvalues.view;
	//   14   22:aload_2         
	//   15   23:getfield        #44  <Field View TransitionValues.view>
	//   16   26:astore          7
		else
	//*  17   28:goto            34
			view = null;
	//   18   31:aconst_null     
	//   19   32:astore          7
		if(transitionvalues1 != null)
	//*  20   34:aload           4
	//*  21   36:ifnull          49
			transitionvalues1 = ((TransitionValues) (transitionvalues1.view));
	//   22   39:aload           4
	//   23   41:getfield        #44  <Field View TransitionValues.view>
	//   24   44:astore          4
		else
	//*  25   46:goto            52
			transitionvalues1 = null;
	//   26   49:aconst_null     
	//   27   50:astore          4
		Object obj4 = null;
	//   28   52:aconst_null     
	//   29   53:astore          13
		Object obj5 = null;
	//   30   55:aconst_null     
	//   31   56:astore          14
		Object obj1 = null;
	//   32   58:aconst_null     
	//   33   59:astore          10
		Object obj;
		TransitionValues transitionvalues2;
		if(transitionvalues1 == null || ((View) (transitionvalues1)).getParent() == null)
	//*  34   61:aload           4
	//*  35   63:ifnull          74
	//*  36   66:aload           4
	//*  37   68:invokevirtual   #112 <Method ViewParent View.getParent()>
	//*  38   71:ifnonnull       249
		{
			if(transitionvalues1 != null)
	//*  39   74:aload           4
	//*  40   76:ifnull          90
			{
				obj = ((Object) (transitionvalues1));
	//   41   79:aload           4
	//   42   81:astore          8
				transitionvalues2 = ((TransitionValues) (obj1));
	//   43   83:aload           10
	//   44   85:astore          9
			} else
	//*  45   87:goto            296
			{
				transitionvalues1 = ((TransitionValues) (obj3));
	//   46   90:aload           12
	//   47   92:astore          4
				obj = ((Object) (obj4));
	//   48   94:aload           13
	//   49   96:astore          8
				transitionvalues2 = ((TransitionValues) (obj1));
	//   50   98:aload           10
	//   51  100:astore          9
				if(view != null)
	//*  52  102:aload           7
	//*  53  104:ifnull          296
					if(view.getParent() == null)
	//*  54  107:aload           7
	//*  55  109:invokevirtual   #112 <Method ViewParent View.getParent()>
	//*  56  112:ifnonnull       130
					{
						obj = ((Object) (view));
	//   57  115:aload           7
	//   58  117:astore          8
						transitionvalues1 = ((TransitionValues) (view));
	//   59  119:aload           7
	//   60  121:astore          4
						transitionvalues2 = ((TransitionValues) (obj1));
	//   61  123:aload           10
	//   62  125:astore          9
					} else
	//*  63  127:goto            296
					{
						transitionvalues1 = ((TransitionValues) (obj3));
	//   64  130:aload           12
	//   65  132:astore          4
						obj = ((Object) (obj4));
	//   66  134:aload           13
	//   67  136:astore          8
						transitionvalues2 = ((TransitionValues) (obj1));
	//   68  138:aload           10
	//   69  140:astore          9
						if(view.getParent() instanceof View)
	//*  70  142:aload           7
	//*  71  144:invokevirtual   #112 <Method ViewParent View.getParent()>
	//*  72  147:instanceof      #46  <Class View>
	//*  73  150:ifeq            296
						{
							transitionvalues1 = ((TransitionValues) (obj3));
	//   74  153:aload           12
	//   75  155:astore          4
							obj = ((Object) (obj4));
	//   76  157:aload           13
	//   77  159:astore          8
							transitionvalues2 = ((TransitionValues) (obj1));
	//   78  161:aload           10
	//   79  163:astore          9
							if(view.getParent().getParent() == null)
	//*  80  165:aload           7
	//*  81  167:invokevirtual   #112 <Method ViewParent View.getParent()>
	//*  82  170:invokeinterface #115 <Method ViewParent ViewParent.getParent()>
	//*  83  175:ifnonnull       296
							{
								i = ((View)view.getParent()).getId();
	//   84  178:aload           7
	//   85  180:invokevirtual   #112 <Method ViewParent View.getParent()>
	//   86  183:checkcast       #46  <Class View>
	//   87  186:invokevirtual   #119 <Method int View.getId()>
	//   88  189:istore_3        
								transitionvalues1 = ((TransitionValues) (obj2));
	//   89  190:aload           11
	//   90  192:astore          4
								obj = ((Object) (obj5));
	//   91  194:aload           14
	//   92  196:astore          8
								if(i != -1)
	//*  93  198:iload_3         
	//*  94  199:iconst_m1       
	//*  95  200:icmpeq          242
								{
									transitionvalues1 = ((TransitionValues) (obj2));
	//   96  203:aload           11
	//   97  205:astore          4
									obj = ((Object) (obj5));
	//   98  207:aload           14
	//   99  209:astore          8
									if(viewgroup.findViewById(i) != null)
	//* 100  211:aload_1         
	//* 101  212:iload_3         
	//* 102  213:invokevirtual   #125 <Method View ViewGroup.findViewById(int)>
	//* 103  216:ifnull          242
									{
										transitionvalues1 = ((TransitionValues) (obj2));
	//  104  219:aload           11
	//  105  221:astore          4
										obj = ((Object) (obj5));
	//  106  223:aload           14
	//  107  225:astore          8
										if(mCanRemoveViews)
	//* 108  227:aload_0         
	//* 109  228:getfield        #129 <Field boolean mCanRemoveViews>
	//* 110  231:ifeq            242
										{
											obj = ((Object) (view));
	//  111  234:aload           7
	//  112  236:astore          8
											transitionvalues1 = ((TransitionValues) (view));
	//  113  238:aload           7
	//  114  240:astore          4
										}
									}
								}
								transitionvalues2 = ((TransitionValues) (obj1));
	//  115  242:aload           10
	//  116  244:astore          9
							}
						}
					}
			}
		} else
	//* 117  246:goto            296
		if(j == 4)
	//* 118  249:iload           5
	//* 119  251:iconst_4        
	//* 120  252:icmpne          266
		{
			transitionvalues2 = transitionvalues1;
	//  121  255:aload           4
	//  122  257:astore          9
			obj = ((Object) (obj4));
	//  123  259:aload           13
	//  124  261:astore          8
		} else
	//* 125  263:goto            296
		if(view == transitionvalues1)
	//* 126  266:aload           7
	//* 127  268:aload           4
	//* 128  270:if_acmpne       284
		{
			transitionvalues2 = transitionvalues1;
	//  129  273:aload           4
	//  130  275:astore          9
			obj = ((Object) (obj4));
	//  131  277:aload           13
	//  132  279:astore          8
		} else
	//* 133  281:goto            296
		{
			transitionvalues1 = ((TransitionValues) (view));
	//  134  284:aload           7
	//  135  286:astore          4
			obj = ((Object) (transitionvalues1));
	//  136  288:aload           4
	//  137  290:astore          8
			transitionvalues2 = ((TransitionValues) (obj1));
	//  138  292:aload           10
	//  139  294:astore          9
		}
		if(obj != null)
	//* 140  296:aload           8
	//* 141  298:ifnull          417
		{
			i = ((Integer)transitionvalues.values.get("android:fade:screenX")).intValue();
	//  142  301:aload_2         
	//  143  302:getfield        #54  <Field Map TransitionValues.values>
	//  144  305:ldc1            #22  <String "android:fade:screenX">
	//  145  307:invokeinterface #133 <Method Object Map.get(Object)>
	//  146  312:checkcast       #56  <Class Integer>
	//  147  315:invokevirtual   #136 <Method int Integer.intValue()>
	//  148  318:istore_3        
			int k = ((Integer)transitionvalues.values.get("android:fade:screenY")).intValue();
	//  149  319:aload_2         
	//  150  320:getfield        #54  <Field Map TransitionValues.values>
	//  151  323:ldc1            #25  <String "android:fade:screenY">
	//  152  325:invokeinterface #133 <Method Object Map.get(Object)>
	//  153  330:checkcast       #56  <Class Integer>
	//  154  333:invokevirtual   #136 <Method int Integer.intValue()>
	//  155  336:istore          6
			transitionvalues = ((TransitionValues) (new int[2]));
	//  156  338:iconst_2        
	//  157  339:newarray        int[]
	//  158  341:astore_2        
			viewgroup.getLocationOnScreen(((int []) (transitionvalues)));
	//  159  342:aload_1         
	//  160  343:aload_2         
	//  161  344:invokevirtual   #137 <Method void ViewGroup.getLocationOnScreen(int[])>
			ViewCompat.offsetLeftAndRight(((View) (obj)), i - transitionvalues[0] - ((View) (obj)).getLeft());
	//  162  347:aload           8
	//  163  349:iload_3         
	//  164  350:aload_2         
	//  165  351:iconst_0        
	//  166  352:iaload          
	//  167  353:isub            
	//  168  354:aload           8
	//  169  356:invokevirtual   #140 <Method int View.getLeft()>
	//  170  359:isub            
	//  171  360:invokestatic    #146 <Method void ViewCompat.offsetLeftAndRight(View, int)>
			ViewCompat.offsetTopAndBottom(((View) (obj)), k - transitionvalues[1] - ((View) (obj)).getTop());
	//  172  363:aload           8
	//  173  365:iload           6
	//  174  367:aload_2         
	//  175  368:iconst_1        
	//  176  369:iaload          
	//  177  370:isub            
	//  178  371:aload           8
	//  179  373:invokevirtual   #149 <Method int View.getTop()>
	//  180  376:isub            
	//  181  377:invokestatic    #152 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			as.e(viewgroup).d(((View) (obj)));
	//  182  380:aload_1         
	//  183  381:invokestatic    #158 <Method al as.e(ViewGroup)>
	//  184  384:aload           8
	//  185  386:invokeinterface #164 <Method void al.d(View)>
			return createAnimation(((View) (transitionvalues1)), 1.0F, 0.0F, ((AnimatorListenerAdapter) (new AnimatorListenerAdapter(((View) (transitionvalues1)), ((View) (transitionvalues2)), j, ((View) (obj)), viewgroup) {

				public void onAnimationEnd(Animator animator)
				{
					c.setAlpha(1.0F);
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field View c>
				//    2    4:fconst_1        
				//    3    5:invokevirtual   #45  <Method void View.setAlpha(float)>
					if(b != null)
				//*   4    8:aload_0         
				//*   5    9:getfield        #27  <Field View b>
				//*   6   12:ifnull          26
						b.setVisibility(e);
				//    7   15:aload_0         
				//    8   16:getfield        #27  <Field View b>
				//    9   19:aload_0         
				//   10   20:getfield        #29  <Field int e>
				//   11   23:invokevirtual   #49  <Method void View.setVisibility(int)>
					if(d != null)
				//*  12   26:aload_0         
				//*  13   27:getfield        #31  <Field View d>
				//*  14   30:ifnull          49
						as.e(a).c(d);
				//   15   33:aload_0         
				//   16   34:getfield        #33  <Field ViewGroup a>
				//   17   37:invokestatic    #54  <Method al as.e(ViewGroup)>
				//   18   40:aload_0         
				//   19   41:getfield        #31  <Field View d>
				//   20   44:invokeinterface #59  <Method void al.c(View)>
				//   21   49:return          
				}

				final ViewGroup a;
				final View b;
				final View c;
				final View d;
				final int e;
				final Fade h;

			
			{
				h = Fade.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field Fade h>
				c = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field View c>
				b = view1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field View b>
				e = i;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #29  <Field int e>
				d = view2;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #31  <Field View d>
				a = viewgroup;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #33  <Field ViewGroup a>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #36  <Method void AnimatorListenerAdapter()>
			//   20   37:return          
			}
			}
)));
	//  186  391:aload_0         
	//  187  392:aload           4
	//  188  394:fconst_1        
	//  189  395:fconst_0        
	//  190  396:new             #6   <Class Fade$1>
	//  191  399:dup             
	//  192  400:aload_0         
	//  193  401:aload           4
	//  194  403:aload           9
	//  195  405:iload           5
	//  196  407:aload           8
	//  197  409:aload_1         
	//  198  410:invokespecial   #167 <Method void Fade$1(Fade, View, View, int, View, ViewGroup)>
	//  199  413:invokespecial   #107 <Method Animator createAnimation(View, float, float, AnimatorListenerAdapter)>
	//  200  416:areturn         
		}
		if(transitionvalues2 != null)
	//* 201  417:aload           9
	//* 202  419:ifnull          454
		{
			((View) (transitionvalues2)).setVisibility(0);
	//  203  422:aload           9
	//  204  424:iconst_0        
	//  205  425:invokevirtual   #170 <Method void View.setVisibility(int)>
			return createAnimation(((View) (transitionvalues1)), 1.0F, 0.0F, ((AnimatorListenerAdapter) (new AnimatorListenerAdapter(((View) (transitionvalues1)), ((View) (transitionvalues2)), j, ((View) (obj)), viewgroup) {

				public void onAnimationCancel(Animator animator)
				{
					e = true;
				//    0    0:aload_0         
				//    1    1:iconst_1        
				//    2    2:putfield        #42  <Field boolean e>
					if(b >= 0.0F)
				//*   3    5:aload_0         
				//*   4    6:getfield        #45  <Field float b>
				//*   5    9:fconst_0        
				//*   6   10:fcmpl           
				//*   7   11:iflt            25
						a.setAlpha(b);
				//    8   14:aload_0         
				//    9   15:getfield        #29  <Field View a>
				//   10   18:aload_0         
				//   11   19:getfield        #45  <Field float b>
				//   12   22:invokevirtual   #54  <Method void View.setAlpha(float)>
				//   13   25:return          
				}

				public void onAnimationEnd(Animator animator)
				{
					if(!e)
				//*   0    0:aload_0         
				//*   1    1:getfield        #42  <Field boolean e>
				//*   2    4:ifne            15
						a.setAlpha(1.0F);
				//    3    7:aload_0         
				//    4    8:getfield        #29  <Field View a>
				//    5   11:fconst_1        
				//    6   12:invokevirtual   #54  <Method void View.setAlpha(float)>
					if(d != null && !e)
				//*   7   15:aload_0         
				//*   8   16:getfield        #31  <Field View d>
				//*   9   19:ifnull          40
				//*  10   22:aload_0         
				//*  11   23:getfield        #42  <Field boolean e>
				//*  12   26:ifne            40
						d.setVisibility(c);
				//   13   29:aload_0         
				//   14   30:getfield        #31  <Field View d>
				//   15   33:aload_0         
				//   16   34:getfield        #33  <Field int c>
				//   17   37:invokevirtual   #59  <Method void View.setVisibility(int)>
					if(g != null)
				//*  18   40:aload_0         
				//*  19   41:getfield        #35  <Field View g>
				//*  20   44:ifnull          63
						as.e(f).c(g);
				//   21   47:aload_0         
				//   22   48:getfield        #37  <Field ViewGroup f>
				//   23   51:invokestatic    #64  <Method al as.e(ViewGroup)>
				//   24   54:aload_0         
				//   25   55:getfield        #35  <Field View g>
				//   26   58:invokeinterface #69  <Method void al.c(View)>
				//   27   63:return          
				}

				final View a;
				float b;
				final int c;
				final View d;
				boolean e;
				final ViewGroup f;
				final View g;
				final Fade h;

			
			{
				h = Fade.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field Fade h>
				a = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #29  <Field View a>
				d = view1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #31  <Field View d>
				c = i;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #33  <Field int c>
				g = view2;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #35  <Field View g>
				f = viewgroup;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #37  <Field ViewGroup f>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #40  <Method void AnimatorListenerAdapter()>
				e = false;
			//   20   37:aload_0         
			//   21   38:iconst_0        
			//   22   39:putfield        #42  <Field boolean e>
				b = -1F;
			//   23   42:aload_0         
			//   24   43:ldc1            #43  <Float -1F>
			//   25   45:putfield        #45  <Field float b>
			//   26   48:return          
			}
			}
)));
	//  206  428:aload_0         
	//  207  429:aload           4
	//  208  431:fconst_1        
	//  209  432:fconst_0        
	//  210  433:new             #10  <Class Fade$4>
	//  211  436:dup             
	//  212  437:aload_0         
	//  213  438:aload           4
	//  214  440:aload           9
	//  215  442:iload           5
	//  216  444:aload           8
	//  217  446:aload_1         
	//  218  447:invokespecial   #171 <Method void Fade$4(Fade, View, View, int, View, ViewGroup)>
	//  219  450:invokespecial   #107 <Method Animator createAnimation(View, float, float, AnimatorListenerAdapter)>
	//  220  453:areturn         
		} else
		{
			return null;
	//  221  454:aconst_null     
	//  222  455:areturn         
		}
	}

	public static final int IN = 1;
	private static final String LOG_TAG = "Fade";
	public static final int OUT = 2;
	private static final String PROPNAME_SCREEN_X = "android:fade:screenX";
	private static final String PROPNAME_SCREEN_Y = "android:fade:screenY";
	private int mFadingMode;
}
