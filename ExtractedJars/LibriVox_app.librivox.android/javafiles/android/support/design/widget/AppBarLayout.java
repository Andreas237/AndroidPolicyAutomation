// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.design.c;
import android.support.v4.view.ac;
import android.support.v4.view.bb;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			e, d, ck

public class AppBarLayout extends LinearLayout
{

	private void a(boolean flag, boolean flag1, boolean flag2)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			byte0 = 1;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			byte0 = 2;
	//    5   10:iconst_2        
	//    6   11:istore          4
		byte byte2 = 0;
	//    7   13:iconst_0        
	//    8   14:istore          6
		byte byte1;
		if(flag1)
	//*   9   16:iload_2         
	//*  10   17:ifeq            26
			byte1 = 4;
	//   11   20:iconst_4        
	//   12   21:istore          5
		else
	//*  13   23:goto            29
			byte1 = 0;
	//   14   26:iconst_0        
	//   15   27:istore          5
		if(flag2)
	//*  16   29:iload_3         
	//*  17   30:ifeq            37
			byte2 = 8;
	//   18   33:bipush          8
	//   19   35:istore          6
		e = byte0 | byte1 | byte2;
	//   20   37:aload_0         
	//   21   38:iload           4
	//   22   40:iload           5
	//   23   42:ior             
	//   24   43:iload           6
	//   25   45:ior             
	//   26   46:putfield        #26  <Field int e>
		requestLayout();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #30  <Method void requestLayout()>
	//   29   53:return          
	}

	private boolean b(boolean flag)
	{
		if(i != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean i>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			i = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #34  <Field boolean i>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #37  <Method void refreshDrawableState()>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		} else
		{
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
	}

	private boolean f()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          38
			if(((e)getChildAt(i1).getLayoutParams()).c())
	//*   8   12:aload_0         
	//*   9   13:iload_1         
	//*  10   14:invokevirtual   #46  <Method View getChildAt(int)>
	//*  11   17:invokevirtual   #52  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  12   20:checkcast       #54  <Class e>
	//*  13   23:invokevirtual   #56  <Method boolean android.support.design.widget.e.c()>
	//*  14   26:ifeq            31
				return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         

	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_1        
	//*  21   35:goto            7
		return false;
	//   22   38:iconst_0        
	//   23   39:ireturn         
	}

	private void g()
	{
		a = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #58  <Field int a>
		b = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #60  <Field int b>
		c = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #62  <Field int c>
	//    9   15:return          
	}

	protected e a()
	{
		return new e(-1, -2);
	//    0    0:new             #54  <Class e>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:bipush          -2
	//    4    7:invokespecial   #67  <Method void e(int, int)>
	//    5   10:areturn         
	}

	public e a(AttributeSet attributeset)
	{
		return new e(getContext(), attributeset);
	//    0    0:new             #54  <Class e>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #72  <Method android.content.Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #75  <Method void e(android.content.Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected e a(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19 && (layoutparams instanceof android.widget.LinearLayout.LayoutParams))
	//*   0    0:getstatic       #81  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          27
	//*   3    8:aload_1         
	//*   4    9:instanceof      #83  <Class android.widget.LinearLayout$LayoutParams>
	//*   5   12:ifeq            27
			return new e((android.widget.LinearLayout.LayoutParams)layoutparams);
	//    6   15:new             #54  <Class e>
	//    7   18:dup             
	//    8   19:aload_1         
	//    9   20:checkcast       #83  <Class android.widget.LinearLayout$LayoutParams>
	//   10   23:invokespecial   #86  <Method void e(android.widget.LinearLayout$LayoutParams)>
	//   11   26:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  12   27:aload_1         
	//*  13   28:instanceof      #88  <Class android.view.ViewGroup$MarginLayoutParams>
	//*  14   31:ifeq            46
			return new e((android.view.ViewGroup.MarginLayoutParams)layoutparams);
	//   15   34:new             #54  <Class e>
	//   16   37:dup             
	//   17   38:aload_1         
	//   18   39:checkcast       #88  <Class android.view.ViewGroup$MarginLayoutParams>
	//   19   42:invokespecial   #91  <Method void e(android.view.ViewGroup$MarginLayoutParams)>
	//   20   45:areturn         
		else
			return new e(layoutparams);
	//   21   46:new             #54  <Class e>
	//   22   49:dup             
	//   23   50:aload_1         
	//   24   51:invokespecial   #94  <Method void e(android.view.ViewGroup$LayoutParams)>
	//   25   54:areturn         
	}

	void a(int i1)
	{
		List list = g;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field List g>
	//    2    4:astore          4
		if(list != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          62
		{
			int j1 = 0;
	//    5   11:iconst_0        
	//    6   12:istore_2        
			for(int k1 = list.size(); j1 < k1; j1++)
	//*   7   13:aload           4
	//*   8   15:invokeinterface #102 <Method int List.size()>
	//*   9   20:istore_3        
	//*  10   21:iload_2         
	//*  11   22:iload_3         
	//*  12   23:icmpge          62
			{
				d d1 = (d)g.get(j1);
	//   13   26:aload_0         
	//   14   27:getfield        #97  <Field List g>
	//   15   30:iload_2         
	//   16   31:invokeinterface #106 <Method Object List.get(int)>
	//   17   36:checkcast       #108 <Class d>
	//   18   39:astore          4
				if(d1 != null)
	//*  19   41:aload           4
	//*  20   43:ifnull          55
					d1.a(this, i1);
	//   21   46:aload           4
	//   22   48:aload_0         
	//   23   49:iload_1         
	//   24   50:invokeinterface #111 <Method void d.a(AppBarLayout, int)>
			}

	//   25   55:iload_2         
	//   26   56:iconst_1        
	//   27   57:iadd            
	//   28   58:istore_2        
		}
	//*  29   59:goto            21
	//   30   62:return          
	}

	public void a(boolean flag, boolean flag1)
	{
		a(flag, flag1, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #114 <Method void a(boolean, boolean, boolean)>
	//    5    7:return          
	}

	boolean a(boolean flag)
	{
		if(j != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field boolean j>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			j = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #116 <Field boolean j>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #37  <Method void refreshDrawableState()>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		} else
		{
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
	}

	boolean b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field boolean d>
	//    2    4:ireturn         
	}

	boolean c()
	{
		return getTotalScrollRange() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method int getTotalScrollRange()>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return layoutparams instanceof e;
	//    0    0:aload_1         
	//    1    1:instanceof      #54  <Class e>
	//    2    4:ireturn         
	}

	public boolean d()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field boolean k>
	//    2    4:ireturn         
	}

	void e()
	{
		e = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #26  <Field int e>
	//    3    5:return          
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #128 <Method e a()>
	//    2    4:areturn         
	}

	protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.widget.LinearLayout.LayoutParams) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #128 <Method e a()>
	//    2    4:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #133 <Method e a(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #136 <Method e a(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.widget.LinearLayout.LayoutParams) (a(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #133 <Method e a(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.widget.LinearLayout.LayoutParams) (a(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #136 <Method e a(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	int getDownNestedPreScrollRange()
	{
		int i1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int b>
	//    2    4:istore_1        
		if(i1 != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i1;
	//    6   10:iload_1         
	//    7   11:ireturn         
		int j1 = getChildCount() - 1;
	//    8   12:aload_0         
	//    9   13:invokevirtual   #42  <Method int getChildCount()>
	//   10   16:iconst_1        
	//   11   17:isub            
	//   12   18:istore_2        
		int k1;
		for(k1 = 0; j1 >= 0; k1 = i1)
	//*  13   19:iconst_0        
	//*  14   20:istore_3        
	//*  15   21:iload_2         
	//*  16   22:iflt            146
		{
			View view = getChildAt(j1);
	//   17   25:aload_0         
	//   18   26:iload_2         
	//   19   27:invokevirtual   #46  <Method View getChildAt(int)>
	//   20   30:astore          5
			e e1 = (e)view.getLayoutParams();
	//   21   32:aload           5
	//   22   34:invokevirtual   #52  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   37:checkcast       #54  <Class e>
	//   24   40:astore          6
			i1 = view.getMeasuredHeight();
	//   25   42:aload           5
	//   26   44:invokevirtual   #142 <Method int View.getMeasuredHeight()>
	//   27   47:istore_1        
			int l1 = e1.a;
	//   28   48:aload           6
	//   29   50:getfield        #143 <Field int e.a>
	//   30   53:istore          4
			if((l1 & 5) == 5)
	//*  31   55:iload           4
	//*  32   57:iconst_5        
	//*  33   58:iand            
	//*  34   59:iconst_5        
	//*  35   60:icmpne          128
			{
				k1 += e1.topMargin + e1.bottomMargin;
	//   36   63:iload_3         
	//   37   64:aload           6
	//   38   66:getfield        #146 <Field int e.topMargin>
	//   39   69:aload           6
	//   40   71:getfield        #149 <Field int e.bottomMargin>
	//   41   74:iadd            
	//   42   75:iadd            
	//   43   76:istore_3        
				if((l1 & 8) != 0)
	//*  44   77:iload           4
	//*  45   79:bipush          8
	//*  46   81:iand            
	//*  47   82:ifeq            96
					i1 = k1 + ac.k(view);
	//   48   85:iload_3         
	//   49   86:aload           5
	//   50   88:invokestatic    #154 <Method int ac.k(View)>
	//   51   91:iadd            
	//   52   92:istore_1        
				else
	//*  53   93:goto            137
				if((l1 & 2) != 0)
	//*  54   96:iload           4
	//*  55   98:iconst_2        
	//*  56   99:iand            
	//*  57  100:ifeq            116
					i1 = k1 + (i1 - ac.k(view));
	//   58  103:iload_3         
	//   59  104:iload_1         
	//   60  105:aload           5
	//   61  107:invokestatic    #154 <Method int ac.k(View)>
	//   62  110:isub            
	//   63  111:iadd            
	//   64  112:istore_1        
				else
	//*  65  113:goto            137
					i1 = k1 + (i1 - getTopInset());
	//   66  116:iload_3         
	//   67  117:iload_1         
	//   68  118:aload_0         
	//   69  119:invokevirtual   #157 <Method int getTopInset()>
	//   70  122:isub            
	//   71  123:iadd            
	//   72  124:istore_1        
			} else
	//*  73  125:goto            137
			{
				i1 = k1;
	//   74  128:iload_3         
	//   75  129:istore_1        
				if(k1 > 0)
	//*  76  130:iload_3         
	//*  77  131:ifle            137
					break;
	//   78  134:goto            146
			}
			j1--;
	//   79  137:iload_2         
	//   80  138:iconst_1        
	//   81  139:isub            
	//   82  140:istore_2        
		}

	//   83  141:iload_1         
	//   84  142:istore_3        
	//*  85  143:goto            21
		i1 = Math.max(0, k1);
	//   86  146:iconst_0        
	//   87  147:iload_3         
	//   88  148:invokestatic    #163 <Method int Math.max(int, int)>
	//   89  151:istore_1        
		b = i1;
	//   90  152:aload_0         
	//   91  153:iload_1         
	//   92  154:putfield        #60  <Field int b>
		return i1;
	//   93  157:iload_1         
	//   94  158:ireturn         
	}

	int getDownNestedScrollRange()
	{
		int i1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int c>
	//    2    4:istore_1        
		if(i1 != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i1;
	//    6   10:iload_1         
	//    7   11:ireturn         
		int l1 = getChildCount();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #42  <Method int getChildCount()>
	//   10   16:istore          4
		int j1 = 0;
	//   11   18:iconst_0        
	//   12   19:istore_2        
		i1 = 0;
	//   13   20:iconst_0        
	//   14   21:istore_1        
		int k1;
		do
		{
			k1 = i1;
	//   15   22:iload_1         
	//   16   23:istore_3        
			if(j1 >= l1)
				break;
	//   17   24:iload_2         
	//   18   25:iload           4
	//   19   27:icmpge          125
			View view = getChildAt(j1);
	//   20   30:aload_0         
	//   21   31:iload_2         
	//   22   32:invokevirtual   #46  <Method View getChildAt(int)>
	//   23   35:astore          9
			e e1 = (e)view.getLayoutParams();
	//   24   37:aload           9
	//   25   39:invokevirtual   #52  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   42:checkcast       #54  <Class e>
	//   27   45:astore          10
			int j2 = view.getMeasuredHeight();
	//   28   47:aload           9
	//   29   49:invokevirtual   #142 <Method int View.getMeasuredHeight()>
	//   30   52:istore          6
			int k2 = e1.topMargin;
	//   31   54:aload           10
	//   32   56:getfield        #146 <Field int e.topMargin>
	//   33   59:istore          7
			int l2 = e1.bottomMargin;
	//   34   61:aload           10
	//   35   63:getfield        #149 <Field int e.bottomMargin>
	//   36   66:istore          8
			int i2 = e1.a;
	//   37   68:aload           10
	//   38   70:getfield        #143 <Field int e.a>
	//   39   73:istore          5
			k1 = i1;
	//   40   75:iload_1         
	//   41   76:istore_3        
			if((i2 & 1) == 0)
				break;
	//   42   77:iload           5
	//   43   79:iconst_1        
	//   44   80:iand            
	//   45   81:ifeq            125
			i1 += j2 + (k2 + l2);
	//   46   84:iload_1         
	//   47   85:iload           6
	//   48   87:iload           7
	//   49   89:iload           8
	//   50   91:iadd            
	//   51   92:iadd            
	//   52   93:iadd            
	//   53   94:istore_1        
			if((i2 & 2) != 0)
	//*  54   95:iload           5
	//*  55   97:iconst_2        
	//*  56   98:iand            
	//*  57   99:ifeq            118
			{
				k1 = i1 - (ac.k(view) + getTopInset());
	//   58  102:iload_1         
	//   59  103:aload           9
	//   60  105:invokestatic    #154 <Method int ac.k(View)>
	//   61  108:aload_0         
	//   62  109:invokevirtual   #157 <Method int getTopInset()>
	//   63  112:iadd            
	//   64  113:isub            
	//   65  114:istore_3        
				break;
	//   66  115:goto            125
			}
			j1++;
	//   67  118:iload_2         
	//   68  119:iconst_1        
	//   69  120:iadd            
	//   70  121:istore_2        
		} while(true);
	//   71  122:goto            22
		i1 = Math.max(0, k1);
	//   72  125:iconst_0        
	//   73  126:iload_3         
	//   74  127:invokestatic    #163 <Method int Math.max(int, int)>
	//   75  130:istore_1        
		c = i1;
	//   76  131:aload_0         
	//   77  132:iload_1         
	//   78  133:putfield        #62  <Field int c>
		return i1;
	//   79  136:iload_1         
	//   80  137:ireturn         
	}

	public final int getMinimumHeightForVisibleOverlappingContent()
	{
		int j1 = getTopInset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method int getTopInset()>
	//    2    4:istore_2        
		int i1 = ac.k(((View) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #154 <Method int ac.k(View)>
	//    5    9:istore_1        
		if(i1 != 0)
	//*   6   10:iload_1         
	//*   7   11:ifeq            20
			return i1 * 2 + j1;
	//    8   14:iload_1         
	//    9   15:iconst_2        
	//   10   16:imul            
	//   11   17:iload_2         
	//   12   18:iadd            
	//   13   19:ireturn         
		i1 = getChildCount();
	//   14   20:aload_0         
	//   15   21:invokevirtual   #42  <Method int getChildCount()>
	//   16   24:istore_1        
		if(i1 >= 1)
	//*  17   25:iload_1         
	//*  18   26:iconst_1        
	//*  19   27:icmplt          44
			i1 = ac.k(getChildAt(i1 - 1));
	//   20   30:aload_0         
	//   21   31:iload_1         
	//   22   32:iconst_1        
	//   23   33:isub            
	//   24   34:invokevirtual   #46  <Method View getChildAt(int)>
	//   25   37:invokestatic    #154 <Method int ac.k(View)>
	//   26   40:istore_1        
		else
	//*  27   41:goto            46
			i1 = 0;
	//   28   44:iconst_0        
	//   29   45:istore_1        
		if(i1 != 0)
	//*  30   46:iload_1         
	//*  31   47:ifeq            56
			return i1 * 2 + j1;
	//   32   50:iload_1         
	//   33   51:iconst_2        
	//   34   52:imul            
	//   35   53:iload_2         
	//   36   54:iadd            
	//   37   55:ireturn         
		else
			return getHeight() / 3;
	//   38   56:aload_0         
	//   39   57:invokevirtual   #168 <Method int getHeight()>
	//   40   60:iconst_3        
	//   41   61:idiv            
	//   42   62:ireturn         
	}

	int getPendingAction()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int e>
	//    2    4:ireturn         
	}

	public float getTargetElevation()
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	final int getTopInset()
	{
		bb bb1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field bb f>
	//    2    4:astore_1        
		if(bb1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return bb1.b();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #179 <Method int bb.b()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public final int getTotalScrollRange()
	{
		int i1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int a>
	//    2    4:istore_1        
		if(i1 != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i1;
	//    6   10:iload_1         
	//    7   11:ireturn         
		int l1 = getChildCount();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #42  <Method int getChildCount()>
	//   10   16:istore          4
		int j1 = 0;
	//   11   18:iconst_0        
	//   12   19:istore_2        
		i1 = 0;
	//   13   20:iconst_0        
	//   14   21:istore_1        
		int k1;
		do
		{
			k1 = i1;
	//   15   22:iload_1         
	//   16   23:istore_3        
			if(j1 >= l1)
				break;
	//   17   24:iload_2         
	//   18   25:iload           4
	//   19   27:icmpge          112
			View view = getChildAt(j1);
	//   20   30:aload_0         
	//   21   31:iload_2         
	//   22   32:invokevirtual   #46  <Method View getChildAt(int)>
	//   23   35:astore          7
			e e1 = (e)view.getLayoutParams();
	//   24   37:aload           7
	//   25   39:invokevirtual   #52  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   42:checkcast       #54  <Class e>
	//   27   45:astore          8
			int j2 = view.getMeasuredHeight();
	//   28   47:aload           7
	//   29   49:invokevirtual   #142 <Method int View.getMeasuredHeight()>
	//   30   52:istore          6
			int i2 = e1.a;
	//   31   54:aload           8
	//   32   56:getfield        #143 <Field int e.a>
	//   33   59:istore          5
			k1 = i1;
	//   34   61:iload_1         
	//   35   62:istore_3        
			if((i2 & 1) == 0)
				break;
	//   36   63:iload           5
	//   37   65:iconst_1        
	//   38   66:iand            
	//   39   67:ifeq            112
			i1 += j2 + e1.topMargin + e1.bottomMargin;
	//   40   70:iload_1         
	//   41   71:iload           6
	//   42   73:aload           8
	//   43   75:getfield        #146 <Field int e.topMargin>
	//   44   78:iadd            
	//   45   79:aload           8
	//   46   81:getfield        #149 <Field int e.bottomMargin>
	//   47   84:iadd            
	//   48   85:iadd            
	//   49   86:istore_1        
			if((i2 & 2) != 0)
	//*  50   87:iload           5
	//*  51   89:iconst_2        
	//*  52   90:iand            
	//*  53   91:ifeq            105
			{
				k1 = i1 - ac.k(view);
	//   54   94:iload_1         
	//   55   95:aload           7
	//   56   97:invokestatic    #154 <Method int ac.k(View)>
	//   57  100:isub            
	//   58  101:istore_3        
				break;
	//   59  102:goto            112
			}
			j1++;
	//   60  105:iload_2         
	//   61  106:iconst_1        
	//   62  107:iadd            
	//   63  108:istore_2        
		} while(true);
	//   64  109:goto            22
		i1 = Math.max(0, k1 - getTopInset());
	//   65  112:iconst_0        
	//   66  113:iload_3         
	//   67  114:aload_0         
	//   68  115:invokevirtual   #157 <Method int getTopInset()>
	//   69  118:isub            
	//   70  119:invokestatic    #163 <Method int Math.max(int, int)>
	//   71  122:istore_1        
		a = i1;
	//   72  123:aload_0         
	//   73  124:iload_1         
	//   74  125:putfield        #58  <Field int a>
		return i1;
	//   75  128:iload_1         
	//   76  129:ireturn         
	}

	int getUpNestedPreScrollRange()
	{
		return getTotalScrollRange();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method int getTotalScrollRange()>
	//    2    4:ireturn         
	}

	protected int[] onCreateDrawableState(int i1)
	{
		if(l == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field int[] l>
	//*   2    4:ifnonnull       14
			l = new int[4];
	//    3    7:aload_0         
	//    4    8:iconst_4        
	//    5    9:newarray        int[]
	//    6   11:putfield        #184 <Field int[] l>
		int ai[] = l;
	//    7   14:aload_0         
	//    8   15:getfield        #184 <Field int[] l>
	//    9   18:astore_2        
		int ai1[] = super.onCreateDrawableState(i1 + ai.length);
	//   10   19:aload_0         
	//   11   20:iload_1         
	//   12   21:aload_2         
	//   13   22:arraylength     
	//   14   23:iadd            
	//   15   24:invokespecial   #186 <Method int[] LinearLayout.onCreateDrawableState(int)>
	//   16   27:astore_3        
		if(i)
	//*  17   28:aload_0         
	//*  18   29:getfield        #34  <Field boolean i>
	//*  19   32:ifeq            42
			i1 = c.state_liftable;
	//   20   35:getstatic       #191 <Field int c.state_liftable>
	//   21   38:istore_1        
		else
	//*  22   39:goto            47
			i1 = -c.state_liftable;
	//   23   42:getstatic       #191 <Field int c.state_liftable>
	//   24   45:ineg            
	//   25   46:istore_1        
		ai[0] = i1;
	//   26   47:aload_2         
	//   27   48:iconst_0        
	//   28   49:iload_1         
	//   29   50:iastore         
		if(i && j)
	//*  30   51:aload_0         
	//*  31   52:getfield        #34  <Field boolean i>
	//*  32   55:ifeq            72
	//*  33   58:aload_0         
	//*  34   59:getfield        #116 <Field boolean j>
	//*  35   62:ifeq            72
			i1 = c.state_lifted;
	//   36   65:getstatic       #194 <Field int c.state_lifted>
	//   37   68:istore_1        
		else
	//*  38   69:goto            77
			i1 = -c.state_lifted;
	//   39   72:getstatic       #194 <Field int c.state_lifted>
	//   40   75:ineg            
	//   41   76:istore_1        
		ai[1] = i1;
	//   42   77:aload_2         
	//   43   78:iconst_1        
	//   44   79:iload_1         
	//   45   80:iastore         
		if(i)
	//*  46   81:aload_0         
	//*  47   82:getfield        #34  <Field boolean i>
	//*  48   85:ifeq            95
			i1 = c.state_collapsible;
	//   49   88:getstatic       #197 <Field int c.state_collapsible>
	//   50   91:istore_1        
		else
	//*  51   92:goto            100
			i1 = -c.state_collapsible;
	//   52   95:getstatic       #197 <Field int c.state_collapsible>
	//   53   98:ineg            
	//   54   99:istore_1        
		ai[2] = i1;
	//   55  100:aload_2         
	//   56  101:iconst_2        
	//   57  102:iload_1         
	//   58  103:iastore         
		if(i && j)
	//*  59  104:aload_0         
	//*  60  105:getfield        #34  <Field boolean i>
	//*  61  108:ifeq            125
	//*  62  111:aload_0         
	//*  63  112:getfield        #116 <Field boolean j>
	//*  64  115:ifeq            125
			i1 = c.state_collapsed;
	//   65  118:getstatic       #200 <Field int c.state_collapsed>
	//   66  121:istore_1        
		else
	//*  67  122:goto            130
			i1 = -c.state_collapsed;
	//   68  125:getstatic       #200 <Field int c.state_collapsed>
	//   69  128:ineg            
	//   70  129:istore_1        
		ai[3] = i1;
	//   71  130:aload_2         
	//   72  131:iconst_3        
	//   73  132:iload_1         
	//   74  133:iastore         
		return mergeDrawableStates(ai1, ai);
	//   75  134:aload_3         
	//   76  135:aload_2         
	//   77  136:invokestatic    #204 <Method int[] mergeDrawableStates(int[], int[])>
	//   78  139:areturn         
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		super.onLayout(flag, i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #208 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
		g();
	//    7   11:aload_0         
	//    8   12:invokespecial   #210 <Method void g()>
		flag = false;
	//    9   15:iconst_0        
	//   10   16:istore_1        
		d = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #118 <Field boolean d>
		j1 = getChildCount();
	//   14   22:aload_0         
	//   15   23:invokevirtual   #42  <Method int getChildCount()>
	//   16   26:istore_3        
		i1 = 0;
	//   17   27:iconst_0        
	//   18   28:istore_2        
		do
		{
			if(i1 >= j1)
				break;
	//   19   29:iload_2         
	//   20   30:iload_3         
	//   21   31:icmpge          66
			if(((e)getChildAt(i1).getLayoutParams()).b() != null)
	//*  22   34:aload_0         
	//*  23   35:iload_2         
	//*  24   36:invokevirtual   #46  <Method View getChildAt(int)>
	//*  25   39:invokevirtual   #52  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  26   42:checkcast       #54  <Class e>
	//*  27   45:invokevirtual   #213 <Method android.view.animation.Interpolator e.b()>
	//*  28   48:ifnull          59
			{
				d = true;
	//   29   51:aload_0         
	//   30   52:iconst_1        
	//   31   53:putfield        #118 <Field boolean d>
				break;
	//   32   56:goto            66
			}
			i1++;
	//   33   59:iload_2         
	//   34   60:iconst_1        
	//   35   61:iadd            
	//   36   62:istore_2        
		} while(true);
	//   37   63:goto            29
		if(!h)
	//*  38   66:aload_0         
	//*  39   67:getfield        #215 <Field boolean h>
	//*  40   70:ifne            95
		{
			if(k || f())
	//*  41   73:aload_0         
	//*  42   74:getfield        #125 <Field boolean k>
	//*  43   77:ifne            87
	//*  44   80:aload_0         
	//*  45   81:invokespecial   #217 <Method boolean f()>
	//*  46   84:ifeq            89
				flag = true;
	//   47   87:iconst_1        
	//   48   88:istore_1        
			b(flag);
	//   49   89:aload_0         
	//   50   90:iload_1         
	//   51   91:invokespecial   #219 <Method boolean b(boolean)>
	//   52   94:pop             
		}
	//   53   95:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		super.onMeasure(i1, j1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #222 <Method void LinearLayout.onMeasure(int, int)>
		g();
	//    4    6:aload_0         
	//    5    7:invokespecial   #210 <Method void g()>
	//    6   10:return          
	}

	public void setExpanded(boolean flag)
	{
		a(flag, ac.x(((View) (this))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokestatic    #228 <Method boolean ac.x(View)>
	//    4    6:invokevirtual   #230 <Method void a(boolean, boolean)>
	//    5    9:return          
	}

	public void setLiftOnScroll(boolean flag)
	{
		k = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #125 <Field boolean k>
	//    3    5:return          
	}

	public void setOrientation(int i1)
	{
		if(i1 == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          11
		{
			super.setOrientation(i1);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #234 <Method void LinearLayout.setOrientation(int)>
			return;
	//    6   10:return          
		} else
		{
			throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
	//    7   11:new             #236 <Class IllegalArgumentException>
	//    8   14:dup             
	//    9   15:ldc1            #238 <String "AppBarLayout is always vertical and does not support horizontal orientation">
	//   10   17:invokespecial   #241 <Method void IllegalArgumentException(String)>
	//   11   20:athrow          
		}
	}

	public void setTargetElevation(float f1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #81  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			ck.a(((View) (this)), f1);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:invokestatic    #248 <Method void ck.a(View, float)>
	//    6   13:return          
	}

	private int a;
	private int b;
	private int c;
	private boolean d;
	private int e;
	private bb f;
	private List g;
	private boolean h;
	private boolean i;
	private boolean j;
	private boolean k;
	private int l[];
}
