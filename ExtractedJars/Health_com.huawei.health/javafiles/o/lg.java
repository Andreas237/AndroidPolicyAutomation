// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;

// Referenced classes of package o:
//			kz, mq, nx, oe, 
//			ng, mm, ns, nq, 
//			mh, lp, nt, ln, 
//			oc, oa, nv, nw

public class lg extends kz
{

	public lg(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void kz(Context)>
		aa = new RectF();
	//    3    5:aload_0         
	//    4    6:new             #14  <Class RectF>
	//    5    9:dup             
	//    6   10:invokespecial   #17  <Method void RectF()>
	//    7   13:putfield        #19  <Field RectF aa>
		ac = new float[2];
	//    8   16:aload_0         
	//    9   17:iconst_2        
	//   10   18:newarray        float[]
	//   11   20:putfield        #21  <Field float[] ac>
	//   12   23:return          
	}

	public lg(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void kz(Context, AttributeSet)>
		aa = new RectF();
	//    4    6:aload_0         
	//    5    7:new             #14  <Class RectF>
	//    6   10:dup             
	//    7   11:invokespecial   #17  <Method void RectF()>
	//    8   14:putfield        #19  <Field RectF aa>
		ac = new float[2];
	//    9   17:aload_0         
	//   10   18:iconst_2        
	//   11   19:newarray        float[]
	//   12   21:putfield        #21  <Field float[] ac>
	//   13   24:return          
	}

