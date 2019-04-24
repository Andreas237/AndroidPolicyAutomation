// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.*;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.a.b;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView, bb, t, bc

public static abstract class RecyclerView$h
{
	public static interface a
	{

		public abstract void b(int i1, int j1);
	}

	public static class b
	{

		public int a;
		public int b;
		public boolean c;
		public boolean d;

		public b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}


	public static int a(int i1, int j1, int k1)
	{
		int l1 = android.view.c.getMode(i1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		i1 = android.view.c.getSize(i1);
	//    3    5:iload_0         
	//    4    6:invokestatic    #81  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_0        
		if(l1 != 0x80000000)
	//*   6   10:iload_3         
	//*   7   11:ldc1            #82  <Int 0x80000000>
	//*   8   13:icmpeq          30
		{
			if(l1 != 0x40000000)
	//*   9   16:iload_3         
	//*  10   17:ldc1            #83  <Int 0x40000000>
	//*  11   19:icmpeq          28
				i1 = Math.max(j1, k1);
	//   12   22:iload_1         
	//   13   23:iload_2         
	//   14   24:invokestatic    #89  <Method int Math.max(int, int)>
	//   15   27:istore_0        
			return i1;
	//   16   28:iload_0         
	//   17   29:ireturn         
		} else
		{
			return Math.min(i1, Math.max(j1, k1));
	//   18   30:iload_0         
	//   19   31:iload_1         
	//   20   32:iload_2         
	//   21   33:invokestatic    #89  <Method int Math.max(int, int)>
	//   22   36:invokestatic    #92  <Method int Math.min(int, int)>
	//   23   39:ireturn         
		}
	}

	public static int a(int i1, int j1, int k1, int l1, boolean flag)
	{
		int i2;
		boolean flag1;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		i2 = Math.max(0, i1 - k1);
	//    2    3:iconst_0        
	//    3    4:iload_0         
	//    4    5:iload_2         
	//    5    6:isub            
	//    6    7:invokestatic    #89  <Method int Math.max(int, int)>
	//    7   10:istore          5
		if(!flag) goto _L2; else goto _L1
	//    8   12:iload           4
	//    9   14:ifeq            67
_L1:
		if(l1 < 0) goto _L4; else goto _L3
	//   10   17:iload_3         
	//   11   18:iflt            29
_L3:
		k1 = l1;
	//   12   21:iload_3         
	//   13   22:istore_2        
		i1 = 0x40000000;
	//   14   23:ldc1            #83  <Int 0x40000000>
	//   15   25:istore_0        
		break MISSING_BLOCK_LABEL_125;
	//   16   26:goto            125
_L4:
		if(l1 == -1)
	//*  17   29:iload_3         
	//*  18   30:iconst_m1       
	//*  19   31:icmpne          120
		{
			if(j1 != 0x80000000 && (j1 == 0 || j1 != 0x40000000))
	//*  20   34:iload_1         
	//*  21   35:ldc1            #82  <Int 0x80000000>
	//*  22   37:icmpeq          57
	//*  23   40:iload_1         
	//*  24   41:ifeq            50
	//*  25   44:iload_1         
	//*  26   45:ldc1            #83  <Int 0x40000000>
	//*  27   47:icmpeq          57
			{
				j1 = 0;
	//   28   50:iconst_0        
	//   29   51:istore_1        
				i1 = 0;
	//   30   52:iconst_0        
	//   31   53:istore_0        
			} else
	//*  32   54:goto            60
			{
				i1 = i2;
	//   33   57:iload           5
	//   34   59:istore_0        
			}
			k1 = i1;
	//   35   60:iload_0         
	//   36   61:istore_2        
			i1 = j1;
	//   37   62:iload_1         
	//   38   63:istore_0        
			break MISSING_BLOCK_LABEL_125;
	//   39   64:goto            125
		}
		break; /* Loop/switch isn't completed */
_L2:
		if(l1 >= 0)
	//*  40   67:iload_3         
	//*  41   68:iflt            74
			continue; /* Loop/switch isn't completed */
	//   42   71:goto            21
		if(l1 == -1)
	//*  43   74:iload_3         
	//*  44   75:iconst_m1       
	//*  45   76:icmpne          87
		{
			i1 = j1;
	//   46   79:iload_1         
	//   47   80:istore_0        
			k1 = i2;
	//   48   81:iload           5
	//   49   83:istore_2        
			break MISSING_BLOCK_LABEL_125;
	//   50   84:goto            125
		}
		if(l1 == -2)
	//*  51   87:iload_3         
	//*  52   88:bipush          -2
	//*  53   90:icmpne          120
		{
			if(j1 != 0x80000000)
	//*  54   93:iload_1         
	//*  55   94:ldc1            #82  <Int 0x80000000>
	//*  56   96:icmpeq          111
			{
				k1 = i2;
	//   57   99:iload           5
	//   58  101:istore_2        
				i1 = ((int) (flag1));
	//   59  102:iload           6
	//   60  104:istore_0        
				if(j1 != 0x40000000)
					break MISSING_BLOCK_LABEL_125;
	//   61  105:iload_1         
	//   62  106:ldc1            #83  <Int 0x40000000>
	//   63  108:icmpne          125
			}
			i1 = 0x80000000;
	//   64  111:ldc1            #82  <Int 0x80000000>
	//   65  113:istore_0        
			k1 = i2;
	//   66  114:iload           5
	//   67  116:istore_2        
			break MISSING_BLOCK_LABEL_125;
	//   68  117:goto            125
		}
		break; /* Loop/switch isn't completed */
		if(true) goto _L3; else goto _L5
_L5:
		k1 = 0;
	//   69  120:iconst_0        
	//   70  121:istore_2        
		i1 = ((int) (flag1));
	//   71  122:iload           6
	//   72  124:istore_0        
		return android.view.c.makeMeasureSpec(k1, i1);
	//   73  125:iload_2         
	//   74  126:iload_0         
	//   75  127:invokestatic    #96  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   76  130:ireturn         
	}

	public static b a(Context context, AttributeSet attributeset, int i1, int j1)
	{
		b b1 = new b();
	//    0    0:new             #16  <Class RecyclerView$h$b>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void RecyclerView$h$b()>
	//    3    7:astore          4
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.e.a.c.RecyclerView, i1, j1)));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:getstatic       #104 <Field int[] android.support.v7.e.a$c.RecyclerView>
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokevirtual   #110 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   10   19:astore_0        
		b1.a = ((TypedArray) (context)).getInt(android.support.v7.e.a.c.RecyclerView_android_orientation, 1);
	//   11   20:aload           4
	//   12   22:aload_0         
	//   13   23:getstatic       #113 <Field int android.support.v7.e.a$c.RecyclerView_android_orientation>
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #118 <Method int TypedArray.getInt(int, int)>
	//   16   30:putfield        #120 <Field int RecyclerView$h$b.a>
		b1.b = ((TypedArray) (context)).getInt(android.support.v7.e.a.c.RecyclerView_spanCount, 1);
	//   17   33:aload           4
	//   18   35:aload_0         
	//   19   36:getstatic       #123 <Field int android.support.v7.e.a$c.RecyclerView_spanCount>
	//   20   39:iconst_1        
	//   21   40:invokevirtual   #118 <Method int TypedArray.getInt(int, int)>
	//   22   43:putfield        #125 <Field int android.support.v7.widget.RecyclerView$h$b.b>
		b1.c = ((TypedArray) (context)).getBoolean(android.support.v7.e.a.c.RecyclerView_reverseLayout, false);
	//   23   46:aload           4
	//   24   48:aload_0         
	//   25   49:getstatic       #128 <Field int android.support.v7.e.a$c.RecyclerView_reverseLayout>
	//   26   52:iconst_0        
	//   27   53:invokevirtual   #132 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   28   56:putfield        #133 <Field boolean RecyclerView$h$b.c>
		b1.d = ((TypedArray) (context)).getBoolean(android.support.v7.e.a.c.RecyclerView_stackFromEnd, false);
	//   29   59:aload           4
	//   30   61:aload_0         
	//   31   62:getstatic       #136 <Field int android.support.v7.e.a$c.RecyclerView_stackFromEnd>
	//   32   65:iconst_0        
	//   33   66:invokevirtual   #132 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   34   69:putfield        #137 <Field boolean RecyclerView$h$b.d>
		((TypedArray) (context)).recycle();
	//   35   72:aload_0         
	//   36   73:invokevirtual   #140 <Method void TypedArray.recycle()>
		return b1;
	//   37   76:aload           4
	//   38   78:areturn         
	}

	private void a(int i1, View view)
	{
		p.e(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field t p>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #148 <Method void t.e(int)>
	//    4    8:return          
	}

	static void a(RecyclerView$h recyclerview$h, RecyclerView$q recyclerview$q)
	{
		recyclerview$h.a(recyclerview$q);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #152 <Method void a(RecyclerView$q)>
	//    3    5:return          
	}

	private void a(RecyclerView$n recyclerview$n, int i1, View view)
	{
		RecyclerView$u recyclerview$u = RecyclerView.e(view);
	//    0    0:aload_3         
	//    1    1:invokestatic    #156 <Method RecyclerView$u RecyclerView.e(View)>
	//    2    4:astore          4
		if(recyclerview$u.c())
	//*   3    6:aload           4
	//*   4    8:invokevirtual   #161 <Method boolean RecyclerView$u.c()>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		if(recyclerview$u.n() && !recyclerview$u.q() && !q.l.d())
	//*   7   15:aload           4
	//*   8   17:invokevirtual   #164 <Method boolean RecyclerView$u.n()>
	//*   9   20:ifeq            56
	//*  10   23:aload           4
	//*  11   25:invokevirtual   #166 <Method boolean RecyclerView$u.q()>
	//*  12   28:ifne            56
	//*  13   31:aload_0         
	//*  14   32:getfield        #168 <Field RecyclerView q>
	//*  15   35:getfield        #172 <Field RecyclerView$a RecyclerView.l>
	//*  16   38:invokevirtual   #176 <Method boolean RecyclerView$a.d()>
	//*  17   41:ifne            56
		{
			f(i1);
	//   18   44:aload_0         
	//   19   45:iload_2         
	//   20   46:invokevirtual   #178 <Method void f(int)>
			recyclerview$n.b(recyclerview$u);
	//   21   49:aload_1         
	//   22   50:aload           4
	//   23   52:invokevirtual   #183 <Method void android.support.v7.widget.RecyclerView$n.b(RecyclerView$u)>
			return;
	//   24   55:return          
		} else
		{
			g(i1);
	//   25   56:aload_0         
	//   26   57:iload_2         
	//   27   58:invokevirtual   #185 <Method void g(int)>
			recyclerview$n.c(view);
	//   28   61:aload_1         
	//   29   62:aload_3         
	//   30   63:invokevirtual   #188 <Method void RecyclerView$n.c(View)>
			q.g.h(recyclerview$u);
	//   31   66:aload_0         
	//   32   67:getfield        #168 <Field RecyclerView q>
	//   33   70:getfield        #191 <Field bc RecyclerView.g>
	//   34   73:aload           4
	//   35   75:invokevirtual   #195 <Method void bc.h(RecyclerView$u)>
			return;
	//   36   78:return          
		}
	}

	private void a(RecyclerView$q recyclerview$q)
	{
		if(t == recyclerview$q)
	//*   0    0:aload_0         
	//*   1    1:getfield        #197 <Field RecyclerView$q t>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       13
			t = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #197 <Field RecyclerView$q t>
	//    7   13:return          
	}

	private void a(View view, int i1, boolean flag)
	{
		Object obj = ((Object) (RecyclerView.e(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #156 <Method RecyclerView$u RecyclerView.e(View)>
	//    2    4:astore          6
		if(!flag && !((RecyclerView$u) (obj)).q())
	//*   3    6:iload_3         
	//*   4    7:ifne            36
	//*   5   10:aload           6
	//*   6   12:invokevirtual   #166 <Method boolean RecyclerView$u.q()>
	//*   7   15:ifeq            21
	//*   8   18:goto            36
			q.g.f(((RecyclerView$u) (obj)));
	//    9   21:aload_0         
	//   10   22:getfield        #168 <Field RecyclerView q>
	//   11   25:getfield        #191 <Field bc RecyclerView.g>
	//   12   28:aload           6
	//   13   30:invokevirtual   #200 <Method void bc.f(RecyclerView$u)>
		else
	//*  14   33:goto            48
			q.g.e(((RecyclerView$u) (obj)));
	//   15   36:aload_0         
	//   16   37:getfield        #168 <Field RecyclerView q>
	//   17   40:getfield        #191 <Field bc RecyclerView.g>
	//   18   43:aload           6
	//   19   45:invokevirtual   #202 <Method void bc.e(RecyclerView$u)>
		youtParams youtparams = (youtParams)view.getLayoutParams();
	//   20   48:aload_1         
	//   21   49:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   22   52:checkcast       #210 <Class RecyclerView$LayoutParams>
	//   23   55:astore          7
		if(!((RecyclerView$u) (obj)).k() && !((RecyclerView$u) (obj)).i())
	//*  24   57:aload           6
	//*  25   59:invokevirtual   #213 <Method boolean RecyclerView$u.k()>
	//*  26   62:ifne            245
	//*  27   65:aload           6
	//*  28   67:invokevirtual   #216 <Method boolean RecyclerView$u.i()>
	//*  29   70:ifeq            76
	//*  30   73:goto            245
		{
			if(view.getParent() == q)
	//*  31   76:aload_1         
	//*  32   77:invokevirtual   #220 <Method android.view.ViewParent View.getParent()>
	//*  33   80:aload_0         
	//*  34   81:getfield        #168 <Field RecyclerView q>
	//*  35   84:if_acmpne       201
			{
				int k1 = p.b(view);
	//   36   87:aload_0         
	//   37   88:getfield        #143 <Field t p>
	//   38   91:aload_1         
	//   39   92:invokevirtual   #223 <Method int android.support.v7.widget.t.b(View)>
	//   40   95:istore          5
				int j1 = i1;
	//   41   97:iload_2         
	//   42   98:istore          4
				if(i1 == -1)
	//*  43  100:iload_2         
	//*  44  101:iconst_m1       
	//*  45  102:icmpne          114
					j1 = p.b();
	//   46  105:aload_0         
	//   47  106:getfield        #143 <Field t p>
	//   48  109:invokevirtual   #226 <Method int android.support.v7.widget.t.b()>
	//   49  112:istore          4
				if(k1 == -1)
	//*  50  114:iload           5
	//*  51  116:iconst_m1       
	//*  52  117:icmpne          177
				{
					obj = ((Object) (new StringBuilder()));
	//   53  120:new             #228 <Class StringBuilder>
	//   54  123:dup             
	//   55  124:invokespecial   #229 <Method void StringBuilder()>
	//   56  127:astore          6
					((StringBuilder) (obj)).append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
	//   57  129:aload           6
	//   58  131:ldc1            #231 <String "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:">
	//   59  133:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   60  136:pop             
					((StringBuilder) (obj)).append(q.indexOfChild(view));
	//   61  137:aload           6
	//   62  139:aload_0         
	//   63  140:getfield        #168 <Field RecyclerView q>
	//   64  143:aload_1         
	//   65  144:invokevirtual   #238 <Method int RecyclerView.indexOfChild(View)>
	//   66  147:invokevirtual   #241 <Method StringBuilder StringBuilder.append(int)>
	//   67  150:pop             
					((StringBuilder) (obj)).append(q.a());
	//   68  151:aload           6
	//   69  153:aload_0         
	//   70  154:getfield        #168 <Field RecyclerView q>
	//   71  157:invokevirtual   #244 <Method String RecyclerView.a()>
	//   72  160:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   73  163:pop             
					throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   74  164:new             #246 <Class IllegalStateException>
	//   75  167:dup             
	//   76  168:aload           6
	//   77  170:invokevirtual   #249 <Method String StringBuilder.toString()>
	//   78  173:invokespecial   #252 <Method void IllegalStateException(String)>
	//   79  176:athrow          
				}
				if(k1 != j1)
	//*  80  177:iload           5
	//*  81  179:iload           4
	//*  82  181:icmpeq          280
					q.m.f(k1, j1);
	//   83  184:aload_0         
	//   84  185:getfield        #168 <Field RecyclerView q>
	//   85  188:getfield        #256 <Field RecyclerView$h RecyclerView.m>
	//   86  191:iload           5
	//   87  193:iload           4
	//   88  195:invokevirtual   #259 <Method void f(int, int)>
			} else
	//*  89  198:goto            280
			{
				p.a(view, i1, false);
	//   90  201:aload_0         
	//   91  202:getfield        #143 <Field t p>
	//   92  205:aload_1         
	//   93  206:iload_2         
	//   94  207:iconst_0        
	//   95  208:invokevirtual   #261 <Method void t.a(View, int, boolean)>
				youtparams.e = true;
	//   96  211:aload           7
	//   97  213:iconst_1        
	//   98  214:putfield        #263 <Field boolean RecyclerView$LayoutParams.e>
				if(t != null && t.c())
	//*  99  217:aload_0         
	//* 100  218:getfield        #197 <Field RecyclerView$q t>
	//* 101  221:ifnull          280
	//* 102  224:aload_0         
	//* 103  225:getfield        #197 <Field RecyclerView$q t>
	//* 104  228:invokevirtual   #266 <Method boolean RecyclerView$q.c()>
	//* 105  231:ifeq            280
					t.b(view);
	//  106  234:aload_0         
	//  107  235:getfield        #197 <Field RecyclerView$q t>
	//  108  238:aload_1         
	//  109  239:invokevirtual   #268 <Method void android.support.v7.widget.RecyclerView$q.b(View)>
			}
		} else
	//* 110  242:goto            280
		{
			if(((RecyclerView$u) (obj)).i())
	//* 111  245:aload           6
	//* 112  247:invokevirtual   #216 <Method boolean RecyclerView$u.i()>
	//* 113  250:ifeq            261
				((RecyclerView$u) (obj)).j();
	//  114  253:aload           6
	//  115  255:invokevirtual   #271 <Method void RecyclerView$u.j()>
			else
	//* 116  258:goto            266
				((RecyclerView$u) (obj)).l();
	//  117  261:aload           6
	//  118  263:invokevirtual   #273 <Method void RecyclerView$u.l()>
			p.a(view, i1, view.getLayoutParams(), false);
	//  119  266:aload_0         
	//  120  267:getfield        #143 <Field t p>
	//  121  270:aload_1         
	//  122  271:iload_2         
	//  123  272:aload_1         
	//  124  273:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  125  276:iconst_0        
	//  126  277:invokevirtual   #276 <Method void t.a(View, int, android.view.ViewGroup$LayoutParams, boolean)>
		}
		if(youtparams.f)
	//* 127  280:aload           7
	//* 128  282:getfield        #278 <Field boolean RecyclerView$LayoutParams.f>
	//* 129  285:ifeq            302
		{
			((RecyclerView$u) (obj)).a.invalidate();
	//  130  288:aload           6
	//  131  290:getfield        #281 <Field View RecyclerView$u.a>
	//  132  293:invokevirtual   #284 <Method void View.invalidate()>
			youtparams.f = false;
	//  133  296:aload           7
	//  134  298:iconst_0        
	//  135  299:putfield        #278 <Field boolean RecyclerView$LayoutParams.f>
		}
	//  136  302:return          
	}

	private static boolean b(int i1, int j1, int k1)
	{
		int l1 = android.view.c.getMode(j1);
	//    0    0:iload_1         
	//    1    1:invokestatic    #78  <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		j1 = android.view.c.getSize(j1);
	//    3    5:iload_1         
	//    4    6:invokestatic    #81  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_1        
		boolean flag1 = false;
	//    6   10:iconst_0        
	//    7   11:istore          5
		boolean flag = false;
	//    8   13:iconst_0        
	//    9   14:istore          4
		if(k1 > 0 && i1 != k1)
	//*  10   16:iload_2         
	//*  11   17:ifle            27
	//*  12   20:iload_0         
	//*  13   21:iload_2         
	//*  14   22:icmpeq          27
			return false;
	//   15   25:iconst_0        
	//   16   26:ireturn         
		if(l1 != 0x80000000)
	//*  17   27:iload_3         
	//*  18   28:ldc1            #82  <Int 0x80000000>
	//*  19   30:icmpeq          58
			if(l1 != 0)
	//*  20   33:iload_3         
	//*  21   34:ifeq            56
			{
				if(l1 != 0x40000000)
	//*  22   37:iload_3         
	//*  23   38:ldc1            #83  <Int 0x40000000>
	//*  24   40:icmpeq          45
					return false;
	//   25   43:iconst_0        
	//   26   44:ireturn         
				if(j1 == i1)
	//*  27   45:iload_1         
	//*  28   46:iload_0         
	//*  29   47:icmpne          53
					flag = true;
	//   30   50:iconst_1        
	//   31   51:istore          4
				return flag;
	//   32   53:iload           4
	//   33   55:ireturn         
			} else
			{
				return true;
	//   34   56:iconst_1        
	//   35   57:ireturn         
			}
		flag = flag1;
	//   36   58:iload           5
	//   37   60:istore          4
		if(j1 >= i1)
	//*  38   62:iload_1         
	//*  39   63:iload_0         
	//*  40   64:icmplt          70
			flag = true;
	//   41   67:iconst_1        
	//   42   68:istore          4
		return flag;
	//   43   70:iload           4
	//   44   72:ireturn         
	}

	private int[] b(RecyclerView recyclerview, View view, Rect rect, boolean flag)
	{
		int i1 = z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #289 <Method int z()>
	//    2    4:istore          5
		int j1 = A();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #292 <Method int A()>
	//    5   10:istore          6
		int k1 = x();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #294 <Method int x()>
	//    8   16:istore          7
		int j3 = B();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #297 <Method int B()>
	//   11   22:istore          14
		int i2 = y();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #299 <Method int y()>
	//   14   28:istore          9
		int j2 = C();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #302 <Method int C()>
	//   17   34:istore          10
		int k3 = (view.getLeft() + rect.left) - view.getScrollX();
	//   18   36:aload_2         
	//   19   37:invokevirtual   #305 <Method int View.getLeft()>
	//   20   40:aload_3         
	//   21   41:getfield        #310 <Field int Rect.left>
	//   22   44:iadd            
	//   23   45:aload_2         
	//   24   46:invokevirtual   #313 <Method int View.getScrollX()>
	//   25   49:isub            
	//   26   50:istore          15
		int k2 = (view.getTop() + rect.top) - view.getScrollY();
	//   27   52:aload_2         
	//   28   53:invokevirtual   #316 <Method int View.getTop()>
	//   29   56:aload_3         
	//   30   57:getfield        #319 <Field int Rect.top>
	//   31   60:iadd            
	//   32   61:aload_2         
	//   33   62:invokevirtual   #322 <Method int View.getScrollY()>
	//   34   65:isub            
	//   35   66:istore          11
		int l3 = rect.width();
	//   36   68:aload_3         
	//   37   69:invokevirtual   #325 <Method int Rect.width()>
	//   38   72:istore          16
		int l2 = rect.height();
	//   39   74:aload_3         
	//   40   75:invokevirtual   #328 <Method int Rect.height()>
	//   41   78:istore          12
		int i3 = k3 - i1;
	//   42   80:iload           15
	//   43   82:iload           5
	//   44   84:isub            
	//   45   85:istore          13
		i1 = Math.min(0, i3);
	//   46   87:iconst_0        
	//   47   88:iload           13
	//   48   90:invokestatic    #92  <Method int Math.min(int, int)>
	//   49   93:istore          5
		int l1 = k2 - j1;
	//   50   95:iload           11
	//   51   97:iload           6
	//   52   99:isub            
	//   53  100:istore          8
		j1 = Math.min(0, l1);
	//   54  102:iconst_0        
	//   55  103:iload           8
	//   56  105:invokestatic    #92  <Method int Math.min(int, int)>
	//   57  108:istore          6
		j3 = (l3 + k3) - (k1 - j3);
	//   58  110:iload           16
	//   59  112:iload           15
	//   60  114:iadd            
	//   61  115:iload           7
	//   62  117:iload           14
	//   63  119:isub            
	//   64  120:isub            
	//   65  121:istore          14
		k1 = Math.max(0, j3);
	//   66  123:iconst_0        
	//   67  124:iload           14
	//   68  126:invokestatic    #89  <Method int Math.max(int, int)>
	//   69  129:istore          7
		i2 = Math.max(0, (l2 + k2) - (i2 - j2));
	//   70  131:iconst_0        
	//   71  132:iload           12
	//   72  134:iload           11
	//   73  136:iadd            
	//   74  137:iload           9
	//   75  139:iload           10
	//   76  141:isub            
	//   77  142:isub            
	//   78  143:invokestatic    #89  <Method int Math.max(int, int)>
	//   79  146:istore          9
		if(s() == 1)
	//*  80  148:aload_0         
	//*  81  149:invokevirtual   #330 <Method int s()>
	//*  82  152:iconst_1        
	//*  83  153:icmpne          180
		{
			if(k1 != 0)
	//*  84  156:iload           7
	//*  85  158:ifeq            168
				i1 = k1;
	//   86  161:iload           7
	//   87  163:istore          5
			else
	//*  88  165:goto            200
				i1 = Math.max(i1, j3);
	//   89  168:iload           5
	//   90  170:iload           14
	//   91  172:invokestatic    #89  <Method int Math.max(int, int)>
	//   92  175:istore          5
		} else
	//*  93  177:goto            200
		if(i1 == 0)
	//*  94  180:iload           5
	//*  95  182:ifeq            188
	//*  96  185:goto            200
			i1 = Math.min(i3, k1);
	//   97  188:iload           13
	//   98  190:iload           7
	//   99  192:invokestatic    #92  <Method int Math.min(int, int)>
	//  100  195:istore          5
	//* 101  197:goto            185
		if(j1 == 0)
	//* 102  200:iload           6
	//* 103  202:ifeq            208
	//* 104  205:goto            217
			j1 = Math.min(l1, i2);
	//  105  208:iload           8
	//  106  210:iload           9
	//  107  212:invokestatic    #92  <Method int Math.min(int, int)>
	//  108  215:istore          6
		return (new int[] {
			i1, j1
		});
	//  109  217:iconst_2        
	//  110  218:newarray        int[]
	//  111  220:dup             
	//  112  221:iconst_0        
	//  113  222:iload           5
	//  114  224:iastore         
	//  115  225:dup             
	//  116  226:iconst_1        
	//  117  227:iload           6
	//  118  229:iastore         
	//  119  230:areturn         
	}

	private boolean d(RecyclerView recyclerview, int i1, int j1)
	{
		recyclerview = ((RecyclerView) (recyclerview.getFocusedChild()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #335 <Method View RecyclerView.getFocusedChild()>
	//    2    4:astore_1        
		if(recyclerview == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		int k1 = z();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #289 <Method int z()>
	//    9   15:istore          4
		int l1 = A();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #292 <Method int A()>
	//   12   21:istore          5
		int i2 = x();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #294 <Method int x()>
	//   15   27:istore          6
		int j2 = B();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #297 <Method int B()>
	//   18   33:istore          7
		int k2 = y();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #299 <Method int y()>
	//   21   39:istore          8
		int l2 = C();
	//   22   41:aload_0         
	//   23   42:invokevirtual   #302 <Method int C()>
	//   24   45:istore          9
		Rect rect = q.j;
	//   25   47:aload_0         
	//   26   48:getfield        #168 <Field RecyclerView q>
	//   27   51:getfield        #338 <Field Rect RecyclerView.j>
	//   28   54:astore          10
		a(((View) (recyclerview)), rect);
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:aload           10
	//   32   60:invokevirtual   #341 <Method void a(View, Rect)>
		if(rect.left - i1 < i2 - j2 && rect.right - i1 > k1 && rect.top - j1 < k2 - l2)
	//*  33   63:aload           10
	//*  34   65:getfield        #310 <Field int Rect.left>
	//*  35   68:iload_2         
	//*  36   69:isub            
	//*  37   70:iload           6
	//*  38   72:iload           7
	//*  39   74:isub            
	//*  40   75:icmpge          121
	//*  41   78:aload           10
	//*  42   80:getfield        #344 <Field int Rect.right>
	//*  43   83:iload_2         
	//*  44   84:isub            
	//*  45   85:iload           4
	//*  46   87:icmple          121
	//*  47   90:aload           10
	//*  48   92:getfield        #319 <Field int Rect.top>
	//*  49   95:iload_3         
	//*  50   96:isub            
	//*  51   97:iload           8
	//*  52   99:iload           9
	//*  53  101:isub            
	//*  54  102:icmpge          121
			return rect.bottom - j1 > l1;
	//   55  105:aload           10
	//   56  107:getfield        #347 <Field int Rect.bottom>
	//   57  110:iload_3         
	//   58  111:isub            
	//   59  112:iload           5
	//   60  114:icmpgt          119
	//   61  117:iconst_0        
	//   62  118:ireturn         
	//   63  119:iconst_1        
	//   64  120:ireturn         
		else
			return false;
	//   65  121:iconst_0        
	//   66  122:ireturn         
	}

	public int A()
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:ifnull          15
			return q.getPaddingTop();
	//    3    7:aload_0         
	//    4    8:getfield        #168 <Field RecyclerView q>
	//    5   11:invokevirtual   #350 <Method int RecyclerView.getPaddingTop()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int B()
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:ifnull          15
			return q.getPaddingRight();
	//    3    7:aload_0         
	//    4    8:getfield        #168 <Field RecyclerView q>
	//    5   11:invokevirtual   #353 <Method int RecyclerView.getPaddingRight()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int C()
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:ifnull          15
			return q.getPaddingBottom();
	//    3    7:aload_0         
	//    4    8:getfield        #168 <Field RecyclerView q>
	//    5   11:invokevirtual   #356 <Method int RecyclerView.getPaddingBottom()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public View D()
	{
		if(q == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		View view = q.getFocusedChild();
	//    5    9:aload_0         
	//    6   10:getfield        #168 <Field RecyclerView q>
	//    7   13:invokevirtual   #335 <Method View RecyclerView.getFocusedChild()>
	//    8   16:astore_1        
		if(view != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          36
		{
			if(p.c(view))
	//*  11   21:aload_0         
	//*  12   22:getfield        #143 <Field t p>
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #360 <Method boolean t.c(View)>
	//*  15   29:ifeq            34
				return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
			else
				return view;
	//   18   34:aload_1         
	//   19   35:areturn         
		} else
		{
			return null;
	//   20   36:aconst_null     
	//   21   37:areturn         
		}
	}

	public int E()
	{
		return android.support.v4.view.s.i(((View) (q)));
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field RecyclerView q>
	//    2    4:invokestatic    #365 <Method int s.i(View)>
	//    3    7:ireturn         
	}

	public int F()
	{
		return android.support.v4.view.s.j(((View) (q)));
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field RecyclerView q>
	//    2    4:invokestatic    #368 <Method int s.j(View)>
	//    3    7:ireturn         
	}

	void G()
	{
		if(t != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #197 <Field RecyclerView$q t>
	//*   2    4:ifnull          14
			t.a();
	//    3    7:aload_0         
	//    4    8:getfield        #197 <Field RecyclerView$q t>
	//    5   11:invokevirtual   #371 <Method void RecyclerView$q.a()>
	//    6   14:return          
	}

	public void H()
	{
		u = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #62  <Field boolean u>
	//    3    5:return          
	}

	boolean I()
	{
		int j1 = u();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #374 <Method int u()>
	//    2    4:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          44
		{
			android.view.tParams tparams = h(i1).getLayoutParams();
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #377 <Method View h(int)>
	//   11   17:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   20:astore_3        
			if(tparams.width < 0 && tparams.height < 0)
	//*  13   21:aload_3         
	//*  14   22:getfield        #381 <Field int android.view.ViewGroup$LayoutParams.width>
	//*  15   25:ifge            37
	//*  16   28:aload_3         
	//*  17   29:getfield        #383 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  18   32:ifge            37
				return true;
	//   19   35:iconst_1        
	//   20   36:ireturn         
		}

	//   21   37:iload_1         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_1        
	//*  25   41:goto            7
		return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
	}

	public int a(int i1, RecyclerView$n recyclerview$n, RecyclerView$r recyclerview$r)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int a(RecyclerView$n recyclerview$n, RecyclerView$r recyclerview$r)
	{
		recyclerview$n = ((RecyclerView$n) (q));
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field RecyclerView q>
	//    2    4:astore_1        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore          4
		int i1 = ((int) (flag));
	//    5    8:iload           4
	//    6   10:istore_3        
		if(recyclerview$n != null)
	//*   7   11:aload_1         
	//*   8   12:ifnull          48
		{
			if(q.l == null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #168 <Field RecyclerView q>
	//*  11   19:getfield        #172 <Field RecyclerView$a RecyclerView.l>
	//*  12   22:ifnonnull       27
				return 1;
	//   13   25:iconst_1        
	//   14   26:ireturn         
			i1 = ((int) (flag));
	//   15   27:iload           4
	//   16   29:istore_3        
			if(e())
	//*  17   30:aload_0         
	//*  18   31:invokevirtual   #387 <Method boolean e()>
	//*  19   34:ifeq            48
				i1 = q.l.a();
	//   20   37:aload_0         
	//   21   38:getfield        #168 <Field RecyclerView q>
	//   22   41:getfield        #172 <Field RecyclerView$a RecyclerView.l>
	//   23   44:invokevirtual   #389 <Method int RecyclerView$a.a()>
	//   24   47:istore_3        
		}
		return i1;
	//   25   48:iload_3         
	//   26   49:ireturn         
	}

	public abstract youtParams a();

	public youtParams a(Context context, AttributeSet attributeset)
	{
		return new youtParams(context, attributeset);
	//    0    0:new             #210 <Class RecyclerView$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #394 <Method void RecyclerView$LayoutParams(Context, AttributeSet)>
	//    5    9:areturn         
	}

	public youtParams a(android.view.tParams tparams)
	{
		if(tparams instanceof youtParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #210 <Class RecyclerView$LayoutParams>
	//*   2    4:ifeq            19
			return new youtParams((youtParams)tparams);
	//    3    7:new             #210 <Class RecyclerView$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #210 <Class RecyclerView$LayoutParams>
	//    7   15:invokespecial   #398 <Method void RecyclerView$LayoutParams(RecyclerView$LayoutParams)>
	//    8   18:areturn         
		if(tparams instanceof android.view.nLayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #400 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return new youtParams((android.view.nLayoutParams)tparams);
	//   12   26:new             #210 <Class RecyclerView$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #400 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #403 <Method void RecyclerView$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return new youtParams(tparams);
	//   18   38:new             #210 <Class RecyclerView$LayoutParams>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #406 <Method void RecyclerView$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   22   46:areturn         
	}

	public View a(View view, int i1, RecyclerView$n recyclerview$n, RecyclerView$r recyclerview$r)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void a(int i1, int j1, RecyclerView$r recyclerview$r, a a1)
	{
	//    0    0:return          
	}

	public void a(int i1, a a1)
	{
	//    0    0:return          
	}

	public void a(int i1, RecyclerView$n recyclerview$n)
	{
		View view = h(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #377 <Method View h(int)>
	//    3    5:astore_3        
		f(i1);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:invokevirtual   #178 <Method void f(int)>
		recyclerview$n.a(view);
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #412 <Method void RecyclerView$n.a(View)>
	//   10   16:return          
	}

	public void a(Rect rect, int i1, int j1)
	{
		int k1 = rect.width();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #325 <Method int Rect.width()>
	//    2    4:istore          4
		int l1 = z();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #289 <Method int z()>
	//    5   10:istore          5
		int i2 = B();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #297 <Method int B()>
	//    8   16:istore          6
		int j2 = rect.height();
	//    9   18:aload_1         
	//   10   19:invokevirtual   #328 <Method int Rect.height()>
	//   11   22:istore          7
		int k2 = A();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #292 <Method int A()>
	//   14   28:istore          8
		int l2 = C();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #302 <Method int C()>
	//   17   34:istore          9
		g(a(i1, k1 + l1 + i2, E()), a(j1, j2 + k2 + l2, F()));
	//   18   36:aload_0         
	//   19   37:iload_2         
	//   20   38:iload           4
	//   21   40:iload           5
	//   22   42:iadd            
	//   23   43:iload           6
	//   24   45:iadd            
	//   25   46:aload_0         
	//   26   47:invokevirtual   #415 <Method int E()>
	//   27   50:invokestatic    #417 <Method int a(int, int, int)>
	//   28   53:iload_3         
	//   29   54:iload           7
	//   30   56:iload           8
	//   31   58:iadd            
	//   32   59:iload           9
	//   33   61:iadd            
	//   34   62:aload_0         
	//   35   63:invokevirtual   #419 <Method int F()>
	//   36   66:invokestatic    #417 <Method int a(int, int, int)>
	//   37   69:invokevirtual   #421 <Method void g(int, int)>
	//   38   72:return          
	}

	public void a(Parcelable parcelable)
	{
	//    0    0:return          
	}

	void a(android.support.v4.view.a.b b1)
	{
		a(q.d, q.B, b1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #168 <Field RecyclerView q>
	//    3    5:getfield        #426 <Field RecyclerView$n RecyclerView.d>
	//    4    8:aload_0         
	//    5    9:getfield        #168 <Field RecyclerView q>
	//    6   12:getfield        #429 <Field RecyclerView$r RecyclerView.B>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #432 <Method void a(RecyclerView$n, RecyclerView$r, b)>
	//    9   19:return          
	}

	public void a(RecyclerView$a recyclerview$a, RecyclerView$a recyclerview$a1)
	{
	//    0    0:return          
	}

	public void a(RecyclerView$n recyclerview$n)
	{
		for(int i1 = u() - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #374 <Method int u()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            29
			a(recyclerview$n, i1, h(i1));
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:iload_2         
	//   10   14:aload_0         
	//   11   15:iload_2         
	//   12   16:invokevirtual   #377 <Method View h(int)>
	//   13   19:invokespecial   #436 <Method void a(RecyclerView$n, int, View)>

	//   14   22:iload_2         
	//   15   23:iconst_1        
	//   16   24:isub            
	//   17   25:istore_2        
	//*  18   26:goto            7
	//   19   29:return          
	}

	public void a(RecyclerView$n recyclerview$n, RecyclerView$r recyclerview$r, int i1, int j1)
	{
		q.e(i1, j1);
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field RecyclerView q>
	//    2    4:iload_3         
	//    3    5:iload           4
	//    4    7:invokevirtual   #439 <Method void RecyclerView.e(int, int)>
	//    5   10:return          
	}

	public void a(RecyclerView$n recyclerview$n, RecyclerView$r recyclerview$r, android.support.v4.view.a.b b1)
	{
		if(q.canScrollVertically(-1) || q.canScrollHorizontally(-1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:iconst_m1       
	//*   3    5:invokevirtual   #443 <Method boolean RecyclerView.canScrollVertically(int)>
	//*   4    8:ifne            22
	//*   5   11:aload_0         
	//*   6   12:getfield        #168 <Field RecyclerView q>
	//*   7   15:iconst_m1       
	//*   8   16:invokevirtual   #446 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*   9   19:ifeq            34
		{
			b1.a(8192);
	//   10   22:aload_3         
	//   11   23:sipush          8192
	//   12   26:invokevirtual   #450 <Method void b.a(int)>
			b1.k(true);
	//   13   29:aload_3         
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #453 <Method void b.k(boolean)>
		}
		if(q.canScrollVertically(1) || q.canScrollHorizontally(1))
	//*  16   34:aload_0         
	//*  17   35:getfield        #168 <Field RecyclerView q>
	//*  18   38:iconst_1        
	//*  19   39:invokevirtual   #443 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  20   42:ifne            56
	//*  21   45:aload_0         
	//*  22   46:getfield        #168 <Field RecyclerView q>
	//*  23   49:iconst_1        
	//*  24   50:invokevirtual   #446 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  25   53:ifeq            68
		{
			b1.a(4096);
	//   26   56:aload_3         
	//   27   57:sipush          4096
	//   28   60:invokevirtual   #450 <Method void b.a(int)>
			b1.k(true);
	//   29   63:aload_3         
	//   30   64:iconst_1        
	//   31   65:invokevirtual   #453 <Method void b.k(boolean)>
		}
		b1.a(((Object) (android.support.v4.view.a.b.k.a(a(recyclerview$n, recyclerview$r), b(recyclerview$n, recyclerview$r), e(recyclerview$n, recyclerview$r), d(recyclerview$n, recyclerview$r)))));
	//   32   68:aload_3         
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:aload_2         
	//   36   72:invokevirtual   #455 <Method int a(RecyclerView$n, RecyclerView$r)>
	//   37   75:aload_0         
	//   38   76:aload_1         
	//   39   77:aload_2         
	//   40   78:invokevirtual   #457 <Method int b(RecyclerView$n, RecyclerView$r)>
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:aload_2         
	//   44   84:invokevirtual   #460 <Method boolean e(RecyclerView$n, RecyclerView$r)>
	//   45   87:aload_0         
	//   46   88:aload_1         
	//   47   89:aload_2         
	//   48   90:invokevirtual   #462 <Method int d(RecyclerView$n, RecyclerView$r)>
	//   49   93:invokestatic    #467 <Method android.support.v4.view.a.b$k android.support.v4.view.a.b$k.a(int, int, boolean, int)>
	//   50   96:invokevirtual   #470 <Method void b.a(Object)>
	//   51   99:return          
	}

	public void a(RecyclerView$n recyclerview$n, RecyclerView$r recyclerview$r, View view, android.support.v4.view.a.b b1)
	{
		int i1;
		if(e())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #387 <Method boolean e()>
	//*   2    4:ifeq            17
			i1 = d(view);
	//    3    7:aload_0         
	//    4    8:aload_3         
	//    5    9:invokevirtual   #473 <Method int d(View)>
	//    6   12:istore          5
		else
	//*   7   14:goto            20
			i1 = 0;
	//    8   17:iconst_0        
	//    9   18:istore          5
		int j1;
		if(d())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #474 <Method boolean d()>
	//*  12   24:ifeq            37
			j1 = d(view);
	//   13   27:aload_0         
	//   14   28:aload_3         
	//   15   29:invokevirtual   #473 <Method int d(View)>
	//   16   32:istore          6
		else
	//*  17   34:goto            40
			j1 = 0;
	//   18   37:iconst_0        
	//   19   38:istore          6
		b1.b(((Object) (android.support.v4.view.a.b.l.a(i1, 1, j1, 1, false, false))));
	//   20   40:aload           4
	//   21   42:iload           5
	//   22   44:iconst_1        
	//   23   45:iload           6
	//   24   47:iconst_1        
	//   25   48:iconst_0        
	//   26   49:iconst_0        
	//   27   50:invokestatic    #479 <Method android.support.v4.view.a.b$l android.support.v4.view.a.b$l.a(int, int, int, int, boolean, boolean)>
	//   28   53:invokevirtual   #481 <Method void b.b(Object)>
	//   29   56:return          
	}

	public void a(RecyclerView$n recyclerview$n, RecyclerView$r recyclerview$r, AccessibilityEvent accessibilityevent)
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:ifnull          113
		{
			if(accessibilityevent == null)
	//*   3    7:aload_3         
	//*   4    8:ifnonnull       12
				return;
	//    5   11:return          
			recyclerview$n = ((RecyclerView$n) (q));
	//    6   12:aload_0         
	//    7   13:getfield        #168 <Field RecyclerView q>
	//    8   16:astore_1        
			boolean flag1 = true;
	//    9   17:iconst_1        
	//   10   18:istore          5
			boolean flag = flag1;
	//   11   20:iload           5
	//   12   22:istore          4
			if(!((RecyclerView) (recyclerview$n)).canScrollVertically(1))
	//*  13   24:aload_1         
	//*  14   25:iconst_1        
	//*  15   26:invokevirtual   #443 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  16   29:ifne            83
			{
				flag = flag1;
	//   17   32:iload           5
	//   18   34:istore          4
				if(!q.canScrollVertically(-1))
	//*  19   36:aload_0         
	//*  20   37:getfield        #168 <Field RecyclerView q>
	//*  21   40:iconst_m1       
	//*  22   41:invokevirtual   #443 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  23   44:ifne            83
				{
					flag = flag1;
	//   24   47:iload           5
	//   25   49:istore          4
					if(!q.canScrollHorizontally(-1))
	//*  26   51:aload_0         
	//*  27   52:getfield        #168 <Field RecyclerView q>
	//*  28   55:iconst_m1       
	//*  29   56:invokevirtual   #446 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  30   59:ifne            83
						if(q.canScrollHorizontally(1))
	//*  31   62:aload_0         
	//*  32   63:getfield        #168 <Field RecyclerView q>
	//*  33   66:iconst_1        
	//*  34   67:invokevirtual   #446 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//*  35   70:ifeq            80
							flag = flag1;
	//   36   73:iload           5
	//   37   75:istore          4
						else
	//*  38   77:goto            83
							flag = false;
	//   39   80:iconst_0        
	//   40   81:istore          4
				}
			}
			accessibilityevent.setScrollable(flag);
	//   41   83:aload_3         
	//   42   84:iload           4
	//   43   86:invokevirtual   #487 <Method void AccessibilityEvent.setScrollable(boolean)>
			if(q.l != null)
	//*  44   89:aload_0         
	//*  45   90:getfield        #168 <Field RecyclerView q>
	//*  46   93:getfield        #172 <Field RecyclerView$a RecyclerView.l>
	//*  47   96:ifnull          113
				accessibilityevent.setItemCount(q.l.a());
	//   48   99:aload_3         
	//   49  100:aload_0         
	//   50  101:getfield        #168 <Field RecyclerView q>
	//   51  104:getfield        #172 <Field RecyclerView$a RecyclerView.l>
	//   52  107:invokevirtual   #389 <Method int RecyclerView$a.a()>
	//   53  110:invokevirtual   #490 <Method void AccessibilityEvent.setItemCount(int)>
		}
	//   54  113:return          
	}

	public void a(RecyclerView$r recyclerview$r)
	{
	//    0    0:return          
	}

	public void a(RecyclerView recyclerview)
	{
	//    0    0:return          
	}

	public void a(RecyclerView recyclerview, int i1, int j1)
	{
	//    0    0:return          
	}

	public void a(RecyclerView recyclerview, int i1, int j1, int k1)
	{
	//    0    0:return          
	}

	public void a(RecyclerView recyclerview, int i1, int j1, Object obj)
	{
		c(recyclerview, i1, j1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #497 <Method void c(RecyclerView, int, int)>
	//    5    7:return          
	}

	public void a(RecyclerView recyclerview, RecyclerView$n recyclerview$n)
	{
		e(recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #500 <Method void e(RecyclerView)>
	//    3    5:return          
	}

	public void a(View view)
	{
		a(view, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #503 <Method void a(View, int)>
	//    4    6:return          
	}

	public void a(View view, int i1)
	{
		a(view, i1, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #504 <Method void a(View, int, boolean)>
	//    5    7:return          
	}

	public void a(View view, int i1, int j1)
	{
		youtParams youtparams = (youtParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
	//    3    7:astore          8
		Rect rect = q.i(view);
	//    4    9:aload_0         
	//    5   10:getfield        #168 <Field RecyclerView q>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #508 <Method Rect RecyclerView.i(View)>
	//    8   17:astore          9
		int i2 = rect.left;
	//    9   19:aload           9
	//   10   21:getfield        #310 <Field int Rect.left>
	//   11   24:istore          6
		int j2 = rect.right;
	//   12   26:aload           9
	//   13   28:getfield        #344 <Field int Rect.right>
	//   14   31:istore          7
		int k1 = rect.top;
	//   15   33:aload           9
	//   16   35:getfield        #319 <Field int Rect.top>
	//   17   38:istore          4
		int l1 = rect.bottom;
	//   18   40:aload           9
	//   19   42:getfield        #347 <Field int Rect.bottom>
	//   20   45:istore          5
		i1 = a(x(), v(), z() + B() + youtparams.leftMargin + youtparams.rightMargin + (i1 + (i2 + j2)), youtparams.width, d());
	//   21   47:aload_0         
	//   22   48:invokevirtual   #294 <Method int x()>
	//   23   51:aload_0         
	//   24   52:invokevirtual   #510 <Method int v()>
	//   25   55:aload_0         
	//   26   56:invokevirtual   #289 <Method int z()>
	//   27   59:aload_0         
	//   28   60:invokevirtual   #297 <Method int B()>
	//   29   63:iadd            
	//   30   64:aload           8
	//   31   66:getfield        #513 <Field int RecyclerView$LayoutParams.leftMargin>
	//   32   69:iadd            
	//   33   70:aload           8
	//   34   72:getfield        #516 <Field int RecyclerView$LayoutParams.rightMargin>
	//   35   75:iadd            
	//   36   76:iload_2         
	//   37   77:iload           6
	//   38   79:iload           7
	//   39   81:iadd            
	//   40   82:iadd            
	//   41   83:iadd            
	//   42   84:aload           8
	//   43   86:getfield        #517 <Field int RecyclerView$LayoutParams.width>
	//   44   89:aload_0         
	//   45   90:invokevirtual   #474 <Method boolean d()>
	//   46   93:invokestatic    #519 <Method int a(int, int, int, int, boolean)>
	//   47   96:istore_2        
		j1 = a(y(), w(), A() + C() + youtparams.topMargin + youtparams.bottomMargin + (j1 + (k1 + l1)), youtparams.height, e());
	//   48   97:aload_0         
	//   49   98:invokevirtual   #299 <Method int y()>
	//   50  101:aload_0         
	//   51  102:invokevirtual   #521 <Method int w()>
	//   52  105:aload_0         
	//   53  106:invokevirtual   #292 <Method int A()>
	//   54  109:aload_0         
	//   55  110:invokevirtual   #302 <Method int C()>
	//   56  113:iadd            
	//   57  114:aload           8
	//   58  116:getfield        #524 <Field int RecyclerView$LayoutParams.topMargin>
	//   59  119:iadd            
	//   60  120:aload           8
	//   61  122:getfield        #527 <Field int RecyclerView$LayoutParams.bottomMargin>
	//   62  125:iadd            
	//   63  126:iload_3         
	//   64  127:iload           4
	//   65  129:iload           5
	//   66  131:iadd            
	//   67  132:iadd            
	//   68  133:iadd            
	//   69  134:aload           8
	//   70  136:getfield        #528 <Field int RecyclerView$LayoutParams.height>
	//   71  139:aload_0         
	//   72  140:invokevirtual   #387 <Method boolean e()>
	//   73  143:invokestatic    #519 <Method int a(int, int, int, int, boolean)>
	//   74  146:istore_3        
		if(b(view, i1, j1, youtparams))
	//*  75  147:aload_0         
	//*  76  148:aload_1         
	//*  77  149:iload_2         
	//*  78  150:iload_3         
	//*  79  151:aload           8
	//*  80  153:invokevirtual   #531 <Method boolean b(View, int, int, RecyclerView$LayoutParams)>
	//*  81  156:ifeq            165
			view.measure(i1, j1);
	//   82  159:aload_1         
	//   83  160:iload_2         
	//   84  161:iload_3         
	//   85  162:invokevirtual   #534 <Method void View.measure(int, int)>
	//   86  165:return          
	}

	public void a(View view, int i1, int j1, int k1, int l1)
	{
		youtParams youtparams = (youtParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
	//    3    7:astore          6
		Rect rect = youtparams.d;
	//    4    9:aload           6
	//    5   11:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
	//    6   14:astore          7
		view.layout(i1 + rect.left + youtparams.leftMargin, j1 + rect.top + youtparams.topMargin, k1 - rect.right - youtparams.rightMargin, l1 - rect.bottom - youtparams.bottomMargin);
	//    7   16:aload_1         
	//    8   17:iload_2         
	//    9   18:aload           7
	//   10   20:getfield        #310 <Field int Rect.left>
	//   11   23:iadd            
	//   12   24:aload           6
	//   13   26:getfield        #513 <Field int RecyclerView$LayoutParams.leftMargin>
	//   14   29:iadd            
	//   15   30:iload_3         
	//   16   31:aload           7
	//   17   33:getfield        #319 <Field int Rect.top>
	//   18   36:iadd            
	//   19   37:aload           6
	//   20   39:getfield        #524 <Field int RecyclerView$LayoutParams.topMargin>
	//   21   42:iadd            
	//   22   43:iload           4
	//   23   45:aload           7
	//   24   47:getfield        #344 <Field int Rect.right>
	//   25   50:isub            
	//   26   51:aload           6
	//   27   53:getfield        #516 <Field int RecyclerView$LayoutParams.rightMargin>
	//   28   56:isub            
	//   29   57:iload           5
	//   30   59:aload           7
	//   31   61:getfield        #347 <Field int Rect.bottom>
	//   32   64:isub            
	//   33   65:aload           6
	//   34   67:getfield        #527 <Field int RecyclerView$LayoutParams.bottomMargin>
	//   35   70:isub            
	//   36   71:invokevirtual   #541 <Method void View.layout(int, int, int, int)>
	//   37   74:return          
	}

	public void a(View view, int i1, youtParams youtparams)
	{
		RecyclerView$u recyclerview$u = RecyclerView.e(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #156 <Method RecyclerView$u RecyclerView.e(View)>
	//    2    4:astore          4
		if(recyclerview$u.q())
	//*   3    6:aload           4
	//*   4    8:invokevirtual   #166 <Method boolean RecyclerView$u.q()>
	//*   5   11:ifeq            29
			q.g.e(recyclerview$u);
	//    6   14:aload_0         
	//    7   15:getfield        #168 <Field RecyclerView q>
	//    8   18:getfield        #191 <Field bc RecyclerView.g>
	//    9   21:aload           4
	//   10   23:invokevirtual   #202 <Method void bc.e(RecyclerView$u)>
		else
	//*  11   26:goto            41
			q.g.f(recyclerview$u);
	//   12   29:aload_0         
	//   13   30:getfield        #168 <Field RecyclerView q>
	//   14   33:getfield        #191 <Field bc RecyclerView.g>
	//   15   36:aload           4
	//   16   38:invokevirtual   #200 <Method void bc.f(RecyclerView$u)>
		p.a(view, i1, ((android.view.tParams) (youtparams)), recyclerview$u.q());
	//   17   41:aload_0         
	//   18   42:getfield        #143 <Field t p>
	//   19   45:aload_1         
	//   20   46:iload_2         
	//   21   47:aload_3         
	//   22   48:aload           4
	//   23   50:invokevirtual   #166 <Method boolean RecyclerView$u.q()>
	//   24   53:invokevirtual   #276 <Method void t.a(View, int, android.view.ViewGroup$LayoutParams, boolean)>
	//   25   56:return          
	}

	public void a(View view, Rect rect)
	{
		android.support.v7.widget.RecyclerView.b(view, rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #544 <Method void android.support.v7.widget.RecyclerView.b(View, Rect)>
	//    3    5:return          
	}

	void a(View view, android.support.v4.view.a.b b1)
	{
		RecyclerView$u recyclerview$u = RecyclerView.e(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #156 <Method RecyclerView$u RecyclerView.e(View)>
	//    2    4:astore_3        
		if(recyclerview$u != null && !recyclerview$u.q() && !p.c(recyclerview$u.a))
	//*   3    5:aload_3         
	//*   4    6:ifnull          50
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #166 <Method boolean RecyclerView$u.q()>
	//*   7   13:ifne            50
	//*   8   16:aload_0         
	//*   9   17:getfield        #143 <Field t p>
	//*  10   20:aload_3         
	//*  11   21:getfield        #281 <Field View RecyclerView$u.a>
	//*  12   24:invokevirtual   #360 <Method boolean t.c(View)>
	//*  13   27:ifne            50
			a(q.d, q.B, view, b1);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #168 <Field RecyclerView q>
	//   17   35:getfield        #426 <Field RecyclerView$n RecyclerView.d>
	//   18   38:aload_0         
	//   19   39:getfield        #168 <Field RecyclerView q>
	//   20   42:getfield        #429 <Field RecyclerView$r RecyclerView.B>
	//   21   45:aload_1         
	//   22   46:aload_2         
	//   23   47:invokevirtual   #547 <Method void a(RecyclerView$n, RecyclerView$r, View, b)>
	//   24   50:return          
	}

	public void a(View view, RecyclerView$n recyclerview$n)
	{
		c(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #549 <Method void c(View)>
		recyclerview$n.a(view);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #412 <Method void RecyclerView$n.a(View)>
	//    6   10:return          
	}

	public void a(View view, boolean flag, Rect rect)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            55
		{
			Rect rect1 = ((youtParams)view.getLayoutParams()).d;
	//    2    4:aload_1         
	//    3    5:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    4    8:checkcast       #210 <Class RecyclerView$LayoutParams>
	//    5   11:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
	//    6   14:astore          4
			rect.set(-rect1.left, -rect1.top, view.getWidth() + rect1.right, view.getHeight() + rect1.bottom);
	//    7   16:aload_3         
	//    8   17:aload           4
	//    9   19:getfield        #310 <Field int Rect.left>
	//   10   22:ineg            
	//   11   23:aload           4
	//   12   25:getfield        #319 <Field int Rect.top>
	//   13   28:ineg            
	//   14   29:aload_1         
	//   15   30:invokevirtual   #553 <Method int View.getWidth()>
	//   16   33:aload           4
	//   17   35:getfield        #344 <Field int Rect.right>
	//   18   38:iadd            
	//   19   39:aload_1         
	//   20   40:invokevirtual   #556 <Method int View.getHeight()>
	//   21   43:aload           4
	//   22   45:getfield        #347 <Field int Rect.bottom>
	//   23   48:iadd            
	//   24   49:invokevirtual   #559 <Method void Rect.set(int, int, int, int)>
		} else
	//*  25   52:goto            69
		{
			rect.set(0, 0, view.getWidth(), view.getHeight());
	//   26   55:aload_3         
	//   27   56:iconst_0        
	//   28   57:iconst_0        
	//   29   58:aload_1         
	//   30   59:invokevirtual   #553 <Method int View.getWidth()>
	//   31   62:aload_1         
	//   32   63:invokevirtual   #556 <Method int View.getHeight()>
	//   33   66:invokevirtual   #559 <Method void Rect.set(int, int, int, int)>
		}
		if(q != null)
	//*  34   69:aload_0         
	//*  35   70:getfield        #168 <Field RecyclerView q>
	//*  36   73:ifnull          162
		{
			Matrix matrix = view.getMatrix();
	//   37   76:aload_1         
	//   38   77:invokevirtual   #563 <Method Matrix View.getMatrix()>
	//   39   80:astore          4
			if(matrix != null && !matrix.isIdentity())
	//*  40   82:aload           4
	//*  41   84:ifnull          162
	//*  42   87:aload           4
	//*  43   89:invokevirtual   #568 <Method boolean Matrix.isIdentity()>
	//*  44   92:ifne            162
			{
				RectF rectf = q.k;
	//   45   95:aload_0         
	//   46   96:getfield        #168 <Field RecyclerView q>
	//   47   99:getfield        #571 <Field RectF RecyclerView.k>
	//   48  102:astore          5
				rectf.set(rect);
	//   49  104:aload           5
	//   50  106:aload_3         
	//   51  107:invokevirtual   #576 <Method void RectF.set(Rect)>
				matrix.mapRect(rectf);
	//   52  110:aload           4
	//   53  112:aload           5
	//   54  114:invokevirtual   #580 <Method boolean Matrix.mapRect(RectF)>
	//   55  117:pop             
				rect.set((int)Math.floor(rectf.left), (int)Math.floor(rectf.top), (int)Math.ceil(rectf.right), (int)Math.ceil(rectf.bottom));
	//   56  118:aload_3         
	//   57  119:aload           5
	//   58  121:getfield        #582 <Field float RectF.left>
	//   59  124:f2d             
	//   60  125:invokestatic    #586 <Method double Math.floor(double)>
	//   61  128:d2i             
	//   62  129:aload           5
	//   63  131:getfield        #588 <Field float RectF.top>
	//   64  134:f2d             
	//   65  135:invokestatic    #586 <Method double Math.floor(double)>
	//   66  138:d2i             
	//   67  139:aload           5
	//   68  141:getfield        #590 <Field float RectF.right>
	//   69  144:f2d             
	//   70  145:invokestatic    #593 <Method double Math.ceil(double)>
	//   71  148:d2i             
	//   72  149:aload           5
	//   73  151:getfield        #595 <Field float RectF.bottom>
	//   74  154:f2d             
	//   75  155:invokestatic    #593 <Method double Math.ceil(double)>
	//   76  158:d2i             
	//   77  159:invokevirtual   #559 <Method void Rect.set(int, int, int, int)>
			}
		}
		rect.offset(view.getLeft(), view.getTop());
	//   78  162:aload_3         
	//   79  163:aload_1         
	//   80  164:invokevirtual   #305 <Method int View.getLeft()>
	//   81  167:aload_1         
	//   82  168:invokevirtual   #316 <Method int View.getTop()>
	//   83  171:invokevirtual   #598 <Method void Rect.offset(int, int)>
	//   84  174:return          
	}

	public void a(AccessibilityEvent accessibilityevent)
	{
		a(q.d, q.B, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #168 <Field RecyclerView q>
	//    3    5:getfield        #426 <Field RecyclerView$n RecyclerView.d>
	//    4    8:aload_0         
	//    5    9:getfield        #168 <Field RecyclerView q>
	//    6   12:getfield        #429 <Field RecyclerView$r RecyclerView.B>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #601 <Method void a(RecyclerView$n, RecyclerView$r, AccessibilityEvent)>
	//    9   19:return          
	}

	public void a(String s1)
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:ifnull          15
			q.a(s1);
	//    3    7:aload_0         
	//    4    8:getfield        #168 <Field RecyclerView q>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #603 <Method void RecyclerView.a(String)>
	//    7   15:return          
	}

	boolean a(int i1, Bundle bundle)
	{
		return a(q.d, q.B, i1, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #168 <Field RecyclerView q>
	//    3    5:getfield        #426 <Field RecyclerView$n RecyclerView.d>
	//    4    8:aload_0         
	//    5    9:getfield        #168 <Field RecyclerView q>
	//    6   12:getfield        #429 <Field RecyclerView$r RecyclerView.B>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #607 <Method boolean a(RecyclerView$n, RecyclerView$r, int, Bundle)>
	//   10   20:ireturn         
	}

	public boolean a(youtParams youtparams)
	{
		return youtparams != null;
	//    0    0:aload_1         
	//    1    1:ifnull          6
	//    2    4:iconst_1        
	//    3    5:ireturn         
	//    4    6:iconst_0        
	//    5    7:ireturn         
	}

	public boolean a(RecyclerView$n recyclerview$n, RecyclerView$r recyclerview$r, int i1, Bundle bundle)
	{
		if(q == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(i1 == 4096) goto _L2; else goto _L1
	//    5    9:iload_3         
	//    6   10:sipush          4096
	//    7   13:icmpeq          102
_L1:
		if(i1 == 8192) goto _L4; else goto _L3
	//    8   16:iload_3         
	//    9   17:sipush          8192
	//   10   20:icmpeq          31
_L3:
		i1 = 0;
	//   11   23:iconst_0        
	//   12   24:istore_3        
_L6:
		int l1;
		l1 = 0;
	//   13   25:iconst_0        
	//   14   26:istore          6
		break; /* Loop/switch isn't completed */
	//   15   28:goto            168
_L4:
		int j1;
		if(q.canScrollVertically(-1))
	//*  16   31:aload_0         
	//*  17   32:getfield        #168 <Field RecyclerView q>
	//*  18   35:iconst_m1       
	//*  19   36:invokevirtual   #443 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  20   39:ifeq            62
			j1 = -(y() - A() - C());
	//   21   42:aload_0         
	//   22   43:invokevirtual   #299 <Method int y()>
	//   23   46:aload_0         
	//   24   47:invokevirtual   #292 <Method int A()>
	//   25   50:isub            
	//   26   51:aload_0         
	//   27   52:invokevirtual   #302 <Method int C()>
	//   28   55:isub            
	//   29   56:ineg            
	//   30   57:istore          5
		else
	//*  31   59:goto            65
			j1 = 0;
	//   32   62:iconst_0        
	//   33   63:istore          5
		i1 = j1;
	//   34   65:iload           5
	//   35   67:istore_3        
		if(!q.canScrollHorizontally(-1))
			continue; /* Loop/switch isn't completed */
	//   36   68:aload_0         
	//   37   69:getfield        #168 <Field RecyclerView q>
	//   38   72:iconst_m1       
	//   39   73:invokevirtual   #446 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//   40   76:ifeq            25
		l1 = -(x() - z() - B());
	//   41   79:aload_0         
	//   42   80:invokevirtual   #294 <Method int x()>
	//   43   83:aload_0         
	//   44   84:invokevirtual   #289 <Method int z()>
	//   45   87:isub            
	//   46   88:aload_0         
	//   47   89:invokevirtual   #297 <Method int B()>
	//   48   92:isub            
	//   49   93:ineg            
	//   50   94:istore          6
		i1 = j1;
	//   51   96:iload           5
	//   52   98:istore_3        
		break; /* Loop/switch isn't completed */
	//   53   99:goto            168
_L2:
		int k1;
		if(q.canScrollVertically(1))
	//*  54  102:aload_0         
	//*  55  103:getfield        #168 <Field RecyclerView q>
	//*  56  106:iconst_1        
	//*  57  107:invokevirtual   #443 <Method boolean RecyclerView.canScrollVertically(int)>
	//*  58  110:ifeq            132
			k1 = y() - A() - C();
	//   59  113:aload_0         
	//   60  114:invokevirtual   #299 <Method int y()>
	//   61  117:aload_0         
	//   62  118:invokevirtual   #292 <Method int A()>
	//   63  121:isub            
	//   64  122:aload_0         
	//   65  123:invokevirtual   #302 <Method int C()>
	//   66  126:isub            
	//   67  127:istore          5
		else
	//*  68  129:goto            135
			k1 = 0;
	//   69  132:iconst_0        
	//   70  133:istore          5
		i1 = k1;
	//   71  135:iload           5
	//   72  137:istore_3        
		if(!q.canScrollHorizontally(1))
			continue; /* Loop/switch isn't completed */
	//   73  138:aload_0         
	//   74  139:getfield        #168 <Field RecyclerView q>
	//   75  142:iconst_1        
	//   76  143:invokevirtual   #446 <Method boolean RecyclerView.canScrollHorizontally(int)>
	//   77  146:ifeq            25
		l1 = x() - z() - B();
	//   78  149:aload_0         
	//   79  150:invokevirtual   #294 <Method int x()>
	//   80  153:aload_0         
	//   81  154:invokevirtual   #289 <Method int z()>
	//   82  157:isub            
	//   83  158:aload_0         
	//   84  159:invokevirtual   #297 <Method int B()>
	//   85  162:isub            
	//   86  163:istore          6
		i1 = k1;
	//   87  165:iload           5
	//   88  167:istore_3        
		break; /* Loop/switch isn't completed */
		if(true) goto _L6; else goto _L5
_L5:
		if(i1 == 0 && l1 == 0)
	//*  89  168:iload_3         
	//*  90  169:ifne            179
	//*  91  172:iload           6
	//*  92  174:ifne            179
		{
			return false;
	//   93  177:iconst_0        
	//   94  178:ireturn         
		} else
		{
			q.scrollBy(l1, i1);
	//   95  179:aload_0         
	//   96  180:getfield        #168 <Field RecyclerView q>
	//   97  183:iload           6
	//   98  185:iload_3         
	//   99  186:invokevirtual   #611 <Method void RecyclerView.scrollBy(int, int)>
			return true;
	//  100  189:iconst_1        
	//  101  190:ireturn         
		}
	}

	public boolean a(RecyclerView$n recyclerview$n, RecyclerView$r recyclerview$r, View view, int i1, Bundle bundle)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(RecyclerView recyclerview, RecyclerView$r recyclerview$r, View view, View view1)
	{
		return a(recyclerview, view, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokevirtual   #616 <Method boolean a(RecyclerView, View, View)>
	//    5    8:ireturn         
	}

	public boolean a(RecyclerView recyclerview, View view, Rect rect, boolean flag)
	{
		return a(recyclerview, view, rect, flag, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iconst_0        
	//    6    7:invokevirtual   #620 <Method boolean a(RecyclerView, View, Rect, boolean, boolean)>
	//    7   10:ireturn         
	}

	public boolean a(RecyclerView recyclerview, View view, Rect rect, boolean flag, boolean flag1)
	{
		view = ((View) (b(recyclerview, view, rect, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #622 <Method int[] b(RecyclerView, View, Rect, boolean)>
	//    6    9:astore_2        
		int i1 = view[0];
	//    7   10:aload_2         
	//    8   11:iconst_0        
	//    9   12:iaload          
	//   10   13:istore          6
		int j1 = view[1];
	//   11   15:aload_2         
	//   12   16:iconst_1        
	//   13   17:iaload          
	//   14   18:istore          7
		if(flag1 && !d(recyclerview, i1, j1) || i1 == 0 && j1 == 0)
	//*  15   20:iload           5
	//*  16   22:ifeq            37
	//*  17   25:aload_0         
	//*  18   26:aload_1         
	//*  19   27:iload           6
	//*  20   29:iload           7
	//*  21   31:invokespecial   #624 <Method boolean d(RecyclerView, int, int)>
	//*  22   34:ifeq            50
	//*  23   37:iload           6
	//*  24   39:ifne            52
	//*  25   42:iload           7
	//*  26   44:ifeq            50
	//*  27   47:goto            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		if(flag)
	//*  30   52:iload           4
	//*  31   54:ifeq            67
		{
			recyclerview.scrollBy(i1, j1);
	//   32   57:aload_1         
	//   33   58:iload           6
	//   34   60:iload           7
	//   35   62:invokevirtual   #611 <Method void RecyclerView.scrollBy(int, int)>
			return true;
	//   36   65:iconst_1        
	//   37   66:ireturn         
		} else
		{
			recyclerview.a(i1, j1);
	//   38   67:aload_1         
	//   39   68:iload           6
	//   40   70:iload           7
	//   41   72:invokevirtual   #626 <Method void RecyclerView.a(int, int)>
			return true;
	//   42   75:iconst_1        
	//   43   76:ireturn         
		}
	}

	public boolean a(RecyclerView recyclerview, View view, View view1)
	{
		return r() || recyclerview.o();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #629 <Method boolean r()>
	//    2    4:ifne            19
	//    3    7:aload_1         
	//    4    8:invokevirtual   #632 <Method boolean RecyclerView.o()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public boolean a(RecyclerView recyclerview, ArrayList arraylist, int i1, int j1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	boolean a(View view, int i1, int j1, youtParams youtparams)
	{
		return !c || !b(view.getMeasuredWidth(), i1, youtparams.width) || !b(view.getMeasuredHeight(), j1, youtparams.height);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field boolean c>
	//    2    4:ifeq            44
	//    3    7:aload_1         
	//    4    8:invokevirtual   #639 <Method int View.getMeasuredWidth()>
	//    5   11:iload_2         
	//    6   12:aload           4
	//    7   14:getfield        #517 <Field int RecyclerView$LayoutParams.width>
	//    8   17:invokestatic    #641 <Method boolean b(int, int, int)>
	//    9   20:ifeq            44
	//   10   23:aload_1         
	//   11   24:invokevirtual   #644 <Method int View.getMeasuredHeight()>
	//   12   27:iload_3         
	//   13   28:aload           4
	//   14   30:getfield        #528 <Field int RecyclerView$LayoutParams.height>
	//   15   33:invokestatic    #641 <Method boolean b(int, int, int)>
	//   16   36:ifne            42
	//   17   39:goto            44
	//   18   42:iconst_0        
	//   19   43:ireturn         
	//   20   44:iconst_1        
	//   21   45:ireturn         
	}

	boolean a(View view, int i1, Bundle bundle)
	{
		return a(q.d, q.B, view, i1, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #168 <Field RecyclerView q>
	//    3    5:getfield        #426 <Field RecyclerView$n RecyclerView.d>
	//    4    8:aload_0         
	//    5    9:getfield        #168 <Field RecyclerView q>
	//    6   12:getfield        #429 <Field RecyclerView$r RecyclerView.B>
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #647 <Method boolean a(RecyclerView$n, RecyclerView$r, View, int, Bundle)>
	//   11   21:ireturn         
	}

	public boolean a(View view, boolean flag, boolean flag1)
	{
		if(r.a(view, 24579) && s.a(view, 24579))
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field bb r>
	//*   2    4:aload_1         
	//*   3    5:sipush          24579
	//*   4    8:invokevirtual   #651 <Method boolean bb.a(View, int)>
	//*   5   11:ifeq            33
	//*   6   14:aload_0         
	//*   7   15:getfield        #60  <Field bb s>
	//*   8   18:aload_1         
	//*   9   19:sipush          24579
	//*  10   22:invokevirtual   #651 <Method boolean bb.a(View, int)>
	//*  11   25:ifeq            33
			flag1 = true;
	//   12   28:iconst_1        
	//   13   29:istore_3        
		else
	//*  14   30:goto            35
			flag1 = false;
	//   15   33:iconst_0        
	//   16   34:istore_3        
		if(flag)
	//*  17   35:iload_2         
	//*  18   36:ifeq            41
			return flag1;
	//   19   39:iload_3         
	//   20   40:ireturn         
		else
			return flag1 ^ true;
	//   21   41:iload_3         
	//   22   42:iconst_1        
	//   23   43:ixor            
	//   24   44:ireturn         
	}

	public boolean a(Runnable runnable)
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:ifnull          16
			return q.removeCallbacks(runnable);
	//    3    7:aload_0         
	//    4    8:getfield        #168 <Field RecyclerView q>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #655 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//    7   15:ireturn         
		else
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public int b(int i1, RecyclerView$n recyclerview$n, RecyclerView$r recyclerview$r)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int b(RecyclerView$n recyclerview$n, RecyclerView$r recyclerview$r)
	{
		recyclerview$n = ((RecyclerView$n) (q));
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field RecyclerView q>
	//    2    4:astore_1        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore          4
		int i1 = ((int) (flag));
	//    5    8:iload           4
	//    6   10:istore_3        
		if(recyclerview$n != null)
	//*   7   11:aload_1         
	//*   8   12:ifnull          48
		{
			if(q.l == null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #168 <Field RecyclerView q>
	//*  11   19:getfield        #172 <Field RecyclerView$a RecyclerView.l>
	//*  12   22:ifnonnull       27
				return 1;
	//   13   25:iconst_1        
	//   14   26:ireturn         
			i1 = ((int) (flag));
	//   15   27:iload           4
	//   16   29:istore_3        
			if(d())
	//*  17   30:aload_0         
	//*  18   31:invokevirtual   #474 <Method boolean d()>
	//*  19   34:ifeq            48
				i1 = q.l.a();
	//   20   37:aload_0         
	//   21   38:getfield        #168 <Field RecyclerView q>
	//   22   41:getfield        #172 <Field RecyclerView$a RecyclerView.l>
	//   23   44:invokevirtual   #389 <Method int RecyclerView$a.a()>
	//   24   47:istore_3        
		}
		return i1;
	//   25   48:iload_3         
	//   26   49:ireturn         
	}

	void b(RecyclerView$n recyclerview$n)
	{
		int j1 = recyclerview$n.e();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #657 <Method int RecyclerView$n.e()>
	//    2    4:istore_3        
		for(int i1 = j1 - 1; i1 >= 0; i1--)
	//*   3    5:iload_3         
	//*   4    6:iconst_1        
	//*   5    7:isub            
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:iflt            103
		{
			View view = recyclerview$n.e(i1);
	//    9   13:aload_1         
	//   10   14:iload_2         
	//   11   15:invokevirtual   #659 <Method View RecyclerView$n.e(int)>
	//   12   18:astore          4
			RecyclerView$u recyclerview$u = RecyclerView.e(view);
	//   13   20:aload           4
	//   14   22:invokestatic    #156 <Method RecyclerView$u RecyclerView.e(View)>
	//   15   25:astore          5
			if(recyclerview$u.c())
	//*  16   27:aload           5
	//*  17   29:invokevirtual   #161 <Method boolean RecyclerView$u.c()>
	//*  18   32:ifeq            38
				continue;
	//   19   35:goto            96
			recyclerview$u.a(false);
	//   20   38:aload           5
	//   21   40:iconst_0        
	//   22   41:invokevirtual   #661 <Method void RecyclerView$u.a(boolean)>
			if(recyclerview$u.r())
	//*  23   44:aload           5
	//*  24   46:invokevirtual   #662 <Method boolean RecyclerView$u.r()>
	//*  25   49:ifeq            62
				q.removeDetachedView(view, false);
	//   26   52:aload_0         
	//   27   53:getfield        #168 <Field RecyclerView q>
	//   28   56:aload           4
	//   29   58:iconst_0        
	//   30   59:invokevirtual   #666 <Method void RecyclerView.removeDetachedView(View, boolean)>
			if(q.x != null)
	//*  31   62:aload_0         
	//*  32   63:getfield        #168 <Field RecyclerView q>
	//*  33   66:getfield        #669 <Field RecyclerView$e RecyclerView.x>
	//*  34   69:ifnull          84
				q.x.d(recyclerview$u);
	//   35   72:aload_0         
	//   36   73:getfield        #168 <Field RecyclerView q>
	//   37   76:getfield        #669 <Field RecyclerView$e RecyclerView.x>
	//   38   79:aload           5
	//   39   81:invokevirtual   #673 <Method void RecyclerView$e.d(RecyclerView$u)>
			recyclerview$u.a(true);
	//   40   84:aload           5
	//   41   86:iconst_1        
	//   42   87:invokevirtual   #661 <Method void RecyclerView$u.a(boolean)>
			recyclerview$n.b(view);
	//   43   90:aload_1         
	//   44   91:aload           4
	//   45   93:invokevirtual   #674 <Method void android.support.v7.widget.RecyclerView$n.b(View)>
		}

	//   46   96:iload_2         
	//   47   97:iconst_1        
	//   48   98:isub            
	//   49   99:istore_2        
	//*  50  100:goto            9
		recyclerview$n.f();
	//   51  103:aload_1         
	//   52  104:invokevirtual   #676 <Method void RecyclerView$n.f()>
		if(j1 > 0)
	//*  53  107:iload_3         
	//*  54  108:ifle            118
			q.invalidate();
	//   55  111:aload_0         
	//   56  112:getfield        #168 <Field RecyclerView q>
	//   57  115:invokevirtual   #677 <Method void RecyclerView.invalidate()>
	//   58  118:return          
	}

	void b(RecyclerView recyclerview)
	{
		int i1;
		if(recyclerview == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       29
		{
			q = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #168 <Field RecyclerView q>
			p = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #143 <Field t p>
			i1 = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
			g = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #679 <Field int g>
		} else
	//*  13   21:aload_0         
	//*  14   22:iload_2         
	//*  15   23:putfield        #681 <Field int h>
	//*  16   26:goto            58
		{
			q = recyclerview;
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #168 <Field RecyclerView q>
			p = recyclerview.f;
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:getfield        #683 <Field t RecyclerView.f>
	//   23   39:putfield        #143 <Field t p>
			g = recyclerview.getWidth();
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:invokevirtual   #684 <Method int RecyclerView.getWidth()>
	//   27   47:putfield        #679 <Field int g>
			i1 = recyclerview.getHeight();
	//   28   50:aload_1         
	//   29   51:invokevirtual   #685 <Method int RecyclerView.getHeight()>
	//   30   54:istore_2        
		}
		h = i1;
	//*  31   55:goto            21
		e = 0x40000000;
	//   32   58:aload_0         
	//   33   59:ldc1            #83  <Int 0x40000000>
	//   34   61:putfield        #687 <Field int e>
		f = 0x40000000;
	//   35   64:aload_0         
	//   36   65:ldc1            #83  <Int 0x40000000>
	//   37   67:putfield        #689 <Field int f>
	//   38   70:return          
	}

	public void b(RecyclerView recyclerview, int i1, int j1)
	{
	//    0    0:return          
	}

	void b(RecyclerView recyclerview, RecyclerView$n recyclerview$n)
	{
		v = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #64  <Field boolean v>
		a(recyclerview, recyclerview$n);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #691 <Method void a(RecyclerView, RecyclerView$n)>
	//    7   11:return          
	}

	public void b(View view)
	{
		b(view, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #693 <Method void b(View, int)>
	//    4    6:return          
	}

	public void b(View view, int i1)
	{
		a(view, i1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #504 <Method void a(View, int, boolean)>
	//    5    7:return          
	}

	public void b(View view, Rect rect)
	{
		if(q == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:ifnonnull       16
		{
			rect.set(0, 0, 0, 0);
	//    3    7:aload_2         
	//    4    8:iconst_0        
	//    5    9:iconst_0        
	//    6   10:iconst_0        
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #559 <Method void Rect.set(int, int, int, int)>
			return;
	//    9   15:return          
		} else
		{
			rect.set(q.i(view));
	//   10   16:aload_2         
	//   11   17:aload_0         
	//   12   18:getfield        #168 <Field RecyclerView q>
	//   13   21:aload_1         
	//   14   22:invokevirtual   #508 <Method Rect RecyclerView.i(View)>
	//   15   25:invokevirtual   #694 <Method void Rect.set(Rect)>
			return;
	//   16   28:return          
		}
	}

	public boolean b()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	boolean b(View view, int i1, int j1, youtParams youtparams)
	{
		return view.isLayoutRequested() || !c || !b(view.getWidth(), i1, youtparams.width) || !b(view.getHeight(), j1, youtparams.height);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #697 <Method boolean View.isLayoutRequested()>
	//    2    4:ifne            51
	//    3    7:aload_0         
	//    4    8:getfield        #68  <Field boolean c>
	//    5   11:ifeq            51
	//    6   14:aload_1         
	//    7   15:invokevirtual   #553 <Method int View.getWidth()>
	//    8   18:iload_2         
	//    9   19:aload           4
	//   10   21:getfield        #517 <Field int RecyclerView$LayoutParams.width>
	//   11   24:invokestatic    #641 <Method boolean b(int, int, int)>
	//   12   27:ifeq            51
	//   13   30:aload_1         
	//   14   31:invokevirtual   #556 <Method int View.getHeight()>
	//   15   34:iload_3         
	//   16   35:aload           4
	//   17   37:getfield        #528 <Field int RecyclerView$LayoutParams.height>
	//   18   40:invokestatic    #641 <Method boolean b(int, int, int)>
	//   19   43:ifne            49
	//   20   46:goto            51
	//   21   49:iconst_0        
	//   22   50:ireturn         
	//   23   51:iconst_1        
	//   24   52:ireturn         
	}

	public int c(RecyclerView$r recyclerview$r)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Parcelable c()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public View c(int i1)
	{
		int k1 = u();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #374 <Method int u()>
	//    2    4:istore_3        
		for(int j1 = 0; j1 < k1; j1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          82
		{
			View view = h(j1);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #377 <Method View h(int)>
	//   11   17:astore          4
			RecyclerView$u recyclerview$u = RecyclerView.e(view);
	//   12   19:aload           4
	//   13   21:invokestatic    #156 <Method RecyclerView$u RecyclerView.e(View)>
	//   14   24:astore          5
			if(recyclerview$u != null && recyclerview$u.d() == i1 && !recyclerview$u.c() && (q.B.a() || !recyclerview$u.q()))
	//*  15   26:aload           5
	//*  16   28:ifnonnull       34
	//*  17   31:goto            75
	//*  18   34:aload           5
	//*  19   36:invokevirtual   #701 <Method int RecyclerView$u.d()>
	//*  20   39:iload_1         
	//*  21   40:icmpne          75
	//*  22   43:aload           5
	//*  23   45:invokevirtual   #161 <Method boolean RecyclerView$u.c()>
	//*  24   48:ifne            75
	//*  25   51:aload_0         
	//*  26   52:getfield        #168 <Field RecyclerView q>
	//*  27   55:getfield        #429 <Field RecyclerView$r RecyclerView.B>
	//*  28   58:invokevirtual   #705 <Method boolean RecyclerView$r.a()>
	//*  29   61:ifne            72
	//*  30   64:aload           5
	//*  31   66:invokevirtual   #166 <Method boolean RecyclerView$u.q()>
	//*  32   69:ifne            75
				return view;
	//   33   72:aload           4
	//   34   74:areturn         
		}

	//   35   75:iload_2         
	//   36   76:iconst_1        
	//   37   77:iadd            
	//   38   78:istore_2        
	//*  39   79:goto            7
		return null;
	//   40   82:aconst_null     
	//   41   83:areturn         
	}

	public void c(RecyclerView$n recyclerview$n)
	{
		for(int i1 = u() - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #374 <Method int u()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            38
			if(!RecyclerView.e(h(i1)).c())
	//*   7   11:aload_0         
	//*   8   12:iload_2         
	//*   9   13:invokevirtual   #377 <Method View h(int)>
	//*  10   16:invokestatic    #156 <Method RecyclerView$u RecyclerView.e(View)>
	//*  11   19:invokevirtual   #161 <Method boolean RecyclerView$u.c()>
	//*  12   22:ifne            31
				a(i1, recyclerview$n);
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #707 <Method void a(int, RecyclerView$n)>

	//   17   31:iload_2         
	//   18   32:iconst_1        
	//   19   33:isub            
	//   20   34:istore_2        
	//*  21   35:goto            7
	//   22   38:return          
	}

	public void c(RecyclerView$n recyclerview$n, RecyclerView$r recyclerview$r)
	{
		Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
	//    0    0:ldc2            #709 <String "RecyclerView">
	//    1    3:ldc2            #711 <String "You must override onLayoutChildren(Recycler recycler, State state) ">
	//    2    6:invokestatic    #716 <Method int Log.e(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	void c(RecyclerView recyclerview)
	{
		v = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #64  <Field boolean v>
		d(recyclerview);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #718 <Method void d(RecyclerView)>
	//    6   10:return          
	}

	public void c(RecyclerView recyclerview, int i1, int j1)
	{
	//    0    0:return          
	}

	public void c(View view)
	{
		p.a(view);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field t p>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #719 <Method void t.a(View)>
	//    4    8:return          
	}

	public void c(View view, int i1)
	{
		a(view, i1, (youtParams)view.getLayoutParams());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    5    7:checkcast       #210 <Class RecyclerView$LayoutParams>
	//    6   10:invokevirtual   #721 <Method void a(View, int, RecyclerView$LayoutParams)>
	//    7   13:return          
	}

	public void c(boolean flag)
	{
		w = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #66  <Field boolean w>
	//    3    5:return          
	}

	public int d(RecyclerView$n recyclerview$n, RecyclerView$r recyclerview$r)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int d(RecyclerView$r recyclerview$r)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int d(View view)
	{
		return ((youtParams)view.getLayoutParams()).f();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
	//    3    7:invokevirtual   #723 <Method int RecyclerView$LayoutParams.f()>
	//    4   10:ireturn         
	}

	public View d(View view, int i1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void d(int i1)
	{
	//    0    0:return          
	}

	void d(int i1, int j1)
	{
		g = android.view.c.getSize(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #81  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    3    5:putfield        #679 <Field int g>
		e = android.view.c.getMode(i1);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokestatic    #78  <Method int android.view.View$MeasureSpec.getMode(int)>
	//    7   13:putfield        #687 <Field int e>
		if(e == 0 && !android.support.v7.widget.RecyclerView.b)
	//*   8   16:aload_0         
	//*   9   17:getfield        #687 <Field int e>
	//*  10   20:ifne            34
	//*  11   23:getstatic       #726 <Field boolean android.support.v7.widget.RecyclerView.b>
	//*  12   26:ifne            34
			g = 0;
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:putfield        #679 <Field int g>
		h = android.view.c.getSize(j1);
	//   16   34:aload_0         
	//   17   35:iload_2         
	//   18   36:invokestatic    #81  <Method int android.view.View$MeasureSpec.getSize(int)>
	//   19   39:putfield        #681 <Field int h>
		f = android.view.c.getMode(j1);
	//   20   42:aload_0         
	//   21   43:iload_2         
	//   22   44:invokestatic    #78  <Method int android.view.View$MeasureSpec.getMode(int)>
	//   23   47:putfield        #689 <Field int f>
		if(f == 0 && !android.support.v7.widget.RecyclerView.b)
	//*  24   50:aload_0         
	//*  25   51:getfield        #689 <Field int f>
	//*  26   54:ifne            68
	//*  27   57:getstatic       #726 <Field boolean android.support.v7.widget.RecyclerView.b>
	//*  28   60:ifne            68
			h = 0;
	//   29   63:aload_0         
	//   30   64:iconst_0        
	//   31   65:putfield        #681 <Field int h>
	//   32   68:return          
	}

	public void d(RecyclerView recyclerview)
	{
	//    0    0:return          
	}

	public boolean d()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int e(RecyclerView$r recyclerview$r)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public View e(View view)
	{
		if(q == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		view = q.c(view);
	//    5    9:aload_0         
	//    6   10:getfield        #168 <Field RecyclerView q>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #729 <Method View RecyclerView.c(View)>
	//    9   17:astore_1        
		if(view == null)
	//*  10   18:aload_1         
	//*  11   19:ifnonnull       24
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		if(p.c(view))
	//*  14   24:aload_0         
	//*  15   25:getfield        #143 <Field t p>
	//*  16   28:aload_1         
	//*  17   29:invokevirtual   #360 <Method boolean t.c(View)>
	//*  18   32:ifeq            37
			return null;
	//   19   35:aconst_null     
	//   20   36:areturn         
		else
			return view;
	//   21   37:aload_1         
	//   22   38:areturn         
	}

	void e(int i1, int j1)
	{
		int k3 = u();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #374 <Method int u()>
	//    2    4:istore          11
		if(k3 == 0)
	//*   3    6:iload           11
	//*   4    8:ifne            21
		{
			q.e(i1, j1);
	//    5   11:aload_0         
	//    6   12:getfield        #168 <Field RecyclerView q>
	//    7   15:iload_1         
	//    8   16:iload_2         
	//    9   17:invokevirtual   #439 <Method void RecyclerView.e(int, int)>
			return;
	//   10   20:return          
		}
		int l1 = 0;
	//   11   21:iconst_0        
	//   12   22:istore          4
		int i3 = 0x7fffffff;
	//   13   24:ldc2            #730 <Int 0x7fffffff>
	//   14   27:istore          9
		int j2 = 0x7fffffff;
	//   15   29:ldc2            #730 <Int 0x7fffffff>
	//   16   32:istore          6
		int k2 = 0x80000000;
	//   17   34:ldc1            #82  <Int 0x80000000>
	//   18   36:istore          7
		int k1;
		int j3;
		for(k1 = 0x80000000; l1 < k3; k1 = j3)
	//*  19   38:ldc1            #82  <Int 0x80000000>
	//*  20   40:istore_3        
	//*  21   41:iload           4
	//*  22   43:iload           11
	//*  23   45:icmpge          179
		{
			View view = h(l1);
	//   24   48:aload_0         
	//   25   49:iload           4
	//   26   51:invokevirtual   #377 <Method View h(int)>
	//   27   54:astore          12
			Rect rect = q.j;
	//   28   56:aload_0         
	//   29   57:getfield        #168 <Field RecyclerView q>
	//   30   60:getfield        #338 <Field Rect RecyclerView.j>
	//   31   63:astore          13
			a(view, rect);
	//   32   65:aload_0         
	//   33   66:aload           12
	//   34   68:aload           13
	//   35   70:invokevirtual   #341 <Method void a(View, Rect)>
			int i2 = i3;
	//   36   73:iload           9
	//   37   75:istore          5
			if(rect.left < i3)
	//*  38   77:aload           13
	//*  39   79:getfield        #310 <Field int Rect.left>
	//*  40   82:iload           9
	//*  41   84:icmpge          94
				i2 = rect.left;
	//   42   87:aload           13
	//   43   89:getfield        #310 <Field int Rect.left>
	//   44   92:istore          5
			int l2 = k2;
	//   45   94:iload           7
	//   46   96:istore          8
			if(rect.right > k2)
	//*  47   98:aload           13
	//*  48  100:getfield        #344 <Field int Rect.right>
	//*  49  103:iload           7
	//*  50  105:icmple          115
				l2 = rect.right;
	//   51  108:aload           13
	//   52  110:getfield        #344 <Field int Rect.right>
	//   53  113:istore          8
			k2 = j2;
	//   54  115:iload           6
	//   55  117:istore          7
			if(rect.top < j2)
	//*  56  119:aload           13
	//*  57  121:getfield        #319 <Field int Rect.top>
	//*  58  124:iload           6
	//*  59  126:icmpge          136
				k2 = rect.top;
	//   60  129:aload           13
	//   61  131:getfield        #319 <Field int Rect.top>
	//   62  134:istore          7
			j3 = k1;
	//   63  136:iload_3         
	//   64  137:istore          10
			if(rect.bottom > k1)
	//*  65  139:aload           13
	//*  66  141:getfield        #347 <Field int Rect.bottom>
	//*  67  144:iload_3         
	//*  68  145:icmple          155
				j3 = rect.bottom;
	//   69  148:aload           13
	//   70  150:getfield        #347 <Field int Rect.bottom>
	//   71  153:istore          10
			l1++;
	//   72  155:iload           4
	//   73  157:iconst_1        
	//   74  158:iadd            
	//   75  159:istore          4
			j2 = k2;
	//   76  161:iload           7
	//   77  163:istore          6
			i3 = i2;
	//   78  165:iload           5
	//   79  167:istore          9
			k2 = l2;
	//   80  169:iload           8
	//   81  171:istore          7
		}

	//   82  173:iload           10
	//   83  175:istore_3        
	//*  84  176:goto            41
		q.j.set(i3, j2, k2, k1);
	//   85  179:aload_0         
	//   86  180:getfield        #168 <Field RecyclerView q>
	//   87  183:getfield        #338 <Field Rect RecyclerView.j>
	//   88  186:iload           9
	//   89  188:iload           6
	//   90  190:iload           7
	//   91  192:iload_3         
	//   92  193:invokevirtual   #559 <Method void Rect.set(int, int, int, int)>
		a(q.j, i1, j1);
	//   93  196:aload_0         
	//   94  197:aload_0         
	//   95  198:getfield        #168 <Field RecyclerView q>
	//   96  201:getfield        #338 <Field Rect RecyclerView.j>
	//   97  204:iload_1         
	//   98  205:iload_2         
	//   99  206:invokevirtual   #732 <Method void a(Rect, int, int)>
	//  100  209:return          
	}

	public void e(RecyclerView recyclerview)
	{
	//    0    0:return          
	}

	public boolean e()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean e(RecyclerView$n recyclerview$n, RecyclerView$r recyclerview$r)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int f(RecyclerView$r recyclerview$r)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int f(View view)
	{
		Rect rect = ((youtParams)view.getLayoutParams()).d;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
	//    4   10:astore_2        
		return view.getMeasuredWidth() + rect.left + rect.right;
	//    5   11:aload_1         
	//    6   12:invokevirtual   #639 <Method int View.getMeasuredWidth()>
	//    7   15:aload_2         
	//    8   16:getfield        #310 <Field int Rect.left>
	//    9   19:iadd            
	//   10   20:aload_2         
	//   11   21:getfield        #344 <Field int Rect.right>
	//   12   24:iadd            
	//   13   25:ireturn         
	}

	public void f(int i1)
	{
		if(h(i1) != null)
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokevirtual   #377 <Method View h(int)>
	//*   3    5:ifnull          16
			p.a(i1);
	//    4    8:aload_0         
	//    5    9:getfield        #143 <Field t p>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #733 <Method void t.a(int)>
	//    8   16:return          
	}

	public void f(int i1, int j1)
	{
		Object obj = ((Object) (h(i1)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #377 <Method View h(int)>
	//    3    5:astore_3        
		if(obj == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       56
		{
			obj = ((Object) (new StringBuilder()));
	//    6   10:new             #228 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #229 <Method void StringBuilder()>
	//    9   17:astore_3        
			((StringBuilder) (obj)).append("Cannot move a child from non-existing index:");
	//   10   18:aload_3         
	//   11   19:ldc2            #735 <String "Cannot move a child from non-existing index:">
	//   12   22:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
			((StringBuilder) (obj)).append(i1);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokevirtual   #241 <Method StringBuilder StringBuilder.append(int)>
	//   17   31:pop             
			((StringBuilder) (obj)).append(q.toString());
	//   18   32:aload_3         
	//   19   33:aload_0         
	//   20   34:getfield        #168 <Field RecyclerView q>
	//   21   37:invokevirtual   #736 <Method String RecyclerView.toString()>
	//   22   40:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   24   44:new             #738 <Class IllegalArgumentException>
	//   25   47:dup             
	//   26   48:aload_3         
	//   27   49:invokevirtual   #249 <Method String StringBuilder.toString()>
	//   28   52:invokespecial   #739 <Method void IllegalArgumentException(String)>
	//   29   55:athrow          
		} else
		{
			g(i1);
	//   30   56:aload_0         
	//   31   57:iload_1         
	//   32   58:invokevirtual   #185 <Method void g(int)>
			c(((View) (obj)), j1);
	//   33   61:aload_0         
	//   34   62:aload_3         
	//   35   63:iload_2         
	//   36   64:invokevirtual   #741 <Method void c(View, int)>
			return;
	//   37   67:return          
		}
	}

	void f(RecyclerView recyclerview)
	{
		d(android.view.c.makeMeasureSpec(recyclerview.getWidth(), 0x40000000), android.view.c.makeMeasureSpec(recyclerview.getHeight(), 0x40000000));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #684 <Method int RecyclerView.getWidth()>
	//    3    5:ldc1            #83  <Int 0x40000000>
	//    4    7:invokestatic    #96  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #685 <Method int RecyclerView.getHeight()>
	//    7   14:ldc1            #83  <Int 0x40000000>
	//    8   16:invokestatic    #96  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    9   19:invokevirtual   #743 <Method void d(int, int)>
	//   10   22:return          
	}

	public int g(RecyclerView$r recyclerview$r)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int g(View view)
	{
		Rect rect = ((youtParams)view.getLayoutParams()).d;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
	//    4   10:astore_2        
		return view.getMeasuredHeight() + rect.top + rect.bottom;
	//    5   11:aload_1         
	//    6   12:invokevirtual   #644 <Method int View.getMeasuredHeight()>
	//    7   15:aload_2         
	//    8   16:getfield        #319 <Field int Rect.top>
	//    9   19:iadd            
	//   10   20:aload_2         
	//   11   21:getfield        #347 <Field int Rect.bottom>
	//   12   24:iadd            
	//   13   25:ireturn         
	}

	public void g(int i1)
	{
		a(i1, h(i1));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokevirtual   #377 <Method View h(int)>
	//    5    7:invokespecial   #745 <Method void a(int, View)>
	//    6   10:return          
	}

	public void g(int i1, int j1)
	{
		RecyclerView.a(q, i1, j1);
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field RecyclerView q>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #747 <Method void RecyclerView.a(RecyclerView, int, int)>
	//    5    9:return          
	}

	public int h(RecyclerView$r recyclerview$r)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int h(View view)
	{
		return view.getLeft() - n(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #305 <Method int View.getLeft()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #749 <Method int n(View)>
	//    5    9:isub            
	//    6   10:ireturn         
	}

	public View h(int i1)
	{
		if(p != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field t p>
	//*   2    4:ifnull          16
			return p.b(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #143 <Field t p>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #751 <Method View android.support.v7.widget.t.b(int)>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	public int i(View view)
	{
		return view.getTop() - l(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #316 <Method int View.getTop()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #753 <Method int l(View)>
	//    5    9:isub            
	//    6   10:ireturn         
	}

	public void i(int i1)
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:ifnull          15
			q.e(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #168 <Field RecyclerView q>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #754 <Method void RecyclerView.e(int)>
	//    7   15:return          
	}

	public int j(View view)
	{
		return view.getRight() + o(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #757 <Method int View.getRight()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #759 <Method int o(View)>
	//    5    9:iadd            
	//    6   10:ireturn         
	}

	public void j(int i1)
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:ifnull          15
			q.d(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #168 <Field RecyclerView q>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #761 <Method void RecyclerView.d(int)>
	//    7   15:return          
	}

	public int k(View view)
	{
		return view.getBottom() + m(view);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #764 <Method int View.getBottom()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #766 <Method int m(View)>
	//    5    9:iadd            
	//    6   10:ireturn         
	}

	public void k(int i1)
	{
	//    0    0:return          
	}

	boolean k()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int l(View view)
	{
		return ((youtParams)view.getLayoutParams()).d.top;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
	//    4   10:getfield        #319 <Field int Rect.top>
	//    5   13:ireturn         
	}

	public int m(View view)
	{
		return ((youtParams)view.getLayoutParams()).d.bottom;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
	//    4   10:getfield        #347 <Field int Rect.bottom>
	//    5   13:ireturn         
	}

	public int n(View view)
	{
		return ((youtParams)view.getLayoutParams()).d.left;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
	//    4   10:getfield        #310 <Field int Rect.left>
	//    5   13:ireturn         
	}

	public void n()
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:ifnull          14
			q.requestLayout();
	//    3    7:aload_0         
	//    4    8:getfield        #168 <Field RecyclerView q>
	//    5   11:invokevirtual   #769 <Method void RecyclerView.requestLayout()>
	//    6   14:return          
	}

	public int o(View view)
	{
		return ((youtParams)view.getLayoutParams()).d.right;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #210 <Class RecyclerView$LayoutParams>
	//    3    7:getfield        #537 <Field Rect RecyclerView$LayoutParams.d>
	//    4   10:getfield        #344 <Field int Rect.right>
	//    5   13:ireturn         
	}

	public final boolean o()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean d>
	//    2    4:ireturn         
	}

	public boolean p()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean v>
	//    2    4:ireturn         
	}

	public boolean q()
	{
		return q != null && q.h;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field RecyclerView q>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #168 <Field RecyclerView q>
	//    5   11:getfield        #771 <Field boolean RecyclerView.h>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean r()
	{
		return t != null && t.c();
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field RecyclerView$q t>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #197 <Field RecyclerView$q t>
	//    5   11:invokevirtual   #266 <Method boolean RecyclerView$q.c()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public int s()
	{
		return android.support.v4.view.s.e(((View) (q)));
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field RecyclerView q>
	//    2    4:invokestatic    #773 <Method int s.e(View)>
	//    3    7:ireturn         
	}

	public int t()
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public int u()
	{
		if(p != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field t p>
	//*   2    4:ifnull          15
			return p.b();
	//    3    7:aload_0         
	//    4    8:getfield        #143 <Field t p>
	//    5   11:invokevirtual   #226 <Method int android.support.v7.widget.t.b()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int v()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #687 <Field int e>
	//    2    4:ireturn         
	}

	public int w()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #689 <Field int f>
	//    2    4:ireturn         
	}

	public int x()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #679 <Field int g>
	//    2    4:ireturn         
	}

	public int y()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #681 <Field int h>
	//    2    4:ireturn         
	}

	public int z()
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field RecyclerView q>
	//*   2    4:ifnull          15
			return q.getPaddingLeft();
	//    3    7:aload_0         
	//    4    8:getfield        #168 <Field RecyclerView q>
	//    5   11:invokevirtual   #776 <Method int RecyclerView.getPaddingLeft()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	private final bb.b a = new bb.b() {

		public int a()
		{
			return a.z();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$h a>
		//    2    4:invokevirtual   #25  <Method int RecyclerView$h.z()>
		//    3    7:ireturn         
		}

		public int a(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #32  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #34  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return a.h(view) - layoutparams.leftMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field RecyclerView$h a>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #36  <Method int RecyclerView$h.h(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #40  <Field int RecyclerView$LayoutParams.leftMargin>
		//   10   20:isub            
		//   11   21:ireturn         
		}

		public View a(int i1)
		{
			return a.h(i1);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$h a>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #43  <Method View RecyclerView$h.h(int)>
		//    4    8:areturn         
		}

		public int b()
		{
			return a.x() - a.B();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$h a>
		//    2    4:invokevirtual   #47  <Method int RecyclerView$h.x()>
		//    3    7:aload_0         
		//    4    8:getfield        #17  <Field RecyclerView$h a>
		//    5   11:invokevirtual   #50  <Method int RecyclerView$h.B()>
		//    6   14:isub            
		//    7   15:ireturn         
		}

		public int b(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #32  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #34  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return a.j(view) + layoutparams.rightMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field RecyclerView$h a>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #53  <Method int RecyclerView$h.j(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #56  <Field int RecyclerView$LayoutParams.rightMargin>
		//   10   20:iadd            
		//   11   21:ireturn         
		}

		final RecyclerView.h a;

			
			{
				a = RecyclerView.h.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RecyclerView$h a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final bb.b b = new bb.b() {

		public int a()
		{
			return a.A();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$h a>
		//    2    4:invokevirtual   #25  <Method int RecyclerView$h.A()>
		//    3    7:ireturn         
		}

		public int a(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #32  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #34  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return a.i(view) - layoutparams.topMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field RecyclerView$h a>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #37  <Method int RecyclerView$h.i(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #41  <Field int RecyclerView$LayoutParams.topMargin>
		//   10   20:isub            
		//   11   21:ireturn         
		}

		public View a(int i1)
		{
			return a.h(i1);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$h a>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #44  <Method View RecyclerView$h.h(int)>
		//    4    8:areturn         
		}

		public int b()
		{
			return a.y() - a.C();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RecyclerView$h a>
		//    2    4:invokevirtual   #48  <Method int RecyclerView$h.y()>
		//    3    7:aload_0         
		//    4    8:getfield        #17  <Field RecyclerView$h a>
		//    5   11:invokevirtual   #51  <Method int RecyclerView$h.C()>
		//    6   14:isub            
		//    7   15:ireturn         
		}

		public int b(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #32  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #34  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return a.k(view) + layoutparams.bottomMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field RecyclerView$h a>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #54  <Method int RecyclerView$h.k(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #57  <Field int RecyclerView$LayoutParams.bottomMargin>
		//   10   20:iadd            
		//   11   21:ireturn         
		}

		final RecyclerView.h a;

			
			{
				a = RecyclerView.h.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RecyclerView$h a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private boolean c;
	private boolean d;
	private int e;
	private int f;
	private int g;
	private int h;
	t p;
	RecyclerView q;
	bb r;
	bb s;
	RecyclerView$q t;
	boolean u;
	boolean v;
	boolean w;
	int x;
	boolean y;

	public RecyclerView$h()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #9   <Class RecyclerView$h$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #46  <Method void RecyclerView$h$1(RecyclerView$h)>
	//    7   13:putfield        #48  <Field bb$b a>
	//    8   16:aload_0         
	//    9   17:new             #11  <Class RecyclerView$h$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #49  <Method void RecyclerView$h$2(RecyclerView$h)>
	//   13   25:putfield        #51  <Field bb$b b>
		r = new bb(a);
	//   14   28:aload_0         
	//   15   29:new             #53  <Class bb>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:getfield        #48  <Field bb$b a>
	//   19   37:invokespecial   #56  <Method void bb(bb$b)>
	//   20   40:putfield        #58  <Field bb r>
		s = new bb(b);
	//   21   43:aload_0         
	//   22   44:new             #53  <Class bb>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:getfield        #51  <Field bb$b b>
	//   26   52:invokespecial   #56  <Method void bb(bb$b)>
	//   27   55:putfield        #60  <Field bb s>
		u = false;
	//   28   58:aload_0         
	//   29   59:iconst_0        
	//   30   60:putfield        #62  <Field boolean u>
		v = false;
	//   31   63:aload_0         
	//   32   64:iconst_0        
	//   33   65:putfield        #64  <Field boolean v>
		w = false;
	//   34   68:aload_0         
	//   35   69:iconst_0        
	//   36   70:putfield        #66  <Field boolean w>
		c = true;
	//   37   73:aload_0         
	//   38   74:iconst_1        
	//   39   75:putfield        #68  <Field boolean c>
		d = true;
	//   40   78:aload_0         
	//   41   79:iconst_1        
	//   42   80:putfield        #70  <Field boolean d>
	//   43   83:return          
	}
}
