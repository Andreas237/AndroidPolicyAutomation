// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import com.github.mikephil.charting.data.Entry;
import java.util.*;

// Referenced classes of package o:
//			mz, mh

public abstract class ma
{

	public ma()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		e = -3.402823E+38F;
	//    2    4:aload_0         
	//    3    5:ldc1            #22  <Float -3.402823E+38F>
	//    4    7:putfield        #24  <Field float e>
		a = 3.402823E+38F;
	//    5   10:aload_0         
	//    6   11:ldc1            #25  <Float 3.402823E+38F>
	//    7   13:putfield        #27  <Field float a>
		d = -3.402823E+38F;
	//    8   16:aload_0         
	//    9   17:ldc1            #22  <Float -3.402823E+38F>
	//   10   19:putfield        #29  <Field float d>
		c = 3.402823E+38F;
	//   11   22:aload_0         
	//   12   23:ldc1            #25  <Float 3.402823E+38F>
	//   13   25:putfield        #31  <Field float c>
		b = -3.402823E+38F;
	//   14   28:aload_0         
	//   15   29:ldc1            #22  <Float -3.402823E+38F>
	//   16   31:putfield        #33  <Field float b>
		g = 3.402823E+38F;
	//   17   34:aload_0         
	//   18   35:ldc1            #25  <Float 3.402823E+38F>
	//   19   37:putfield        #35  <Field float g>
		h = -3.402823E+38F;
	//   20   40:aload_0         
	//   21   41:ldc1            #22  <Float -3.402823E+38F>
	//   22   43:putfield        #37  <Field float h>
		f = 3.402823E+38F;
	//   23   46:aload_0         
	//   24   47:ldc1            #25  <Float 3.402823E+38F>
	//   25   49:putfield        #39  <Field float f>
		i = ((List) (new ArrayList()));
	//   26   52:aload_0         
	//   27   53:new             #41  <Class ArrayList>
	//   28   56:dup             
	//   29   57:invokespecial   #42  <Method void ArrayList()>
	//   30   60:putfield        #44  <Field List i>
	//   31   63:return          
	}

	public ma(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		e = -3.402823E+38F;
	//    2    4:aload_0         
	//    3    5:ldc1            #22  <Float -3.402823E+38F>
	//    4    7:putfield        #24  <Field float e>
		a = 3.402823E+38F;
	//    5   10:aload_0         
	//    6   11:ldc1            #25  <Float 3.402823E+38F>
	//    7   13:putfield        #27  <Field float a>
		d = -3.402823E+38F;
	//    8   16:aload_0         
	//    9   17:ldc1            #22  <Float -3.402823E+38F>
	//   10   19:putfield        #29  <Field float d>
		c = 3.402823E+38F;
	//   11   22:aload_0         
	//   12   23:ldc1            #25  <Float 3.402823E+38F>
	//   13   25:putfield        #31  <Field float c>
		b = -3.402823E+38F;
	//   14   28:aload_0         
	//   15   29:ldc1            #22  <Float -3.402823E+38F>
	//   16   31:putfield        #33  <Field float b>
		g = 3.402823E+38F;
	//   17   34:aload_0         
	//   18   35:ldc1            #25  <Float 3.402823E+38F>
	//   19   37:putfield        #35  <Field float g>
		h = -3.402823E+38F;
	//   20   40:aload_0         
	//   21   41:ldc1            #22  <Float -3.402823E+38F>
	//   22   43:putfield        #37  <Field float h>
		f = 3.402823E+38F;
	//   23   46:aload_0         
	//   24   47:ldc1            #25  <Float 3.402823E+38F>
	//   25   49:putfield        #39  <Field float f>
		i = list;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:putfield        #44  <Field List i>
		b();
	//   29   57:aload_0         
	//   30   58:invokevirtual   #48  <Method void b()>
	//   31   61:return          
	}

	public float a(lp.b b1)
	{
		if(b1 == lp.b.b)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #56  <Field lp$b lp$b.b>
	//*   2    4:if_acmpne       27
			if(g == 3.402823E+38F)
	//*   3    7:aload_0         
	//*   4    8:getfield        #35  <Field float g>
	//*   5   11:ldc1            #25  <Float 3.402823E+38F>
	//*   6   13:fcmpl           
	//*   7   14:ifne            22
				return f;
	//    8   17:aload_0         
	//    9   18:getfield        #39  <Field float f>
	//   10   21:freturn         
			else
				return g;
	//   11   22:aload_0         
	//   12   23:getfield        #35  <Field float g>
	//   13   26:freturn         
		if(f == 3.402823E+38F)
	//*  14   27:aload_0         
	//*  15   28:getfield        #39  <Field float f>
	//*  16   31:ldc1            #25  <Float 3.402823E+38F>
	//*  17   33:fcmpl           
	//*  18   34:ifne            42
			return g;
	//   19   37:aload_0         
	//   20   38:getfield        #35  <Field float g>
	//   21   41:freturn         
		else
			return f;
	//   22   42:aload_0         
	//   23   43:getfield        #39  <Field float f>
	//   24   46:freturn         
	}

	public mz a(int j)
	{
		if(i == null || j < 0 || j >= i.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field List i>
	//*   2    4:ifnull          24
	//*   3    7:iload_1         
	//*   4    8:iflt            24
	//*   5   11:iload_1         
	//*   6   12:aload_0         
	//*   7   13:getfield        #44  <Field List i>
	//*   8   16:invokeinterface #63  <Method int List.size()>
	//*   9   21:icmplt          26
			return null;
	//   10   24:aconst_null     
	//   11   25:areturn         
		else
			return (mz)i.get(j);
	//   12   26:aload_0         
	//   13   27:getfield        #44  <Field List i>
	//   14   30:iload_1         
	//   15   31:invokeinterface #67  <Method Object List.get(int)>
	//   16   36:checkcast       #69  <Class mz>
	//   17   39:areturn         
	}

	protected mz a(List list)
	{
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #75  <Method Iterator List.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            43
		{
			mz mz1 = (mz)((Iterator) (list)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #85  <Method Object Iterator.next()>
	//    8   22:checkcast       #69  <Class mz>
	//    9   25:astore_2        
			if(mz1.D() == lp.b.b)
	//*  10   26:aload_2         
	//*  11   27:invokeinterface #89  <Method lp$b mz.D()>
	//*  12   32:getstatic       #56  <Field lp$b lp$b.b>
	//*  13   35:if_acmpne       40
				return mz1;
	//   14   38:aload_2         
	//   15   39:areturn         
		}

	//*  16   40:goto            7
		return null;
	//   17   43:aconst_null     
	//   18   44:areturn         
	}

	public void a(mz mz1)
	{
		if(mz1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			d(mz1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #93  <Method void d(mz)>
			i.add(((Object) (mz1)));
	//    6   10:aload_0         
	//    7   11:getfield        #44  <Field List i>
	//    8   14:aload_1         
	//    9   15:invokeinterface #97  <Method boolean List.add(Object)>
	//   10   20:pop             
			return;
	//   11   21:return          
		}
	}

	public mz b(List list)
	{
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #75  <Method Iterator List.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            43
		{
			mz mz1 = (mz)((Iterator) (list)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #85  <Method Object Iterator.next()>
	//    8   22:checkcast       #69  <Class mz>
	//    9   25:astore_2        
			if(mz1.D() == lp.b.e)
	//*  10   26:aload_2         
	//*  11   27:invokeinterface #89  <Method lp$b mz.D()>
	//*  12   32:getstatic       #100 <Field lp$b lp$b.e>
	//*  13   35:if_acmpne       40
				return mz1;
	//   14   38:aload_2         
	//   15   39:areturn         
		}

	//*  16   40:goto            7
		return null;
	//   17   43:aconst_null     
	//   18   44:areturn         
	}

	public void b()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method void d()>
	//    2    4:return          
	}

	public void b(float f1, float f2)
	{
		for(Iterator iterator = i.iterator(); iterator.hasNext(); ((mz)iterator.next()).c(f1, f2));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field List i>
	//    2    4:invokeinterface #75  <Method Iterator List.iterator()>
	//    3    9:astore_3        
	//    4   10:aload_3         
	//    5   11:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            38
	//    7   19:aload_3         
	//    8   20:invokeinterface #85  <Method Object Iterator.next()>
	//    9   25:checkcast       #69  <Class mz>
	//   10   28:fload_1         
	//   11   29:fload_2         
	//   12   30:invokeinterface #105 <Method void mz.c(float, float)>
	//*  13   35:goto            10
		d();
	//   14   38:aload_0         
	//   15   39:invokevirtual   #102 <Method void d()>
	//   16   42:return          
	}

	public float c()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float a>
	//    2    4:freturn         
	}

	public float d(lp.b b1)
	{
		if(b1 == lp.b.b)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #56  <Field lp$b lp$b.b>
	//*   2    4:if_acmpne       27
			if(b == -3.402823E+38F)
	//*   3    7:aload_0         
	//*   4    8:getfield        #33  <Field float b>
	//*   5   11:ldc1            #22  <Float -3.402823E+38F>
	//*   6   13:fcmpl           
	//*   7   14:ifne            22
				return h;
	//    8   17:aload_0         
	//    9   18:getfield        #37  <Field float h>
	//   10   21:freturn         
			else
				return b;
	//   11   22:aload_0         
	//   12   23:getfield        #33  <Field float b>
	//   13   26:freturn         
		if(h == -3.402823E+38F)
	//*  14   27:aload_0         
	//*  15   28:getfield        #37  <Field float h>
	//*  16   31:ldc1            #22  <Float -3.402823E+38F>
	//*  17   33:fcmpl           
	//*  18   34:ifne            42
			return b;
	//   19   37:aload_0         
	//   20   38:getfield        #33  <Field float b>
	//   21   41:freturn         
		else
			return h;
	//   22   42:aload_0         
	//   23   43:getfield        #37  <Field float h>
	//   24   46:freturn         
	}

	public Entry d(mh mh1)
	{
		if(mh1.g() >= i.size())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #111 <Method int mh.g()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #44  <Field List i>
	//*   4    8:invokeinterface #63  <Method int List.size()>
	//*   5   13:icmplt          18
			return null;
	//    6   16:aconst_null     
	//    7   17:areturn         
		else
			return ((mz)i.get(mh1.g())).e(mh1.b(), mh1.d());
	//    8   18:aload_0         
	//    9   19:getfield        #44  <Field List i>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #111 <Method int mh.g()>
	//   12   26:invokeinterface #67  <Method Object List.get(int)>
	//   13   31:checkcast       #69  <Class mz>
	//   14   34:aload_1         
	//   15   35:invokevirtual   #113 <Method float mh.b()>
	//   16   38:aload_1         
	//   17   39:invokevirtual   #115 <Method float mh.d()>
	//   18   42:invokeinterface #118 <Method Entry mz.e(float, float)>
	//   19   47:areturn         
	}

	protected void d()
	{
		if(i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field List i>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		e = -3.402823E+38F;
	//    4    8:aload_0         
	//    5    9:ldc1            #22  <Float -3.402823E+38F>
	//    6   11:putfield        #24  <Field float e>
		a = 3.402823E+38F;
	//    7   14:aload_0         
	//    8   15:ldc1            #25  <Float 3.402823E+38F>
	//    9   17:putfield        #27  <Field float a>
		d = -3.402823E+38F;
	//   10   20:aload_0         
	//   11   21:ldc1            #22  <Float -3.402823E+38F>
	//   12   23:putfield        #29  <Field float d>
		c = 3.402823E+38F;
	//   13   26:aload_0         
	//   14   27:ldc1            #25  <Float 3.402823E+38F>
	//   15   29:putfield        #31  <Field float c>
		for(Iterator iterator = i.iterator(); iterator.hasNext(); d((mz)iterator.next()));
	//   16   32:aload_0         
	//   17   33:getfield        #44  <Field List i>
	//   18   36:invokeinterface #75  <Method Iterator List.iterator()>
	//   19   41:astore_1        
	//   20   42:aload_1         
	//   21   43:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//   22   48:ifeq            67
	//   23   51:aload_0         
	//   24   52:aload_1         
	//   25   53:invokeinterface #85  <Method Object Iterator.next()>
	//   26   58:checkcast       #69  <Class mz>
	//   27   61:invokevirtual   #93  <Method void d(mz)>
	//*  28   64:goto            42
		b = -3.402823E+38F;
	//   29   67:aload_0         
	//   30   68:ldc1            #22  <Float -3.402823E+38F>
	//   31   70:putfield        #33  <Field float b>
		g = 3.402823E+38F;
	//   32   73:aload_0         
	//   33   74:ldc1            #25  <Float 3.402823E+38F>
	//   34   76:putfield        #35  <Field float g>
		h = -3.402823E+38F;
	//   35   79:aload_0         
	//   36   80:ldc1            #22  <Float -3.402823E+38F>
	//   37   82:putfield        #37  <Field float h>
		f = 3.402823E+38F;
	//   38   85:aload_0         
	//   39   86:ldc1            #25  <Float 3.402823E+38F>
	//   40   88:putfield        #39  <Field float f>
		Object obj = ((Object) (a(i)));
	//   41   91:aload_0         
	//   42   92:aload_0         
	//   43   93:getfield        #44  <Field List i>
	//   44   96:invokevirtual   #120 <Method mz a(List)>
	//   45   99:astore_1        
		if(obj != null)
	//*  46  100:aload_1         
	//*  47  101:ifnull          216
		{
			b = ((mz) (obj)).E();
	//   48  104:aload_0         
	//   49  105:aload_1         
	//   50  106:invokeinterface #123 <Method float mz.E()>
	//   51  111:putfield        #33  <Field float b>
			g = ((mz) (obj)).F();
	//   52  114:aload_0         
	//   53  115:aload_1         
	//   54  116:invokeinterface #125 <Method float mz.F()>
	//   55  121:putfield        #35  <Field float g>
			obj = ((Object) (i.iterator()));
	//   56  124:aload_0         
	//   57  125:getfield        #44  <Field List i>
	//   58  128:invokeinterface #75  <Method Iterator List.iterator()>
	//   59  133:astore_1        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//   60  134:aload_1         
	//   61  135:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//   62  140:ifeq            216
				mz mz1 = (mz)((Iterator) (obj)).next();
	//   63  143:aload_1         
	//   64  144:invokeinterface #85  <Method Object Iterator.next()>
	//   65  149:checkcast       #69  <Class mz>
	//   66  152:astore_2        
				if(mz1.D() == lp.b.b)
	//*  67  153:aload_2         
	//*  68  154:invokeinterface #89  <Method lp$b mz.D()>
	//*  69  159:getstatic       #56  <Field lp$b lp$b.b>
	//*  70  162:if_acmpne       213
				{
					if(mz1.F() < g)
	//*  71  165:aload_2         
	//*  72  166:invokeinterface #125 <Method float mz.F()>
	//*  73  171:aload_0         
	//*  74  172:getfield        #35  <Field float g>
	//*  75  175:fcmpg           
	//*  76  176:ifge            189
						g = mz1.F();
	//   77  179:aload_0         
	//   78  180:aload_2         
	//   79  181:invokeinterface #125 <Method float mz.F()>
	//   80  186:putfield        #35  <Field float g>
					if(mz1.E() > b)
	//*  81  189:aload_2         
	//*  82  190:invokeinterface #123 <Method float mz.E()>
	//*  83  195:aload_0         
	//*  84  196:getfield        #33  <Field float b>
	//*  85  199:fcmpl           
	//*  86  200:ifle            213
						b = mz1.E();
	//   87  203:aload_0         
	//   88  204:aload_2         
	//   89  205:invokeinterface #123 <Method float mz.E()>
	//   90  210:putfield        #33  <Field float b>
				}
			} while(true);
	//   91  213:goto            134
		}
		obj = ((Object) (b(i)));
	//   92  216:aload_0         
	//   93  217:aload_0         
	//   94  218:getfield        #44  <Field List i>
	//   95  221:invokevirtual   #127 <Method mz b(List)>
	//   96  224:astore_1        
		if(obj != null)
	//*  97  225:aload_1         
	//*  98  226:ifnull          341
		{
			h = ((mz) (obj)).E();
	//   99  229:aload_0         
	//  100  230:aload_1         
	//  101  231:invokeinterface #123 <Method float mz.E()>
	//  102  236:putfield        #37  <Field float h>
			f = ((mz) (obj)).F();
	//  103  239:aload_0         
	//  104  240:aload_1         
	//  105  241:invokeinterface #125 <Method float mz.F()>
	//  106  246:putfield        #39  <Field float f>
			obj = ((Object) (i.iterator()));
	//  107  249:aload_0         
	//  108  250:getfield        #44  <Field List i>
	//  109  253:invokeinterface #75  <Method Iterator List.iterator()>
	//  110  258:astore_1        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//  111  259:aload_1         
	//  112  260:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//  113  265:ifeq            341
				mz mz2 = (mz)((Iterator) (obj)).next();
	//  114  268:aload_1         
	//  115  269:invokeinterface #85  <Method Object Iterator.next()>
	//  116  274:checkcast       #69  <Class mz>
	//  117  277:astore_2        
				if(mz2.D() == lp.b.e)
	//* 118  278:aload_2         
	//* 119  279:invokeinterface #89  <Method lp$b mz.D()>
	//* 120  284:getstatic       #100 <Field lp$b lp$b.e>
	//* 121  287:if_acmpne       338
				{
					if(mz2.F() < f)
	//* 122  290:aload_2         
	//* 123  291:invokeinterface #125 <Method float mz.F()>
	//* 124  296:aload_0         
	//* 125  297:getfield        #39  <Field float f>
	//* 126  300:fcmpg           
	//* 127  301:ifge            314
						f = mz2.F();
	//  128  304:aload_0         
	//  129  305:aload_2         
	//  130  306:invokeinterface #125 <Method float mz.F()>
	//  131  311:putfield        #39  <Field float f>
					if(mz2.E() > h)
	//* 132  314:aload_2         
	//* 133  315:invokeinterface #123 <Method float mz.E()>
	//* 134  320:aload_0         
	//* 135  321:getfield        #37  <Field float h>
	//* 136  324:fcmpl           
	//* 137  325:ifle            338
						h = mz2.E();
	//  138  328:aload_0         
	//  139  329:aload_2         
	//  140  330:invokeinterface #123 <Method float mz.E()>
	//  141  335:putfield        #37  <Field float h>
				}
			} while(true);
	//  142  338:goto            259
		}
	//  143  341:return          
	}

	protected void d(mz mz1)
	{
		if(e < mz1.E())
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field float e>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #123 <Method float mz.E()>
	//*   4   10:fcmpg           
	//*   5   11:ifge            24
			e = mz1.E();
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokeinterface #123 <Method float mz.E()>
	//    9   21:putfield        #24  <Field float e>
		if(a > mz1.F())
	//*  10   24:aload_0         
	//*  11   25:getfield        #27  <Field float a>
	//*  12   28:aload_1         
	//*  13   29:invokeinterface #125 <Method float mz.F()>
	//*  14   34:fcmpl           
	//*  15   35:ifle            48
			a = mz1.F();
	//   16   38:aload_0         
	//   17   39:aload_1         
	//   18   40:invokeinterface #125 <Method float mz.F()>
	//   19   45:putfield        #27  <Field float a>
		if(d < mz1.H())
	//*  20   48:aload_0         
	//*  21   49:getfield        #29  <Field float d>
	//*  22   52:aload_1         
	//*  23   53:invokeinterface #130 <Method float mz.H()>
	//*  24   58:fcmpg           
	//*  25   59:ifge            72
			d = mz1.H();
	//   26   62:aload_0         
	//   27   63:aload_1         
	//   28   64:invokeinterface #130 <Method float mz.H()>
	//   29   69:putfield        #29  <Field float d>
		if(c > mz1.I())
	//*  30   72:aload_0         
	//*  31   73:getfield        #31  <Field float c>
	//*  32   76:aload_1         
	//*  33   77:invokeinterface #133 <Method float mz.I()>
	//*  34   82:fcmpl           
	//*  35   83:ifle            96
			c = mz1.I();
	//   36   86:aload_0         
	//   37   87:aload_1         
	//   38   88:invokeinterface #133 <Method float mz.I()>
	//   39   93:putfield        #31  <Field float c>
		if(mz1.D() == lp.b.b)
	//*  40   96:aload_1         
	//*  41   97:invokeinterface #89  <Method lp$b mz.D()>
	//*  42  102:getstatic       #56  <Field lp$b lp$b.b>
	//*  43  105:if_acmpne       157
		{
			if(b < mz1.E())
	//*  44  108:aload_0         
	//*  45  109:getfield        #33  <Field float b>
	//*  46  112:aload_1         
	//*  47  113:invokeinterface #123 <Method float mz.E()>
	//*  48  118:fcmpg           
	//*  49  119:ifge            132
				b = mz1.E();
	//   50  122:aload_0         
	//   51  123:aload_1         
	//   52  124:invokeinterface #123 <Method float mz.E()>
	//   53  129:putfield        #33  <Field float b>
			if(g > mz1.F())
	//*  54  132:aload_0         
	//*  55  133:getfield        #35  <Field float g>
	//*  56  136:aload_1         
	//*  57  137:invokeinterface #125 <Method float mz.F()>
	//*  58  142:fcmpl           
	//*  59  143:ifle            205
			{
				g = mz1.F();
	//   60  146:aload_0         
	//   61  147:aload_1         
	//   62  148:invokeinterface #125 <Method float mz.F()>
	//   63  153:putfield        #35  <Field float g>
				return;
	//   64  156:return          
			}
		} else
		{
			if(h < mz1.E())
	//*  65  157:aload_0         
	//*  66  158:getfield        #37  <Field float h>
	//*  67  161:aload_1         
	//*  68  162:invokeinterface #123 <Method float mz.E()>
	//*  69  167:fcmpg           
	//*  70  168:ifge            181
				h = mz1.E();
	//   71  171:aload_0         
	//   72  172:aload_1         
	//   73  173:invokeinterface #123 <Method float mz.E()>
	//   74  178:putfield        #37  <Field float h>
			if(f > mz1.F())
	//*  75  181:aload_0         
	//*  76  182:getfield        #39  <Field float f>
	//*  77  185:aload_1         
	//*  78  186:invokeinterface #125 <Method float mz.F()>
	//*  79  191:fcmpl           
	//*  80  192:ifle            205
				f = mz1.F();
	//   81  195:aload_0         
	//   82  196:aload_1         
	//   83  197:invokeinterface #125 <Method float mz.F()>
	//   84  202:putfield        #39  <Field float f>
		}
	//   85  205:return          
	}

	public int e()
	{
		if(i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field List i>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return i.size();
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field List i>
	//    7   13:invokeinterface #63  <Method int List.size()>
	//    8   18:ireturn         
	}

	public float f()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field float d>
	//    2    4:freturn         
	}

	public float g()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float e>
	//    2    4:freturn         
	}

	public List h()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field List i>
	//    2    4:areturn         
	}

	public float i()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float c>
	//    2    4:freturn         
	}

	public void k()
	{
		if(i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field List i>
	//*   2    4:ifnull          16
			i.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field List i>
	//    5   11:invokeinterface #139 <Method void List.clear()>
		b();
	//    6   16:aload_0         
	//    7   17:invokevirtual   #48  <Method void b()>
	//    8   20:return          
	}

	public int o()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		for(Iterator iterator = i.iterator(); iterator.hasNext();)
	//*   2    2:aload_0         
	//*   3    3:getfield        #44  <Field List i>
	//*   4    6:invokeinterface #75  <Method Iterator List.iterator()>
	//*   5   11:astore_2        
	//*   6   12:aload_2         
	//*   7   13:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            41
			j += ((mz)iterator.next()).C();
	//    9   21:iload_1         
	//   10   22:aload_2         
	//   11   23:invokeinterface #85  <Method Object Iterator.next()>
	//   12   28:checkcast       #69  <Class mz>
	//   13   31:invokeinterface #143 <Method int mz.C()>
	//   14   36:iadd            
	//   15   37:istore_1        

	//*  16   38:goto            12
		return j;
	//   17   41:iload_1         
	//   18   42:ireturn         
	}

	protected float a;
	protected float b;
	protected float c;
	protected float d;
	protected float e;
	protected float f;
	protected float g;
	protected float h;
	protected List i;
}
