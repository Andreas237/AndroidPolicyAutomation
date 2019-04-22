// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.constraint:
//			Constraints

public static class Constraints$LayoutParams extends rams
{

	public float alpha;
	public boolean applyElevation;
	public float elevation;
	public float rotation;
	public float rotationX;
	public float rotationY;
	public float scaleX;
	public float scaleY;
	public float transformPivotX;
	public float transformPivotY;
	public float translationX;
	public float translationY;
	public float translationZ;

	public Constraints$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void ConstraintLayout$LayoutParams(int, int)>
		alpha = 1.0F;
	//    4    6:aload_0         
	//    5    7:fconst_1        
	//    6    8:putfield        #28  <Field float alpha>
		applyElevation = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #30  <Field boolean applyElevation>
		elevation = 0.0F;
	//   10   16:aload_0         
	//   11   17:fconst_0        
	//   12   18:putfield        #32  <Field float elevation>
		rotation = 0.0F;
	//   13   21:aload_0         
	//   14   22:fconst_0        
	//   15   23:putfield        #34  <Field float rotation>
		rotationX = 0.0F;
	//   16   26:aload_0         
	//   17   27:fconst_0        
	//   18   28:putfield        #36  <Field float rotationX>
		rotationY = 0.0F;
	//   19   31:aload_0         
	//   20   32:fconst_0        
	//   21   33:putfield        #38  <Field float rotationY>
		scaleX = 1.0F;
	//   22   36:aload_0         
	//   23   37:fconst_1        
	//   24   38:putfield        #40  <Field float scaleX>
		scaleY = 1.0F;
	//   25   41:aload_0         
	//   26   42:fconst_1        
	//   27   43:putfield        #42  <Field float scaleY>
		transformPivotX = 0.0F;
	//   28   46:aload_0         
	//   29   47:fconst_0        
	//   30   48:putfield        #44  <Field float transformPivotX>
		transformPivotY = 0.0F;
	//   31   51:aload_0         
	//   32   52:fconst_0        
	//   33   53:putfield        #46  <Field float transformPivotY>
		translationX = 0.0F;
	//   34   56:aload_0         
	//   35   57:fconst_0        
	//   36   58:putfield        #48  <Field float translationX>
		translationY = 0.0F;
	//   37   61:aload_0         
	//   38   62:fconst_0        
	//   39   63:putfield        #50  <Field float translationY>
		translationZ = 0.0F;
	//   40   66:aload_0         
	//   41   67:fconst_0        
	//   42   68:putfield        #52  <Field float translationZ>
	//   43   71:return          
	}

	public Constraints$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #56  <Method void ConstraintLayout$LayoutParams(Context, AttributeSet)>
		alpha = 1.0F;
	//    4    6:aload_0         
	//    5    7:fconst_1        
	//    6    8:putfield        #28  <Field float alpha>
		int i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_3        
		applyElevation = false;
	//    9   13:aload_0         
	//   10   14:iconst_0        
	//   11   15:putfield        #30  <Field boolean applyElevation>
		elevation = 0.0F;
	//   12   18:aload_0         
	//   13   19:fconst_0        
	//   14   20:putfield        #32  <Field float elevation>
		rotation = 0.0F;
	//   15   23:aload_0         
	//   16   24:fconst_0        
	//   17   25:putfield        #34  <Field float rotation>
		rotationX = 0.0F;
	//   18   28:aload_0         
	//   19   29:fconst_0        
	//   20   30:putfield        #36  <Field float rotationX>
		rotationY = 0.0F;
	//   21   33:aload_0         
	//   22   34:fconst_0        
	//   23   35:putfield        #38  <Field float rotationY>
		scaleX = 1.0F;
	//   24   38:aload_0         
	//   25   39:fconst_1        
	//   26   40:putfield        #40  <Field float scaleX>
		scaleY = 1.0F;
	//   27   43:aload_0         
	//   28   44:fconst_1        
	//   29   45:putfield        #42  <Field float scaleY>
		transformPivotX = 0.0F;
	//   30   48:aload_0         
	//   31   49:fconst_0        
	//   32   50:putfield        #44  <Field float transformPivotX>
		transformPivotY = 0.0F;
	//   33   53:aload_0         
	//   34   54:fconst_0        
	//   35   55:putfield        #46  <Field float transformPivotY>
		translationX = 0.0F;
	//   36   58:aload_0         
	//   37   59:fconst_0        
	//   38   60:putfield        #48  <Field float translationX>
		translationY = 0.0F;
	//   39   63:aload_0         
	//   40   64:fconst_0        
	//   41   65:putfield        #50  <Field float translationY>
		translationZ = 0.0F;
	//   42   68:aload_0         
	//   43   69:fconst_0        
	//   44   70:putfield        #52  <Field float translationZ>
		context = ((Context) (context.obtainStyledAttributes(attributeset, R.styleable.ConstraintSet)));
	//   45   73:aload_1         
	//   46   74:aload_2         
	//   47   75:getstatic       #62  <Field int[] R$styleable.ConstraintSet>
	//   48   78:invokevirtual   #68  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   49   81:astore_1        
		for(int j = ((TypedArray) (context)).getIndexCount(); i < j; i++)
	//*  50   82:aload_1         
	//*  51   83:invokevirtual   #74  <Method int TypedArray.getIndexCount()>
	//*  52   86:istore          4
	//*  53   88:iload_3         
	//*  54   89:iload           4
	//*  55   91:icmpge          410
		{
			int k = ((TypedArray) (context)).getIndex(i);
	//   56   94:aload_1         
	//   57   95:iload_3         
	//   58   96:invokevirtual   #78  <Method int TypedArray.getIndex(int)>
	//   59   99:istore          5
			if(k == R.styleable.ConstraintSet_android_alpha)
	//*  60  101:iload           5
	//*  61  103:getstatic       #82  <Field int R$styleable.ConstraintSet_android_alpha>
	//*  62  106:icmpne          126
			{
				alpha = ((TypedArray) (context)).getFloat(k, alpha);
	//   63  109:aload_0         
	//   64  110:aload_1         
	//   65  111:iload           5
	//   66  113:aload_0         
	//   67  114:getfield        #28  <Field float alpha>
	//   68  117:invokevirtual   #86  <Method float TypedArray.getFloat(int, float)>
	//   69  120:putfield        #28  <Field float alpha>
				continue;
	//   70  123:goto            403
			}
			if(k == R.styleable.ConstraintSet_android_elevation)
	//*  71  126:iload           5
	//*  72  128:getstatic       #89  <Field int R$styleable.ConstraintSet_android_elevation>
	//*  73  131:icmpne          156
			{
				elevation = ((TypedArray) (context)).getFloat(k, elevation);
	//   74  134:aload_0         
	//   75  135:aload_1         
	//   76  136:iload           5
	//   77  138:aload_0         
	//   78  139:getfield        #32  <Field float elevation>
	//   79  142:invokevirtual   #86  <Method float TypedArray.getFloat(int, float)>
	//   80  145:putfield        #32  <Field float elevation>
				applyElevation = true;
	//   81  148:aload_0         
	//   82  149:iconst_1        
	//   83  150:putfield        #30  <Field boolean applyElevation>
				continue;
	//   84  153:goto            403
			}
			if(k == R.styleable.ConstraintSet_android_rotationX)
	//*  85  156:iload           5
	//*  86  158:getstatic       #92  <Field int R$styleable.ConstraintSet_android_rotationX>
	//*  87  161:icmpne          181
			{
				rotationX = ((TypedArray) (context)).getFloat(k, rotationX);
	//   88  164:aload_0         
	//   89  165:aload_1         
	//   90  166:iload           5
	//   91  168:aload_0         
	//   92  169:getfield        #36  <Field float rotationX>
	//   93  172:invokevirtual   #86  <Method float TypedArray.getFloat(int, float)>
	//   94  175:putfield        #36  <Field float rotationX>
				continue;
	//   95  178:goto            403
			}
			if(k == R.styleable.ConstraintSet_android_rotationY)
	//*  96  181:iload           5
	//*  97  183:getstatic       #95  <Field int R$styleable.ConstraintSet_android_rotationY>
	//*  98  186:icmpne          206
			{
				rotationY = ((TypedArray) (context)).getFloat(k, rotationY);
	//   99  189:aload_0         
	//  100  190:aload_1         
	//  101  191:iload           5
	//  102  193:aload_0         
	//  103  194:getfield        #38  <Field float rotationY>
	//  104  197:invokevirtual   #86  <Method float TypedArray.getFloat(int, float)>
	//  105  200:putfield        #38  <Field float rotationY>
				continue;
	//  106  203:goto            403
			}
			if(k == R.styleable.ConstraintSet_android_rotation)
	//* 107  206:iload           5
	//* 108  208:getstatic       #98  <Field int R$styleable.ConstraintSet_android_rotation>
	//* 109  211:icmpne          231
			{
				rotation = ((TypedArray) (context)).getFloat(k, rotation);
	//  110  214:aload_0         
	//  111  215:aload_1         
	//  112  216:iload           5
	//  113  218:aload_0         
	//  114  219:getfield        #34  <Field float rotation>
	//  115  222:invokevirtual   #86  <Method float TypedArray.getFloat(int, float)>
	//  116  225:putfield        #34  <Field float rotation>
				continue;
	//  117  228:goto            403
			}
			if(k == R.styleable.ConstraintSet_android_scaleX)
	//* 118  231:iload           5
	//* 119  233:getstatic       #101 <Field int R$styleable.ConstraintSet_android_scaleX>
	//* 120  236:icmpne          256
			{
				scaleX = ((TypedArray) (context)).getFloat(k, scaleX);
	//  121  239:aload_0         
	//  122  240:aload_1         
	//  123  241:iload           5
	//  124  243:aload_0         
	//  125  244:getfield        #40  <Field float scaleX>
	//  126  247:invokevirtual   #86  <Method float TypedArray.getFloat(int, float)>
	//  127  250:putfield        #40  <Field float scaleX>
				continue;
	//  128  253:goto            403
			}
			if(k == R.styleable.ConstraintSet_android_scaleY)
	//* 129  256:iload           5
	//* 130  258:getstatic       #104 <Field int R$styleable.ConstraintSet_android_scaleY>
	//* 131  261:icmpne          281
			{
				scaleY = ((TypedArray) (context)).getFloat(k, scaleY);
	//  132  264:aload_0         
	//  133  265:aload_1         
	//  134  266:iload           5
	//  135  268:aload_0         
	//  136  269:getfield        #42  <Field float scaleY>
	//  137  272:invokevirtual   #86  <Method float TypedArray.getFloat(int, float)>
	//  138  275:putfield        #42  <Field float scaleY>
				continue;
	//  139  278:goto            403
			}
			if(k == R.styleable.ConstraintSet_android_transformPivotX)
	//* 140  281:iload           5
	//* 141  283:getstatic       #107 <Field int R$styleable.ConstraintSet_android_transformPivotX>
	//* 142  286:icmpne          306
			{
				transformPivotX = ((TypedArray) (context)).getFloat(k, transformPivotX);
	//  143  289:aload_0         
	//  144  290:aload_1         
	//  145  291:iload           5
	//  146  293:aload_0         
	//  147  294:getfield        #44  <Field float transformPivotX>
	//  148  297:invokevirtual   #86  <Method float TypedArray.getFloat(int, float)>
	//  149  300:putfield        #44  <Field float transformPivotX>
				continue;
	//  150  303:goto            403
			}
			if(k == R.styleable.ConstraintSet_android_transformPivotY)
	//* 151  306:iload           5
	//* 152  308:getstatic       #110 <Field int R$styleable.ConstraintSet_android_transformPivotY>
	//* 153  311:icmpne          331
			{
				transformPivotY = ((TypedArray) (context)).getFloat(k, transformPivotY);
	//  154  314:aload_0         
	//  155  315:aload_1         
	//  156  316:iload           5
	//  157  318:aload_0         
	//  158  319:getfield        #46  <Field float transformPivotY>
	//  159  322:invokevirtual   #86  <Method float TypedArray.getFloat(int, float)>
	//  160  325:putfield        #46  <Field float transformPivotY>
				continue;
	//  161  328:goto            403
			}
			if(k == R.styleable.ConstraintSet_android_translationX)
	//* 162  331:iload           5
	//* 163  333:getstatic       #113 <Field int R$styleable.ConstraintSet_android_translationX>
	//* 164  336:icmpne          356
			{
				translationX = ((TypedArray) (context)).getFloat(k, translationX);
	//  165  339:aload_0         
	//  166  340:aload_1         
	//  167  341:iload           5
	//  168  343:aload_0         
	//  169  344:getfield        #48  <Field float translationX>
	//  170  347:invokevirtual   #86  <Method float TypedArray.getFloat(int, float)>
	//  171  350:putfield        #48  <Field float translationX>
				continue;
	//  172  353:goto            403
			}
			if(k == R.styleable.ConstraintSet_android_translationY)
	//* 173  356:iload           5
	//* 174  358:getstatic       #116 <Field int R$styleable.ConstraintSet_android_translationY>
	//* 175  361:icmpne          381
			{
				translationY = ((TypedArray) (context)).getFloat(k, translationY);
	//  176  364:aload_0         
	//  177  365:aload_1         
	//  178  366:iload           5
	//  179  368:aload_0         
	//  180  369:getfield        #50  <Field float translationY>
	//  181  372:invokevirtual   #86  <Method float TypedArray.getFloat(int, float)>
	//  182  375:putfield        #50  <Field float translationY>
				continue;
	//  183  378:goto            403
			}
			if(k == R.styleable.ConstraintSet_android_translationZ)
	//* 184  381:iload           5
	//* 185  383:getstatic       #119 <Field int R$styleable.ConstraintSet_android_translationZ>
	//* 186  386:icmpne          403
				translationX = ((TypedArray) (context)).getFloat(k, translationZ);
	//  187  389:aload_0         
	//  188  390:aload_1         
	//  189  391:iload           5
	//  190  393:aload_0         
	//  191  394:getfield        #52  <Field float translationZ>
	//  192  397:invokevirtual   #86  <Method float TypedArray.getFloat(int, float)>
	//  193  400:putfield        #48  <Field float translationX>
		}

	//  194  403:iload_3         
	//  195  404:iconst_1        
	//  196  405:iadd            
	//  197  406:istore_3        
	//* 198  407:goto            88
	//  199  410:return          
	}
}
