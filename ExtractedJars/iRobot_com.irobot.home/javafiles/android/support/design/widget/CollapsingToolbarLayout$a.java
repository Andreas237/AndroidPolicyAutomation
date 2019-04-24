// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.c.a;
import android.support.v4.view.aa;
import android.support.v4.view.s;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			CollapsingToolbarLayout, p, e, AppBarLayout

private class CollapsingToolbarLayout$a
	implements AppBarLayout.a
{

	public void a(AppBarLayout appbarlayout, int i)
	{
		a.c = i;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field CollapsingToolbarLayout a>
	//    2    4:iload_2         
	//    3    5:putfield        #23  <Field int CollapsingToolbarLayout.c>
		int j;
		if(a.d != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #14  <Field CollapsingToolbarLayout a>
	//*   6   12:getfield        #27  <Field aa CollapsingToolbarLayout.d>
	//*   7   15:ifnull          32
			j = a.d.b();
	//    8   18:aload_0         
	//    9   19:getfield        #14  <Field CollapsingToolbarLayout a>
	//   10   22:getfield        #27  <Field aa CollapsingToolbarLayout.d>
	//   11   25:invokevirtual   #33  <Method int aa.b()>
	//   12   28:istore_3        
		else
	//*  13   29:goto            34
			j = 0;
	//   14   32:iconst_0        
	//   15   33:istore_3        
		int j1 = a.getChildCount();
	//   16   34:aload_0         
	//   17   35:getfield        #14  <Field CollapsingToolbarLayout a>
	//   18   38:invokevirtual   #36  <Method int CollapsingToolbarLayout.getChildCount()>
	//   19   41:istore          6
		int k = 0;
	//   20   43:iconst_0        
	//   21   44:istore          4
label0:
		do
		{
label1:
			{
				if(k >= j1)
					break label0;
	//   22   46:iload           4
	//   23   48:iload           6
	//   24   50:icmpge          157
				appbarlayout = ((AppBarLayout) (a.getChildAt(k)));
	//   25   53:aload_0         
	//   26   54:getfield        #14  <Field CollapsingToolbarLayout a>
	//   27   57:iload           4
	//   28   59:invokevirtual   #40  <Method View CollapsingToolbarLayout.getChildAt(int)>
	//   29   62:astore_1        
				youtParams youtparams = (youtParams)((View) (appbarlayout)).getLayoutParams();
	//   30   63:aload_1         
	//   31   64:invokevirtual   #46  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   32   67:checkcast       #48  <Class CollapsingToolbarLayout$LayoutParams>
	//   33   70:astore          7
				p p1 = android.support.design.widget.CollapsingToolbarLayout.a(((View) (appbarlayout)));
	//   34   72:aload_1         
	//   35   73:invokestatic    #51  <Method p android.support.design.widget.CollapsingToolbarLayout.a(View)>
	//   36   76:astore          8
				int l;
				switch(youtparams.a)
	//*  37   78:aload           7
	//*  38   80:getfield        #53  <Field int android.support.design.widget.CollapsingToolbarLayout$LayoutParams.a>
				{
	//*  39   83:tableswitch     1 2: default 104
	//	               1 124
	//	               2 107
				default:
					break label1;
	//   40  104:goto            148

				case 2: // '\002'
					l = Math.round((float)(-i) * youtparams.b);
	//   41  107:iload_2         
	//   42  108:ineg            
	//   43  109:i2f             
	//   44  110:aload           7
	//   45  112:getfield        #56  <Field float CollapsingToolbarLayout$LayoutParams.b>
	//   46  115:fmul            
	//   47  116:invokestatic    #62  <Method int Math.round(float)>
	//   48  119:istore          5
					break;
	//   49  121:goto            140

				case 1: // '\001'
					l = android.support.v4.c.a.a(-i, 0, a.b(((View) (appbarlayout))));
	//   50  124:iload_2         
	//   51  125:ineg            
	//   52  126:iconst_0        
	//   53  127:aload_0         
	//   54  128:getfield        #14  <Field CollapsingToolbarLayout a>
	//   55  131:aload_1         
	//   56  132:invokevirtual   #65  <Method int CollapsingToolbarLayout.b(View)>
	//   57  135:invokestatic    #70  <Method int a.a(int, int, int)>
	//   58  138:istore          5
					break;
				}
				p1.a(l);
	//   59  140:aload           8
	//   60  142:iload           5
	//   61  144:invokevirtual   #75  <Method boolean android.support.design.widget.p.a(int)>
	//   62  147:pop             
			}
			k++;
	//   63  148:iload           4
	//   64  150:iconst_1        
	//   65  151:iadd            
	//   66  152:istore          4
		} while(true);
	//   67  154:goto            46
		a.b();
	//   68  157:aload_0         
	//   69  158:getfield        #14  <Field CollapsingToolbarLayout a>
	//   70  161:invokevirtual   #77  <Method void CollapsingToolbarLayout.b()>
		if(a.b != null && j > 0)
	//*  71  164:aload_0         
	//*  72  165:getfield        #14  <Field CollapsingToolbarLayout a>
	//*  73  168:getfield        #80  <Field android.graphics.drawable.Drawable CollapsingToolbarLayout.b>
	//*  74  171:ifnull          185
	//*  75  174:iload_3         
	//*  76  175:ifle            185
			s.c(((View) (a)));
	//   77  178:aload_0         
	//   78  179:getfield        #14  <Field CollapsingToolbarLayout a>
	//   79  182:invokestatic    #85  <Method void s.c(View)>
		k = a.getHeight();
	//   80  185:aload_0         
	//   81  186:getfield        #14  <Field CollapsingToolbarLayout a>
	//   82  189:invokevirtual   #88  <Method int CollapsingToolbarLayout.getHeight()>
	//   83  192:istore          4
		int i1 = s.j(((View) (a)));
	//   84  194:aload_0         
	//   85  195:getfield        #14  <Field CollapsingToolbarLayout a>
	//   86  198:invokestatic    #91  <Method int s.j(View)>
	//   87  201:istore          5
		a.a.b((float)Math.abs(i) / (float)(k - i1 - j));
	//   88  203:aload_0         
	//   89  204:getfield        #14  <Field CollapsingToolbarLayout a>
	//   90  207:getfield        #94  <Field e android.support.design.widget.CollapsingToolbarLayout.a>
	//   91  210:iload_2         
	//   92  211:invokestatic    #98  <Method int Math.abs(int)>
	//   93  214:i2f             
	//   94  215:iload           4
	//   95  217:iload           5
	//   96  219:isub            
	//   97  220:iload_3         
	//   98  221:isub            
	//   99  222:i2f             
	//  100  223:fdiv            
	//  101  224:invokevirtual   #103 <Method void e.b(float)>
	//  102  227:return          
	}

	final CollapsingToolbarLayout a;

	CollapsingToolbarLayout$a(CollapsingToolbarLayout collapsingtoolbarlayout)
	{
		a = collapsingtoolbarlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field CollapsingToolbarLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
