// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import java.util.ArrayList;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintWidget, ConstraintAnchor

public class Snapshot
{
	static class Connection
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
				mStrengh = ConstraintAnchor.Strength.STRONG;
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
		private ConstraintAnchor.Strength mStrengh;
		private ConstraintAnchor mTarget;

		public Connection(ConstraintAnchor constraintanchor)
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


	public Snapshot(ConstraintWidget constraintwidget)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mConnections = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #22  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void ArrayList()>
	//    6   12:putfield        #25  <Field ArrayList mConnections>
		mX = constraintwidget.getX();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #31  <Method int ConstraintWidget.getX()>
	//   10   20:putfield        #33  <Field int mX>
		mY = constraintwidget.getY();
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #36  <Method int ConstraintWidget.getY()>
	//   14   28:putfield        #38  <Field int mY>
		mWidth = constraintwidget.getWidth();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #41  <Method int ConstraintWidget.getWidth()>
	//   18   36:putfield        #43  <Field int mWidth>
		mHeight = constraintwidget.getHeight();
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #46  <Method int ConstraintWidget.getHeight()>
	//   22   44:putfield        #48  <Field int mHeight>
		constraintwidget = ((ConstraintWidget) (constraintwidget.getAnchors()));
	//   23   47:aload_1         
	//   24   48:invokevirtual   #52  <Method ArrayList ConstraintWidget.getAnchors()>
	//   25   51:astore_1        
		int j = ((ArrayList) (constraintwidget)).size();
	//   26   52:aload_1         
	//   27   53:invokevirtual   #55  <Method int ArrayList.size()>
	//   28   56:istore_3        
		for(int i = 0; i < j; i++)
	//*  29   57:iconst_0        
	//*  30   58:istore_2        
	//*  31   59:iload_2         
	//*  32   60:iload_3         
	//*  33   61:icmpge          98
		{
			ConstraintAnchor constraintanchor = (ConstraintAnchor)((ArrayList) (constraintwidget)).get(i);
	//   34   64:aload_1         
	//   35   65:iload_2         
	//   36   66:invokevirtual   #59  <Method Object ArrayList.get(int)>
	//   37   69:checkcast       #61  <Class ConstraintAnchor>
	//   38   72:astore          4
			mConnections.add(((Object) (new Connection(constraintanchor))));
	//   39   74:aload_0         
	//   40   75:getfield        #25  <Field ArrayList mConnections>
	//   41   78:new             #6   <Class Snapshot$Connection>
	//   42   81:dup             
	//   43   82:aload           4
	//   44   84:invokespecial   #64  <Method void Snapshot$Connection(ConstraintAnchor)>
	//   45   87:invokevirtual   #68  <Method boolean ArrayList.add(Object)>
	//   46   90:pop             
		}

	//   47   91:iload_2         
	//   48   92:iconst_1        
	//   49   93:iadd            
	//   50   94:istore_2        
	//*  51   95:goto            59
	//   52   98:return          
	}

	public void applyTo(ConstraintWidget constraintwidget)
	{
		constraintwidget.setX(mX);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field int mX>
	//    3    5:invokevirtual   #74  <Method void ConstraintWidget.setX(int)>
		constraintwidget.setY(mY);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field int mY>
	//    7   13:invokevirtual   #77  <Method void ConstraintWidget.setY(int)>
		constraintwidget.setWidth(mWidth);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field int mWidth>
	//   11   21:invokevirtual   #80  <Method void ConstraintWidget.setWidth(int)>
		constraintwidget.setHeight(mHeight);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #48  <Field int mHeight>
	//   15   29:invokevirtual   #83  <Method void ConstraintWidget.setHeight(int)>
		int j = mConnections.size();
	//   16   32:aload_0         
	//   17   33:getfield        #25  <Field ArrayList mConnections>
	//   18   36:invokevirtual   #55  <Method int ArrayList.size()>
	//   19   39:istore_3        
		for(int i = 0; i < j; i++)
	//*  20   40:iconst_0        
	//*  21   41:istore_2        
	//*  22   42:iload_2         
	//*  23   43:iload_3         
	//*  24   44:icmpge          69
			((Connection)mConnections.get(i)).applyTo(constraintwidget);
	//   25   47:aload_0         
	//   26   48:getfield        #25  <Field ArrayList mConnections>
	//   27   51:iload_2         
	//   28   52:invokevirtual   #59  <Method Object ArrayList.get(int)>
	//   29   55:checkcast       #6   <Class Snapshot$Connection>
	//   30   58:aload_1         
	//   31   59:invokevirtual   #85  <Method void Snapshot$Connection.applyTo(ConstraintWidget)>

	//   32   62:iload_2         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore_2        
	//*  36   66:goto            42
	//   37   69:return          
	}

	public void updateFrom(ConstraintWidget constraintwidget)
	{
		mX = constraintwidget.getX();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #31  <Method int ConstraintWidget.getX()>
	//    3    5:putfield        #33  <Field int mX>
		mY = constraintwidget.getY();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #36  <Method int ConstraintWidget.getY()>
	//    7   13:putfield        #38  <Field int mY>
		mWidth = constraintwidget.getWidth();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #41  <Method int ConstraintWidget.getWidth()>
	//   11   21:putfield        #43  <Field int mWidth>
		mHeight = constraintwidget.getHeight();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #46  <Method int ConstraintWidget.getHeight()>
	//   15   29:putfield        #48  <Field int mHeight>
		int j = mConnections.size();
	//   16   32:aload_0         
	//   17   33:getfield        #25  <Field ArrayList mConnections>
	//   18   36:invokevirtual   #55  <Method int ArrayList.size()>
	//   19   39:istore_3        
		for(int i = 0; i < j; i++)
	//*  20   40:iconst_0        
	//*  21   41:istore_2        
	//*  22   42:iload_2         
	//*  23   43:iload_3         
	//*  24   44:icmpge          69
			((Connection)mConnections.get(i)).updateFrom(constraintwidget);
	//   25   47:aload_0         
	//   26   48:getfield        #25  <Field ArrayList mConnections>
	//   27   51:iload_2         
	//   28   52:invokevirtual   #59  <Method Object ArrayList.get(int)>
	//   29   55:checkcast       #6   <Class Snapshot$Connection>
	//   30   58:aload_1         
	//   31   59:invokevirtual   #88  <Method void Snapshot$Connection.updateFrom(ConstraintWidget)>

	//   32   62:iload_2         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore_2        
	//*  36   66:goto            42
	//   37   69:return          
	}

	private ArrayList mConnections;
	private int mHeight;
	private int mWidth;
	private int mX;
	private int mY;
}
