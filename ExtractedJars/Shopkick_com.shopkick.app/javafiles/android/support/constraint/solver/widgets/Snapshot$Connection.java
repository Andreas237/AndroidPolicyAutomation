// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;


// Referenced classes of package android.support.constraint.solver.widgets:
//			Snapshot, ConstraintAnchor, ConstraintWidget

static class Snapshot$Connection
{

	public void applyTo(ConstraintWidget constraintwidget)
	{
		constraintwidget.getAnchor(mAnchor.getType()).connect(mTarget, mMargin, mStrengh, mCreator);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field ConstraintAnchor mAnchor>
	//    3    5:invokevirtual   #54  <Method ConstraintAnchor$Type ConstraintAnchor.getType()>
	//    4    8:invokevirtual   #60  <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field ConstraintAnchor mTarget>
	//    7   15:aload_0         
	//    8   16:getfield        #36  <Field int mMargin>
	//    9   19:aload_0         
	//   10   20:getfield        #42  <Field ConstraintAnchor$Strength mStrengh>
	//   11   23:aload_0         
	//   12   24:getfield        #47  <Field int mCreator>
	//   13   27:invokevirtual   #64  <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, ConstraintAnchor$Strength, int)>
	//   14   30:pop             
	//   15   31:return          
	}

	public void updateFrom(ConstraintWidget constraintwidget)
	{
		mAnchor = constraintwidget.getAnchor(mAnchor.getType());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #22  <Field ConstraintAnchor mAnchor>
	//    4    6:invokevirtual   #54  <Method ConstraintAnchor$Type ConstraintAnchor.getType()>
	//    5    9:invokevirtual   #60  <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//    6   12:putfield        #22  <Field ConstraintAnchor mAnchor>
		constraintwidget = ((ConstraintWidget) (mAnchor));
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field ConstraintAnchor mAnchor>
	//    9   19:astore_1        
		if(constraintwidget != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          66
		{
			mTarget = ((ConstraintAnchor) (constraintwidget)).getTarget();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #28  <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//   15   29:putfield        #30  <Field ConstraintAnchor mTarget>
			mMargin = mAnchor.getMargin();
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #22  <Field ConstraintAnchor mAnchor>
	//   19   37:invokevirtual   #34  <Method int ConstraintAnchor.getMargin()>
	//   20   40:putfield        #36  <Field int mMargin>
			mStrengh = mAnchor.getStrength();
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getfield        #22  <Field ConstraintAnchor mAnchor>
	//   24   48:invokevirtual   #40  <Method ConstraintAnchor$Strength ConstraintAnchor.getStrength()>
	//   25   51:putfield        #42  <Field ConstraintAnchor$Strength mStrengh>
			mCreator = mAnchor.getConnectionCreator();
	//   26   54:aload_0         
	//   27   55:aload_0         
	//   28   56:getfield        #22  <Field ConstraintAnchor mAnchor>
	//   29   59:invokevirtual   #45  <Method int ConstraintAnchor.getConnectionCreator()>
	//   30   62:putfield        #47  <Field int mCreator>
			return;
	//   31   65:return          
		} else
		{
			mTarget = null;
	//   32   66:aload_0         
	//   33   67:aconst_null     
	//   34   68:putfield        #30  <Field ConstraintAnchor mTarget>
			mMargin = 0;
	//   35   71:aload_0         
	//   36   72:iconst_0        
	//   37   73:putfield        #36  <Field int mMargin>
			mStrengh = ength.STRONG;
	//   38   76:aload_0         
	//   39   77:getstatic       #70  <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//   40   80:putfield        #42  <Field ConstraintAnchor$Strength mStrengh>
			mCreator = 0;
	//   41   83:aload_0         
	//   42   84:iconst_0        
	//   43   85:putfield        #47  <Field int mCreator>
			return;
	//   44   88:return          
		}
	}

	private ConstraintAnchor mAnchor;
	private int mCreator;
	private int mMargin;
	private ength mStrengh;
	private ConstraintAnchor mTarget;

	public Snapshot$Connection(ConstraintAnchor constraintanchor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mAnchor = constraintanchor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field ConstraintAnchor mAnchor>
		mTarget = constraintanchor.getTarget();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #28  <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//    8   14:putfield        #30  <Field ConstraintAnchor mTarget>
		mMargin = constraintanchor.getMargin();
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #34  <Method int ConstraintAnchor.getMargin()>
	//   12   22:putfield        #36  <Field int mMargin>
		mStrengh = constraintanchor.getStrength();
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #40  <Method ConstraintAnchor$Strength ConstraintAnchor.getStrength()>
	//   16   30:putfield        #42  <Field ConstraintAnchor$Strength mStrengh>
		mCreator = constraintanchor.getConnectionCreator();
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #45  <Method int ConstraintAnchor.getConnectionCreator()>
	//   20   38:putfield        #47  <Field int mCreator>
	//   21   41:return          
	}
}
