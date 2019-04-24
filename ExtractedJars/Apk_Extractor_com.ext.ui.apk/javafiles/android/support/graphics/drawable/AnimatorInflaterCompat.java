// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.animation.*;
import android.content.Context;
import android.content.res.*;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.graphics.PathParser;
import android.util.*;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.graphics.drawable:
//			AndroidResources, ArgbEvaluator, AnimationUtilsCompat

public class AnimatorInflaterCompat
{
	private static class PathDataEvaluator
		implements TypeEvaluator
	{

		public volatile Object evaluate(float f, Object obj, Object obj1)
		{
			return ((Object) (evaluate(f, (android.support.v4.graphics.PathParser.PathDataNode[])obj, (android.support.v4.graphics.PathParser.PathDataNode[])obj1)));
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #25  <Class android.support.v4.graphics.PathParser$PathDataNode[]>
		//    4    6:aload_3         
		//    5    7:checkcast       #25  <Class android.support.v4.graphics.PathParser$PathDataNode[]>
		//    6   10:invokevirtual   #28  <Method android.support.v4.graphics.PathParser$PathDataNode[] evaluate(float, android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
		//    7   13:areturn         
		}

		public android.support.v4.graphics.PathParser.PathDataNode[] evaluate(float f, android.support.v4.graphics.PathParser.PathDataNode apathdatanode[], android.support.v4.graphics.PathParser.PathDataNode apathdatanode1[])
		{
			if(!PathParser.canMorph(apathdatanode, apathdatanode1))
		//*   0    0:aload_2         
		//*   1    1:aload_3         
		//*   2    2:invokestatic    #34  <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
		//*   3    5:ifne            18
				throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
		//    4    8:new             #36  <Class IllegalArgumentException>
		//    5   11:dup             
		//    6   12:ldc1            #38  <String "Can't interpolate between two incompatible pathData">
		//    7   14:invokespecial   #41  <Method void IllegalArgumentException(String)>
		//    8   17:athrow          
			if(mNodeArray == null || !PathParser.canMorph(mNodeArray, apathdatanode))
		//*   9   18:aload_0         
		//*  10   19:getfield        #22  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
		//*  11   22:ifnull          36
		//*  12   25:aload_0         
		//*  13   26:getfield        #22  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
		//*  14   29:aload_2         
		//*  15   30:invokestatic    #34  <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
		//*  16   33:ifne            44
				mNodeArray = PathParser.deepCopyNodes(apathdatanode);
		//   17   36:aload_0         
		//   18   37:aload_2         
		//   19   38:invokestatic    #45  <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.deepCopyNodes(android.support.v4.graphics.PathParser$PathDataNode[])>
		//   20   41:putfield        #22  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
			for(int i = 0; i < apathdatanode.length; i++)
		//*  21   44:iconst_0        
		//*  22   45:istore          4
		//*  23   47:iload           4
		//*  24   49:aload_2         
		//*  25   50:arraylength     
		//*  26   51:icmpge          82
				mNodeArray[i].interpolatePathDataNode(apathdatanode[i], apathdatanode1[i], f);
		//   27   54:aload_0         
		//   28   55:getfield        #22  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
		//   29   58:iload           4
		//   30   60:aaload          
		//   31   61:aload_2         
		//   32   62:iload           4
		//   33   64:aaload          
		//   34   65:aload_3         
		//   35   66:iload           4
		//   36   68:aaload          
		//   37   69:fload_1         
		//   38   70:invokevirtual   #51  <Method void android.support.v4.graphics.PathParser$PathDataNode.interpolatePathDataNode(android.support.v4.graphics.PathParser$PathDataNode, android.support.v4.graphics.PathParser$PathDataNode, float)>

		//   39   73:iload           4
		//   40   75:iconst_1        
		//   41   76:iadd            
		//   42   77:istore          4
		//*  43   79:goto            47
			return mNodeArray;
		//   44   82:aload_0         
		//   45   83:getfield        #22  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
		//   46   86:areturn         
		}

		private android.support.v4.graphics.PathParser.PathDataNode mNodeArray[];

		private PathDataEvaluator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}


		PathDataEvaluator(android.support.v4.graphics.PathParser.PathDataNode apathdatanode[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mNodeArray = apathdatanode;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
		//    5    9:return          
		}
	}


