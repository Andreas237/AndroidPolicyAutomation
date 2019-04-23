// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.shape;


// Referenced classes of package android.support.design.shape:
//			CornerTreatment, EdgeTreatment

public class ShapePathModel
{

	public ShapePathModel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		Object obj = ((Object) (DEFAULT_CORNER_TREATMENT));
	//    2    4:getstatic       #28  <Field CornerTreatment DEFAULT_CORNER_TREATMENT>
	//    3    7:astore_1        
		topLeftCorner = ((CornerTreatment) (obj));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #37  <Field CornerTreatment topLeftCorner>
		topRightCorner = ((CornerTreatment) (obj));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #39  <Field CornerTreatment topRightCorner>
		bottomRightCorner = ((CornerTreatment) (obj));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #41  <Field CornerTreatment bottomRightCorner>
		bottomLeftCorner = ((CornerTreatment) (obj));
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:putfield        #43  <Field CornerTreatment bottomLeftCorner>
		obj = ((Object) (DEFAULT_EDGE_TREATMENT));
	//   16   28:getstatic       #33  <Field EdgeTreatment DEFAULT_EDGE_TREATMENT>
	//   17   31:astore_1        
		topEdge = ((EdgeTreatment) (obj));
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:putfield        #45  <Field EdgeTreatment topEdge>
		rightEdge = ((EdgeTreatment) (obj));
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:putfield        #47  <Field EdgeTreatment rightEdge>
		bottomEdge = ((EdgeTreatment) (obj));
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:putfield        #49  <Field EdgeTreatment bottomEdge>
		leftEdge = ((EdgeTreatment) (obj));
	//   27   47:aload_0         
	//   28   48:aload_1         
	//   29   49:putfield        #51  <Field EdgeTreatment leftEdge>
	//   30   52:return          
	}

	public EdgeTreatment getBottomEdge()
	{
		return bottomEdge;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field EdgeTreatment bottomEdge>
	//    2    4:areturn         
	}

	public CornerTreatment getBottomLeftCorner()
	{
		return bottomLeftCorner;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field CornerTreatment bottomLeftCorner>
	//    2    4:areturn         
	}

	public CornerTreatment getBottomRightCorner()
	{
		return bottomRightCorner;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field CornerTreatment bottomRightCorner>
	//    2    4:areturn         
	}

	public EdgeTreatment getLeftEdge()
	{
		return leftEdge;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field EdgeTreatment leftEdge>
	//    2    4:areturn         
	}

	public EdgeTreatment getRightEdge()
	{
		return rightEdge;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field EdgeTreatment rightEdge>
	//    2    4:areturn         
	}

	public EdgeTreatment getTopEdge()
	{
		return topEdge;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field EdgeTreatment topEdge>
	//    2    4:areturn         
	}

	public CornerTreatment getTopLeftCorner()
	{
		return topLeftCorner;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field CornerTreatment topLeftCorner>
	//    2    4:areturn         
	}

	public CornerTreatment getTopRightCorner()
	{
		return topRightCorner;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field CornerTreatment topRightCorner>
	//    2    4:areturn         
	}

	public void setAllCorners(CornerTreatment cornertreatment)
	{
		topLeftCorner = cornertreatment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field CornerTreatment topLeftCorner>
		topRightCorner = cornertreatment;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #39  <Field CornerTreatment topRightCorner>
		bottomRightCorner = cornertreatment;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #41  <Field CornerTreatment bottomRightCorner>
		bottomLeftCorner = cornertreatment;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:putfield        #43  <Field CornerTreatment bottomLeftCorner>
	//   12   20:return          
	}

	public void setAllEdges(EdgeTreatment edgetreatment)
	{
		leftEdge = edgetreatment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field EdgeTreatment leftEdge>
		topEdge = edgetreatment;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #45  <Field EdgeTreatment topEdge>
		rightEdge = edgetreatment;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #47  <Field EdgeTreatment rightEdge>
		bottomEdge = edgetreatment;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:putfield        #49  <Field EdgeTreatment bottomEdge>
	//   12   20:return          
	}

	public void setBottomEdge(EdgeTreatment edgetreatment)
	{
		bottomEdge = edgetreatment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field EdgeTreatment bottomEdge>
	//    3    5:return          
	}

	public void setBottomLeftCorner(CornerTreatment cornertreatment)
	{
		bottomLeftCorner = cornertreatment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field CornerTreatment bottomLeftCorner>
	//    3    5:return          
	}

	public void setBottomRightCorner(CornerTreatment cornertreatment)
	{
		bottomRightCorner = cornertreatment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field CornerTreatment bottomRightCorner>
	//    3    5:return          
	}

	public void setCornerTreatments(CornerTreatment cornertreatment, CornerTreatment cornertreatment1, CornerTreatment cornertreatment2, CornerTreatment cornertreatment3)
	{
		topLeftCorner = cornertreatment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field CornerTreatment topLeftCorner>
		topRightCorner = cornertreatment1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #39  <Field CornerTreatment topRightCorner>
		bottomRightCorner = cornertreatment2;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #41  <Field CornerTreatment bottomRightCorner>
		bottomLeftCorner = cornertreatment3;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #43  <Field CornerTreatment bottomLeftCorner>
	//   12   21:return          
	}

	public void setEdgeTreatments(EdgeTreatment edgetreatment, EdgeTreatment edgetreatment1, EdgeTreatment edgetreatment2, EdgeTreatment edgetreatment3)
	{
		leftEdge = edgetreatment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field EdgeTreatment leftEdge>
		topEdge = edgetreatment1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #45  <Field EdgeTreatment topEdge>
		rightEdge = edgetreatment2;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #47  <Field EdgeTreatment rightEdge>
		bottomEdge = edgetreatment3;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #49  <Field EdgeTreatment bottomEdge>
	//   12   21:return          
	}

	public void setLeftEdge(EdgeTreatment edgetreatment)
	{
		leftEdge = edgetreatment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field EdgeTreatment leftEdge>
	//    3    5:return          
	}

	public void setRightEdge(EdgeTreatment edgetreatment)
	{
		rightEdge = edgetreatment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field EdgeTreatment rightEdge>
	//    3    5:return          
	}

	public void setTopEdge(EdgeTreatment edgetreatment)
	{
		topEdge = edgetreatment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field EdgeTreatment topEdge>
	//    3    5:return          
	}

	public void setTopLeftCorner(CornerTreatment cornertreatment)
	{
		topLeftCorner = cornertreatment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field CornerTreatment topLeftCorner>
	//    3    5:return          
	}

	public void setTopRightCorner(CornerTreatment cornertreatment)
	{
		topRightCorner = cornertreatment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field CornerTreatment topRightCorner>
	//    3    5:return          
	}

	private static final CornerTreatment DEFAULT_CORNER_TREATMENT = new CornerTreatment();
	private static final EdgeTreatment DEFAULT_EDGE_TREATMENT = new EdgeTreatment();
	private EdgeTreatment bottomEdge;
	private CornerTreatment bottomLeftCorner;
	private CornerTreatment bottomRightCorner;
	private EdgeTreatment leftEdge;
	private EdgeTreatment rightEdge;
	private EdgeTreatment topEdge;
	private CornerTreatment topLeftCorner;
	private CornerTreatment topRightCorner;

	static 
	{
	//    0    0:new             #23  <Class CornerTreatment>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void CornerTreatment()>
	//    3    7:putstatic       #28  <Field CornerTreatment DEFAULT_CORNER_TREATMENT>
	//    4   10:new             #30  <Class EdgeTreatment>
	//    5   13:dup             
	//    6   14:invokespecial   #31  <Method void EdgeTreatment()>
	//    7   17:putstatic       #33  <Field EdgeTreatment DEFAULT_EDGE_TREATMENT>
	//*   8   20:return          
	}
}
