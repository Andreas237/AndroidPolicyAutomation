// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.shape;


// Referenced classes of package android.support.design.shape:
//			CornerTreatment, EdgeTreatment

public class ShapePathModel
{

	public EdgeTreatment getBottomEdge()
	{
		return bottomEdge;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field EdgeTreatment bottomEdge>
	//    2    4:areturn         
	}

	public CornerTreatment getBottomLeftCorner()
	{
		return bottomLeftCorner;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field CornerTreatment bottomLeftCorner>
	//    2    4:areturn         
	}

	public CornerTreatment getBottomRightCorner()
	{
		return bottomRightCorner;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field CornerTreatment bottomRightCorner>
	//    2    4:areturn         
	}

	public EdgeTreatment getLeftEdge()
	{
		return leftEdge;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field EdgeTreatment leftEdge>
	//    2    4:areturn         
	}

	public EdgeTreatment getRightEdge()
	{
		return rightEdge;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field EdgeTreatment rightEdge>
	//    2    4:areturn         
	}

	public EdgeTreatment getTopEdge()
	{
		return topEdge;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field EdgeTreatment topEdge>
	//    2    4:areturn         
	}

	public CornerTreatment getTopLeftCorner()
	{
		return topLeftCorner;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field CornerTreatment topLeftCorner>
	//    2    4:areturn         
	}

	public CornerTreatment getTopRightCorner()
	{
		return topRightCorner;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field CornerTreatment topRightCorner>
	//    2    4:areturn         
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