	public lg(Context context, AttributeSet attributeset, int j)
	{
		super(context, attributeset, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #28  <Method void kz(Context, AttributeSet, int)>
		aa = new RectF();
	//    5    7:aload_0         
	//    6    8:new             #14  <Class RectF>
	//    7   11:dup             
	//    8   12:invokespecial   #17  <Method void RectF()>
	//    9   15:putfield        #19  <Field RectF aa>
		ac = new float[2];
	//   10   18:aload_0         
	//   11   19:iconst_2        
	//   12   20:newarray        float[]
	//   13   22:putfield        #21  <Field float[] ac>
	//   14   25:return          
	}

	public mh a(float f1, float f2)
	{
		if(A == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field ma A>
	//*   2    4:ifnonnull       24
		{
			if(j)
	//*   3    7:aload_0         
	//*   4    8:getfield        #38  <Field boolean j>
	//*   5   11:ifeq            22
				Log.e("MPAndroidChart", "Can't select by touch. No data set.");
	//    6   14:ldc1            #40  <String "MPAndroidChart">
	//    7   16:ldc1            #42  <String "Can't select by touch. No data set.">
	//    8   18:invokestatic    #48  <Method int Log.e(String, String)>
	//    9   21:pop             
			return null;
	//   10   22:aconst_null     
	//   11   23:areturn         
		} else
		{
			return getHighlighter().c(f2, f1);
	//   12   24:aload_0         
	//   13   25:invokevirtual   #52  <Method mq getHighlighter()>
	//   14   28:fload_2         
	//   15   29:fload_1         
	//   16   30:invokeinterface #57  <Method mh mq.c(float, float)>
	//   17   35:areturn         
		}
	}

	protected void a()
	{
		O = ((oa) (new nx()));
	//    0    0:aload_0         
	//    1    1:new             #59  <Class nx>
	//    2    4:dup             
	//    3    5:invokespecial   #60  <Method void nx()>
	//    4    8:putfield        #64  <Field oa O>
		super.a();
	//    5   11:aload_0         
	//    6   12:invokespecial   #66  <Method void kz.a()>
		q = ((nv) (new oe(O)));
	//    7   15:aload_0         
	//    8   16:new             #68  <Class oe>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #64  <Field oa O>
	//   12   24:invokespecial   #71  <Method void oe(oa)>
	//   13   27:putfield        #75  <Field nv q>
		u = ((nv) (new oe(O)));
	//   14   30:aload_0         
	//   15   31:new             #68  <Class oe>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:getfield        #64  <Field oa O>
	//   19   39:invokespecial   #71  <Method void oe(oa)>
	//   20   42:putfield        #78  <Field nv u>
		S = ((nj) (new ng(((mo) (this)), P, O)));
	//   21   45:aload_0         
	//   22   46:new             #80  <Class ng>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:aload_0         
	//   26   52:getfield        #84  <Field la P>
	//   27   55:aload_0         
	//   28   56:getfield        #64  <Field oa O>
	//   29   59:invokespecial   #87  <Method void ng(mo, la, oa)>
	//   30   62:putfield        #91  <Field nj S>
		setHighlighter(((mi) (new mm(((mo) (this))))));
	//   31   65:aload_0         
	//   32   66:new             #93  <Class mm>
	//   33   69:dup             
	//   34   70:aload_0         
	//   35   71:invokespecial   #96  <Method void mm(mo)>
	//   36   74:invokevirtual   #100 <Method void setHighlighter(mi)>
		s = ((nt) (new ns(O, l, q)));
	//   37   77:aload_0         
	//   38   78:new             #102 <Class ns>
	//   39   81:dup             
	//   40   82:aload_0         
	//   41   83:getfield        #64  <Field oa O>
	//   42   86:aload_0         
	//   43   87:getfield        #106 <Field lp l>
	//   44   90:aload_0         
	//   45   91:getfield        #75  <Field nv q>
	//   46   94:invokespecial   #109 <Method void ns(oa, lp, nv)>
	//   47   97:putfield        #113 <Field nt s>
		t = ((nt) (new ns(O, r, u)));
	//   48  100:aload_0         
	//   49  101:new             #102 <Class ns>
	//   50  104:dup             
	//   51  105:aload_0         
	//   52  106:getfield        #64  <Field oa O>
	//   53  109:aload_0         
	//   54  110:getfield        #116 <Field lp r>
	//   55  113:aload_0         
	//   56  114:getfield        #78  <Field nv u>
	//   57  117:invokespecial   #109 <Method void ns(oa, lp, nv)>
	//   58  120:putfield        #119 <Field nt t>
		x = ((nu) (new nq(O, H, q, ((kz) (this)))));
	//   59  123:aload_0         
	//   60  124:new             #121 <Class nq>
	//   61  127:dup             
	//   62  128:aload_0         
	//   63  129:getfield        #64  <Field oa O>
	//   64  132:aload_0         
	//   65  133:getfield        #125 <Field ln H>
	//   66  136:aload_0         
	//   67  137:getfield        #75  <Field nv q>
	//   68  140:aload_0         
	//   69  141:invokespecial   #128 <Method void nq(oa, ln, nv, kz)>
	//   70  144:putfield        #132 <Field nu x>
	//   71  147:return          
	}

	protected float[] c(mh mh1)
	{
		return (new float[] {
			mh1.h(), mh1.f()
		});
	//    0    0:iconst_2        
	//    1    1:newarray        float[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:aload_1         
	//    5    6:invokevirtual   #139 <Method float mh.h()>
	//    6    9:fastore         
	//    7   10:dup             
	//    8   11:iconst_1        
	//    9   12:aload_1         
	//   10   13:invokevirtual   #142 <Method float mh.f()>
	//   11   16:fastore         
	//   12   17:areturn         
	}

	public void f()
	{
		e(aa);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field RectF aa>
	//    3    5:invokevirtual   #145 <Method void e(RectF)>
		float f6 = 0.0F + aa.left;
	//    4    8:fconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field RectF aa>
	//    7   13:getfield        #149 <Field float RectF.left>
	//    8   16:fadd            
	//    9   17:fstore          6
		float f2 = 0.0F + aa.top;
	//   10   19:fconst_0        
	//   11   20:aload_0         
	//   12   21:getfield        #19  <Field RectF aa>
	//   13   24:getfield        #152 <Field float RectF.top>
	//   14   27:fadd            
	//   15   28:fstore_2        
		float f5 = 0.0F + aa.right;
	//   16   29:fconst_0        
	//   17   30:aload_0         
	//   18   31:getfield        #19  <Field RectF aa>
	//   19   34:getfield        #155 <Field float RectF.right>
	//   20   37:fadd            
	//   21   38:fstore          5
		float f1 = 0.0F + aa.bottom;
	//   22   40:fconst_0        
	//   23   41:aload_0         
	//   24   42:getfield        #19  <Field RectF aa>
	//   25   45:getfield        #158 <Field float RectF.bottom>
	//   26   48:fadd            
	//   27   49:fstore_1        
		float f3 = f2;
	//   28   50:fload_2         
	//   29   51:fstore_3        
		if(l.L())
	//*  30   52:aload_0         
	//*  31   53:getfield        #106 <Field lp l>
	//*  32   56:invokevirtual   #164 <Method boolean lp.L()>
	//*  33   59:ifeq            79
			f3 = f2 + l.b(s.e());
	//   34   62:fload_2         
	//   35   63:aload_0         
	//   36   64:getfield        #106 <Field lp l>
	//   37   67:aload_0         
	//   38   68:getfield        #113 <Field nt s>
	//   39   71:invokevirtual   #169 <Method android.graphics.Paint nt.e()>
	//   40   74:invokevirtual   #173 <Method float lp.b(android.graphics.Paint)>
	//   41   77:fadd            
	//   42   78:fstore_3        
		float f4 = f1;
	//   43   79:fload_1         
	//   44   80:fstore          4
		if(r.L())
	//*  45   82:aload_0         
	//*  46   83:getfield        #116 <Field lp r>
	//*  47   86:invokevirtual   #164 <Method boolean lp.L()>
	//*  48   89:ifeq            110
			f4 = f1 + r.b(t.e());
	//   49   92:fload_1         
	//   50   93:aload_0         
	//   51   94:getfield        #116 <Field lp r>
	//   52   97:aload_0         
	//   53   98:getfield        #119 <Field nt t>
	//   54  101:invokevirtual   #169 <Method android.graphics.Paint nt.e()>
	//   55  104:invokevirtual   #173 <Method float lp.b(android.graphics.Paint)>
	//   56  107:fadd            
	//   57  108:fstore          4
		float f7 = H.B;
	//   58  110:aload_0         
	//   59  111:getfield        #125 <Field ln H>
	//   60  114:getfield        #179 <Field int ln.B>
	//   61  117:i2f             
	//   62  118:fstore          7
		f1 = f6;
	//   63  120:fload           6
	//   64  122:fstore_1        
		f2 = f5;
	//   65  123:fload           5
	//   66  125:fstore_2        
		if(H.B())
	//*  67  126:aload_0         
	//*  68  127:getfield        #125 <Field ln H>
	//*  69  130:invokevirtual   #181 <Method boolean ln.B()>
	//*  70  133:ifeq            217
			if(H.j() == ln.e.e)
	//*  71  136:aload_0         
	//*  72  137:getfield        #125 <Field ln H>
	//*  73  140:invokevirtual   #184 <Method ln$e ln.j()>
	//*  74  143:getstatic       #189 <Field ln$e ln$e.e>
	//*  75  146:if_acmpne       161
			{
				f1 = f6 + f7;
	//   76  149:fload           6
	//   77  151:fload           7
	//   78  153:fadd            
	//   79  154:fstore_1        
				f2 = f5;
	//   80  155:fload           5
	//   81  157:fstore_2        
			} else
	//*  82  158:goto            217
			if(H.j() == ln.e.d)
	//*  83  161:aload_0         
	//*  84  162:getfield        #125 <Field ln H>
	//*  85  165:invokevirtual   #184 <Method ln$e ln.j()>
	//*  86  168:getstatic       #192 <Field ln$e ln$e.d>
	//*  87  171:if_acmpne       186
			{
				f2 = f5 + f7;
	//   88  174:fload           5
	//   89  176:fload           7
	//   90  178:fadd            
	//   91  179:fstore_2        
				f1 = f6;
	//   92  180:fload           6
	//   93  182:fstore_1        
			} else
	//*  94  183:goto            217
			{
				f1 = f6;
	//   95  186:fload           6
	//   96  188:fstore_1        
				f2 = f5;
	//   97  189:fload           5
	//   98  191:fstore_2        
				if(H.j() == ln.e.a)
	//*  99  192:aload_0         
	//* 100  193:getfield        #125 <Field ln H>
	//* 101  196:invokevirtual   #184 <Method ln$e ln.j()>
	//* 102  199:getstatic       #194 <Field ln$e ln$e.a>
	//* 103  202:if_acmpne       217
				{
					f1 = f6 + f7;
	//  104  205:fload           6
	//  105  207:fload           7
	//  106  209:fadd            
	//  107  210:fstore_1        
					f2 = f5 + f7;
	//  108  211:fload           5
	//  109  213:fload           7
	//  110  215:fadd            
	//  111  216:fstore_2        
				}
			}
		f3 += getExtraTopOffset();
	//  112  217:fload_3         
	//  113  218:aload_0         
	//  114  219:invokevirtual   #197 <Method float getExtraTopOffset()>
	//  115  222:fadd            
	//  116  223:fstore_3        
		f2 += getExtraRightOffset();
	//  117  224:fload_2         
	//  118  225:aload_0         
	//  119  226:invokevirtual   #200 <Method float getExtraRightOffset()>
	//  120  229:fadd            
	//  121  230:fstore_2        
		f4 += getExtraBottomOffset();
	//  122  231:fload           4
	//  123  233:aload_0         
	//  124  234:invokevirtual   #203 <Method float getExtraBottomOffset()>
	//  125  237:fadd            
	//  126  238:fstore          4
		f1 += getExtraLeftOffset();
	//  127  240:fload_1         
	//  128  241:aload_0         
	//  129  242:invokevirtual   #206 <Method float getExtraLeftOffset()>
	//  130  245:fadd            
	//  131  246:fstore_1        
		f5 = oc.b(o);
	//  132  247:aload_0         
	//  133  248:getfield        #209 <Field float o>
	//  134  251:invokestatic    #214 <Method float oc.b(float)>
	//  135  254:fstore          5
		O.a(Math.max(f5, f1), Math.max(f5, f3), Math.max(f5, f2), Math.max(f5, f4));
	//  136  256:aload_0         
	//  137  257:getfield        #64  <Field oa O>
	//  138  260:fload           5
	//  139  262:fload_1         
	//  140  263:invokestatic    #220 <Method float Math.max(float, float)>
	//  141  266:fload           5
	//  142  268:fload_3         
	//  143  269:invokestatic    #220 <Method float Math.max(float, float)>
	//  144  272:fload           5
	//  145  274:fload_2         
	//  146  275:invokestatic    #220 <Method float Math.max(float, float)>
	//  147  278:fload           5
	//  148  280:fload           4
	//  149  282:invokestatic    #220 <Method float Math.max(float, float)>
	//  150  285:invokevirtual   #225 <Method void oa.a(float, float, float, float)>
		if(j)
	//* 151  288:aload_0         
	//* 152  289:getfield        #38  <Field boolean j>
	//* 153  292:ifeq            382
		{
			Log.i("MPAndroidChart", (new StringBuilder()).append("offsetLeft: ").append(f1).append(", offsetTop: ").append(f3).append(", offsetRight: ").append(f2).append(", offsetBottom: ").append(f4).toString());
	//  154  295:ldc1            #40  <String "MPAndroidChart">
	//  155  297:new             #227 <Class StringBuilder>
	//  156  300:dup             
	//  157  301:invokespecial   #228 <Method void StringBuilder()>
	//  158  304:ldc1            #230 <String "offsetLeft: ">
	//  159  306:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  160  309:fload_1         
	//  161  310:invokevirtual   #237 <Method StringBuilder StringBuilder.append(float)>
	//  162  313:ldc1            #239 <String ", offsetTop: ">
	//  163  315:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  164  318:fload_3         
	//  165  319:invokevirtual   #237 <Method StringBuilder StringBuilder.append(float)>
	//  166  322:ldc1            #241 <String ", offsetRight: ">
	//  167  324:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  168  327:fload_2         
	//  169  328:invokevirtual   #237 <Method StringBuilder StringBuilder.append(float)>
	//  170  331:ldc1            #243 <String ", offsetBottom: ">
	//  171  333:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  172  336:fload           4
	//  173  338:invokevirtual   #237 <Method StringBuilder StringBuilder.append(float)>
	//  174  341:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  175  344:invokestatic    #250 <Method int Log.i(String, String)>
	//  176  347:pop             
			Log.i("MPAndroidChart", (new StringBuilder()).append("Content: ").append(O.m().toString()).toString());
	//  177  348:ldc1            #40  <String "MPAndroidChart">
	//  178  350:new             #227 <Class StringBuilder>
	//  179  353:dup             
	//  180  354:invokespecial   #228 <Method void StringBuilder()>
	//  181  357:ldc1            #252 <String "Content: ">
	//  182  359:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  183  362:aload_0         
	//  184  363:getfield        #64  <Field oa O>
	//  185  366:invokevirtual   #256 <Method RectF oa.m()>
	//  186  369:invokevirtual   #257 <Method String RectF.toString()>
	//  187  372:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  188  375:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  189  378:invokestatic    #250 <Method int Log.i(String, String)>
	//  190  381:pop             
		}
		g();
	//  191  382:aload_0         
	//  192  383:invokevirtual   #260 <Method void g()>
		i();
	//  193  386:aload_0         
	//  194  387:invokevirtual   #262 <Method void i()>
	//  195  390:return          
	}

	public float getHighestVisibleX()
	{
		b(lp.b.b).b(O.f(), O.e(), B);
	//    0    0:aload_0         
	//    1    1:getstatic       #268 <Field lp$b lp$b.b>
	//    2    4:invokevirtual   #271 <Method nv b(lp$b)>
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field oa O>
	//    5   11:invokevirtual   #272 <Method float oa.f()>
	//    6   14:aload_0         
	//    7   15:getfield        #64  <Field oa O>
	//    8   18:invokevirtual   #274 <Method float oa.e()>
	//    9   21:aload_0         
	//   10   22:getfield        #277 <Field nw B>
	//   11   25:invokevirtual   #282 <Method void nv.b(float, float, nw)>
		return (float)Math.min(H.u, B.c);
	//   12   28:aload_0         
	//   13   29:getfield        #125 <Field ln H>
	//   14   32:getfield        #284 <Field float ln.u>
	//   15   35:f2d             
	//   16   36:aload_0         
	//   17   37:getfield        #277 <Field nw B>
	//   18   40:getfield        #289 <Field double nw.c>
	//   19   43:invokestatic    #293 <Method double Math.min(double, double)>
	//   20   46:d2f             
	//   21   47:freturn         
	}

	public float getLowestVisibleX()
	{
		b(lp.b.b).b(O.f(), O.i(), v);
	//    0    0:aload_0         
	//    1    1:getstatic       #268 <Field lp$b lp$b.b>
	//    2    4:invokevirtual   #271 <Method nv b(lp$b)>
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field oa O>
	//    5   11:invokevirtual   #272 <Method float oa.f()>
	//    6   14:aload_0         
	//    7   15:getfield        #64  <Field oa O>
	//    8   18:invokevirtual   #296 <Method float oa.i()>
	//    9   21:aload_0         
	//   10   22:getfield        #299 <Field nw v>
	//   11   25:invokevirtual   #282 <Method void nv.b(float, float, nw)>
		return (float)Math.max(H.q, v.c);
	//   12   28:aload_0         
	//   13   29:getfield        #125 <Field ln H>
	//   14   32:getfield        #301 <Field float ln.q>
	//   15   35:f2d             
	//   16   36:aload_0         
	//   17   37:getfield        #299 <Field nw v>
	//   18   40:getfield        #289 <Field double nw.c>
	//   19   43:invokestatic    #303 <Method double Math.max(double, double)>
	//   20   46:d2f             
	//   21   47:freturn         
	}

	protected void i()
	{
		u.e(r.q, r.w, H.w, H.q);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field nv u>
	//    2    4:aload_0         
	//    3    5:getfield        #116 <Field lp r>
	//    4    8:getfield        #304 <Field float lp.q>
	//    5   11:aload_0         
	//    6   12:getfield        #116 <Field lp r>
	//    7   15:getfield        #307 <Field float lp.w>
	//    8   18:aload_0         
	//    9   19:getfield        #125 <Field ln H>
	//   10   22:getfield        #308 <Field float ln.w>
	//   11   25:aload_0         
	//   12   26:getfield        #125 <Field ln H>
	//   13   29:getfield        #301 <Field float ln.q>
	//   14   32:invokevirtual   #310 <Method void nv.e(float, float, float, float)>
		q.e(l.q, l.w, H.w, H.q);
	//   15   35:aload_0         
	//   16   36:getfield        #75  <Field nv q>
	//   17   39:aload_0         
	//   18   40:getfield        #106 <Field lp l>
	//   19   43:getfield        #304 <Field float lp.q>
	//   20   46:aload_0         
	//   21   47:getfield        #106 <Field lp l>
	//   22   50:getfield        #307 <Field float lp.w>
	//   23   53:aload_0         
	//   24   54:getfield        #125 <Field ln H>
	//   25   57:getfield        #308 <Field float ln.w>
	//   26   60:aload_0         
	//   27   61:getfield        #125 <Field ln H>
	//   28   64:getfield        #301 <Field float ln.q>
	//   29   67:invokevirtual   #310 <Method void nv.e(float, float, float, float)>
	//   30   70:return          
	}

	public void setVisibleXRange(float f1, float f2)
	{
		f1 = H.w / f1;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ln H>
	//    2    4:getfield        #308 <Field float ln.w>
	//    3    7:fload_1         
	//    4    8:fdiv            
	//    5    9:fstore_1        
		f2 = H.w / f2;
	//    6   10:aload_0         
	//    7   11:getfield        #125 <Field ln H>
	//    8   14:getfield        #308 <Field float ln.w>
	//    9   17:fload_2         
	//   10   18:fdiv            
	//   11   19:fstore_2        
		O.b(f1, f2);
	//   12   20:aload_0         
	//   13   21:getfield        #64  <Field oa O>
	//   14   24:fload_1         
	//   15   25:fload_2         
	//   16   26:invokevirtual   #314 <Method void oa.b(float, float)>
	//   17   29:return          
	}

	public void setVisibleXRangeMaximum(float f1)
	{
		f1 = H.w / f1;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ln H>
	//    2    4:getfield        #308 <Field float ln.w>
	//    3    7:fload_1         
	//    4    8:fdiv            
	//    5    9:fstore_1        
		O.b(f1);
	//    6   10:aload_0         
	//    7   11:getfield        #64  <Field oa O>
	//    8   14:fload_1         
	//    9   15:invokevirtual   #318 <Method void oa.b(float)>
	//   10   18:return          
	}

	public void setVisibleXRangeMinimum(float f1)
	{
		f1 = H.w / f1;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ln H>
	//    2    4:getfield        #308 <Field float ln.w>
	//    3    7:fload_1         
	//    4    8:fdiv            
	//    5    9:fstore_1        
		O.a(f1);
	//    6   10:aload_0         
	//    7   11:getfield        #64  <Field oa O>
	//    8   14:fload_1         
	//    9   15:invokevirtual   #321 <Method void oa.a(float)>
	//   10   18:return          
	}

	public void setVisibleYRange(float f1, float f2, lp.b b)
	{
		f1 = d(b) / f1;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #326 <Method float d(lp$b)>
	//    3    5:fload_1         
	//    4    6:fdiv            
	//    5    7:fstore_1        
		f2 = d(b) / f2;
	//    6    8:aload_0         
	//    7    9:aload_3         
	//    8   10:invokevirtual   #326 <Method float d(lp$b)>
	//    9   13:fload_2         
	//   10   14:fdiv            
	//   11   15:fstore_2        
		O.e(f1, f2);
	//   12   16:aload_0         
	//   13   17:getfield        #64  <Field oa O>
	//   14   20:fload_1         
	//   15   21:fload_2         
	//   16   22:invokevirtual   #328 <Method void oa.e(float, float)>
	//   17   25:return          
	}

	public void setVisibleYRangeMaximum(float f1, lp.b b)
	{
		f1 = d(b) / f1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #326 <Method float d(lp$b)>
	//    3    5:fload_1         
	//    4    6:fdiv            
	//    5    7:fstore_1        
		O.e(f1);
	//    6    8:aload_0         
	//    7    9:getfield        #64  <Field oa O>
	//    8   12:fload_1         
	//    9   13:invokevirtual   #332 <Method void oa.e(float)>
	//   10   16:return          
	}

	public void setVisibleYRangeMinimum(float f1, lp.b b)
	{
		f1 = d(b) / f1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #326 <Method float d(lp$b)>
	//    3    5:fload_1         
	//    4    6:fdiv            
	//    5    7:fstore_1        
		O.d(f1);
	//    6    8:aload_0         
	//    7    9:getfield        #64  <Field oa O>
	//    8   12:fload_1         
	//    9   13:invokevirtual   #335 <Method void oa.d(float)>
	//   10   16:return          
	}

	private RectF aa;
	protected float ac[];
}
