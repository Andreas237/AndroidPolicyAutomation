// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.content.Context;
import android.support.design.a.h;
import android.support.design.a.j;
import android.support.design.b;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.am;
import android.support.v4.view.ac;
import android.util.AttributeSet;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package android.support.design.transformation:
//			FabTransformationBehavior, FabTransformationScrimBehavior, g

public class FabTransformationSheetBehavior extends FabTransformationBehavior
{

	public FabTransformationSheetBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void FabTransformationBehavior()>
	//    2    4:return          
	}

	public FabTransformationSheetBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void FabTransformationBehavior(Context, AttributeSet)>
	//    4    6:return          
	}

	private void a(View view, boolean flag)
	{
		Object obj = ((Object) (view.getParent()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method android.view.ViewParent View.getParent()>
	//    2    4:astore          6
		if(!(obj instanceof CoordinatorLayout))
	//*   3    6:aload           6
	//*   4    8:instanceof      #23  <Class CoordinatorLayout>
	//*   5   11:ifne            15
			return;
	//    6   14:return          
		obj = ((Object) ((CoordinatorLayout)obj));
	//    7   15:aload           6
	//    8   17:checkcast       #23  <Class CoordinatorLayout>
	//    9   20:astore          6
		int k = ((CoordinatorLayout) (obj)).getChildCount();
	//   10   22:aload           6
	//   11   24:invokevirtual   #27  <Method int CoordinatorLayout.getChildCount()>
	//   12   27:istore          5
		if(android.os.Build.VERSION.SDK_INT >= 16 && flag)
	//*  13   29:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   32:bipush          16
	//*  15   34:icmplt          54
	//*  16   37:iload_2         
	//*  17   38:ifeq            54
			a = ((Map) (new HashMap(k)));
	//   18   41:aload_0         
	//   19   42:new             #35  <Class HashMap>
	//   20   45:dup             
	//   21   46:iload           5
	//   22   48:invokespecial   #38  <Method void HashMap(int)>
	//   23   51:putfield        #40  <Field Map a>
		for(int i = 0; i < k; i++)
	//*  24   54:iconst_0        
	//*  25   55:istore_3        
	//*  26   56:iload_3         
	//*  27   57:iload           5
	//*  28   59:icmpge          214
		{
			View view1 = ((CoordinatorLayout) (obj)).getChildAt(i);
	//   29   62:aload           6
	//   30   64:iload_3         
	//   31   65:invokevirtual   #44  <Method View CoordinatorLayout.getChildAt(int)>
	//   32   68:astore          7
			boolean flag1;
			if((view1.getLayoutParams() instanceof am) && (((am)view1.getLayoutParams()).b() instanceof FabTransformationScrimBehavior))
	//*  33   70:aload           7
	//*  34   72:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  35   75:instanceof      #50  <Class am>
	//*  36   78:ifeq            104
	//*  37   81:aload           7
	//*  38   83:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  39   86:checkcast       #50  <Class am>
	//*  40   89:invokevirtual   #54  <Method android.support.design.widget.aj am.b()>
	//*  41   92:instanceof      #56  <Class FabTransformationScrimBehavior>
	//*  42   95:ifeq            104
				flag1 = true;
	//   43   98:iconst_1        
	//   44   99:istore          4
			else
	//*  45  101:goto            107
				flag1 = false;
	//   46  104:iconst_0        
	//   47  105:istore          4
			if(view1 == view || flag1)
	//*  48  107:aload           7
	//*  49  109:aload_1         
	//*  50  110:if_acmpeq       207
	//*  51  113:iload           4
	//*  52  115:ifeq            121
				continue;
	//   53  118:goto            207
			if(!flag)
	//*  54  121:iload_2         
	//*  55  122:ifne            173
			{
				Map map = a;
	//   56  125:aload_0         
	//   57  126:getfield        #40  <Field Map a>
	//   58  129:astore          8
				if(map != null && map.containsKey(((Object) (view1))))
	//*  59  131:aload           8
	//*  60  133:ifnull          207
	//*  61  136:aload           8
	//*  62  138:aload           7
	//*  63  140:invokeinterface #62  <Method boolean Map.containsKey(Object)>
	//*  64  145:ifeq            207
					ac.b(view1, ((Integer)a.get(((Object) (view1)))).intValue());
	//   65  148:aload           7
	//   66  150:aload_0         
	//   67  151:getfield        #40  <Field Map a>
	//   68  154:aload           7
	//   69  156:invokeinterface #66  <Method Object Map.get(Object)>
	//   70  161:checkcast       #68  <Class Integer>
	//   71  164:invokevirtual   #71  <Method int Integer.intValue()>
	//   72  167:invokestatic    #76  <Method void ac.b(View, int)>
				continue;
	//   73  170:goto            207
			}
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  74  173:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*  75  176:bipush          16
	//*  76  178:icmplt          201
				a.put(((Object) (view1)), ((Object) (Integer.valueOf(view1.getImportantForAccessibility()))));
	//   77  181:aload_0         
	//   78  182:getfield        #40  <Field Map a>
	//   79  185:aload           7
	//   80  187:aload           7
	//   81  189:invokevirtual   #79  <Method int View.getImportantForAccessibility()>
	//   82  192:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//   83  195:invokeinterface #87  <Method Object Map.put(Object, Object)>
	//   84  200:pop             
			ac.b(view1, 4);
	//   85  201:aload           7
	//   86  203:iconst_4        
	//   87  204:invokestatic    #76  <Method void ac.b(View, int)>
		}

	//   88  207:iload_3         
	//   89  208:iconst_1        
	//   90  209:iadd            
	//   91  210:istore_3        
	//*  92  211:goto            56
		if(!flag)
	//*  93  214:iload_2         
	//*  94  215:ifne            223
			a = null;
	//   95  218:aload_0         
	//   96  219:aconst_null     
	//   97  220:putfield        #40  <Field Map a>
	//   98  223:return          
	}

	protected g a(Context context, boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            11
			i = b.mtrl_fab_transformation_sheet_expand_spec;
	//    2    4:getstatic       #93  <Field int b.mtrl_fab_transformation_sheet_expand_spec>
	//    3    7:istore_3        
		else
	//*   4    8:goto            15
			i = b.mtrl_fab_transformation_sheet_collapse_spec;
	//    5   11:getstatic       #96  <Field int b.mtrl_fab_transformation_sheet_collapse_spec>
	//    6   14:istore_3        
		g g1 = new g();
	//    7   15:new             #98  <Class g>
	//    8   18:dup             
	//    9   19:invokespecial   #99  <Method void g()>
	//   10   22:astore          4
		g1.a = h.a(context, i);
	//   11   24:aload           4
	//   12   26:aload_1         
	//   13   27:iload_3         
	//   14   28:invokestatic    #104 <Method h h.a(Context, int)>
	//   15   31:putfield        #107 <Field h g.a>
		g1.b = new j(17, 0.0F, 0.0F);
	//   16   34:aload           4
	//   17   36:new             #109 <Class j>
	//   18   39:dup             
	//   19   40:bipush          17
	//   20   42:fconst_0        
	//   21   43:fconst_0        
	//   22   44:invokespecial   #112 <Method void j(int, float, float)>
	//   23   47:putfield        #115 <Field j android.support.design.transformation.g.b>
		return g1;
	//   24   50:aload           4
	//   25   52:areturn         
	}

	protected boolean a(View view, View view1, boolean flag, boolean flag1)
	{
		a(view1, flag);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokespecial   #118 <Method void a(View, boolean)>
		return super.a(view, view1, flag, flag1);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:iload_3         
	//    8   10:iload           4
	//    9   12:invokespecial   #120 <Method boolean FabTransformationBehavior.a(View, View, boolean, boolean)>
	//   10   15:ireturn         
	}

	private Map a;
}
