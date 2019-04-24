// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Transition, ah, ag

public class ChangeScroll extends Transition
{

	public ChangeScroll()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Transition()>
	//    2    4:return          
	}

	public ChangeScroll(Context context, AttributeSet attributeset)
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
		ah1.a.put("android:changeScroll:x", ((Object) (Integer.valueOf(ah1.b.getScrollX()))));
	//    0    0:aload_1         
	//    1    1:getfield        #31  <Field Map ah.a>
	//    2    4:ldc1            #12  <String "android:changeScroll:x">
	//    3    6:aload_1         
	//    4    7:getfield        #35  <Field View ah.b>
	//    5   10:invokevirtual   #41  <Method int View.getScrollX()>
	//    6   13:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//    7   16:invokeinterface #53  <Method Object Map.put(Object, Object)>
	//    8   21:pop             
		ah1.a.put("android:changeScroll:y", ((Object) (Integer.valueOf(ah1.b.getScrollY()))));
	//    9   22:aload_1         
	//   10   23:getfield        #31  <Field Map ah.a>
	//   11   26:ldc1            #14  <String "android:changeScroll:y">
	//   12   28:aload_1         
	//   13   29:getfield        #35  <Field View ah.b>
	//   14   32:invokevirtual   #56  <Method int View.getScrollY()>
	//   15   35:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   16   38:invokeinterface #53  <Method Object Map.put(Object, Object)>
	//   17   43:pop             
	//   18   44:return          
	}

	public Animator a(ViewGroup viewgroup, ah ah1, ah ah2)
	{
		viewgroup = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		Object obj = null;
	//    2    2:aconst_null     
	//    3    3:astore          8
		if(ah1 != null)
	//*   4    5:aload_2         
	//*   5    6:ifnull          181
		{
			if(ah2 == null)
	//*   6    9:aload_3         
	//*   7   10:ifnonnull       15
				return null;
	//    8   13:aconst_null     
	//    9   14:areturn         
			View view = ah2.b;
	//   10   15:aload_3         
	//   11   16:getfield        #35  <Field View ah.b>
	//   12   19:astore          9
			int i = ((Integer)ah1.a.get("android:changeScroll:x")).intValue();
	//   13   21:aload_2         
	//   14   22:getfield        #31  <Field Map ah.a>
	//   15   25:ldc1            #12  <String "android:changeScroll:x">
	//   16   27:invokeinterface #61  <Method Object Map.get(Object)>
	//   17   32:checkcast       #43  <Class Integer>
	//   18   35:invokevirtual   #64  <Method int Integer.intValue()>
	//   19   38:istore          4
			int j = ((Integer)ah2.a.get("android:changeScroll:x")).intValue();
	//   20   40:aload_3         
	//   21   41:getfield        #31  <Field Map ah.a>
	//   22   44:ldc1            #12  <String "android:changeScroll:x">
	//   23   46:invokeinterface #61  <Method Object Map.get(Object)>
	//   24   51:checkcast       #43  <Class Integer>
	//   25   54:invokevirtual   #64  <Method int Integer.intValue()>
	//   26   57:istore          5
			int k = ((Integer)ah1.a.get("android:changeScroll:y")).intValue();
	//   27   59:aload_2         
	//   28   60:getfield        #31  <Field Map ah.a>
	//   29   63:ldc1            #14  <String "android:changeScroll:y">
	//   30   65:invokeinterface #61  <Method Object Map.get(Object)>
	//   31   70:checkcast       #43  <Class Integer>
	//   32   73:invokevirtual   #64  <Method int Integer.intValue()>
	//   33   76:istore          6
			int l = ((Integer)ah2.a.get("android:changeScroll:y")).intValue();
	//   34   78:aload_3         
	//   35   79:getfield        #31  <Field Map ah.a>
	//   36   82:ldc1            #14  <String "android:changeScroll:y">
	//   37   84:invokeinterface #61  <Method Object Map.get(Object)>
	//   38   89:checkcast       #43  <Class Integer>
	//   39   92:invokevirtual   #64  <Method int Integer.intValue()>
	//   40   95:istore          7
			if(i != j)
	//*  41   97:iload           4
	//*  42   99:iload           5
	//*  43  101:icmpeq          135
			{
				view.setScrollX(i);
	//   44  104:aload           9
	//   45  106:iload           4
	//   46  108:invokevirtual   #68  <Method void View.setScrollX(int)>
				viewgroup = ((ViewGroup) (ObjectAnimator.ofInt(((Object) (view)), "scrollX", new int[] {
					i, j
				})));
	//   47  111:aload           9
	//   48  113:ldc1            #70  <String "scrollX">
	//   49  115:iconst_2        
	//   50  116:newarray        int[]
	//   51  118:dup             
	//   52  119:iconst_0        
	//   53  120:iload           4
	//   54  122:iastore         
	//   55  123:dup             
	//   56  124:iconst_1        
	//   57  125:iload           5
	//   58  127:iastore         
	//   59  128:invokestatic    #76  <Method ObjectAnimator ObjectAnimator.ofInt(Object, String, int[])>
	//   60  131:astore_1        
			} else
	//*  61  132:goto            137
			{
				viewgroup = null;
	//   62  135:aconst_null     
	//   63  136:astore_1        
			}
			ah1 = ((ah) (obj));
	//   64  137:aload           8
	//   65  139:astore_2        
			if(k != l)
	//*  66  140:iload           6
	//*  67  142:iload           7
	//*  68  144:icmpeq          175
			{
				view.setScrollY(k);
	//   69  147:aload           9
	//   70  149:iload           6
	//   71  151:invokevirtual   #79  <Method void View.setScrollY(int)>
				ah1 = ((ah) (ObjectAnimator.ofInt(((Object) (view)), "scrollY", new int[] {
					k, l
				})));
	//   72  154:aload           9
	//   73  156:ldc1            #81  <String "scrollY">
	//   74  158:iconst_2        
	//   75  159:newarray        int[]
	//   76  161:dup             
	//   77  162:iconst_0        
	//   78  163:iload           6
	//   79  165:iastore         
	//   80  166:dup             
	//   81  167:iconst_1        
	//   82  168:iload           7
	//   83  170:iastore         
	//   84  171:invokestatic    #76  <Method ObjectAnimator ObjectAnimator.ofInt(Object, String, int[])>
	//   85  174:astore_2        
			}
			viewgroup = ((ViewGroup) (ag.a(((Animator) (viewgroup)), ((Animator) (ah1)))));
	//   86  175:aload_1         
	//   87  176:aload_2         
	//   88  177:invokestatic    #86  <Method Animator ag.a(Animator, Animator)>
	//   89  180:astore_1        
		}
		return ((Animator) (viewgroup));
	//   90  181:aload_1         
	//   91  182:areturn         
	}

	public void a(ah ah1)
	{
		d(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #88  <Method void d(ah)>
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
	//    2    2:invokespecial   #88  <Method void d(ah)>
	//    3    5:return          
	}

	private static final String g[] = {
		"android:changeScroll:x", "android:changeScroll:y"
	};

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #12  <String "android:changeScroll:x">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #14  <String "android:changeScroll:y">
	//    9   13:aastore         
	//   10   14:putstatic       #16  <Field String[] g>
	//*  11   17:return          
	}
}
