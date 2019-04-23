// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;
import android.support.constraint.solver.Metrics;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ResolutionNode, ConstraintAnchor, ResolutionDimension, ConstraintWidget

public class ResolutionAnchor extends ResolutionNode
{

	public ResolutionAnchor(ConstraintAnchor constraintanchor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void ResolutionNode()>
		type = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #41  <Field int type>
		dimension = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #43  <Field ResolutionDimension dimension>
		dimensionMultiplier = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #45  <Field int dimensionMultiplier>
		oppositeDimension = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #47  <Field ResolutionDimension oppositeDimension>
		oppositeDimensionMultiplier = 1;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #49  <Field int oppositeDimensionMultiplier>
		myAnchor = constraintanchor;
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #51  <Field ConstraintAnchor myAnchor>
	//   20   34:return          
	}

	void addResolvedValue(LinearSystem linearsystem)
	{
		android.support.constraint.solver.SolverVariable solvervariable = myAnchor.getSolverVariable();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ConstraintAnchor myAnchor>
	//    2    4:invokevirtual   #60  <Method android.support.constraint.solver.SolverVariable ConstraintAnchor.getSolverVariable()>
	//    3    7:astore_2        
		ResolutionAnchor resolutionanchor = resolvedTarget;
	//    4    8:aload_0         
	//    5    9:getfield        #62  <Field ResolutionAnchor resolvedTarget>
	//    6   12:astore_3        
		if(resolutionanchor == null)
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       28
		{
			linearsystem.addEquality(solvervariable, (int)resolvedOffset);
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:getfield        #64  <Field float resolvedOffset>
	//   13   23:f2i             
	//   14   24:invokevirtual   #70  <Method void LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, int)>
			return;
	//   15   27:return          
		} else
		{
			linearsystem.addEquality(solvervariable, linearsystem.createObjectVariable(((Object) (resolutionanchor.myAnchor))), (int)resolvedOffset, 6);
	//   16   28:aload_1         
	//   17   29:aload_2         
	//   18   30:aload_1         
	//   19   31:aload_3         
	//   20   32:getfield        #51  <Field ConstraintAnchor myAnchor>
	//   21   35:invokevirtual   #74  <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   22   38:aload_0         
	//   23   39:getfield        #64  <Field float resolvedOffset>
	//   24   42:f2i             
	//   25   43:bipush          6
	//   26   45:invokevirtual   #77  <Method android.support.constraint.solver.ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//   27   48:pop             
			return;
	//   28   49:return          
		}
	}

	public void dependsOn(int i, ResolutionAnchor resolutionanchor, int j)
	{
		type = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int type>
		target = resolutionanchor;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #81  <Field ResolutionAnchor target>
		offset = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:i2f             
	//    9   13:putfield        #83  <Field float offset>
		target.addDependent(((ResolutionNode) (this)));
	//   10   16:aload_0         
	//   11   17:getfield        #81  <Field ResolutionAnchor target>
	//   12   20:aload_0         
	//   13   21:invokevirtual   #87  <Method void addDependent(ResolutionNode)>
	//   14   24:return          
	}

	public void dependsOn(ResolutionAnchor resolutionanchor, int i)
	{
		target = resolutionanchor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field ResolutionAnchor target>
		offset = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:i2f             
	//    6    8:putfield        #83  <Field float offset>
		target.addDependent(((ResolutionNode) (this)));
	//    7   11:aload_0         
	//    8   12:getfield        #81  <Field ResolutionAnchor target>
	//    9   15:aload_0         
	//   10   16:invokevirtual   #87  <Method void addDependent(ResolutionNode)>
	//   11   19:return          
	}

