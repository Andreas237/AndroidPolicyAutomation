// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.s;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView, ai, e, t, 
//			bc

public final class RecyclerView$n
{

	private void a(ViewGroup viewgroup, boolean flag)
	{
		for(int k = viewgroup.getChildCount() - 1; k >= 0; k--)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #60  <Method int ViewGroup.getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:iflt            43
		{
			View view = viewgroup.getChildAt(k);
	//    7   11:aload_1         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #64  <Method View ViewGroup.getChildAt(int)>
	//   10   16:astore          4
			if(view instanceof ViewGroup)
	//*  11   18:aload           4
	//*  12   20:instanceof      #56  <Class ViewGroup>
	//*  13   23:ifeq            36
				a((ViewGroup)view, true);
	//   14   26:aload_0         
	//   15   27:aload           4
	//   16   29:checkcast       #56  <Class ViewGroup>
	//   17   32:iconst_1        
	//   18   33:invokespecial   #66  <Method void a(ViewGroup, boolean)>
		}

	//   19   36:iload_3         
	//   20   37:iconst_1        
	//   21   38:isub            
	//   22   39:istore_3        
	//*  23   40:goto            7
		if(!flag)
	//*  24   43:iload_2         
	//*  25   44:ifne            48
			return;
	//   26   47:return          
		if(viewgroup.getVisibility() == 4)
	//*  27   48:aload_1         
	//*  28   49:invokevirtual   #69  <Method int ViewGroup.getVisibility()>
	//*  29   52:iconst_4        
	//*  30   53:icmpne          67
		{
			viewgroup.setVisibility(0);
	//   31   56:aload_1         
	//   32   57:iconst_0        
	//   33   58:invokevirtual   #73  <Method void ViewGroup.setVisibility(int)>
			viewgroup.setVisibility(4);
	//   34   61:aload_1         
	//   35   62:iconst_4        
	//   36   63:invokevirtual   #73  <Method void ViewGroup.setVisibility(int)>
			return;
	//   37   66:return          
		} else
		{
			int l = viewgroup.getVisibility();
	//   38   67:aload_1         
	//   39   68:invokevirtual   #69  <Method int ViewGroup.getVisibility()>
	//   40   71:istore_3        
			viewgroup.setVisibility(4);
	//   41   72:aload_1         
	//   42   73:iconst_4        
	//   43   74:invokevirtual   #73  <Method void ViewGroup.setVisibility(int)>
			viewgroup.setVisibility(l);
	//   44   77:aload_1         
	//   45   78:iload_3         
	//   46   79:invokevirtual   #73  <Method void ViewGroup.setVisibility(int)>
			return;
	//   47   82:return          
		}
	}

	private boolean a(RecyclerView$u recyclerview$u, int k, int l, long l1)
	{
		recyclerview$u.m = f;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field RecyclerView f>
	//    3    5:putfield        #79  <Field RecyclerView RecyclerView$u.m>
		int i1 = recyclerview$u.h();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method int RecyclerView$u.h()>
	//    6   12:istore          6
		long l2 = f.getNanoTime();
	//    7   14:aload_0         
	//    8   15:getfield        #28  <Field RecyclerView f>
	//    9   18:invokevirtual   #85  <Method long RecyclerView.getNanoTime()>
	//   10   21:lstore          7
		if(l1 != 0xffffffffL && !e.b(i1, l2, l1))
	//*  11   23:lload           4
	//*  12   25:ldc2w           #86  <Long 0xffffffffL>
	//*  13   28:lcmp            
	//*  14   29:ifeq            50
	//*  15   32:aload_0         
	//*  16   33:getfield        #89  <Field RecyclerView$m e>
	//*  17   36:iload           6
	//*  18   38:lload           7
	//*  19   40:lload           4
	//*  20   42:invokevirtual   #94  <Method boolean RecyclerView$m.b(int, long, long)>
	//*  21   45:ifne            50
			return false;
	//   22   48:iconst_0        
	//   23   49:ireturn         
		f.l.b(recyclerview$u, k);
	//   24   50:aload_0         
	//   25   51:getfield        #28  <Field RecyclerView f>
	//   26   54:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//   27   57:aload_1         
	//   28   58:iload_2         
	//   29   59:invokevirtual   #103 <Method void RecyclerView$a.b(RecyclerView$u, int)>
		l1 = f.getNanoTime();
	//   30   62:aload_0         
	//   31   63:getfield        #28  <Field RecyclerView f>
	//   32   66:invokevirtual   #85  <Method long RecyclerView.getNanoTime()>
	//   33   69:lstore          4
		e.b(recyclerview$u.h(), l1 - l2);
	//   34   71:aload_0         
	//   35   72:getfield        #89  <Field RecyclerView$m e>
	//   36   75:aload_1         
	//   37   76:invokevirtual   #81  <Method int RecyclerView$u.h()>
	//   38   79:lload           4
	//   39   81:lload           7
	//   40   83:lsub            
	//   41   84:invokevirtual   #106 <Method void RecyclerView$m.b(int, long)>
		e(recyclerview$u);
	//   42   87:aload_0         
	//   43   88:aload_1         
	//   44   89:invokespecial   #109 <Method void e(RecyclerView$u)>
		if(f.B.a())
	//*  45   92:aload_0         
	//*  46   93:getfield        #28  <Field RecyclerView f>
	//*  47   96:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//*  48   99:invokevirtual   #118 <Method boolean RecyclerView$r.a()>
	//*  49  102:ifeq            110
			recyclerview$u.g = l;
	//   50  105:aload_1         
	//   51  106:iload_3         
	//   52  107:putfield        #120 <Field int RecyclerView$u.g>
		return true;
	//   53  110:iconst_1        
	//   54  111:ireturn         
	}

	private void e(RecyclerView$u recyclerview$u)
	{
		if(f.n())
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field RecyclerView f>
	//*   2    4:invokevirtual   #122 <Method boolean RecyclerView.n()>
	//*   3    7:ifeq            55
		{
			View view = recyclerview$u.a;
	//    4   10:aload_1         
	//    5   11:getfield        #125 <Field View RecyclerView$u.a>
	//    6   14:astore_2        
			if(s.d(view) == 0)
	//*   7   15:aload_2         
	//*   8   16:invokestatic    #130 <Method int s.d(View)>
	//*   9   19:ifne            27
				s.a(view, 1);
	//   10   22:aload_2         
	//   11   23:iconst_1        
	//   12   24:invokestatic    #133 <Method void s.a(View, int)>
			if(!s.a(view))
	//*  13   27:aload_2         
	//*  14   28:invokestatic    #136 <Method boolean s.a(View)>
	//*  15   31:ifne            55
			{
				recyclerview$u.b(16384);
	//   16   34:aload_1         
	//   17   35:sipush          16384
	//   18   38:invokevirtual   #138 <Method void RecyclerView$u.b(int)>
				s.a(view, f.F.c());
	//   19   41:aload_2         
	//   20   42:aload_0         
	//   21   43:getfield        #28  <Field RecyclerView f>
	//   22   46:getfield        #142 <Field ai RecyclerView.F>
	//   23   49:invokevirtual   #147 <Method android.support.v4.view.a ai.c()>
	//   24   52:invokestatic    #150 <Method void s.a(View, android.support.v4.view.a)>
			}
		}
	//   25   55:return          
	}

	private void f(RecyclerView$u recyclerview$u)
	{
		if(recyclerview$u.a instanceof ViewGroup)
	//*   0    0:aload_1         
	//*   1    1:getfield        #125 <Field View RecyclerView$u.a>
	//*   2    4:instanceof      #56  <Class ViewGroup>
	//*   3    7:ifeq            22
			a((ViewGroup)recyclerview$u.a, false);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:getfield        #125 <Field View RecyclerView$u.a>
	//    7   15:checkcast       #56  <Class ViewGroup>
	//    8   18:iconst_0        
	//    9   19:invokespecial   #66  <Method void a(ViewGroup, boolean)>
	//   10   22:return          
	}

