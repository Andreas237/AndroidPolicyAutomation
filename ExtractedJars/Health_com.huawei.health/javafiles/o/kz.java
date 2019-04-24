// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

// Referenced classes of package o:
//			le, mo, mq, mh, 
//			nh, mk, ln, lo, 
//			lp

public class kz extends le
	implements mo
{

	public kz(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void le(Context)>
		a = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #18  <Field boolean a>
		ac = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #20  <Field boolean ac>
		aa = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #22  <Field boolean aa>
		ab = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #24  <Field boolean ab>
	//   15   25:return          
	}

	public kz(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void le(Context, AttributeSet)>
		a = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #18  <Field boolean a>
		ac = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #20  <Field boolean ac>
		aa = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #22  <Field boolean aa>
		ab = false;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #24  <Field boolean ab>
	//   16   26:return          
	}

	public kz(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #31  <Method void le(Context, AttributeSet, int)>
		a = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #18  <Field boolean a>
		ac = true;
	//    8   12:aload_0         
	//    9   13:iconst_1        
	//   10   14:putfield        #20  <Field boolean ac>
		aa = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #22  <Field boolean aa>
		ab = false;
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:putfield        #24  <Field boolean ab>
	//   17   27:return          
	}

	public mh a(float f, float f1)
	{
		if(A == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field ma A>
	//*   2    4:ifnonnull       17
		{
			Log.e("MPAndroidChart", "Can't select by touch. No data set.");
	//    3    7:ldc1            #38  <String "MPAndroidChart">
	//    4    9:ldc1            #40  <String "Can't select by touch. No data set.">
	//    5   11:invokestatic    #46  <Method int Log.e(String, String)>
	//    6   14:pop             
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		}
		mh mh1 = getHighlighter().c(f, f1);
	//    9   17:aload_0         
	//   10   18:invokevirtual   #50  <Method mq getHighlighter()>
	//   11   21:fload_1         
	//   12   22:fload_2         
	//   13   23:invokeinterface #55  <Method mh mq.c(float, float)>
	//   14   28:astore_3        
		if(mh1 == null || !c())
	//*  15   29:aload_3         
	//*  16   30:ifnull          40
	//*  17   33:aload_0         
	//*  18   34:invokevirtual   #58  <Method boolean c()>
	//*  19   37:ifne            42
			return mh1;
	//   20   40:aload_3         
	//   21   41:areturn         
		else
			return new mh(mh1.b(), mh1.d(), mh1.c(), mh1.e(), mh1.g(), -1, mh1.k());
	//   22   42:new             #60  <Class mh>
	//   23   45:dup             
	//   24   46:aload_3         
	//   25   47:invokevirtual   #64  <Method float mh.b()>
	//   26   50:aload_3         
	//   27   51:invokevirtual   #67  <Method float mh.d()>
	//   28   54:aload_3         
	//   29   55:invokevirtual   #69  <Method float mh.c()>
	//   30   58:aload_3         
	//   31   59:invokevirtual   #71  <Method float mh.e()>
	//   32   62:aload_3         
	//   33   63:invokevirtual   #75  <Method int mh.g()>
	//   34   66:iconst_m1       
	//   35   67:aload_3         
	//   36   68:invokevirtual   #79  <Method lp$b mh.k()>
	//   37   71:invokespecial   #82  <Method void mh(float, float, float, float, int, int, lp$b)>
	//   38   74:areturn         
	}

	protected void a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void le.a()>
		S = ((nj) (new nh(((mo) (this)), P, O)));
	//    2    4:aload_0         
	//    3    5:new             #87  <Class nh>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #91  <Field la P>
	//    8   14:aload_0         
	//    9   15:getfield        #95  <Field oa O>
	//   10   18:invokespecial   #98  <Method void nh(mo, la, oa)>
	//   11   21:putfield        #102 <Field nj S>
		setHighlighter(((mi) (new mk(((mo) (this))))));
	//   12   24:aload_0         
	//   13   25:new             #104 <Class mk>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:invokespecial   #107 <Method void mk(mo)>
	//   17   33:invokevirtual   #111 <Method void setHighlighter(mi)>
		getXAxis().h(0.5F);
	//   18   36:aload_0         
	//   19   37:invokevirtual   #115 <Method ln getXAxis()>
	//   20   40:ldc1            #116 <Float 0.5F>
	//   21   42:invokevirtual   #122 <Method void ln.h(float)>
		getXAxis().i(0.5F);
	//   22   45:aload_0         
	//   23   46:invokevirtual   #115 <Method ln getXAxis()>
	//   24   49:ldc1            #116 <Float 0.5F>
	//   25   51:invokevirtual   #125 <Method void ln.i(float)>
	//   26   54:return          
	}

	public boolean b()
	{
		return ac;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field boolean ac>
	//    2    4:ireturn         
	}

	public boolean c()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean a>
	//    2    4:ireturn         
	}

	protected void d()
	{
		if(ab)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean ab>
	//*   2    4:ifeq            63
			H.d(((lo)A).i() - ((lo)A).a() / 2.0F, ((lo)A).f() + ((lo)A).a() / 2.0F);
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field ln H>
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field ma A>
	//    7   15:checkcast       #131 <Class lo>
	//    8   18:invokevirtual   #133 <Method float lo.i()>
	//    9   21:aload_0         
	//   10   22:getfield        #36  <Field ma A>
	//   11   25:checkcast       #131 <Class lo>
	//   12   28:invokevirtual   #135 <Method float lo.a()>
	//   13   31:fconst_2        
	//   14   32:fdiv            
	//   15   33:fsub            
	//   16   34:aload_0         
	//   17   35:getfield        #36  <Field ma A>
	//   18   38:checkcast       #131 <Class lo>
	//   19   41:invokevirtual   #138 <Method float lo.f()>
	//   20   44:aload_0         
	//   21   45:getfield        #36  <Field ma A>
	//   22   48:checkcast       #131 <Class lo>
	//   23   51:invokevirtual   #135 <Method float lo.a()>
	//   24   54:fconst_2        
	//   25   55:fdiv            
	//   26   56:fadd            
	//   27   57:invokevirtual   #141 <Method void ln.d(float, float)>
		else
	//*  28   60:goto            90
			H.d(((lo)A).i(), ((lo)A).f());
	//   29   63:aload_0         
	//   30   64:getfield        #129 <Field ln H>
	//   31   67:aload_0         
	//   32   68:getfield        #36  <Field ma A>
	//   33   71:checkcast       #131 <Class lo>
	//   34   74:invokevirtual   #133 <Method float lo.i()>
	//   35   77:aload_0         
	//   36   78:getfield        #36  <Field ma A>
	//   37   81:checkcast       #131 <Class lo>
	//   38   84:invokevirtual   #138 <Method float lo.f()>
	//   39   87:invokevirtual   #141 <Method void ln.d(float, float)>
		l.d(((lo)A).a(lp.b.b), ((lo)A).d(lp.b.b));
	//   40   90:aload_0         
	//   41   91:getfield        #145 <Field lp l>
	//   42   94:aload_0         
	//   43   95:getfield        #36  <Field ma A>
	//   44   98:checkcast       #131 <Class lo>
	//   45  101:getstatic       #150 <Field lp$b lp$b.b>
	//   46  104:invokevirtual   #153 <Method float lo.a(lp$b)>
	//   47  107:aload_0         
	//   48  108:getfield        #36  <Field ma A>
	//   49  111:checkcast       #131 <Class lo>
	//   50  114:getstatic       #150 <Field lp$b lp$b.b>
	//   51  117:invokevirtual   #155 <Method float lo.d(lp$b)>
	//   52  120:invokevirtual   #158 <Method void lp.d(float, float)>
		r.d(((lo)A).a(lp.b.e), ((lo)A).d(lp.b.e));
	//   53  123:aload_0         
	//   54  124:getfield        #161 <Field lp r>
	//   55  127:aload_0         
	//   56  128:getfield        #36  <Field ma A>
	//   57  131:checkcast       #131 <Class lo>
	//   58  134:getstatic       #163 <Field lp$b lp$b.e>
	//   59  137:invokevirtual   #153 <Method float lo.a(lp$b)>
	//   60  140:aload_0         
	//   61  141:getfield        #36  <Field ma A>
	//   62  144:checkcast       #131 <Class lo>
	//   63  147:getstatic       #163 <Field lp$b lp$b.e>
	//   64  150:invokevirtual   #155 <Method float lo.d(lp$b)>
	//   65  153:invokevirtual   #158 <Method void lp.d(float, float)>
	//   66  156:return          
	}

	public boolean e()
	{
		return aa;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean aa>
	//    2    4:ireturn         
	}

	public lo getBarData()
	{
		return (lo)A;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ma A>
	//    2    4:checkcast       #131 <Class lo>
	//    3    7:areturn         
	}

	public void setDrawBarShadow(boolean flag)
	{
		aa = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field boolean aa>
	//    3    5:return          
	}

	public void setDrawValueAboveBar(boolean flag)
	{
		ac = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #20  <Field boolean ac>
	//    3    5:return          
	}

	public void setFitBars(boolean flag)
	{
		ab = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field boolean ab>
	//    3    5:return          
	}

	public void setHighlightFullBarEnabled(boolean flag)
	{
		a = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #18  <Field boolean a>
	//    3    5:return          
	}

	protected boolean a;
	private boolean aa;
	private boolean ab;
	private boolean ac;
}
