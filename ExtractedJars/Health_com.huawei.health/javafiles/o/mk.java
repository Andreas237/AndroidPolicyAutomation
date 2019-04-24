// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import com.github.mikephil.charting.data.BarEntry;

// Referenced classes of package o:
//			mi, mp, mo, mh, 
//			lo, mt, nw, nv, 
//			lt

public class mk extends mi
{

	public mk(mo mo1)
	{
		super(((mn) (mo1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void mi(mn)>
	//    3    5:return          
	}

	protected int b(mp amp[], float f)
	{
		if(amp == null || amp.length == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifne            11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		int k = 0;
	//    7   11:iconst_0        
	//    8   12:istore          4
		int l = amp.length;
	//    9   14:aload_1         
	//   10   15:arraylength     
	//   11   16:istore          5
		for(int i = 0; i < l; i++)
	//*  12   18:iconst_0        
	//*  13   19:istore_3        
	//*  14   20:iload_3         
	//*  15   21:iload           5
	//*  16   23:icmpge          52
		{
			if(amp[i].a(f))
	//*  17   26:aload_1         
	//*  18   27:iload_3         
	//*  19   28:aaload          
	//*  20   29:fload_2         
	//*  21   30:invokevirtual   #19  <Method boolean mp.a(float)>
	//*  22   33:ifeq            39
				return k;
	//   23   36:iload           4
	//   24   38:ireturn         
			k++;
	//   25   39:iload           4
	//   26   41:iconst_1        
	//   27   42:iadd            
	//   28   43:istore          4
		}

	//   29   45:iload_3         
	//   30   46:iconst_1        
	//   31   47:iadd            
	//   32   48:istore_3        
	//*  33   49:goto            20
		int j = Math.max(amp.length - 1, 0);
	//   34   52:aload_1         
	//   35   53:arraylength     
	//   36   54:iconst_1        
	//   37   55:isub            
	//   38   56:iconst_0        
	//   39   57:invokestatic    #25  <Method int Math.max(int, int)>
	//   40   60:istore_3        
		if(f > amp[j].b)
	//*  41   61:fload_2         
	//*  42   62:aload_1         
	//*  43   63:iload_3         
	//*  44   64:aaload          
	//*  45   65:getfield        #28  <Field float mp.b>
	//*  46   68:fcmpl           
	//*  47   69:ifle            74
			return j;
	//   48   72:iload_3         
	//   49   73:ireturn         
		else
			return 0;
	//   50   74:iconst_0        
	//   51   75:ireturn         
	}

	protected float c(float f, float f1, float f2, float f3)
	{
		return Math.abs(f - f2);
	//    0    0:fload_1         
	//    1    1:fload_3         
	//    2    2:fsub            
	//    3    3:invokestatic    #34  <Method float Math.abs(float)>
	//    4    6:freturn         
	}

	protected lt c()
	{
		return ((lt) (((mo)c).getBarData()));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field mn c>
	//    2    4:checkcast       #40  <Class mo>
	//    3    7:invokeinterface #44  <Method lo mo.getBarData()>
	//    4   12:areturn         
	}

	public mh c(float f, float f1)
	{
		mh mh1 = super.c(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #47  <Method mh mi.c(float, float)>
	//    4    6:astore_3        
		if(mh1 == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       13
			return null;
	//    7   11:aconst_null     
	//    8   12:areturn         
		nw nw1 = b(f, f1);
	//    9   13:aload_0         
	//   10   14:fload_1         
	//   11   15:fload_2         
	//   12   16:invokevirtual   #50  <Method nw b(float, float)>
	//   13   19:astore          4
		mt mt1 = (mt)((mo)c).getBarData().a(mh1.g());
	//   14   21:aload_0         
	//   15   22:getfield        #38  <Field mn c>
	//   16   25:checkcast       #40  <Class mo>
	//   17   28:invokeinterface #44  <Method lo mo.getBarData()>
	//   18   33:aload_3         
	//   19   34:invokevirtual   #56  <Method int mh.g()>
	//   20   37:invokevirtual   #61  <Method mz lo.a(int)>
	//   21   40:checkcast       #63  <Class mt>
	//   22   43:astore          5
		if(mt1.a())
	//*  23   45:aload           5
	//*  24   47:invokeinterface #66  <Method boolean mt.a()>
	//*  25   52:ifeq            75
		{
			return c(mh1, mt1, (float)nw1.b, (float)nw1.c);
	//   26   55:aload_0         
	//   27   56:aload_3         
	//   28   57:aload           5
	//   29   59:aload           4
	//   30   61:getfield        #71  <Field double nw.b>
	//   31   64:d2f             
	//   32   65:aload           4
	//   33   67:getfield        #73  <Field double nw.c>
	//   34   70:d2f             
	//   35   71:invokevirtual   #76  <Method mh c(mh, mt, float, float)>
	//   36   74:areturn         
		} else
		{
			nw.e(nw1);
	//   37   75:aload           4
	//   38   77:invokestatic    #80  <Method void nw.e(nw)>
			return mh1;
	//   39   80:aload_3         
	//   40   81:areturn         
		}
	}

	public mh c(mh mh1, mt mt1, float f, float f1)
	{
		BarEntry barentry = (BarEntry)mt1.e(f, f1);
	//    0    0:aload_2         
	//    1    1:fload_3         
	//    2    2:fload           4
	//    3    4:invokeinterface #83  <Method com.github.mikephil.charting.data.Entry mt.e(float, float)>
	//    4    9:checkcast       #85  <Class BarEntry>
	//    5   12:astore          6
		if(barentry == null)
	//*   6   14:aload           6
	//*   7   16:ifnonnull       21
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
		if(barentry.getYVals() == null)
	//*  10   21:aload           6
	//*  11   23:invokevirtual   #89  <Method float[] BarEntry.getYVals()>
	//*  12   26:ifnonnull       31
			return mh1;
	//   13   29:aload_1         
	//   14   30:areturn         
		mp amp[] = barentry.getRanges();
	//   15   31:aload           6
	//   16   33:invokevirtual   #93  <Method mp[] BarEntry.getRanges()>
	//   17   36:astore          7
		if(amp.length > 0)
	//*  18   38:aload           7
	//*  19   40:arraylength     
	//*  20   41:ifle            132
		{
			int i = b(amp, f1);
	//   21   44:aload_0         
	//   22   45:aload           7
	//   23   47:fload           4
	//   24   49:invokevirtual   #95  <Method int b(mp[], float)>
	//   25   52:istore          5
			mt1 = ((mt) (((mo)c).b(mt1.D()).d(mh1.b(), amp[i].b)));
	//   26   54:aload_0         
	//   27   55:getfield        #38  <Field mn c>
	//   28   58:checkcast       #40  <Class mo>
	//   29   61:aload_2         
	//   30   62:invokeinterface #98  <Method lp$b mt.D()>
	//   31   67:invokeinterface #101 <Method nv mo.b(lp$b)>
	//   32   72:aload_1         
	//   33   73:invokevirtual   #104 <Method float mh.b()>
	//   34   76:aload           7
	//   35   78:iload           5
	//   36   80:aaload          
	//   37   81:getfield        #28  <Field float mp.b>
	//   38   84:invokevirtual   #109 <Method nw nv.d(float, float)>
	//   39   87:astore_2        
			mh1 = new mh(barentry.getX(), barentry.getY(), (float)((nw) (mt1)).b, (float)((nw) (mt1)).c, mh1.g(), i, mh1.k());
	//   40   88:new             #52  <Class mh>
	//   41   91:dup             
	//   42   92:aload           6
	//   43   94:invokevirtual   #112 <Method float BarEntry.getX()>
	//   44   97:aload           6
	//   45   99:invokevirtual   #115 <Method float BarEntry.getY()>
	//   46  102:aload_2         
	//   47  103:getfield        #71  <Field double nw.b>
	//   48  106:d2f             
	//   49  107:aload_2         
	//   50  108:getfield        #73  <Field double nw.c>
	//   51  111:d2f             
	//   52  112:aload_1         
	//   53  113:invokevirtual   #56  <Method int mh.g()>
	//   54  116:iload           5
	//   55  118:aload_1         
	//   56  119:invokevirtual   #118 <Method lp$b mh.k()>
	//   57  122:invokespecial   #121 <Method void mh(float, float, float, float, int, int, lp$b)>
	//   58  125:astore_1        
			nw.e(((nw) (mt1)));
	//   59  126:aload_2         
	//   60  127:invokestatic    #80  <Method void nw.e(nw)>
			return mh1;
	//   61  130:aload_1         
	//   62  131:areturn         
		} else
		{
			return null;
	//   63  132:aconst_null     
	//   64  133:areturn         
		}
	}
}