	RecyclerView$u a(int k, boolean flag, long l)
	{
		int j1;
		boolean flag2;
		Object obj;
		Object obj1;
label0:
		{
			if(k < 0 || k >= f.B.e())
	//*   0    0:iload_1         
	//*   1    1:iflt            1062
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #28  <Field RecyclerView f>
	//*   5    9:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//*   6   12:invokevirtual   #153 <Method int RecyclerView$r.e()>
	//*   7   15:icmplt          21
				break MISSING_BLOCK_LABEL_1062;
	//    8   18:goto            1062
			boolean flag3 = f.B.a();
	//    9   21:aload_0         
	//   10   22:getfield        #28  <Field RecyclerView f>
	//   11   25:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//   12   28:invokevirtual   #118 <Method boolean RecyclerView$r.a()>
	//   13   31:istore          10
			flag2 = true;
	//   14   33:iconst_1        
	//   15   34:istore          9
			RecyclerView$u recyclerview$u;
			if(flag3)
	//*  16   36:iload           10
	//*  17   38:ifeq            63
			{
				obj1 = ((Object) (f(k)));
	//   18   41:aload_0         
	//   19   42:iload_1         
	//   20   43:invokevirtual   #156 <Method RecyclerView$u f(int)>
	//   21   46:astore          16
				recyclerview$u = ((RecyclerView$u) (obj1));
	//   22   48:aload           16
	//   23   50:astore          15
				if(obj1 != null)
	//*  24   52:aload           16
	//*  25   54:ifnull          66
				{
					j1 = 1;
	//   26   57:iconst_1        
	//   27   58:istore          6
					break label0;
	//   28   60:goto            73
				}
			} else
			{
				recyclerview$u = null;
	//   29   63:aconst_null     
	//   30   64:astore          15
			}
			j1 = 0;
	//   31   66:iconst_0        
	//   32   67:istore          6
			obj1 = ((Object) (recyclerview$u));
	//   33   69:aload           15
	//   34   71:astore          16
		}
label1:
		{
			obj = obj1;
	//   35   73:aload           16
	//   36   75:astore          15
			boolean flag1 = ((boolean) (j1));
	//   37   77:iload           6
	//   38   79:istore          5
			if(obj1 == null)
	//*  39   81:aload           16
	//*  40   83:ifnonnull       191
			{
				obj1 = ((Object) (b(k, flag)));
	//   41   86:aload_0         
	//   42   87:iload_1         
	//   43   88:iload_2         
	//   44   89:invokevirtual   #159 <Method RecyclerView$u b(int, boolean)>
	//   45   92:astore          16
				obj = obj1;
	//   46   94:aload           16
	//   47   96:astore          15
				flag1 = ((boolean) (j1));
	//   48   98:iload           6
	//   49  100:istore          5
				if(obj1 != null)
	//*  50  102:aload           16
	//*  51  104:ifnull          191
					if(!a(((RecyclerView$u) (obj1))))
	//*  52  107:aload_0         
	//*  53  108:aload           16
	//*  54  110:invokevirtual   #162 <Method boolean a(RecyclerView$u)>
	//*  55  113:ifne            184
					{
						if(!flag)
	//*  56  116:iload_2         
	//*  57  117:ifne            174
						{
							((RecyclerView$u) (obj1)).b(4);
	//   58  120:aload           16
	//   59  122:iconst_4        
	//   60  123:invokevirtual   #138 <Method void RecyclerView$u.b(int)>
							if(((RecyclerView$u) (obj1)).i())
	//*  61  126:aload           16
	//*  62  128:invokevirtual   #164 <Method boolean RecyclerView$u.i()>
	//*  63  131:ifeq            155
							{
								f.removeDetachedView(((RecyclerView$u) (obj1)).a, false);
	//   64  134:aload_0         
	//   65  135:getfield        #28  <Field RecyclerView f>
	//   66  138:aload           16
	//   67  140:getfield        #125 <Field View RecyclerView$u.a>
	//   68  143:iconst_0        
	//   69  144:invokevirtual   #168 <Method void RecyclerView.removeDetachedView(View, boolean)>
								((RecyclerView$u) (obj1)).j();
	//   70  147:aload           16
	//   71  149:invokevirtual   #171 <Method void RecyclerView$u.j()>
							} else
	//*  72  152:goto            168
							if(((RecyclerView$u) (obj1)).k())
	//*  73  155:aload           16
	//*  74  157:invokevirtual   #174 <Method boolean RecyclerView$u.k()>
	//*  75  160:ifeq            168
								((RecyclerView$u) (obj1)).l();
	//   76  163:aload           16
	//   77  165:invokevirtual   #176 <Method void RecyclerView$u.l()>
							b(((RecyclerView$u) (obj1)));
	//   78  168:aload_0         
	//   79  169:aload           16
	//   80  171:invokevirtual   #178 <Method void b(RecyclerView$u)>
						}
						obj = null;
	//   81  174:aconst_null     
	//   82  175:astore          15
						flag1 = ((boolean) (j1));
	//   83  177:iload           6
	//   84  179:istore          5
					} else
	//*  85  181:goto            191
					{
						flag1 = true;
	//   86  184:iconst_1        
	//   87  185:istore          5
						obj = obj1;
	//   88  187:aload           16
	//   89  189:astore          15
					}
			}
			Object obj2 = obj;
	//   90  191:aload           15
	//   91  193:astore          17
			int k1 = ((int) (flag1));
	//   92  195:iload           5
	//   93  197:istore          7
			if(obj == null)
	//*  94  199:aload           15
	//*  95  201:ifnonnull       761
			{
				k1 = f.e.b(k);
	//   96  204:aload_0         
	//   97  205:getfield        #28  <Field RecyclerView f>
	//   98  208:getfield        #181 <Field e RecyclerView.e>
	//   99  211:iload_1         
	//  100  212:invokevirtual   #186 <Method int e.b(int)>
	//  101  215:istore          7
				if(k1 >= 0 && k1 < f.l.a())
	//* 102  217:iload           7
	//* 103  219:iflt            659
	//* 104  222:iload           7
	//* 105  224:aload_0         
	//* 106  225:getfield        #28  <Field RecyclerView f>
	//* 107  228:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//* 108  231:invokevirtual   #188 <Method int RecyclerView$a.a()>
	//* 109  234:icmplt          240
	//* 110  237:goto            659
				{
					int l1 = f.l.b(k1);
	//  111  240:aload_0         
	//  112  241:getfield        #28  <Field RecyclerView f>
	//  113  244:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//  114  247:iload           7
	//  115  249:invokevirtual   #189 <Method int RecyclerView$a.b(int)>
	//  116  252:istore          8
					obj1 = obj;
	//  117  254:aload           15
	//  118  256:astore          16
					j1 = ((int) (flag1));
	//  119  258:iload           5
	//  120  260:istore          6
					if(f.l.d())
	//* 121  262:aload_0         
	//* 122  263:getfield        #28  <Field RecyclerView f>
	//* 123  266:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//* 124  269:invokevirtual   #191 <Method boolean RecyclerView$a.d()>
	//* 125  272:ifeq            323
					{
						obj = ((Object) (a(f.l.a(k1), l1, flag)));
	//  126  275:aload_0         
	//  127  276:aload_0         
	//  128  277:getfield        #28  <Field RecyclerView f>
	//  129  280:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//  130  283:iload           7
	//  131  285:invokevirtual   #194 <Method long RecyclerView$a.a(int)>
	//  132  288:iload           8
	//  133  290:iload_2         
	//  134  291:invokevirtual   #197 <Method RecyclerView$u a(long, int, boolean)>
	//  135  294:astore          15
						obj1 = obj;
	//  136  296:aload           15
	//  137  298:astore          16
						j1 = ((int) (flag1));
	//  138  300:iload           5
	//  139  302:istore          6
						if(obj != null)
	//* 140  304:aload           15
	//* 141  306:ifnull          323
						{
							obj.c = k1;
	//  142  309:aload           15
	//  143  311:iload           7
	//  144  313:putfield        #199 <Field int RecyclerView$u.c>
							j1 = 1;
	//  145  316:iconst_1        
	//  146  317:istore          6
							obj1 = obj;
	//  147  319:aload           15
	//  148  321:astore          16
						}
					}
					obj = obj1;
	//  149  323:aload           16
	//  150  325:astore          15
					if(obj1 == null)
	//* 151  327:aload           16
	//* 152  329:ifnonnull       479
					{
						obj = obj1;
	//  153  332:aload           16
	//  154  334:astore          15
						if(i != null)
	//* 155  336:aload_0         
	//* 156  337:getfield        #201 <Field RecyclerView$s i>
	//* 157  340:ifnull          479
						{
							obj2 = ((Object) (i.a(this, k, l1)));
	//  158  343:aload_0         
	//  159  344:getfield        #201 <Field RecyclerView$s i>
	//  160  347:aload_0         
	//  161  348:iload_1         
	//  162  349:iload           8
	//  163  351:invokevirtual   #206 <Method View RecyclerView$s.a(RecyclerView$n, int, int)>
	//  164  354:astore          17
							obj = obj1;
	//  165  356:aload           16
	//  166  358:astore          15
							if(obj2 != null)
	//* 167  360:aload           17
	//* 168  362:ifnull          479
							{
								obj1 = ((Object) (f.b(((View) (obj2)))));
	//  169  365:aload_0         
	//  170  366:getfield        #28  <Field RecyclerView f>
	//  171  369:aload           17
	//  172  371:invokevirtual   #209 <Method RecyclerView$u RecyclerView.b(View)>
	//  173  374:astore          16
								if(obj1 == null)
	//* 174  376:aload           16
	//* 175  378:ifnonnull       424
								{
									obj = ((Object) (new StringBuilder()));
	//  176  381:new             #211 <Class StringBuilder>
	//  177  384:dup             
	//  178  385:invokespecial   #212 <Method void StringBuilder()>
	//  179  388:astore          15
									((StringBuilder) (obj)).append("getViewForPositionAndType returned a view which does not have a ViewHolder");
	//  180  390:aload           15
	//  181  392:ldc1            #214 <String "getViewForPositionAndType returned a view which does not have a ViewHolder">
	//  182  394:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  183  397:pop             
									((StringBuilder) (obj)).append(f.a());
	//  184  398:aload           15
	//  185  400:aload_0         
	//  186  401:getfield        #28  <Field RecyclerView f>
	//  187  404:invokevirtual   #221 <Method String RecyclerView.a()>
	//  188  407:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  189  410:pop             
									throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  190  411:new             #223 <Class IllegalArgumentException>
	//  191  414:dup             
	//  192  415:aload           15
	//  193  417:invokevirtual   #226 <Method String StringBuilder.toString()>
	//  194  420:invokespecial   #229 <Method void IllegalArgumentException(String)>
	//  195  423:athrow          
								}
								obj = obj1;
	//  196  424:aload           16
	//  197  426:astore          15
								if(((RecyclerView$u) (obj1)).c())
	//* 198  428:aload           16
	//* 199  430:invokevirtual   #231 <Method boolean RecyclerView$u.c()>
	//* 200  433:ifeq            479
								{
									obj = ((Object) (new StringBuilder()));
	//  201  436:new             #211 <Class StringBuilder>
	//  202  439:dup             
	//  203  440:invokespecial   #212 <Method void StringBuilder()>
	//  204  443:astore          15
									((StringBuilder) (obj)).append("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
	//  205  445:aload           15
	//  206  447:ldc1            #233 <String "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.">
	//  207  449:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  208  452:pop             
									((StringBuilder) (obj)).append(f.a());
	//  209  453:aload           15
	//  210  455:aload_0         
	//  211  456:getfield        #28  <Field RecyclerView f>
	//  212  459:invokevirtual   #221 <Method String RecyclerView.a()>
	//  213  462:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  214  465:pop             
									throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  215  466:new             #223 <Class IllegalArgumentException>
	//  216  469:dup             
	//  217  470:aload           15
	//  218  472:invokevirtual   #226 <Method String StringBuilder.toString()>
	//  219  475:invokespecial   #229 <Method void IllegalArgumentException(String)>
	//  220  478:athrow          
								}
							}
						}
					}
					obj1 = obj;
	//  221  479:aload           15
	//  222  481:astore          16
					if(obj == null)
	//* 223  483:aload           15
	//* 224  485:ifnonnull       533
					{
						obj = ((Object) (g().a(l1)));
	//  225  488:aload_0         
	//  226  489:invokevirtual   #236 <Method RecyclerView$m g()>
	//  227  492:iload           8
	//  228  494:invokevirtual   #238 <Method RecyclerView$u RecyclerView$m.a(int)>
	//  229  497:astore          15
						obj1 = obj;
	//  230  499:aload           15
	//  231  501:astore          16
						if(obj != null)
	//* 232  503:aload           15
	//* 233  505:ifnull          533
						{
							((RecyclerView$u) (obj)).v();
	//  234  508:aload           15
	//  235  510:invokevirtual   #241 <Method void RecyclerView$u.v()>
							obj1 = obj;
	//  236  513:aload           15
	//  237  515:astore          16
							if(RecyclerView.a)
	//* 238  517:getstatic       #244 <Field boolean RecyclerView.a>
	//* 239  520:ifeq            533
							{
								f(((RecyclerView$u) (obj)));
	//  240  523:aload_0         
	//  241  524:aload           15
	//  242  526:invokespecial   #246 <Method void f(RecyclerView$u)>
								obj1 = obj;
	//  243  529:aload           15
	//  244  531:astore          16
							}
						}
					}
					obj2 = obj1;
	//  245  533:aload           16
	//  246  535:astore          17
					k1 = j1;
	//  247  537:iload           6
	//  248  539:istore          7
					if(obj1 == null)
	//* 249  541:aload           16
	//* 250  543:ifnonnull       761
					{
						long l2 = f.getNanoTime();
	//  251  546:aload_0         
	//  252  547:getfield        #28  <Field RecyclerView f>
	//  253  550:invokevirtual   #85  <Method long RecyclerView.getNanoTime()>
	//  254  553:lstore          11
						if(l != 0xffffffffL && !e.a(l1, l2, l))
	//* 255  555:lload_3         
	//* 256  556:ldc2w           #86  <Long 0xffffffffL>
	//* 257  559:lcmp            
	//* 258  560:ifeq            580
	//* 259  563:aload_0         
	//* 260  564:getfield        #89  <Field RecyclerView$m e>
	//* 261  567:iload           8
	//* 262  569:lload           11
	//* 263  571:lload_3         
	//* 264  572:invokevirtual   #248 <Method boolean RecyclerView$m.a(int, long, long)>
	//* 265  575:ifne            580
							return null;
	//  266  578:aconst_null     
	//  267  579:areturn         
						obj = ((Object) (f.l.c(((ViewGroup) (f)), l1)));
	//  268  580:aload_0         
	//  269  581:getfield        #28  <Field RecyclerView f>
	//  270  584:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//  271  587:aload_0         
	//  272  588:getfield        #28  <Field RecyclerView f>
	//  273  591:iload           8
	//  274  593:invokevirtual   #251 <Method RecyclerView$u RecyclerView$a.c(ViewGroup, int)>
	//  275  596:astore          15
						if(RecyclerView.z())
	//* 276  598:invokestatic    #254 <Method boolean RecyclerView.z()>
	//* 277  601:ifeq            633
						{
							obj1 = ((Object) (RecyclerView.j(((RecyclerView$u) (obj)).a)));
	//  278  604:aload           15
	//  279  606:getfield        #125 <Field View RecyclerView$u.a>
	//  280  609:invokestatic    #257 <Method RecyclerView RecyclerView.j(View)>
	//  281  612:astore          16
							if(obj1 != null)
	//* 282  614:aload           16
	//* 283  616:ifnull          633
								obj.b = new WeakReference(obj1);
	//  284  619:aload           15
	//  285  621:new             #259 <Class WeakReference>
	//  286  624:dup             
	//  287  625:aload           16
	//  288  627:invokespecial   #262 <Method void WeakReference(Object)>
	//  289  630:putfield        #265 <Field WeakReference RecyclerView$u.b>
						}
						long l3 = f.getNanoTime();
	//  290  633:aload_0         
	//  291  634:getfield        #28  <Field RecyclerView f>
	//  292  637:invokevirtual   #85  <Method long RecyclerView.getNanoTime()>
	//  293  640:lstore          13
						e.a(l1, l3 - l2);
	//  294  642:aload_0         
	//  295  643:getfield        #89  <Field RecyclerView$m e>
	//  296  646:iload           8
	//  297  648:lload           13
	//  298  650:lload           11
	//  299  652:lsub            
	//  300  653:invokevirtual   #267 <Method void RecyclerView$m.a(int, long)>
						break label1;
	//  301  656:goto            769
					}
				} else
				{
					obj = ((Object) (new StringBuilder()));
	//  302  659:new             #211 <Class StringBuilder>
	//  303  662:dup             
	//  304  663:invokespecial   #212 <Method void StringBuilder()>
	//  305  666:astore          15
					((StringBuilder) (obj)).append("Inconsistency detected. Invalid item position ");
	//  306  668:aload           15
	//  307  670:ldc2            #269 <String "Inconsistency detected. Invalid item position ">
	//  308  673:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  309  676:pop             
					((StringBuilder) (obj)).append(k);
	//  310  677:aload           15
	//  311  679:iload_1         
	//  312  680:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
	//  313  683:pop             
					((StringBuilder) (obj)).append("(offset:");
	//  314  684:aload           15
	//  315  686:ldc2            #274 <String "(offset:">
	//  316  689:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  317  692:pop             
					((StringBuilder) (obj)).append(k1);
	//  318  693:aload           15
	//  319  695:iload           7
	//  320  697:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
	//  321  700:pop             
					((StringBuilder) (obj)).append(").");
	//  322  701:aload           15
	//  323  703:ldc2            #276 <String ").">
	//  324  706:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  325  709:pop             
					((StringBuilder) (obj)).append("state:");
	//  326  710:aload           15
	//  327  712:ldc2            #278 <String "state:">
	//  328  715:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  329  718:pop             
					((StringBuilder) (obj)).append(f.B.e());
	//  330  719:aload           15
	//  331  721:aload_0         
	//  332  722:getfield        #28  <Field RecyclerView f>
	//  333  725:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//  334  728:invokevirtual   #153 <Method int RecyclerView$r.e()>
	//  335  731:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
	//  336  734:pop             
					((StringBuilder) (obj)).append(f.a());
	//  337  735:aload           15
	//  338  737:aload_0         
	//  339  738:getfield        #28  <Field RecyclerView f>
	//  340  741:invokevirtual   #221 <Method String RecyclerView.a()>
	//  341  744:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  342  747:pop             
					throw new IndexOutOfBoundsException(((StringBuilder) (obj)).toString());
	//  343  748:new             #280 <Class IndexOutOfBoundsException>
	//  344  751:dup             
	//  345  752:aload           15
	//  346  754:invokevirtual   #226 <Method String StringBuilder.toString()>
	//  347  757:invokespecial   #281 <Method void IndexOutOfBoundsException(String)>
	//  348  760:athrow          
				}
			}
			obj = obj2;
	//  349  761:aload           17
	//  350  763:astore          15
			j1 = k1;
	//  351  765:iload           7
	//  352  767:istore          6
		}
label2:
		{
label3:
			{
				if(j1 != 0 && !f.B.a() && ((RecyclerView$u) (obj)).a(8192))
	//* 353  769:iload           6
	//* 354  771:ifeq            870
	//* 355  774:aload_0         
	//* 356  775:getfield        #28  <Field RecyclerView f>
	//* 357  778:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//* 358  781:invokevirtual   #118 <Method boolean RecyclerView$r.a()>
	//* 359  784:ifne            870
	//* 360  787:aload           15
	//* 361  789:sipush          8192
	//* 362  792:invokevirtual   #284 <Method boolean RecyclerView$u.a(int)>
	//* 363  795:ifeq            870
				{
					((RecyclerView$u) (obj)).a(0, 8192);
	//  364  798:aload           15
	//  365  800:iconst_0        
	//  366  801:sipush          8192
	//  367  804:invokevirtual   #287 <Method void RecyclerView$u.a(int, int)>
					if(f.B.i)
	//* 368  807:aload_0         
	//* 369  808:getfield        #28  <Field RecyclerView f>
	//* 370  811:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//* 371  814:getfield        #289 <Field boolean RecyclerView$r.i>
	//* 372  817:ifeq            870
					{
						int i1 = RecyclerView$e.e(((RecyclerView$u) (obj)));
	//  373  820:aload           15
	//  374  822:invokestatic    #294 <Method int RecyclerView$e.e(RecyclerView$u)>
	//  375  825:istore          5
						obj1 = ((Object) (f.x.a(f.B, ((RecyclerView$u) (obj)), i1 | 0x1000, ((RecyclerView$u) (obj)).u())));
	//  376  827:aload_0         
	//  377  828:getfield        #28  <Field RecyclerView f>
	//  378  831:getfield        #298 <Field RecyclerView$e RecyclerView.x>
	//  379  834:aload_0         
	//  380  835:getfield        #28  <Field RecyclerView f>
	//  381  838:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//  382  841:aload           15
	//  383  843:iload           5
	//  384  845:sipush          4096
	//  385  848:ior             
	//  386  849:aload           15
	//  387  851:invokevirtual   #302 <Method List RecyclerView$u.u()>
	//  388  854:invokevirtual   #305 <Method RecyclerView$e$c RecyclerView$e.a(RecyclerView$r, RecyclerView$u, int, List)>
	//  389  857:astore          16
						f.a(((RecyclerView$u) (obj)), ((c) (obj1)));
	//  390  859:aload_0         
	//  391  860:getfield        #28  <Field RecyclerView f>
	//  392  863:aload           15
	//  393  865:aload           16
	//  394  867:invokevirtual   #308 <Method void RecyclerView.a(RecyclerView$u, RecyclerView$e$c)>
					}
				}
				if(f.B.a() && ((RecyclerView$u) (obj)).p())
	//* 395  870:aload_0         
	//* 396  871:getfield        #28  <Field RecyclerView f>
	//* 397  874:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//* 398  877:invokevirtual   #118 <Method boolean RecyclerView$r.a()>
	//* 399  880:ifeq            900
	//* 400  883:aload           15
	//* 401  885:invokevirtual   #311 <Method boolean RecyclerView$u.p()>
	//* 402  888:ifeq            900
					obj.g = k;
	//  403  891:aload           15
	//  404  893:iload_1         
	//  405  894:putfield        #120 <Field int RecyclerView$u.g>
				else
	//* 406  897:goto            927
				if(!((RecyclerView$u) (obj)).p() || ((RecyclerView$u) (obj)).o() || ((RecyclerView$u) (obj)).n())
	//* 407  900:aload           15
	//* 408  902:invokevirtual   #311 <Method boolean RecyclerView$u.p()>
	//* 409  905:ifeq            932
	//* 410  908:aload           15
	//* 411  910:invokevirtual   #314 <Method boolean RecyclerView$u.o()>
	//* 412  913:ifne            932
	//* 413  916:aload           15
	//* 414  918:invokevirtual   #315 <Method boolean RecyclerView$u.n()>
	//* 415  921:ifeq            927
					break label3;
	//  416  924:goto            932
				flag = false;
	//  417  927:iconst_0        
	//  418  928:istore_2        
				break label2;
	//  419  929:goto            952
			}
			flag = a(((RecyclerView$u) (obj)), f.e.b(k), k, l);
	//  420  932:aload_0         
	//  421  933:aload           15
	//  422  935:aload_0         
	//  423  936:getfield        #28  <Field RecyclerView f>
	//  424  939:getfield        #181 <Field e RecyclerView.e>
	//  425  942:iload_1         
	//  426  943:invokevirtual   #186 <Method int e.b(int)>
	//  427  946:iload_1         
	//  428  947:lload_3         
	//  429  948:invokespecial   #317 <Method boolean a(RecyclerView$u, int, int, long)>
	//  430  951:istore_2        
		}
		obj1 = ((Object) (((RecyclerView$u) (obj)).a.getLayoutParams()));
	//  431  952:aload           15
	//  432  954:getfield        #125 <Field View RecyclerView$u.a>
	//  433  957:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  434  960:astore          16
		if(obj1 != null) goto _L2; else goto _L1
	//  435  962:aload           16
	//  436  964:ifnonnull       996
_L1:
		obj1 = ((Object) (f.generateDefaultLayoutParams()));
	//  437  967:aload_0         
	//  438  968:getfield        #28  <Field RecyclerView f>
	//  439  971:invokevirtual   #326 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateDefaultLayoutParams()>
	//  440  974:astore          16
_L4:
		obj1 = ((Object) ((youtParams)obj1));
	//  441  976:aload           16
	//  442  978:checkcast       #328 <Class RecyclerView$LayoutParams>
	//  443  981:astore          16
		((RecyclerView$u) (obj)).a.setLayoutParams(((android.view.tParams) (obj1)));
	//  444  983:aload           15
	//  445  985:getfield        #125 <Field View RecyclerView$u.a>
	//  446  988:aload           16
	//  447  990:invokevirtual   #332 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		break MISSING_BLOCK_LABEL_1029;
	//  448  993:goto            1029
_L2:
		if(f.checkLayoutParams(((android.view.tParams) (obj1))))
			break; /* Loop/switch isn't completed */
	//  449  996:aload_0         
	//  450  997:getfield        #28  <Field RecyclerView f>
	//  451 1000:aload           16
	//  452 1002:invokevirtual   #336 <Method boolean RecyclerView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//  453 1005:ifne            1022
		obj1 = ((Object) (f.generateLayoutParams(((android.view.tParams) (obj1)))));
	//  454 1008:aload_0         
	//  455 1009:getfield        #28  <Field RecyclerView f>
	//  456 1012:aload           16
	//  457 1014:invokevirtual   #340 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//  458 1017:astore          16
		if(true) goto _L4; else goto _L3
	//  459 1019:goto            976
_L3:
		obj1 = ((Object) ((youtParams)obj1));
	//  460 1022:aload           16
	//  461 1024:checkcast       #328 <Class RecyclerView$LayoutParams>
	//  462 1027:astore          16
		obj1.c = ((RecyclerView$u) (obj));
	//  463 1029:aload           16
	//  464 1031:aload           15
	//  465 1033:putfield        #343 <Field RecyclerView$u RecyclerView$LayoutParams.c>
		if(j1 != 0 && flag)
	//* 466 1036:iload           6
	//* 467 1038:ifeq            1051
	//* 468 1041:iload_2         
	//* 469 1042:ifeq            1051
			flag = flag2;
	//  470 1045:iload           9
	//  471 1047:istore_2        
		else
	//* 472 1048:goto            1053
			flag = false;
	//  473 1051:iconst_0        
	//  474 1052:istore_2        
		obj1.f = flag;
	//  475 1053:aload           16
	//  476 1055:iload_2         
	//  477 1056:putfield        #345 <Field boolean RecyclerView$LayoutParams.f>
		return ((RecyclerView$u) (obj));
	//  478 1059:aload           15
	//  479 1061:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//  480 1062:new             #211 <Class StringBuilder>
	//  481 1065:dup             
	//  482 1066:invokespecial   #212 <Method void StringBuilder()>
	//  483 1069:astore          15
		stringbuilder.append("Invalid item position ");
	//  484 1071:aload           15
	//  485 1073:ldc2            #347 <String "Invalid item position ">
	//  486 1076:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  487 1079:pop             
		stringbuilder.append(k);
	//  488 1080:aload           15
	//  489 1082:iload_1         
	//  490 1083:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
	//  491 1086:pop             
		stringbuilder.append("(");
	//  492 1087:aload           15
	//  493 1089:ldc2            #349 <String "(">
	//  494 1092:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  495 1095:pop             
		stringbuilder.append(k);
	//  496 1096:aload           15
	//  497 1098:iload_1         
	//  498 1099:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
	//  499 1102:pop             
		stringbuilder.append("). Item count:");
	//  500 1103:aload           15
	//  501 1105:ldc2            #351 <String "). Item count:">
	//  502 1108:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  503 1111:pop             
		stringbuilder.append(f.B.e());
	//  504 1112:aload           15
	//  505 1114:aload_0         
	//  506 1115:getfield        #28  <Field RecyclerView f>
	//  507 1118:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//  508 1121:invokevirtual   #153 <Method int RecyclerView$r.e()>
	//  509 1124:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
	//  510 1127:pop             
		stringbuilder.append(f.a());
	//  511 1128:aload           15
	//  512 1130:aload_0         
	//  513 1131:getfield        #28  <Field RecyclerView f>
	//  514 1134:invokevirtual   #221 <Method String RecyclerView.a()>
	//  515 1137:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  516 1140:pop             
		throw new IndexOutOfBoundsException(stringbuilder.toString());
	//  517 1141:new             #280 <Class IndexOutOfBoundsException>
	//  518 1144:dup             
	//  519 1145:aload           15
	//  520 1147:invokevirtual   #226 <Method String StringBuilder.toString()>
	//  521 1150:invokespecial   #281 <Method void IndexOutOfBoundsException(String)>
	//  522 1153:athrow          
	}

	RecyclerView$u a(long l, int k, boolean flag)
	{
		for(int i1 = a.size() - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field ArrayList a>
	//*   2    4:invokevirtual   #354 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore          5
	//*   6   11:iload           5
	//*   7   13:iflt            142
		{
			RecyclerView$u recyclerview$u = (RecyclerView$u)a.get(i1);
	//    8   16:aload_0         
	//    9   17:getfield        #36  <Field ArrayList a>
	//   10   20:iload           5
	//   11   22:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   12   25:checkcast       #76  <Class RecyclerView$u>
	//   13   28:astore          6
			if(recyclerview$u.g() != l || recyclerview$u.k())
				continue;
	//   14   30:aload           6
	//   15   32:invokevirtual   #360 <Method long RecyclerView$u.g()>
	//   16   35:lload_1         
	//   17   36:lcmp            
	//   18   37:ifne            133
	//   19   40:aload           6
	//   20   42:invokevirtual   #174 <Method boolean RecyclerView$u.k()>
	//   21   45:ifne            133
			if(k == recyclerview$u.h())
	//*  22   48:iload_3         
	//*  23   49:aload           6
	//*  24   51:invokevirtual   #81  <Method int RecyclerView$u.h()>
	//*  25   54:icmpne          96
			{
				recyclerview$u.b(32);
	//   26   57:aload           6
	//   27   59:bipush          32
	//   28   61:invokevirtual   #138 <Method void RecyclerView$u.b(int)>
				if(recyclerview$u.q() && !f.B.a())
	//*  29   64:aload           6
	//*  30   66:invokevirtual   #363 <Method boolean RecyclerView$u.q()>
	//*  31   69:ifeq            93
	//*  32   72:aload_0         
	//*  33   73:getfield        #28  <Field RecyclerView f>
	//*  34   76:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//*  35   79:invokevirtual   #118 <Method boolean RecyclerView$r.a()>
	//*  36   82:ifne            93
					recyclerview$u.a(2, 14);
	//   37   85:aload           6
	//   38   87:iconst_2        
	//   39   88:bipush          14
	//   40   90:invokevirtual   #287 <Method void RecyclerView$u.a(int, int)>
				return recyclerview$u;
	//   41   93:aload           6
	//   42   95:areturn         
			}
			if(!flag)
	//*  43   96:iload           4
	//*  44   98:ifne            133
			{
				a.remove(i1);
	//   45  101:aload_0         
	//   46  102:getfield        #36  <Field ArrayList a>
	//   47  105:iload           5
	//   48  107:invokevirtual   #366 <Method Object ArrayList.remove(int)>
	//   49  110:pop             
				f.removeDetachedView(recyclerview$u.a, false);
	//   50  111:aload_0         
	//   51  112:getfield        #28  <Field RecyclerView f>
	//   52  115:aload           6
	//   53  117:getfield        #125 <Field View RecyclerView$u.a>
	//   54  120:iconst_0        
	//   55  121:invokevirtual   #168 <Method void RecyclerView.removeDetachedView(View, boolean)>
				b(recyclerview$u.a);
	//   56  124:aload_0         
	//   57  125:aload           6
	//   58  127:getfield        #125 <Field View RecyclerView$u.a>
	//   59  130:invokevirtual   #369 <Method void b(View)>
			}
		}

	//   60  133:iload           5
	//   61  135:iconst_1        
	//   62  136:isub            
	//   63  137:istore          5
	//*  64  139:goto            11
		for(int j1 = c.size() - 1; j1 >= 0; j1--)
	//*  65  142:aload_0         
	//*  66  143:getfield        #40  <Field ArrayList c>
	//*  67  146:invokevirtual   #354 <Method int ArrayList.size()>
	//*  68  149:iconst_1        
	//*  69  150:isub            
	//*  70  151:istore          5
	//*  71  153:iload           5
	//*  72  155:iflt            231
		{
			RecyclerView$u recyclerview$u1 = (RecyclerView$u)c.get(j1);
	//   73  158:aload_0         
	//   74  159:getfield        #40  <Field ArrayList c>
	//   75  162:iload           5
	//   76  164:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   77  167:checkcast       #76  <Class RecyclerView$u>
	//   78  170:astore          6
			if(recyclerview$u1.g() != l)
				continue;
	//   79  172:aload           6
	//   80  174:invokevirtual   #360 <Method long RecyclerView$u.g()>
	//   81  177:lload_1         
	//   82  178:lcmp            
	//   83  179:ifne            222
			if(k == recyclerview$u1.h())
	//*  84  182:iload_3         
	//*  85  183:aload           6
	//*  86  185:invokevirtual   #81  <Method int RecyclerView$u.h()>
	//*  87  188:icmpne          209
			{
				if(!flag)
	//*  88  191:iload           4
	//*  89  193:ifne            206
					c.remove(j1);
	//   90  196:aload_0         
	//   91  197:getfield        #40  <Field ArrayList c>
	//   92  200:iload           5
	//   93  202:invokevirtual   #366 <Method Object ArrayList.remove(int)>
	//   94  205:pop             
				return recyclerview$u1;
	//   95  206:aload           6
	//   96  208:areturn         
			}
			if(!flag)
	//*  97  209:iload           4
	//*  98  211:ifne            222
			{
				d(j1);
	//   99  214:aload_0         
	//  100  215:iload           5
	//  101  217:invokevirtual   #371 <Method void d(int)>
				return null;
	//  102  220:aconst_null     
	//  103  221:areturn         
			}
		}

	//  104  222:iload           5
	//  105  224:iconst_1        
	//  106  225:isub            
	//  107  226:istore          5
	//* 108  228:goto            153
		return null;
	//  109  231:aconst_null     
	//  110  232:areturn         
	}

	View a(int k, boolean flag)
	{
		return a(k, flag, 0xffffffffL).a;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:ldc2w           #86  <Long 0xffffffffL>
	//    4    6:invokevirtual   #374 <Method RecyclerView$u a(int, boolean, long)>
	//    5    9:getfield        #125 <Field View RecyclerView$u.a>
	//    6   12:areturn         
	}

	public void a()
	{
		a.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ArrayList a>
	//    2    4:invokevirtual   #377 <Method void ArrayList.clear()>
		d();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #379 <Method void d()>
	//    5   11:return          
	}

	public void a(int k)
	{
		h = k;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field int h>
		b();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #381 <Method void b()>
	//    5    9:return          
	}

	void a(int k, int l)
	{
		int i1;
		int j1;
		byte byte0;
		if(k < l)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          16
		{
			i1 = k;
	//    3    5:iload_1         
	//    4    6:istore_3        
			j1 = l;
	//    5    7:iload_2         
	//    6    8:istore          4
			byte0 = -1;
	//    7   10:iconst_m1       
	//    8   11:istore          5
		} else
	//*   9   13:goto            24
		{
			j1 = k;
	//   10   16:iload_1         
	//   11   17:istore          4
			i1 = l;
	//   12   19:iload_2         
	//   13   20:istore_3        
			byte0 = 1;
	//   14   21:iconst_1        
	//   15   22:istore          5
		}
		int l1 = c.size();
	//   16   24:aload_0         
	//   17   25:getfield        #40  <Field ArrayList c>
	//   18   28:invokevirtual   #354 <Method int ArrayList.size()>
	//   19   31:istore          7
		for(int k1 = 0; k1 < l1; k1++)
	//*  20   33:iconst_0        
	//*  21   34:istore          6
	//*  22   36:iload           6
	//*  23   38:iload           7
	//*  24   40:icmpge          122
		{
			RecyclerView$u recyclerview$u = (RecyclerView$u)c.get(k1);
	//   25   43:aload_0         
	//   26   44:getfield        #40  <Field ArrayList c>
	//   27   47:iload           6
	//   28   49:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   29   52:checkcast       #76  <Class RecyclerView$u>
	//   30   55:astore          8
			if(recyclerview$u == null || recyclerview$u.c < i1 || recyclerview$u.c > j1)
	//*  31   57:aload           8
	//*  32   59:ifnull          113
	//*  33   62:aload           8
	//*  34   64:getfield        #199 <Field int RecyclerView$u.c>
	//*  35   67:iload_3         
	//*  36   68:icmplt          113
	//*  37   71:aload           8
	//*  38   73:getfield        #199 <Field int RecyclerView$u.c>
	//*  39   76:iload           4
	//*  40   78:icmple          84
				continue;
	//   41   81:goto            113
			if(recyclerview$u.c == k)
	//*  42   84:aload           8
	//*  43   86:getfield        #199 <Field int RecyclerView$u.c>
	//*  44   89:iload_1         
	//*  45   90:icmpne          105
				recyclerview$u.a(l - k, false);
	//   46   93:aload           8
	//   47   95:iload_2         
	//   48   96:iload_1         
	//   49   97:isub            
	//   50   98:iconst_0        
	//   51   99:invokevirtual   #384 <Method void RecyclerView$u.a(int, boolean)>
			else
	//*  52  102:goto            113
				recyclerview$u.a(((int) (byte0)), false);
	//   53  105:aload           8
	//   54  107:iload           5
	//   55  109:iconst_0        
	//   56  110:invokevirtual   #384 <Method void RecyclerView$u.a(int, boolean)>
		}

	//   57  113:iload           6
	//   58  115:iconst_1        
	//   59  116:iadd            
	//   60  117:istore          6
	//*  61  119:goto            36
	//   62  122:return          
	}

	void a(int k, int l, boolean flag)
	{
		for(int i1 = c.size() - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field ArrayList c>
	//*   2    4:invokevirtual   #354 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore          4
	//*   6   11:iload           4
	//*   7   13:iflt            88
		{
			RecyclerView$u recyclerview$u = (RecyclerView$u)c.get(i1);
	//    8   16:aload_0         
	//    9   17:getfield        #40  <Field ArrayList c>
	//   10   20:iload           4
	//   11   22:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   12   25:checkcast       #76  <Class RecyclerView$u>
	//   13   28:astore          5
			if(recyclerview$u == null)
				continue;
	//   14   30:aload           5
	//   15   32:ifnull          79
			if(recyclerview$u.c >= k + l)
	//*  16   35:aload           5
	//*  17   37:getfield        #199 <Field int RecyclerView$u.c>
	//*  18   40:iload_1         
	//*  19   41:iload_2         
	//*  20   42:iadd            
	//*  21   43:icmplt          57
			{
				recyclerview$u.a(-l, flag);
	//   22   46:aload           5
	//   23   48:iload_2         
	//   24   49:ineg            
	//   25   50:iload_3         
	//   26   51:invokevirtual   #384 <Method void RecyclerView$u.a(int, boolean)>
				continue;
	//   27   54:goto            79
			}
			if(recyclerview$u.c >= k)
	//*  28   57:aload           5
	//*  29   59:getfield        #199 <Field int RecyclerView$u.c>
	//*  30   62:iload_1         
	//*  31   63:icmplt          79
			{
				recyclerview$u.b(8);
	//   32   66:aload           5
	//   33   68:bipush          8
	//   34   70:invokevirtual   #138 <Method void RecyclerView$u.b(int)>
				d(i1);
	//   35   73:aload_0         
	//   36   74:iload           4
	//   37   76:invokevirtual   #371 <Method void d(int)>
			}
		}

	//   38   79:iload           4
	//   39   81:iconst_1        
	//   40   82:isub            
	//   41   83:istore          4
	//*  42   85:goto            11
	//   43   88:return          
	}

	void a(RecyclerView$a recyclerview$a, RecyclerView$a recyclerview$a1, boolean flag)
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #388 <Method void a()>
		g().a(recyclerview$a, recyclerview$a1, flag);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #236 <Method RecyclerView$m g()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #390 <Method void RecyclerView$m.a(RecyclerView$a, RecyclerView$a, boolean)>
	//    8   14:return          
	}

	void a(RecyclerView$m recyclerview$m)
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field RecyclerView$m e>
	//*   2    4:ifnull          14
			e.b();
	//    3    7:aload_0         
	//    4    8:getfield        #89  <Field RecyclerView$m e>
	//    5   11:invokevirtual   #392 <Method void RecyclerView$m.b()>
		e = recyclerview$m;
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:putfield        #89  <Field RecyclerView$m e>
		if(recyclerview$m != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          37
			e.a(f.getAdapter());
	//   11   23:aload_0         
	//   12   24:getfield        #89  <Field RecyclerView$m e>
	//   13   27:aload_0         
	//   14   28:getfield        #28  <Field RecyclerView f>
	//   15   31:invokevirtual   #396 <Method RecyclerView$a RecyclerView.getAdapter()>
	//   16   34:invokevirtual   #399 <Method void RecyclerView$m.a(RecyclerView$a)>
	//   17   37:return          
	}

	void a(RecyclerView$s recyclerview$s)
	{
		i = recyclerview$s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #201 <Field RecyclerView$s i>
	//    3    5:return          
	}

	void a(RecyclerView$u recyclerview$u, boolean flag)
	{
		RecyclerView.c(recyclerview$u);
	//    0    0:aload_1         
	//    1    1:invokestatic    #403 <Method void RecyclerView.c(RecyclerView$u)>
		if(recyclerview$u.a(16384))
	//*   2    4:aload_1         
	//*   3    5:sipush          16384
	//*   4    8:invokevirtual   #284 <Method boolean RecyclerView$u.a(int)>
	//*   5   11:ifeq            30
		{
			recyclerview$u.a(0, 16384);
	//    6   14:aload_1         
	//    7   15:iconst_0        
	//    8   16:sipush          16384
	//    9   19:invokevirtual   #287 <Method void RecyclerView$u.a(int, int)>
			s.a(recyclerview$u.a, ((android.support.v4.view.a) (null)));
	//   10   22:aload_1         
	//   11   23:getfield        #125 <Field View RecyclerView$u.a>
	//   12   26:aconst_null     
	//   13   27:invokestatic    #150 <Method void s.a(View, android.support.v4.view.a)>
		}
		if(flag)
	//*  14   30:iload_2         
	//*  15   31:ifeq            39
			d(recyclerview$u);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #405 <Method void d(RecyclerView$u)>
		recyclerview$u.m = null;
	//   19   39:aload_1         
	//   20   40:aconst_null     
	//   21   41:putfield        #79  <Field RecyclerView RecyclerView$u.m>
		g().a(recyclerview$u);
	//   22   44:aload_0         
	//   23   45:invokevirtual   #236 <Method RecyclerView$m g()>
	//   24   48:aload_1         
	//   25   49:invokevirtual   #407 <Method void RecyclerView$m.a(RecyclerView$u)>
	//   26   52:return          
	}

	public void a(View view)
	{
		RecyclerView$u recyclerview$u = RecyclerView.e(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #409 <Method RecyclerView$u RecyclerView.e(View)>
	//    2    4:astore_2        
		if(recyclerview$u.r())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #412 <Method boolean RecyclerView$u.r()>
	//*   5    9:ifeq            21
			f.removeDetachedView(view, false);
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field RecyclerView f>
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #168 <Method void RecyclerView.removeDetachedView(View, boolean)>
		if(recyclerview$u.i())
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #164 <Method boolean RecyclerView$u.i()>
	//*  13   25:ifeq            35
			recyclerview$u.j();
	//   14   28:aload_2         
	//   15   29:invokevirtual   #171 <Method void RecyclerView$u.j()>
		else
	//*  16   32:goto            46
		if(recyclerview$u.k())
	//*  17   35:aload_2         
	//*  18   36:invokevirtual   #174 <Method boolean RecyclerView$u.k()>
	//*  19   39:ifeq            46
			recyclerview$u.l();
	//   20   42:aload_2         
	//   21   43:invokevirtual   #176 <Method void RecyclerView$u.l()>
		b(recyclerview$u);
	//   22   46:aload_0         
	//   23   47:aload_2         
	//   24   48:invokevirtual   #178 <Method void b(RecyclerView$u)>
	//   25   51:return          
	}

	boolean a(RecyclerView$u recyclerview$u)
	{
		if(recyclerview$u.q())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #363 <Method boolean RecyclerView$u.q()>
	//*   2    4:ifeq            18
			return f.B.a();
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field RecyclerView f>
	//    5   11:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//    6   14:invokevirtual   #118 <Method boolean RecyclerView$r.a()>
	//    7   17:ireturn         
		if(recyclerview$u.c >= 0 && recyclerview$u.c < f.l.a())
	//*   8   18:aload_1         
	//*   9   19:getfield        #199 <Field int RecyclerView$u.c>
	//*  10   22:iflt            126
	//*  11   25:aload_1         
	//*  12   26:getfield        #199 <Field int RecyclerView$u.c>
	//*  13   29:aload_0         
	//*  14   30:getfield        #28  <Field RecyclerView f>
	//*  15   33:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//*  16   36:invokevirtual   #188 <Method int RecyclerView$a.a()>
	//*  17   39:icmplt          45
	//*  18   42:goto            126
		{
			boolean flag1 = f.B.a();
	//   19   45:aload_0         
	//   20   46:getfield        #28  <Field RecyclerView f>
	//   21   49:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//   22   52:invokevirtual   #118 <Method boolean RecyclerView$r.a()>
	//   23   55:istore_3        
			boolean flag = false;
	//   24   56:iconst_0        
	//   25   57:istore_2        
			if(!flag1 && f.l.b(recyclerview$u.c) != recyclerview$u.h())
	//*  26   58:iload_3         
	//*  27   59:ifne            85
	//*  28   62:aload_0         
	//*  29   63:getfield        #28  <Field RecyclerView f>
	//*  30   66:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//*  31   69:aload_1         
	//*  32   70:getfield        #199 <Field int RecyclerView$u.c>
	//*  33   73:invokevirtual   #189 <Method int RecyclerView$a.b(int)>
	//*  34   76:aload_1         
	//*  35   77:invokevirtual   #81  <Method int RecyclerView$u.h()>
	//*  36   80:icmpeq          85
				return false;
	//   37   83:iconst_0        
	//   38   84:ireturn         
			if(f.l.d())
	//*  39   85:aload_0         
	//*  40   86:getfield        #28  <Field RecyclerView f>
	//*  41   89:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//*  42   92:invokevirtual   #191 <Method boolean RecyclerView$a.d()>
	//*  43   95:ifeq            124
			{
				if(recyclerview$u.g() == f.l.a(recyclerview$u.c))
	//*  44   98:aload_1         
	//*  45   99:invokevirtual   #360 <Method long RecyclerView$u.g()>
	//*  46  102:aload_0         
	//*  47  103:getfield        #28  <Field RecyclerView f>
	//*  48  106:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//*  49  109:aload_1         
	//*  50  110:getfield        #199 <Field int RecyclerView$u.c>
	//*  51  113:invokevirtual   #194 <Method long RecyclerView$a.a(int)>
	//*  52  116:lcmp            
	//*  53  117:ifne            122
					flag = true;
	//   54  120:iconst_1        
	//   55  121:istore_2        
				return flag;
	//   56  122:iload_2         
	//   57  123:ireturn         
			} else
			{
				return true;
	//   58  124:iconst_1        
	//   59  125:ireturn         
			}
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   60  126:new             #211 <Class StringBuilder>
	//   61  129:dup             
	//   62  130:invokespecial   #212 <Method void StringBuilder()>
	//   63  133:astore          4
			stringbuilder.append("Inconsistency detected. Invalid view holder adapter position");
	//   64  135:aload           4
	//   65  137:ldc2            #414 <String "Inconsistency detected. Invalid view holder adapter position">
	//   66  140:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   67  143:pop             
			stringbuilder.append(((Object) (recyclerview$u)));
	//   68  144:aload           4
	//   69  146:aload_1         
	//   70  147:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   71  150:pop             
			stringbuilder.append(f.a());
	//   72  151:aload           4
	//   73  153:aload_0         
	//   74  154:getfield        #28  <Field RecyclerView f>
	//   75  157:invokevirtual   #221 <Method String RecyclerView.a()>
	//   76  160:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   77  163:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   78  164:new             #280 <Class IndexOutOfBoundsException>
	//   79  167:dup             
	//   80  168:aload           4
	//   81  170:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   82  173:invokespecial   #281 <Method void IndexOutOfBoundsException(String)>
	//   83  176:athrow          
		}
	}

	public int b(int k)
	{
		if(k >= 0 && k < f.B.e())
	//*   0    0:iload_1         
	//*   1    1:iflt            48
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #28  <Field RecyclerView f>
	//*   5    9:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//*   6   12:invokevirtual   #153 <Method int RecyclerView$r.e()>
	//*   7   15:icmplt          21
	//*   8   18:goto            48
		{
			if(!f.B.a())
	//*   9   21:aload_0         
	//*  10   22:getfield        #28  <Field RecyclerView f>
	//*  11   25:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//*  12   28:invokevirtual   #118 <Method boolean RecyclerView$r.a()>
	//*  13   31:ifne            36
				return k;
	//   14   34:iload_1         
	//   15   35:ireturn         
			else
				return f.e.b(k);
	//   16   36:aload_0         
	//   17   37:getfield        #28  <Field RecyclerView f>
	//   18   40:getfield        #181 <Field e RecyclerView.e>
	//   19   43:iload_1         
	//   20   44:invokevirtual   #186 <Method int e.b(int)>
	//   21   47:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   22   48:new             #211 <Class StringBuilder>
	//   23   51:dup             
	//   24   52:invokespecial   #212 <Method void StringBuilder()>
	//   25   55:astore_2        
			stringbuilder.append("invalid position ");
	//   26   56:aload_2         
	//   27   57:ldc2            #419 <String "invalid position ">
	//   28   60:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
			stringbuilder.append(k);
	//   30   64:aload_2         
	//   31   65:iload_1         
	//   32   66:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
	//   33   69:pop             
			stringbuilder.append(". State ");
	//   34   70:aload_2         
	//   35   71:ldc2            #421 <String ". State ">
	//   36   74:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:pop             
			stringbuilder.append("item count is ");
	//   38   78:aload_2         
	//   39   79:ldc2            #423 <String "item count is ">
	//   40   82:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   41   85:pop             
			stringbuilder.append(f.B.e());
	//   42   86:aload_2         
	//   43   87:aload_0         
	//   44   88:getfield        #28  <Field RecyclerView f>
	//   45   91:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//   46   94:invokevirtual   #153 <Method int RecyclerView$r.e()>
	//   47   97:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
	//   48  100:pop             
			stringbuilder.append(f.a());
	//   49  101:aload_2         
	//   50  102:aload_0         
	//   51  103:getfield        #28  <Field RecyclerView f>
	//   52  106:invokevirtual   #221 <Method String RecyclerView.a()>
	//   53  109:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   54  112:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   55  113:new             #280 <Class IndexOutOfBoundsException>
	//   56  116:dup             
	//   57  117:aload_2         
	//   58  118:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   59  121:invokespecial   #281 <Method void IndexOutOfBoundsException(String)>
	//   60  124:athrow          
		}
	}

	RecyclerView$u b(int k, boolean flag)
	{
		int j1 = a.size();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ArrayList a>
	//    2    4:invokevirtual   #354 <Method int ArrayList.size()>
	//    3    7:istore          5
		boolean flag1 = false;
	//    4    9:iconst_0        
	//    5   10:istore          4
		for(int l = 0; l < j1; l++)
	//*   6   12:iconst_0        
	//*   7   13:istore_3        
	//*   8   14:iload_3         
	//*   9   15:iload           5
	//*  10   17:icmpge          96
		{
			RecyclerView$u recyclerview$u = (RecyclerView$u)a.get(l);
	//   11   20:aload_0         
	//   12   21:getfield        #36  <Field ArrayList a>
	//   13   24:iload_3         
	//   14   25:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   15   28:checkcast       #76  <Class RecyclerView$u>
	//   16   31:astore          6
			if(!recyclerview$u.k() && recyclerview$u.d() == k && !recyclerview$u.n() && (f.B.f || !recyclerview$u.q()))
	//*  17   33:aload           6
	//*  18   35:invokevirtual   #174 <Method boolean RecyclerView$u.k()>
	//*  19   38:ifne            89
	//*  20   41:aload           6
	//*  21   43:invokevirtual   #425 <Method int RecyclerView$u.d()>
	//*  22   46:iload_1         
	//*  23   47:icmpne          89
	//*  24   50:aload           6
	//*  25   52:invokevirtual   #315 <Method boolean RecyclerView$u.n()>
	//*  26   55:ifne            89
	//*  27   58:aload_0         
	//*  28   59:getfield        #28  <Field RecyclerView f>
	//*  29   62:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//*  30   65:getfield        #426 <Field boolean RecyclerView$r.f>
	//*  31   68:ifne            79
	//*  32   71:aload           6
	//*  33   73:invokevirtual   #363 <Method boolean RecyclerView$u.q()>
	//*  34   76:ifne            89
			{
				recyclerview$u.b(32);
	//   35   79:aload           6
	//   36   81:bipush          32
	//   37   83:invokevirtual   #138 <Method void RecyclerView$u.b(int)>
				return recyclerview$u;
	//   38   86:aload           6
	//   39   88:areturn         
			}
		}

	//   40   89:iload_3         
	//   41   90:iconst_1        
	//   42   91:iadd            
	//   43   92:istore_3        
	//*  44   93:goto            14
		if(!flag)
	//*  45   96:iload_2         
	//*  46   97:ifne            235
		{
			Object obj = ((Object) (f.f.c(k)));
	//   47  100:aload_0         
	//   48  101:getfield        #28  <Field RecyclerView f>
	//   49  104:getfield        #429 <Field t RecyclerView.f>
	//   50  107:iload_1         
	//   51  108:invokevirtual   #433 <Method View t.c(int)>
	//   52  111:astore          7
			if(obj != null)
	//*  53  113:aload           7
	//*  54  115:ifnull          235
			{
				RecyclerView$u recyclerview$u1 = RecyclerView.e(((View) (obj)));
	//   55  118:aload           7
	//   56  120:invokestatic    #409 <Method RecyclerView$u RecyclerView.e(View)>
	//   57  123:astore          6
				f.f.e(((View) (obj)));
	//   58  125:aload_0         
	//   59  126:getfield        #28  <Field RecyclerView f>
	//   60  129:getfield        #429 <Field t RecyclerView.f>
	//   61  132:aload           7
	//   62  134:invokevirtual   #435 <Method void t.e(View)>
				k = f.f.b(((View) (obj)));
	//   63  137:aload_0         
	//   64  138:getfield        #28  <Field RecyclerView f>
	//   65  141:getfield        #429 <Field t RecyclerView.f>
	//   66  144:aload           7
	//   67  146:invokevirtual   #437 <Method int t.b(View)>
	//   68  149:istore_1        
				if(k == -1)
	//*  69  150:iload_1         
	//*  70  151:iconst_m1       
	//*  71  152:icmpne          207
				{
					obj = ((Object) (new StringBuilder()));
	//   72  155:new             #211 <Class StringBuilder>
	//   73  158:dup             
	//   74  159:invokespecial   #212 <Method void StringBuilder()>
	//   75  162:astore          7
					((StringBuilder) (obj)).append("layout index should not be -1 after unhiding a view:");
	//   76  164:aload           7
	//   77  166:ldc2            #439 <String "layout index should not be -1 after unhiding a view:">
	//   78  169:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   79  172:pop             
					((StringBuilder) (obj)).append(((Object) (recyclerview$u1)));
	//   80  173:aload           7
	//   81  175:aload           6
	//   82  177:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   83  180:pop             
					((StringBuilder) (obj)).append(f.a());
	//   84  181:aload           7
	//   85  183:aload_0         
	//   86  184:getfield        #28  <Field RecyclerView f>
	//   87  187:invokevirtual   #221 <Method String RecyclerView.a()>
	//   88  190:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   89  193:pop             
					throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   90  194:new             #441 <Class IllegalStateException>
	//   91  197:dup             
	//   92  198:aload           7
	//   93  200:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   94  203:invokespecial   #442 <Method void IllegalStateException(String)>
	//   95  206:athrow          
				} else
				{
					f.f.e(k);
	//   96  207:aload_0         
	//   97  208:getfield        #28  <Field RecyclerView f>
	//   98  211:getfield        #429 <Field t RecyclerView.f>
	//   99  214:iload_1         
	//  100  215:invokevirtual   #444 <Method void t.e(int)>
					c(((View) (obj)));
	//  101  218:aload_0         
	//  102  219:aload           7
	//  103  221:invokevirtual   #446 <Method void c(View)>
					recyclerview$u1.b(8224);
	//  104  224:aload           6
	//  105  226:sipush          8224
	//  106  229:invokevirtual   #138 <Method void RecyclerView$u.b(int)>
					return recyclerview$u1;
	//  107  232:aload           6
	//  108  234:areturn         
				}
			}
		}
		j1 = c.size();
	//  109  235:aload_0         
	//  110  236:getfield        #40  <Field ArrayList c>
	//  111  239:invokevirtual   #354 <Method int ArrayList.size()>
	//  112  242:istore          5
		for(int i1 = ((int) (flag1)); i1 < j1; i1++)
	//* 113  244:iload           4
	//* 114  246:istore_3        
	//* 115  247:iload_3         
	//* 116  248:iload           5
	//* 117  250:icmpge          306
		{
			RecyclerView$u recyclerview$u2 = (RecyclerView$u)c.get(i1);
	//  118  253:aload_0         
	//  119  254:getfield        #40  <Field ArrayList c>
	//  120  257:iload_3         
	//  121  258:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//  122  261:checkcast       #76  <Class RecyclerView$u>
	//  123  264:astore          6
			if(!recyclerview$u2.n() && recyclerview$u2.d() == k)
	//* 124  266:aload           6
	//* 125  268:invokevirtual   #315 <Method boolean RecyclerView$u.n()>
	//* 126  271:ifne            299
	//* 127  274:aload           6
	//* 128  276:invokevirtual   #425 <Method int RecyclerView$u.d()>
	//* 129  279:iload_1         
	//* 130  280:icmpne          299
			{
				if(!flag)
	//* 131  283:iload_2         
	//* 132  284:ifne            296
					c.remove(i1);
	//  133  287:aload_0         
	//  134  288:getfield        #40  <Field ArrayList c>
	//  135  291:iload_3         
	//  136  292:invokevirtual   #366 <Method Object ArrayList.remove(int)>
	//  137  295:pop             
				return recyclerview$u2;
	//  138  296:aload           6
	//  139  298:areturn         
			}
		}

	//  140  299:iload_3         
	//  141  300:iconst_1        
	//  142  301:iadd            
	//  143  302:istore_3        
	//* 144  303:goto            247
		return null;
	//  145  306:aconst_null     
	//  146  307:areturn         
	}

	void b()
	{
		int k;
		if(f.m != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field RecyclerView f>
	//*   2    4:getfield        #449 <Field RecyclerView$h RecyclerView.m>
	//*   3    7:ifnull          24
			k = f.m.x;
	//    4   10:aload_0         
	//    5   11:getfield        #28  <Field RecyclerView f>
	//    6   14:getfield        #449 <Field RecyclerView$h RecyclerView.m>
	//    7   17:getfield        #453 <Field int RecyclerView$h.x>
	//    8   20:istore_1        
		else
	//*   9   21:goto            26
			k = 0;
	//   10   24:iconst_0        
	//   11   25:istore_1        
		d = h + k;
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #50  <Field int h>
	//   15   31:iload_1         
	//   16   32:iadd            
	//   17   33:putfield        #52  <Field int d>
		for(int l = c.size() - 1; l >= 0 && c.size() > d; l--)
	//*  18   36:aload_0         
	//*  19   37:getfield        #40  <Field ArrayList c>
	//*  20   40:invokevirtual   #354 <Method int ArrayList.size()>
	//*  21   43:iconst_1        
	//*  22   44:isub            
	//*  23   45:istore_1        
	//*  24   46:iload_1         
	//*  25   47:iflt            76
	//*  26   50:aload_0         
	//*  27   51:getfield        #40  <Field ArrayList c>
	//*  28   54:invokevirtual   #354 <Method int ArrayList.size()>
	//*  29   57:aload_0         
	//*  30   58:getfield        #52  <Field int d>
	//*  31   61:icmple          76
			d(l);
	//   32   64:aload_0         
	//   33   65:iload_1         
	//   34   66:invokevirtual   #371 <Method void d(int)>

	//   35   69:iload_1         
	//   36   70:iconst_1        
	//   37   71:isub            
	//   38   72:istore_1        
	//*  39   73:goto            46
	//   40   76:return          
	}

	void b(int k, int l)
	{
		int j1 = c.size();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field ArrayList c>
	//    2    4:invokevirtual   #354 <Method int ArrayList.size()>
	//    3    7:istore          4
		for(int i1 = 0; i1 < j1; i1++)
	//*   4    9:iconst_0        
	//*   5   10:istore_3        
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:icmpge          58
		{
			RecyclerView$u recyclerview$u = (RecyclerView$u)c.get(i1);
	//    9   17:aload_0         
	//   10   18:getfield        #40  <Field ArrayList c>
	//   11   21:iload_3         
	//   12   22:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #76  <Class RecyclerView$u>
	//   14   28:astore          5
			if(recyclerview$u != null && recyclerview$u.c >= k)
	//*  15   30:aload           5
	//*  16   32:ifnull          51
	//*  17   35:aload           5
	//*  18   37:getfield        #199 <Field int RecyclerView$u.c>
	//*  19   40:iload_1         
	//*  20   41:icmplt          51
				recyclerview$u.a(l, true);
	//   21   44:aload           5
	//   22   46:iload_2         
	//   23   47:iconst_1        
	//   24   48:invokevirtual   #384 <Method void RecyclerView$u.a(int, boolean)>
		}

	//   25   51:iload_3         
	//   26   52:iconst_1        
	//   27   53:iadd            
	//   28   54:istore_3        
	//*  29   55:goto            11
	//   30   58:return          
	}

	void b(RecyclerView$u recyclerview$u)
	{
		boolean flag5 = recyclerview$u.i();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #164 <Method boolean RecyclerView$u.i()>
	//    2    4:istore          6
		boolean flag4 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		boolean flag3 = false;
	//    5    9:iconst_0        
	//    6   10:istore          4
		if(!flag5 && recyclerview$u.a.getParent() == null)
	//*   7   12:iload           6
	//*   8   14:ifne            404
	//*   9   17:aload_1         
	//*  10   18:getfield        #125 <Field View RecyclerView$u.a>
	//*  11   21:invokevirtual   #457 <Method android.view.ViewParent View.getParent()>
	//*  12   24:ifnull          30
	//*  13   27:goto            404
		{
			if(recyclerview$u.r())
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #412 <Method boolean RecyclerView$u.r()>
	//*  16   34:ifeq            88
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   17   37:new             #211 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:invokespecial   #212 <Method void StringBuilder()>
	//   20   44:astore          7
				stringbuilder.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
	//   21   46:aload           7
	//   22   48:ldc2            #459 <String "Tmp detached view should be removed from RecyclerView before it can be recycled: ">
	//   23   51:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:pop             
				stringbuilder.append(((Object) (recyclerview$u)));
	//   25   55:aload           7
	//   26   57:aload_1         
	//   27   58:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   28   61:pop             
				stringbuilder.append(f.a());
	//   29   62:aload           7
	//   30   64:aload_0         
	//   31   65:getfield        #28  <Field RecyclerView f>
	//   32   68:invokevirtual   #221 <Method String RecyclerView.a()>
	//   33   71:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   34   74:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   35   75:new             #223 <Class IllegalArgumentException>
	//   36   78:dup             
	//   37   79:aload           7
	//   38   81:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   39   84:invokespecial   #229 <Method void IllegalArgumentException(String)>
	//   40   87:athrow          
			}
			if(recyclerview$u.c())
	//*  41   88:aload_1         
	//*  42   89:invokevirtual   #231 <Method boolean RecyclerView$u.c()>
	//*  43   92:ifeq            135
			{
				recyclerview$u = ((RecyclerView$u) (new StringBuilder()));
	//   44   95:new             #211 <Class StringBuilder>
	//   45   98:dup             
	//   46   99:invokespecial   #212 <Method void StringBuilder()>
	//   47  102:astore_1        
				((StringBuilder) (recyclerview$u)).append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
	//   48  103:aload_1         
	//   49  104:ldc2            #461 <String "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.">
	//   50  107:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   51  110:pop             
				((StringBuilder) (recyclerview$u)).append(f.a());
	//   52  111:aload_1         
	//   53  112:aload_0         
	//   54  113:getfield        #28  <Field RecyclerView f>
	//   55  116:invokevirtual   #221 <Method String RecyclerView.a()>
	//   56  119:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   57  122:pop             
				throw new IllegalArgumentException(((StringBuilder) (recyclerview$u)).toString());
	//   58  123:new             #223 <Class IllegalArgumentException>
	//   59  126:dup             
	//   60  127:aload_1         
	//   61  128:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   62  131:invokespecial   #229 <Method void IllegalArgumentException(String)>
	//   63  134:athrow          
			}
			flag4 = RecyclerView$u.a(recyclerview$u);
	//   64  135:aload_1         
	//   65  136:invokestatic    #462 <Method boolean RecyclerView$u.a(RecyclerView$u)>
	//   66  139:istore          5
			boolean flag;
			if(f.l != null && flag4 && f.l.b(recyclerview$u))
	//*  67  141:aload_0         
	//*  68  142:getfield        #28  <Field RecyclerView f>
	//*  69  145:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//*  70  148:ifnull          175
	//*  71  151:iload           5
	//*  72  153:ifeq            175
	//*  73  156:aload_0         
	//*  74  157:getfield        #28  <Field RecyclerView f>
	//*  75  160:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//*  76  163:aload_1         
	//*  77  164:invokevirtual   #464 <Method boolean RecyclerView$a.b(RecyclerView$u)>
	//*  78  167:ifeq            175
				flag = true;
	//   79  170:iconst_1        
	//   80  171:istore_2        
			else
	//*  81  172:goto            177
				flag = false;
	//   82  175:iconst_0        
	//   83  176:istore_2        
			int l;
			if(!flag && !recyclerview$u.w())
	//*  84  177:iload_2         
	//*  85  178:ifne            202
	//*  86  181:aload_1         
	//*  87  182:invokevirtual   #467 <Method boolean RecyclerView$u.w()>
	//*  88  185:ifeq            191
	//*  89  188:goto            202
			{
				boolean flag1 = false;
	//   90  191:iconst_0        
	//   91  192:istore_2        
				l = ((int) (flag3));
	//   92  193:iload           4
	//   93  195:istore_3        
				flag3 = flag1;
	//   94  196:iload_2         
	//   95  197:istore          4
			} else
	//*  96  199:goto            373
			{
				boolean flag2;
				if(d > 0 && !recyclerview$u.a(526))
	//*  97  202:aload_0         
	//*  98  203:getfield        #52  <Field int d>
	//*  99  206:ifle            350
	//* 100  209:aload_1         
	//* 101  210:sipush          526
	//* 102  213:invokevirtual   #284 <Method boolean RecyclerView$u.a(int)>
	//* 103  216:ifne            350
				{
					l = c.size();
	//  104  219:aload_0         
	//  105  220:getfield        #40  <Field ArrayList c>
	//  106  223:invokevirtual   #354 <Method int ArrayList.size()>
	//  107  226:istore_3        
					int k = l;
	//  108  227:iload_3         
	//  109  228:istore_2        
					if(l >= d)
	//* 110  229:iload_3         
	//* 111  230:aload_0         
	//* 112  231:getfield        #52  <Field int d>
	//* 113  234:icmplt          252
					{
						k = l;
	//  114  237:iload_3         
	//  115  238:istore_2        
						if(l > 0)
	//* 116  239:iload_3         
	//* 117  240:ifle            252
						{
							d(0);
	//  118  243:aload_0         
	//  119  244:iconst_0        
	//  120  245:invokevirtual   #371 <Method void d(int)>
							k = l - 1;
	//  121  248:iload_3         
	//  122  249:iconst_1        
	//  123  250:isub            
	//  124  251:istore_2        
						}
					}
					l = k;
	//  125  252:iload_2         
	//  126  253:istore_3        
					if(RecyclerView.z())
	//* 127  254:invokestatic    #254 <Method boolean RecyclerView.z()>
	//* 128  257:ifeq            336
					{
						l = k;
	//  129  260:iload_2         
	//  130  261:istore_3        
						if(k > 0)
	//* 131  262:iload_2         
	//* 132  263:ifle            336
						{
							l = k;
	//  133  266:iload_2         
	//  134  267:istore_3        
							if(!f.A.a(recyclerview$u.c))
	//* 135  268:aload_0         
	//* 136  269:getfield        #28  <Field RecyclerView f>
	//* 137  272:getfield        #471 <Field ad$a RecyclerView.A>
	//* 138  275:aload_1         
	//* 139  276:getfield        #199 <Field int RecyclerView$u.c>
	//* 140  279:invokevirtual   #474 <Method boolean ad$a.a(int)>
	//* 141  282:ifne            336
							{
								k--;
	//  142  285:iload_2         
	//  143  286:iconst_1        
	//  144  287:isub            
	//  145  288:istore_2        
								do
								{
									if(k < 0)
										break;
	//  146  289:iload_2         
	//  147  290:iflt            332
									l = ((RecyclerView$u)c.get(k)).c;
	//  148  293:aload_0         
	//  149  294:getfield        #40  <Field ArrayList c>
	//  150  297:iload_2         
	//  151  298:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//  152  301:checkcast       #76  <Class RecyclerView$u>
	//  153  304:getfield        #199 <Field int RecyclerView$u.c>
	//  154  307:istore_3        
									if(!f.A.a(l))
	//* 155  308:aload_0         
	//* 156  309:getfield        #28  <Field RecyclerView f>
	//* 157  312:getfield        #471 <Field ad$a RecyclerView.A>
	//* 158  315:iload_3         
	//* 159  316:invokevirtual   #474 <Method boolean ad$a.a(int)>
	//* 160  319:ifne            325
										break;
	//  161  322:goto            332
									k--;
	//  162  325:iload_2         
	//  163  326:iconst_1        
	//  164  327:isub            
	//  165  328:istore_2        
								} while(true);
	//  166  329:goto            289
								l = k + 1;
	//  167  332:iload_2         
	//  168  333:iconst_1        
	//  169  334:iadd            
	//  170  335:istore_3        
							}
						}
					}
					c.add(l, ((Object) (recyclerview$u)));
	//  171  336:aload_0         
	//  172  337:getfield        #40  <Field ArrayList c>
	//  173  340:iload_3         
	//  174  341:aload_1         
	//  175  342:invokevirtual   #478 <Method void ArrayList.add(int, Object)>
					flag2 = true;
	//  176  345:iconst_1        
	//  177  346:istore_2        
				} else
	//* 178  347:goto            352
				{
					flag2 = false;
	//  179  350:iconst_0        
	//  180  351:istore_2        
				}
				l = ((int) (flag3));
	//  181  352:iload           4
	//  182  354:istore_3        
				flag3 = flag2;
	//  183  355:iload_2         
	//  184  356:istore          4
				if(!flag2)
	//* 185  358:iload_2         
	//* 186  359:ifne            373
				{
					a(recyclerview$u, true);
	//  187  362:aload_0         
	//  188  363:aload_1         
	//  189  364:iconst_1        
	//  190  365:invokevirtual   #480 <Method void a(RecyclerView$u, boolean)>
					l = 1;
	//  191  368:iconst_1        
	//  192  369:istore_3        
					flag3 = flag2;
	//  193  370:iload_2         
	//  194  371:istore          4
				}
			}
			f.g.g(recyclerview$u);
	//  195  373:aload_0         
	//  196  374:getfield        #28  <Field RecyclerView f>
	//  197  377:getfield        #483 <Field bc RecyclerView.g>
	//  198  380:aload_1         
	//  199  381:invokevirtual   #487 <Method void bc.g(RecyclerView$u)>
			if(!flag3 && l == 0 && flag4)
	//* 200  384:iload           4
	//* 201  386:ifne            403
	//* 202  389:iload_3         
	//* 203  390:ifne            403
	//* 204  393:iload           5
	//* 205  395:ifeq            403
				recyclerview$u.m = null;
	//  206  398:aload_1         
	//  207  399:aconst_null     
	//  208  400:putfield        #79  <Field RecyclerView RecyclerView$u.m>
			return;
	//  209  403:return          
		}
		StringBuilder stringbuilder1 = new StringBuilder();
	//  210  404:new             #211 <Class StringBuilder>
	//  211  407:dup             
	//  212  408:invokespecial   #212 <Method void StringBuilder()>
	//  213  411:astore          7
		stringbuilder1.append("Scrapped or attached views may not be recycled. isScrap:");
	//  214  413:aload           7
	//  215  415:ldc2            #489 <String "Scrapped or attached views may not be recycled. isScrap:">
	//  216  418:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  217  421:pop             
		stringbuilder1.append(recyclerview$u.i());
	//  218  422:aload           7
	//  219  424:aload_1         
	//  220  425:invokevirtual   #164 <Method boolean RecyclerView$u.i()>
	//  221  428:invokevirtual   #492 <Method StringBuilder StringBuilder.append(boolean)>
	//  222  431:pop             
		stringbuilder1.append(" isAttached:");
	//  223  432:aload           7
	//  224  434:ldc2            #494 <String " isAttached:">
	//  225  437:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  226  440:pop             
		if(recyclerview$u.a.getParent() != null)
	//* 227  441:aload_1         
	//* 228  442:getfield        #125 <Field View RecyclerView$u.a>
	//* 229  445:invokevirtual   #457 <Method android.view.ViewParent View.getParent()>
	//* 230  448:ifnull          454
			flag4 = true;
	//  231  451:iconst_1        
	//  232  452:istore          5
		stringbuilder1.append(flag4);
	//  233  454:aload           7
	//  234  456:iload           5
	//  235  458:invokevirtual   #492 <Method StringBuilder StringBuilder.append(boolean)>
	//  236  461:pop             
		stringbuilder1.append(f.a());
	//  237  462:aload           7
	//  238  464:aload_0         
	//  239  465:getfield        #28  <Field RecyclerView f>
	//  240  468:invokevirtual   #221 <Method String RecyclerView.a()>
	//  241  471:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  242  474:pop             
		throw new IllegalArgumentException(stringbuilder1.toString());
	//  243  475:new             #223 <Class IllegalArgumentException>
	//  244  478:dup             
	//  245  479:aload           7
	//  246  481:invokevirtual   #226 <Method String StringBuilder.toString()>
	//  247  484:invokespecial   #229 <Method void IllegalArgumentException(String)>
	//  248  487:athrow          
	}

	void b(View view)
	{
		view = ((View) (RecyclerView.e(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #409 <Method RecyclerView$u RecyclerView.e(View)>
	//    2    4:astore_1        
		RecyclerView$u.a(((RecyclerView$u) (view)), ((RecyclerView$n) (null)));
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokestatic    #497 <Method RecyclerView$n RecyclerView$u.a(RecyclerView$u, RecyclerView$n)>
	//    6   10:pop             
		RecyclerView$u.a(((RecyclerView$u) (view)), false);
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #500 <Method boolean RecyclerView$u.a(RecyclerView$u, boolean)>
	//   10   16:pop             
		((RecyclerView$u) (view)).l();
	//   11   17:aload_1         
	//   12   18:invokevirtual   #176 <Method void RecyclerView$u.l()>
		b(((RecyclerView$u) (view)));
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:invokevirtual   #178 <Method void b(RecyclerView$u)>
	//   16   26:return          
	}

	public View c(int k)
	{
		return a(k, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #502 <Method View a(int, boolean)>
	//    4    6:areturn         
	}

	public List c()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field List g>
	//    2    4:areturn         
	}

	void c(int k, int l)
	{
		for(int i1 = c.size() - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field ArrayList c>
	//*   2    4:invokevirtual   #354 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_3        
	//*   6   10:iload_3         
	//*   7   11:iflt            74
		{
			RecyclerView$u recyclerview$u = (RecyclerView$u)c.get(i1);
	//    8   14:aload_0         
	//    9   15:getfield        #40  <Field ArrayList c>
	//   10   18:iload_3         
	//   11   19:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #76  <Class RecyclerView$u>
	//   13   25:astore          5
			if(recyclerview$u == null)
	//*  14   27:aload           5
	//*  15   29:ifnonnull       35
				continue;
	//   16   32:goto            67
			int j1 = recyclerview$u.c;
	//   17   35:aload           5
	//   18   37:getfield        #199 <Field int RecyclerView$u.c>
	//   19   40:istore          4
			if(j1 >= k && j1 < l + k)
	//*  20   42:iload           4
	//*  21   44:iload_1         
	//*  22   45:icmplt          67
	//*  23   48:iload           4
	//*  24   50:iload_2         
	//*  25   51:iload_1         
	//*  26   52:iadd            
	//*  27   53:icmpge          67
			{
				recyclerview$u.b(2);
	//   28   56:aload           5
	//   29   58:iconst_2        
	//   30   59:invokevirtual   #138 <Method void RecyclerView$u.b(int)>
				d(i1);
	//   31   62:aload_0         
	//   32   63:iload_3         
	//   33   64:invokevirtual   #371 <Method void d(int)>
			}
		}

	//   34   67:iload_3         
	//   35   68:iconst_1        
	//   36   69:isub            
	//   37   70:istore_3        
	//*  38   71:goto            10
	//   39   74:return          
	}

	void c(RecyclerView$u recyclerview$u)
	{
		ArrayList arraylist;
		if(RecyclerView$u.b(recyclerview$u))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #505 <Method boolean RecyclerView$u.b(RecyclerView$u)>
	//*   2    4:ifeq            21
			arraylist = b;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field ArrayList b>
	//    5   11:astore_2        
		else
	//*   6   12:aload_2         
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #508 <Method boolean ArrayList.remove(Object)>
	//*   9   17:pop             
	//*  10   18:goto            29
			arraylist = a;
	//   11   21:aload_0         
	//   12   22:getfield        #36  <Field ArrayList a>
	//   13   25:astore_2        
		arraylist.remove(((Object) (recyclerview$u)));
	//*  14   26:goto            12
		RecyclerView$u.a(recyclerview$u, ((RecyclerView$n) (null)));
	//   15   29:aload_1         
	//   16   30:aconst_null     
	//   17   31:invokestatic    #497 <Method RecyclerView$n RecyclerView$u.a(RecyclerView$u, RecyclerView$n)>
	//   18   34:pop             
		RecyclerView$u.a(recyclerview$u, false);
	//   19   35:aload_1         
	//   20   36:iconst_0        
	//   21   37:invokestatic    #500 <Method boolean RecyclerView$u.a(RecyclerView$u, boolean)>
	//   22   40:pop             
		recyclerview$u.l();
	//   23   41:aload_1         
	//   24   42:invokevirtual   #176 <Method void RecyclerView$u.l()>
	//   25   45:return          
	}

	void c(View view)
	{
		RecyclerView$u recyclerview$u = RecyclerView.e(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #409 <Method RecyclerView$u RecyclerView.e(View)>
	//    2    4:astore_2        
		if(!recyclerview$u.a(12) && recyclerview$u.x() && !f.b(recyclerview$u))
	//*   3    5:aload_2         
	//*   4    6:bipush          12
	//*   5    8:invokevirtual   #284 <Method boolean RecyclerView$u.a(int)>
	//*   6   11:ifne            67
	//*   7   14:aload_2         
	//*   8   15:invokevirtual   #510 <Method boolean RecyclerView$u.x()>
	//*   9   18:ifeq            67
	//*  10   21:aload_0         
	//*  11   22:getfield        #28  <Field RecyclerView f>
	//*  12   25:aload_2         
	//*  13   26:invokevirtual   #511 <Method boolean RecyclerView.b(RecyclerView$u)>
	//*  14   29:ifeq            35
	//*  15   32:goto            67
		{
			if(b == null)
	//*  16   35:aload_0         
	//*  17   36:getfield        #38  <Field ArrayList b>
	//*  18   39:ifnonnull       53
				b = new ArrayList();
	//   19   42:aload_0         
	//   20   43:new             #33  <Class ArrayList>
	//   21   46:dup             
	//   22   47:invokespecial   #34  <Method void ArrayList()>
	//   23   50:putfield        #38  <Field ArrayList b>
			recyclerview$u.a(this, true);
	//   24   53:aload_2         
	//   25   54:aload_0         
	//   26   55:iconst_1        
	//   27   56:invokevirtual   #514 <Method void RecyclerView$u.a(RecyclerView$n, boolean)>
			view = ((View) (b));
	//   28   59:aload_0         
	//   29   60:getfield        #38  <Field ArrayList b>
	//   30   63:astore_1        
		} else
	//*  31   64:goto            145
		{
			if(recyclerview$u.n() && !recyclerview$u.q() && !f.l.d())
	//*  32   67:aload_2         
	//*  33   68:invokevirtual   #315 <Method boolean RecyclerView$u.n()>
	//*  34   71:ifeq            134
	//*  35   74:aload_2         
	//*  36   75:invokevirtual   #363 <Method boolean RecyclerView$u.q()>
	//*  37   78:ifne            134
	//*  38   81:aload_0         
	//*  39   82:getfield        #28  <Field RecyclerView f>
	//*  40   85:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//*  41   88:invokevirtual   #191 <Method boolean RecyclerView$a.d()>
	//*  42   91:ifne            134
			{
				view = ((View) (new StringBuilder()));
	//   43   94:new             #211 <Class StringBuilder>
	//   44   97:dup             
	//   45   98:invokespecial   #212 <Method void StringBuilder()>
	//   46  101:astore_1        
				((StringBuilder) (view)).append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
	//   47  102:aload_1         
	//   48  103:ldc2            #516 <String "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.">
	//   49  106:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   50  109:pop             
				((StringBuilder) (view)).append(f.a());
	//   51  110:aload_1         
	//   52  111:aload_0         
	//   53  112:getfield        #28  <Field RecyclerView f>
	//   54  115:invokevirtual   #221 <Method String RecyclerView.a()>
	//   55  118:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   56  121:pop             
				throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   57  122:new             #223 <Class IllegalArgumentException>
	//   58  125:dup             
	//   59  126:aload_1         
	//   60  127:invokevirtual   #226 <Method String StringBuilder.toString()>
	//   61  130:invokespecial   #229 <Method void IllegalArgumentException(String)>
	//   62  133:athrow          
			}
			recyclerview$u.a(this, false);
	//   63  134:aload_2         
	//   64  135:aload_0         
	//   65  136:iconst_0        
	//   66  137:invokevirtual   #514 <Method void RecyclerView$u.a(RecyclerView$n, boolean)>
			view = ((View) (a));
	//   67  140:aload_0         
	//   68  141:getfield        #36  <Field ArrayList a>
	//   69  144:astore_1        
		}
		((ArrayList) (view)).add(((Object) (recyclerview$u)));
	//   70  145:aload_1         
	//   71  146:aload_2         
	//   72  147:invokevirtual   #518 <Method boolean ArrayList.add(Object)>
	//   73  150:pop             
	//   74  151:return          
	}

	void d()
	{
		for(int k = c.size() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field ArrayList c>
	//*   2    4:invokevirtual   #354 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            26
			d(k);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #371 <Method void d(int)>

	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:istore_1        
	//*  15   23:goto            10
		c.clear();
	//   16   26:aload_0         
	//   17   27:getfield        #40  <Field ArrayList c>
	//   18   30:invokevirtual   #377 <Method void ArrayList.clear()>
		if(RecyclerView.z())
	//*  19   33:invokestatic    #254 <Method boolean RecyclerView.z()>
	//*  20   36:ifeq            49
			f.A.a();
	//   21   39:aload_0         
	//   22   40:getfield        #28  <Field RecyclerView f>
	//   23   43:getfield        #471 <Field ad$a RecyclerView.A>
	//   24   46:invokevirtual   #519 <Method void ad$a.a()>
	//   25   49:return          
	}

	void d(int k)
	{
		a((RecyclerView$u)c.get(k), true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field ArrayList c>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//    5    9:checkcast       #76  <Class RecyclerView$u>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #480 <Method void a(RecyclerView$u, boolean)>
		c.remove(k);
	//    8   16:aload_0         
	//    9   17:getfield        #40  <Field ArrayList c>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #366 <Method Object ArrayList.remove(int)>
	//   12   24:pop             
	//   13   25:return          
	}

	void d(RecyclerView$u recyclerview$u)
	{
		if(f.n != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field RecyclerView f>
	//*   2    4:getfield        #522 <Field RecyclerView$o RecyclerView.n>
	//*   3    7:ifnull          23
			f.n.a(recyclerview$u);
	//    4   10:aload_0         
	//    5   11:getfield        #28  <Field RecyclerView f>
	//    6   14:getfield        #522 <Field RecyclerView$o RecyclerView.n>
	//    7   17:aload_1         
	//    8   18:invokeinterface #525 <Method void RecyclerView$o.a(RecyclerView$u)>
		if(f.l != null)
	//*   9   23:aload_0         
	//*  10   24:getfield        #28  <Field RecyclerView f>
	//*  11   27:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//*  12   30:ifnull          44
			f.l.a(recyclerview$u);
	//   13   33:aload_0         
	//   14   34:getfield        #28  <Field RecyclerView f>
	//   15   37:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//   16   40:aload_1         
	//   17   41:invokevirtual   #526 <Method void RecyclerView$a.a(RecyclerView$u)>
		if(f.B != null)
	//*  18   44:aload_0         
	//*  19   45:getfield        #28  <Field RecyclerView f>
	//*  20   48:getfield        #113 <Field RecyclerView$r RecyclerView.B>
	//*  21   51:ifnull          65
			f.g.g(recyclerview$u);
	//   22   54:aload_0         
	//   23   55:getfield        #28  <Field RecyclerView f>
	//   24   58:getfield        #483 <Field bc RecyclerView.g>
	//   25   61:aload_1         
	//   26   62:invokevirtual   #487 <Method void bc.g(RecyclerView$u)>
	//   27   65:return          
	}

	int e()
	{
		return a.size();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ArrayList a>
	//    2    4:invokevirtual   #354 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	View e(int k)
	{
		return ((RecyclerView$u)a.get(k)).a;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ArrayList a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #76  <Class RecyclerView$u>
	//    5   11:getfield        #125 <Field View RecyclerView$u.a>
	//    6   14:areturn         
	}

	RecyclerView$u f(int k)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field ArrayList b>
	//*   2    4:ifnull          193
		{
			int i1 = b.size();
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field ArrayList b>
	//    5   11:invokevirtual   #354 <Method int ArrayList.size()>
	//    6   14:istore          4
			if(i1 == 0)
	//*   7   16:iload           4
	//*   8   18:ifne            23
				return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
			boolean flag = false;
	//   11   23:iconst_0        
	//   12   24:istore_3        
			for(int l = 0; l < i1; l++)
	//*  13   25:iconst_0        
	//*  14   26:istore_2        
	//*  15   27:iload_2         
	//*  16   28:iload           4
	//*  17   30:icmpge          80
			{
				RecyclerView$u recyclerview$u = (RecyclerView$u)b.get(l);
	//   18   33:aload_0         
	//   19   34:getfield        #38  <Field ArrayList b>
	//   20   37:iload_2         
	//   21   38:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   22   41:checkcast       #76  <Class RecyclerView$u>
	//   23   44:astore          7
				if(!recyclerview$u.k() && recyclerview$u.d() == k)
	//*  24   46:aload           7
	//*  25   48:invokevirtual   #174 <Method boolean RecyclerView$u.k()>
	//*  26   51:ifne            73
	//*  27   54:aload           7
	//*  28   56:invokevirtual   #425 <Method int RecyclerView$u.d()>
	//*  29   59:iload_1         
	//*  30   60:icmpne          73
				{
					recyclerview$u.b(32);
	//   31   63:aload           7
	//   32   65:bipush          32
	//   33   67:invokevirtual   #138 <Method void RecyclerView$u.b(int)>
					return recyclerview$u;
	//   34   70:aload           7
	//   35   72:areturn         
				}
			}

	//   36   73:iload_2         
	//   37   74:iconst_1        
	//   38   75:iadd            
	//   39   76:istore_2        
	//*  40   77:goto            27
			if(f.l.d())
	//*  41   80:aload_0         
	//*  42   81:getfield        #28  <Field RecyclerView f>
	//*  43   84:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//*  44   87:invokevirtual   #191 <Method boolean RecyclerView$a.d()>
	//*  45   90:ifeq            193
			{
				k = f.e.b(k);
	//   46   93:aload_0         
	//   47   94:getfield        #28  <Field RecyclerView f>
	//   48   97:getfield        #181 <Field e RecyclerView.e>
	//   49  100:iload_1         
	//   50  101:invokevirtual   #186 <Method int e.b(int)>
	//   51  104:istore_1        
				if(k > 0 && k < f.l.a())
	//*  52  105:iload_1         
	//*  53  106:ifle            193
	//*  54  109:iload_1         
	//*  55  110:aload_0         
	//*  56  111:getfield        #28  <Field RecyclerView f>
	//*  57  114:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//*  58  117:invokevirtual   #188 <Method int RecyclerView$a.a()>
	//*  59  120:icmpge          193
				{
					long l1 = f.l.a(k);
	//   60  123:aload_0         
	//   61  124:getfield        #28  <Field RecyclerView f>
	//   62  127:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//   63  130:iload_1         
	//   64  131:invokevirtual   #194 <Method long RecyclerView$a.a(int)>
	//   65  134:lstore          5
					for(k = ((int) (flag)); k < i1; k++)
	//*  66  136:iload_3         
	//*  67  137:istore_1        
	//*  68  138:iload_1         
	//*  69  139:iload           4
	//*  70  141:icmpge          193
					{
						RecyclerView$u recyclerview$u1 = (RecyclerView$u)b.get(k);
	//   71  144:aload_0         
	//   72  145:getfield        #38  <Field ArrayList b>
	//   73  148:iload_1         
	//   74  149:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   75  152:checkcast       #76  <Class RecyclerView$u>
	//   76  155:astore          7
						if(!recyclerview$u1.k() && recyclerview$u1.g() == l1)
	//*  77  157:aload           7
	//*  78  159:invokevirtual   #174 <Method boolean RecyclerView$u.k()>
	//*  79  162:ifne            186
	//*  80  165:aload           7
	//*  81  167:invokevirtual   #360 <Method long RecyclerView$u.g()>
	//*  82  170:lload           5
	//*  83  172:lcmp            
	//*  84  173:ifne            186
						{
							recyclerview$u1.b(32);
	//   85  176:aload           7
	//   86  178:bipush          32
	//   87  180:invokevirtual   #138 <Method void RecyclerView$u.b(int)>
							return recyclerview$u1;
	//   88  183:aload           7
	//   89  185:areturn         
						}
					}

	//   90  186:iload_1         
	//   91  187:iconst_1        
	//   92  188:iadd            
	//   93  189:istore_1        
				}
			}
		}
	//*  94  190:goto            138
		return null;
	//   95  193:aconst_null     
	//   96  194:areturn         
	}

	void f()
	{
		a.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ArrayList a>
	//    2    4:invokevirtual   #377 <Method void ArrayList.clear()>
		if(b != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #38  <Field ArrayList b>
	//*   5   11:ifnull          21
			b.clear();
	//    6   14:aload_0         
	//    7   15:getfield        #38  <Field ArrayList b>
	//    8   18:invokevirtual   #377 <Method void ArrayList.clear()>
	//    9   21:return          
	}

	RecyclerView$m g()
	{
		if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field RecyclerView$m e>
	//*   2    4:ifnonnull       18
			e = new RecyclerView$m();
	//    3    7:aload_0         
	//    4    8:new             #91  <Class RecyclerView$m>
	//    5   11:dup             
	//    6   12:invokespecial   #527 <Method void RecyclerView$m()>
	//    7   15:putfield        #89  <Field RecyclerView$m e>
		return e;
	//    8   18:aload_0         
	//    9   19:getfield        #89  <Field RecyclerView$m e>
	//   10   22:areturn         
	}

	void h()
	{
		if(f.l != null && f.l.d())
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field RecyclerView f>
	//*   2    4:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//*   3    7:ifnull          72
	//*   4   10:aload_0         
	//*   5   11:getfield        #28  <Field RecyclerView f>
	//*   6   14:getfield        #98  <Field RecyclerView$a RecyclerView.l>
	//*   7   17:invokevirtual   #191 <Method boolean RecyclerView$a.d()>
	//*   8   20:ifeq            72
		{
			int l = c.size();
	//    9   23:aload_0         
	//   10   24:getfield        #40  <Field ArrayList c>
	//   11   27:invokevirtual   #354 <Method int ArrayList.size()>
	//   12   30:istore_2        
			for(int k = 0; k < l; k++)
	//*  13   31:iconst_0        
	//*  14   32:istore_1        
	//*  15   33:iload_1         
	//*  16   34:iload_2         
	//*  17   35:icmpge          76
			{
				RecyclerView$u recyclerview$u = (RecyclerView$u)c.get(k);
	//   18   38:aload_0         
	//   19   39:getfield        #40  <Field ArrayList c>
	//   20   42:iload_1         
	//   21   43:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   22   46:checkcast       #76  <Class RecyclerView$u>
	//   23   49:astore_3        
				if(recyclerview$u != null)
	//*  24   50:aload_3         
	//*  25   51:ifnull          65
				{
					recyclerview$u.b(6);
	//   26   54:aload_3         
	//   27   55:bipush          6
	//   28   57:invokevirtual   #138 <Method void RecyclerView$u.b(int)>
					recyclerview$u.a(((Object) (null)));
	//   29   60:aload_3         
	//   30   61:aconst_null     
	//   31   62:invokevirtual   #529 <Method void RecyclerView$u.a(Object)>
				}
			}

	//   32   65:iload_1         
	//   33   66:iconst_1        
	//   34   67:iadd            
	//   35   68:istore_1        
		} else
	//*  36   69:goto            33
		{
			d();
	//   37   72:aload_0         
	//   38   73:invokevirtual   #379 <Method void d()>
		}
	//   39   76:return          
	}

	void i()
	{
		int j1 = c.size();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field ArrayList c>
	//    2    4:invokevirtual   #354 <Method int ArrayList.size()>
	//    3    7:istore_3        
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		for(int k = 0; k < j1; k++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:iload_3         
	//*  10   14:icmpge          38
			((RecyclerView$u)c.get(k)).a();
	//   11   17:aload_0         
	//   12   18:getfield        #40  <Field ArrayList c>
	//   13   21:iload_1         
	//   14   22:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   15   25:checkcast       #76  <Class RecyclerView$u>
	//   16   28:invokevirtual   #530 <Method void RecyclerView$u.a()>

	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_1        
	//*  21   35:goto            12
		j1 = a.size();
	//   22   38:aload_0         
	//   23   39:getfield        #36  <Field ArrayList a>
	//   24   42:invokevirtual   #354 <Method int ArrayList.size()>
	//   25   45:istore_3        
		for(int l = 0; l < j1; l++)
	//*  26   46:iconst_0        
	//*  27   47:istore_1        
	//*  28   48:iload_1         
	//*  29   49:iload_3         
	//*  30   50:icmpge          74
			((RecyclerView$u)a.get(l)).a();
	//   31   53:aload_0         
	//   32   54:getfield        #36  <Field ArrayList a>
	//   33   57:iload_1         
	//   34   58:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   35   61:checkcast       #76  <Class RecyclerView$u>
	//   36   64:invokevirtual   #530 <Method void RecyclerView$u.a()>

	//   37   67:iload_1         
	//   38   68:iconst_1        
	//   39   69:iadd            
	//   40   70:istore_1        
	//*  41   71:goto            48
		if(b != null)
	//*  42   74:aload_0         
	//*  43   75:getfield        #38  <Field ArrayList b>
	//*  44   78:ifnull          117
		{
			int k1 = b.size();
	//   45   81:aload_0         
	//   46   82:getfield        #38  <Field ArrayList b>
	//   47   85:invokevirtual   #354 <Method int ArrayList.size()>
	//   48   88:istore_3        
			for(int i1 = ((int) (flag)); i1 < k1; i1++)
	//*  49   89:iload_2         
	//*  50   90:istore_1        
	//*  51   91:iload_1         
	//*  52   92:iload_3         
	//*  53   93:icmpge          117
				((RecyclerView$u)b.get(i1)).a();
	//   54   96:aload_0         
	//   55   97:getfield        #38  <Field ArrayList b>
	//   56  100:iload_1         
	//   57  101:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   58  104:checkcast       #76  <Class RecyclerView$u>
	//   59  107:invokevirtual   #530 <Method void RecyclerView$u.a()>

	//   60  110:iload_1         
	//   61  111:iconst_1        
	//   62  112:iadd            
	//   63  113:istore_1        
		}
	//*  64  114:goto            91
	//   65  117:return          
	}

	void j()
	{
		int l = c.size();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field ArrayList c>
	//    2    4:invokevirtual   #354 <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int k = 0; k < l; k++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          52
		{
			youtParams youtparams = (youtParams)((RecyclerView$u)c.get(k)).a.getLayoutParams();
	//    9   15:aload_0         
	//   10   16:getfield        #40  <Field ArrayList c>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #358 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #76  <Class RecyclerView$u>
	//   14   26:getfield        #125 <Field View RecyclerView$u.a>
	//   15   29:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   32:checkcast       #328 <Class RecyclerView$LayoutParams>
	//   17   35:astore_3        
			if(youtparams != null)
	//*  18   36:aload_3         
	//*  19   37:ifnull          45
				youtparams.e = true;
	//   20   40:aload_3         
	//   21   41:iconst_1        
	//   22   42:putfield        #532 <Field boolean RecyclerView$LayoutParams.e>
		}

	//   23   45:iload_1         
	//   24   46:iconst_1        
	//   25   47:iadd            
	//   26   48:istore_1        
	//*  27   49:goto            10
	//   28   52:return          
	}

	final ArrayList a = new ArrayList();
	ArrayList b;
	final ArrayList c = new ArrayList();
	int d;
	RecyclerView$m e;
	final RecyclerView f;
	private final List g;
	private int h;
	private RecyclerView$s i;

	public RecyclerView$n(RecyclerView recyclerview)
	{
		f = recyclerview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field RecyclerView f>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #31  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #33  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #34  <Method void ArrayList()>
	//    9   17:putfield        #36  <Field ArrayList a>
		b = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #38  <Field ArrayList b>
	//   13   25:aload_0         
	//   14   26:new             #33  <Class ArrayList>
	//   15   29:dup             
	//   16   30:invokespecial   #34  <Method void ArrayList()>
	//   17   33:putfield        #40  <Field ArrayList c>
		g = Collections.unmodifiableList(((List) (a)));
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #36  <Field ArrayList a>
	//   21   41:invokestatic    #46  <Method List Collections.unmodifiableList(List)>
	//   22   44:putfield        #48  <Field List g>
		h = 2;
	//   23   47:aload_0         
	//   24   48:iconst_2        
	//   25   49:putfield        #50  <Field int h>
		d = 2;
	//   26   52:aload_0         
	//   27   53:iconst_2        
	//   28   54:putfield        #52  <Field int d>
	//   29   57:return          
	}
}
