// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;
import java.util.ArrayList;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintWidgetContainer, ConstraintWidget, ConstraintAnchor, Guideline

public class ConstraintTableLayout extends ConstraintWidgetContainer
{
	class HorizontalSlice
	{

		ConstraintWidget bottom;
		int padding;
		final ConstraintTableLayout this$0;
		ConstraintWidget top;

		HorizontalSlice()
		{
			this$0 = ConstraintTableLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field ConstraintTableLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}

	class VerticalSlice
	{

		int alignment;
		ConstraintWidget left;
		int padding;
		ConstraintWidget right;
		final ConstraintTableLayout this$0;

		VerticalSlice()
		{
			this$0 = ConstraintTableLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ConstraintTableLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			alignment = 1;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #24  <Field int alignment>
		//    8   14:return          
		}
	}


	public ConstraintTableLayout()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void ConstraintWidgetContainer()>
		mVerticalGrowth = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #40  <Field boolean mVerticalGrowth>
		mNumCols = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #42  <Field int mNumCols>
		mNumRows = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #44  <Field int mNumRows>
		mPadding = 8;
	//   11   19:aload_0         
	//   12   20:bipush          8
	//   13   22:putfield        #46  <Field int mPadding>
		mVerticalSlices = new ArrayList();
	//   14   25:aload_0         
	//   15   26:new             #48  <Class ArrayList>
	//   16   29:dup             
	//   17   30:invokespecial   #49  <Method void ArrayList()>
	//   18   33:putfield        #51  <Field ArrayList mVerticalSlices>
		mHorizontalSlices = new ArrayList();
	//   19   36:aload_0         
	//   20   37:new             #48  <Class ArrayList>
	//   21   40:dup             
	//   22   41:invokespecial   #49  <Method void ArrayList()>
	//   23   44:putfield        #53  <Field ArrayList mHorizontalSlices>
		mVerticalGuidelines = new ArrayList();
	//   24   47:aload_0         
	//   25   48:new             #48  <Class ArrayList>
	//   26   51:dup             
	//   27   52:invokespecial   #49  <Method void ArrayList()>
	//   28   55:putfield        #55  <Field ArrayList mVerticalGuidelines>
		mHorizontalGuidelines = new ArrayList();
	//   29   58:aload_0         
	//   30   59:new             #48  <Class ArrayList>
	//   31   62:dup             
	//   32   63:invokespecial   #49  <Method void ArrayList()>
	//   33   66:putfield        #57  <Field ArrayList mHorizontalGuidelines>
		system = null;
	//   34   69:aload_0         
	//   35   70:aconst_null     
	//   36   71:putfield        #59  <Field LinearSystem system>
	//   37   74:return          
	}

	public ConstraintTableLayout(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #63  <Method void ConstraintWidgetContainer(int, int)>
		mVerticalGrowth = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #40  <Field boolean mVerticalGrowth>
		mNumCols = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #42  <Field int mNumCols>
		mNumRows = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #44  <Field int mNumRows>
		mPadding = 8;
	//   13   21:aload_0         
	//   14   22:bipush          8
	//   15   24:putfield        #46  <Field int mPadding>
		mVerticalSlices = new ArrayList();
	//   16   27:aload_0         
	//   17   28:new             #48  <Class ArrayList>
	//   18   31:dup             
	//   19   32:invokespecial   #49  <Method void ArrayList()>
	//   20   35:putfield        #51  <Field ArrayList mVerticalSlices>
		mHorizontalSlices = new ArrayList();
	//   21   38:aload_0         
	//   22   39:new             #48  <Class ArrayList>
	//   23   42:dup             
	//   24   43:invokespecial   #49  <Method void ArrayList()>
	//   25   46:putfield        #53  <Field ArrayList mHorizontalSlices>
		mVerticalGuidelines = new ArrayList();
	//   26   49:aload_0         
	//   27   50:new             #48  <Class ArrayList>
	//   28   53:dup             
	//   29   54:invokespecial   #49  <Method void ArrayList()>
	//   30   57:putfield        #55  <Field ArrayList mVerticalGuidelines>
		mHorizontalGuidelines = new ArrayList();
	//   31   60:aload_0         
	//   32   61:new             #48  <Class ArrayList>
	//   33   64:dup             
	//   34   65:invokespecial   #49  <Method void ArrayList()>
	//   35   68:putfield        #57  <Field ArrayList mHorizontalGuidelines>
		system = null;
	//   36   71:aload_0         
	//   37   72:aconst_null     
	//   38   73:putfield        #59  <Field LinearSystem system>
	//   39   76:return          
	}