	public void dependsOn(ResolutionAnchor resolutionanchor, int i, ResolutionDimension resolutiondimension)
	{
		target = resolutionanchor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field ResolutionAnchor target>
		target.addDependent(((ResolutionNode) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #81  <Field ResolutionAnchor target>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #87  <Method void addDependent(ResolutionNode)>
		dimension = resolutiondimension;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #43  <Field ResolutionDimension dimension>
		dimensionMultiplier = i;
	//   10   18:aload_0         
	//   11   19:iload_2         
	//   12   20:putfield        #45  <Field int dimensionMultiplier>
		dimension.addDependent(((ResolutionNode) (this)));
	//   13   23:aload_0         
	//   14   24:getfield        #43  <Field ResolutionDimension dimension>
	//   15   27:aload_0         
	//   16   28:invokevirtual   #92  <Method void ResolutionDimension.addDependent(ResolutionNode)>
	//   17   31:return          
	}

	public float getResolvedValue()
	{
		return resolvedOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field float resolvedOffset>
	//    2    4:freturn         
	}

	public void remove(ResolutionDimension resolutiondimension)
	{
		ResolutionDimension resolutiondimension1 = dimension;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ResolutionDimension dimension>
	//    2    4:astore_2        
		if(resolutiondimension1 == resolutiondimension)
	//*   3    5:aload_2         
	//*   4    6:aload_1         
	//*   5    7:if_acmpne       27
		{
			dimension = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #43  <Field ResolutionDimension dimension>
			offset = dimensionMultiplier;
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #45  <Field int dimensionMultiplier>
	//   12   20:i2f             
	//   13   21:putfield        #83  <Field float offset>
		} else
	//*  14   24:goto            49
		if(resolutiondimension1 == oppositeDimension)
	//*  15   27:aload_2         
	//*  16   28:aload_0         
	//*  17   29:getfield        #47  <Field ResolutionDimension oppositeDimension>
	//*  18   32:if_acmpne       49
		{
			oppositeDimension = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #47  <Field ResolutionDimension oppositeDimension>
			oppositeOffset = oppositeDimensionMultiplier;
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #49  <Field int oppositeDimensionMultiplier>
	//   25   45:i2f             
	//   26   46:putfield        #98  <Field float oppositeOffset>
		}
		resolve();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #101 <Method void resolve()>
	//   29   53:return          
	}

	public void reset()
	{
		super.reset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #104 <Method void ResolutionNode.reset()>
		target = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #81  <Field ResolutionAnchor target>
		offset = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #83  <Field float offset>
		dimension = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #43  <Field ResolutionDimension dimension>
		dimensionMultiplier = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #45  <Field int dimensionMultiplier>
		oppositeDimension = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #47  <Field ResolutionDimension oppositeDimension>
		oppositeDimensionMultiplier = 1;
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:putfield        #49  <Field int oppositeDimensionMultiplier>
		resolvedTarget = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #62  <Field ResolutionAnchor resolvedTarget>
		resolvedOffset = 0.0F;
	//   23   39:aload_0         
	//   24   40:fconst_0        
	//   25   41:putfield        #64  <Field float resolvedOffset>
		computedValue = 0.0F;
	//   26   44:aload_0         
	//   27   45:fconst_0        
	//   28   46:putfield        #106 <Field float computedValue>
		opposite = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #108 <Field ResolutionAnchor opposite>
		oppositeOffset = 0.0F;
	//   32   54:aload_0         
	//   33   55:fconst_0        
	//   34   56:putfield        #98  <Field float oppositeOffset>
		type = 0;
	//   35   59:aload_0         
	//   36   60:iconst_0        
	//   37   61:putfield        #41  <Field int type>
	//   38   64:return          
	}

	public void resolve()
	{
		int i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field int state>
	//    2    4:istore          5
		int k = 1;
	//    3    6:iconst_1        
	//    4    7:istore          7
		if(i == 1)
	//*   5    9:iload           5
	//*   6   11:iconst_1        
	//*   7   12:icmpne          16
			return;
	//    8   15:return          
		if(type == 4)
	//*   9   16:aload_0         
	//*  10   17:getfield        #41  <Field int type>
	//*  11   20:iconst_4        
	//*  12   21:icmpne          25
			return;
	//   13   24:return          
		ResolutionDimension resolutiondimension = dimension;
	//   14   25:aload_0         
	//   15   26:getfield        #43  <Field ResolutionDimension dimension>
	//   16   29:astore          9
		if(resolutiondimension != null)
	//*  17   31:aload           9
	//*  18   33:ifnull          63
		{
			if(resolutiondimension.state != 1)
	//*  19   36:aload           9
	//*  20   38:getfield        #112 <Field int ResolutionDimension.state>
	//*  21   41:iconst_1        
	//*  22   42:icmpeq          46
				return;
	//   23   45:return          
			offset = (float)dimensionMultiplier * dimension.value;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #45  <Field int dimensionMultiplier>
	//   27   51:i2f             
	//   28   52:aload_0         
	//   29   53:getfield        #43  <Field ResolutionDimension dimension>
	//   30   56:getfield        #115 <Field float ResolutionDimension.value>
	//   31   59:fmul            
	//   32   60:putfield        #83  <Field float offset>
		}
		resolutiondimension = oppositeDimension;
	//   33   63:aload_0         
	//   34   64:getfield        #47  <Field ResolutionDimension oppositeDimension>
	//   35   67:astore          9
		if(resolutiondimension != null)
	//*  36   69:aload           9
	//*  37   71:ifnull          101
		{
			if(resolutiondimension.state != 1)
	//*  38   74:aload           9
	//*  39   76:getfield        #112 <Field int ResolutionDimension.state>
	//*  40   79:iconst_1        
	//*  41   80:icmpeq          84
				return;
	//   42   83:return          
			oppositeOffset = (float)oppositeDimensionMultiplier * oppositeDimension.value;
	//   43   84:aload_0         
	//   44   85:aload_0         
	//   45   86:getfield        #49  <Field int oppositeDimensionMultiplier>
	//   46   89:i2f             
	//   47   90:aload_0         
	//   48   91:getfield        #47  <Field ResolutionDimension oppositeDimension>
	//   49   94:getfield        #115 <Field float ResolutionDimension.value>
	//   50   97:fmul            
	//   51   98:putfield        #98  <Field float oppositeOffset>
		}
		if(type == 1)
	//*  52  101:aload_0         
	//*  53  102:getfield        #41  <Field int type>
	//*  54  105:iconst_1        
	//*  55  106:icmpne          184
		{
			ResolutionAnchor resolutionanchor = target;
	//   56  109:aload_0         
	//   57  110:getfield        #81  <Field ResolutionAnchor target>
	//   58  113:astore          9
			if(resolutionanchor == null || resolutionanchor.state == 1)
	//*  59  115:aload           9
	//*  60  117:ifnull          129
	//*  61  120:aload           9
	//*  62  122:getfield        #111 <Field int state>
	//*  63  125:iconst_1        
	//*  64  126:icmpne          184
			{
				ResolutionAnchor resolutionanchor1 = target;
	//   65  129:aload_0         
	//   66  130:getfield        #81  <Field ResolutionAnchor target>
	//   67  133:astore          9
				if(resolutionanchor1 == null)
	//*  68  135:aload           9
	//*  69  137:ifnonnull       156
				{
					resolvedTarget = this;
	//   70  140:aload_0         
	//   71  141:aload_0         
	//   72  142:putfield        #62  <Field ResolutionAnchor resolvedTarget>
					resolvedOffset = offset;
	//   73  145:aload_0         
	//   74  146:aload_0         
	//   75  147:getfield        #83  <Field float offset>
	//   76  150:putfield        #64  <Field float resolvedOffset>
				} else
	//*  77  153:goto            179
				{
					resolvedTarget = resolutionanchor1.resolvedTarget;
	//   78  156:aload_0         
	//   79  157:aload           9
	//   80  159:getfield        #62  <Field ResolutionAnchor resolvedTarget>
	//   81  162:putfield        #62  <Field ResolutionAnchor resolvedTarget>
					resolvedOffset = resolutionanchor1.resolvedOffset + offset;
	//   82  165:aload_0         
	//   83  166:aload           9
	//   84  168:getfield        #64  <Field float resolvedOffset>
	//   85  171:aload_0         
	//   86  172:getfield        #83  <Field float offset>
	//   87  175:fadd            
	//   88  176:putfield        #64  <Field float resolvedOffset>
				}
				didResolve();
	//   89  179:aload_0         
	//   90  180:invokevirtual   #118 <Method void didResolve()>
				return;
	//   91  183:return          
			}
		}
		if(type == 2)
	//*  92  184:aload_0         
	//*  93  185:getfield        #41  <Field int type>
	//*  94  188:iconst_2        
	//*  95  189:icmpne          656
		{
			ResolutionAnchor resolutionanchor2 = target;
	//   96  192:aload_0         
	//   97  193:getfield        #81  <Field ResolutionAnchor target>
	//   98  196:astore          9
			if(resolutionanchor2 != null && resolutionanchor2.state == 1)
	//*  99  198:aload           9
	//* 100  200:ifnull          656
	//* 101  203:aload           9
	//* 102  205:getfield        #111 <Field int state>
	//* 103  208:iconst_1        
	//* 104  209:icmpne          656
			{
				ResolutionAnchor resolutionanchor3 = opposite;
	//  105  212:aload_0         
	//  106  213:getfield        #108 <Field ResolutionAnchor opposite>
	//  107  216:astore          9
				if(resolutionanchor3 != null)
	//* 108  218:aload           9
	//* 109  220:ifnull          656
				{
					resolutionanchor3 = resolutionanchor3.target;
	//  110  223:aload           9
	//  111  225:getfield        #81  <Field ResolutionAnchor target>
	//  112  228:astore          9
					if(resolutionanchor3 != null && resolutionanchor3.state == 1)
	//* 113  230:aload           9
	//* 114  232:ifnull          656
	//* 115  235:aload           9
	//* 116  237:getfield        #111 <Field int state>
	//* 117  240:iconst_1        
	//* 118  241:icmpne          656
					{
						if(LinearSystem.getMetrics() != null)
	//* 119  244:invokestatic    #122 <Method Metrics LinearSystem.getMetrics()>
	//* 120  247:ifnull          267
						{
							Metrics metrics = LinearSystem.getMetrics();
	//  121  250:invokestatic    #122 <Method Metrics LinearSystem.getMetrics()>
	//  122  253:astore          9
							metrics.centerConnectionResolved = metrics.centerConnectionResolved + 1L;
	//  123  255:aload           9
	//  124  257:aload           9
	//  125  259:getfield        #128 <Field long Metrics.centerConnectionResolved>
	//  126  262:lconst_1        
	//  127  263:ladd            
	//  128  264:putfield        #128 <Field long Metrics.centerConnectionResolved>
						}
						resolvedTarget = target.resolvedTarget;
	//  129  267:aload_0         
	//  130  268:aload_0         
	//  131  269:getfield        #81  <Field ResolutionAnchor target>
	//  132  272:getfield        #62  <Field ResolutionAnchor resolvedTarget>
	//  133  275:putfield        #62  <Field ResolutionAnchor resolvedTarget>
						Object obj = ((Object) (opposite));
	//  134  278:aload_0         
	//  135  279:getfield        #108 <Field ResolutionAnchor opposite>
	//  136  282:astore          9
						obj.resolvedTarget = ((ResolutionAnchor) (obj)).target.resolvedTarget;
	//  137  284:aload           9
	//  138  286:aload           9
	//  139  288:getfield        #81  <Field ResolutionAnchor target>
	//  140  291:getfield        #62  <Field ResolutionAnchor resolvedTarget>
	//  141  294:putfield        #62  <Field ResolutionAnchor resolvedTarget>
						obj = ((Object) (myAnchor.mType));
	//  142  297:aload_0         
	//  143  298:getfield        #51  <Field ConstraintAnchor myAnchor>
	//  144  301:getfield        #132 <Field ConstraintAnchor$Type ConstraintAnchor.mType>
	//  145  304:astore          9
						ConstraintAnchor.Type type1 = ConstraintAnchor.Type.RIGHT;
	//  146  306:getstatic       #137 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//  147  309:astore          10
						int j = 0;
	//  148  311:iconst_0        
	//  149  312:istore          6
						boolean flag = ((boolean) (k));
	//  150  314:iload           7
	//  151  316:istore          5
						if(obj != type1)
	//* 152  318:aload           9
	//* 153  320:aload           10
	//* 154  322:if_acmpeq       348
							if(myAnchor.mType == ConstraintAnchor.Type.BOTTOM)
	//* 155  325:aload_0         
	//* 156  326:getfield        #51  <Field ConstraintAnchor myAnchor>
	//* 157  329:getfield        #132 <Field ConstraintAnchor$Type ConstraintAnchor.mType>
	//* 158  332:getstatic       #140 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//* 159  335:if_acmpne       345
								flag = ((boolean) (k));
	//  160  338:iload           7
	//  161  340:istore          5
							else
	//* 162  342:goto            348
								flag = false;
	//  163  345:iconst_0        
	//  164  346:istore          5
						float f;
						if(flag)
	//* 165  348:iload           5
	//* 166  350:ifeq            375
							f = target.resolvedOffset - opposite.target.resolvedOffset;
	//  167  353:aload_0         
	//  168  354:getfield        #81  <Field ResolutionAnchor target>
	//  169  357:getfield        #64  <Field float resolvedOffset>
	//  170  360:aload_0         
	//  171  361:getfield        #108 <Field ResolutionAnchor opposite>
	//  172  364:getfield        #81  <Field ResolutionAnchor target>
	//  173  367:getfield        #64  <Field float resolvedOffset>
	//  174  370:fsub            
	//  175  371:fstore_1        
						else
	//* 176  372:goto            394
							f = opposite.target.resolvedOffset - target.resolvedOffset;
	//  177  375:aload_0         
	//  178  376:getfield        #108 <Field ResolutionAnchor opposite>
	//  179  379:getfield        #81  <Field ResolutionAnchor target>
	//  180  382:getfield        #64  <Field float resolvedOffset>
	//  181  385:aload_0         
	//  182  386:getfield        #81  <Field ResolutionAnchor target>
	//  183  389:getfield        #64  <Field float resolvedOffset>
	//  184  392:fsub            
	//  185  393:fstore_1        
						float f1;
						if(myAnchor.mType != ConstraintAnchor.Type.LEFT && myAnchor.mType != ConstraintAnchor.Type.RIGHT)
	//* 186  394:aload_0         
	//* 187  395:getfield        #51  <Field ConstraintAnchor myAnchor>
	//* 188  398:getfield        #132 <Field ConstraintAnchor$Type ConstraintAnchor.mType>
	//* 189  401:getstatic       #143 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//* 190  404:if_acmpeq       451
	//* 191  407:aload_0         
	//* 192  408:getfield        #51  <Field ConstraintAnchor myAnchor>
	//* 193  411:getfield        #132 <Field ConstraintAnchor$Type ConstraintAnchor.mType>
	//* 194  414:getstatic       #137 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//* 195  417:if_acmpne       423
	//* 196  420:goto            451
						{
							f1 = f - (float)myAnchor.mOwner.getHeight();
	//  197  423:fload_1         
	//  198  424:aload_0         
	//  199  425:getfield        #51  <Field ConstraintAnchor myAnchor>
	//  200  428:getfield        #147 <Field ConstraintWidget ConstraintAnchor.mOwner>
	//  201  431:invokevirtual   #153 <Method int ConstraintWidget.getHeight()>
	//  202  434:i2f             
	//  203  435:fsub            
	//  204  436:fstore_2        
							f = myAnchor.mOwner.mVerticalBiasPercent;
	//  205  437:aload_0         
	//  206  438:getfield        #51  <Field ConstraintAnchor myAnchor>
	//  207  441:getfield        #147 <Field ConstraintWidget ConstraintAnchor.mOwner>
	//  208  444:getfield        #156 <Field float ConstraintWidget.mVerticalBiasPercent>
	//  209  447:fstore_1        
						} else
	//* 210  448:goto            476
						{
							f1 = f - (float)myAnchor.mOwner.getWidth();
	//  211  451:fload_1         
	//  212  452:aload_0         
	//  213  453:getfield        #51  <Field ConstraintAnchor myAnchor>
	//  214  456:getfield        #147 <Field ConstraintWidget ConstraintAnchor.mOwner>
	//  215  459:invokevirtual   #159 <Method int ConstraintWidget.getWidth()>
	//  216  462:i2f             
	//  217  463:fsub            
	//  218  464:fstore_2        
							f = myAnchor.mOwner.mHorizontalBiasPercent;
	//  219  465:aload_0         
	//  220  466:getfield        #51  <Field ConstraintAnchor myAnchor>
	//  221  469:getfield        #147 <Field ConstraintWidget ConstraintAnchor.mOwner>
	//  222  472:getfield        #162 <Field float ConstraintWidget.mHorizontalBiasPercent>
	//  223  475:fstore_1        
						}
						int l = myAnchor.getMargin();
	//  224  476:aload_0         
	//  225  477:getfield        #51  <Field ConstraintAnchor myAnchor>
	//  226  480:invokevirtual   #165 <Method int ConstraintAnchor.getMargin()>
	//  227  483:istore          8
						k = opposite.myAnchor.getMargin();
	//  228  485:aload_0         
	//  229  486:getfield        #108 <Field ResolutionAnchor opposite>
	//  230  489:getfield        #51  <Field ConstraintAnchor myAnchor>
	//  231  492:invokevirtual   #165 <Method int ConstraintAnchor.getMargin()>
	//  232  495:istore          7
						if(myAnchor.getTarget() == opposite.myAnchor.getTarget())
	//* 233  497:aload_0         
	//* 234  498:getfield        #51  <Field ConstraintAnchor myAnchor>
	//* 235  501:invokevirtual   #169 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//* 236  504:aload_0         
	//* 237  505:getfield        #108 <Field ResolutionAnchor opposite>
	//* 238  508:getfield        #51  <Field ConstraintAnchor myAnchor>
	//* 239  511:invokevirtual   #169 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//* 240  514:if_acmpne       526
						{
							f = 0.5F;
	//  241  517:ldc1            #170 <Float 0.5F>
	//  242  519:fstore_1        
							k = 0;
	//  243  520:iconst_0        
	//  244  521:istore          7
						} else
	//* 245  523:goto            530
						{
							j = l;
	//  246  526:iload           8
	//  247  528:istore          6
						}
						float f2 = j;
	//  248  530:iload           6
	//  249  532:i2f             
	//  250  533:fstore_3        
						float f3 = k;
	//  251  534:iload           7
	//  252  536:i2f             
	//  253  537:fstore          4
						f1 = f1 - f2 - f3;
	//  254  539:fload_2         
	//  255  540:fload_3         
	//  256  541:fsub            
	//  257  542:fload           4
	//  258  544:fsub            
	//  259  545:fstore_2        
						if(flag)
	//* 260  546:iload           5
	//* 261  548:ifeq            599
						{
							ResolutionAnchor resolutionanchor4 = opposite;
	//  262  551:aload_0         
	//  263  552:getfield        #108 <Field ResolutionAnchor opposite>
	//  264  555:astore          9
							resolutionanchor4.resolvedOffset = resolutionanchor4.target.resolvedOffset + f3 + f1 * f;
	//  265  557:aload           9
	//  266  559:aload           9
	//  267  561:getfield        #81  <Field ResolutionAnchor target>
	//  268  564:getfield        #64  <Field float resolvedOffset>
	//  269  567:fload           4
	//  270  569:fadd            
	//  271  570:fload_2         
	//  272  571:fload_1         
	//  273  572:fmul            
	//  274  573:fadd            
	//  275  574:putfield        #64  <Field float resolvedOffset>
							resolvedOffset = target.resolvedOffset - f2 - f1 * (1.0F - f);
	//  276  577:aload_0         
	//  277  578:aload_0         
	//  278  579:getfield        #81  <Field ResolutionAnchor target>
	//  279  582:getfield        #64  <Field float resolvedOffset>
	//  280  585:fload_3         
	//  281  586:fsub            
	//  282  587:fload_2         
	//  283  588:fconst_1        
	//  284  589:fload_1         
	//  285  590:fsub            
	//  286  591:fmul            
	//  287  592:fsub            
	//  288  593:putfield        #64  <Field float resolvedOffset>
						} else
	//* 289  596:goto            644
						{
							resolvedOffset = target.resolvedOffset + f2 + f1 * f;
	//  290  599:aload_0         
	//  291  600:aload_0         
	//  292  601:getfield        #81  <Field ResolutionAnchor target>
	//  293  604:getfield        #64  <Field float resolvedOffset>
	//  294  607:fload_3         
	//  295  608:fadd            
	//  296  609:fload_2         
	//  297  610:fload_1         
	//  298  611:fmul            
	//  299  612:fadd            
	//  300  613:putfield        #64  <Field float resolvedOffset>
							ResolutionAnchor resolutionanchor5 = opposite;
	//  301  616:aload_0         
	//  302  617:getfield        #108 <Field ResolutionAnchor opposite>
	//  303  620:astore          9
							resolutionanchor5.resolvedOffset = resolutionanchor5.target.resolvedOffset - f3 - f1 * (1.0F - f);
	//  304  622:aload           9
	//  305  624:aload           9
	//  306  626:getfield        #81  <Field ResolutionAnchor target>
	//  307  629:getfield        #64  <Field float resolvedOffset>
	//  308  632:fload           4
	//  309  634:fsub            
	//  310  635:fload_2         
	//  311  636:fconst_1        
	//  312  637:fload_1         
	//  313  638:fsub            
	//  314  639:fmul            
	//  315  640:fsub            
	//  316  641:putfield        #64  <Field float resolvedOffset>
						}
						didResolve();
	//  317  644:aload_0         
	//  318  645:invokevirtual   #118 <Method void didResolve()>
						opposite.didResolve();
	//  319  648:aload_0         
	//  320  649:getfield        #108 <Field ResolutionAnchor opposite>
	//  321  652:invokevirtual   #118 <Method void didResolve()>
						return;
	//  322  655:return          
					}
				}
			}
		}
		if(type == 3)
	//* 323  656:aload_0         
	//* 324  657:getfield        #41  <Field int type>
	//* 325  660:iconst_3        
	//* 326  661:icmpne          819
		{
			ResolutionAnchor resolutionanchor6 = target;
	//  327  664:aload_0         
	//  328  665:getfield        #81  <Field ResolutionAnchor target>
	//  329  668:astore          9
			if(resolutionanchor6 != null && resolutionanchor6.state == 1)
	//* 330  670:aload           9
	//* 331  672:ifnull          819
	//* 332  675:aload           9
	//* 333  677:getfield        #111 <Field int state>
	//* 334  680:iconst_1        
	//* 335  681:icmpne          819
			{
				ResolutionAnchor resolutionanchor7 = opposite;
	//  336  684:aload_0         
	//  337  685:getfield        #108 <Field ResolutionAnchor opposite>
	//  338  688:astore          9
				if(resolutionanchor7 != null)
	//* 339  690:aload           9
	//* 340  692:ifnull          819
				{
					resolutionanchor7 = resolutionanchor7.target;
	//  341  695:aload           9
	//  342  697:getfield        #81  <Field ResolutionAnchor target>
	//  343  700:astore          9
					if(resolutionanchor7 != null && resolutionanchor7.state == 1)
	//* 344  702:aload           9
	//* 345  704:ifnull          819
	//* 346  707:aload           9
	//* 347  709:getfield        #111 <Field int state>
	//* 348  712:iconst_1        
	//* 349  713:icmpne          819
					{
						if(LinearSystem.getMetrics() != null)
	//* 350  716:invokestatic    #122 <Method Metrics LinearSystem.getMetrics()>
	//* 351  719:ifnull          739
						{
							Metrics metrics1 = LinearSystem.getMetrics();
	//  352  722:invokestatic    #122 <Method Metrics LinearSystem.getMetrics()>
	//  353  725:astore          9
							metrics1.matchConnectionResolved = metrics1.matchConnectionResolved + 1L;
	//  354  727:aload           9
	//  355  729:aload           9
	//  356  731:getfield        #173 <Field long Metrics.matchConnectionResolved>
	//  357  734:lconst_1        
	//  358  735:ladd            
	//  359  736:putfield        #173 <Field long Metrics.matchConnectionResolved>
						}
						ResolutionAnchor resolutionanchor8 = target;
	//  360  739:aload_0         
	//  361  740:getfield        #81  <Field ResolutionAnchor target>
	//  362  743:astore          9
						resolvedTarget = resolutionanchor8.resolvedTarget;
	//  363  745:aload_0         
	//  364  746:aload           9
	//  365  748:getfield        #62  <Field ResolutionAnchor resolvedTarget>
	//  366  751:putfield        #62  <Field ResolutionAnchor resolvedTarget>
						ResolutionAnchor resolutionanchor9 = opposite;
	//  367  754:aload_0         
	//  368  755:getfield        #108 <Field ResolutionAnchor opposite>
	//  369  758:astore          10
						ResolutionAnchor resolutionanchor10 = resolutionanchor9.target;
	//  370  760:aload           10
	//  371  762:getfield        #81  <Field ResolutionAnchor target>
	//  372  765:astore          11
						resolutionanchor9.resolvedTarget = resolutionanchor10.resolvedTarget;
	//  373  767:aload           10
	//  374  769:aload           11
	//  375  771:getfield        #62  <Field ResolutionAnchor resolvedTarget>
	//  376  774:putfield        #62  <Field ResolutionAnchor resolvedTarget>
						resolvedOffset = resolutionanchor8.resolvedOffset + offset;
	//  377  777:aload_0         
	//  378  778:aload           9
	//  379  780:getfield        #64  <Field float resolvedOffset>
	//  380  783:aload_0         
	//  381  784:getfield        #83  <Field float offset>
	//  382  787:fadd            
	//  383  788:putfield        #64  <Field float resolvedOffset>
						resolutionanchor9.resolvedOffset = resolutionanchor10.resolvedOffset + resolutionanchor9.offset;
	//  384  791:aload           10
	//  385  793:aload           11
	//  386  795:getfield        #64  <Field float resolvedOffset>
	//  387  798:aload           10
	//  388  800:getfield        #83  <Field float offset>
	//  389  803:fadd            
	//  390  804:putfield        #64  <Field float resolvedOffset>
						didResolve();
	//  391  807:aload_0         
	//  392  808:invokevirtual   #118 <Method void didResolve()>
						opposite.didResolve();
	//  393  811:aload_0         
	//  394  812:getfield        #108 <Field ResolutionAnchor opposite>
	//  395  815:invokevirtual   #118 <Method void didResolve()>
						return;
	//  396  818:return          
					}
				}
			}
		}
		if(type == 5)
	//* 397  819:aload_0         
	//* 398  820:getfield        #41  <Field int type>
	//* 399  823:iconst_5        
	//* 400  824:icmpne          837
			myAnchor.mOwner.resolve();
	//  401  827:aload_0         
	//  402  828:getfield        #51  <Field ConstraintAnchor myAnchor>
	//  403  831:getfield        #147 <Field ConstraintWidget ConstraintAnchor.mOwner>
	//  404  834:invokevirtual   #174 <Method void ConstraintWidget.resolve()>
	//  405  837:return          
	}

	public void resolve(ResolutionAnchor resolutionanchor, float f)
	{
		if(state == 0 || resolvedTarget != resolutionanchor && resolvedOffset != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field int state>
	//*   2    4:ifeq            24
	//*   3    7:aload_0         
	//*   4    8:getfield        #62  <Field ResolutionAnchor resolvedTarget>
	//*   5   11:aload_1         
	//*   6   12:if_acmpeq       50
	//*   7   15:aload_0         
	//*   8   16:getfield        #64  <Field float resolvedOffset>
	//*   9   19:fload_2         
	//*  10   20:fcmpl           
	//*  11   21:ifeq            50
		{
			resolvedTarget = resolutionanchor;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #62  <Field ResolutionAnchor resolvedTarget>
			resolvedOffset = f;
	//   15   29:aload_0         
	//   16   30:fload_2         
	//   17   31:putfield        #64  <Field float resolvedOffset>
			if(state == 1)
	//*  18   34:aload_0         
	//*  19   35:getfield        #111 <Field int state>
	//*  20   38:iconst_1        
	//*  21   39:icmpne          46
				invalidate();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #178 <Method void invalidate()>
			didResolve();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #118 <Method void didResolve()>
		}
	//   26   50:return          
	}

	String sType(int i)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          8
			return "DIRECT";
	//    3    5:ldc1            #182 <String "DIRECT">
	//    4    7:areturn         
		if(i == 2)
	//*   5    8:iload_1         
	//*   6    9:iconst_2        
	//*   7   10:icmpne          16
			return "CENTER";
	//    8   13:ldc1            #184 <String "CENTER">
	//    9   15:areturn         
		if(i == 3)
	//*  10   16:iload_1         
	//*  11   17:iconst_3        
	//*  12   18:icmpne          24
			return "MATCH";
	//   13   21:ldc1            #186 <String "MATCH">
	//   14   23:areturn         
		if(i == 4)
	//*  15   24:iload_1         
	//*  16   25:iconst_4        
	//*  17   26:icmpne          32
			return "CHAIN";
	//   18   29:ldc1            #188 <String "CHAIN">
	//   19   31:areturn         
		if(i == 5)
	//*  20   32:iload_1         
	//*  21   33:iconst_5        
	//*  22   34:icmpne          40
			return "BARRIER";
	//   23   37:ldc1            #190 <String "BARRIER">
	//   24   39:areturn         
		else
			return "UNCONNECTED";
	//   25   40:ldc1            #191 <String "UNCONNECTED">
	//   26   42:areturn         
	}

	public void setOpposite(ResolutionAnchor resolutionanchor, float f)
	{
		opposite = resolutionanchor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #108 <Field ResolutionAnchor opposite>
		oppositeOffset = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #98  <Field float oppositeOffset>
	//    6   10:return          
	}

	public void setOpposite(ResolutionAnchor resolutionanchor, int i, ResolutionDimension resolutiondimension)
	{
		opposite = resolutionanchor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #108 <Field ResolutionAnchor opposite>
		oppositeDimension = resolutiondimension;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #47  <Field ResolutionDimension oppositeDimension>
		oppositeDimensionMultiplier = i;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:putfield        #49  <Field int oppositeDimensionMultiplier>
	//    9   15:return          
	}

	public void setType(int i)
	{
		type = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int type>
	//    3    5:return          
	}

	public String toString()
	{
		if(state == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field int state>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          162
		{
			if(resolvedTarget == this)
	//*   4    8:aload_0         
	//*   5    9:getfield        #62  <Field ResolutionAnchor resolvedTarget>
	//*   6   12:aload_0         
	//*   7   13:if_acmpne       81
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    8   16:new             #198 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #199 <Method void StringBuilder()>
	//   11   23:astore_1        
				stringbuilder.append("[");
	//   12   24:aload_1         
	//   13   25:ldc1            #201 <String "[">
	//   14   27:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
				stringbuilder.append(((Object) (myAnchor)));
	//   16   31:aload_1         
	//   17   32:aload_0         
	//   18   33:getfield        #51  <Field ConstraintAnchor myAnchor>
	//   19   36:invokevirtual   #208 <Method StringBuilder StringBuilder.append(Object)>
	//   20   39:pop             
				stringbuilder.append(", RESOLVED: ");
	//   21   40:aload_1         
	//   22   41:ldc1            #210 <String ", RESOLVED: ">
	//   23   43:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
				stringbuilder.append(resolvedOffset);
	//   25   47:aload_1         
	//   26   48:aload_0         
	//   27   49:getfield        #64  <Field float resolvedOffset>
	//   28   52:invokevirtual   #213 <Method StringBuilder StringBuilder.append(float)>
	//   29   55:pop             
				stringbuilder.append("]  type: ");
	//   30   56:aload_1         
	//   31   57:ldc1            #215 <String "]  type: ">
	//   32   59:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   33   62:pop             
				stringbuilder.append(sType(type));
	//   34   63:aload_1         
	//   35   64:aload_0         
	//   36   65:aload_0         
	//   37   66:getfield        #41  <Field int type>
	//   38   69:invokevirtual   #217 <Method String sType(int)>
	//   39   72:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   40   75:pop             
				return stringbuilder.toString();
	//   41   76:aload_1         
	//   42   77:invokevirtual   #219 <Method String StringBuilder.toString()>
	//   43   80:areturn         
			} else
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   44   81:new             #198 <Class StringBuilder>
	//   45   84:dup             
	//   46   85:invokespecial   #199 <Method void StringBuilder()>
	//   47   88:astore_1        
				stringbuilder1.append("[");
	//   48   89:aload_1         
	//   49   90:ldc1            #201 <String "[">
	//   50   92:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   51   95:pop             
				stringbuilder1.append(((Object) (myAnchor)));
	//   52   96:aload_1         
	//   53   97:aload_0         
	//   54   98:getfield        #51  <Field ConstraintAnchor myAnchor>
	//   55  101:invokevirtual   #208 <Method StringBuilder StringBuilder.append(Object)>
	//   56  104:pop             
				stringbuilder1.append(", RESOLVED: ");
	//   57  105:aload_1         
	//   58  106:ldc1            #210 <String ", RESOLVED: ">
	//   59  108:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   60  111:pop             
				stringbuilder1.append(((Object) (resolvedTarget)));
	//   61  112:aload_1         
	//   62  113:aload_0         
	//   63  114:getfield        #62  <Field ResolutionAnchor resolvedTarget>
	//   64  117:invokevirtual   #208 <Method StringBuilder StringBuilder.append(Object)>
	//   65  120:pop             
				stringbuilder1.append(":");
	//   66  121:aload_1         
	//   67  122:ldc1            #221 <String ":">
	//   68  124:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   69  127:pop             
				stringbuilder1.append(resolvedOffset);
	//   70  128:aload_1         
	//   71  129:aload_0         
	//   72  130:getfield        #64  <Field float resolvedOffset>
	//   73  133:invokevirtual   #213 <Method StringBuilder StringBuilder.append(float)>
	//   74  136:pop             
				stringbuilder1.append("] type: ");
	//   75  137:aload_1         
	//   76  138:ldc1            #223 <String "] type: ">
	//   77  140:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   78  143:pop             
				stringbuilder1.append(sType(type));
	//   79  144:aload_1         
	//   80  145:aload_0         
	//   81  146:aload_0         
	//   82  147:getfield        #41  <Field int type>
	//   83  150:invokevirtual   #217 <Method String sType(int)>
	//   84  153:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   85  156:pop             
				return stringbuilder1.toString();
	//   86  157:aload_1         
	//   87  158:invokevirtual   #219 <Method String StringBuilder.toString()>
	//   88  161:areturn         
			}
		} else
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   89  162:new             #198 <Class StringBuilder>
	//   90  165:dup             
	//   91  166:invokespecial   #199 <Method void StringBuilder()>
	//   92  169:astore_1        
			stringbuilder2.append("{ ");
	//   93  170:aload_1         
	//   94  171:ldc1            #225 <String "{ ">
	//   95  173:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   96  176:pop             
			stringbuilder2.append(((Object) (myAnchor)));
	//   97  177:aload_1         
	//   98  178:aload_0         
	//   99  179:getfield        #51  <Field ConstraintAnchor myAnchor>
	//  100  182:invokevirtual   #208 <Method StringBuilder StringBuilder.append(Object)>
	//  101  185:pop             
			stringbuilder2.append(" UNRESOLVED} type: ");
	//  102  186:aload_1         
	//  103  187:ldc1            #227 <String " UNRESOLVED} type: ">
	//  104  189:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  105  192:pop             
			stringbuilder2.append(sType(type));
	//  106  193:aload_1         
	//  107  194:aload_0         
	//  108  195:aload_0         
	//  109  196:getfield        #41  <Field int type>
	//  110  199:invokevirtual   #217 <Method String sType(int)>
	//  111  202:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  112  205:pop             
			return stringbuilder2.toString();
	//  113  206:aload_1         
	//  114  207:invokevirtual   #219 <Method String StringBuilder.toString()>
	//  115  210:areturn         
		}
	}

