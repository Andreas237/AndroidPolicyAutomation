// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.awt.geom.Point2D;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			Shape, BezierCurve

public class Subpath
{

	public Subpath()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		segments = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List segments>
	//    7   15:return          
	}

	public Subpath(float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		segments = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List segments>
		startPoint = ((Point2D) (new com.itextpdf.awt.geom.Point2D.Float(f, f1)));
	//    7   15:aload_0         
	//    8   16:new             #24  <Class com.itextpdf.awt.geom.Point2D$Float>
	//    9   19:dup             
	//   10   20:fload_1         
	//   11   21:fload_2         
	//   12   22:invokespecial   #26  <Method void com.itextpdf.awt.geom.Point2D$Float(float, float)>
	//   13   25:putfield        #28  <Field Point2D startPoint>
	//   14   28:return          
	}

	public Subpath(Point2D point2d)
	{
		this((float)point2d.getX(), (float)point2d.getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #35  <Method double Point2D.getX()>
	//    3    5:d2f             
	//    4    6:aload_1         
	//    5    7:invokevirtual   #38  <Method double Point2D.getY()>
	//    6   10:d2f             
	//    7   11:invokespecial   #39  <Method void Subpath(float, float)>
	//    8   14:return          
	}

	public Subpath(Subpath subpath)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		segments = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List segments>
		startPoint = subpath.startPoint;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getfield        #28  <Field Point2D startPoint>
	//   10   20:putfield        #28  <Field Point2D startPoint>
		segments.addAll(((java.util.Collection) (subpath.getSegments())));
	//   11   23:aload_0         
	//   12   24:getfield        #20  <Field List segments>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #44  <Method List getSegments()>
	//   15   31:invokeinterface #50  <Method boolean List.addAll(java.util.Collection)>
	//   16   36:pop             
		closed = subpath.closed;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:getfield        #52  <Field boolean closed>
	//   20   42:putfield        #52  <Field boolean closed>
	//   21   45:return          
	}

	public void addSegment(Shape shape)
	{
		if(closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean closed>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(isSinglePointOpen())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #58  <Method boolean isSinglePointOpen()>
	//*   6   12:ifeq            34
			startPoint = (Point2D)shape.getBasePoints().get(0);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokeinterface #63  <Method List Shape.getBasePoints()>
	//   10   22:iconst_0        
	//   11   23:invokeinterface #67  <Method Object List.get(int)>
	//   12   28:checkcast       #31  <Class Point2D>
	//   13   31:putfield        #28  <Field Point2D startPoint>
		segments.add(((Object) (shape)));
	//   14   34:aload_0         
	//   15   35:getfield        #20  <Field List segments>
	//   16   38:aload_1         
	//   17   39:invokeinterface #71  <Method boolean List.add(Object)>
	//   18   44:pop             
	//   19   45:return          
	}

	public Point2D getLastPoint()
	{
		Point2D point2d = startPoint;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Point2D startPoint>
	//    2    4:astore_2        
		Object obj = ((Object) (point2d));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(segments.size() > 0)
	//*   5    7:aload_0         
	//*   6    8:getfield        #20  <Field List segments>
	//*   7   11:invokeinterface #77  <Method int List.size()>
	//*   8   16:ifle            80
		{
			obj = ((Object) (point2d));
	//    9   19:aload_2         
	//   10   20:astore_1        
			if(!closed)
	//*  11   21:aload_0         
	//*  12   22:getfield        #52  <Field boolean closed>
	//*  13   25:ifne            80
			{
				obj = ((Object) ((Shape)segments.get(segments.size() - 1)));
	//   14   28:aload_0         
	//   15   29:getfield        #20  <Field List segments>
	//   16   32:aload_0         
	//   17   33:getfield        #20  <Field List segments>
	//   18   36:invokeinterface #77  <Method int List.size()>
	//   19   41:iconst_1        
	//   20   42:isub            
	//   21   43:invokeinterface #67  <Method Object List.get(int)>
	//   22   48:checkcast       #60  <Class Shape>
	//   23   51:astore_1        
				obj = ((Object) ((Point2D)((Shape) (obj)).getBasePoints().get(((Shape) (obj)).getBasePoints().size() - 1)));
	//   24   52:aload_1         
	//   25   53:invokeinterface #63  <Method List Shape.getBasePoints()>
	//   26   58:aload_1         
	//   27   59:invokeinterface #63  <Method List Shape.getBasePoints()>
	//   28   64:invokeinterface #77  <Method int List.size()>
	//   29   69:iconst_1        
	//   30   70:isub            
	//   31   71:invokeinterface #67  <Method Object List.get(int)>
	//   32   76:checkcast       #31  <Class Point2D>
	//   33   79:astore_1        
			}
		}
		return ((Point2D) (obj));
	//   34   80:aload_1         
	//   35   81:areturn         
	}

	public List getPiecewiseLinearApproximation()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #17  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void ArrayList()>
	//    3    7:astore_3        
		if(segments.size() != 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #20  <Field List segments>
	//*   6   12:invokeinterface #77  <Method int List.size()>
	//*   7   17:ifne            22
	//*   8   20:aload_3         
	//*   9   21:areturn         
		{
			int i;
			if(segments.get(0) instanceof BezierCurve)
	//*  10   22:aload_0         
	//*  11   23:getfield        #20  <Field List segments>
	//*  12   26:iconst_0        
	//*  13   27:invokeinterface #67  <Method Object List.get(int)>
	//*  14   32:instanceof      #80  <Class BezierCurve>
	//*  15   35:ifeq            138
				((List) (arraylist)).addAll(((java.util.Collection) (((BezierCurve)segments.get(0)).getPiecewiseLinearApproximation())));
	//   16   38:aload_3         
	//   17   39:aload_0         
	//   18   40:getfield        #20  <Field List segments>
	//   19   43:iconst_0        
	//   20   44:invokeinterface #67  <Method Object List.get(int)>
	//   21   49:checkcast       #80  <Class BezierCurve>
	//   22   52:invokevirtual   #82  <Method List BezierCurve.getPiecewiseLinearApproximation()>
	//   23   55:invokeinterface #50  <Method boolean List.addAll(java.util.Collection)>
	//   24   60:pop             
			else
	//*  25   61:iconst_1        
	//*  26   62:istore_1        
	//*  27   63:iload_1         
	//*  28   64:aload_0         
	//*  29   65:getfield        #20  <Field List segments>
	//*  30   68:invokeinterface #77  <Method int List.size()>
	//*  31   73:icmpge          20
	//*  32   76:aload_0         
	//*  33   77:getfield        #20  <Field List segments>
	//*  34   80:iload_1         
	//*  35   81:invokeinterface #67  <Method Object List.get(int)>
	//*  36   86:instanceof      #80  <Class BezierCurve>
	//*  37   89:ifeq            166
	//*  38   92:aload_0         
	//*  39   93:getfield        #20  <Field List segments>
	//*  40   96:iload_1         
	//*  41   97:invokeinterface #67  <Method Object List.get(int)>
	//*  42  102:checkcast       #80  <Class BezierCurve>
	//*  43  105:invokevirtual   #82  <Method List BezierCurve.getPiecewiseLinearApproximation()>
	//*  44  108:astore_2        
	//*  45  109:aload_2         
	//*  46  110:iconst_1        
	//*  47  111:aload_2         
	//*  48  112:invokeinterface #77  <Method int List.size()>
	//*  49  117:invokeinterface #86  <Method List List.subList(int, int)>
	//*  50  122:astore_2        
	//*  51  123:aload_3         
	//*  52  124:aload_2         
	//*  53  125:invokeinterface #50  <Method boolean List.addAll(java.util.Collection)>
	//*  54  130:pop             
	//*  55  131:iload_1         
	//*  56  132:iconst_1        
	//*  57  133:iadd            
	//*  58  134:istore_1        
	//*  59  135:goto            63
				((List) (arraylist)).addAll(((java.util.Collection) (((Shape)segments.get(0)).getBasePoints())));
	//   60  138:aload_3         
	//   61  139:aload_0         
	//   62  140:getfield        #20  <Field List segments>
	//   63  143:iconst_0        
	//   64  144:invokeinterface #67  <Method Object List.get(int)>
	//   65  149:checkcast       #60  <Class Shape>
	//   66  152:invokeinterface #63  <Method List Shape.getBasePoints()>
	//   67  157:invokeinterface #50  <Method boolean List.addAll(java.util.Collection)>
	//   68  162:pop             
			i = 1;
			while(i < segments.size()) 
			{
				List list;
				if(segments.get(i) instanceof BezierCurve)
				{
					list = ((BezierCurve)segments.get(i)).getPiecewiseLinearApproximation();
					list = list.subList(1, list.size());
				} else
	//*  69  163:goto            61
				{
					list = ((Shape)segments.get(i)).getBasePoints();
	//   70  166:aload_0         
	//   71  167:getfield        #20  <Field List segments>
	//   72  170:iload_1         
	//   73  171:invokeinterface #67  <Method Object List.get(int)>
	//   74  176:checkcast       #60  <Class Shape>
	//   75  179:invokeinterface #63  <Method List Shape.getBasePoints()>
	//   76  184:astore_2        
					list = list.subList(1, list.size());
	//   77  185:aload_2         
	//   78  186:iconst_1        
	//   79  187:aload_2         
	//   80  188:invokeinterface #77  <Method int List.size()>
	//   81  193:invokeinterface #86  <Method List List.subList(int, int)>
	//   82  198:astore_2        
				}
				((List) (arraylist)).addAll(((java.util.Collection) (list)));
				i++;
			}
		}
		return ((List) (arraylist));
	//*  83  199:goto            123
	}

	public List getSegments()
	{
		return segments;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List segments>
	//    2    4:areturn         
	}

	public Point2D getStartPoint()
	{
		return startPoint;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Point2D startPoint>
	//    2    4:areturn         
	}

	public boolean isClosed()
	{
		return closed;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean closed>
	//    2    4:ireturn         
	}

	public boolean isDegenerate()
	{
		if(segments.size() <= 0 || !closed) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List segments>
	//    2    4:invokeinterface #77  <Method int List.size()>
	//    3    9:ifle            21
	//    4   12:aload_0         
	//    5   13:getfield        #52  <Field boolean closed>
	//    6   16:ifeq            21
_L1:
		return false;
	//    7   19:iconst_0        
	//    8   20:ireturn         
_L2:
		Iterator iterator = segments.iterator();
	//    9   21:aload_0         
	//   10   22:getfield        #20  <Field List segments>
	//   11   25:invokeinterface #96  <Method Iterator List.iterator()>
	//   12   30:astore_1        
		do
			if(!iterator.hasNext())
				continue; /* Loop/switch isn't completed */
	//   13   31:aload_1         
	//   14   32:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//   15   37:ifeq            72
		while(((Set) (new HashSet(((java.util.Collection) (((Shape)iterator.next()).getBasePoints()))))).size() == 1);
	//   16   40:new             #103 <Class HashSet>
	//   17   43:dup             
	//   18   44:aload_1         
	//   19   45:invokeinterface #107 <Method Object Iterator.next()>
	//   20   50:checkcast       #60  <Class Shape>
	//   21   53:invokeinterface #63  <Method List Shape.getBasePoints()>
	//   22   58:invokespecial   #110 <Method void HashSet(java.util.Collection)>
	//   23   61:invokeinterface #113 <Method int Set.size()>
	//   24   66:iconst_1        
	//   25   67:icmpeq          31
		return false;
	//   26   70:iconst_0        
	//   27   71:ireturn         
		if(segments.size() <= 0 && !closed) goto _L1; else goto _L3
	//   28   72:aload_0         
	//   29   73:getfield        #20  <Field List segments>
	//   30   76:invokeinterface #77  <Method int List.size()>
	//   31   81:ifgt            91
	//   32   84:aload_0         
	//   33   85:getfield        #52  <Field boolean closed>
	//   34   88:ifeq            19
_L3:
		return true;
	//   35   91:iconst_1        
	//   36   92:ireturn         
	}

	public boolean isEmpty()
	{
		return startPoint == null;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Point2D startPoint>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isSinglePointClosed()
	{
		return segments.size() == 0 && closed;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List segments>
	//    2    4:invokeinterface #77  <Method int List.size()>
	//    3    9:ifne            21
	//    4   12:aload_0         
	//    5   13:getfield        #52  <Field boolean closed>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public boolean isSinglePointOpen()
	{
		return segments.size() == 0 && !closed;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List segments>
	//    2    4:invokeinterface #77  <Method int List.size()>
	//    3    9:ifne            21
	//    4   12:aload_0         
	//    5   13:getfield        #52  <Field boolean closed>
	//    6   16:ifne            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public void setClosed(boolean flag)
	{
		closed = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field boolean closed>
	//    3    5:return          
	}

	public void setStartPoint(float f, float f1)
	{
		startPoint = ((Point2D) (new com.itextpdf.awt.geom.Point2D.Float(f, f1)));
	//    0    0:aload_0         
	//    1    1:new             #24  <Class com.itextpdf.awt.geom.Point2D$Float>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:invokespecial   #26  <Method void com.itextpdf.awt.geom.Point2D$Float(float, float)>
	//    6   10:putfield        #28  <Field Point2D startPoint>
	//    7   13:return          
	}

	public void setStartPoint(Point2D point2d)
	{
		setStartPoint((float)point2d.getX(), (float)point2d.getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #35  <Method double Point2D.getX()>
	//    3    5:d2f             
	//    4    6:aload_1         
	//    5    7:invokevirtual   #38  <Method double Point2D.getY()>
	//    6   10:d2f             
	//    7   11:invokevirtual   #120 <Method void setStartPoint(float, float)>
	//    8   14:return          
	}

	private boolean closed;
	private List segments;
	private Point2D startPoint;
}
