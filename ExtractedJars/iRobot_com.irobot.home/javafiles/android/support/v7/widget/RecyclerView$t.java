// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.os.b;
import android.support.v4.view.s;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView, ad

class RecyclerView$t
	implements Runnable
{

	private float a(float f1)
	{
		return (float)Math.sin((f1 - 0.5F) * 0.4712389F);
	//    0    0:fload_1         
	//    1    1:ldc1            #51  <Float 0.5F>
	//    2    3:fsub            
	//    3    4:ldc1            #52  <Float 0.4712389F>
	//    4    6:fmul            
	//    5    7:f2d             
	//    6    8:invokestatic    #58  <Method double Math.sin(double)>
	//    7   11:d2f             
	//    8   12:freturn         
	}

	static OverScroller a(RecyclerView$t recyclerview$t)
	{
		return recyclerview$t.e;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field OverScroller e>
	//    2    4:areturn         
	}

	private int b(int i, int j, int k, int l)
	{
		int i1 = Math.abs(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #64  <Method int Math.abs(int)>
	//    2    4:istore          9
		int j1 = Math.abs(j);
	//    3    6:iload_2         
	//    4    7:invokestatic    #64  <Method int Math.abs(int)>
	//    5   10:istore          10
		boolean flag;
		if(i1 > j1)
	//*   6   12:iload           9
	//*   7   14:iload           10
	//*   8   16:icmple          25
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore          8
		else
	//*  11   22:goto            28
			flag = false;
	//   12   25:iconst_0        
	//   13   26:istore          8
		k = (int)Math.sqrt(k * k + l * l);
	//   14   28:iload_3         
	//   15   29:iload_3         
	//   16   30:imul            
	//   17   31:iload           4
	//   18   33:iload           4
	//   19   35:imul            
	//   20   36:iadd            
	//   21   37:i2d             
	//   22   38:invokestatic    #67  <Method double Math.sqrt(double)>
	//   23   41:d2i             
	//   24   42:istore_3        
		j = (int)Math.sqrt(i * i + j * j);
	//   25   43:iload_1         
	//   26   44:iload_1         
	//   27   45:imul            
	//   28   46:iload_2         
	//   29   47:iload_2         
	//   30   48:imul            
	//   31   49:iadd            
	//   32   50:i2d             
	//   33   51:invokestatic    #67  <Method double Math.sqrt(double)>
	//   34   54:d2i             
	//   35   55:istore_2        
		if(flag)
	//*  36   56:iload           8
	//*  37   58:ifeq            72
			i = b.getWidth();
	//   38   61:aload_0         
	//   39   62:getfield        #25  <Field RecyclerView b>
	//   40   65:invokevirtual   #71  <Method int RecyclerView.getWidth()>
	//   41   68:istore_1        
		else
	//*  42   69:goto            80
			i = b.getHeight();
	//   43   72:aload_0         
	//   44   73:getfield        #25  <Field RecyclerView b>
	//   45   76:invokevirtual   #74  <Method int RecyclerView.getHeight()>
	//   46   79:istore_1        
		l = i / 2;
	//   47   80:iload_1         
	//   48   81:iconst_2        
	//   49   82:idiv            
	//   50   83:istore          4
		float f2 = j;
	//   51   85:iload_2         
	//   52   86:i2f             
	//   53   87:fstore          6
		float f1 = i;
	//   54   89:iload_1         
	//   55   90:i2f             
	//   56   91:fstore          5
		float f3 = Math.min(1.0F, (f2 * 1.0F) / f1);
	//   57   93:fconst_1        
	//   58   94:fload           6
	//   59   96:fconst_1        
	//   60   97:fmul            
	//   61   98:fload           5
	//   62  100:fdiv            
	//   63  101:invokestatic    #78  <Method float Math.min(float, float)>
	//   64  104:fstore          7
		f2 = l;
	//   65  106:iload           4
	//   66  108:i2f             
	//   67  109:fstore          6
		f3 = a(f3);
	//   68  111:aload_0         
	//   69  112:fload           7
	//   70  114:invokespecial   #80  <Method float a(float)>
	//   71  117:fstore          7
		if(k > 0)
	//*  72  119:iload_3         
	//*  73  120:ifle            149
		{
			i = Math.round(Math.abs((f2 + f3 * f2) / (float)k) * 1000F) * 4;
	//   74  123:fload           6
	//   75  125:fload           7
	//   76  127:fload           6
	//   77  129:fmul            
	//   78  130:fadd            
	//   79  131:iload_3         
	//   80  132:i2f             
	//   81  133:fdiv            
	//   82  134:invokestatic    #82  <Method float Math.abs(float)>
	//   83  137:ldc1            #83  <Float 1000F>
	//   84  139:fmul            
	//   85  140:invokestatic    #87  <Method int Math.round(float)>
	//   86  143:iconst_4        
	//   87  144:imul            
	//   88  145:istore_1        
		} else
	//*  89  146:goto            175
		{
			if(flag)
	//*  90  149:iload           8
	//*  91  151:ifeq            160
				i = i1;
	//   92  154:iload           9
	//   93  156:istore_1        
			else
	//*  94  157:goto            163
				i = j1;
	//   95  160:iload           10
	//   96  162:istore_1        
			i = (int)(((float)i / f1 + 1.0F) * 300F);
	//   97  163:iload_1         
	//   98  164:i2f             
	//   99  165:fload           5
	//  100  167:fdiv            
	//  101  168:fconst_1        
	//  102  169:fadd            
	//  103  170:ldc1            #88  <Float 300F>
	//  104  172:fmul            
	//  105  173:f2i             
	//  106  174:istore_1        
		}
		return Math.min(i, 2000);
	//  107  175:iload_1         
	//  108  176:sipush          2000
	//  109  179:invokestatic    #91  <Method int Math.min(int, int)>
	//  110  182:ireturn         
	}

	private void c()
	{
		g = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #37  <Field boolean g>
		f = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #35  <Field boolean f>
	//    6   10:return          
	}

	private void d()
	{
		f = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #35  <Field boolean f>
		if(g)
	//*   3    5:aload_0         
	//*   4    6:getfield        #37  <Field boolean g>
	//*   5    9:ifeq            16
			a();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #93  <Method void a()>
	//    8   16:return          
	}

	void a()
	{
		if(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field boolean f>
	//*   2    4:ifeq            13
		{
			g = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #37  <Field boolean g>
			return;
	//    6   12:return          
		} else
		{
			b.removeCallbacks(((Runnable) (this)));
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field RecyclerView b>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #97  <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//   11   21:pop             
			s.a(((android.view.View) (b)), ((Runnable) (this)));
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field RecyclerView b>
	//   14   26:aload_0         
	//   15   27:invokestatic    #102 <Method void s.a(android.view.View, Runnable)>
			return;
	//   16   30:return          
		}
	}

	public void a(int i, int j)
	{
		b.setScrollState(2);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field RecyclerView b>
	//    2    4:iconst_2        
	//    3    5:invokevirtual   #107 <Method void RecyclerView.setScrollState(int)>
		d = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #109 <Field int d>
		c = 0;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #111 <Field int c>
		e.fling(0, 0, i, j, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
	//   10   18:aload_0         
	//   11   19:getfield        #48  <Field OverScroller e>
	//   12   22:iconst_0        
	//   13   23:iconst_0        
	//   14   24:iload_1         
	//   15   25:iload_2         
	//   16   26:ldc1            #112 <Int 0x80000000>
	//   17   28:ldc1            #113 <Int 0x7fffffff>
	//   18   30:ldc1            #112 <Int 0x80000000>
	//   19   32:ldc1            #113 <Int 0x7fffffff>
	//   20   34:invokevirtual   #117 <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
		a();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #93  <Method void a()>
	//   23   41:return          
	}

	public void a(int i, int j, int k)
	{
		a(i, j, k, RecyclerView.H);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:getstatic       #31  <Field Interpolator RecyclerView.H>
	//    5    7:invokevirtual   #121 <Method void a(int, int, int, Interpolator)>
	//    6   10:return          
	}

	public void a(int i, int j, int k, int l)
	{
		a(i, j, b(i, j, k, l));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_0         
	//    4    4:iload_1         
	//    5    5:iload_2         
	//    6    6:iload_3         
	//    7    7:iload           4
	//    8    9:invokespecial   #124 <Method int b(int, int, int, int)>
	//    9   12:invokevirtual   #126 <Method void a(int, int, int)>
	//   10   15:return          
	}

	public void a(int i, int j, int k, Interpolator interpolator)
	{
		if(a != interpolator)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Interpolator a>
	//*   2    4:aload           4
	//*   3    6:if_acmpeq       35
		{
			a = interpolator;
	//    4    9:aload_0         
	//    5   10:aload           4
	//    6   12:putfield        #33  <Field Interpolator a>
			e = new OverScroller(b.getContext(), interpolator);
	//    7   15:aload_0         
	//    8   16:new             #39  <Class OverScroller>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field RecyclerView b>
	//   12   24:invokevirtual   #43  <Method android.content.Context RecyclerView.getContext()>
	//   13   27:aload           4
	//   14   29:invokespecial   #46  <Method void OverScroller(android.content.Context, Interpolator)>
	//   15   32:putfield        #48  <Field OverScroller e>
		}
		b.setScrollState(2);
	//   16   35:aload_0         
	//   17   36:getfield        #25  <Field RecyclerView b>
	//   18   39:iconst_2        
	//   19   40:invokevirtual   #107 <Method void RecyclerView.setScrollState(int)>
		d = 0;
	//   20   43:aload_0         
	//   21   44:iconst_0        
	//   22   45:putfield        #109 <Field int d>
		c = 0;
	//   23   48:aload_0         
	//   24   49:iconst_0        
	//   25   50:putfield        #111 <Field int c>
		e.startScroll(0, 0, i, j, k);
	//   26   53:aload_0         
	//   27   54:getfield        #48  <Field OverScroller e>
	//   28   57:iconst_0        
	//   29   58:iconst_0        
	//   30   59:iload_1         
	//   31   60:iload_2         
	//   32   61:iload_3         
	//   33   62:invokevirtual   #130 <Method void OverScroller.startScroll(int, int, int, int, int)>
		if(android.os.Build.VERSION.SDK_INT < 23)
	//*  34   65:getstatic       #135 <Field int android.os.Build$VERSION.SDK_INT>
	//*  35   68:bipush          23
	//*  36   70:icmpge          81
			e.computeScrollOffset();
	//   37   73:aload_0         
	//   38   74:getfield        #48  <Field OverScroller e>
	//   39   77:invokevirtual   #139 <Method boolean OverScroller.computeScrollOffset()>
	//   40   80:pop             
		a();
	//   41   81:aload_0         
	//   42   82:invokevirtual   #93  <Method void a()>
	//   43   85:return          
	}

	public void a(int i, int j, Interpolator interpolator)
	{
		int k = b(i, j, 0, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokespecial   #124 <Method int b(int, int, int, int)>
	//    6    8:istore          4
		Interpolator interpolator1 = interpolator;
	//    7   10:aload_3         
	//    8   11:astore          5
		if(interpolator == null)
	//*   9   13:aload_3         
	//*  10   14:ifnonnull       22
			interpolator1 = RecyclerView.H;
	//   11   17:getstatic       #31  <Field Interpolator RecyclerView.H>
	//   12   20:astore          5
		a(i, j, k, interpolator1);
	//   13   22:aload_0         
	//   14   23:iload_1         
	//   15   24:iload_2         
	//   16   25:iload           4
	//   17   27:aload           5
	//   18   29:invokevirtual   #121 <Method void a(int, int, int, Interpolator)>
	//   19   32:return          
	}

	public void b()
	{
		b.removeCallbacks(((Runnable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field RecyclerView b>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #97  <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//    4    8:pop             
		e.abortAnimation();
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field OverScroller e>
	//    7   13:invokevirtual   #143 <Method void OverScroller.abortAnimation()>
	//    8   16:return          
	}

	public void b(int i, int j)
	{
		a(i, j, 0, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #145 <Method void a(int, int, int, int)>
	//    6    8:return          
	}

	public void run()
	{
		RecyclerView$q recyclerview$q;
label0:
		{
			int i1;
			int j1;
			int k1;
			int i2;
			OverScroller overscroller;
label1:
			{
				int i;
				int j;
				int l1;
				int j2;
				int k2;
				int l2;
label2:
				{
					if(b.m == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field RecyclerView b>
	//*   2    4:getfield        #150 <Field RecyclerView$h RecyclerView.m>
	//*   3    7:ifnonnull       15
					{
						b();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #152 <Method void b()>
						return;
	//    6   14:return          
					}
					c();
	//    7   15:aload_0         
	//    8   16:invokespecial   #154 <Method void c()>
					b.d();
	//    9   19:aload_0         
	//   10   20:getfield        #25  <Field RecyclerView b>
	//   11   23:invokevirtual   #156 <Method void RecyclerView.d()>
					overscroller = e;
	//   12   26:aload_0         
	//   13   27:getfield        #48  <Field OverScroller e>
	//   14   30:astore          13
					recyclerview$q = b.m.t;
	//   15   32:aload_0         
	//   16   33:getfield        #25  <Field RecyclerView b>
	//   17   36:getfield        #150 <Field RecyclerView$h RecyclerView.m>
	//   18   39:getfield        #161 <Field RecyclerView$q RecyclerView$h.t>
	//   19   42:astore          14
					if(!overscroller.computeScrollOffset())
						break label0;
	//   20   44:aload           13
	//   21   46:invokevirtual   #139 <Method boolean OverScroller.computeScrollOffset()>
	//   22   49:ifeq            881
					int ai[] = RecyclerView.a(b);
	//   23   52:aload_0         
	//   24   53:getfield        #25  <Field RecyclerView b>
	//   25   56:invokestatic    #164 <Method int[] RecyclerView.a(RecyclerView)>
	//   26   59:astore          15
					k2 = overscroller.getCurrX();
	//   27   61:aload           13
	//   28   63:invokevirtual   #167 <Method int OverScroller.getCurrX()>
	//   29   66:istore          11
					l2 = overscroller.getCurrY();
	//   30   68:aload           13
	//   31   70:invokevirtual   #170 <Method int OverScroller.getCurrY()>
	//   32   73:istore          12
					j = k2 - c;
	//   33   75:iload           11
	//   34   77:aload_0         
	//   35   78:getfield        #111 <Field int c>
	//   36   81:isub            
	//   37   82:istore_2        
					i = l2 - d;
	//   38   83:iload           12
	//   39   85:aload_0         
	//   40   86:getfield        #109 <Field int d>
	//   41   89:isub            
	//   42   90:istore_1        
					c = k2;
	//   43   91:aload_0         
	//   44   92:iload           11
	//   45   94:putfield        #111 <Field int c>
					d = l2;
	//   46   97:aload_0         
	//   47   98:iload           12
	//   48  100:putfield        #109 <Field int d>
					j1 = j;
	//   49  103:iload_2         
	//   50  104:istore          6
					i1 = i;
	//   51  106:iload_1         
	//   52  107:istore          5
					if(b.a(j, i, ai, ((int []) (null)), 1))
	//*  53  109:aload_0         
	//*  54  110:getfield        #25  <Field RecyclerView b>
	//*  55  113:iload_2         
	//*  56  114:iload_1         
	//*  57  115:aload           15
	//*  58  117:aconst_null     
	//*  59  118:iconst_1        
	//*  60  119:invokevirtual   #173 <Method boolean RecyclerView.a(int, int, int[], int[], int)>
	//*  61  122:ifeq            141
					{
						j1 = j - ai[0];
	//   62  125:iload_2         
	//   63  126:aload           15
	//   64  128:iconst_0        
	//   65  129:iaload          
	//   66  130:isub            
	//   67  131:istore          6
						i1 = i - ai[1];
	//   68  133:iload_1         
	//   69  134:aload           15
	//   70  136:iconst_1        
	//   71  137:iaload          
	//   72  138:isub            
	//   73  139:istore          5
					}
					if(b.l != null)
	//*  74  141:aload_0         
	//*  75  142:getfield        #25  <Field RecyclerView b>
	//*  76  145:getfield        #177 <Field RecyclerView$a RecyclerView.l>
	//*  77  148:ifnull          446
					{
						b.e();
	//   78  151:aload_0         
	//   79  152:getfield        #25  <Field RecyclerView b>
	//   80  155:invokevirtual   #179 <Method void RecyclerView.e()>
						b.l();
	//   81  158:aload_0         
	//   82  159:getfield        #25  <Field RecyclerView b>
	//   83  162:invokevirtual   #181 <Method void RecyclerView.l()>
						android.support.v4.os.b.a("RV Scroll");
	//   84  165:ldc1            #183 <String "RV Scroll">
	//   85  167:invokestatic    #188 <Method void b.a(String)>
						b.a(b.B);
	//   86  170:aload_0         
	//   87  171:getfield        #25  <Field RecyclerView b>
	//   88  174:aload_0         
	//   89  175:getfield        #25  <Field RecyclerView b>
	//   90  178:getfield        #192 <Field RecyclerView$r RecyclerView.B>
	//   91  181:invokevirtual   #195 <Method void RecyclerView.a(RecyclerView$r)>
						if(j1 != 0)
	//*  92  184:iload           6
	//*  93  186:ifeq            224
						{
							i = b.m.a(j1, b.d, b.B);
	//   94  189:aload_0         
	//   95  190:getfield        #25  <Field RecyclerView b>
	//   96  193:getfield        #150 <Field RecyclerView$h RecyclerView.m>
	//   97  196:iload           6
	//   98  198:aload_0         
	//   99  199:getfield        #25  <Field RecyclerView b>
	//  100  202:getfield        #198 <Field RecyclerView$n RecyclerView.d>
	//  101  205:aload_0         
	//  102  206:getfield        #25  <Field RecyclerView b>
	//  103  209:getfield        #192 <Field RecyclerView$r RecyclerView.B>
	//  104  212:invokevirtual   #201 <Method int RecyclerView$h.a(int, RecyclerView$n, RecyclerView$r)>
	//  105  215:istore_1        
							j = j1 - i;
	//  106  216:iload           6
	//  107  218:iload_1         
	//  108  219:isub            
	//  109  220:istore_2        
						} else
	//* 110  221:goto            228
						{
							i = 0;
	//  111  224:iconst_0        
	//  112  225:istore_1        
							j = 0;
	//  113  226:iconst_0        
	//  114  227:istore_2        
						}
						int k;
						int l;
						if(i1 != 0)
	//* 115  228:iload           5
	//* 116  230:ifeq            269
						{
							k = b.m.b(i1, b.d, b.B);
	//  117  233:aload_0         
	//  118  234:getfield        #25  <Field RecyclerView b>
	//  119  237:getfield        #150 <Field RecyclerView$h RecyclerView.m>
	//  120  240:iload           5
	//  121  242:aload_0         
	//  122  243:getfield        #25  <Field RecyclerView b>
	//  123  246:getfield        #198 <Field RecyclerView$n RecyclerView.d>
	//  124  249:aload_0         
	//  125  250:getfield        #25  <Field RecyclerView b>
	//  126  253:getfield        #192 <Field RecyclerView$r RecyclerView.B>
	//  127  256:invokevirtual   #203 <Method int android.support.v7.widget.RecyclerView$h.b(int, RecyclerView$n, RecyclerView$r)>
	//  128  259:istore_3        
							l = i1 - k;
	//  129  260:iload           5
	//  130  262:iload_3         
	//  131  263:isub            
	//  132  264:istore          4
						} else
	//* 133  266:goto            274
						{
							k = 0;
	//  134  269:iconst_0        
	//  135  270:istore_3        
							l = 0;
	//  136  271:iconst_0        
	//  137  272:istore          4
						}
						android.support.v4.os.b.a();
	//  138  274:invokestatic    #204 <Method void b.a()>
						b.x();
	//  139  277:aload_0         
	//  140  278:getfield        #25  <Field RecyclerView b>
	//  141  281:invokevirtual   #207 <Method void RecyclerView.x()>
						b.m();
	//  142  284:aload_0         
	//  143  285:getfield        #25  <Field RecyclerView b>
	//  144  288:invokevirtual   #209 <Method void RecyclerView.m()>
						b.a(false);
	//  145  291:aload_0         
	//  146  292:getfield        #25  <Field RecyclerView b>
	//  147  295:iconst_0        
	//  148  296:invokevirtual   #212 <Method void RecyclerView.a(boolean)>
						k1 = i;
	//  149  299:iload_1         
	//  150  300:istore          7
						j2 = j;
	//  151  302:iload_2         
	//  152  303:istore          10
						i2 = k;
	//  153  305:iload_3         
	//  154  306:istore          9
						l1 = l;
	//  155  308:iload           4
	//  156  310:istore          8
						if(recyclerview$q != null)
	//* 157  312:aload           14
	//* 158  314:ifnull          458
						{
							k1 = i;
	//  159  317:iload_1         
	//  160  318:istore          7
							j2 = j;
	//  161  320:iload_2         
	//  162  321:istore          10
							i2 = k;
	//  163  323:iload_3         
	//  164  324:istore          9
							l1 = l;
	//  165  326:iload           4
	//  166  328:istore          8
							if(!recyclerview$q.b())
	//* 167  330:aload           14
	//* 168  332:invokevirtual   #216 <Method boolean android.support.v7.widget.RecyclerView$q.b()>
	//* 169  335:ifne            458
							{
								k1 = i;
	//  170  338:iload_1         
	//  171  339:istore          7
								j2 = j;
	//  172  341:iload_2         
	//  173  342:istore          10
								i2 = k;
	//  174  344:iload_3         
	//  175  345:istore          9
								l1 = l;
	//  176  347:iload           4
	//  177  349:istore          8
								if(recyclerview$q.c())
	//* 178  351:aload           14
	//* 179  353:invokevirtual   #218 <Method boolean RecyclerView$q.c()>
	//* 180  356:ifeq            458
								{
									k1 = b.B.e();
	//  181  359:aload_0         
	//  182  360:getfield        #25  <Field RecyclerView b>
	//  183  363:getfield        #192 <Field RecyclerView$r RecyclerView.B>
	//  184  366:invokevirtual   #222 <Method int RecyclerView$r.e()>
	//  185  369:istore          7
									if(k1 == 0)
	//* 186  371:iload           7
	//* 187  373:ifne            397
									{
										recyclerview$q.a();
	//  188  376:aload           14
	//  189  378:invokevirtual   #223 <Method void RecyclerView$q.a()>
										k1 = i;
	//  190  381:iload_1         
	//  191  382:istore          7
										j2 = j;
	//  192  384:iload_2         
	//  193  385:istore          10
										i2 = k;
	//  194  387:iload_3         
	//  195  388:istore          9
										l1 = l;
	//  196  390:iload           4
	//  197  392:istore          8
									} else
	//* 198  394:goto            458
									{
										if(recyclerview$q.d() >= k1)
	//* 199  397:aload           14
	//* 200  399:invokevirtual   #225 <Method int RecyclerView$q.d()>
	//* 201  402:iload           7
	//* 202  404:icmplt          416
											recyclerview$q.a(k1 - 1);
	//  203  407:aload           14
	//  204  409:iload           7
	//  205  411:iconst_1        
	//  206  412:isub            
	//  207  413:invokevirtual   #227 <Method void RecyclerView$q.a(int)>
										RecyclerView$q.a(recyclerview$q, j1 - j, i1 - l);
	//  208  416:aload           14
	//  209  418:iload           6
	//  210  420:iload_2         
	//  211  421:isub            
	//  212  422:iload           5
	//  213  424:iload           4
	//  214  426:isub            
	//  215  427:invokestatic    #230 <Method void RecyclerView$q.a(RecyclerView$q, int, int)>
										k1 = i;
	//  216  430:iload_1         
	//  217  431:istore          7
										j2 = j;
	//  218  433:iload_2         
	//  219  434:istore          10
										i2 = k;
	//  220  436:iload_3         
	//  221  437:istore          9
										l1 = l;
	//  222  439:iload           4
	//  223  441:istore          8
									}
								}
							}
						}
					} else
	//* 224  443:goto            458
					{
						k1 = 0;
	//  225  446:iconst_0        
	//  226  447:istore          7
						j2 = 0;
	//  227  449:iconst_0        
	//  228  450:istore          10
						i2 = 0;
	//  229  452:iconst_0        
	//  230  453:istore          9
						l1 = 0;
	//  231  455:iconst_0        
	//  232  456:istore          8
					}
					if(!b.o.isEmpty())
	//* 233  458:aload_0         
	//* 234  459:getfield        #25  <Field RecyclerView b>
	//* 235  462:getfield        #234 <Field ArrayList RecyclerView.o>
	//* 236  465:invokevirtual   #239 <Method boolean ArrayList.isEmpty()>
	//* 237  468:ifne            478
						b.invalidate();
	//  238  471:aload_0         
	//  239  472:getfield        #25  <Field RecyclerView b>
	//  240  475:invokevirtual   #242 <Method void RecyclerView.invalidate()>
					if(b.getOverScrollMode() != 2)
	//* 241  478:aload_0         
	//* 242  479:getfield        #25  <Field RecyclerView b>
	//* 243  482:invokevirtual   #245 <Method int RecyclerView.getOverScrollMode()>
	//* 244  485:iconst_2        
	//* 245  486:icmpeq          500
						b.c(j1, i1);
	//  246  489:aload_0         
	//  247  490:getfield        #25  <Field RecyclerView b>
	//  248  493:iload           6
	//  249  495:iload           5
	//  250  497:invokevirtual   #247 <Method void RecyclerView.c(int, int)>
					if(b.a(k1, i2, j2, l1, ((int []) (null)), 1) || j2 == 0 && l1 == 0)
						break label1;
	//  251  500:aload_0         
	//  252  501:getfield        #25  <Field RecyclerView b>
	//  253  504:iload           7
	//  254  506:iload           9
	//  255  508:iload           10
	//  256  510:iload           8
	//  257  512:aconst_null     
	//  258  513:iconst_1        
	//  259  514:invokevirtual   #250 <Method boolean RecyclerView.a(int, int, int, int, int[], int)>
	//  260  517:ifne            658
	//  261  520:iload           10
	//  262  522:ifne            530
	//  263  525:iload           8
	//  264  527:ifeq            658
					j = (int)overscroller.getCurrVelocity();
	//  265  530:aload           13
	//  266  532:invokevirtual   #254 <Method float OverScroller.getCurrVelocity()>
	//  267  535:f2i             
	//  268  536:istore_2        
					if(j2 != k2)
	//* 269  537:iload           10
	//* 270  539:iload           11
	//* 271  541:icmpeq          565
					{
						if(j2 < 0)
	//* 272  544:iload           10
	//* 273  546:ifge            555
						{
							i = -j;
	//  274  549:iload_2         
	//  275  550:ineg            
	//  276  551:istore_1        
							break label2;
	//  277  552:goto            567
						}
						if(j2 > 0)
	//* 278  555:iload           10
	//* 279  557:ifle            565
						{
							i = j;
	//  280  560:iload_2         
	//  281  561:istore_1        
							break label2;
	//  282  562:goto            567
						}
					}
					i = 0;
	//  283  565:iconst_0        
	//  284  566:istore_1        
				}
label3:
				{
					if(l1 != l2)
	//* 285  567:iload           8
	//* 286  569:iload           12
	//* 287  571:icmpeq          593
					{
						if(l1 < 0)
	//* 288  574:iload           8
	//* 289  576:ifge            585
						{
							j = -j;
	//  290  579:iload_2         
	//  291  580:ineg            
	//  292  581:istore_2        
							break label3;
	//  293  582:goto            595
						}
						if(l1 > 0)
	//* 294  585:iload           8
	//* 295  587:ifle            593
							break label3;
	//  296  590:goto            595
					}
					j = 0;
	//  297  593:iconst_0        
	//  298  594:istore_2        
				}
				if(b.getOverScrollMode() != 2)
	//* 299  595:aload_0         
	//* 300  596:getfield        #25  <Field RecyclerView b>
	//* 301  599:invokevirtual   #245 <Method int RecyclerView.getOverScrollMode()>
	//* 302  602:iconst_2        
	//* 303  603:icmpeq          615
					b.d(i, j);
	//  304  606:aload_0         
	//  305  607:getfield        #25  <Field RecyclerView b>
	//  306  610:iload_1         
	//  307  611:iload_2         
	//  308  612:invokevirtual   #256 <Method void RecyclerView.d(int, int)>
				if((i != 0 || j2 == k2 || overscroller.getFinalX() == 0) && (j != 0 || l1 == l2 || overscroller.getFinalY() == 0))
	//* 309  615:iload_1         
	//* 310  616:ifne            634
	//* 311  619:iload           10
	//* 312  621:iload           11
	//* 313  623:icmpeq          634
	//* 314  626:aload           13
	//* 315  628:invokevirtual   #259 <Method int OverScroller.getFinalX()>
	//* 316  631:ifne            658
	//* 317  634:iload_2         
	//* 318  635:ifne            653
	//* 319  638:iload           8
	//* 320  640:iload           12
	//* 321  642:icmpeq          653
	//* 322  645:aload           13
	//* 323  647:invokevirtual   #262 <Method int OverScroller.getFinalY()>
	//* 324  650:ifne            658
					overscroller.abortAnimation();
	//  325  653:aload           13
	//  326  655:invokevirtual   #143 <Method void OverScroller.abortAnimation()>
			}
			if(k1 != 0 || i2 != 0)
	//* 327  658:iload           7
	//* 328  660:ifne            668
	//* 329  663:iload           9
	//* 330  665:ifeq            679
				b.i(k1, i2);
	//  331  668:aload_0         
	//  332  669:getfield        #25  <Field RecyclerView b>
	//  333  672:iload           7
	//  334  674:iload           9
	//  335  676:invokevirtual   #265 <Method void RecyclerView.i(int, int)>
			if(!android.support.v7.widget.RecyclerView.b(b))
	//* 336  679:aload_0         
	//* 337  680:getfield        #25  <Field RecyclerView b>
	//* 338  683:invokestatic    #268 <Method boolean android.support.v7.widget.RecyclerView.b(RecyclerView)>
	//* 339  686:ifne            696
				b.invalidate();
	//  340  689:aload_0         
	//  341  690:getfield        #25  <Field RecyclerView b>
	//  342  693:invokevirtual   #242 <Method void RecyclerView.invalidate()>
			boolean flag;
			if(i1 != 0 && b.m.e() && i2 == i1)
	//* 343  696:iload           5
	//* 344  698:ifeq            726
	//* 345  701:aload_0         
	//* 346  702:getfield        #25  <Field RecyclerView b>
	//* 347  705:getfield        #150 <Field RecyclerView$h RecyclerView.m>
	//* 348  708:invokevirtual   #270 <Method boolean RecyclerView$h.e()>
	//* 349  711:ifeq            726
	//* 350  714:iload           9
	//* 351  716:iload           5
	//* 352  718:icmpne          726
				flag = true;
	//  353  721:iconst_1        
	//  354  722:istore_1        
			else
	//* 355  723:goto            728
				flag = false;
	//  356  726:iconst_0        
	//  357  727:istore_1        
			boolean flag1;
			if(j1 != 0 && b.m.d() && k1 == j1)
	//* 358  728:iload           6
	//* 359  730:ifeq            758
	//* 360  733:aload_0         
	//* 361  734:getfield        #25  <Field RecyclerView b>
	//* 362  737:getfield        #150 <Field RecyclerView$h RecyclerView.m>
	//* 363  740:invokevirtual   #272 <Method boolean RecyclerView$h.d()>
	//* 364  743:ifeq            758
	//* 365  746:iload           7
	//* 366  748:iload           6
	//* 367  750:icmpne          758
				flag1 = true;
	//  368  753:iconst_1        
	//  369  754:istore_2        
			else
	//* 370  755:goto            760
				flag1 = false;
	//  371  758:iconst_0        
	//  372  759:istore_2        
			if((j1 != 0 || i1 != 0) && !flag1 && !flag)
	//* 373  760:iload           6
	//* 374  762:ifne            770
	//* 375  765:iload           5
	//* 376  767:ifeq            786
	//* 377  770:iload_2         
	//* 378  771:ifne            786
	//* 379  774:iload_1         
	//* 380  775:ifeq            781
	//* 381  778:goto            786
				flag = false;
	//  382  781:iconst_0        
	//  383  782:istore_1        
			else
	//* 384  783:goto            788
				flag = true;
	//  385  786:iconst_1        
	//  386  787:istore_1        
			if(!overscroller.isFinished() && (flag || b.i(1)))
	//* 387  788:aload           13
	//* 388  790:invokevirtual   #275 <Method boolean OverScroller.isFinished()>
	//* 389  793:ifne            849
	//* 390  796:iload_1         
	//* 391  797:ifne            814
	//* 392  800:aload_0         
	//* 393  801:getfield        #25  <Field RecyclerView b>
	//* 394  804:iconst_1        
	//* 395  805:invokevirtual   #278 <Method boolean RecyclerView.i(int)>
	//* 396  808:ifne            814
	//* 397  811:goto            849
			{
				a();
	//  398  814:aload_0         
	//  399  815:invokevirtual   #93  <Method void a()>
				if(b.z != null)
	//* 400  818:aload_0         
	//* 401  819:getfield        #25  <Field RecyclerView b>
	//* 402  822:getfield        #282 <Field ad RecyclerView.z>
	//* 403  825:ifnull          881
					b.z.a(b, j1, i1);
	//  404  828:aload_0         
	//  405  829:getfield        #25  <Field RecyclerView b>
	//  406  832:getfield        #282 <Field ad RecyclerView.z>
	//  407  835:aload_0         
	//  408  836:getfield        #25  <Field RecyclerView b>
	//  409  839:iload           6
	//  410  841:iload           5
	//  411  843:invokevirtual   #287 <Method void ad.a(RecyclerView, int, int)>
			} else
	//* 412  846:goto            881
			{
				b.setScrollState(0);
	//  413  849:aload_0         
	//  414  850:getfield        #25  <Field RecyclerView b>
	//  415  853:iconst_0        
	//  416  854:invokevirtual   #107 <Method void RecyclerView.setScrollState(int)>
				if(RecyclerView.z())
	//* 417  857:invokestatic    #289 <Method boolean RecyclerView.z()>
	//* 418  860:ifeq            873
					b.A.a();
	//  419  863:aload_0         
	//  420  864:getfield        #25  <Field RecyclerView b>
	//  421  867:getfield        #293 <Field ad$a RecyclerView.A>
	//  422  870:invokevirtual   #296 <Method void ad$a.a()>
				b.h(1);
	//  423  873:aload_0         
	//  424  874:getfield        #25  <Field RecyclerView b>
	//  425  877:iconst_1        
	//  426  878:invokevirtual   #299 <Method void RecyclerView.h(int)>
			}
		}
		if(recyclerview$q != null)
	//* 427  881:aload           14
	//* 428  883:ifnull          913
		{
			if(recyclerview$q.b())
	//* 429  886:aload           14
	//* 430  888:invokevirtual   #216 <Method boolean android.support.v7.widget.RecyclerView$q.b()>
	//* 431  891:ifeq            901
				RecyclerView$q.a(recyclerview$q, 0, 0);
	//  432  894:aload           14
	//  433  896:iconst_0        
	//  434  897:iconst_0        
	//  435  898:invokestatic    #230 <Method void RecyclerView$q.a(RecyclerView$q, int, int)>
			if(!g)
	//* 436  901:aload_0         
	//* 437  902:getfield        #37  <Field boolean g>
	//* 438  905:ifne            913
				recyclerview$q.a();
	//  439  908:aload           14
	//  440  910:invokevirtual   #223 <Method void RecyclerView$q.a()>
		}
		d();
	//  441  913:aload_0         
	//  442  914:invokespecial   #300 <Method void d()>
	//  443  917:return          
	}

	Interpolator a;
	final RecyclerView b;
	private int c;
	private int d;
	private OverScroller e;
	private boolean f;
	private boolean g;

	RecyclerView$t(RecyclerView recyclerview)
	{
		b = recyclerview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field RecyclerView b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #28  <Method void Object()>
		a = RecyclerView.H;
	//    5    9:aload_0         
	//    6   10:getstatic       #31  <Field Interpolator RecyclerView.H>
	//    7   13:putfield        #33  <Field Interpolator a>
		f = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #35  <Field boolean f>
		g = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #37  <Field boolean g>
		e = new OverScroller(recyclerview.getContext(), RecyclerView.H);
	//   14   26:aload_0         
	//   15   27:new             #39  <Class OverScroller>
	//   16   30:dup             
	//   17   31:aload_1         
	//   18   32:invokevirtual   #43  <Method android.content.Context RecyclerView.getContext()>
	//   19   35:getstatic       #31  <Field Interpolator RecyclerView.H>
	//   20   38:invokespecial   #46  <Method void OverScroller(android.content.Context, Interpolator)>
	//   21   41:putfield        #48  <Field OverScroller e>
	//   22   44:return          
	}
}
