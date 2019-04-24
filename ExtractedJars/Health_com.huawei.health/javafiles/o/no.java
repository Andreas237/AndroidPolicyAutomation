// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.*;

// Referenced classes of package o:
//			nk, mw, oa, la

public abstract class no extends nk
{

	public no(la la, oa oa1)
	{
		super(la, oa1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #10  <Method void nk(la, oa)>
		a = new Path();
	//    4    6:aload_0         
	//    5    7:new             #12  <Class Path>
	//    6   10:dup             
	//    7   11:invokespecial   #15  <Method void Path()>
	//    8   14:putfield        #17  <Field Path a>
	//    9   17:return          
	}

	protected void a(Canvas canvas, float f, float f1, mw mw1)
	{
		k.setColor(mw1.f());
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Paint k>
	//    2    4:aload           4
	//    3    6:invokeinterface #29  <Method int mw.f()>
	//    4   11:invokevirtual   #35  <Method void Paint.setColor(int)>
		k.setStrokeWidth(mw1.W());
	//    5   14:aload_0         
	//    6   15:getfield        #23  <Field Paint k>
	//    7   18:aload           4
	//    8   20:invokeinterface #39  <Method float mw.W()>
	//    9   25:invokevirtual   #43  <Method void Paint.setStrokeWidth(float)>
		k.setPathEffect(((android.graphics.PathEffect) (mw1.Z())));
	//   10   28:aload_0         
	//   11   29:getfield        #23  <Field Paint k>
	//   12   32:aload           4
	//   13   34:invokeinterface #47  <Method android.graphics.DashPathEffect mw.Z()>
	//   14   39:invokevirtual   #51  <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   15   42:pop             
		if(mw1.T())
	//*  16   43:aload           4
	//*  17   45:invokeinterface #55  <Method boolean mw.T()>
	//*  18   50:ifeq            102
		{
			a.reset();
	//   19   53:aload_0         
	//   20   54:getfield        #17  <Field Path a>
	//   21   57:invokevirtual   #58  <Method void Path.reset()>
			a.moveTo(f, l.e());
	//   22   60:aload_0         
	//   23   61:getfield        #17  <Field Path a>
	//   24   64:fload_2         
	//   25   65:aload_0         
	//   26   66:getfield        #62  <Field oa l>
	//   27   69:invokevirtual   #67  <Method float oa.e()>
	//   28   72:invokevirtual   #71  <Method void Path.moveTo(float, float)>
			a.lineTo(f, l.i());
	//   29   75:aload_0         
	//   30   76:getfield        #17  <Field Path a>
	//   31   79:fload_2         
	//   32   80:aload_0         
	//   33   81:getfield        #62  <Field oa l>
	//   34   84:invokevirtual   #74  <Method float oa.i()>
	//   35   87:invokevirtual   #77  <Method void Path.lineTo(float, float)>
			canvas.drawPath(a, k);
	//   36   90:aload_1         
	//   37   91:aload_0         
	//   38   92:getfield        #17  <Field Path a>
	//   39   95:aload_0         
	//   40   96:getfield        #23  <Field Paint k>
	//   41   99:invokevirtual   #83  <Method void Canvas.drawPath(Path, Paint)>
		}
		if(mw1.U())
	//*  42  102:aload           4
	//*  43  104:invokeinterface #86  <Method boolean mw.U()>
	//*  44  109:ifeq            161
		{
			a.reset();
	//   45  112:aload_0         
	//   46  113:getfield        #17  <Field Path a>
	//   47  116:invokevirtual   #58  <Method void Path.reset()>
			a.moveTo(l.f(), f1);
	//   48  119:aload_0         
	//   49  120:getfield        #17  <Field Path a>
	//   50  123:aload_0         
	//   51  124:getfield        #62  <Field oa l>
	//   52  127:invokevirtual   #88  <Method float oa.f()>
	//   53  130:fload_3         
	//   54  131:invokevirtual   #71  <Method void Path.moveTo(float, float)>
			a.lineTo(l.h(), f1);
	//   55  134:aload_0         
	//   56  135:getfield        #17  <Field Path a>
	//   57  138:aload_0         
	//   58  139:getfield        #62  <Field oa l>
	//   59  142:invokevirtual   #91  <Method float oa.h()>
	//   60  145:fload_3         
	//   61  146:invokevirtual   #77  <Method void Path.lineTo(float, float)>
			canvas.drawPath(a, k);
	//   62  149:aload_1         
	//   63  150:aload_0         
	//   64  151:getfield        #17  <Field Path a>
	//   65  154:aload_0         
	//   66  155:getfield        #23  <Field Paint k>
	//   67  158:invokevirtual   #83  <Method void Canvas.drawPath(Path, Paint)>
		}
	//   68  161:return          
	}

	private Path a;
}
