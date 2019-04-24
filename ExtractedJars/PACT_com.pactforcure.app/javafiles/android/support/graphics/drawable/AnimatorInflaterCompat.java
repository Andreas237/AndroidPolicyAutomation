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
	//    1    1:astore          13
		ArrayList arraylist = null;
	//    2    3:aconst_null     
	//    3    4:astore          12
		int l = xmlpullparser.getDepth();
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
				if((j != 3 || xmlpullparser.getDepth() > l) && j != 1)
	//*  10   22:iload           8
	//*  11   24:iconst_3        
	//*  12   25:icmpne          39
	//*  13   28:aload_3         
	//*  14   29:invokeinterface #60  <Method int XmlPullParser.getDepth()>
	//*  15   34:iload           9
	//*  16   36:icmple          330
	//*  17   39:iload           8
	//*  18   41:iconst_1        
	//*  19   42:icmpeq          330
				{
					if(j == 2)
	//*  20   45:iload           8
	//*  21   47:iconst_2        
	//*  22   48:icmpne          14
					{
						Object obj = ((Object) (xmlpullparser.getName()));
	//   23   51:aload_3         
	//   24   52:invokeinterface #67  <Method String XmlPullParser.getName()>
	//   25   57:astore          11
						boolean flag = false;
	//   26   59:iconst_0        
	//   27   60:istore          8
						if(((String) (obj)).equals("objectAnimator"))
	//*  28   62:aload           11
	//*  29   64:ldc1            #69  <String "objectAnimator">
	//*  30   66:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  31   69:ifeq            140
							obj = ((Object) (loadObjectAnimator(context, resources, theme, attributeset, f, xmlpullparser)));
	//   32   72:aload_0         
	//   33   73:aload_1         
	//   34   74:aload_2         
	//   35   75:aload           4
	//   36   77:fload           7
	//   37   79:aload_3         
	//   38   80:invokestatic    #79  <Method ObjectAnimator loadObjectAnimator(Context, Resources, android.content.res.Resources$Theme, AttributeSet, float, XmlPullParser)>
	//   39   83:astore          11
						else
	//*  40   85:aload           11
	//*  41   87:astore          13
	//*  42   89:aload           5
	//*  43   91:ifnull          14
	//*  44   94:aload           11
	//*  45   96:astore          13
	//*  46   98:iload           8
	//*  47  100:ifne            14
	//*  48  103:aload           12
	//*  49  105:astore          14
	//*  50  107:aload           12
	//*  51  109:ifnonnull       121
	//*  52  112:new             #81  <Class ArrayList>
	//*  53  115:dup             
	//*  54  116:invokespecial   #82  <Method void ArrayList()>
	//*  55  119:astore          14
	//*  56  121:aload           14
	//*  57  123:aload           11
	//*  58  125:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//*  59  128:pop             
	//*  60  129:aload           11
	//*  61  131:astore          13
	//*  62  133:aload           14
	//*  63  135:astore          12
	//*  64  137:goto            14
						if(((String) (obj)).equals("animator"))
	//*  65  140:aload           11
	//*  66  142:ldc1            #87  <String "animator">
	//*  67  144:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  68  147:ifeq            167
							obj = ((Object) (loadAnimator(context, resources, theme, attributeset, ((ValueAnimator) (null)), f, xmlpullparser)));
	//   69  150:aload_0         
	//   70  151:aload_1         
	//   71  152:aload_2         
	//   72  153:aload           4
	//   73  155:aconst_null     
	//   74  156:fload           7
	//   75  158:aload_3         
	//   76  159:invokestatic    #91  <Method ValueAnimator loadAnimator(Context, Resources, android.content.res.Resources$Theme, AttributeSet, ValueAnimator, float, XmlPullParser)>
	//   77  162:astore          11
						else
	//*  78  164:goto            85
						if(((String) (obj)).equals("set"))
	//*  79  167:aload           11
	//*  80  169:ldc1            #93  <String "set">
	//*  81  171:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  82  174:ifeq            237
						{
							obj = ((Object) (new AnimatorSet()));
	//   83  177:new             #95  <Class AnimatorSet>
	//   84  180:dup             
	//   85  181:invokespecial   #96  <Method void AnimatorSet()>
	//   86  184:astore          11
							obj1 = ((Object) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_ANIMATOR_SET)));
	//   87  186:aload_1         
	//   88  187:aload_2         
	//   89  188:aload           4
	//   90  190:getstatic       #102 <Field int[] AndroidResources.STYLEABLE_ANIMATOR_SET>
	//   91  193:invokestatic    #108 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   92  196:astore          13
							int i1 = TypedArrayUtils.getNamedInt(((TypedArray) (obj1)), xmlpullparser, "ordering", 0, 0);
	//   93  198:aload           13
	//   94  200:aload_3         
	//   95  201:ldc1            #110 <String "ordering">
	//   96  203:iconst_0        
	//   97  204:iconst_0        
	//   98  205:invokestatic    #114 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   99  208:istore          10
							createAnimatorFromXml(context, resources, theme, xmlpullparser, attributeset, (AnimatorSet)obj, i1, f);
	//  100  210:aload_0         
	//  101  211:aload_1         
	//  102  212:aload_2         
	//  103  213:aload_3         
	//  104  214:aload           4
	//  105  216:aload           11
	//  106  218:checkcast       #95  <Class AnimatorSet>
	//  107  221:iload           10
	//  108  223:fload           7
	//  109  225:invokestatic    #53  <Method Animator createAnimatorFromXml(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, AttributeSet, AnimatorSet, int, float)>
	//  110  228:pop             
							((TypedArray) (obj1)).recycle();
	//  111  229:aload           13
	//  112  231:invokevirtual   #119 <Method void TypedArray.recycle()>
						} else
	//* 113  234:goto            85
						if(((String) (obj)).equals("propertyValuesHolder"))
	//* 114  237:aload           11
	//* 115  239:ldc1            #121 <String "propertyValuesHolder">
	//* 116  241:invokevirtual   #75  <Method boolean String.equals(Object)>
	//* 117  244:ifeq            298
						{
							obj = ((Object) (loadValues(context, resources, theme, xmlpullparser, Xml.asAttributeSet(xmlpullparser))));
	//  118  247:aload_0         
	//  119  248:aload_1         
	//  120  249:aload_2         
	//  121  250:aload_3         
	//  122  251:aload_3         
	//  123  252:invokestatic    #50  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//  124  255:invokestatic    #125 <Method PropertyValuesHolder[] loadValues(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, AttributeSet)>
	//  125  258:astore          11
							if(obj != null && obj1 != null && (obj1 instanceof ValueAnimator))
	//* 126  260:aload           11
	//* 127  262:ifnull          288
	//* 128  265:aload           13
	//* 129  267:ifnull          288
	//* 130  270:aload           13
	//* 131  272:instanceof      #127 <Class ValueAnimator>
	//* 132  275:ifeq            288
								((ValueAnimator)obj1).setValues(((PropertyValuesHolder []) (obj)));
	//  133  278:aload           13
	//  134  280:checkcast       #127 <Class ValueAnimator>
	//  135  283:aload           11
	//  136  285:invokevirtual   #131 <Method void ValueAnimator.setValues(PropertyValuesHolder[])>
							flag = true;
	//  137  288:iconst_1        
	//  138  289:istore          8
							obj = obj1;
	//  139  291:aload           13
	//  140  293:astore          11
						} else
	//* 141  295:goto            85
						{
							throw new RuntimeException((new StringBuilder()).append("Unknown animator name: ").append(xmlpullparser.getName()).toString());
	//  142  298:new             #133 <Class RuntimeException>
	//  143  301:dup             
	//  144  302:new             #135 <Class StringBuilder>
	//  145  305:dup             
	//  146  306:invokespecial   #136 <Method void StringBuilder()>
	//  147  309:ldc1            #138 <String "Unknown animator name: ">
	//  148  311:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  149  314:aload_3         
	//  150  315:invokeinterface #67  <Method String XmlPullParser.getName()>
	//  151  320:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  152  323:invokevirtual   #145 <Method String StringBuilder.toString()>
	//  153  326:invokespecial   #148 <Method void RuntimeException(String)>
	//  154  329:athrow          
						}
						obj1 = obj;
						if(animatorset != null)
						{
							obj1 = obj;
							if(!flag)
							{
								ArrayList arraylist1 = arraylist;
								if(arraylist == null)
									arraylist1 = new ArrayList();
								arraylist1.add(obj);
								obj1 = obj;
								arraylist = arraylist1;
							}
						}
					}
					continue;
				}
				if(animatorset != null && arraylist != null)
	//* 155  330:aload           5
	//* 156  332:ifnull          400
	//* 157  335:aload           12
	//* 158  337:ifnull          400
				{
					context = ((Context) (new Animator[arraylist.size()]));
	//  159  340:aload           12
	//  160  342:invokevirtual   #151 <Method int ArrayList.size()>
	//  161  345:anewarray       Animator[]
	//  162  348:astore_0        
					int k = 0;
	//  163  349:iconst_0        
	//  164  350:istore          8
					for(resources = ((Resources) (arraylist.iterator())); ((Iterator) (resources)).hasNext();)
	//* 165  352:aload           12
	//* 166  354:invokevirtual   #157 <Method Iterator ArrayList.iterator()>
	//* 167  357:astore_1        
	//* 168  358:aload_1         
	//* 169  359:invokeinterface #163 <Method boolean Iterator.hasNext()>
	//* 170  364:ifeq            389
					{
						context[k] = ((/*<invalid signature>*/java.lang.Object) ((Animator)((Iterator) (resources)).next()));
	//  171  367:aload_0         
	//  172  368:iload           8
	//  173  370:aload_1         
	//  174  371:invokeinterface #166 <Method Object Iterator.next()>
	//  175  376:checkcast       #153 <Class Animator>
	//  176  379:aastore         
						k++;
	//  177  380:iload           8
	//  178  382:iconst_1        
	//  179  383:iadd            
	//  180  384:istore          8
					}

	//* 181  386:goto            358
					if(i != 0)
						break label0;
	//  182  389:iload           6
	//  183  391:ifne            403
					animatorset.playTogether(((Animator []) (context)));
	//  184  394:aload           5
	//  185  396:aload_0         
	//  186  397:invokevirtual   #170 <Method void AnimatorSet.playTogether(Animator[])>
				}
				return ((Animator) (obj1));
	//  187  400:aload           13
	//  188  402:areturn         
			}
			animatorset.playSequentially(((Animator []) (context)));
	//  189  403:aload           5
	//  190  405:aload_0         
	//  191  406:invokevirtual   #173 <Method void AnimatorSet.playSequentially(Animator[])>
			return ((Animator) (obj1));
	//  192  409:aload           13
	//  193  411:areturn         
		} while(true);
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
		Object obj;
		String s2;
		android.support.v4.graphics.PathParser.PathDataNode apathdatanode[];
		android.support.v4.graphics.PathParser.PathDataNode apathdatanode1[];
		obj = ((Object) (typedarray.peekValue(j)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #250 <Method TypedValue TypedArray.peekValue(int)>
	//    3    5:astore          12
		String s1;
		if(obj != null)
	//*   4    7:aload           12
	//*   5    9:ifnull          220
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore          8
		else
	//*   8   15:iload           8
	//*   9   17:ifeq            226
	//*  10   20:aload           12
	//*  11   22:getfield        #255 <Field int TypedValue.type>
	//*  12   25:istore          10
	//*  13   27:aload_0         
	//*  14   28:iload_3         
	//*  15   29:invokevirtual   #250 <Method TypedValue TypedArray.peekValue(int)>
	//*  16   32:astore          12
	//*  17   34:aload           12
	//*  18   36:ifnull          232
	//*  19   39:iconst_1        
	//*  20   40:istore          9
	//*  21   42:iload           9
	//*  22   44:ifeq            238
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
	//*  37   77:ifeq            244
	//*  38   80:iload           11
	//*  39   82:invokestatic    #259 <Method boolean isColorType(int)>
	//*  40   85:ifeq            244
	//*  41   88:iconst_3        
	//*  42   89:istore          7
	//*  43   91:iload           7
	//*  44   93:ifne            250
	//*  45   96:iconst_1        
	//*  46   97:istore_1        
	//*  47   98:aconst_null     
	//*  48   99:astore          14
	//*  49  101:aconst_null     
	//*  50  102:astore          12
	//*  51  104:iload           7
	//*  52  106:iconst_2        
	//*  53  107:icmpne          325
	//*  54  110:aload_0         
	//*  55  111:iload_2         
	//*  56  112:invokevirtual   #263 <Method String TypedArray.getString(int)>
	//*  57  115:astore          13
	//*  58  117:aload_0         
	//*  59  118:iload_3         
	//*  60  119:invokevirtual   #263 <Method String TypedArray.getString(int)>
	//*  61  122:astore          14
	//*  62  124:aload           13
	//*  63  126:invokestatic    #269 <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.createNodesFromPathData(String)>
	//*  64  129:astore          15
	//*  65  131:aload           14
	//*  66  133:invokestatic    #269 <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.createNodesFromPathData(String)>
	//*  67  136:astore          16
	//*  68  138:aload           15
	//*  69  140:ifnonnull       151
	//*  70  143:aload           12
	//*  71  145:astore_0        
	//*  72  146:aload           16
	//*  73  148:ifnull          276
	//*  74  151:aload           15
	//*  75  153:ifnull          294
	//*  76  156:new             #8   <Class AnimatorInflaterCompat$PathDataEvaluator>
	//*  77  159:dup             
	//*  78  160:aconst_null     
	//*  79  161:invokespecial   #272 <Method void AnimatorInflaterCompat$PathDataEvaluator(AnimatorInflaterCompat$1)>
	//*  80  164:astore_0        
	//*  81  165:aload           16
	//*  82  167:ifnull          278
	//*  83  170:aload           15
	//*  84  172:aload           16
	//*  85  174:invokestatic    #276 <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
	//*  86  177:ifne            255
	//*  87  180:new             #278 <Class InflateException>
	//*  88  183:dup             
	//*  89  184:new             #135 <Class StringBuilder>
	//*  90  187:dup             
	//*  91  188:invokespecial   #136 <Method void StringBuilder()>
	//*  92  191:ldc2            #280 <String " Can't morph from ">
	//*  93  194:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//*  94  197:aload           13
	//*  95  199:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//*  96  202:ldc2            #282 <String " to ">
	//*  97  205:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//*  98  208:aload           14
	//*  99  210:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//* 100  213:invokevirtual   #145 <Method String StringBuilder.toString()>
	//* 101  216:invokespecial   #283 <Method void InflateException(String)>
	//* 102  219:athrow          
			flag = false;
	//  103  220:iconst_0        
	//  104  221:istore          8
		if(flag)
			i1 = ((TypedValue) (obj)).type;
		else
	//* 105  223:goto            15
			i1 = 0;
	//  106  226:iconst_0        
	//  107  227:istore          10
		obj = ((Object) (typedarray.peekValue(k)));
		if(obj != null)
			flag1 = true;
		else
	//* 108  229:goto            27
			flag1 = false;
	//  109  232:iconst_0        
	//  110  233:istore          9
		if(flag1)
			j1 = ((TypedValue) (obj)).type;
		else
	//* 111  235:goto            42
			j1 = 0;
	//  112  238:iconst_0        
	//  113  239:istore          11
		l = i;
		if(i == 4)
			if(flag && isColorType(i1) || flag1 && isColorType(j1))
				l = 3;
			else
	//* 114  241:goto            54
				l = 0;
	//  115  244:iconst_0        
	//  116  245:istore          7
		if(l == 0)
			i = 1;
		else
	//* 117  247:goto            91
			i = 0;
	//  118  250:iconst_0        
	//  119  251:istore_1        
		s2 = null;
		obj = null;
		if(l != 2) goto _L2; else goto _L1
_L1:
		s1 = typedarray.getString(j);
		s2 = typedarray.getString(k);
		apathdatanode = PathParser.createNodesFromPathData(s1);
		apathdatanode1 = PathParser.createNodesFromPathData(s2);
		if(apathdatanode != null) goto _L4; else goto _L3
_L3:
		typedarray = ((TypedArray) (obj));
		if(apathdatanode1 == null) goto _L5; else goto _L4
_L4:
		if(apathdatanode == null) goto _L7; else goto _L6
_L6:
		typedarray = ((TypedArray) (new PathDataEvaluator()));
		if(apathdatanode1 == null) goto _L9; else goto _L8
_L8:
		if(!PathParser.canMorph(apathdatanode, apathdatanode1))
			throw new InflateException((new StringBuilder()).append(" Can't morph from ").append(s1).append(" to ").append(s2).toString());
	//* 120  252:goto            98
		typedarray = ((TypedArray) (PropertyValuesHolder.ofObject(s, ((TypeEvaluator) (typedarray)), new Object[] {
			apathdatanode, apathdatanode1
		})));
	//  121  255:aload           4
	//  122  257:aload_0         
	//  123  258:iconst_2        
	//  124  259:anewarray       Object[]
	//  125  262:dup             
	//  126  263:iconst_0        
	//  127  264:aload           15
	//  128  266:aastore         
	//  129  267:dup             
	//  130  268:iconst_1        
	//  131  269:aload           16
	//  132  271:aastore         
	//  133  272:invokestatic    #288 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(String, TypeEvaluator, Object[])>
	//  134  275:astore_0        
_L5:
		return ((PropertyValuesHolder) (typedarray));
	//  135  276:aload_0         
	//  136  277:areturn         
_L9:
		return PropertyValuesHolder.ofObject(s, ((TypeEvaluator) (typedarray)), new Object[] {
			apathdatanode
		});
	//  137  278:aload           4
	//  138  280:aload_0         
	//  139  281:iconst_1        
	//  140  282:anewarray       Object[]
	//  141  285:dup             
	//  142  286:iconst_0        
	//  143  287:aload           15
	//  144  289:aastore         
	//  145  290:invokestatic    #288 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(String, TypeEvaluator, Object[])>
	//  146  293:areturn         
_L7:
		typedarray = ((TypedArray) (obj));
	//  147  294:aload           12
	//  148  296:astore_0        
		if(apathdatanode1 != null)
	//* 149  297:aload           16
	//* 150  299:ifnull          276
			return PropertyValuesHolder.ofObject(s, ((TypeEvaluator) (new PathDataEvaluator())), new Object[] {
				apathdatanode1
			});
	//  151  302:aload           4
	//  152  304:new             #8   <Class AnimatorInflaterCompat$PathDataEvaluator>
	//  153  307:dup             
	//  154  308:aconst_null     
	//  155  309:invokespecial   #272 <Method void AnimatorInflaterCompat$PathDataEvaluator(AnimatorInflaterCompat$1)>
	//  156  312:iconst_1        
	//  157  313:anewarray       Object[]
	//  158  316:dup             
	//  159  317:iconst_0        
	//  160  318:aload           16
	//  161  320:aastore         
	//  162  321:invokestatic    #288 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(String, TypeEvaluator, Object[])>
	//  163  324:areturn         
		continue; /* Loop/switch isn't completed */
_L2:
		ArgbEvaluator argbevaluator = null;
	//  164  325:aconst_null     
	//  165  326:astore          13
		if(l == 3)
	//* 166  328:iload           7
	//* 167  330:iconst_3        
	//* 168  331:icmpne          339
			argbevaluator = ArgbEvaluator.getInstance();
	//  169  334:invokestatic    #294 <Method ArgbEvaluator ArgbEvaluator.getInstance()>
	//  170  337:astore          13
		if(i == 0)
			break; /* Loop/switch isn't completed */
	//  171  339:iload_1         
	//  172  340:ifeq            510
		if(flag)
	//* 173  343:iload           8
	//* 174  345:ifeq            467
		{
			float f;
			if(i1 == 5)
	//* 175  348:iload           10
	//* 176  350:iconst_5        
	//* 177  351:icmpne          427
				f = typedarray.getDimension(j, 0.0F);
	//  178  354:aload_0         
	//  179  355:iload_2         
	//  180  356:fconst_0        
	//  181  357:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//  182  360:fstore          5
			else
	//* 183  362:iload           9
	//* 184  364:ifeq            449
	//* 185  367:iload           11
	//* 186  369:iconst_5        
	//* 187  370:icmpne          438
	//* 188  373:aload_0         
	//* 189  374:iload_3         
	//* 190  375:fconst_0        
	//* 191  376:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//* 192  379:fstore          6
	//* 193  381:aload           4
	//* 194  383:iconst_2        
	//* 195  384:newarray        float[]
	//* 196  386:dup             
	//* 197  387:iconst_0        
	//* 198  388:fload           5
	//* 199  390:fastore         
	//* 200  391:dup             
	//* 201  392:iconst_1        
	//* 202  393:fload           6
	//* 203  395:fastore         
	//* 204  396:invokestatic    #301 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//* 205  399:astore          12
	//* 206  401:aload           12
	//* 207  403:astore_0        
	//* 208  404:aload           12
	//* 209  406:ifnull          276
	//* 210  409:aload           12
	//* 211  411:astore_0        
	//* 212  412:aload           13
	//* 213  414:ifnull          276
	//* 214  417:aload           12
	//* 215  419:aload           13
	//* 216  421:invokevirtual   #305 <Method void PropertyValuesHolder.setEvaluator(TypeEvaluator)>
	//* 217  424:aload           12
	//* 218  426:areturn         
				f = typedarray.getFloat(j, 0.0F);
	//  219  427:aload_0         
	//  220  428:iload_2         
	//  221  429:fconst_0        
	//  222  430:invokevirtual   #308 <Method float TypedArray.getFloat(int, float)>
	//  223  433:fstore          5
			if(flag1)
			{
				float f2;
				if(j1 == 5)
					f2 = typedarray.getDimension(k, 0.0F);
				else
	//* 224  435:goto            362
					f2 = typedarray.getFloat(k, 0.0F);
	//  225  438:aload_0         
	//  226  439:iload_3         
	//  227  440:fconst_0        
	//  228  441:invokevirtual   #308 <Method float TypedArray.getFloat(int, float)>
	//  229  444:fstore          6
				obj = ((Object) (PropertyValuesHolder.ofFloat(s, new float[] {
					f, f2
				})));
			} else
	//* 230  446:goto            381
			{
				obj = ((Object) (PropertyValuesHolder.ofFloat(s, new float[] {
					f
				})));
	//  231  449:aload           4
	//  232  451:iconst_1        
	//  233  452:newarray        float[]
	//  234  454:dup             
	//  235  455:iconst_0        
	//  236  456:fload           5
	//  237  458:fastore         
	//  238  459:invokestatic    #301 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  239  462:astore          12
			}
		} else
	//* 240  464:goto            401
		{
			float f1;
			if(j1 == 5)
	//* 241  467:iload           11
	//* 242  469:iconst_5        
	//* 243  470:icmpne          499
				f1 = typedarray.getDimension(k, 0.0F);
	//  244  473:aload_0         
	//  245  474:iload_3         
	//  246  475:fconst_0        
	//  247  476:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//  248  479:fstore          5
			else
	//* 249  481:aload           4
	//* 250  483:iconst_1        
	//* 251  484:newarray        float[]
	//* 252  486:dup             
	//* 253  487:iconst_0        
	//* 254  488:fload           5
	//* 255  490:fastore         
	//* 256  491:invokestatic    #301 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//* 257  494:astore          12
	//* 258  496:goto            401
				f1 = typedarray.getFloat(k, 0.0F);
	//  259  499:aload_0         
	//  260  500:iload_3         
	//  261  501:fconst_0        
	//  262  502:invokevirtual   #308 <Method float TypedArray.getFloat(int, float)>
	//  263  505:fstore          5
			obj = ((Object) (PropertyValuesHolder.ofFloat(s, new float[] {
				f1
			})));
		}
_L11:
		typedarray = ((TypedArray) (obj));
		if(obj != null)
		{
			typedarray = ((TypedArray) (obj));
			if(argbevaluator != null)
			{
				((PropertyValuesHolder) (obj)).setEvaluator(((TypeEvaluator) (argbevaluator)));
				return ((PropertyValuesHolder) (obj));
			}
		}
		if(true) goto _L5; else goto _L10
	//* 264  507:goto            481
_L10:
		if(flag)
	//* 265  510:iload           8
	//* 266  512:ifeq            642
		{
			if(i1 == 5)
	//* 267  515:iload           10
	//* 268  517:iconst_5        
	//* 269  518:icmpne          569
				i = (int)typedarray.getDimension(j, 0.0F);
	//  270  521:aload_0         
	//  271  522:iload_2         
	//  272  523:fconst_0        
	//  273  524:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//  274  527:f2i             
	//  275  528:istore_1        
			else
	//* 276  529:iload           9
	//* 277  531:ifeq            625
	//* 278  534:iload           11
	//* 279  536:iconst_5        
	//* 280  537:icmpne          597
	//* 281  540:aload_0         
	//* 282  541:iload_3         
	//* 283  542:fconst_0        
	//* 284  543:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//* 285  546:f2i             
	//* 286  547:istore_2        
	//* 287  548:aload           4
	//* 288  550:iconst_2        
	//* 289  551:newarray        int[]
	//* 290  553:dup             
	//* 291  554:iconst_0        
	//* 292  555:iload_1         
	//* 293  556:iastore         
	//* 294  557:dup             
	//* 295  558:iconst_1        
	//* 296  559:iload_2         
	//* 297  560:iastore         
	//* 298  561:invokestatic    #311 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//* 299  564:astore          12
	//* 300  566:goto            401
			if(isColorType(i1))
	//* 301  569:iload           10
	//* 302  571:invokestatic    #259 <Method boolean isColorType(int)>
	//* 303  574:ifeq            587
				i = typedarray.getColor(j, 0);
	//  304  577:aload_0         
	//  305  578:iload_2         
	//  306  579:iconst_0        
	//  307  580:invokevirtual   #315 <Method int TypedArray.getColor(int, int)>
	//  308  583:istore_1        
			else
	//* 309  584:goto            529
				i = typedarray.getInt(j, 0);
	//  310  587:aload_0         
	//  311  588:iload_2         
	//  312  589:iconst_0        
	//  313  590:invokevirtual   #318 <Method int TypedArray.getInt(int, int)>
	//  314  593:istore_1        
			if(flag1)
			{
				if(j1 == 5)
					j = (int)typedarray.getDimension(k, 0.0F);
				else
	//* 315  594:goto            529
				if(isColorType(j1))
	//* 316  597:iload           11
	//* 317  599:invokestatic    #259 <Method boolean isColorType(int)>
	//* 318  602:ifeq            615
					j = typedarray.getColor(k, 0);
	//  319  605:aload_0         
	//  320  606:iload_3         
	//  321  607:iconst_0        
	//  322  608:invokevirtual   #315 <Method int TypedArray.getColor(int, int)>
	//  323  611:istore_2        
				else
	//* 324  612:goto            548
					j = typedarray.getInt(k, 0);
	//  325  615:aload_0         
	//  326  616:iload_3         
	//  327  617:iconst_0        
	//  328  618:invokevirtual   #318 <Method int TypedArray.getInt(int, int)>
	//  329  621:istore_2        
				obj = ((Object) (PropertyValuesHolder.ofInt(s, new int[] {
					i, j
				})));
			} else
	//* 330  622:goto            548
			{
				obj = ((Object) (PropertyValuesHolder.ofInt(s, new int[] {
					i
				})));
	//  331  625:aload           4
	//  332  627:iconst_1        
	//  333  628:newarray        int[]
	//  334  630:dup             
	//  335  631:iconst_0        
	//  336  632:iload_1         
	//  337  633:iastore         
	//  338  634:invokestatic    #311 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//  339  637:astore          12
			}
		} else
	//* 340  639:goto            401
		{
			obj = ((Object) (s2));
	//  341  642:aload           14
	//  342  644:astore          12
			if(flag1)
	//* 343  646:iload           9
	//* 344  648:ifeq            401
			{
				if(j1 == 5)
	//* 345  651:iload           11
	//* 346  653:iconst_5        
	//* 347  654:icmpne          682
					i = (int)typedarray.getDimension(k, 0.0F);
	//  348  657:aload_0         
	//  349  658:iload_3         
	//  350  659:fconst_0        
	//  351  660:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//  352  663:f2i             
	//  353  664:istore_1        
				else
	//* 354  665:aload           4
	//* 355  667:iconst_1        
	//* 356  668:newarray        int[]
	//* 357  670:dup             
	//* 358  671:iconst_0        
	//* 359  672:iload_1         
	//* 360  673:iastore         
	//* 361  674:invokestatic    #311 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//* 362  677:astore          12
	//* 363  679:goto            401
				if(isColorType(j1))
	//* 364  682:iload           11
	//* 365  684:invokestatic    #259 <Method boolean isColorType(int)>
	//* 366  687:ifeq            700
					i = typedarray.getColor(k, 0);
	//  367  690:aload_0         
	//  368  691:iload_3         
	//  369  692:iconst_0        
	//  370  693:invokevirtual   #315 <Method int TypedArray.getColor(int, int)>
	//  371  696:istore_1        
				else
	//* 372  697:goto            665
					i = typedarray.getInt(k, 0);
	//  373  700:aload_0         
	//  374  701:iload_3         
	//  375  702:iconst_0        
	//  376  703:invokevirtual   #318 <Method int TypedArray.getInt(int, int)>
	//  377  706:istore_1        
				obj = ((Object) (PropertyValuesHolder.ofInt(s, new int[] {
					i
				})));
			}
		}
		  goto _L11
		if(true) goto _L5; else goto _L12
_L12:
	//* 378  707:goto            665
	}

	private static int inferValueTypeFromValues(TypedArray typedarray, int i, int j)
	{
		int l = 1;
	//    0    0:iconst_1        
	//    1    1:istore          4
		TypedValue typedvalue = typedarray.peekValue(i);
	//    2    3:aload_0         
	//    3    4:iload_1         
	//    4    5:invokevirtual   #250 <Method TypedValue TypedArray.peekValue(int)>
	//    5    8:astore          5
		int k;
		if(typedvalue != null)
	//*   6   10:aload           5
	//*   7   12:ifnull          75
			i = 1;
	//    8   15:iconst_1        
	//    9   16:istore_1        
		else
	//*  10   17:iload_1         
	//*  11   18:ifeq            80
	//*  12   21:aload           5
	//*  13   23:getfield        #255 <Field int TypedValue.type>
	//*  14   26:istore_3        
	//*  15   27:aload_0         
	//*  16   28:iload_2         
	//*  17   29:invokevirtual   #250 <Method TypedValue TypedArray.peekValue(int)>
	//*  18   32:astore_0        
	//*  19   33:aload_0         
	//*  20   34:ifnull          85
	//*  21   37:iload           4
	//*  22   39:istore_2        
	//*  23   40:iload_2         
	//*  24   41:ifeq            90
	//*  25   44:aload_0         
	//*  26   45:getfield        #255 <Field int TypedValue.type>
	//*  27   48:istore          4
	//*  28   50:iload_1         
	//*  29   51:ifeq            61
	//*  30   54:iload_3         
	//*  31   55:invokestatic    #259 <Method boolean isColorType(int)>
	//*  32   58:ifne            73
	//*  33   61:iload_2         
	//*  34   62:ifeq            96
	//*  35   65:iload           4
	//*  36   67:invokestatic    #259 <Method boolean isColorType(int)>
	//*  37   70:ifeq            96
	//*  38   73:iconst_3        
	//*  39   74:ireturn         
			i = 0;
	//   40   75:iconst_0        
	//   41   76:istore_1        
		if(i != 0)
			k = typedvalue.type;
		else
	//*  42   77:goto            17
			k = 0;
	//   43   80:iconst_0        
	//   44   81:istore_3        
		typedarray = ((TypedArray) (typedarray.peekValue(j)));
		if(typedarray != null)
			j = l;
		else
	//*  45   82:goto            27
			j = 0;
	//   46   85:iconst_0        
	//   47   86:istore_2        
		if(j != 0)
			l = ((TypedValue) (typedarray)).type;
		else
	//*  48   87:goto            40
			l = 0;
	//   49   90:iconst_0        
	//   50   91:istore          4
		return (i == 0 || !isColorType(k)) && (j == 0 || !isColorType(l)) ? 0 : 3;
	//   51   93:goto            50
	//   52   96:iconst_0        
	//   53   97:ireturn         
	}

	private static int inferValueTypeOfKeyframe(Resources resources, android.content.res.Resources.Theme theme, AttributeSet attributeset, XmlPullParser xmlpullparser)
	{
		byte byte0 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
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
		if(theme != null)
	//*  14   23:aload_1         
	//*  15   24:ifnull          30
			byte0 = 1;
	//   16   27:iconst_1        
	//   17   28:istore          4
		if(byte0 && isColorType(((TypedValue) (theme)).type))
	//*  18   30:iload           4
	//*  19   32:ifeq            55
	//*  20   35:aload_1         
	//*  21   36:getfield        #255 <Field int TypedValue.type>
	//*  22   39:invokestatic    #259 <Method boolean isColorType(int)>
	//*  23   42:ifeq            55
			byte0 = 3;
	//   24   45:iconst_3        
	//   25   46:istore          4
		else
	//*  26   48:aload_0         
	//*  27   49:invokevirtual   #119 <Method void TypedArray.recycle()>
	//*  28   52:iload           4
	//*  29   54:ireturn         
			byte0 = 0;
	//   30   55:iconst_0        
	//   31   56:istore          4
		((TypedArray) (resources)).recycle();
		return ((int) (byte0));
	//*  32   58:goto            48
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
	//   99  220:goto            211
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
		int l;
		int i1;
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          13
		ArrayList arraylist = null;
	//    2    3:aconst_null     
	//    3    4:astore          11
		l = i;
	//    4    6:iload           5
	//    5    8:istore          8
		do
		{
			i = xmlpullparser.next();
	//    6   10:aload_3         
	//    7   11:invokeinterface #63  <Method int XmlPullParser.next()>
	//    8   16:istore          5
			if(i == 3 || i == 1)
				break;
	//    9   18:iload           5
	//   10   20:iconst_3        
	//   11   21:icmpeq          135
	//   12   24:iload           5
	//   13   26:iconst_1        
	//   14   27:icmpeq          135
			if(xmlpullparser.getName().equals("keyframe"))
	//*  15   30:aload_3         
	//*  16   31:invokeinterface #67  <Method String XmlPullParser.getName()>
	//*  17   36:ldc2            #432 <String "keyframe">
	//*  18   39:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  19   42:ifeq            10
			{
				i = l;
	//   20   45:iload           8
	//   21   47:istore          5
				if(l == 4)
	//*  22   49:iload           8
	//*  23   51:iconst_4        
	//*  24   52:icmpne          67
					i = inferValueTypeOfKeyframe(resources, theme, Xml.asAttributeSet(xmlpullparser), xmlpullparser);
	//   25   55:aload_1         
	//   26   56:aload_2         
	//   27   57:aload_3         
	//   28   58:invokestatic    #50  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   29   61:aload_3         
	//   30   62:invokestatic    #434 <Method int inferValueTypeOfKeyframe(Resources, android.content.res.Resources$Theme, AttributeSet, XmlPullParser)>
	//   31   65:istore          5
				Keyframe keyframe = loadKeyframe(context, resources, theme, Xml.asAttributeSet(xmlpullparser), i, xmlpullparser);
	//   32   67:aload_0         
	//   33   68:aload_1         
	//   34   69:aload_2         
	//   35   70:aload_3         
	//   36   71:invokestatic    #50  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   37   74:iload           5
	//   38   76:aload_3         
	//   39   77:invokestatic    #436 <Method Keyframe loadKeyframe(Context, Resources, android.content.res.Resources$Theme, AttributeSet, int, XmlPullParser)>
	//   40   80:astore          14
				ArrayList arraylist1 = arraylist;
	//   41   82:aload           11
	//   42   84:astore          12
				if(keyframe != null)
	//*  43   86:aload           14
	//*  44   88:ifnull          117
				{
					arraylist1 = arraylist;
	//   45   91:aload           11
	//   46   93:astore          12
					if(arraylist == null)
	//*  47   95:aload           11
	//*  48   97:ifnonnull       109
						arraylist1 = new ArrayList();
	//   49  100:new             #81  <Class ArrayList>
	//   50  103:dup             
	//   51  104:invokespecial   #82  <Method void ArrayList()>
	//   52  107:astore          12
					arraylist1.add(((Object) (keyframe)));
	//   53  109:aload           12
	//   54  111:aload           14
	//   55  113:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//   56  116:pop             
				}
				xmlpullparser.next();
	//   57  117:aload_3         
	//   58  118:invokeinterface #63  <Method int XmlPullParser.next()>
	//   59  123:pop             
				arraylist = arraylist1;
	//   60  124:aload           12
	//   61  126:astore          11
				l = i;
	//   62  128:iload           5
	//   63  130:istore          8
			}
		} while(true);
	//   64  132:goto            10
		context = ((Context) (obj));
	//   65  135:aload           13
	//   66  137:astore_0        
		if(arraylist == null)
			break MISSING_BLOCK_LABEL_462;
	//   67  138:aload           11
	//   68  140:ifnull          462
		int j = arraylist.size();
	//   69  143:aload           11
	//   70  145:invokevirtual   #151 <Method int ArrayList.size()>
	//   71  148:istore          7
		context = ((Context) (obj));
	//   72  150:aload           13
	//   73  152:astore_0        
		if(j <= 0)
			break MISSING_BLOCK_LABEL_462;
	//   74  153:iload           7
	//   75  155:ifle            462
		context = ((Context) ((Keyframe)arraylist.get(0)));
	//   76  158:aload           11
	//   77  160:iconst_0        
	//   78  161:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//   79  164:checkcast       #177 <Class Keyframe>
	//   80  167:astore_0        
		resources = ((Resources) ((Keyframe)arraylist.get(j - 1)));
	//   81  168:aload           11
	//   82  170:iload           7
	//   83  172:iconst_1        
	//   84  173:isub            
	//   85  174:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//   86  177:checkcast       #177 <Class Keyframe>
	//   87  180:astore_1        
		float f = ((Keyframe) (resources)).getFraction();
	//   88  181:aload_1         
	//   89  182:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//   90  185:fstore          6
		i = j;
	//   91  187:iload           7
	//   92  189:istore          5
		if(f < 1.0F)
	//*  93  191:fload           6
	//*  94  193:fconst_1        
	//*  95  194:fcmpg           
	//*  96  195:ifge            214
			if(f < 0.0F)
	//*  97  198:fload           6
	//*  98  200:fconst_0        
	//*  99  201:fcmpg           
	//* 100  202:ifge            303
			{
				((Keyframe) (resources)).setFraction(1.0F);
	//  101  205:aload_1         
	//  102  206:fconst_1        
	//  103  207:invokevirtual   #210 <Method void Keyframe.setFraction(float)>
				i = j;
	//  104  210:iload           7
	//  105  212:istore          5
			} else
	//* 106  214:aload_0         
	//* 107  215:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//* 108  218:fstore          6
	//* 109  220:iload           5
	//* 110  222:istore          9
	//* 111  224:fload           6
	//* 112  226:fconst_0        
	//* 113  227:fcmpl           
	//* 114  228:ifeq            247
	//* 115  231:fload           6
	//* 116  233:fconst_0        
	//* 117  234:fcmpg           
	//* 118  235:ifge            327
	//* 119  238:aload_0         
	//* 120  239:fconst_0        
	//* 121  240:invokevirtual   #210 <Method void Keyframe.setFraction(float)>
	//* 122  243:iload           5
	//* 123  245:istore          9
	//* 124  247:iload           9
	//* 125  249:anewarray       Keyframe[]
	//* 126  252:astore_0        
	//* 127  253:aload           11
	//* 128  255:aload_0         
	//* 129  256:invokevirtual   #444 <Method Object[] ArrayList.toArray(Object[])>
	//* 130  259:pop             
	//* 131  260:iconst_0        
	//* 132  261:istore          5
	//* 133  263:iload           5
	//* 134  265:iload           9
	//* 135  267:icmpge          438
	//* 136  270:aload_0         
	//* 137  271:iload           5
	//* 138  273:aaload          
	//* 139  274:astore_1        
	//* 140  275:aload_1         
	//* 141  276:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//* 142  279:fconst_0        
	//* 143  280:fcmpg           
	//* 144  281:ifge            294
	//* 145  284:iload           5
	//* 146  286:ifne            347
	//* 147  289:aload_1         
	//* 148  290:fconst_0        
	//* 149  291:invokevirtual   #210 <Method void Keyframe.setFraction(float)>
	//* 150  294:iload           5
	//* 151  296:iconst_1        
	//* 152  297:iadd            
	//* 153  298:istore          5
	//* 154  300:goto            263
			{
				arraylist.add(arraylist.size(), ((Object) (createNewKeyframe(((Keyframe) (resources)), 1.0F))));
	//  155  303:aload           11
	//  156  305:aload           11
	//  157  307:invokevirtual   #151 <Method int ArrayList.size()>
	//  158  310:aload_1         
	//  159  311:fconst_1        
	//  160  312:invokestatic    #446 <Method Keyframe createNewKeyframe(Keyframe, float)>
	//  161  315:invokevirtual   #449 <Method void ArrayList.add(int, Object)>
				i = j + 1;
	//  162  318:iload           7
	//  163  320:iconst_1        
	//  164  321:iadd            
	//  165  322:istore          5
			}
		f = ((Keyframe) (context)).getFraction();
		i1 = i;
		if(f != 0.0F)
			if(f < 0.0F)
			{
				((Keyframe) (context)).setFraction(0.0F);
				i1 = i;
			} else
	//* 166  324:goto            214
			{
				arraylist.add(0, ((Object) (createNewKeyframe(((Keyframe) (context)), 0.0F))));
	//  167  327:aload           11
	//  168  329:iconst_0        
	//  169  330:aload_0         
	//  170  331:fconst_0        
	//  171  332:invokestatic    #446 <Method Keyframe createNewKeyframe(Keyframe, float)>
	//  172  335:invokevirtual   #449 <Method void ArrayList.add(int, Object)>
				i1 = i + 1;
	//  173  338:iload           5
	//  174  340:iconst_1        
	//  175  341:iadd            
	//  176  342:istore          9
			}
		context = ((Context) (new Keyframe[i1]));
		arraylist.toArray(((Object []) (context)));
		i = 0;
		if(i >= i1)
			break; /* Loop/switch isn't completed */
		resources = ((Resources) (context[i]));
		if(((Keyframe) (resources)).getFraction() < 0.0F)
			if(i == 0)
			{
				((Keyframe) (resources)).setFraction(0.0F);
			} else
	//* 177  344:goto            247
			{
label0:
				{
					if(i != i1 - 1)
						break label0;
	//  178  347:iload           5
	//  179  349:iload           9
	//  180  351:iconst_1        
	//  181  352:isub            
	//  182  353:icmpne          364
					((Keyframe) (resources)).setFraction(1.0F);
	//  183  356:aload_1         
	//  184  357:fconst_1        
	//  185  358:invokevirtual   #210 <Method void Keyframe.setFraction(float)>
				}
			}
_L5:
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_263;
	//* 186  361:goto            294
		int k;
		int j1;
		j1 = i;
	//  187  364:iload           5
	//  188  366:istore          10
		k = i + 1;
	//  189  368:iload           5
	//  190  370:iconst_1        
	//  191  371:iadd            
	//  192  372:istore          7
_L3:
label1:
		{
			if(k < i1 - 1 && ((Keyframe) (context[k])).getFraction() < 0.0F)
				break label1;
	//  193  374:iload           7
	//  194  376:iload           9
	//  195  378:iconst_1        
	//  196  379:isub            
	//  197  380:icmpge          395
	//  198  383:aload_0         
	//  199  384:iload           7
	//  200  386:aaload          
	//  201  387:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//  202  390:fconst_0        
	//  203  391:fcmpl           
	//  204  392:iflt            425
			distributeKeyframes(((Keyframe []) (context)), ((Keyframe) (context[j1 + 1])).getFraction() - ((Keyframe) (context[i - 1])).getFraction(), i, j1);
	//  205  395:aload_0         
	//  206  396:aload_0         
	//  207  397:iload           10
	//  208  399:iconst_1        
	//  209  400:iadd            
	//  210  401:aaload          
	//  211  402:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//  212  405:aload_0         
	//  213  406:iload           5
	//  214  408:iconst_1        
	//  215  409:isub            
	//  216  410:aaload          
	//  217  411:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//  218  414:fsub            
	//  219  415:iload           5
	//  220  417:iload           10
	//  221  419:invokestatic    #451 <Method void distributeKeyframes(Keyframe[], float, int, int)>
		}
		continue; /* Loop/switch isn't completed */
	//  222  422:goto            294
		j1 = k;
	//  223  425:iload           7
	//  224  427:istore          10
		k++;
	//  225  429:iload           7
	//  226  431:iconst_1        
	//  227  432:iadd            
	//  228  433:istore          7
		if(true) goto _L3; else goto _L1
	//  229  435:goto            374
_L1:
		resources = ((Resources) (PropertyValuesHolder.ofKeyframe(s, ((Keyframe []) (context)))));
	//  230  438:aload           4
	//  231  440:aload_0         
	//  232  441:invokestatic    #455 <Method PropertyValuesHolder PropertyValuesHolder.ofKeyframe(String, Keyframe[])>
	//  233  444:astore_1        
		context = ((Context) (resources));
	//  234  445:aload_1         
	//  235  446:astore_0        
		if(l == 3)
	//* 236  447:iload           8
	//* 237  449:iconst_3        
	//* 238  450:icmpne          462
		{
			((PropertyValuesHolder) (resources)).setEvaluator(((TypeEvaluator) (ArgbEvaluator.getInstance())));
	//  239  453:aload_1         
	//  240  454:invokestatic    #294 <Method ArgbEvaluator ArgbEvaluator.getInstance()>
	//  241  457:invokevirtual   #305 <Method void PropertyValuesHolder.setEvaluator(TypeEvaluator)>
			context = ((Context) (resources));
	//  242  460:aload_1         
	//  243  461:astore_0        
		}
		return ((PropertyValuesHolder) (context));
	//  244  462:aload_0         
	//  245  463:areturn         
		if(true) goto _L5; else goto _L4
_L4:
	}

	private static PropertyValuesHolder[] loadValues(Context context, Resources resources, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser, AttributeSet attributeset)
		throws XmlPullParserException, IOException
	{
		Object obj = null;
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
	//    7   14:icmpeq          183
	//    8   17:iload           5
	//    9   19:iconst_1        
	//   10   20:icmpeq          183
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
				Object obj1 = obj;
	//   18   39:aload           7
	//   19   41:astore          8
				if(xmlpullparser.getName().equals("propertyValuesHolder"))
	//*  20   43:aload_3         
	//*  21   44:invokeinterface #67  <Method String XmlPullParser.getName()>
	//*  22   49:ldc1            #121 <String "propertyValuesHolder">
	//*  23   51:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  24   54:ifeq            169
				{
					TypedArray typedarray = TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER);
	//   25   57:aload_1         
	//   26   58:aload_2         
	//   27   59:aload           4
	//   28   61:getstatic       #461 <Field int[] AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER>
	//   29   64:invokestatic    #108 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   30   67:astore          10
					String s = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "propertyName", 3);
	//   31   69:aload           10
	//   32   71:aload_3         
	//   33   72:ldc2            #463 <String "propertyName">
	//   34   75:iconst_3        
	//   35   76:invokestatic    #467 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   36   79:astore          11
					int j = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "valueType", 2, 4);
	//   37   81:aload           10
	//   38   83:aload_3         
	//   39   84:ldc2            #469 <String "valueType">
	//   40   87:iconst_2        
	//   41   88:iconst_4        
	//   42   89:invokestatic    #114 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   43   92:istore          5
					obj1 = ((Object) (loadPvh(context, resources, theme, xmlpullparser, s, j)));
	//   44   94:aload_0         
	//   45   95:aload_1         
	//   46   96:aload_2         
	//   47   97:aload_3         
	//   48   98:aload           11
	//   49  100:iload           5
	//   50  102:invokestatic    #471 <Method PropertyValuesHolder loadPvh(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, String, int)>
	//   51  105:astore          8
					Object obj2 = obj1;
	//   52  107:aload           8
	//   53  109:astore          9
					if(obj1 == null)
	//*  54  111:aload           8
	//*  55  113:ifnonnull       129
						obj2 = ((Object) (getPVH(typedarray, j, 0, 1, s)));
	//   56  116:aload           10
	//   57  118:iload           5
	//   58  120:iconst_0        
	//   59  121:iconst_1        
	//   60  122:aload           11
	//   61  124:invokestatic    #473 <Method PropertyValuesHolder getPVH(TypedArray, int, int, int, String)>
	//   62  127:astore          9
					obj1 = obj;
	//   63  129:aload           7
	//   64  131:astore          8
					if(obj2 != null)
	//*  65  133:aload           9
	//*  66  135:ifnull          164
					{
						obj1 = obj;
	//   67  138:aload           7
	//   68  140:astore          8
						if(obj == null)
	//*  69  142:aload           7
	//*  70  144:ifnonnull       156
							obj1 = ((Object) (new ArrayList()));
	//   71  147:new             #81  <Class ArrayList>
	//   72  150:dup             
	//   73  151:invokespecial   #82  <Method void ArrayList()>
	//   74  154:astore          8
						((ArrayList) (obj1)).add(obj2);
	//   75  156:aload           8
	//   76  158:aload           9
	//   77  160:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//   78  163:pop             
					}
					typedarray.recycle();
	//   79  164:aload           10
	//   80  166:invokevirtual   #119 <Method void TypedArray.recycle()>
				}
				xmlpullparser.next();
	//   81  169:aload_3         
	//   82  170:invokeinterface #63  <Method int XmlPullParser.next()>
	//   83  175:pop             
				obj = obj1;
	//   84  176:aload           8
	//   85  178:astore          7
			}
		} while(true);
	//   86  180:goto            3
		context = null;
	//   87  183:aconst_null     
	//   88  184:astore_0        
		if(obj != null)
	//*  89  185:aload           7
	//*  90  187:ifnull          238
		{
			int l = ((ArrayList) (obj)).size();
	//   91  190:aload           7
	//   92  192:invokevirtual   #151 <Method int ArrayList.size()>
	//   93  195:istore          6
			resources = ((Resources) (new PropertyValuesHolder[l]));
	//   94  197:iload           6
	//   95  199:anewarray       PropertyValuesHolder[]
	//   96  202:astore_1        
			int k = 0;
	//   97  203:iconst_0        
	//   98  204:istore          5
			do
			{
				context = ((Context) (resources));
	//   99  206:aload_1         
	//  100  207:astore_0        
				if(k >= l)
					break;
	//  101  208:iload           5
	//  102  210:iload           6
	//  103  212:icmpge          238
				resources[k] = ((/*<invalid signature>*/java.lang.Object) ((PropertyValuesHolder)((ArrayList) (obj)).get(k)));
	//  104  215:aload_1         
	//  105  216:iload           5
	//  106  218:aload           7
	//  107  220:iload           5
	//  108  222:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//  109  225:checkcast       #285 <Class PropertyValuesHolder>
	//  110  228:aastore         
				k++;
	//  111  229:iload           5
	//  112  231:iconst_1        
	//  113  232:iadd            
	//  114  233:istore          5
			} while(true);
	//  115  235:goto            206
		}
		return ((PropertyValuesHolder []) (context));
	//  116  238:aload_0         
	//  117  239:areturn         
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
	//    5    9:astore          12
		float f1 = 0.0F;
	//    6   11:fconst_0        
	//    7   12:fstore          5
		ArrayList arraylist = new ArrayList();
	//    8   14:new             #81  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #82  <Method void ArrayList()>
	//   11   21:astore          11
		arraylist.add(((Object) (Float.valueOf(0.0F))));
	//   12   23:aload           11
	//   13   25:fconst_0        
	//   14   26:invokestatic    #244 <Method Float Float.valueOf(float)>
	//   15   29:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//   16   32:pop             
		float f3;
		do
		{
			f3 = f1 + pathmeasure.getLength();
	//   17   33:fload           5
	//   18   35:aload           12
	//   19   37:invokevirtual   #543 <Method float PathMeasure.getLength()>
	//   20   40:fadd            
	//   21   41:fstore          6
			arraylist.add(((Object) (Float.valueOf(f3))));
	//   22   43:aload           11
	//   23   45:fload           6
	//   24   47:invokestatic    #244 <Method Float Float.valueOf(float)>
	//   25   50:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//   26   53:pop             
			f1 = f3;
	//   27   54:fload           6
	//   28   56:fstore          5
		} while(pathmeasure.nextContour());
	//   29   58:aload           12
	//   30   60:invokevirtual   #546 <Method boolean PathMeasure.nextContour()>
	//   31   63:ifne            33
		path = ((Path) (new PathMeasure(path, false)));
	//   32   66:new             #537 <Class PathMeasure>
	//   33   69:dup             
	//   34   70:aload_0         
	//   35   71:iconst_0        
	//   36   72:invokespecial   #540 <Method void PathMeasure(Path, boolean)>
	//   37   75:astore_0        
		int l = Math.min(100, (int)(f3 / f) + 1);
	//   38   76:bipush          100
	//   39   78:fload           6
	//   40   80:fload_2         
	//   41   81:fdiv            
	//   42   82:f2i             
	//   43   83:iconst_1        
	//   44   84:iadd            
	//   45   85:invokestatic    #551 <Method int Math.min(int, int)>
	//   46   88:istore          10
		float af1[] = new float[l];
	//   47   90:iload           10
	//   48   92:newarray        float[]
	//   49   94:astore          13
		float af[] = new float[l];
	//   50   96:iload           10
	//   51   98:newarray        float[]
	//   52  100:astore          12
		float af2[] = new float[2];
	//   53  102:iconst_2        
	//   54  103:newarray        float[]
	//   55  105:astore          14
		int j = 0;
	//   56  107:iconst_0        
	//   57  108:istore          8
		f3 /= l - 1;
	//   58  110:fload           6
	//   59  112:iload           10
	//   60  114:iconst_1        
	//   61  115:isub            
	//   62  116:i2f             
	//   63  117:fdiv            
	//   64  118:fstore          6
		f = 0.0F;
	//   65  120:fconst_0        
	//   66  121:fstore_2        
		for(int i = 0; i < l;)
	//*  67  122:iconst_0        
	//*  68  123:istore          7
	//*  69  125:iload           7
	//*  70  127:iload           10
	//*  71  129:icmpge          264
		{
			((PathMeasure) (path)).getPosTan(f, af2, ((float []) (null)));
	//   72  132:aload_0         
	//   73  133:fload_2         
	//   74  134:aload           14
	//   75  136:aconst_null     
	//   76  137:invokevirtual   #555 <Method boolean PathMeasure.getPosTan(float, float[], float[])>
	//   77  140:pop             
			((PathMeasure) (path)).getPosTan(f, af2, ((float []) (null)));
	//   78  141:aload_0         
	//   79  142:fload_2         
	//   80  143:aload           14
	//   81  145:aconst_null     
	//   82  146:invokevirtual   #555 <Method boolean PathMeasure.getPosTan(float, float[], float[])>
	//   83  149:pop             
			af1[i] = af2[0];
	//   84  150:aload           13
	//   85  152:iload           7
	//   86  154:aload           14
	//   87  156:iconst_0        
	//   88  157:faload          
	//   89  158:fastore         
			af[i] = af2[1];
	//   90  159:aload           12
	//   91  161:iload           7
	//   92  163:aload           14
	//   93  165:iconst_1        
	//   94  166:faload          
	//   95  167:fastore         
			float f2 = f + f3;
	//   96  168:fload_2         
	//   97  169:fload           6
	//   98  171:fadd            
	//   99  172:fstore          5
			int k = j;
	//  100  174:iload           8
	//  101  176:istore          9
			f = f2;
	//  102  178:fload           5
	//  103  180:fstore_2        
			if(j + 1 < arraylist.size())
	//* 104  181:iload           8
	//* 105  183:iconst_1        
	//* 106  184:iadd            
	//* 107  185:aload           11
	//* 108  187:invokevirtual   #151 <Method int ArrayList.size()>
	//* 109  190:icmpge          251
			{
				k = j;
	//  110  193:iload           8
	//  111  195:istore          9
				f = f2;
	//  112  197:fload           5
	//  113  199:fstore_2        
				if(f2 > ((Float)arraylist.get(j + 1)).floatValue())
	//* 114  200:fload           5
	//* 115  202:aload           11
	//* 116  204:iload           8
	//* 117  206:iconst_1        
	//* 118  207:iadd            
	//* 119  208:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//* 120  211:checkcast       #183 <Class Float>
	//* 121  214:invokevirtual   #558 <Method float Float.floatValue()>
	//* 122  217:fcmpl           
	//* 123  218:ifle            251
				{
					f = f2 - ((Float)arraylist.get(j + 1)).floatValue();
	//  124  221:fload           5
	//  125  223:aload           11
	//  126  225:iload           8
	//  127  227:iconst_1        
	//  128  228:iadd            
	//  129  229:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//  130  232:checkcast       #183 <Class Float>
	//  131  235:invokevirtual   #558 <Method float Float.floatValue()>
	//  132  238:fsub            
	//  133  239:fstore_2        
					k = j + 1;
	//  134  240:iload           8
	//  135  242:iconst_1        
	//  136  243:iadd            
	//  137  244:istore          9
					((PathMeasure) (path)).nextContour();
	//  138  246:aload_0         
	//  139  247:invokevirtual   #546 <Method boolean PathMeasure.nextContour()>
	//  140  250:pop             
				}
			}
			i++;
	//  141  251:iload           7
	//  142  253:iconst_1        
	//  143  254:iadd            
	//  144  255:istore          7
			j = k;
	//  145  257:iload           9
	//  146  259:istore          8
		}

	//* 147  261:goto            125
		path = null;
	//  148  264:aconst_null     
	//  149  265:astore_0        
		arraylist = null;
	//  150  266:aconst_null     
	//  151  267:astore          11
		if(s != null)
	//* 152  269:aload_3         
	//* 153  270:ifnull          280
			path = ((Path) (PropertyValuesHolder.ofFloat(s, af1)));
	//  154  273:aload_3         
	//  155  274:aload           13
	//  156  276:invokestatic    #301 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  157  279:astore_0        
		s = ((String) (arraylist));
	//  158  280:aload           11
	//  159  282:astore_3        
		if(s1 != null)
	//* 160  283:aload           4
	//* 161  285:ifnull          296
			s = ((String) (PropertyValuesHolder.ofFloat(s1, af)));
	//  162  288:aload           4
	//  163  290:aload           12
	//  164  292:invokestatic    #301 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  165  295:astore_3        
		if(path == null)
	//* 166  296:aload_0         
	//* 167  297:ifnonnull       313
		{
			objectanimator.setValues(new PropertyValuesHolder[] {
				s
			});
	//  168  300:aload_1         
	//  169  301:iconst_1        
	//  170  302:anewarray       PropertyValuesHolder[]
	//  171  305:dup             
	//  172  306:iconst_0        
	//  173  307:aload_3         
	//  174  308:aastore         
	//  175  309:invokevirtual   #559 <Method void ObjectAnimator.setValues(PropertyValuesHolder[])>
			return;
	//  176  312:return          
		}
		if(s == null)
	//* 177  313:aload_3         
	//* 178  314:ifnonnull       330
		{
			objectanimator.setValues(new PropertyValuesHolder[] {
				path
			});
	//  179  317:aload_1         
	//  180  318:iconst_1        
	//  181  319:anewarray       PropertyValuesHolder[]
	//  182  322:dup             
	//  183  323:iconst_0        
	//  184  324:aload_0         
	//  185  325:aastore         
	//  186  326:invokevirtual   #559 <Method void ObjectAnimator.setValues(PropertyValuesHolder[])>
			return;
	//  187  329:return          
		} else
		{
			objectanimator.setValues(new PropertyValuesHolder[] {
				path, s
			});
	//  188  330:aload_1         
	//  189  331:iconst_2        
	//  190  332:anewarray       PropertyValuesHolder[]
	//  191  335:dup             
	//  192  336:iconst_0        
	//  193  337:aload_0         
	//  194  338:aastore         
	//  195  339:dup             
	//  196  340:iconst_1        
	//  197  341:aload_3         
	//  198  342:aastore         
	//  199  343:invokevirtual   #559 <Method void ObjectAnimator.setValues(PropertyValuesHolder[])>
			return;
	//  200  346:return          
		}
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
