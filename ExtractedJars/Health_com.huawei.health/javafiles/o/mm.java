// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import com.github.mikephil.charting.data.Entry;
import java.util.*;

// Referenced classes of package o:
//			mk, mz, mo, nv, 
//			mh, nw, lo, mt

public class mm extends mk
{

	public mm(mo mo1)
	{
		super(mo1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void mk(mo)>
	//    3    5:return          
	}

	protected List b(mz mz1, int i, float f, mb.b b1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void ArrayList()>
	//    3    7:astore          7
		List list = mz1.e(f);
	//    4    9:aload_1         
	//    5   10:fload_3         
	//    6   11:invokeinterface #22  <Method List mz.e(float)>
	//    7   16:astore          6
		Object obj = ((Object) (list));
	//    8   18:aload           6
	//    9   20:astore          5
		if(list.size() == 0)
	//*  10   22:aload           6
	//*  11   24:invokeinterface #28  <Method int List.size()>
	//*  12   29:ifne            67
		{
			b1 = ((mb.b) (mz1.c(f, (0.0F / 0.0F), b1)));
	//   13   32:aload_1         
	//   14   33:fload_3         
	//   15   34:ldc1            #29  <Float (0.0F / 0.0F)>
	//   16   36:aload           4
	//   17   38:invokeinterface #33  <Method Entry mz.c(float, float, mb$b)>
	//   18   43:astore          4
			obj = ((Object) (list));
	//   19   45:aload           6
	//   20   47:astore          5
			if(b1 != null)
	//*  21   49:aload           4
	//*  22   51:ifnull          67
				obj = ((Object) (mz1.e(((Entry) (b1)).getX())));
	//   23   54:aload_1         
	//   24   55:aload           4
	//   25   57:invokevirtual   #39  <Method float Entry.getX()>
	//   26   60:invokeinterface #22  <Method List mz.e(float)>
	//   27   65:astore          5
		}
		if(((List) (obj)).size() == 0)
	//*  28   67:aload           5
	//*  29   69:invokeinterface #28  <Method int List.size()>
	//*  30   74:ifne            80
			return ((List) (arraylist));
	//   31   77:aload           7
	//   32   79:areturn         
		nw nw1;
		for(b1 = ((mb.b) (((List) (obj)).iterator())); ((Iterator) (b1)).hasNext(); arraylist.add(((Object) (new mh(((Entry) (obj)).getX(), ((Entry) (obj)).getY(), (float)nw1.b, (float)nw1.c, i, mz1.D())))))
	//*  33   80:aload           5
	//*  34   82:invokeinterface #43  <Method Iterator List.iterator()>
	//*  35   87:astore          4
	//*  36   89:aload           4
	//*  37   91:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//*  38   96:ifeq            189
		{
			obj = ((Object) ((Entry)((Iterator) (b1)).next()));
	//   39   99:aload           4
	//   40  101:invokeinterface #53  <Method Object Iterator.next()>
	//   41  106:checkcast       #35  <Class Entry>
	//   42  109:astore          5
			nw1 = ((mo)c).b(mz1.D()).d(((Entry) (obj)).getY(), ((Entry) (obj)).getX());
	//   43  111:aload_0         
	//   44  112:getfield        #56  <Field mn c>
	//   45  115:checkcast       #58  <Class mo>
	//   46  118:aload_1         
	//   47  119:invokeinterface #62  <Method lp$b mz.D()>
	//   48  124:invokeinterface #65  <Method nv mo.b(lp$b)>
	//   49  129:aload           5
	//   50  131:invokevirtual   #68  <Method float Entry.getY()>
	//   51  134:aload           5
	//   52  136:invokevirtual   #39  <Method float Entry.getX()>
	//   53  139:invokevirtual   #74  <Method nw nv.d(float, float)>
	//   54  142:astore          6
		}

	//   55  144:aload           7
	//   56  146:new             #76  <Class mh>
	//   57  149:dup             
	//   58  150:aload           5
	//   59  152:invokevirtual   #39  <Method float Entry.getX()>
	//   60  155:aload           5
	//   61  157:invokevirtual   #68  <Method float Entry.getY()>
	//   62  160:aload           6
	//   63  162:getfield        #80  <Field double nw.b>
	//   64  165:d2f             
	//   65  166:aload           6
	//   66  168:getfield        #82  <Field double nw.c>
	//   67  171:d2f             
	//   68  172:iload_2         
	//   69  173:aload_1         
	//   70  174:invokeinterface #62  <Method lp$b mz.D()>
	//   71  179:invokespecial   #85  <Method void mh(float, float, float, float, int, lp$b)>
	//   72  182:invokevirtual   #89  <Method boolean ArrayList.add(Object)>
	//   73  185:pop             
	//*  74  186:goto            89
		return ((List) (arraylist));
	//   75  189:aload           7
	//   76  191:areturn         
	}

	protected float c(float f, float f1, float f2, float f3)
	{
		return Math.abs(f1 - f3);
	//    0    0:fload_2         
	//    1    1:fload           4
	//    2    3:fsub            
	//    3    4:invokestatic    #98  <Method float Math.abs(float)>
	//    4    7:freturn         
	}

	public mh c(float f, float f1)
	{
		Object obj = ((Object) (((mo)c).getBarData()));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field mn c>
	//    2    4:checkcast       #58  <Class mo>
	//    3    7:invokeinterface #103 <Method lo mo.getBarData()>
	//    4   12:astore          5
		nw nw1 = b(f1, f);
	//    5   14:aload_0         
	//    6   15:fload_2         
	//    7   16:fload_1         
	//    8   17:invokevirtual   #105 <Method nw b(float, float)>
	//    9   20:astore_3        
		mh mh1 = a((float)nw1.c, f1, f);
	//   10   21:aload_0         
	//   11   22:aload_3         
	//   12   23:getfield        #82  <Field double nw.c>
	//   13   26:d2f             
	//   14   27:fload_2         
	//   15   28:fload_1         
	//   16   29:invokevirtual   #109 <Method mh a(float, float, float)>
	//   17   32:astore          4
		if(mh1 == null)
	//*  18   34:aload           4
	//*  19   36:ifnonnull       41
			return null;
	//   20   39:aconst_null     
	//   21   40:areturn         
		obj = ((Object) ((mt)((lo) (obj)).a(mh1.g())));
	//   22   41:aload           5
	//   23   43:aload           4
	//   24   45:invokevirtual   #112 <Method int mh.g()>
	//   25   48:invokevirtual   #117 <Method mz lo.a(int)>
	//   26   51:checkcast       #119 <Class mt>
	//   27   54:astore          5
		if(((mt) (obj)).a())
	//*  28   56:aload           5
	//*  29   58:invokeinterface #121 <Method boolean mt.a()>
	//*  30   63:ifeq            85
		{
			return c(mh1, ((mt) (obj)), (float)nw1.c, (float)nw1.b);
	//   31   66:aload_0         
	//   32   67:aload           4
	//   33   69:aload           5
	//   34   71:aload_3         
	//   35   72:getfield        #82  <Field double nw.c>
	//   36   75:d2f             
	//   37   76:aload_3         
	//   38   77:getfield        #80  <Field double nw.b>
	//   39   80:d2f             
	//   40   81:invokevirtual   #124 <Method mh c(mh, mt, float, float)>
	//   41   84:areturn         
		} else
		{
			nw.e(nw1);
	//   42   85:aload_3         
	//   43   86:invokestatic    #127 <Method void nw.e(nw)>
			return mh1;
	//   44   89:aload           4
	//   45   91:areturn         
		}
	}
}