	public void update()
	{
		int i;
		ConstraintAnchor constraintanchor;
label0:
		{
			constraintanchor = myAnchor.getTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ConstraintAnchor myAnchor>
	//    2    4:invokevirtual   #169 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//    3    7:astore_3        
			if(constraintanchor == null)
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       13
				return;
	//    6   12:return          
			if(constraintanchor.getTarget() == myAnchor)
	//*   7   13:aload_3         
	//*   8   14:invokevirtual   #169 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//*   9   17:aload_0         
	//*  10   18:getfield        #51  <Field ConstraintAnchor myAnchor>
	//*  11   21:if_acmpne       37
			{
				type = 4;
	//   12   24:aload_0         
	//   13   25:iconst_4        
	//   14   26:putfield        #41  <Field int type>
				constraintanchor.getResolutionNode().type = 4;
	//   15   29:aload_3         
	//   16   30:invokevirtual   #232 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   17   33:iconst_4        
	//   18   34:putfield        #41  <Field int type>
			}
			int j = myAnchor.getMargin();
	//   19   37:aload_0         
	//   20   38:getfield        #51  <Field ConstraintAnchor myAnchor>
	//   21   41:invokevirtual   #165 <Method int ConstraintAnchor.getMargin()>
	//   22   44:istore_2        
			if(myAnchor.mType != ConstraintAnchor.Type.RIGHT)
	//*  23   45:aload_0         
	//*  24   46:getfield        #51  <Field ConstraintAnchor myAnchor>
	//*  25   49:getfield        #132 <Field ConstraintAnchor$Type ConstraintAnchor.mType>
	//*  26   52:getstatic       #137 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//*  27   55:if_acmpeq       73
			{
				i = j;
	//   28   58:iload_2         
	//   29   59:istore_1        
				if(myAnchor.mType != ConstraintAnchor.Type.BOTTOM)
					break label0;
	//   30   60:aload_0         
	//   31   61:getfield        #51  <Field ConstraintAnchor myAnchor>
	//   32   64:getfield        #132 <Field ConstraintAnchor$Type ConstraintAnchor.mType>
	//   33   67:getstatic       #140 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//   34   70:if_acmpne       76
			}
			i = -j;
	//   35   73:iload_2         
	//   36   74:ineg            
	//   37   75:istore_1        
		}
		dependsOn(constraintanchor.getResolutionNode(), i);
	//   38   76:aload_0         
	//   39   77:aload_3         
	//   40   78:invokevirtual   #232 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   41   81:iload_1         
	//   42   82:invokevirtual   #234 <Method void dependsOn(ResolutionAnchor, int)>
	//   43   85:return          
	}

	public static final int BARRIER_CONNECTION = 5;
	public static final int CENTER_CONNECTION = 2;
	public static final int CHAIN_CONNECTION = 4;
	public static final int DIRECT_CONNECTION = 1;
	public static final int MATCH_CONNECTION = 3;
	public static final int UNCONNECTED = 0;
	float computedValue;
	private ResolutionDimension dimension;
	private int dimensionMultiplier;
	ConstraintAnchor myAnchor;
	float offset;
	private ResolutionAnchor opposite;
	private ResolutionDimension oppositeDimension;
	private int oppositeDimensionMultiplier;
	private float oppositeOffset;
	float resolvedOffset;
	ResolutionAnchor resolvedTarget;
	ResolutionAnchor target;
	int type;
}
