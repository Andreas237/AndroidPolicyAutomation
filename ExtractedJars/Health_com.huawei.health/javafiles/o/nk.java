// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import com.github.mikephil.charting.data.Entry;

// Referenced classes of package o:
//			nj, mz, mv, la, 
//			oa, mn

public abstract class nk extends nj
{
	protected class d
	{

		public void b(mn mn1, mv mv1)
		{
			float f1 = Math.max(0.0F, Math.min(1.0F, b.i.b()));
		//    0    0:fconst_0        
		//    1    1:fconst_1        
		//    2    2:aload_0         
		//    3    3:getfield        #16  <Field nk b>
		//    4    6:getfield        #25  <Field la nk.i>
		//    5    9:invokevirtual   #30  <Method float la.b()>
		//    6   12:invokestatic    #36  <Method float Math.min(float, float)>
		//    7   15:invokestatic    #39  <Method float Math.max(float, float)>
		//    8   18:fstore_3        
			float f2 = mn1.getLowestVisibleX();
		//    9   19:aload_1         
		//   10   20:invokeinterface #44  <Method float mn.getLowestVisibleX()>
		//   11   25:fstore          4
			float f3 = mn1.getHighestVisibleX();
		//   12   27:aload_1         
		//   13   28:invokeinterface #47  <Method float mn.getHighestVisibleX()>
		//   14   33:fstore          5
			mn1 = ((mn) (mv1.c(f2, (0.0F / 0.0F), mb.b.b)));
		//   15   35:aload_2         
		//   16   36:fload           4
		//   17   38:ldc1            #48  <Float (0.0F / 0.0F)>
		//   18   40:getstatic       #53  <Field mb$b mb$b.b>
		//   19   43:invokeinterface #58  <Method Entry mv.c(float, float, mb$b)>
		//   20   48:astore_1        
			Entry entry = mv1.c(f3, (0.0F / 0.0F), mb.b.c);
		//   21   49:aload_2         
		//   22   50:fload           5
		//   23   52:ldc1            #48  <Float (0.0F / 0.0F)>
		//   24   54:getstatic       #60  <Field mb$b mb$b.c>
		//   25   57:invokeinterface #58  <Method Entry mv.c(float, float, mb$b)>
		//   26   62:astore          7
			int i;
			if(mn1 == null)
		//*  27   64:aload_1         
		//*  28   65:ifnonnull       74
				i = 0;
		//   29   68:iconst_0        
		//   30   69:istore          6
			else
		//*  31   71:goto            83
				i = mv1.b(((Entry) (mn1)));
		//   32   74:aload_2         
		//   33   75:aload_1         
		//   34   76:invokeinterface #63  <Method int mv.b(Entry)>
		//   35   81:istore          6
			c = i;
		//   36   83:aload_0         
		//   37   84:iload           6
		//   38   86:putfield        #65  <Field int c>
			if(entry == null)
		//*  39   89:aload           7
		//*  40   91:ifnonnull       100
				i = 0;
		//   41   94:iconst_0        
		//   42   95:istore          6
			else
		//*  43   97:goto            110
				i = mv1.b(entry);
		//   44  100:aload_2         
		//   45  101:aload           7
		//   46  103:invokeinterface #63  <Method int mv.b(Entry)>
		//   47  108:istore          6
			d = i;
		//   48  110:aload_0         
		//   49  111:iload           6
		//   50  113:putfield        #67  <Field int d>
			a = (int)((float)(d - c) * f1);
		//   51  116:aload_0         
		//   52  117:aload_0         
		//   53  118:getfield        #67  <Field int d>
		//   54  121:aload_0         
		//   55  122:getfield        #65  <Field int c>
		//   56  125:isub            
		//   57  126:i2f             
		//   58  127:fload_3         
		//   59  128:fmul            
		//   60  129:f2i             
		//   61  130:putfield        #69  <Field int a>
		//   62  133:return          
		}

		public int a;
		final nk b;
		public int c;
		public int d;

		protected d()
		{
			b = nk.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field nk b>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}
	}


	public nk(la la1, oa oa)
	{
		super(la1, oa);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void nj(la, oa)>
		f = new d();
	//    4    6:aload_0         
	//    5    7:new             #6   <Class nk$d>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:invokespecial   #16  <Method void nk$d(nk)>
	//    9   15:putfield        #18  <Field nk$d f>
	//   10   18:return          
	}

	protected boolean c(mz mz1)
	{
		return mz1.j() && (mz1.v() || mz1.x());
	//    0    0:aload_1         
	//    1    1:invokeinterface #27  <Method boolean mz.j()>
	//    2    6:ifeq            29
	//    3    9:aload_1         
	//    4   10:invokeinterface #30  <Method boolean mz.v()>
	//    5   15:ifne            27
	//    6   18:aload_1         
	//    7   19:invokeinterface #33  <Method boolean mz.x()>
	//    8   24:ifeq            29
	//    9   27:iconst_1        
	//   10   28:ireturn         
	//   11   29:iconst_0        
	//   12   30:ireturn         
	}

	protected boolean d(Entry entry, mv mv1)
	{
		if(entry == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		float f1 = mv1.b(entry);
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokeinterface #40  <Method int mv.b(Entry)>
	//    7   13:i2f             
	//    8   14:fstore_3        
		return entry != null && f1 < (float)mv1.C() * i.b();
	//    9   15:aload_1         
	//   10   16:ifnull          39
	//   11   19:fload_3         
	//   12   20:aload_2         
	//   13   21:invokeinterface #44  <Method int mv.C()>
	//   14   26:i2f             
	//   15   27:aload_0         
	//   16   28:getfield        #48  <Field la i>
	//   17   31:invokevirtual   #53  <Method float la.b()>
	//   18   34:fmul            
	//   19   35:fcmpl           
	//   20   36:iflt            41
	//   21   39:iconst_0        
	//   22   40:ireturn         
	//   23   41:iconst_1        
	//   24   42:ireturn         
	}

	protected d f;
}