	public AnimatorInflaterCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:return          
	}

	private static Animator createAnimatorFromXml(Context context, Resources resources, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser, float f)
		throws XmlPullParserException, IOException
	{
		return createAnimatorFromXml(context, resources, theme, xmlpullparser, Xml.asAttributeSet(xmlpullparser), ((AnimatorSet) (null)), 0, f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload_3         
	//    5    5:invokestatic    #50  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//    6    8:aconst_null     
	//    7    9:iconst_0        
	//    8   10:fload           4
	//    9   12:invokestatic    #53  <Method Animator createAnimatorFromXml(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, AttributeSet, AnimatorSet, int, float)>
	//   10   15:areturn         
	}

	private static Animator createAnimatorFromXml(Context context, Resources resources, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser, AttributeSet attributeset, AnimatorSet animatorset, int i, float f)
		throws XmlPullParserException, IOException
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          12
		ArrayList arraylist = null;
	//    2    3:aconst_null     
	//    3    4:astore          11
		int i1 = xmlpullparser.getDepth();
	//    4    6:aload_3         
	//    5    7:invokeinterface #60  <Method int XmlPullParser.getDepth()>
	//    6   12:istore          9
		do
		{
label0:
			{
				int j = xmlpullparser.next();
	//    7   14:aload_3         
	//    8   15:invokeinterface #63  <Method int XmlPullParser.next()>
	//    9   20:istore          8
				if((j != 3 || xmlpullparser.getDepth() > i1) && j != 1)
	//*  10   22:iload           8
	//*  11   24:iconst_3        
	//*  12   25:icmpne          39
	//*  13   28:aload_3         
	//*  14   29:invokeinterface #60  <Method int XmlPullParser.getDepth()>
	//*  15   34:iload           9
	//*  16   36:icmple          328
	//*  17   39:iload           8
	//*  18   41:iconst_1        
	//*  19   42:icmpeq          328
				{
					if(j == 2)
	//*  20   45:iload           8
	//*  21   47:iconst_2        
	//*  22   48:icmpne          14
					{
						Object obj = ((Object) (xmlpullparser.getName()));
	//   23   51:aload_3         
	//   24   52:invokeinterface #67  <Method String XmlPullParser.getName()>
	//   25   57:astore          10
						int k;
						if(((String) (obj)).equals("objectAnimator"))
	//*  26   59:aload           10
	//*  27   61:ldc1            #69  <String "objectAnimator">
	//*  28   63:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  29   66:ifeq            132
						{
							obj = ((Object) (loadObjectAnimator(context, resources, theme, attributeset, f, xmlpullparser)));
	//   30   69:aload_0         
	//   31   70:aload_1         
	//   32   71:aload_2         
	//   33   72:aload           4
	//   34   74:fload           7
	//   35   76:aload_3         
	//   36   77:invokestatic    #79  <Method ObjectAnimator loadObjectAnimator(Context, Resources, android.content.res.Resources$Theme, AttributeSet, float, XmlPullParser)>
	//   37   80:astore          10
							k = 0;
	//   38   82:iconst_0        
	//   39   83:istore          8
						} else
	//*  40   85:aload           10
	//*  41   87:astore          12
	//*  42   89:aload           5
	//*  43   91:ifnull          14
	//*  44   94:aload           10
	//*  45   96:astore          12
	//*  46   98:iload           8
	//*  47  100:ifne            14
	//*  48  103:aload           11
	//*  49  105:ifnonnull       410
	//*  50  108:new             #81  <Class ArrayList>
	//*  51  111:dup             
	//*  52  112:invokespecial   #82  <Method void ArrayList()>
	//*  53  115:astore          11
	//*  54  117:aload           11
	//*  55  119:aload           10
	//*  56  121:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//*  57  124:pop             
	//*  58  125:aload           10
	//*  59  127:astore          12
	//*  60  129:goto            14
						if(((String) (obj)).equals("animator"))
	//*  61  132:aload           10
	//*  62  134:ldc1            #87  <String "animator">
	//*  63  136:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  64  139:ifeq            162
						{
							obj = ((Object) (loadAnimator(context, resources, theme, attributeset, ((ValueAnimator) (null)), f, xmlpullparser)));
	//   65  142:aload_0         
	//   66  143:aload_1         
	//   67  144:aload_2         
	//   68  145:aload           4
	//   69  147:aconst_null     
	//   70  148:fload           7
	//   71  150:aload_3         
	//   72  151:invokestatic    #91  <Method ValueAnimator loadAnimator(Context, Resources, android.content.res.Resources$Theme, AttributeSet, ValueAnimator, float, XmlPullParser)>
	//   73  154:astore          10
							k = 0;
	//   74  156:iconst_0        
	//   75  157:istore          8
						} else
	//*  76  159:goto            85
						if(((String) (obj)).equals("set"))
	//*  77  162:aload           10
	//*  78  164:ldc1            #93  <String "set">
	//*  79  166:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  80  169:ifeq            235
						{
							obj = ((Object) (new AnimatorSet()));
	//   81  172:new             #95  <Class AnimatorSet>
	//   82  175:dup             
	//   83  176:invokespecial   #96  <Method void AnimatorSet()>
	//   84  179:astore          10
							obj1 = ((Object) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_ANIMATOR_SET)));
	//   85  181:aload_1         
	//   86  182:aload_2         
	//   87  183:aload           4
	//   88  185:getstatic       #102 <Field int[] AndroidResources.STYLEABLE_ANIMATOR_SET>
	//   89  188:invokestatic    #108 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   90  191:astore          12
							k = TypedArrayUtils.getNamedInt(((TypedArray) (obj1)), xmlpullparser, "ordering", 0, 0);
	//   91  193:aload           12
	//   92  195:aload_3         
	//   93  196:ldc1            #110 <String "ordering">
	//   94  198:iconst_0        
	//   95  199:iconst_0        
	//   96  200:invokestatic    #114 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   97  203:istore          8
							createAnimatorFromXml(context, resources, theme, xmlpullparser, attributeset, (AnimatorSet)obj, k, f);
	//   98  205:aload_0         
	//   99  206:aload_1         
	//  100  207:aload_2         
	//  101  208:aload_3         
	//  102  209:aload           4
	//  103  211:aload           10
	//  104  213:checkcast       #95  <Class AnimatorSet>
	//  105  216:iload           8
	//  106  218:fload           7
	//  107  220:invokestatic    #53  <Method Animator createAnimatorFromXml(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, AttributeSet, AnimatorSet, int, float)>
	//  108  223:pop             
							((TypedArray) (obj1)).recycle();
	//  109  224:aload           12
	//  110  226:invokevirtual   #119 <Method void TypedArray.recycle()>
							k = 0;
	//  111  229:iconst_0        
	//  112  230:istore          8
						} else
	//* 113  232:goto            85
						if(((String) (obj)).equals("propertyValuesHolder"))
	//* 114  235:aload           10
	//* 115  237:ldc1            #121 <String "propertyValuesHolder">
	//* 116  239:invokevirtual   #75  <Method boolean String.equals(Object)>
	//* 117  242:ifeq            296
						{
							obj = ((Object) (loadValues(context, resources, theme, xmlpullparser, Xml.asAttributeSet(xmlpullparser))));
	//  118  245:aload_0         
	//  119  246:aload_1         
	//  120  247:aload_2         
	//  121  248:aload_3         
	//  122  249:aload_3         
	//  123  250:invokestatic    #50  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//  124  253:invokestatic    #125 <Method PropertyValuesHolder[] loadValues(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, AttributeSet)>
	//  125  256:astore          10
							if(obj != null && obj1 != null && (obj1 instanceof ValueAnimator))
	//* 126  258:aload           10
	//* 127  260:ifnull          286
	//* 128  263:aload           12
	//* 129  265:ifnull          286
	//* 130  268:aload           12
	//* 131  270:instanceof      #127 <Class ValueAnimator>
	//* 132  273:ifeq            286
								((ValueAnimator)obj1).setValues(((PropertyValuesHolder []) (obj)));
	//  133  276:aload           12
	//  134  278:checkcast       #127 <Class ValueAnimator>
	//  135  281:aload           10
	//  136  283:invokevirtual   #131 <Method void ValueAnimator.setValues(PropertyValuesHolder[])>
							k = 1;
	//  137  286:iconst_1        
	//  138  287:istore          8
							obj = obj1;
	//  139  289:aload           12
	//  140  291:astore          10
						} else
	//* 141  293:goto            85
						{
							throw new RuntimeException((new StringBuilder()).append("Unknown animator name: ").append(xmlpullparser.getName()).toString());
	//  142  296:new             #133 <Class RuntimeException>
	//  143  299:dup             
	//  144  300:new             #135 <Class StringBuilder>
	//  145  303:dup             
	//  146  304:invokespecial   #136 <Method void StringBuilder()>
	//  147  307:ldc1            #138 <String "Unknown animator name: ">
	//  148  309:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  149  312:aload_3         
	//  150  313:invokeinterface #67  <Method String XmlPullParser.getName()>
	//  151  318:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  152  321:invokevirtual   #145 <Method String StringBuilder.toString()>
	//  153  324:invokespecial   #148 <Method void RuntimeException(String)>
	//  154  327:athrow          
						}
						obj1 = obj;
						if(animatorset != null)
						{
							obj1 = obj;
							if(k == 0)
							{
								if(arraylist == null)
									arraylist = new ArrayList();
								arraylist.add(obj);
								obj1 = obj;
							}
						}
					}
					continue;
				}
				if(animatorset != null && arraylist != null)
	//* 155  328:aload           5
	//* 156  330:ifnull          398
	//* 157  333:aload           11
	//* 158  335:ifnull          398
				{
					context = ((Context) (new Animator[arraylist.size()]));
	//  159  338:aload           11
	//  160  340:invokevirtual   #151 <Method int ArrayList.size()>
	//  161  343:anewarray       Animator[]
	//  162  346:astore_0        
					resources = ((Resources) (arraylist.iterator()));
	//  163  347:aload           11
	//  164  349:invokevirtual   #157 <Method Iterator ArrayList.iterator()>
	//  165  352:astore_1        
					for(int l = 0; ((Iterator) (resources)).hasNext(); l++)
	//* 166  353:iconst_0        
	//* 167  354:istore          8
	//* 168  356:aload_1         
	//* 169  357:invokeinterface #163 <Method boolean Iterator.hasNext()>
	//* 170  362:ifeq            387
						context[l] = ((/*<invalid signature>*/java.lang.Object) ((Animator)((Iterator) (resources)).next()));
	//  171  365:aload_0         
	//  172  366:iload           8
	//  173  368:aload_1         
	//  174  369:invokeinterface #166 <Method Object Iterator.next()>
	//  175  374:checkcast       #153 <Class Animator>
	//  176  377:aastore         

	//  177  378:iload           8
	//  178  380:iconst_1        
	//  179  381:iadd            
	//  180  382:istore          8
	//* 181  384:goto            356
					if(i != 0)
						break label0;
	//  182  387:iload           6
	//  183  389:ifne            401
					animatorset.playTogether(((Animator []) (context)));
	//  184  392:aload           5
	//  185  394:aload_0         
	//  186  395:invokevirtual   #170 <Method void AnimatorSet.playTogether(Animator[])>
				}
				return ((Animator) (obj1));
	//  187  398:aload           12
	//  188  400:areturn         
			}
			animatorset.playSequentially(((Animator []) (context)));
	//  189  401:aload           5
	//  190  403:aload_0         
	//  191  404:invokevirtual   #173 <Method void AnimatorSet.playSequentially(Animator[])>
			return ((Animator) (obj1));
	//  192  407:aload           12
	//  193  409:areturn         
		} while(true);
	//  194  410:goto            117
	}

	private static Keyframe createNewKeyframe(Keyframe keyframe, float f)
	{
		if(keyframe.getType() == Float.TYPE)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #181 <Method Class Keyframe.getType()>
	//*   2    4:getstatic       #187 <Field Class Float.TYPE>
	//*   3    7:if_acmpne       15
			return Keyframe.ofFloat(f);
	//    4   10:fload_1         
	//    5   11:invokestatic    #191 <Method Keyframe Keyframe.ofFloat(float)>
	//    6   14:areturn         
		if(keyframe.getType() == Integer.TYPE)
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #181 <Method Class Keyframe.getType()>
	//*   9   19:getstatic       #194 <Field Class Integer.TYPE>
	//*  10   22:if_acmpne       30
			return Keyframe.ofInt(f);
	//   11   25:fload_1         
	//   12   26:invokestatic    #197 <Method Keyframe Keyframe.ofInt(float)>
	//   13   29:areturn         
		else
			return Keyframe.ofObject(f);
	//   14   30:fload_1         
	//   15   31:invokestatic    #200 <Method Keyframe Keyframe.ofObject(float)>
	//   16   34:areturn         
	}

	private static void distributeKeyframes(Keyframe akeyframe[], float f, int i, int j)
	{
		f /= (j - i) + 2;
	//    0    0:fload_1         
	//    1    1:iload_3         
	//    2    2:iload_2         
	//    3    3:isub            
	//    4    4:iconst_2        
	//    5    5:iadd            
	//    6    6:i2f             
	//    7    7:fdiv            
	//    8    8:fstore_1        
		for(; i <= j; i++)
	//*   9    9:iload_2         
	//*  10   10:iload_3         
	//*  11   11:icmpgt          37
			akeyframe[i].setFraction(akeyframe[i - 1].getFraction() + f);
	//   12   14:aload_0         
	//   13   15:iload_2         
	//   14   16:aaload          
	//   15   17:aload_0         
	//   16   18:iload_2         
	//   17   19:iconst_1        
	//   18   20:isub            
	//   19   21:aaload          
	//   20   22:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//   21   25:fload_1         
	//   22   26:fadd            
	//   23   27:invokevirtual   #210 <Method void Keyframe.setFraction(float)>

	//   24   30:iload_2         
	//   25   31:iconst_1        
	//   26   32:iadd            
	//   27   33:istore_2        
	//*  28   34:goto            9
	//   29   37:return          
	}

	private static void dumpKeyframes(Object aobj[], String s)
	{
		if(aobj != null && aobj.length != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            10
	//*   5    9:return          
		{
			Log.d("AnimatorInflater", s);
	//    6   10:ldc1            #23  <String "AnimatorInflater">
	//    7   12:aload_1         
	//    8   13:invokestatic    #218 <Method int Log.d(String, String)>
	//    9   16:pop             
			int j = aobj.length;
	//   10   17:aload_0         
	//   11   18:arraylength     
	//   12   19:istore_3        
			int i = 0;
	//   13   20:iconst_0        
	//   14   21:istore_2        
			while(i < j) 
	//*  15   22:iload_2         
	//*  16   23:iload_3         
	//*  17   24:icmpge          9
			{
				Keyframe keyframe = (Keyframe)aobj[i];
	//   18   27:aload_0         
	//   19   28:iload_2         
	//   20   29:aaload          
	//   21   30:checkcast       #177 <Class Keyframe>
	//   22   33:astore          4
				StringBuilder stringbuilder = (new StringBuilder()).append("Keyframe ").append(i).append(": fraction ");
	//   23   35:new             #135 <Class StringBuilder>
	//   24   38:dup             
	//   25   39:invokespecial   #136 <Method void StringBuilder()>
	//   26   42:ldc1            #220 <String "Keyframe ">
	//   27   44:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   28   47:iload_2         
	//   29   48:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   30   51:ldc1            #225 <String ": fraction ">
	//   31   53:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   32   56:astore          5
				if(keyframe.getFraction() < 0.0F)
	//*  33   58:aload           4
	//*  34   60:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//*  35   63:fconst_0        
	//*  36   64:fcmpg           
	//*  37   65:ifge            125
					s = "null";
	//   38   68:ldc1            #227 <String "null">
	//   39   70:astore_1        
				else
	//*  40   71:aload           5
	//*  41   73:aload_1         
	//*  42   74:invokevirtual   #230 <Method StringBuilder StringBuilder.append(Object)>
	//*  43   77:ldc1            #232 <String ", ">
	//*  44   79:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//*  45   82:ldc1            #234 <String ", value : ">
	//*  46   84:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//*  47   87:astore          5
	//*  48   89:aload           4
	//*  49   91:invokevirtual   #237 <Method boolean Keyframe.hasValue()>
	//*  50   94:ifeq            137
	//*  51   97:aload           4
	//*  52   99:invokevirtual   #240 <Method Object Keyframe.getValue()>
	//*  53  102:astore_1        
	//*  54  103:ldc1            #23  <String "AnimatorInflater">
	//*  55  105:aload           5
	//*  56  107:aload_1         
	//*  57  108:invokevirtual   #230 <Method StringBuilder StringBuilder.append(Object)>
	//*  58  111:invokevirtual   #145 <Method String StringBuilder.toString()>
	//*  59  114:invokestatic    #218 <Method int Log.d(String, String)>
	//*  60  117:pop             
	//*  61  118:iload_2         
	//*  62  119:iconst_1        
	//*  63  120:iadd            
	//*  64  121:istore_2        
	//*  65  122:goto            22
					s = ((String) (Float.valueOf(keyframe.getFraction())));
	//   66  125:aload           4
	//   67  127:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//   68  130:invokestatic    #244 <Method Float Float.valueOf(float)>
	//   69  133:astore_1        
				stringbuilder = stringbuilder.append(((Object) (s))).append(", ").append(", value : ");
				if(keyframe.hasValue())
					s = ((String) (keyframe.getValue()));
				else
	//*  70  134:goto            71
					s = "null";
	//   71  137:ldc1            #227 <String "null">
	//   72  139:astore_1        
				Log.d("AnimatorInflater", stringbuilder.append(((Object) (s))).toString());
				i++;
			}
		}
	//*  73  140:goto            103
	}

	private static PropertyValuesHolder getPVH(TypedArray typedarray, int i, int j, int k, String s)
	{
		int l;
		boolean flag;
		boolean flag1;
		int i1;
		int j1;
		android.support.v4.graphics.PathParser.PathDataNode apathdatanode[];
		android.support.v4.graphics.PathParser.PathDataNode apathdatanode1[];
		PathDataEvaluator pathdataevaluator;
		Object obj = ((Object) (typedarray.peekValue(j)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #250 <Method TypedValue TypedArray.peekValue(int)>
	//    3    5:astore          12
		if(obj != null)
	//*   4    7:aload           12
	//*   5    9:ifnull          209
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore          8
		else
	//*   8   15:iload           8
	//*   9   17:ifeq            215
	//*  10   20:aload           12
	//*  11   22:getfield        #255 <Field int TypedValue.type>
	//*  12   25:istore          10
	//*  13   27:aload_0         
	//*  14   28:iload_3         
	//*  15   29:invokevirtual   #250 <Method TypedValue TypedArray.peekValue(int)>
	//*  16   32:astore          12
	//*  17   34:aload           12
	//*  18   36:ifnull          221
	//*  19   39:iconst_1        
	//*  20   40:istore          9
	//*  21   42:iload           9
	//*  22   44:ifeq            227
	//*  23   47:aload           12
	//*  24   49:getfield        #255 <Field int TypedValue.type>
	//*  25   52:istore          11
	//*  26   54:iload_1         
	//*  27   55:istore          7
	//*  28   57:iload_1         
	//*  29   58:iconst_4        
	//*  30   59:icmpne          91
	//*  31   62:iload           8
	//*  32   64:ifeq            75
	//*  33   67:iload           10
	//*  34   69:invokestatic    #259 <Method boolean isColorType(int)>
	//*  35   72:ifne            88
	//*  36   75:iload           9
	//*  37   77:ifeq            233
	//*  38   80:iload           11
	//*  39   82:invokestatic    #259 <Method boolean isColorType(int)>
	//*  40   85:ifeq            233
	//*  41   88:iconst_3        
	//*  42   89:istore          7
	//*  43   91:iload           7
	//*  44   93:ifne            239
	//*  45   96:iconst_1        
	//*  46   97:istore_1        
	//*  47   98:iload           7
	//*  48  100:iconst_2        
	//*  49  101:icmpne          315
	//*  50  104:aload_0         
	//*  51  105:iload_2         
	//*  52  106:invokevirtual   #263 <Method String TypedArray.getString(int)>
	//*  53  109:astore          12
	//*  54  111:aload_0         
	//*  55  112:iload_3         
	//*  56  113:invokevirtual   #263 <Method String TypedArray.getString(int)>
	//*  57  116:astore_0        
	//*  58  117:aload           12
	//*  59  119:invokestatic    #269 <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.createNodesFromPathData(String)>
	//*  60  122:astore          13
	//*  61  124:aload_0         
	//*  62  125:invokestatic    #269 <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.createNodesFromPathData(String)>
	//*  63  128:astore          14
	//*  64  130:aload           13
	//*  65  132:ifnonnull       140
	//*  66  135:aload           14
	//*  67  137:ifnull          692
	//*  68  140:aload           13
	//*  69  142:ifnull          287
	//*  70  145:new             #8   <Class AnimatorInflaterCompat$PathDataEvaluator>
	//*  71  148:dup             
	//*  72  149:aconst_null     
	//*  73  150:invokespecial   #272 <Method void AnimatorInflaterCompat$PathDataEvaluator(AnimatorInflaterCompat$1)>
	//*  74  153:astore          15
	//*  75  155:aload           14
	//*  76  157:ifnull          270
	//*  77  160:aload           13
	//*  78  162:aload           14
	//*  79  164:invokestatic    #276 <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
	//*  80  167:ifne            244
	//*  81  170:new             #278 <Class InflateException>
	//*  82  173:dup             
	//*  83  174:new             #135 <Class StringBuilder>
	//*  84  177:dup             
	//*  85  178:invokespecial   #136 <Method void StringBuilder()>
	//*  86  181:ldc2            #280 <String " Can't morph from ">
	//*  87  184:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//*  88  187:aload           12
	//*  89  189:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//*  90  192:ldc2            #282 <String " to ">
	//*  91  195:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//*  92  198:aload_0         
	//*  93  199:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//*  94  202:invokevirtual   #145 <Method String StringBuilder.toString()>
	//*  95  205:invokespecial   #283 <Method void InflateException(String)>
	//*  96  208:athrow          
			flag = false;
	//   97  209:iconst_0        
	//   98  210:istore          8
		if(flag)
			i1 = ((TypedValue) (obj)).type;
		else
	//*  99  212:goto            15
			i1 = 0;
	//  100  215:iconst_0        
	//  101  216:istore          10
		obj = ((Object) (typedarray.peekValue(k)));
		if(obj != null)
			flag1 = true;
		else
	//* 102  218:goto            27
			flag1 = false;
	//  103  221:iconst_0        
	//  104  222:istore          9
		if(flag1)
			j1 = ((TypedValue) (obj)).type;
		else
	//* 105  224:goto            42
			j1 = 0;
	//  106  227:iconst_0        
	//  107  228:istore          11
		l = i;
		if(i == 4)
			if(flag && isColorType(i1) || flag1 && isColorType(j1))
				l = 3;
			else
	//* 108  230:goto            54
				l = 0;
	//  109  233:iconst_0        
	//  110  234:istore          7
		if(l == 0)
			i = 1;
		else
	//* 111  236:goto            91
			i = 0;
	//  112  239:iconst_0        
	//  113  240:istore_1        
		if(l != 2) goto _L2; else goto _L1
_L1:
		obj = ((Object) (typedarray.getString(j)));
		typedarray = ((TypedArray) (typedarray.getString(k)));
		apathdatanode = PathParser.createNodesFromPathData(((String) (obj)));
		apathdatanode1 = PathParser.createNodesFromPathData(((String) (typedarray)));
		if(apathdatanode == null && apathdatanode1 == null)
			break MISSING_BLOCK_LABEL_692;
		if(apathdatanode == null) goto _L4; else goto _L3
_L3:
		pathdataevaluator = new PathDataEvaluator();
		if(apathdatanode1 == null) goto _L6; else goto _L5
_L5:
		if(!PathParser.canMorph(apathdatanode, apathdatanode1))
			throw new InflateException((new StringBuilder()).append(" Can't morph from ").append(((String) (obj))).append(" to ").append(((String) (typedarray))).toString());
	//* 114  241:goto            98
		s = ((String) (PropertyValuesHolder.ofObject(s, ((TypeEvaluator) (pathdataevaluator)), new Object[] {
			apathdatanode, apathdatanode1
		})));
	//  115  244:aload           4
	//  116  246:aload           15
	//  117  248:iconst_2        
	//  118  249:anewarray       Object[]
	//  119  252:dup             
	//  120  253:iconst_0        
	//  121  254:aload           13
	//  122  256:aastore         
	//  123  257:dup             
	//  124  258:iconst_1        
	//  125  259:aload           14
	//  126  261:aastore         
	//  127  262:invokestatic    #288 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(String, TypeEvaluator, Object[])>
	//  128  265:astore          4
_L8:
		return ((PropertyValuesHolder) (s));
	//  129  267:aload           4
	//  130  269:areturn         
_L6:
		return PropertyValuesHolder.ofObject(s, ((TypeEvaluator) (pathdataevaluator)), new Object[] {
			apathdatanode
		});
	//  131  270:aload           4
	//  132  272:aload           15
	//  133  274:iconst_1        
	//  134  275:anewarray       Object[]
	//  135  278:dup             
	//  136  279:iconst_0        
	//  137  280:aload           13
	//  138  282:aastore         
	//  139  283:invokestatic    #288 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(String, TypeEvaluator, Object[])>
	//  140  286:areturn         
_L4:
		if(apathdatanode1 != null)
	//* 141  287:aload           14
	//* 142  289:ifnull          692
			return PropertyValuesHolder.ofObject(s, ((TypeEvaluator) (new PathDataEvaluator())), new Object[] {
				apathdatanode1
			});
	//  143  292:aload           4
	//  144  294:new             #8   <Class AnimatorInflaterCompat$PathDataEvaluator>
	//  145  297:dup             
	//  146  298:aconst_null     
	//  147  299:invokespecial   #272 <Method void AnimatorInflaterCompat$PathDataEvaluator(AnimatorInflaterCompat$1)>
	//  148  302:iconst_1        
	//  149  303:anewarray       Object[]
	//  150  306:dup             
	//  151  307:iconst_0        
	//  152  308:aload           14
	//  153  310:aastore         
	//  154  311:invokestatic    #288 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(String, TypeEvaluator, Object[])>
	//  155  314:areturn         
		break MISSING_BLOCK_LABEL_692;
_L2:
		ArgbEvaluator argbevaluator = null;
	//  156  315:aconst_null     
	//  157  316:astore          12
		if(l == 3)
	//* 158  318:iload           7
	//* 159  320:iconst_3        
	//* 160  321:icmpne          329
			argbevaluator = ArgbEvaluator.getInstance();
	//  161  324:invokestatic    #294 <Method ArgbEvaluator ArgbEvaluator.getInstance()>
	//  162  327:astore          12
		if(i != 0)
	//* 163  329:iload_1         
	//* 164  330:ifeq            494
		{
			if(flag)
	//* 165  333:iload           8
	//* 166  335:ifeq            452
			{
				float f;
				if(i1 == 5)
	//* 167  338:iload           10
	//* 168  340:iconst_5        
	//* 169  341:icmpne          413
					f = typedarray.getDimension(j, 0.0F);
	//  170  344:aload_0         
	//  171  345:iload_2         
	//  172  346:fconst_0        
	//  173  347:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//  174  350:fstore          5
				else
	//* 175  352:iload           9
	//* 176  354:ifeq            435
	//* 177  357:iload           11
	//* 178  359:iconst_5        
	//* 179  360:icmpne          424
	//* 180  363:aload_0         
	//* 181  364:iload_3         
	//* 182  365:fconst_0        
	//* 183  366:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//* 184  369:fstore          6
	//* 185  371:aload           4
	//* 186  373:iconst_2        
	//* 187  374:newarray        float[]
	//* 188  376:dup             
	//* 189  377:iconst_0        
	//* 190  378:fload           5
	//* 191  380:fastore         
	//* 192  381:dup             
	//* 193  382:iconst_1        
	//* 194  383:fload           6
	//* 195  385:fastore         
	//* 196  386:invokestatic    #301 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//* 197  389:astore_0        
	//* 198  390:aload_0         
	//* 199  391:astore          4
	//* 200  393:aload_0         
	//* 201  394:ifnull          267
	//* 202  397:aload_0         
	//* 203  398:astore          4
	//* 204  400:aload           12
	//* 205  402:ifnull          267
	//* 206  405:aload_0         
	//* 207  406:aload           12
	//* 208  408:invokevirtual   #305 <Method void PropertyValuesHolder.setEvaluator(TypeEvaluator)>
	//* 209  411:aload_0         
	//* 210  412:areturn         
					f = typedarray.getFloat(j, 0.0F);
	//  211  413:aload_0         
	//  212  414:iload_2         
	//  213  415:fconst_0        
	//  214  416:invokevirtual   #308 <Method float TypedArray.getFloat(int, float)>
	//  215  419:fstore          5
				if(flag1)
				{
					float f2;
					if(j1 == 5)
						f2 = typedarray.getDimension(k, 0.0F);
					else
	//* 216  421:goto            352
						f2 = typedarray.getFloat(k, 0.0F);
	//  217  424:aload_0         
	//  218  425:iload_3         
	//  219  426:fconst_0        
	//  220  427:invokevirtual   #308 <Method float TypedArray.getFloat(int, float)>
	//  221  430:fstore          6
					typedarray = ((TypedArray) (PropertyValuesHolder.ofFloat(s, new float[] {
						f, f2
					})));
				} else
	//* 222  432:goto            371
				{
					typedarray = ((TypedArray) (PropertyValuesHolder.ofFloat(s, new float[] {
						f
					})));
	//  223  435:aload           4
	//  224  437:iconst_1        
	//  225  438:newarray        float[]
	//  226  440:dup             
	//  227  441:iconst_0        
	//  228  442:fload           5
	//  229  444:fastore         
	//  230  445:invokestatic    #301 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  231  448:astore_0        
				}
			} else
	//* 232  449:goto            390
			{
				float f1;
				if(j1 == 5)
	//* 233  452:iload           11
	//* 234  454:iconst_5        
	//* 235  455:icmpne          483
					f1 = typedarray.getDimension(k, 0.0F);
	//  236  458:aload_0         
	//  237  459:iload_3         
	//  238  460:fconst_0        
	//  239  461:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//  240  464:fstore          5
				else
	//* 241  466:aload           4
	//* 242  468:iconst_1        
	//* 243  469:newarray        float[]
	//* 244  471:dup             
	//* 245  472:iconst_0        
	//* 246  473:fload           5
	//* 247  475:fastore         
	//* 248  476:invokestatic    #301 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//* 249  479:astore_0        
	//* 250  480:goto            390
					f1 = typedarray.getFloat(k, 0.0F);
	//  251  483:aload_0         
	//  252  484:iload_3         
	//  253  485:fconst_0        
	//  254  486:invokevirtual   #308 <Method float TypedArray.getFloat(int, float)>
	//  255  489:fstore          5
				typedarray = ((TypedArray) (PropertyValuesHolder.ofFloat(s, new float[] {
					f1
				})));
			}
		} else
	//* 256  491:goto            466
		if(flag)
	//* 257  494:iload           8
	//* 258  496:ifeq            624
		{
			if(i1 == 5)
	//* 259  499:iload           10
	//* 260  501:iconst_5        
	//* 261  502:icmpne          552
				i = (int)typedarray.getDimension(j, 0.0F);
	//  262  505:aload_0         
	//  263  506:iload_2         
	//  264  507:fconst_0        
	//  265  508:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//  266  511:f2i             
	//  267  512:istore_1        
			else
	//* 268  513:iload           9
	//* 269  515:ifeq            608
	//* 270  518:iload           11
	//* 271  520:iconst_5        
	//* 272  521:icmpne          580
	//* 273  524:aload_0         
	//* 274  525:iload_3         
	//* 275  526:fconst_0        
	//* 276  527:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//* 277  530:f2i             
	//* 278  531:istore_2        
	//* 279  532:aload           4
	//* 280  534:iconst_2        
	//* 281  535:newarray        int[]
	//* 282  537:dup             
	//* 283  538:iconst_0        
	//* 284  539:iload_1         
	//* 285  540:iastore         
	//* 286  541:dup             
	//* 287  542:iconst_1        
	//* 288  543:iload_2         
	//* 289  544:iastore         
	//* 290  545:invokestatic    #311 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//* 291  548:astore_0        
	//* 292  549:goto            390
			if(isColorType(i1))
	//* 293  552:iload           10
	//* 294  554:invokestatic    #259 <Method boolean isColorType(int)>
	//* 295  557:ifeq            570
				i = typedarray.getColor(j, 0);
	//  296  560:aload_0         
	//  297  561:iload_2         
	//  298  562:iconst_0        
	//  299  563:invokevirtual   #315 <Method int TypedArray.getColor(int, int)>
	//  300  566:istore_1        
			else
	//* 301  567:goto            513
				i = typedarray.getInt(j, 0);
	//  302  570:aload_0         
	//  303  571:iload_2         
	//  304  572:iconst_0        
	//  305  573:invokevirtual   #318 <Method int TypedArray.getInt(int, int)>
	//  306  576:istore_1        
			if(flag1)
			{
				if(j1 == 5)
					j = (int)typedarray.getDimension(k, 0.0F);
				else
	//* 307  577:goto            513
				if(isColorType(j1))
	//* 308  580:iload           11
	//* 309  582:invokestatic    #259 <Method boolean isColorType(int)>
	//* 310  585:ifeq            598
					j = typedarray.getColor(k, 0);
	//  311  588:aload_0         
	//  312  589:iload_3         
	//  313  590:iconst_0        
	//  314  591:invokevirtual   #315 <Method int TypedArray.getColor(int, int)>
	//  315  594:istore_2        
				else
	//* 316  595:goto            532
					j = typedarray.getInt(k, 0);
	//  317  598:aload_0         
	//  318  599:iload_3         
	//  319  600:iconst_0        
	//  320  601:invokevirtual   #318 <Method int TypedArray.getInt(int, int)>
	//  321  604:istore_2        
				typedarray = ((TypedArray) (PropertyValuesHolder.ofInt(s, new int[] {
					i, j
				})));
			} else
	//* 322  605:goto            532
			{
				typedarray = ((TypedArray) (PropertyValuesHolder.ofInt(s, new int[] {
					i
				})));
	//  323  608:aload           4
	//  324  610:iconst_1        
	//  325  611:newarray        int[]
	//  326  613:dup             
	//  327  614:iconst_0        
	//  328  615:iload_1         
	//  329  616:iastore         
	//  330  617:invokestatic    #311 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//  331  620:astore_0        
			}
		} else
	//* 332  621:goto            390
		if(flag1)
	//* 333  624:iload           9
	//* 334  626:ifeq            687
		{
			if(j1 == 5)
	//* 335  629:iload           11
	//* 336  631:iconst_5        
	//* 337  632:icmpne          659
				i = (int)typedarray.getDimension(k, 0.0F);
	//  338  635:aload_0         
	//  339  636:iload_3         
	//  340  637:fconst_0        
	//  341  638:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//  342  641:f2i             
	//  343  642:istore_1        
			else
	//* 344  643:aload           4
	//* 345  645:iconst_1        
	//* 346  646:newarray        int[]
	//* 347  648:dup             
	//* 348  649:iconst_0        
	//* 349  650:iload_1         
	//* 350  651:iastore         
	//* 351  652:invokestatic    #311 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//* 352  655:astore_0        
	//* 353  656:goto            390
			if(isColorType(j1))
	//* 354  659:iload           11
	//* 355  661:invokestatic    #259 <Method boolean isColorType(int)>
	//* 356  664:ifeq            677
				i = typedarray.getColor(k, 0);
	//  357  667:aload_0         
	//  358  668:iload_3         
	//  359  669:iconst_0        
	//  360  670:invokevirtual   #315 <Method int TypedArray.getColor(int, int)>
	//  361  673:istore_1        
			else
	//* 362  674:goto            643
				i = typedarray.getInt(k, 0);
	//  363  677:aload_0         
	//  364  678:iload_3         
	//  365  679:iconst_0        
	//  366  680:invokevirtual   #318 <Method int TypedArray.getInt(int, int)>
	//  367  683:istore_1        
			typedarray = ((TypedArray) (PropertyValuesHolder.ofInt(s, new int[] {
				i
			})));
		} else
	//* 368  684:goto            643
		{
			typedarray = null;
	//  369  687:aconst_null     
	//  370  688:astore_0        
		}
		s = ((String) (typedarray));
		if(typedarray == null) goto _L8; else goto _L7
_L7:
		s = ((String) (typedarray));
		if(argbevaluator == null) goto _L8; else goto _L9
_L9:
		((PropertyValuesHolder) (typedarray)).setEvaluator(((TypeEvaluator) (argbevaluator)));
		return ((PropertyValuesHolder) (typedarray));
	//* 371  689:goto            390
		return null;
	//  372  692:aconst_null     
	//  373  693:areturn         
	}

	private static int inferValueTypeFromValues(TypedArray typedarray, int i, int j)
	{
label0:
		{
			boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
			TypedValue typedvalue = typedarray.peekValue(i);
	//    2    3:aload_0         
	//    3    4:iload_1         
	//    4    5:invokevirtual   #250 <Method TypedValue TypedArray.peekValue(int)>
	//    5    8:astore          6
			int k;
			int l;
			if(typedvalue != null)
	//*   6   10:aload           6
	//*   7   12:ifnull          82
				i = 1;
	//    8   15:iconst_1        
	//    9   16:istore_1        
			else
	//*  10   17:iload_1         
	//*  11   18:ifeq            87
	//*  12   21:aload           6
	//*  13   23:getfield        #255 <Field int TypedValue.type>
	//*  14   26:istore_3        
	//*  15   27:aload_0         
	//*  16   28:iload_2         
	//*  17   29:invokevirtual   #250 <Method TypedValue TypedArray.peekValue(int)>
	//*  18   32:astore_0        
	//*  19   33:aload_0         
	//*  20   34:ifnull          92
	//*  21   37:iconst_1        
	//*  22   38:istore_2        
	//*  23   39:iload_2         
	//*  24   40:ifeq            97
	//*  25   43:aload_0         
	//*  26   44:getfield        #255 <Field int TypedValue.type>
	//*  27   47:istore          4
	//*  28   49:iload_1         
	//*  29   50:ifeq            60
	//*  30   53:iload_3         
	//*  31   54:invokestatic    #259 <Method boolean isColorType(int)>
	//*  32   57:ifne            78
	//*  33   60:iload           5
	//*  34   62:istore_1        
	//*  35   63:iload_2         
	//*  36   64:ifeq            80
	//*  37   67:iload           5
	//*  38   69:istore_1        
	//*  39   70:iload           4
	//*  40   72:invokestatic    #259 <Method boolean isColorType(int)>
	//*  41   75:ifeq            80
	//*  42   78:iconst_3        
	//*  43   79:istore_1        
	//*  44   80:iload_1         
	//*  45   81:ireturn         
				i = 0;
	//   46   82:iconst_0        
	//   47   83:istore_1        
			if(i != 0)
				k = typedvalue.type;
			else
	//*  48   84:goto            17
				k = 0;
	//   49   87:iconst_0        
	//   50   88:istore_3        
			typedarray = ((TypedArray) (typedarray.peekValue(j)));
			if(typedarray != null)
				j = 1;
			else
	//*  51   89:goto            27
				j = 0;
	//   52   92:iconst_0        
	//   53   93:istore_2        
			if(j != 0)
				l = ((TypedValue) (typedarray)).type;
			else
	//*  54   94:goto            39
				l = 0;
	//   55   97:iconst_0        
	//   56   98:istore          4
			if(i == 0 || !isColorType(k))
			{
				i = ((int) (flag));
				if(j == 0)
					break label0;
				i = ((int) (flag));
				if(!isColorType(l))
					break label0;
			}
			i = 3;
		}
		return i;
	//*  57  100:goto            49
	}

	private static int inferValueTypeOfKeyframe(Resources resources, android.content.res.Resources.Theme theme, AttributeSet attributeset, XmlPullParser xmlpullparser)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		resources = ((Resources) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_KEYFRAME)));
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:aload_2         
	//    5    6:getstatic       #325 <Field int[] AndroidResources.STYLEABLE_KEYFRAME>
	//    6    9:invokestatic    #108 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    7   12:astore_0        
		theme = ((android.content.res.Resources.Theme) (TypedArrayUtils.peekNamedValue(((TypedArray) (resources)), xmlpullparser, "value", 0)));
	//    8   13:aload_0         
	//    9   14:aload_3         
	//   10   15:ldc2            #326 <String "value">
	//   11   18:iconst_0        
	//   12   19:invokestatic    #330 <Method TypedValue TypedArrayUtils.peekNamedValue(TypedArray, XmlPullParser, String, int)>
	//   13   22:astore_1        
		boolean flag;
		byte byte0;
		if(theme != null)
	//*  14   23:aload_1         
	//*  15   24:ifnull          63
			flag = true;
	//   16   27:iconst_1        
	//   17   28:istore          4
		else
	//*  18   30:iload           6
	//*  19   32:istore          5
	//*  20   34:iload           4
	//*  21   36:ifeq            56
	//*  22   39:iload           6
	//*  23   41:istore          5
	//*  24   43:aload_1         
	//*  25   44:getfield        #255 <Field int TypedValue.type>
	//*  26   47:invokestatic    #259 <Method boolean isColorType(int)>
	//*  27   50:ifeq            56
	//*  28   53:iconst_3        
	//*  29   54:istore          5
	//*  30   56:aload_0         
	//*  31   57:invokevirtual   #119 <Method void TypedArray.recycle()>
	//*  32   60:iload           5
	//*  33   62:ireturn         
			flag = false;
	//   34   63:iconst_0        
	//   35   64:istore          4
		byte0 = ((byte) (flag1));
		if(flag)
		{
			byte0 = ((byte) (flag1));
			if(isColorType(((TypedValue) (theme)).type))
				byte0 = 3;
		}
		((TypedArray) (resources)).recycle();
		return ((int) (byte0));
	//*  36   66:goto            30
	}

	private static boolean isColorType(int i)
	{
		return i >= 28 && i <= 31;
	//    0    0:iload_0         
	//    1    1:bipush          28
	//    2    3:icmplt          14
	//    3    6:iload_0         
	//    4    7:bipush          31
	//    5    9:icmpgt          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public static Animator loadAnimator(Context context, int i)
		throws android.content.res.Resources.NotFoundException
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #339 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          14
			return AnimatorInflater.loadAnimator(context, i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokestatic    #343 <Method Animator AnimatorInflater.loadAnimator(Context, int)>
	//    6   13:areturn         
		else
			return loadAnimator(context, context.getResources(), context.getTheme(), i);
	//    7   14:aload_0         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #349 <Method Resources Context.getResources()>
	//   10   19:aload_0         
	//   11   20:invokevirtual   #353 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   12   23:iload_1         
	//   13   24:invokestatic    #356 <Method Animator loadAnimator(Context, Resources, android.content.res.Resources$Theme, int)>
	//   14   27:areturn         
	}

	public static Animator loadAnimator(Context context, Resources resources, android.content.res.Resources.Theme theme, int i)
		throws android.content.res.Resources.NotFoundException
	{
		return loadAnimator(context, resources, theme, i, 1.0F);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:fconst_1        
	//    5    5:invokestatic    #360 <Method Animator loadAnimator(Context, Resources, android.content.res.Resources$Theme, int, float)>
	//    6    8:areturn         
	}

	public static Animator loadAnimator(Context context, Resources resources, android.content.res.Resources.Theme theme, int i, float f)
		throws android.content.res.Resources.NotFoundException
	{
		XmlResourceParser xmlresourceparser;
		XmlResourceParser xmlresourceparser1;
		XmlResourceParser xmlresourceparser2;
		xmlresourceparser = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		xmlresourceparser2 = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		xmlresourceparser1 = null;
	//    4    6:aconst_null     
	//    5    7:astore          6
		XmlResourceParser xmlresourceparser3 = resources.getAnimation(i);
	//    6    9:aload_1         
	//    7   10:iload_3         
	//    8   11:invokevirtual   #366 <Method XmlResourceParser Resources.getAnimation(int)>
	//    9   14:astore          8
		xmlresourceparser1 = xmlresourceparser3;
	//   10   16:aload           8
	//   11   18:astore          6
		xmlresourceparser = xmlresourceparser3;
	//   12   20:aload           8
	//   13   22:astore          5
		xmlresourceparser2 = xmlresourceparser3;
	//   14   24:aload           8
	//   15   26:astore          7
		context = ((Context) (createAnimatorFromXml(context, resources, theme, ((XmlPullParser) (xmlresourceparser3)), f)));
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:aload           8
	//   20   33:fload           4
	//   21   35:invokestatic    #368 <Method Animator createAnimatorFromXml(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, float)>
	//   22   38:astore_0        
		if(xmlresourceparser3 != null)
	//*  23   39:aload           8
	//*  24   41:ifnull          51
			xmlresourceparser3.close();
	//   25   44:aload           8
	//   26   46:invokeinterface #373 <Method void XmlResourceParser.close()>
		return ((Animator) (context));
	//   27   51:aload_0         
	//   28   52:areturn         
		context;
	//   29   53:astore_0        
		xmlresourceparser = xmlresourceparser1;
	//   30   54:aload           6
	//   31   56:astore          5
		resources = ((Resources) (new android.content.res.Resources.NotFoundException((new StringBuilder()).append("Can't load animation resource ID #0x").append(Integer.toHexString(i)).toString())));
	//   32   58:new             #333 <Class android.content.res.Resources$NotFoundException>
	//   33   61:dup             
	//   34   62:new             #135 <Class StringBuilder>
	//   35   65:dup             
	//   36   66:invokespecial   #136 <Method void StringBuilder()>
	//   37   69:ldc2            #375 <String "Can't load animation resource ID #0x">
	//   38   72:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   39   75:iload_3         
	//   40   76:invokestatic    #378 <Method String Integer.toHexString(int)>
	//   41   79:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   42   82:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   43   85:invokespecial   #379 <Method void android.content.res.Resources$NotFoundException(String)>
	//   44   88:astore_1        
		xmlresourceparser = xmlresourceparser1;
	//   45   89:aload           6
	//   46   91:astore          5
		((android.content.res.Resources.NotFoundException) (resources)).initCause(((Throwable) (context)));
	//   47   93:aload_1         
	//   48   94:aload_0         
	//   49   95:invokevirtual   #383 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
	//   50   98:pop             
		xmlresourceparser = xmlresourceparser1;
	//   51   99:aload           6
	//   52  101:astore          5
		throw resources;
	//   53  103:aload_1         
	//   54  104:athrow          
		context;
	//   55  105:astore_0        
		if(xmlresourceparser != null)
	//*  56  106:aload           5
	//*  57  108:ifnull          118
			xmlresourceparser.close();
	//   58  111:aload           5
	//   59  113:invokeinterface #373 <Method void XmlResourceParser.close()>
		throw context;
	//   60  118:aload_0         
	//   61  119:athrow          
		context;
	//   62  120:astore_0        
		xmlresourceparser = xmlresourceparser2;
	//   63  121:aload           7
	//   64  123:astore          5
		resources = ((Resources) (new android.content.res.Resources.NotFoundException((new StringBuilder()).append("Can't load animation resource ID #0x").append(Integer.toHexString(i)).toString())));
	//   65  125:new             #333 <Class android.content.res.Resources$NotFoundException>
	//   66  128:dup             
	//   67  129:new             #135 <Class StringBuilder>
	//   68  132:dup             
	//   69  133:invokespecial   #136 <Method void StringBuilder()>
	//   70  136:ldc2            #375 <String "Can't load animation resource ID #0x">
	//   71  139:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   72  142:iload_3         
	//   73  143:invokestatic    #378 <Method String Integer.toHexString(int)>
	//   74  146:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   75  149:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   76  152:invokespecial   #379 <Method void android.content.res.Resources$NotFoundException(String)>
	//   77  155:astore_1        
		xmlresourceparser = xmlresourceparser2;
	//   78  156:aload           7
	//   79  158:astore          5
		((android.content.res.Resources.NotFoundException) (resources)).initCause(((Throwable) (context)));
	//   80  160:aload_1         
	//   81  161:aload_0         
	//   82  162:invokevirtual   #383 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
	//   83  165:pop             
		xmlresourceparser = xmlresourceparser2;
	//   84  166:aload           7
	//   85  168:astore          5
		throw resources;
	//   86  170:aload_1         
	//   87  171:athrow          
	}

	private static ValueAnimator loadAnimator(Context context, Resources resources, android.content.res.Resources.Theme theme, AttributeSet attributeset, ValueAnimator valueanimator, float f, XmlPullParser xmlpullparser)
		throws android.content.res.Resources.NotFoundException
	{
		TypedArray typedarray = TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_ANIMATOR);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:getstatic       #386 <Field int[] AndroidResources.STYLEABLE_ANIMATOR>
	//    4    6:invokestatic    #108 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore          8
		theme = ((android.content.res.Resources.Theme) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_PROPERTY_ANIMATOR)));
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:aload_3         
	//    9   14:getstatic       #389 <Field int[] AndroidResources.STYLEABLE_PROPERTY_ANIMATOR>
	//   10   17:invokestatic    #108 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   11   20:astore_2        
		resources = ((Resources) (valueanimator));
	//   12   21:aload           4
	//   13   23:astore_1        
		if(valueanimator == null)
	//*  14   24:aload           4
	//*  15   26:ifnonnull       37
			resources = ((Resources) (new ValueAnimator()));
	//   16   29:new             #127 <Class ValueAnimator>
	//   17   32:dup             
	//   18   33:invokespecial   #390 <Method void ValueAnimator()>
	//   19   36:astore_1        
		parseAnimatorFromTypeArray(((ValueAnimator) (resources)), typedarray, ((TypedArray) (theme)), f, xmlpullparser);
	//   20   37:aload_1         
	//   21   38:aload           8
	//   22   40:aload_2         
	//   23   41:fload           5
	//   24   43:aload           6
	//   25   45:invokestatic    #394 <Method void parseAnimatorFromTypeArray(ValueAnimator, TypedArray, TypedArray, float, XmlPullParser)>
		int i = TypedArrayUtils.getNamedResourceId(typedarray, xmlpullparser, "interpolator", 0, 0);
	//   26   48:aload           8
	//   27   50:aload           6
	//   28   52:ldc2            #396 <String "interpolator">
	//   29   55:iconst_0        
	//   30   56:iconst_0        
	//   31   57:invokestatic    #399 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   32   60:istore          7
		if(i > 0)
	//*  33   62:iload           7
	//*  34   64:ifle            77
			((ValueAnimator) (resources)).setInterpolator(((android.animation.TimeInterpolator) (AnimationUtilsCompat.loadInterpolator(context, i))));
	//   35   67:aload_1         
	//   36   68:aload_0         
	//   37   69:iload           7
	//   38   71:invokestatic    #405 <Method android.view.animation.Interpolator AnimationUtilsCompat.loadInterpolator(Context, int)>
	//   39   74:invokevirtual   #409 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
		typedarray.recycle();
	//   40   77:aload           8
	//   41   79:invokevirtual   #119 <Method void TypedArray.recycle()>
		if(theme != null)
	//*  42   82:aload_2         
	//*  43   83:ifnull          90
			((TypedArray) (theme)).recycle();
	//   44   86:aload_2         
	//   45   87:invokevirtual   #119 <Method void TypedArray.recycle()>
		return ((ValueAnimator) (resources));
	//   46   90:aload_1         
	//   47   91:areturn         
	}

	private static Keyframe loadKeyframe(Context context, Resources resources, android.content.res.Resources.Theme theme, AttributeSet attributeset, int i, XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
		float f;
		int j;
		attributeset = ((AttributeSet) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_KEYFRAME)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:getstatic       #325 <Field int[] AndroidResources.STYLEABLE_KEYFRAME>
	//    4    6:invokestatic    #108 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore_3        
		theme = null;
	//    6   10:aconst_null     
	//    7   11:astore_2        
		f = TypedArrayUtils.getNamedFloat(((TypedArray) (attributeset)), xmlpullparser, "fraction", 3, -1F);
	//    8   12:aload_3         
	//    9   13:aload           5
	//   10   15:ldc2            #413 <String "fraction">
	//   11   18:iconst_3        
	//   12   19:ldc2            #414 <Float -1F>
	//   13   22:invokestatic    #418 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   14   25:fstore          6
		resources = ((Resources) (TypedArrayUtils.peekNamedValue(((TypedArray) (attributeset)), xmlpullparser, "value", 0)));
	//   15   27:aload_3         
	//   16   28:aload           5
	//   17   30:ldc2            #326 <String "value">
	//   18   33:iconst_0        
	//   19   34:invokestatic    #330 <Method TypedValue TypedArrayUtils.peekNamedValue(TypedArray, XmlPullParser, String, int)>
	//   20   37:astore_1        
		boolean flag;
		if(resources != null)
	//*  21   38:aload_1         
	//*  22   39:ifnull          148
			flag = true;
	//   23   42:iconst_1        
	//   24   43:istore          8
		else
	//*  25   45:iload           4
	//*  26   47:istore          7
	//*  27   49:iload           4
	//*  28   51:iconst_4        
	//*  29   52:icmpne          73
	//*  30   55:iload           8
	//*  31   57:ifeq            154
	//*  32   60:aload_1         
	//*  33   61:getfield        #255 <Field int TypedValue.type>
	//*  34   64:invokestatic    #259 <Method boolean isColorType(int)>
	//*  35   67:ifeq            154
	//*  36   70:iconst_3        
	//*  37   71:istore          7
	//*  38   73:iload           8
	//*  39   75:ifeq            200
	//*  40   78:aload_2         
	//*  41   79:astore_1        
	//*  42   80:iload           7
	//*  43   82:tableswitch     0 3: default 112
	//	               0 160
	//	               1 180
	//	               2 114
	//	               3 180
	//*  44  112:aload_2         
	//*  45  113:astore_1        
	//*  46  114:aload_3         
	//*  47  115:aload           5
	//*  48  117:ldc2            #396 <String "interpolator">
	//*  49  120:iconst_1        
	//*  50  121:iconst_0        
	//*  51  122:invokestatic    #399 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//*  52  125:istore          4
	//*  53  127:iload           4
	//*  54  129:ifle            142
	//*  55  132:aload_1         
	//*  56  133:aload_0         
	//*  57  134:iload           4
	//*  58  136:invokestatic    #405 <Method android.view.animation.Interpolator AnimationUtilsCompat.loadInterpolator(Context, int)>
	//*  59  139:invokevirtual   #419 <Method void Keyframe.setInterpolator(android.animation.TimeInterpolator)>
	//*  60  142:aload_3         
	//*  61  143:invokevirtual   #119 <Method void TypedArray.recycle()>
	//*  62  146:aload_1         
	//*  63  147:areturn         
			flag = false;
	//   64  148:iconst_0        
	//   65  149:istore          8
		j = i;
		if(i == 4)
			if(flag && isColorType(((TypedValue) (resources)).type))
				j = 3;
			else
	//*  66  151:goto            45
				j = 0;
	//   67  154:iconst_0        
	//   68  155:istore          7
		if(!flag) goto _L2; else goto _L1
_L1:
		resources = ((Resources) (theme));
		j;
		JVM INSTR tableswitch 0 3: default 112
	//	               0 160
	//	               1 180
	//	               2 114
	//	               3 180;
		   goto _L3 _L4 _L5 _L6 _L5
_L6:
		break; /* Loop/switch isn't completed */
_L3:
		resources = ((Resources) (theme));
_L8:
		i = TypedArrayUtils.getNamedResourceId(((TypedArray) (attributeset)), xmlpullparser, "interpolator", 1, 0);
		if(i > 0)
			((Keyframe) (resources)).setInterpolator(((android.animation.TimeInterpolator) (AnimationUtilsCompat.loadInterpolator(context, i))));
		((TypedArray) (attributeset)).recycle();
		return ((Keyframe) (resources));
	//*  69  157:goto            73
_L4:
		resources = ((Resources) (Keyframe.ofFloat(f, TypedArrayUtils.getNamedFloat(((TypedArray) (attributeset)), xmlpullparser, "value", 0, 0.0F))));
	//   70  160:fload           6
	//   71  162:aload_3         
	//   72  163:aload           5
	//   73  165:ldc2            #326 <String "value">
	//   74  168:iconst_0        
	//   75  169:fconst_0        
	//   76  170:invokestatic    #418 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   77  173:invokestatic    #422 <Method Keyframe Keyframe.ofFloat(float, float)>
	//   78  176:astore_1        
		continue; /* Loop/switch isn't completed */
	//   79  177:goto            114
_L5:
		resources = ((Resources) (Keyframe.ofInt(f, TypedArrayUtils.getNamedInt(((TypedArray) (attributeset)), xmlpullparser, "value", 0, 0))));
	//   80  180:fload           6
	//   81  182:aload_3         
	//   82  183:aload           5
	//   83  185:ldc2            #326 <String "value">
	//   84  188:iconst_0        
	//   85  189:iconst_0        
	//   86  190:invokestatic    #114 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   87  193:invokestatic    #425 <Method Keyframe Keyframe.ofInt(float, int)>
	//   88  196:astore_1        
		continue; /* Loop/switch isn't completed */
	//   89  197:goto            114
_L2:
		if(j == 0)
	//*  90  200:iload           7
	//*  91  202:ifne            214
			resources = ((Resources) (Keyframe.ofFloat(f)));
	//   92  205:fload           6
	//   93  207:invokestatic    #191 <Method Keyframe Keyframe.ofFloat(float)>
	//   94  210:astore_1        
		else
	//*  95  211:goto            114
			resources = ((Resources) (Keyframe.ofInt(f)));
	//   96  214:fload           6
	//   97  216:invokestatic    #197 <Method Keyframe Keyframe.ofInt(float)>
	//   98  219:astore_1        
		if(true) goto _L8; else goto _L7
	//   99  220:goto            114
_L7:
	}

	private static ObjectAnimator loadObjectAnimator(Context context, Resources resources, android.content.res.Resources.Theme theme, AttributeSet attributeset, float f, XmlPullParser xmlpullparser)
		throws android.content.res.Resources.NotFoundException
	{
		ObjectAnimator objectanimator = new ObjectAnimator();
	//    0    0:new             #427 <Class ObjectAnimator>
	//    1    3:dup             
	//    2    4:invokespecial   #428 <Method void ObjectAnimator()>
	//    3    7:astore          6
		loadAnimator(context, resources, theme, attributeset, ((ValueAnimator) (objectanimator)), f, xmlpullparser);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:aload           6
	//    9   15:fload           4
	//   10   17:aload           5
	//   11   19:invokestatic    #91  <Method ValueAnimator loadAnimator(Context, Resources, android.content.res.Resources$Theme, AttributeSet, ValueAnimator, float, XmlPullParser)>
	//   12   22:pop             
		return objectanimator;
	//   13   23:aload           6
	//   14   25:areturn         
	}

	private static PropertyValuesHolder loadPvh(Context context, Resources resources, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser, String s, int i)
		throws XmlPullParserException, IOException
	{
		int j;
		ArrayList arraylist;
		arraylist = null;
	//    0    0:aconst_null     
	//    1    1:astore          11
		j = i;
	//    2    3:iload           5
	//    3    5:istore          7
_L3:
		i = xmlpullparser.next();
	//    4    7:aload_3         
	//    5    8:invokeinterface #63  <Method int XmlPullParser.next()>
	//    6   13:istore          5
		if(i == 3 || i == 1) goto _L2; else goto _L1
	//    7   15:iload           5
	//    8   17:iconst_3        
	//    9   18:icmpeq          120
	//   10   21:iload           5
	//   11   23:iconst_1        
	//   12   24:icmpeq          120
_L1:
		float f;
		int k;
		int l;
		int i1;
		if(xmlpullparser.getName().equals("keyframe"))
	//*  13   27:aload_3         
	//*  14   28:invokeinterface #67  <Method String XmlPullParser.getName()>
	//*  15   33:ldc2            #432 <String "keyframe">
	//*  16   36:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  17   39:ifeq            442
		{
			i = j;
	//   18   42:iload           7
	//   19   44:istore          5
			if(j == 4)
	//*  20   46:iload           7
	//*  21   48:iconst_4        
	//*  22   49:icmpne          64
				i = inferValueTypeOfKeyframe(resources, theme, Xml.asAttributeSet(xmlpullparser), xmlpullparser);
	//   23   52:aload_1         
	//   24   53:aload_2         
	//   25   54:aload_3         
	//   26   55:invokestatic    #50  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   27   58:aload_3         
	//   28   59:invokestatic    #434 <Method int inferValueTypeOfKeyframe(Resources, android.content.res.Resources$Theme, AttributeSet, XmlPullParser)>
	//   29   62:istore          5
			Keyframe keyframe = loadKeyframe(context, resources, theme, Xml.asAttributeSet(xmlpullparser), i, xmlpullparser);
	//   30   64:aload_0         
	//   31   65:aload_1         
	//   32   66:aload_2         
	//   33   67:aload_3         
	//   34   68:invokestatic    #50  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   35   71:iload           5
	//   36   73:aload_3         
	//   37   74:invokestatic    #436 <Method Keyframe loadKeyframe(Context, Resources, android.content.res.Resources$Theme, AttributeSet, int, XmlPullParser)>
	//   38   77:astore          12
			if(keyframe != null)
	//*  39   79:aload           12
	//*  40   81:ifnull          439
			{
				if(arraylist == null)
	//*  41   84:aload           11
	//*  42   86:ifnonnull       436
					arraylist = new ArrayList();
	//   43   89:new             #81  <Class ArrayList>
	//   44   92:dup             
	//   45   93:invokespecial   #82  <Method void ArrayList()>
	//   46   96:astore          11
				arraylist.add(((Object) (keyframe)));
	//   47   98:aload           11
	//   48  100:aload           12
	//   49  102:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//   50  105:pop             
			}
			xmlpullparser.next();
	//   51  106:aload_3         
	//   52  107:invokeinterface #63  <Method int XmlPullParser.next()>
	//   53  112:pop             
		} else
	//*  54  113:iload           5
	//*  55  115:istore          7
	//*  56  117:goto            7
	//*  57  120:aload           11
	//*  58  122:ifnull          434
	//*  59  125:aload           11
	//*  60  127:invokevirtual   #151 <Method int ArrayList.size()>
	//*  61  130:istore          5
	//*  62  132:iload           5
	//*  63  134:ifle            434
	//*  64  137:aload           11
	//*  65  139:iconst_0        
	//*  66  140:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//*  67  143:checkcast       #177 <Class Keyframe>
	//*  68  146:astore_0        
	//*  69  147:aload           11
	//*  70  149:iload           5
	//*  71  151:iconst_1        
	//*  72  152:isub            
	//*  73  153:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//*  74  156:checkcast       #177 <Class Keyframe>
	//*  75  159:astore_1        
	//*  76  160:aload_1         
	//*  77  161:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//*  78  164:fstore          6
	//*  79  166:fload           6
	//*  80  168:fconst_1        
	//*  81  169:fcmpg           
	//*  82  170:ifge            431
	//*  83  173:fload           6
	//*  84  175:fconst_0        
	//*  85  176:fcmpg           
	//*  86  177:ifge            274
	//*  87  180:aload_1         
	//*  88  181:fconst_1        
	//*  89  182:invokevirtual   #210 <Method void Keyframe.setFraction(float)>
	//*  90  185:aload_0         
	//*  91  186:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//*  92  189:fstore          6
	//*  93  191:iload           5
	//*  94  193:istore          9
	//*  95  195:fload           6
	//*  96  197:fconst_0        
	//*  97  198:fcmpl           
	//*  98  199:ifeq            218
	//*  99  202:fload           6
	//* 100  204:fconst_0        
	//* 101  205:fcmpg           
	//* 102  206:ifge            298
	//* 103  209:aload_0         
	//* 104  210:fconst_0        
	//* 105  211:invokevirtual   #210 <Method void Keyframe.setFraction(float)>
	//* 106  214:iload           5
	//* 107  216:istore          9
	//* 108  218:iload           9
	//* 109  220:anewarray       Keyframe[]
	//* 110  223:astore_0        
	//* 111  224:aload           11
	//* 112  226:aload_0         
	//* 113  227:invokevirtual   #444 <Method Object[] ArrayList.toArray(Object[])>
	//* 114  230:pop             
	//* 115  231:iconst_0        
	//* 116  232:istore          5
	//* 117  234:iload           5
	//* 118  236:iload           9
	//* 119  238:icmpge          409
	//* 120  241:aload_0         
	//* 121  242:iload           5
	//* 122  244:aaload          
	//* 123  245:astore_1        
	//* 124  246:aload_1         
	//* 125  247:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//* 126  250:fconst_0        
	//* 127  251:fcmpg           
	//* 128  252:ifge            265
	//* 129  255:iload           5
	//* 130  257:ifne            318
	//* 131  260:aload_1         
	//* 132  261:fconst_0        
	//* 133  262:invokevirtual   #210 <Method void Keyframe.setFraction(float)>
	//* 134  265:iload           5
	//* 135  267:iconst_1        
	//* 136  268:iadd            
	//* 137  269:istore          5
	//* 138  271:goto            234
	//* 139  274:aload           11
	//* 140  276:aload           11
	//* 141  278:invokevirtual   #151 <Method int ArrayList.size()>
	//* 142  281:aload_1         
	//* 143  282:fconst_1        
	//* 144  283:invokestatic    #446 <Method Keyframe createNewKeyframe(Keyframe, float)>
	//* 145  286:invokevirtual   #449 <Method void ArrayList.add(int, Object)>
	//* 146  289:iload           5
	//* 147  291:iconst_1        
	//* 148  292:iadd            
	//* 149  293:istore          5
	//* 150  295:goto            185
	//* 151  298:aload           11
	//* 152  300:iconst_0        
	//* 153  301:aload_0         
	//* 154  302:fconst_0        
	//* 155  303:invokestatic    #446 <Method Keyframe createNewKeyframe(Keyframe, float)>
	//* 156  306:invokevirtual   #449 <Method void ArrayList.add(int, Object)>
	//* 157  309:iload           5
	//* 158  311:iconst_1        
	//* 159  312:iadd            
	//* 160  313:istore          9
	//* 161  315:goto            218
	//* 162  318:iload           5
	//* 163  320:iload           9
	//* 164  322:iconst_1        
	//* 165  323:isub            
	//* 166  324:icmpne          335
	//* 167  327:aload_1         
	//* 168  328:fconst_1        
	//* 169  329:invokevirtual   #210 <Method void Keyframe.setFraction(float)>
	//* 170  332:goto            265
	//* 171  335:iload           5
	//* 172  337:iconst_1        
	//* 173  338:iadd            
	//* 174  339:istore          8
	//* 175  341:iload           5
	//* 176  343:istore          10
	//* 177  345:iload           8
	//* 178  347:iload           9
	//* 179  349:iconst_1        
	//* 180  350:isub            
	//* 181  351:icmpge          366
	//* 182  354:aload_0         
	//* 183  355:iload           8
	//* 184  357:aaload          
	//* 185  358:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//* 186  361:fconst_0        
	//* 187  362:fcmpl           
	//* 188  363:iflt            396
	//* 189  366:aload_0         
	//* 190  367:aload_0         
	//* 191  368:iload           10
	//* 192  370:iconst_1        
	//* 193  371:iadd            
	//* 194  372:aaload          
	//* 195  373:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//* 196  376:aload_0         
	//* 197  377:iload           5
	//* 198  379:iconst_1        
	//* 199  380:isub            
	//* 200  381:aaload          
	//* 201  382:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//* 202  385:fsub            
	//* 203  386:iload           5
	//* 204  388:iload           10
	//* 205  390:invokestatic    #451 <Method void distributeKeyframes(Keyframe[], float, int, int)>
	//* 206  393:goto            265
	//* 207  396:iload           8
	//* 208  398:istore          10
	//* 209  400:iload           8
	//* 210  402:iconst_1        
	//* 211  403:iadd            
	//* 212  404:istore          8
	//* 213  406:goto            345
	//* 214  409:aload           4
	//* 215  411:aload_0         
	//* 216  412:invokestatic    #455 <Method PropertyValuesHolder PropertyValuesHolder.ofKeyframe(String, Keyframe[])>
	//* 217  415:astore_0        
	//* 218  416:iload           7
	//* 219  418:iconst_3        
	//* 220  419:icmpne          429
	//* 221  422:aload_0         
	//* 222  423:invokestatic    #294 <Method ArgbEvaluator ArgbEvaluator.getInstance()>
	//* 223  426:invokevirtual   #305 <Method void PropertyValuesHolder.setEvaluator(TypeEvaluator)>
	//* 224  429:aload_0         
	//* 225  430:areturn         
	//* 226  431:goto            185
	//* 227  434:aconst_null     
	//* 228  435:areturn         
	//* 229  436:goto            98
	//* 230  439:goto            106
		{
			i = j;
	//  231  442:iload           7
	//  232  444:istore          5
		}
		j = i;
		if(true) goto _L3; else goto _L2
	//  233  446:goto            113
_L2:
		if(arraylist == null)
			break MISSING_BLOCK_LABEL_434;
		i = arraylist.size();
		if(i <= 0)
			break MISSING_BLOCK_LABEL_434;
		context = ((Context) ((Keyframe)arraylist.get(0)));
		resources = ((Resources) ((Keyframe)arraylist.get(i - 1)));
		f = ((Keyframe) (resources)).getFraction();
		if(f < 1.0F)
			if(f < 0.0F)
			{
				((Keyframe) (resources)).setFraction(1.0F);
			} else
			{
				arraylist.add(arraylist.size(), ((Object) (createNewKeyframe(((Keyframe) (resources)), 1.0F))));
				i++;
			}
		f = ((Keyframe) (context)).getFraction();
		l = i;
		if(f != 0.0F)
			if(f < 0.0F)
			{
				((Keyframe) (context)).setFraction(0.0F);
				l = i;
			} else
			{
				arraylist.add(0, ((Object) (createNewKeyframe(((Keyframe) (context)), 0.0F))));
				l = i + 1;
			}
		context = ((Context) (new Keyframe[l]));
		arraylist.toArray(((Object []) (context)));
		i = 0;
		if(i < l)
		{
			resources = ((Resources) (context[i]));
			if(((Keyframe) (resources)).getFraction() < 0.0F)
				if(i == 0)
				{
					((Keyframe) (resources)).setFraction(0.0F);
				} else
				{
label0:
					{
						if(i != l - 1)
							break label0;
						((Keyframe) (resources)).setFraction(1.0F);
					}
				}
		} else
		{
			context = ((Context) (PropertyValuesHolder.ofKeyframe(s, ((Keyframe []) (context)))));
			if(j == 3)
				((PropertyValuesHolder) (context)).setEvaluator(((TypeEvaluator) (ArgbEvaluator.getInstance())));
			return ((PropertyValuesHolder) (context));
		}
_L7:
		i++;
		break MISSING_BLOCK_LABEL_234;
		k = i + 1;
		i1 = i;
_L5:
label1:
		{
			if(k < l - 1 && ((Keyframe) (context[k])).getFraction() < 0.0F)
				break label1;
			distributeKeyframes(((Keyframe []) (context)), ((Keyframe) (context[i1 + 1])).getFraction() - ((Keyframe) (context[i - 1])).getFraction(), i, i1);
		}
		break MISSING_BLOCK_LABEL_265;
		i1 = k;
		k++;
		if(true) goto _L5; else goto _L4
_L4:
		return null;
		if(true) goto _L7; else goto _L6
_L6:
	}

	private static PropertyValuesHolder[] loadValues(Context context, Resources resources, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser, AttributeSet attributeset)
		throws XmlPullParserException, IOException
	{
		ArrayList arraylist = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		do
		{
			int i = xmlpullparser.getEventType();
	//    2    3:aload_3         
	//    3    4:invokeinterface #458 <Method int XmlPullParser.getEventType()>
	//    4    9:istore          5
			if(i == 3 || i == 1)
				break;
	//    5   11:iload           5
	//    6   13:iconst_3        
	//    7   14:icmpeq          163
	//    8   17:iload           5
	//    9   19:iconst_1        
	//   10   20:icmpeq          163
			if(i != 2)
	//*  11   23:iload           5
	//*  12   25:iconst_2        
	//*  13   26:icmpeq          39
			{
				xmlpullparser.next();
	//   14   29:aload_3         
	//   15   30:invokeinterface #63  <Method int XmlPullParser.next()>
	//   16   35:pop             
			} else
	//*  17   36:goto            3
			{
				if(xmlpullparser.getName().equals("propertyValuesHolder"))
	//*  18   39:aload_3         
	//*  19   40:invokeinterface #67  <Method String XmlPullParser.getName()>
	//*  20   45:ldc1            #121 <String "propertyValuesHolder">
	//*  21   47:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  22   50:ifeq            227
				{
					TypedArray typedarray = TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER);
	//   23   53:aload_1         
	//   24   54:aload_2         
	//   25   55:aload           4
	//   26   57:getstatic       #461 <Field int[] AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER>
	//   27   60:invokestatic    #108 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   28   63:astore          9
					String s = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "propertyName", 3);
	//   29   65:aload           9
	//   30   67:aload_3         
	//   31   68:ldc2            #463 <String "propertyName">
	//   32   71:iconst_3        
	//   33   72:invokestatic    #467 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   34   75:astore          10
					int j = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "valueType", 2, 4);
	//   35   77:aload           9
	//   36   79:aload_3         
	//   37   80:ldc2            #469 <String "valueType">
	//   38   83:iconst_2        
	//   39   84:iconst_4        
	//   40   85:invokestatic    #114 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   41   88:istore          5
					PropertyValuesHolder propertyvaluesholder = loadPvh(context, resources, theme, xmlpullparser, s, j);
	//   42   90:aload_0         
	//   43   91:aload_1         
	//   44   92:aload_2         
	//   45   93:aload_3         
	//   46   94:aload           10
	//   47   96:iload           5
	//   48   98:invokestatic    #471 <Method PropertyValuesHolder loadPvh(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, String, int)>
	//   49  101:astore          8
					if(propertyvaluesholder == null)
	//*  50  103:aload           8
	//*  51  105:ifnonnull       224
						propertyvaluesholder = getPVH(typedarray, j, 0, 1, s);
	//   52  108:aload           9
	//   53  110:iload           5
	//   54  112:iconst_0        
	//   55  113:iconst_1        
	//   56  114:aload           10
	//   57  116:invokestatic    #473 <Method PropertyValuesHolder getPVH(TypedArray, int, int, int, String)>
	//   58  119:astore          8
					if(propertyvaluesholder != null)
	//*  59  121:aload           8
	//*  60  123:ifnull          221
					{
						if(arraylist == null)
	//*  61  126:aload           7
	//*  62  128:ifnonnull       218
							arraylist = new ArrayList();
	//   63  131:new             #81  <Class ArrayList>
	//   64  134:dup             
	//   65  135:invokespecial   #82  <Method void ArrayList()>
	//   66  138:astore          7
						arraylist.add(((Object) (propertyvaluesholder)));
	//   67  140:aload           7
	//   68  142:aload           8
	//   69  144:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//   70  147:pop             
					}
					typedarray.recycle();
	//   71  148:aload           9
	//   72  150:invokevirtual   #119 <Method void TypedArray.recycle()>
				}
				xmlpullparser.next();
	//   73  153:aload_3         
	//   74  154:invokeinterface #63  <Method int XmlPullParser.next()>
	//   75  159:pop             
			}
		} while(true);
	//   76  160:goto            3
		context = null;
	//   77  163:aconst_null     
	//   78  164:astore_0        
		if(arraylist != null)
	//*  79  165:aload           7
	//*  80  167:ifnull          216
		{
			int l = arraylist.size();
	//   81  170:aload           7
	//   82  172:invokevirtual   #151 <Method int ArrayList.size()>
	//   83  175:istore          6
			context = ((Context) (new PropertyValuesHolder[l]));
	//   84  177:iload           6
	//   85  179:anewarray       PropertyValuesHolder[]
	//   86  182:astore_0        
			for(int k = 0; k < l; k++)
	//*  87  183:iconst_0        
	//*  88  184:istore          5
	//*  89  186:iload           5
	//*  90  188:iload           6
	//*  91  190:icmpge          216
				context[k] = ((/*<invalid signature>*/java.lang.Object) ((PropertyValuesHolder)arraylist.get(k)));
	//   92  193:aload_0         
	//   93  194:iload           5
	//   94  196:aload           7
	//   95  198:iload           5
	//   96  200:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//   97  203:checkcast       #285 <Class PropertyValuesHolder>
	//   98  206:aastore         

	//   99  207:iload           5
	//  100  209:iconst_1        
	//  101  210:iadd            
	//  102  211:istore          5
		}
	//* 103  213:goto            186
		return ((PropertyValuesHolder []) (context));
	//  104  216:aload_0         
	//  105  217:areturn         
	//* 106  218:goto            140
	//* 107  221:goto            148
	//* 108  224:goto            121
	//* 109  227:goto            153
	}

	private static void parseAnimatorFromTypeArray(ValueAnimator valueanimator, TypedArray typedarray, TypedArray typedarray1, float f, XmlPullParser xmlpullparser)
	{
		long l = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "duration", 1, 300);
	//    0    0:aload_1         
	//    1    1:aload           4
	//    2    3:ldc2            #475 <String "duration">
	//    3    6:iconst_1        
	//    4    7:sipush          300
	//    5   10:invokestatic    #114 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//    6   13:i2l             
	//    7   14:lstore          8
		long l1 = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "startOffset", 2, 0);
	//    8   16:aload_1         
	//    9   17:aload           4
	//   10   19:ldc2            #477 <String "startOffset">
	//   11   22:iconst_2        
	//   12   23:iconst_0        
	//   13   24:invokestatic    #114 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   14   27:i2l             
	//   15   28:lstore          10
		int j = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "valueType", 7, 4);
	//   16   30:aload_1         
	//   17   31:aload           4
	//   18   33:ldc2            #469 <String "valueType">
	//   19   36:bipush          7
	//   20   38:iconst_4        
	//   21   39:invokestatic    #114 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   22   42:istore          6
		int k = j;
	//   23   44:iload           6
	//   24   46:istore          7
		if(TypedArrayUtils.hasAttribute(xmlpullparser, "valueFrom"))
	//*  25   48:aload           4
	//*  26   50:ldc2            #479 <String "valueFrom">
	//*  27   53:invokestatic    #483 <Method boolean TypedArrayUtils.hasAttribute(XmlPullParser, String)>
	//*  28   56:ifeq            133
		{
			k = j;
	//   29   59:iload           6
	//   30   61:istore          7
			if(TypedArrayUtils.hasAttribute(xmlpullparser, "valueTo"))
	//*  31   63:aload           4
	//*  32   65:ldc2            #485 <String "valueTo">
	//*  33   68:invokestatic    #483 <Method boolean TypedArrayUtils.hasAttribute(XmlPullParser, String)>
	//*  34   71:ifeq            133
			{
				int i = j;
	//   35   74:iload           6
	//   36   76:istore          5
				if(j == 4)
	//*  37   78:iload           6
	//*  38   80:iconst_4        
	//*  39   81:icmpne          93
					i = inferValueTypeFromValues(typedarray, 5, 6);
	//   40   84:aload_1         
	//   41   85:iconst_5        
	//   42   86:bipush          6
	//   43   88:invokestatic    #487 <Method int inferValueTypeFromValues(TypedArray, int, int)>
	//   44   91:istore          5
				PropertyValuesHolder propertyvaluesholder = getPVH(typedarray, i, 5, 6, "");
	//   45   93:aload_1         
	//   46   94:iload           5
	//   47   96:iconst_5        
	//   48   97:bipush          6
	//   49   99:ldc2            #489 <String "">
	//   50  102:invokestatic    #473 <Method PropertyValuesHolder getPVH(TypedArray, int, int, int, String)>
	//   51  105:astore          12
				k = i;
	//   52  107:iload           5
	//   53  109:istore          7
				if(propertyvaluesholder != null)
	//*  54  111:aload           12
	//*  55  113:ifnull          133
				{
					valueanimator.setValues(new PropertyValuesHolder[] {
						propertyvaluesholder
					});
	//   56  116:aload_0         
	//   57  117:iconst_1        
	//   58  118:anewarray       PropertyValuesHolder[]
	//   59  121:dup             
	//   60  122:iconst_0        
	//   61  123:aload           12
	//   62  125:aastore         
	//   63  126:invokevirtual   #131 <Method void ValueAnimator.setValues(PropertyValuesHolder[])>
					k = i;
	//   64  129:iload           5
	//   65  131:istore          7
				}
			}
		}
		valueanimator.setDuration(l);
	//   66  133:aload_0         
	//   67  134:lload           8
	//   68  136:invokevirtual   #493 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   69  139:pop             
		valueanimator.setStartDelay(l1);
	//   70  140:aload_0         
	//   71  141:lload           10
	//   72  143:invokevirtual   #497 <Method void ValueAnimator.setStartDelay(long)>
		valueanimator.setRepeatCount(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "repeatCount", 3, 0));
	//   73  146:aload_0         
	//   74  147:aload_1         
	//   75  148:aload           4
	//   76  150:ldc2            #499 <String "repeatCount">
	//   77  153:iconst_3        
	//   78  154:iconst_0        
	//   79  155:invokestatic    #114 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   80  158:invokevirtual   #503 <Method void ValueAnimator.setRepeatCount(int)>
		valueanimator.setRepeatMode(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "repeatMode", 4, 1));
	//   81  161:aload_0         
	//   82  162:aload_1         
	//   83  163:aload           4
	//   84  165:ldc2            #505 <String "repeatMode">
	//   85  168:iconst_4        
	//   86  169:iconst_1        
	//   87  170:invokestatic    #114 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   88  173:invokevirtual   #508 <Method void ValueAnimator.setRepeatMode(int)>
		if(typedarray1 != null)
	//*  89  176:aload_2         
	//*  90  177:ifnull          190
			setupObjectAnimator(valueanimator, typedarray1, k, f, xmlpullparser);
	//   91  180:aload_0         
	//   92  181:aload_2         
	//   93  182:iload           7
	//   94  184:fload_3         
	//   95  185:aload           4
	//   96  187:invokestatic    #512 <Method void setupObjectAnimator(ValueAnimator, TypedArray, int, float, XmlPullParser)>
	//   97  190:return          
	}

	private static void setupObjectAnimator(ValueAnimator valueanimator, TypedArray typedarray, int i, float f, XmlPullParser xmlpullparser)
	{
		valueanimator = ((ValueAnimator) ((ObjectAnimator)valueanimator));
	//    0    0:aload_0         
	//    1    1:checkcast       #427 <Class ObjectAnimator>
	//    2    4:astore_0        
		String s = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "pathData", 1);
	//    3    5:aload_1         
	//    4    6:aload           4
	//    5    8:ldc2            #514 <String "pathData">
	//    6   11:iconst_1        
	//    7   12:invokestatic    #467 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//    8   15:astore          5
		if(s != null)
	//*   9   17:aload           5
	//*  10   19:ifnull          116
		{
			String s1 = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "propertyXName", 2);
	//   11   22:aload_1         
	//   12   23:aload           4
	//   13   25:ldc2            #516 <String "propertyXName">
	//   14   28:iconst_2        
	//   15   29:invokestatic    #467 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   16   32:astore          6
			xmlpullparser = ((XmlPullParser) (TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "propertyYName", 3)));
	//   17   34:aload_1         
	//   18   35:aload           4
	//   19   37:ldc2            #518 <String "propertyYName">
	//   20   40:iconst_3        
	//   21   41:invokestatic    #467 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   22   44:astore          4
			if(i != 2)
	//*  23   46:iload_2         
	//*  24   47:iconst_2        
	//*  25   48:icmpeq          56
				if(i != 4);
	//   26   51:iload_2         
	//   27   52:iconst_4        
	//   28   53:icmpne          56
			if(s1 == null && xmlpullparser == null)
	//*  29   56:aload           6
	//*  30   58:ifnonnull       97
	//*  31   61:aload           4
	//*  32   63:ifnonnull       97
			{
				throw new InflateException((new StringBuilder()).append(typedarray.getPositionDescription()).append(" propertyXName or propertyYName is needed for PathData").toString());
	//   33   66:new             #278 <Class InflateException>
	//   34   69:dup             
	//   35   70:new             #135 <Class StringBuilder>
	//   36   73:dup             
	//   37   74:invokespecial   #136 <Method void StringBuilder()>
	//   38   77:aload_1         
	//   39   78:invokevirtual   #521 <Method String TypedArray.getPositionDescription()>
	//   40   81:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   41   84:ldc2            #523 <String " propertyXName or propertyYName is needed for PathData">
	//   42   87:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   43   90:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   44   93:invokespecial   #283 <Method void InflateException(String)>
	//   45   96:athrow          
			} else
			{
				setupPathMotion(PathParser.createPathFromPathData(s), ((ObjectAnimator) (valueanimator)), 0.5F * f, s1, ((String) (xmlpullparser)));
	//   46   97:aload           5
	//   47   99:invokestatic    #527 <Method Path PathParser.createPathFromPathData(String)>
	//   48  102:aload_0         
	//   49  103:ldc2            #528 <Float 0.5F>
	//   50  106:fload_3         
	//   51  107:fmul            
	//   52  108:aload           6
	//   53  110:aload           4
	//   54  112:invokestatic    #532 <Method void setupPathMotion(Path, ObjectAnimator, float, String, String)>
				return;
	//   55  115:return          
			}
		} else
		{
			((ObjectAnimator) (valueanimator)).setPropertyName(TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "propertyName", 0));
	//   56  116:aload_0         
	//   57  117:aload_1         
	//   58  118:aload           4
	//   59  120:ldc2            #463 <String "propertyName">
	//   60  123:iconst_0        
	//   61  124:invokestatic    #467 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   62  127:invokevirtual   #535 <Method void ObjectAnimator.setPropertyName(String)>
			return;
	//   63  130:return          
		}
	}

	private static void setupPathMotion(Path path, ObjectAnimator objectanimator, float f, String s, String s1)
	{
		PathMeasure pathmeasure = new PathMeasure(path, false);
	//    0    0:new             #537 <Class PathMeasure>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #540 <Method void PathMeasure(Path, boolean)>
	//    5    9:astore          11
		float f1 = 0.0F;
	//    6   11:fconst_0        
	//    7   12:fstore          5
		ArrayList arraylist = new ArrayList();
	//    8   14:new             #81  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #82  <Method void ArrayList()>
	//   11   21:astore          10
		arraylist.add(((Object) (Float.valueOf(0.0F))));
	//   12   23:aload           10
	//   13   25:fconst_0        
	//   14   26:invokestatic    #244 <Method Float Float.valueOf(float)>
	//   15   29:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//   16   32:pop             
		float f2;
		do
		{
			f2 = f1 + pathmeasure.getLength();
	//   17   33:fload           5
	//   18   35:aload           11
	//   19   37:invokevirtual   #543 <Method float PathMeasure.getLength()>
	//   20   40:fadd            
	//   21   41:fstore          6
			arraylist.add(((Object) (Float.valueOf(f2))));
	//   22   43:aload           10
	//   23   45:fload           6
	//   24   47:invokestatic    #244 <Method Float Float.valueOf(float)>
	//   25   50:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//   26   53:pop             
			f1 = f2;
	//   27   54:fload           6
	//   28   56:fstore          5
		} while(pathmeasure.nextContour());
	//   29   58:aload           11
	//   30   60:invokevirtual   #546 <Method boolean PathMeasure.nextContour()>
	//   31   63:ifne            33
		path = ((Path) (new PathMeasure(path, false)));
	//   32   66:new             #537 <Class PathMeasure>
	//   33   69:dup             
	//   34   70:aload_0         
	//   35   71:iconst_0        
	//   36   72:invokespecial   #540 <Method void PathMeasure(Path, boolean)>
	//   37   75:astore_0        
		int k = Math.min(100, (int)(f2 / f) + 1);
	//   38   76:bipush          100
	//   39   78:fload           6
	//   40   80:fload_2         
	//   41   81:fdiv            
	//   42   82:f2i             
	//   43   83:iconst_1        
	//   44   84:iadd            
	//   45   85:invokestatic    #551 <Method int Math.min(int, int)>
	//   46   88:istore          9
		float af1[] = new float[k];
	//   47   90:iload           9
	//   48   92:newarray        float[]
	//   49   94:astore          12
		float af[] = new float[k];
	//   50   96:iload           9
	//   51   98:newarray        float[]
	//   52  100:astore          11
		float af2[] = new float[2];
	//   53  102:iconst_2        
	//   54  103:newarray        float[]
	//   55  105:astore          13
		int i = 0;
	//   56  107:iconst_0        
	//   57  108:istore          7
		f1 = f2 / (float)(k - 1);
	//   58  110:fload           6
	//   59  112:iload           9
	//   60  114:iconst_1        
	//   61  115:isub            
	//   62  116:i2f             
	//   63  117:fdiv            
	//   64  118:fstore          5
		int j = 0;
	//   65  120:iconst_0        
	//   66  121:istore          8
		f = 0.0F;
	//   67  123:fconst_0        
	//   68  124:fstore_2        
		for(; j < k; j++)
	//*  69  125:iload           8
	//*  70  127:iload           9
	//*  71  129:icmpge          243
		{
			((PathMeasure) (path)).getPosTan(f, af2, ((float []) (null)));
	//   72  132:aload_0         
	//   73  133:fload_2         
	//   74  134:aload           13
	//   75  136:aconst_null     
	//   76  137:invokevirtual   #555 <Method boolean PathMeasure.getPosTan(float, float[], float[])>
	//   77  140:pop             
			((PathMeasure) (path)).getPosTan(f, af2, ((float []) (null)));
	//   78  141:aload_0         
	//   79  142:fload_2         
	//   80  143:aload           13
	//   81  145:aconst_null     
	//   82  146:invokevirtual   #555 <Method boolean PathMeasure.getPosTan(float, float[], float[])>
	//   83  149:pop             
			af1[j] = af2[0];
	//   84  150:aload           12
	//   85  152:iload           8
	//   86  154:aload           13
	//   87  156:iconst_0        
	//   88  157:faload          
	//   89  158:fastore         
			af[j] = af2[1];
	//   90  159:aload           11
	//   91  161:iload           8
	//   92  163:aload           13
	//   93  165:iconst_1        
	//   94  166:faload          
	//   95  167:fastore         
			f += f1;
	//   96  168:fload_2         
	//   97  169:fload           5
	//   98  171:fadd            
	//   99  172:fstore_2        
			if(i + 1 < arraylist.size() && f > ((Float)arraylist.get(i + 1)).floatValue())
	//* 100  173:iload           7
	//* 101  175:iconst_1        
	//* 102  176:iadd            
	//* 103  177:aload           10
	//* 104  179:invokevirtual   #151 <Method int ArrayList.size()>
	//* 105  182:icmpge          326
	//* 106  185:fload_2         
	//* 107  186:aload           10
	//* 108  188:iload           7
	//* 109  190:iconst_1        
	//* 110  191:iadd            
	//* 111  192:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//* 112  195:checkcast       #183 <Class Float>
	//* 113  198:invokevirtual   #558 <Method float Float.floatValue()>
	//* 114  201:fcmpl           
	//* 115  202:ifle            326
			{
				f -= ((Float)arraylist.get(i + 1)).floatValue();
	//  116  205:fload_2         
	//  117  206:aload           10
	//  118  208:iload           7
	//  119  210:iconst_1        
	//  120  211:iadd            
	//  121  212:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//  122  215:checkcast       #183 <Class Float>
	//  123  218:invokevirtual   #558 <Method float Float.floatValue()>
	//  124  221:fsub            
	//  125  222:fstore_2        
				i++;
	//  126  223:iload           7
	//  127  225:iconst_1        
	//  128  226:iadd            
	//  129  227:istore          7
				((PathMeasure) (path)).nextContour();
	//  130  229:aload_0         
	//  131  230:invokevirtual   #546 <Method boolean PathMeasure.nextContour()>
	//  132  233:pop             
			}
		}

	//  133  234:iload           8
	//  134  236:iconst_1        
	//  135  237:iadd            
	//  136  238:istore          8
	//* 137  240:goto            125
		path = null;
	//  138  243:aconst_null     
	//  139  244:astore_0        
		arraylist = null;
	//  140  245:aconst_null     
	//  141  246:astore          10
		if(s != null)
	//* 142  248:aload_3         
	//* 143  249:ifnull          259
			path = ((Path) (PropertyValuesHolder.ofFloat(s, af1)));
	//  144  252:aload_3         
	//  145  253:aload           12
	//  146  255:invokestatic    #301 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  147  258:astore_0        
		s = ((String) (arraylist));
	//  148  259:aload           10
	//  149  261:astore_3        
		if(s1 != null)
	//* 150  262:aload           4
	//* 151  264:ifnull          275
			s = ((String) (PropertyValuesHolder.ofFloat(s1, af)));
	//  152  267:aload           4
	//  153  269:aload           11
	//  154  271:invokestatic    #301 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  155  274:astore_3        
		if(path == null)
	//* 156  275:aload_0         
	//* 157  276:ifnonnull       292
		{
			objectanimator.setValues(new PropertyValuesHolder[] {
				s
			});
	//  158  279:aload_1         
	//  159  280:iconst_1        
	//  160  281:anewarray       PropertyValuesHolder[]
	//  161  284:dup             
	//  162  285:iconst_0        
	//  163  286:aload_3         
	//  164  287:aastore         
	//  165  288:invokevirtual   #559 <Method void ObjectAnimator.setValues(PropertyValuesHolder[])>
			return;
	//  166  291:return          
		}
		if(s == null)
	//* 167  292:aload_3         
	//* 168  293:ifnonnull       309
		{
			objectanimator.setValues(new PropertyValuesHolder[] {
				path
			});
	//  169  296:aload_1         
	//  170  297:iconst_1        
	//  171  298:anewarray       PropertyValuesHolder[]
	//  172  301:dup             
	//  173  302:iconst_0        
	//  174  303:aload_0         
	//  175  304:aastore         
	//  176  305:invokevirtual   #559 <Method void ObjectAnimator.setValues(PropertyValuesHolder[])>
			return;
	//  177  308:return          
		} else
		{
			objectanimator.setValues(new PropertyValuesHolder[] {
				path, s
			});
	//  178  309:aload_1         
	//  179  310:iconst_2        
	//  180  311:anewarray       PropertyValuesHolder[]
	//  181  314:dup             
	//  182  315:iconst_0        
	//  183  316:aload_0         
	//  184  317:aastore         
	//  185  318:dup             
	//  186  319:iconst_1        
	//  187  320:aload_3         
	//  188  321:aastore         
	//  189  322:invokevirtual   #559 <Method void ObjectAnimator.setValues(PropertyValuesHolder[])>
			return;
	//  190  325:return          
		}
	//* 191  326:goto            234
	}

	private static final boolean DBG_ANIMATOR_INFLATER = false;
	private static final int MAX_NUM_POINTS = 100;
	private static final String TAG = "AnimatorInflater";
	private static final int TOGETHER = 0;
	private static final int VALUE_TYPE_COLOR = 3;
	private static final int VALUE_TYPE_FLOAT = 0;
	private static final int VALUE_TYPE_INT = 1;
	private static final int VALUE_TYPE_PATH = 2;
	private static final int VALUE_TYPE_UNDEFINED = 4;
}
