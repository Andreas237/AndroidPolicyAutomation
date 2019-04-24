// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//			PagerTitleStrip, ViewPager, p

private class PagerTitleStrip$a extends DataSetObserver
	implements ViewPager.d, ViewPager.e
{

	public void a(int i)
	{
		b = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field int b>
	//    3    5:return          
	}

	public void a(int i, float f, int j)
	{
		j = i;
	//    0    0:iload_1         
	//    1    1:istore_3        
		if(f > 0.5F)
	//*   2    2:fload_2         
	//*   3    3:ldc1            #27  <Float 0.5F>
	//*   4    5:fcmpl           
	//*   5    6:ifle            13
			j = i + 1;
	//    6    9:iload_1         
	//    7   10:iconst_1        
	//    8   11:iadd            
	//    9   12:istore_3        
		a.a(j, f, false);
	//   10   13:aload_0         
	//   11   14:getfield        #18  <Field PagerTitleStrip a>
	//   12   17:iload_3         
	//   13   18:fload_2         
	//   14   19:iconst_0        
	//   15   20:invokevirtual   #30  <Method void PagerTitleStrip.a(int, float, boolean)>
	//   16   23:return          
	}

	public void a(ViewPager viewpager, p p, p p1)
	{
		a.a(p, p1);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field PagerTitleStrip a>
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #34  <Method void PagerTitleStrip.a(p, p)>
	//    5    9:return          
	}

	public void b(int i)
	{
		if(b == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field int b>
	//*   2    4:ifne            77
		{
			a.a(a.a.getCurrentItem(), a.a.getAdapter());
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field PagerTitleStrip a>
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field PagerTitleStrip a>
	//    7   15:getfield        #37  <Field ViewPager PagerTitleStrip.a>
	//    8   18:invokevirtual   #43  <Method int ViewPager.getCurrentItem()>
	//    9   21:aload_0         
	//   10   22:getfield        #18  <Field PagerTitleStrip a>
	//   11   25:getfield        #37  <Field ViewPager PagerTitleStrip.a>
	//   12   28:invokevirtual   #47  <Method p ViewPager.getAdapter()>
	//   13   31:invokevirtual   #50  <Method void PagerTitleStrip.a(int, p)>
			float f1 = a.e;
	//   14   34:aload_0         
	//   15   35:getfield        #18  <Field PagerTitleStrip a>
	//   16   38:getfield        #54  <Field float PagerTitleStrip.e>
	//   17   41:fstore_3        
			float f = 0.0F;
	//   18   42:fconst_0        
	//   19   43:fstore_2        
			if(f1 >= 0.0F)
	//*  20   44:fload_3         
	//*  21   45:fconst_0        
	//*  22   46:fcmpl           
	//*  23   47:iflt            58
				f = a.e;
	//   24   50:aload_0         
	//   25   51:getfield        #18  <Field PagerTitleStrip a>
	//   26   54:getfield        #54  <Field float PagerTitleStrip.e>
	//   27   57:fstore_2        
			a.a(a.a.getCurrentItem(), f, true);
	//   28   58:aload_0         
	//   29   59:getfield        #18  <Field PagerTitleStrip a>
	//   30   62:aload_0         
	//   31   63:getfield        #18  <Field PagerTitleStrip a>
	//   32   66:getfield        #37  <Field ViewPager PagerTitleStrip.a>
	//   33   69:invokevirtual   #43  <Method int ViewPager.getCurrentItem()>
	//   34   72:fload_2         
	//   35   73:iconst_1        
	//   36   74:invokevirtual   #30  <Method void PagerTitleStrip.a(int, float, boolean)>
		}
	//   37   77:return          
	}

	public void onChanged()
	{
		a.a(a.a.getCurrentItem(), a.a.getAdapter());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field PagerTitleStrip a>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field PagerTitleStrip a>
	//    4    8:getfield        #37  <Field ViewPager PagerTitleStrip.a>
	//    5   11:invokevirtual   #43  <Method int ViewPager.getCurrentItem()>
	//    6   14:aload_0         
	//    7   15:getfield        #18  <Field PagerTitleStrip a>
	//    8   18:getfield        #37  <Field ViewPager PagerTitleStrip.a>
	//    9   21:invokevirtual   #47  <Method p ViewPager.getAdapter()>
	//   10   24:invokevirtual   #50  <Method void PagerTitleStrip.a(int, p)>
		float f1 = a.e;
	//   11   27:aload_0         
	//   12   28:getfield        #18  <Field PagerTitleStrip a>
	//   13   31:getfield        #54  <Field float PagerTitleStrip.e>
	//   14   34:fstore_2        
		float f = 0.0F;
	//   15   35:fconst_0        
	//   16   36:fstore_1        
		if(f1 >= 0.0F)
	//*  17   37:fload_2         
	//*  18   38:fconst_0        
	//*  19   39:fcmpl           
	//*  20   40:iflt            51
			f = a.e;
	//   21   43:aload_0         
	//   22   44:getfield        #18  <Field PagerTitleStrip a>
	//   23   47:getfield        #54  <Field float PagerTitleStrip.e>
	//   24   50:fstore_1        
		a.a(a.a.getCurrentItem(), f, true);
	//   25   51:aload_0         
	//   26   52:getfield        #18  <Field PagerTitleStrip a>
	//   27   55:aload_0         
	//   28   56:getfield        #18  <Field PagerTitleStrip a>
	//   29   59:getfield        #37  <Field ViewPager PagerTitleStrip.a>
	//   30   62:invokevirtual   #43  <Method int ViewPager.getCurrentItem()>
	//   31   65:fload_1         
	//   32   66:iconst_1        
	//   33   67:invokevirtual   #30  <Method void PagerTitleStrip.a(int, float, boolean)>
	//   34   70:return          
	}

	final PagerTitleStrip a;
	private int b;

	PagerTitleStrip$a(PagerTitleStrip pagertitlestrip)
	{
		a = pagertitlestrip;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field PagerTitleStrip a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void DataSetObserver()>
	//    5    9:return          
	}
}
