// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Transition, ah, z, au

public class ChangeClipBounds extends Transition
{

	public ChangeClipBounds()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Transition()>
	//    2    4:return          
	}

	public ChangeClipBounds(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void Transition(Context, AttributeSet)>
	//    4    6:return          
	}

	private void d(ah ah1)
	{
		Object obj = ((Object) (ah1.b));
	//    0    0:aload_1         
	//    1    1:getfield        #31  <Field View ah.b>
	//    2    4:astore_2        
		if(((View) (obj)).getVisibility() == 8)
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #37  <Method int View.getVisibility()>
	//*   5    9:bipush          8
	//*   6   11:icmpne          15
			return;
	//    7   14:return          
		Rect rect = s.z(((View) (obj)));
	//    8   15:aload_2         
	//    9   16:invokestatic    #43  <Method Rect s.z(View)>
	//   10   19:astore_3        
		ah1.a.put("android:clipBounds:clip", ((Object) (rect)));
	//   11   20:aload_1         
	//   12   21:getfield        #47  <Field Map ah.a>
	//   13   24:ldc1            #14  <String "android:clipBounds:clip">
	//   14   26:aload_3         
	//   15   27:invokeinterface #53  <Method Object Map.put(Object, Object)>
	//   16   32:pop             
		if(rect == null)
	//*  17   33:aload_3         
	//*  18   34:ifnonnull       68
		{
			obj = ((Object) (new Rect(0, 0, ((View) (obj)).getWidth(), ((View) (obj)).getHeight())));
	//   19   37:new             #55  <Class Rect>
	//   20   40:dup             
	//   21   41:iconst_0        
	//   22   42:iconst_0        
	//   23   43:aload_2         
	//   24   44:invokevirtual   #58  <Method int View.getWidth()>
	//   25   47:aload_2         
	//   26   48:invokevirtual   #61  <Method int View.getHeight()>
	//   27   51:invokespecial   #64  <Method void Rect(int, int, int, int)>
	//   28   54:astore_2        
			ah1.a.put("android:clipBounds:bounds", obj);
	//   29   55:aload_1         
	//   30   56:getfield        #47  <Field Map ah.a>
	//   31   59:ldc1            #66  <String "android:clipBounds:bounds">
	//   32   61:aload_2         
	//   33   62:invokeinterface #53  <Method Object Map.put(Object, Object)>
	//   34   67:pop             
		}
	//   35   68:return          
	}

	public Animator a(ViewGroup viewgroup, ah ah1, ah ah2)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		viewgroup = ((ViewGroup) (obj));
	//    2    3:aload           5
	//    3    5:astore_1        
		if(ah1 != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          247
		{
			viewgroup = ((ViewGroup) (obj));
	//    6   10:aload           5
	//    7   12:astore_1        
			if(ah2 != null)
	//*   8   13:aload_3         
	//*   9   14:ifnull          247
			{
				viewgroup = ((ViewGroup) (obj));
	//   10   17:aload           5
	//   11   19:astore_1        
				if(ah1.a.containsKey("android:clipBounds:clip"))
	//*  12   20:aload_2         
	//*  13   21:getfield        #47  <Field Map ah.a>
	//*  14   24:ldc1            #14  <String "android:clipBounds:clip">
	//*  15   26:invokeinterface #71  <Method boolean Map.containsKey(Object)>
	//*  16   31:ifeq            247
				{
					if(!ah2.a.containsKey("android:clipBounds:clip"))
	//*  17   34:aload_3         
	//*  18   35:getfield        #47  <Field Map ah.a>
	//*  19   38:ldc1            #14  <String "android:clipBounds:clip">
	//*  20   40:invokeinterface #71  <Method boolean Map.containsKey(Object)>
	//*  21   45:ifne            50
						return null;
	//   22   48:aconst_null     
	//   23   49:areturn         
					Object obj1 = ((Object) ((Rect)ah1.a.get("android:clipBounds:clip")));
	//   24   50:aload_2         
	//   25   51:getfield        #47  <Field Map ah.a>
	//   26   54:ldc1            #14  <String "android:clipBounds:clip">
	//   27   56:invokeinterface #75  <Method Object Map.get(Object)>
	//   28   61:checkcast       #55  <Class Rect>
	//   29   64:astore          5
					Rect rect = (Rect)ah2.a.get("android:clipBounds:clip");
	//   30   66:aload_3         
	//   31   67:getfield        #47  <Field Map ah.a>
	//   32   70:ldc1            #14  <String "android:clipBounds:clip">
	//   33   72:invokeinterface #75  <Method Object Map.get(Object)>
	//   34   77:checkcast       #55  <Class Rect>
	//   35   80:astore          6
					boolean flag;
					if(rect == null)
	//*  36   82:aload           6
	//*  37   84:ifnonnull       93
						flag = true;
	//   38   87:iconst_1        
	//   39   88:istore          4
					else
	//*  40   90:goto            96
						flag = false;
	//   41   93:iconst_0        
	//   42   94:istore          4
					if(obj1 == null && rect == null)
	//*  43   96:aload           5
	//*  44   98:ifnonnull       108
	//*  45  101:aload           6
	//*  46  103:ifnonnull       108
						return null;
	//   47  106:aconst_null     
	//   48  107:areturn         
					if(obj1 == null)
	//*  49  108:aload           5
	//*  50  110:ifnonnull       134
					{
						viewgroup = ((ViewGroup) ((Rect)ah1.a.get("android:clipBounds:bounds")));
	//   51  113:aload_2         
	//   52  114:getfield        #47  <Field Map ah.a>
	//   53  117:ldc1            #66  <String "android:clipBounds:bounds">
	//   54  119:invokeinterface #75  <Method Object Map.get(Object)>
	//   55  124:checkcast       #55  <Class Rect>
	//   56  127:astore_1        
						ah1 = ((ah) (rect));
	//   57  128:aload           6
	//   58  130:astore_2        
					} else
	//*  59  131:goto            163
					{
						viewgroup = ((ViewGroup) (obj1));
	//   60  134:aload           5
	//   61  136:astore_1        
						ah1 = ((ah) (rect));
	//   62  137:aload           6
	//   63  139:astore_2        
						if(rect == null)
	//*  64  140:aload           6
	//*  65  142:ifnonnull       163
						{
							ah1 = ((ah) ((Rect)ah2.a.get("android:clipBounds:bounds")));
	//   66  145:aload_3         
	//   67  146:getfield        #47  <Field Map ah.a>
	//   68  149:ldc1            #66  <String "android:clipBounds:bounds">
	//   69  151:invokeinterface #75  <Method Object Map.get(Object)>
	//   70  156:checkcast       #55  <Class Rect>
	//   71  159:astore_2        
							viewgroup = ((ViewGroup) (obj1));
	//   72  160:aload           5
	//   73  162:astore_1        
						}
					}
					if(((Rect) (viewgroup)).equals(((Object) (ah1))))
	//*  74  163:aload_1         
	//*  75  164:aload_2         
	//*  76  165:invokevirtual   #78  <Method boolean Rect.equals(Object)>
	//*  77  168:ifeq            173
						return null;
	//   78  171:aconst_null     
	//   79  172:areturn         
					s.a(ah2.b, ((Rect) (viewgroup)));
	//   80  173:aload_3         
	//   81  174:getfield        #31  <Field View ah.b>
	//   82  177:aload_1         
	//   83  178:invokestatic    #81  <Method void s.a(View, Rect)>
					obj1 = ((Object) (new z(new Rect())));
	//   84  181:new             #83  <Class z>
	//   85  184:dup             
	//   86  185:new             #55  <Class Rect>
	//   87  188:dup             
	//   88  189:invokespecial   #84  <Method void Rect()>
	//   89  192:invokespecial   #87  <Method void z(Rect)>
	//   90  195:astore          5
					ah1 = ((ah) (ObjectAnimator.ofObject(((Object) (ah2.b)), au.b, ((android.animation.TypeEvaluator) (obj1)), ((Object []) (new Rect[] {
						viewgroup, ah1
					})))));
	//   91  197:aload_3         
	//   92  198:getfield        #31  <Field View ah.b>
	//   93  201:getstatic       #92  <Field android.util.Property au.b>
	//   94  204:aload           5
	//   95  206:iconst_2        
	//   96  207:anewarray       Rect[]
	//   97  210:dup             
	//   98  211:iconst_0        
	//   99  212:aload_1         
	//  100  213:aastore         
	//  101  214:dup             
	//  102  215:iconst_1        
	//  103  216:aload_2         
	//  104  217:aastore         
	//  105  218:invokestatic    #98  <Method ObjectAnimator ObjectAnimator.ofObject(Object, android.util.Property, android.animation.TypeEvaluator, Object[])>
	//  106  221:astore_2        
					viewgroup = ((ViewGroup) (ah1));
	//  107  222:aload_2         
	//  108  223:astore_1        
					if(flag)
	//* 109  224:iload           4
	//* 110  226:ifeq            247
					{
						((ObjectAnimator) (ah1)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(ah2.b) {

							public void onAnimationEnd(Animator animator)
							{
								s.a(a, ((Rect) (null)));
							//    0    0:aload_0         
							//    1    1:getfield        #18  <Field View a>
							//    2    4:aconst_null     
							//    3    5:invokestatic    #29  <Method void s.a(View, Rect)>
							//    4    8:return          
							}

							final View a;
							final ChangeClipBounds b;

			
			{
				b = ChangeClipBounds.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ChangeClipBounds b>
				a = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #18  <Field View a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
						}
)));
	//  111  229:aload_2         
	//  112  230:new             #6   <Class ChangeClipBounds$1>
	//  113  233:dup             
	//  114  234:aload_0         
	//  115  235:aload_3         
	//  116  236:getfield        #31  <Field View ah.b>
	//  117  239:invokespecial   #101 <Method void ChangeClipBounds$1(ChangeClipBounds, View)>
	//  118  242:invokevirtual   #105 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
						viewgroup = ((ViewGroup) (ah1));
	//  119  245:aload_2         
	//  120  246:astore_1        
					}
				}
			}
		}
		return ((Animator) (viewgroup));
	//  121  247:aload_1         
	//  122  248:areturn         
	}

	public void a(ah ah1)
	{
		d(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method void d(ah)>
	//    3    5:return          
	}

	public String[] a()
	{
		return g;
	//    0    0:getstatic       #16  <Field String[] g>
	//    1    3:areturn         
	}

	public void b(ah ah1)
	{
		d(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method void d(ah)>
	//    3    5:return          
	}

	private static final String g[] = {
		"android:clipBounds:clip"
	};

	static 
	{
	//    0    0:iconst_1        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #14  <String "android:clipBounds:clip">
	//    5    8:aastore         
	//    6    9:putstatic       #16  <Field String[] g>
	//*   7   12:return          
	}
}