	public ConstraintTableLayout(int i, int j, int k, int l)
	{
		super(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #66  <Method void ConstraintWidgetContainer(int, int, int, int)>
		mVerticalGrowth = true;
	//    6    9:aload_0         
	//    7   10:iconst_1        
	//    8   11:putfield        #40  <Field boolean mVerticalGrowth>
		mNumCols = 0;
	//    9   14:aload_0         
	//   10   15:iconst_0        
	//   11   16:putfield        #42  <Field int mNumCols>
		mNumRows = 0;
	//   12   19:aload_0         
	//   13   20:iconst_0        
	//   14   21:putfield        #44  <Field int mNumRows>
		mPadding = 8;
	//   15   24:aload_0         
	//   16   25:bipush          8
	//   17   27:putfield        #46  <Field int mPadding>
		mVerticalSlices = new ArrayList();
	//   18   30:aload_0         
	//   19   31:new             #48  <Class ArrayList>
	//   20   34:dup             
	//   21   35:invokespecial   #49  <Method void ArrayList()>
	//   22   38:putfield        #51  <Field ArrayList mVerticalSlices>
		mHorizontalSlices = new ArrayList();
	//   23   41:aload_0         
	//   24   42:new             #48  <Class ArrayList>
	//   25   45:dup             
	//   26   46:invokespecial   #49  <Method void ArrayList()>
	//   27   49:putfield        #53  <Field ArrayList mHorizontalSlices>
		mVerticalGuidelines = new ArrayList();
	//   28   52:aload_0         
	//   29   53:new             #48  <Class ArrayList>
	//   30   56:dup             
	//   31   57:invokespecial   #49  <Method void ArrayList()>
	//   32   60:putfield        #55  <Field ArrayList mVerticalGuidelines>
		mHorizontalGuidelines = new ArrayList();
	//   33   63:aload_0         
	//   34   64:new             #48  <Class ArrayList>
	//   35   67:dup             
	//   36   68:invokespecial   #49  <Method void ArrayList()>
	//   37   71:putfield        #57  <Field ArrayList mHorizontalGuidelines>
		system = null;
	//   38   74:aload_0         
	//   39   75:aconst_null     
	//   40   76:putfield        #59  <Field LinearSystem system>
	//   41   79:return          
	}

	private void setChildrenConnections()
	{
		int k = mChildren.size();
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field ArrayList mChildren>
	//    2    4:invokevirtual   #74  <Method int ArrayList.size()>
	//    3    7:istore_3        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		int j = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		for(; i < k; i++)
	//*   8   12:iload_1         
	//*   9   13:iload_3         
	//*  10   14:icmpge          391
		{
			ConstraintWidget constraintwidget = (ConstraintWidget)mChildren.get(i);
	//   11   17:aload_0         
	//   12   18:getfield        #70  <Field ArrayList mChildren>
	//   13   21:iload_1         
	//   14   22:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   15   25:checkcast       #80  <Class ConstraintWidget>
	//   16   28:astore          6
			j += constraintwidget.getContainerItemSkip();
	//   17   30:iload_2         
	//   18   31:aload           6
	//   19   33:invokevirtual   #83  <Method int ConstraintWidget.getContainerItemSkip()>
	//   20   36:iadd            
	//   21   37:istore_2        
			int l = mNumCols;
	//   22   38:aload_0         
	//   23   39:getfield        #42  <Field int mNumCols>
	//   24   42:istore          4
			int i1 = j / l;
	//   25   44:iload_2         
	//   26   45:iload           4
	//   27   47:idiv            
	//   28   48:istore          5
			Object obj = ((Object) ((HorizontalSlice)mHorizontalSlices.get(i1)));
	//   29   50:aload_0         
	//   30   51:getfield        #53  <Field ArrayList mHorizontalSlices>
	//   31   54:iload           5
	//   32   56:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   33   59:checkcast       #6   <Class ConstraintTableLayout$HorizontalSlice>
	//   34   62:astore          11
			VerticalSlice verticalslice = (VerticalSlice)mVerticalSlices.get(j % l);
	//   35   64:aload_0         
	//   36   65:getfield        #51  <Field ArrayList mVerticalSlices>
	//   37   68:iload_2         
	//   38   69:iload           4
	//   39   71:irem            
	//   40   72:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   41   75:checkcast       #9   <Class ConstraintTableLayout$VerticalSlice>
	//   42   78:astore          7
			ConstraintWidget constraintwidget1 = verticalslice.left;
	//   43   80:aload           7
	//   44   82:getfield        #87  <Field ConstraintWidget ConstraintTableLayout$VerticalSlice.left>
	//   45   85:astore          8
			ConstraintWidget constraintwidget2 = verticalslice.right;
	//   46   87:aload           7
	//   47   89:getfield        #90  <Field ConstraintWidget ConstraintTableLayout$VerticalSlice.right>
	//   48   92:astore          9
			ConstraintWidget constraintwidget3 = ((HorizontalSlice) (obj)).top;
	//   49   94:aload           11
	//   50   96:getfield        #93  <Field ConstraintWidget ConstraintTableLayout$HorizontalSlice.top>
	//   51   99:astore          10
			obj = ((Object) (((HorizontalSlice) (obj)).bottom));
	//   52  101:aload           11
	//   53  103:getfield        #96  <Field ConstraintWidget ConstraintTableLayout$HorizontalSlice.bottom>
	//   54  106:astore          11
			constraintwidget.getAnchor(ConstraintAnchor.Type.LEFT).connect(constraintwidget1.getAnchor(ConstraintAnchor.Type.LEFT), mPadding);
	//   55  108:aload           6
	//   56  110:getstatic       #102 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   57  113:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//   58  116:aload           8
	//   59  118:getstatic       #102 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   60  121:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//   61  124:aload_0         
	//   62  125:getfield        #46  <Field int mPadding>
	//   63  128:invokevirtual   #112 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int)>
	//   64  131:pop             
			if(constraintwidget2 instanceof Guideline)
	//*  65  132:aload           9
	//*  66  134:instanceof      #114 <Class Guideline>
	//*  67  137:ifeq            167
				constraintwidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(constraintwidget2.getAnchor(ConstraintAnchor.Type.LEFT), mPadding);
	//   68  140:aload           6
	//   69  142:getstatic       #117 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   70  145:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//   71  148:aload           9
	//   72  150:getstatic       #102 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   73  153:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//   74  156:aload_0         
	//   75  157:getfield        #46  <Field int mPadding>
	//   76  160:invokevirtual   #112 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int)>
	//   77  163:pop             
			else
	//*  78  164:goto            191
				constraintwidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(constraintwidget2.getAnchor(ConstraintAnchor.Type.RIGHT), mPadding);
	//   79  167:aload           6
	//   80  169:getstatic       #117 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   81  172:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//   82  175:aload           9
	//   83  177:getstatic       #117 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   84  180:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//   85  183:aload_0         
	//   86  184:getfield        #46  <Field int mPadding>
	//   87  187:invokevirtual   #112 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int)>
	//   88  190:pop             
			switch(verticalslice.alignment)
	//*  89  191:aload           7
	//*  90  193:getfield        #120 <Field int ConstraintTableLayout$VerticalSlice.alignment>
			{
	//*  91  196:tableswitch     1 3: default 224
	//	               1 269
	//	               2 238
	//	               3 227
	//*  92  224:goto            297
			case 3: // '\003'
				constraintwidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
	//   93  227:aload           6
	//   94  229:getstatic       #126 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//   95  232:invokevirtual   #130 <Method void ConstraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget$DimensionBehaviour)>
				break;

	//*  96  235:goto            297
			case 2: // '\002'
				constraintwidget.getAnchor(ConstraintAnchor.Type.LEFT).setStrength(ConstraintAnchor.Strength.WEAK);
	//   97  238:aload           6
	//   98  240:getstatic       #102 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   99  243:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//  100  246:getstatic       #136 <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.WEAK>
	//  101  249:invokevirtual   #140 <Method void ConstraintAnchor.setStrength(ConstraintAnchor$Strength)>
				constraintwidget.getAnchor(ConstraintAnchor.Type.RIGHT).setStrength(ConstraintAnchor.Strength.STRONG);
	//  102  252:aload           6
	//  103  254:getstatic       #117 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//  104  257:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//  105  260:getstatic       #143 <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//  106  263:invokevirtual   #140 <Method void ConstraintAnchor.setStrength(ConstraintAnchor$Strength)>
				break;

	//* 107  266:goto            297
			case 1: // '\001'
				constraintwidget.getAnchor(ConstraintAnchor.Type.LEFT).setStrength(ConstraintAnchor.Strength.STRONG);
	//  108  269:aload           6
	//  109  271:getstatic       #102 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//  110  274:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//  111  277:getstatic       #143 <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//  112  280:invokevirtual   #140 <Method void ConstraintAnchor.setStrength(ConstraintAnchor$Strength)>
				constraintwidget.getAnchor(ConstraintAnchor.Type.RIGHT).setStrength(ConstraintAnchor.Strength.WEAK);
	//  113  283:aload           6
	//  114  285:getstatic       #117 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//  115  288:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//  116  291:getstatic       #136 <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.WEAK>
	//  117  294:invokevirtual   #140 <Method void ConstraintAnchor.setStrength(ConstraintAnchor$Strength)>
				break;
			}
			constraintwidget.getAnchor(ConstraintAnchor.Type.TOP).connect(constraintwidget3.getAnchor(ConstraintAnchor.Type.TOP), mPadding);
	//  118  297:aload           6
	//  119  299:getstatic       #146 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//  120  302:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//  121  305:aload           10
	//  122  307:getstatic       #146 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//  123  310:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//  124  313:aload_0         
	//  125  314:getfield        #46  <Field int mPadding>
	//  126  317:invokevirtual   #112 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int)>
	//  127  320:pop             
			if(obj instanceof Guideline)
	//* 128  321:aload           11
	//* 129  323:instanceof      #114 <Class Guideline>
	//* 130  326:ifeq            356
				constraintwidget.getAnchor(ConstraintAnchor.Type.BOTTOM).connect(((ConstraintWidget) (obj)).getAnchor(ConstraintAnchor.Type.TOP), mPadding);
	//  131  329:aload           6
	//  132  331:getstatic       #149 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//  133  334:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//  134  337:aload           11
	//  135  339:getstatic       #146 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//  136  342:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//  137  345:aload_0         
	//  138  346:getfield        #46  <Field int mPadding>
	//  139  349:invokevirtual   #112 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int)>
	//  140  352:pop             
			else
	//* 141  353:goto            380
				constraintwidget.getAnchor(ConstraintAnchor.Type.BOTTOM).connect(((ConstraintWidget) (obj)).getAnchor(ConstraintAnchor.Type.BOTTOM), mPadding);
	//  142  356:aload           6
	//  143  358:getstatic       #149 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//  144  361:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//  145  364:aload           11
	//  146  366:getstatic       #149 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//  147  369:invokevirtual   #106 <Method ConstraintAnchor ConstraintWidget.getAnchor(ConstraintAnchor$Type)>
	//  148  372:aload_0         
	//  149  373:getfield        #46  <Field int mPadding>
	//  150  376:invokevirtual   #112 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int)>
	//  151  379:pop             
			j++;
	//  152  380:iload_2         
	//  153  381:iconst_1        
	//  154  382:iadd            
	//  155  383:istore_2        
		}

	//  156  384:iload_1         
	//  157  385:iconst_1        
	//  158  386:iadd            
	//  159  387:istore_1        
	//* 160  388:goto            12
	//  161  391:return          
	}

	private void setHorizontalSlices()
	{
		mHorizontalSlices.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ArrayList mHorizontalSlices>
	//    2    4:invokevirtual   #153 <Method void ArrayList.clear()>
		float f1 = 100F / (float)mNumRows;
	//    3    7:ldc1            #154 <Float 100F>
	//    4    9:aload_0         
	//    5   10:getfield        #44  <Field int mNumRows>
	//    6   13:i2f             
	//    7   14:fdiv            
	//    8   15:fstore_2        
		Object obj = ((Object) (this));
	//    9   16:aload_0         
	//   10   17:astore          4
		int i = 0;
	//   11   19:iconst_0        
	//   12   20:istore_3        
		float f = f1;
	//   13   21:fload_2         
	//   14   22:fstore_1        
		for(; i < mNumRows; i++)
	//*  15   23:iload_3         
	//*  16   24:aload_0         
	//*  17   25:getfield        #44  <Field int mNumRows>
	//*  18   28:icmpge          140
		{
			HorizontalSlice horizontalslice = new HorizontalSlice();
	//   19   31:new             #6   <Class ConstraintTableLayout$HorizontalSlice>
	//   20   34:dup             
	//   21   35:aload_0         
	//   22   36:invokespecial   #157 <Method void ConstraintTableLayout$HorizontalSlice(ConstraintTableLayout)>
	//   23   39:astore          5
			horizontalslice.top = ((ConstraintWidget) (obj));
	//   24   41:aload           5
	//   25   43:aload           4
	//   26   45:putfield        #93  <Field ConstraintWidget ConstraintTableLayout$HorizontalSlice.top>
			if(i < mNumRows - 1)
	//*  27   48:iload_3         
	//*  28   49:aload_0         
	//*  29   50:getfield        #44  <Field int mNumRows>
	//*  30   53:iconst_1        
	//*  31   54:isub            
	//*  32   55:icmpge          110
			{
				obj = ((Object) (new Guideline()));
	//   33   58:new             #114 <Class Guideline>
	//   34   61:dup             
	//   35   62:invokespecial   #158 <Method void Guideline()>
	//   36   65:astore          4
				((Guideline) (obj)).setOrientation(0);
	//   37   67:aload           4
	//   38   69:iconst_0        
	//   39   70:invokevirtual   #162 <Method void Guideline.setOrientation(int)>
				((Guideline) (obj)).setParent(((ConstraintWidget) (this)));
	//   40   73:aload           4
	//   41   75:aload_0         
	//   42   76:invokevirtual   #166 <Method void Guideline.setParent(ConstraintWidget)>
				((Guideline) (obj)).setGuidePercent((int)f);
	//   43   79:aload           4
	//   44   81:fload_1         
	//   45   82:f2i             
	//   46   83:invokevirtual   #169 <Method void Guideline.setGuidePercent(int)>
				f += f1;
	//   47   86:fload_1         
	//   48   87:fload_2         
	//   49   88:fadd            
	//   50   89:fstore_1        
				horizontalslice.bottom = ((ConstraintWidget) (obj));
	//   51   90:aload           5
	//   52   92:aload           4
	//   53   94:putfield        #96  <Field ConstraintWidget ConstraintTableLayout$HorizontalSlice.bottom>
				mHorizontalGuidelines.add(obj);
	//   54   97:aload_0         
	//   55   98:getfield        #57  <Field ArrayList mHorizontalGuidelines>
	//   56  101:aload           4
	//   57  103:invokevirtual   #173 <Method boolean ArrayList.add(Object)>
	//   58  106:pop             
			} else
	//*  59  107:goto            116
			{
				horizontalslice.bottom = ((ConstraintWidget) (this));
	//   60  110:aload           5
	//   61  112:aload_0         
	//   62  113:putfield        #96  <Field ConstraintWidget ConstraintTableLayout$HorizontalSlice.bottom>
			}
			obj = ((Object) (horizontalslice.bottom));
	//   63  116:aload           5
	//   64  118:getfield        #96  <Field ConstraintWidget ConstraintTableLayout$HorizontalSlice.bottom>
	//   65  121:astore          4
			mHorizontalSlices.add(((Object) (horizontalslice)));
	//   66  123:aload_0         
	//   67  124:getfield        #53  <Field ArrayList mHorizontalSlices>
	//   68  127:aload           5
	//   69  129:invokevirtual   #173 <Method boolean ArrayList.add(Object)>
	//   70  132:pop             
		}

	//   71  133:iload_3         
	//   72  134:iconst_1        
	//   73  135:iadd            
	//   74  136:istore_3        
	//*  75  137:goto            23
		updateDebugSolverNames();
	//   76  140:aload_0         
	//   77  141:invokespecial   #176 <Method void updateDebugSolverNames()>
	//   78  144:return          
	}

	private void setVerticalSlices()
	{
		mVerticalSlices.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ArrayList mVerticalSlices>
	//    2    4:invokevirtual   #153 <Method void ArrayList.clear()>
		float f1 = 100F / (float)mNumCols;
	//    3    7:ldc1            #154 <Float 100F>
	//    4    9:aload_0         
	//    5   10:getfield        #42  <Field int mNumCols>
	//    6   13:i2f             
	//    7   14:fdiv            
	//    8   15:fstore_2        
		int i = 0;
	//    9   16:iconst_0        
	//   10   17:istore_3        
		Object obj = ((Object) (this));
	//   11   18:aload_0         
	//   12   19:astore          4
		float f = f1;
	//   13   21:fload_2         
	//   14   22:fstore_1        
		for(; i < mNumCols; i++)
	//*  15   23:iload_3         
	//*  16   24:aload_0         
	//*  17   25:getfield        #42  <Field int mNumCols>
	//*  18   28:icmpge          140
		{
			VerticalSlice verticalslice = new VerticalSlice();
	//   19   31:new             #9   <Class ConstraintTableLayout$VerticalSlice>
	//   20   34:dup             
	//   21   35:aload_0         
	//   22   36:invokespecial   #178 <Method void ConstraintTableLayout$VerticalSlice(ConstraintTableLayout)>
	//   23   39:astore          5
			verticalslice.left = ((ConstraintWidget) (obj));
	//   24   41:aload           5
	//   25   43:aload           4
	//   26   45:putfield        #87  <Field ConstraintWidget ConstraintTableLayout$VerticalSlice.left>
			if(i < mNumCols - 1)
	//*  27   48:iload_3         
	//*  28   49:aload_0         
	//*  29   50:getfield        #42  <Field int mNumCols>
	//*  30   53:iconst_1        
	//*  31   54:isub            
	//*  32   55:icmpge          110
			{
				obj = ((Object) (new Guideline()));
	//   33   58:new             #114 <Class Guideline>
	//   34   61:dup             
	//   35   62:invokespecial   #158 <Method void Guideline()>
	//   36   65:astore          4
				((Guideline) (obj)).setOrientation(1);
	//   37   67:aload           4
	//   38   69:iconst_1        
	//   39   70:invokevirtual   #162 <Method void Guideline.setOrientation(int)>
				((Guideline) (obj)).setParent(((ConstraintWidget) (this)));
	//   40   73:aload           4
	//   41   75:aload_0         
	//   42   76:invokevirtual   #166 <Method void Guideline.setParent(ConstraintWidget)>
				((Guideline) (obj)).setGuidePercent((int)f);
	//   43   79:aload           4
	//   44   81:fload_1         
	//   45   82:f2i             
	//   46   83:invokevirtual   #169 <Method void Guideline.setGuidePercent(int)>
				f += f1;
	//   47   86:fload_1         
	//   48   87:fload_2         
	//   49   88:fadd            
	//   50   89:fstore_1        
				verticalslice.right = ((ConstraintWidget) (obj));
	//   51   90:aload           5
	//   52   92:aload           4
	//   53   94:putfield        #90  <Field ConstraintWidget ConstraintTableLayout$VerticalSlice.right>
				mVerticalGuidelines.add(obj);
	//   54   97:aload_0         
	//   55   98:getfield        #55  <Field ArrayList mVerticalGuidelines>
	//   56  101:aload           4
	//   57  103:invokevirtual   #173 <Method boolean ArrayList.add(Object)>
	//   58  106:pop             
			} else
	//*  59  107:goto            116
			{
				verticalslice.right = ((ConstraintWidget) (this));
	//   60  110:aload           5
	//   61  112:aload_0         
	//   62  113:putfield        #90  <Field ConstraintWidget ConstraintTableLayout$VerticalSlice.right>
			}
			obj = ((Object) (verticalslice.right));
	//   63  116:aload           5
	//   64  118:getfield        #90  <Field ConstraintWidget ConstraintTableLayout$VerticalSlice.right>
	//   65  121:astore          4
			mVerticalSlices.add(((Object) (verticalslice)));
	//   66  123:aload_0         
	//   67  124:getfield        #51  <Field ArrayList mVerticalSlices>
	//   68  127:aload           5
	//   69  129:invokevirtual   #173 <Method boolean ArrayList.add(Object)>
	//   70  132:pop             
		}

	//   71  133:iload_3         
	//   72  134:iconst_1        
	//   73  135:iadd            
	//   74  136:istore_3        
	//*  75  137:goto            23
		updateDebugSolverNames();
	//   76  140:aload_0         
	//   77  141:invokespecial   #176 <Method void updateDebugSolverNames()>
	//   78  144:return          
	}

	private void updateDebugSolverNames()
	{
		if(system == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field LinearSystem system>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		int k = mVerticalGuidelines.size();
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field ArrayList mVerticalGuidelines>
	//    6   12:invokevirtual   #74  <Method int ArrayList.size()>
	//    7   15:istore_3        
		boolean flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_2        
		for(int i = 0; i < k; i++)
	//*  10   18:iconst_0        
	//*  11   19:istore_1        
	//*  12   20:iload_1         
	//*  13   21:iload_3         
	//*  14   22:icmpge          97
		{
			Guideline guideline = (Guideline)mVerticalGuidelines.get(i);
	//   15   25:aload_0         
	//   16   26:getfield        #55  <Field ArrayList mVerticalGuidelines>
	//   17   29:iload_1         
	//   18   30:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   19   33:checkcast       #114 <Class Guideline>
	//   20   36:astore          4
			LinearSystem linearsystem = system;
	//   21   38:aload_0         
	//   22   39:getfield        #59  <Field LinearSystem system>
	//   23   42:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   24   44:new             #180 <Class StringBuilder>
	//   25   47:dup             
	//   26   48:invokespecial   #181 <Method void StringBuilder()>
	//   27   51:astore          6
			stringbuilder.append(getDebugName());
	//   28   53:aload           6
	//   29   55:aload_0         
	//   30   56:invokevirtual   #185 <Method String getDebugName()>
	//   31   59:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
			stringbuilder.append(".VG");
	//   33   63:aload           6
	//   34   65:ldc1            #191 <String ".VG">
	//   35   67:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   36   70:pop             
			stringbuilder.append(i);
	//   37   71:aload           6
	//   38   73:iload_1         
	//   39   74:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//   40   77:pop             
			guideline.setDebugSolverName(linearsystem, stringbuilder.toString());
	//   41   78:aload           4
	//   42   80:aload           5
	//   43   82:aload           6
	//   44   84:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   45   87:invokevirtual   #201 <Method void Guideline.setDebugSolverName(LinearSystem, String)>
		}

	//   46   90:iload_1         
	//   47   91:iconst_1        
	//   48   92:iadd            
	//   49   93:istore_1        
	//*  50   94:goto            20
		k = mHorizontalGuidelines.size();
	//   51   97:aload_0         
	//   52   98:getfield        #57  <Field ArrayList mHorizontalGuidelines>
	//   53  101:invokevirtual   #74  <Method int ArrayList.size()>
	//   54  104:istore_3        
		for(int j = ((int) (flag)); j < k; j++)
	//*  55  105:iload_2         
	//*  56  106:istore_1        
	//*  57  107:iload_1         
	//*  58  108:iload_3         
	//*  59  109:icmpge          184
		{
			Guideline guideline1 = (Guideline)mHorizontalGuidelines.get(j);
	//   60  112:aload_0         
	//   61  113:getfield        #57  <Field ArrayList mHorizontalGuidelines>
	//   62  116:iload_1         
	//   63  117:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   64  120:checkcast       #114 <Class Guideline>
	//   65  123:astore          4
			LinearSystem linearsystem1 = system;
	//   66  125:aload_0         
	//   67  126:getfield        #59  <Field LinearSystem system>
	//   68  129:astore          5
			StringBuilder stringbuilder1 = new StringBuilder();
	//   69  131:new             #180 <Class StringBuilder>
	//   70  134:dup             
	//   71  135:invokespecial   #181 <Method void StringBuilder()>
	//   72  138:astore          6
			stringbuilder1.append(getDebugName());
	//   73  140:aload           6
	//   74  142:aload_0         
	//   75  143:invokevirtual   #185 <Method String getDebugName()>
	//   76  146:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   77  149:pop             
			stringbuilder1.append(".HG");
	//   78  150:aload           6
	//   79  152:ldc1            #203 <String ".HG">
	//   80  154:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   81  157:pop             
			stringbuilder1.append(j);
	//   82  158:aload           6
	//   83  160:iload_1         
	//   84  161:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//   85  164:pop             
			guideline1.setDebugSolverName(linearsystem1, stringbuilder1.toString());
	//   86  165:aload           4
	//   87  167:aload           5
	//   88  169:aload           6
	//   89  171:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   90  174:invokevirtual   #201 <Method void Guideline.setDebugSolverName(LinearSystem, String)>
		}

	//   91  177:iload_1         
	//   92  178:iconst_1        
	//   93  179:iadd            
	//   94  180:istore_1        
	//*  95  181:goto            107
	//   96  184:return          
	}

	public void addToSolver(LinearSystem linearsystem)
	{
		super.addToSolver(linearsystem);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #207 <Method void ConstraintWidgetContainer.addToSolver(LinearSystem)>
		int k = mChildren.size();
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field ArrayList mChildren>
	//    5    9:invokevirtual   #74  <Method int ArrayList.size()>
	//    6   12:istore          5
		if(k == 0)
	//*   7   14:iload           5
	//*   8   16:ifne            20
			return;
	//    9   19:return          
		setTableDimensions();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #210 <Method void setTableDimensions()>
		if(linearsystem == mSystem)
	//*  12   24:aload_1         
	//*  13   25:aload_0         
	//*  14   26:getfield        #213 <Field LinearSystem mSystem>
	//*  15   29:if_acmpne       202
		{
			int j = mVerticalGuidelines.size();
	//   16   32:aload_0         
	//   17   33:getfield        #55  <Field ArrayList mVerticalGuidelines>
	//   18   36:invokevirtual   #74  <Method int ArrayList.size()>
	//   19   39:istore_3        
			boolean flag = false;
	//   20   40:iconst_0        
	//   21   41:istore          4
			int i = 0;
	//   22   43:iconst_0        
	//   23   44:istore_2        
			do
			{
				boolean flag1 = true;
	//   24   45:iconst_1        
	//   25   46:istore          7
				if(i >= j)
					break;
	//   26   48:iload_2         
	//   27   49:iload_3         
	//   28   50:icmpge          102
				Guideline guideline = (Guideline)mVerticalGuidelines.get(i);
	//   29   53:aload_0         
	//   30   54:getfield        #55  <Field ArrayList mVerticalGuidelines>
	//   31   57:iload_2         
	//   32   58:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   33   61:checkcast       #114 <Class Guideline>
	//   34   64:astore          8
				if(getHorizontalDimensionBehaviour() != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  35   66:aload_0         
	//*  36   67:invokevirtual   #217 <Method ConstraintWidget$DimensionBehaviour getHorizontalDimensionBehaviour()>
	//*  37   70:getstatic       #220 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  38   73:if_acmpne       79
	//*  39   76:goto            82
					flag1 = false;
	//   40   79:iconst_0        
	//   41   80:istore          7
				guideline.setPositionRelaxed(flag1);
	//   42   82:aload           8
	//   43   84:iload           7
	//   44   86:invokevirtual   #224 <Method void Guideline.setPositionRelaxed(boolean)>
				guideline.addToSolver(linearsystem);
	//   45   89:aload           8
	//   46   91:aload_1         
	//   47   92:invokevirtual   #225 <Method void Guideline.addToSolver(LinearSystem)>
				i++;
	//   48   95:iload_2         
	//   49   96:iconst_1        
	//   50   97:iadd            
	//   51   98:istore_2        
			} while(true);
	//   52   99:goto            45
			int l = mHorizontalGuidelines.size();
	//   53  102:aload_0         
	//   54  103:getfield        #57  <Field ArrayList mHorizontalGuidelines>
	//   55  106:invokevirtual   #74  <Method int ArrayList.size()>
	//   56  109:istore          6
			i = 0;
	//   57  111:iconst_0        
	//   58  112:istore_2        
			do
			{
				j = ((int) (flag));
	//   59  113:iload           4
	//   60  115:istore_3        
				if(i >= l)
					break;
	//   61  116:iload_2         
	//   62  117:iload           6
	//   63  119:icmpge          174
				Guideline guideline1 = (Guideline)mHorizontalGuidelines.get(i);
	//   64  122:aload_0         
	//   65  123:getfield        #57  <Field ArrayList mHorizontalGuidelines>
	//   66  126:iload_2         
	//   67  127:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   68  130:checkcast       #114 <Class Guideline>
	//   69  133:astore          8
				boolean flag2;
				if(getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  70  135:aload_0         
	//*  71  136:invokevirtual   #228 <Method ConstraintWidget$DimensionBehaviour getVerticalDimensionBehaviour()>
	//*  72  139:getstatic       #220 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  73  142:if_acmpne       151
					flag2 = true;
	//   74  145:iconst_1        
	//   75  146:istore          7
				else
	//*  76  148:goto            154
					flag2 = false;
	//   77  151:iconst_0        
	//   78  152:istore          7
				guideline1.setPositionRelaxed(flag2);
	//   79  154:aload           8
	//   80  156:iload           7
	//   81  158:invokevirtual   #224 <Method void Guideline.setPositionRelaxed(boolean)>
				guideline1.addToSolver(linearsystem);
	//   82  161:aload           8
	//   83  163:aload_1         
	//   84  164:invokevirtual   #225 <Method void Guideline.addToSolver(LinearSystem)>
				i++;
	//   85  167:iload_2         
	//   86  168:iconst_1        
	//   87  169:iadd            
	//   88  170:istore_2        
			} while(true);
	//   89  171:goto            113
			for(; j < k; j++)
	//*  90  174:iload_3         
	//*  91  175:iload           5
	//*  92  177:icmpge          202
				((ConstraintWidget)mChildren.get(j)).addToSolver(linearsystem);
	//   93  180:aload_0         
	//   94  181:getfield        #70  <Field ArrayList mChildren>
	//   95  184:iload_3         
	//   96  185:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   97  188:checkcast       #80  <Class ConstraintWidget>
	//   98  191:aload_1         
	//   99  192:invokevirtual   #229 <Method void ConstraintWidget.addToSolver(LinearSystem)>

	//  100  195:iload_3         
	//  101  196:iconst_1        
	//  102  197:iadd            
	//  103  198:istore_3        
		}
	//* 104  199:goto            174
	//  105  202:return          
	}

	public void computeGuidelinesPercentPositions()
	{
		int k = mVerticalGuidelines.size();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field ArrayList mVerticalGuidelines>
	//    2    4:invokevirtual   #74  <Method int ArrayList.size()>
	//    3    7:istore_3        
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		for(int i = 0; i < k; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:iload_3         
	//*  10   14:icmpge          38
			((Guideline)mVerticalGuidelines.get(i)).inferRelativePercentPosition();
	//   11   17:aload_0         
	//   12   18:getfield        #55  <Field ArrayList mVerticalGuidelines>
	//   13   21:iload_1         
	//   14   22:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   15   25:checkcast       #114 <Class Guideline>
	//   16   28:invokevirtual   #233 <Method void Guideline.inferRelativePercentPosition()>

	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_1        
	//*  21   35:goto            12
		k = mHorizontalGuidelines.size();
	//   22   38:aload_0         
	//   23   39:getfield        #57  <Field ArrayList mHorizontalGuidelines>
	//   24   42:invokevirtual   #74  <Method int ArrayList.size()>
	//   25   45:istore_3        
		for(int j = ((int) (flag)); j < k; j++)
	//*  26   46:iload_2         
	//*  27   47:istore_1        
	//*  28   48:iload_1         
	//*  29   49:iload_3         
	//*  30   50:icmpge          74
			((Guideline)mHorizontalGuidelines.get(j)).inferRelativePercentPosition();
	//   31   53:aload_0         
	//   32   54:getfield        #57  <Field ArrayList mHorizontalGuidelines>
	//   33   57:iload_1         
	//   34   58:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   35   61:checkcast       #114 <Class Guideline>
	//   36   64:invokevirtual   #233 <Method void Guideline.inferRelativePercentPosition()>

	//   37   67:iload_1         
	//   38   68:iconst_1        
	//   39   69:iadd            
	//   40   70:istore_1        
	//*  41   71:goto            48
	//   42   74:return          
	}

	public void cycleColumnAlignment(int i)
	{
		VerticalSlice verticalslice = (VerticalSlice)mVerticalSlices.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ArrayList mVerticalSlices>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #9   <Class ConstraintTableLayout$VerticalSlice>
	//    5   11:astore_2        
		switch(verticalslice.alignment)
	//*   6   12:aload_2         
	//*   7   13:getfield        #120 <Field int ConstraintTableLayout$VerticalSlice.alignment>
		{
	//*   8   16:tableswitch     0 2: default 44
	//	               0 63
	//	               1 55
	//	               2 47
	//*   9   44:goto            68
		case 2: // '\002'
			verticalslice.alignment = 1;
	//   10   47:aload_2         
	//   11   48:iconst_1        
	//   12   49:putfield        #120 <Field int ConstraintTableLayout$VerticalSlice.alignment>
			break;

	//*  13   52:goto            68
		case 1: // '\001'
			verticalslice.alignment = 0;
	//   14   55:aload_2         
	//   15   56:iconst_0        
	//   16   57:putfield        #120 <Field int ConstraintTableLayout$VerticalSlice.alignment>
			break;

	//*  17   60:goto            68
		case 0: // '\0'
			verticalslice.alignment = 2;
	//   18   63:aload_2         
	//   19   64:iconst_2        
	//   20   65:putfield        #120 <Field int ConstraintTableLayout$VerticalSlice.alignment>
			break;
		}
		setChildrenConnections();
	//   21   68:aload_0         
	//   22   69:invokespecial   #236 <Method void setChildrenConnections()>
	//   23   72:return          
	}

	public String getColumnAlignmentRepresentation(int i)
	{
		VerticalSlice verticalslice = (VerticalSlice)mVerticalSlices.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ArrayList mVerticalSlices>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #9   <Class ConstraintTableLayout$VerticalSlice>
	//    5   11:astore_2        
		if(verticalslice.alignment == 1)
	//*   6   12:aload_2         
	//*   7   13:getfield        #120 <Field int ConstraintTableLayout$VerticalSlice.alignment>
	//*   8   16:iconst_1        
	//*   9   17:icmpne          23
			return "L";
	//   10   20:ldc1            #240 <String "L">
	//   11   22:areturn         
		if(verticalslice.alignment == 0)
	//*  12   23:aload_2         
	//*  13   24:getfield        #120 <Field int ConstraintTableLayout$VerticalSlice.alignment>
	//*  14   27:ifne            33
			return "C";
	//   15   30:ldc1            #242 <String "C">
	//   16   32:areturn         
		if(verticalslice.alignment == 3)
	//*  17   33:aload_2         
	//*  18   34:getfield        #120 <Field int ConstraintTableLayout$VerticalSlice.alignment>
	//*  19   37:iconst_3        
	//*  20   38:icmpne          44
			return "F";
	//   21   41:ldc1            #244 <String "F">
	//   22   43:areturn         
		if(verticalslice.alignment == 2)
	//*  23   44:aload_2         
	//*  24   45:getfield        #120 <Field int ConstraintTableLayout$VerticalSlice.alignment>
	//*  25   48:iconst_2        
	//*  26   49:icmpne          55
			return "R";
	//   27   52:ldc1            #246 <String "R">
	//   28   54:areturn         
		else
			return "!";
	//   29   55:ldc1            #248 <String "!">
	//   30   57:areturn         
	}

	public String getColumnsAlignmentRepresentation()
	{
		int j = mVerticalSlices.size();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ArrayList mVerticalSlices>
	//    2    4:invokevirtual   #74  <Method int ArrayList.size()>
	//    3    7:istore_2        
		Object obj1 = "";
	//    4    8:ldc1            #251 <String "">
	//    5   10:astore          4
		for(int i = 0; i < j;)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:icmpge          197
		{
			VerticalSlice verticalslice = (VerticalSlice)mVerticalSlices.get(i);
	//   11   19:aload_0         
	//   12   20:getfield        #51  <Field ArrayList mVerticalSlices>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #9   <Class ConstraintTableLayout$VerticalSlice>
	//   16   30:astore          5
			Object obj;
			if(verticalslice.alignment == 1)
	//*  17   32:aload           5
	//*  18   34:getfield        #120 <Field int ConstraintTableLayout$VerticalSlice.alignment>
	//*  19   37:iconst_1        
	//*  20   38:icmpne          71
			{
				obj = ((Object) (new StringBuilder()));
	//   21   41:new             #180 <Class StringBuilder>
	//   22   44:dup             
	//   23   45:invokespecial   #181 <Method void StringBuilder()>
	//   24   48:astore_3        
				((StringBuilder) (obj)).append(((String) (obj1)));
	//   25   49:aload_3         
	//   26   50:aload           4
	//   27   52:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   28   55:pop             
				((StringBuilder) (obj)).append("L");
	//   29   56:aload_3         
	//   30   57:ldc1            #240 <String "L">
	//   31   59:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   33   63:aload_3         
	//   34   64:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   35   67:astore_3        
			} else
	//*  36   68:goto            187
			if(verticalslice.alignment == 0)
	//*  37   71:aload           5
	//*  38   73:getfield        #120 <Field int ConstraintTableLayout$VerticalSlice.alignment>
	//*  39   76:ifne            109
			{
				obj = ((Object) (new StringBuilder()));
	//   40   79:new             #180 <Class StringBuilder>
	//   41   82:dup             
	//   42   83:invokespecial   #181 <Method void StringBuilder()>
	//   43   86:astore_3        
				((StringBuilder) (obj)).append(((String) (obj1)));
	//   44   87:aload_3         
	//   45   88:aload           4
	//   46   90:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   47   93:pop             
				((StringBuilder) (obj)).append("C");
	//   48   94:aload_3         
	//   49   95:ldc1            #242 <String "C">
	//   50   97:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   51  100:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   52  101:aload_3         
	//   53  102:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   54  105:astore_3        
			} else
	//*  55  106:goto            187
			if(verticalslice.alignment == 3)
	//*  56  109:aload           5
	//*  57  111:getfield        #120 <Field int ConstraintTableLayout$VerticalSlice.alignment>
	//*  58  114:iconst_3        
	//*  59  115:icmpne          148
			{
				obj = ((Object) (new StringBuilder()));
	//   60  118:new             #180 <Class StringBuilder>
	//   61  121:dup             
	//   62  122:invokespecial   #181 <Method void StringBuilder()>
	//   63  125:astore_3        
				((StringBuilder) (obj)).append(((String) (obj1)));
	//   64  126:aload_3         
	//   65  127:aload           4
	//   66  129:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   67  132:pop             
				((StringBuilder) (obj)).append("F");
	//   68  133:aload_3         
	//   69  134:ldc1            #244 <String "F">
	//   70  136:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   71  139:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   72  140:aload_3         
	//   73  141:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   74  144:astore_3        
			} else
	//*  75  145:goto            187
			{
				obj = obj1;
	//   76  148:aload           4
	//   77  150:astore_3        
				if(verticalslice.alignment == 2)
	//*  78  151:aload           5
	//*  79  153:getfield        #120 <Field int ConstraintTableLayout$VerticalSlice.alignment>
	//*  80  156:iconst_2        
	//*  81  157:icmpne          187
				{
					obj = ((Object) (new StringBuilder()));
	//   82  160:new             #180 <Class StringBuilder>
	//   83  163:dup             
	//   84  164:invokespecial   #181 <Method void StringBuilder()>
	//   85  167:astore_3        
					((StringBuilder) (obj)).append(((String) (obj1)));
	//   86  168:aload_3         
	//   87  169:aload           4
	//   88  171:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   89  174:pop             
					((StringBuilder) (obj)).append("R");
	//   90  175:aload_3         
	//   91  176:ldc1            #246 <String "R">
	//   92  178:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   93  181:pop             
					obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   94  182:aload_3         
	//   95  183:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   96  186:astore_3        
				}
			}
			i++;
	//   97  187:iload_1         
	//   98  188:iconst_1        
	//   99  189:iadd            
	//  100  190:istore_1        
			obj1 = obj;
	//  101  191:aload_3         
	//  102  192:astore          4
		}

	//* 103  194:goto            14
		return ((String) (obj1));
	//  104  197:aload           4
	//  105  199:areturn         
	}

	public ArrayList getHorizontalGuidelines()
	{
		return mHorizontalGuidelines;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field ArrayList mHorizontalGuidelines>
	//    2    4:areturn         
	}

	public int getNumCols()
	{
		return mNumCols;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mNumCols>
	//    2    4:ireturn         
	}

	public int getNumRows()
	{
		return mNumRows;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mNumRows>
	//    2    4:ireturn         
	}

	public int getPadding()
	{
		return mPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mPadding>
	//    2    4:ireturn         
	}

	public String getType()
	{
		return "ConstraintTableLayout";
	//    0    0:ldc2            #261 <String "ConstraintTableLayout">
	//    1    3:areturn         
	}

	public ArrayList getVerticalGuidelines()
	{
		return mVerticalGuidelines;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field ArrayList mVerticalGuidelines>
	//    2    4:areturn         
	}

	public boolean handlesInternalConstraints()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isVerticalGrowth()
	{
		return mVerticalGrowth;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean mVerticalGrowth>
	//    2    4:ireturn         
	}

	public void setColumnAlignment(int i, int j)
	{
		if(i < mVerticalSlices.size())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #51  <Field ArrayList mVerticalSlices>
	//*   3    5:invokevirtual   #74  <Method int ArrayList.size()>
	//*   4    8:icmpge          30
		{
			((VerticalSlice)mVerticalSlices.get(i)).alignment = j;
	//    5   11:aload_0         
	//    6   12:getfield        #51  <Field ArrayList mVerticalSlices>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//    9   19:checkcast       #9   <Class ConstraintTableLayout$VerticalSlice>
	//   10   22:iload_2         
	//   11   23:putfield        #120 <Field int ConstraintTableLayout$VerticalSlice.alignment>
			setChildrenConnections();
	//   12   26:aload_0         
	//   13   27:invokespecial   #236 <Method void setChildrenConnections()>
		}
	//   14   30:return          
	}

	public void setColumnAlignment(String s)
	{
		int j = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #272 <Method int String.length()>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          96
		{
			char c = s.charAt(i);
	//    8   12:aload_1         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #276 <Method char String.charAt(int)>
	//   11   17:istore          4
			if(c == 'L')
	//*  12   19:iload           4
	//*  13   21:bipush          76
	//*  14   23:icmpne          35
			{
				setColumnAlignment(i, 1);
	//   15   26:aload_0         
	//   16   27:iload_2         
	//   17   28:iconst_1        
	//   18   29:invokevirtual   #278 <Method void setColumnAlignment(int, int)>
				continue;
	//   19   32:goto            89
			}
			if(c == 'C')
	//*  20   35:iload           4
	//*  21   37:bipush          67
	//*  22   39:icmpne          51
			{
				setColumnAlignment(i, 0);
	//   23   42:aload_0         
	//   24   43:iload_2         
	//   25   44:iconst_0        
	//   26   45:invokevirtual   #278 <Method void setColumnAlignment(int, int)>
				continue;
	//   27   48:goto            89
			}
			if(c == 'F')
	//*  28   51:iload           4
	//*  29   53:bipush          70
	//*  30   55:icmpne          67
			{
				setColumnAlignment(i, 3);
	//   31   58:aload_0         
	//   32   59:iload_2         
	//   33   60:iconst_3        
	//   34   61:invokevirtual   #278 <Method void setColumnAlignment(int, int)>
				continue;
	//   35   64:goto            89
			}
			if(c == 'R')
	//*  36   67:iload           4
	//*  37   69:bipush          82
	//*  38   71:icmpne          83
				setColumnAlignment(i, 2);
	//   39   74:aload_0         
	//   40   75:iload_2         
	//   41   76:iconst_2        
	//   42   77:invokevirtual   #278 <Method void setColumnAlignment(int, int)>
			else
	//*  43   80:goto            89
				setColumnAlignment(i, 0);
	//   44   83:aload_0         
	//   45   84:iload_2         
	//   46   85:iconst_0        
	//   47   86:invokevirtual   #278 <Method void setColumnAlignment(int, int)>
		}

	//   48   89:iload_2         
	//   49   90:iconst_1        
	//   50   91:iadd            
	//   51   92:istore_2        
	//*  52   93:goto            7
	//   53   96:return          
	}

	public void setDebugSolverName(LinearSystem linearsystem, String s)
	{
		system = linearsystem;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field LinearSystem system>
		super.setDebugSolverName(linearsystem, s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #279 <Method void ConstraintWidgetContainer.setDebugSolverName(LinearSystem, String)>
		updateDebugSolverNames();
	//    7   11:aload_0         
	//    8   12:invokespecial   #176 <Method void updateDebugSolverNames()>
	//    9   15:return          
	}

	public void setNumCols(int i)
	{
		if(mVerticalGrowth && mNumCols != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field boolean mVerticalGrowth>
	//*   2    4:ifeq            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #42  <Field int mNumCols>
	//*   5   11:iload_1         
	//*   6   12:icmpeq          28
		{
			mNumCols = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #42  <Field int mNumCols>
			setVerticalSlices();
	//   10   20:aload_0         
	//   11   21:invokespecial   #282 <Method void setVerticalSlices()>
			setTableDimensions();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #210 <Method void setTableDimensions()>
		}
	//   14   28:return          
	}

	public void setNumRows(int i)
	{
		if(!mVerticalGrowth && mNumCols != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field boolean mVerticalGrowth>
	//*   2    4:ifne            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #42  <Field int mNumCols>
	//*   5   11:iload_1         
	//*   6   12:icmpeq          28
		{
			mNumRows = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #44  <Field int mNumRows>
			setHorizontalSlices();
	//   10   20:aload_0         
	//   11   21:invokespecial   #285 <Method void setHorizontalSlices()>
			setTableDimensions();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #210 <Method void setTableDimensions()>
		}
	//   14   28:return          
	}

	public void setPadding(int i)
	{
		if(i > 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmple          10
			mPadding = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #46  <Field int mPadding>
	//    6   10:return          
	}

	public void setTableDimensions()
	{
		int k1 = mChildren.size();
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field ArrayList mChildren>
	//    2    4:invokevirtual   #74  <Method int ArrayList.size()>
	//    3    7:istore_3        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		int l = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		for(; i < k1; i++)
	//*   8   12:iload_1         
	//*   9   13:iload_3         
	//*  10   14:icmpge          41
			l += ((ConstraintWidget)mChildren.get(i)).getContainerItemSkip();
	//   11   17:iload_2         
	//   12   18:aload_0         
	//   13   19:getfield        #70  <Field ArrayList mChildren>
	//   14   22:iload_1         
	//   15   23:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   16   26:checkcast       #80  <Class ConstraintWidget>
	//   17   29:invokevirtual   #83  <Method int ConstraintWidget.getContainerItemSkip()>
	//   18   32:iadd            
	//   19   33:istore_2        

	//   20   34:iload_1         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_1        
	//*  24   38:goto            12
		k1 += l;
	//   25   41:iload_3         
	//   26   42:iload_2         
	//   27   43:iadd            
	//   28   44:istore_3        
		if(mVerticalGrowth)
	//*  29   45:aload_0         
	//*  30   46:getfield        #40  <Field boolean mVerticalGrowth>
	//*  31   49:ifeq            126
		{
			if(mNumCols == 0)
	//*  32   52:aload_0         
	//*  33   53:getfield        #42  <Field int mNumCols>
	//*  34   56:ifne            64
				setNumCols(1);
	//   35   59:aload_0         
	//   36   60:iconst_1        
	//   37   61:invokevirtual   #288 <Method void setNumCols(int)>
			int l1 = mNumCols;
	//   38   64:aload_0         
	//   39   65:getfield        #42  <Field int mNumCols>
	//   40   68:istore          4
			int i1 = k1 / l1;
	//   41   70:iload_3         
	//   42   71:iload           4
	//   43   73:idiv            
	//   44   74:istore_2        
			int j = i1;
	//   45   75:iload_2         
	//   46   76:istore_1        
			if(l1 * i1 < k1)
	//*  47   77:iload           4
	//*  48   79:iload_2         
	//*  49   80:imul            
	//*  50   81:iload_3         
	//*  51   82:icmpge          89
				j = i1 + 1;
	//   52   85:iload_2         
	//   53   86:iconst_1        
	//   54   87:iadd            
	//   55   88:istore_1        
			if(mNumRows == j && mVerticalGuidelines.size() == mNumCols - 1)
	//*  56   89:aload_0         
	//*  57   90:getfield        #44  <Field int mNumRows>
	//*  58   93:iload_1         
	//*  59   94:icmpne          114
	//*  60   97:aload_0         
	//*  61   98:getfield        #55  <Field ArrayList mVerticalGuidelines>
	//*  62  101:invokevirtual   #74  <Method int ArrayList.size()>
	//*  63  104:aload_0         
	//*  64  105:getfield        #42  <Field int mNumCols>
	//*  65  108:iconst_1        
	//*  66  109:isub            
	//*  67  110:icmpne          114
				return;
	//   68  113:return          
			mNumRows = j;
	//   69  114:aload_0         
	//   70  115:iload_1         
	//   71  116:putfield        #44  <Field int mNumRows>
			setHorizontalSlices();
	//   72  119:aload_0         
	//   73  120:invokespecial   #285 <Method void setHorizontalSlices()>
		} else
	//*  74  123:goto            197
		{
			if(mNumRows == 0)
	//*  75  126:aload_0         
	//*  76  127:getfield        #44  <Field int mNumRows>
	//*  77  130:ifne            138
				setNumRows(1);
	//   78  133:aload_0         
	//   79  134:iconst_1        
	//   80  135:invokevirtual   #290 <Method void setNumRows(int)>
			int i2 = mNumRows;
	//   81  138:aload_0         
	//   82  139:getfield        #44  <Field int mNumRows>
	//   83  142:istore          4
			int j1 = k1 / i2;
	//   84  144:iload_3         
	//   85  145:iload           4
	//   86  147:idiv            
	//   87  148:istore_2        
			int k = j1;
	//   88  149:iload_2         
	//   89  150:istore_1        
			if(i2 * j1 < k1)
	//*  90  151:iload           4
	//*  91  153:iload_2         
	//*  92  154:imul            
	//*  93  155:iload_3         
	//*  94  156:icmpge          163
				k = j1 + 1;
	//   95  159:iload_2         
	//   96  160:iconst_1        
	//   97  161:iadd            
	//   98  162:istore_1        
			if(mNumCols == k && mHorizontalGuidelines.size() == mNumRows - 1)
	//*  99  163:aload_0         
	//* 100  164:getfield        #42  <Field int mNumCols>
	//* 101  167:iload_1         
	//* 102  168:icmpne          188
	//* 103  171:aload_0         
	//* 104  172:getfield        #57  <Field ArrayList mHorizontalGuidelines>
	//* 105  175:invokevirtual   #74  <Method int ArrayList.size()>
	//* 106  178:aload_0         
	//* 107  179:getfield        #44  <Field int mNumRows>
	//* 108  182:iconst_1        
	//* 109  183:isub            
	//* 110  184:icmpne          188
				return;
	//  111  187:return          
			mNumCols = k;
	//  112  188:aload_0         
	//  113  189:iload_1         
	//  114  190:putfield        #42  <Field int mNumCols>
			setVerticalSlices();
	//  115  193:aload_0         
	//  116  194:invokespecial   #282 <Method void setVerticalSlices()>
		}
		setChildrenConnections();
	//  117  197:aload_0         
	//  118  198:invokespecial   #236 <Method void setChildrenConnections()>
	//  119  201:return          
	}

	public void setVerticalGrowth(boolean flag)
	{
		mVerticalGrowth = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field boolean mVerticalGrowth>
	//    3    5:return          
	}

	public void updateFromSolver(LinearSystem linearsystem)
	{
		super.updateFromSolver(linearsystem);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #294 <Method void ConstraintWidgetContainer.updateFromSolver(LinearSystem)>
		if(linearsystem == mSystem)
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #213 <Field LinearSystem mSystem>
	//*   6   10:if_acmpne       93
		{
			int k = mVerticalGuidelines.size();
	//    7   13:aload_0         
	//    8   14:getfield        #55  <Field ArrayList mVerticalGuidelines>
	//    9   17:invokevirtual   #74  <Method int ArrayList.size()>
	//   10   20:istore          4
			boolean flag = false;
	//   11   22:iconst_0        
	//   12   23:istore_3        
			for(int i = 0; i < k; i++)
	//*  13   24:iconst_0        
	//*  14   25:istore_2        
	//*  15   26:iload_2         
	//*  16   27:iload           4
	//*  17   29:icmpge          54
				((Guideline)mVerticalGuidelines.get(i)).updateFromSolver(linearsystem);
	//   18   32:aload_0         
	//   19   33:getfield        #55  <Field ArrayList mVerticalGuidelines>
	//   20   36:iload_2         
	//   21   37:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   22   40:checkcast       #114 <Class Guideline>
	//   23   43:aload_1         
	//   24   44:invokevirtual   #295 <Method void Guideline.updateFromSolver(LinearSystem)>

	//   25   47:iload_2         
	//   26   48:iconst_1        
	//   27   49:iadd            
	//   28   50:istore_2        
	//*  29   51:goto            26
			k = mHorizontalGuidelines.size();
	//   30   54:aload_0         
	//   31   55:getfield        #57  <Field ArrayList mHorizontalGuidelines>
	//   32   58:invokevirtual   #74  <Method int ArrayList.size()>
	//   33   61:istore          4
			for(int j = ((int) (flag)); j < k; j++)
	//*  34   63:iload_3         
	//*  35   64:istore_2        
	//*  36   65:iload_2         
	//*  37   66:iload           4
	//*  38   68:icmpge          93
				((Guideline)mHorizontalGuidelines.get(j)).updateFromSolver(linearsystem);
	//   39   71:aload_0         
	//   40   72:getfield        #57  <Field ArrayList mHorizontalGuidelines>
	//   41   75:iload_2         
	//   42   76:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   43   79:checkcast       #114 <Class Guideline>
	//   44   82:aload_1         
	//   45   83:invokevirtual   #295 <Method void Guideline.updateFromSolver(LinearSystem)>

	//   46   86:iload_2         
	//   47   87:iconst_1        
	//   48   88:iadd            
	//   49   89:istore_2        
		}
	//*  50   90:goto            65
	//   51   93:return          
	}

	public static final int ALIGN_CENTER = 0;
	private static final int ALIGN_FULL = 3;
	public static final int ALIGN_LEFT = 1;
	public static final int ALIGN_RIGHT = 2;
	private ArrayList mHorizontalGuidelines;
	private ArrayList mHorizontalSlices;
	private int mNumCols;
	private int mNumRows;
	private int mPadding;
	private boolean mVerticalGrowth;
	private ArrayList mVerticalGuidelines;
	private ArrayList mVerticalSlices;
	private LinearSystem system;
}
