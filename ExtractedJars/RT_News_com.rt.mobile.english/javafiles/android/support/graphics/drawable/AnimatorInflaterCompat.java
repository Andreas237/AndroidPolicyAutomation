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
		ArrayList arraylist;
		Object obj1;
label0:
		{
			int l = xmlpullparser.getDepth();
	//    0    0:aload_3         
	//    1    1:invokeinterface #60  <Method int XmlPullParser.getDepth()>
	//    2    6:istore          9
			obj1 = null;
	//    3    8:aconst_null     
	//    4    9:astore          13
			arraylist = null;
	//    5   11:aconst_null     
	//    6   12:astore          12
			do
			{
				int j;
				int i1;
				do
				{
					i1 = xmlpullparser.next();
	//    7   14:aload_3         
	//    8   15:invokeinterface #63  <Method int XmlPullParser.next()>
	//    9   20:istore          10
					j = 0;
	//   10   22:iconst_0        
	//   11   23:istore          8
					if(i1 == 3 && xmlpullparser.getDepth() <= l || i1 == 1)
						break label0;
	//   12   25:iload           10
	//   13   27:iconst_3        
	//   14   28:icmpne          42
	//   15   31:aload_3         
	//   16   32:invokeinterface #60  <Method int XmlPullParser.getDepth()>
	//   17   37:iload           9
	//   18   39:icmple          342
	//   19   42:iload           10
	//   20   44:iconst_1        
	//   21   45:icmpeq          342
				} while(i1 != 2);
	//   22   48:iload           10
	//   23   50:iconst_2        
	//   24   51:icmpeq          57
	//*  25   54:goto            14
				Object obj = ((Object) (xmlpullparser.getName()));
	//   26   57:aload_3         
	//   27   58:invokeinterface #67  <Method String XmlPullParser.getName()>
	//   28   63:astore          11
				if(((String) (obj)).equals("objectAnimator"))
	//*  29   65:aload           11
	//*  30   67:ldc1            #69  <String "objectAnimator">
	//*  31   69:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  32   72:ifeq            91
					obj = ((Object) (loadObjectAnimator(context, resources, theme, attributeset, f, xmlpullparser)));
	//   33   75:aload_0         
	//   34   76:aload_1         
	//   35   77:aload_2         
	//   36   78:aload           4
	//   37   80:fload           7
	//   38   82:aload_3         
	//   39   83:invokestatic    #79  <Method ObjectAnimator loadObjectAnimator(Context, Resources, android.content.res.Resources$Theme, AttributeSet, float, XmlPullParser)>
	//   40   86:astore          11
				else
	//*  41   88:goto            249
				if(((String) (obj)).equals("animator"))
	//*  42   91:aload           11
	//*  43   93:ldc1            #81  <String "animator">
	//*  44   95:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  45   98:ifeq            118
					obj = ((Object) (loadAnimator(context, resources, theme, attributeset, ((ValueAnimator) (null)), f, xmlpullparser)));
	//   46  101:aload_0         
	//   47  102:aload_1         
	//   48  103:aload_2         
	//   49  104:aload           4
	//   50  106:aconst_null     
	//   51  107:fload           7
	//   52  109:aload_3         
	//   53  110:invokestatic    #85  <Method ValueAnimator loadAnimator(Context, Resources, android.content.res.Resources$Theme, AttributeSet, ValueAnimator, float, XmlPullParser)>
	//   54  113:astore          11
				else
	//*  55  115:goto            88
				if(((String) (obj)).equals("set"))
	//*  56  118:aload           11
	//*  57  120:ldc1            #87  <String "set">
	//*  58  122:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  59  125:ifeq            191
				{
					obj = ((Object) (new AnimatorSet()));
	//   60  128:new             #89  <Class AnimatorSet>
	//   61  131:dup             
	//   62  132:invokespecial   #90  <Method void AnimatorSet()>
	//   63  135:astore          11
					obj1 = ((Object) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_ANIMATOR_SET)));
	//   64  137:aload_1         
	//   65  138:aload_2         
	//   66  139:aload           4
	//   67  141:getstatic       #96  <Field int[] AndroidResources.STYLEABLE_ANIMATOR_SET>
	//   68  144:invokestatic    #102 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   69  147:astore          13
					j = TypedArrayUtils.getNamedInt(((TypedArray) (obj1)), xmlpullparser, "ordering", 0, 0);
	//   70  149:aload           13
	//   71  151:aload_3         
	//   72  152:ldc1            #104 <String "ordering">
	//   73  154:iconst_0        
	//   74  155:iconst_0        
	//   75  156:invokestatic    #108 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   76  159:istore          8
					createAnimatorFromXml(context, resources, theme, xmlpullparser, attributeset, (AnimatorSet)obj, j, f);
	//   77  161:aload_0         
	//   78  162:aload_1         
	//   79  163:aload_2         
	//   80  164:aload_3         
	//   81  165:aload           4
	//   82  167:aload           11
	//   83  169:checkcast       #89  <Class AnimatorSet>
	//   84  172:iload           8
	//   85  174:fload           7
	//   86  176:invokestatic    #53  <Method Animator createAnimatorFromXml(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, AttributeSet, AnimatorSet, int, float)>
	//   87  179:pop             
					((TypedArray) (obj1)).recycle();
	//   88  180:aload           13
	//   89  182:invokevirtual   #113 <Method void TypedArray.recycle()>
					j = 0;
	//   90  185:iconst_0        
	//   91  186:istore          8
				} else
	//*  92  188:goto            249
				{
					if(!((String) (obj)).equals("propertyValuesHolder"))
						break;
	//   93  191:aload           11
	//   94  193:ldc1            #115 <String "propertyValuesHolder">
	//   95  195:invokevirtual   #75  <Method boolean String.equals(Object)>
	//   96  198:ifeq            304
					obj = ((Object) (loadValues(context, resources, theme, xmlpullparser, Xml.asAttributeSet(xmlpullparser))));
	//   97  201:aload_0         
	//   98  202:aload_1         
	//   99  203:aload_2         
	//  100  204:aload_3         
	//  101  205:aload_3         
	//  102  206:invokestatic    #50  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//  103  209:invokestatic    #119 <Method PropertyValuesHolder[] loadValues(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, AttributeSet)>
	//  104  212:astore          11
					if(obj != null && obj1 != null && (obj1 instanceof ValueAnimator))
	//* 105  214:aload           11
	//* 106  216:ifnull          242
	//* 107  219:aload           13
	//* 108  221:ifnull          242
	//* 109  224:aload           13
	//* 110  226:instanceof      #121 <Class ValueAnimator>
	//* 111  229:ifeq            242
						((ValueAnimator)obj1).setValues(((PropertyValuesHolder []) (obj)));
	//  112  232:aload           13
	//  113  234:checkcast       #121 <Class ValueAnimator>
	//  114  237:aload           11
	//  115  239:invokevirtual   #125 <Method void ValueAnimator.setValues(PropertyValuesHolder[])>
					j = 1;
	//  116  242:iconst_1        
	//  117  243:istore          8
					obj = obj1;
	//  118  245:aload           13
	//  119  247:astore          11
				}
				obj1 = obj;
	//  120  249:aload           11
	//  121  251:astore          13
				if(animatorset != null)
	//* 122  253:aload           5
	//* 123  255:ifnull          14
				{
					obj1 = obj;
	//  124  258:aload           11
	//  125  260:astore          13
					if(j == 0)
	//* 126  262:iload           8
	//* 127  264:ifne            14
					{
						ArrayList arraylist1 = arraylist;
	//  128  267:aload           12
	//  129  269:astore          14
						if(arraylist == null)
	//* 130  271:aload           12
	//* 131  273:ifnonnull       285
							arraylist1 = new ArrayList();
	//  132  276:new             #127 <Class ArrayList>
	//  133  279:dup             
	//  134  280:invokespecial   #128 <Method void ArrayList()>
	//  135  283:astore          14
						arraylist1.add(obj);
	//  136  285:aload           14
	//  137  287:aload           11
	//  138  289:invokevirtual   #131 <Method boolean ArrayList.add(Object)>
	//  139  292:pop             
						obj1 = obj;
	//  140  293:aload           11
	//  141  295:astore          13
						arraylist = arraylist1;
	//  142  297:aload           14
	//  143  299:astore          12
					}
				}
			} while(true);
	//  144  301:goto            14
			context = ((Context) (new StringBuilder()));
	//  145  304:new             #133 <Class StringBuilder>
	//  146  307:dup             
	//  147  308:invokespecial   #134 <Method void StringBuilder()>
	//  148  311:astore_0        
			((StringBuilder) (context)).append("Unknown animator name: ");
	//  149  312:aload_0         
	//  150  313:ldc1            #136 <String "Unknown animator name: ">
	//  151  315:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//  152  318:pop             
			((StringBuilder) (context)).append(xmlpullparser.getName());
	//  153  319:aload_0         
	//  154  320:aload_3         
	//  155  321:invokeinterface #67  <Method String XmlPullParser.getName()>
	//  156  326:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//  157  329:pop             
			throw new RuntimeException(((StringBuilder) (context)).toString());
	//  158  330:new             #142 <Class RuntimeException>
	//  159  333:dup             
	//  160  334:aload_0         
	//  161  335:invokevirtual   #145 <Method String StringBuilder.toString()>
	//  162  338:invokespecial   #148 <Method void RuntimeException(String)>
	//  163  341:athrow          
		}
		if(animatorset != null && arraylist != null)
	//* 164  342:aload           5
	//* 165  344:ifnull          421
	//* 166  347:aload           12
	//* 167  349:ifnull          421
		{
			context = ((Context) (new Animator[arraylist.size()]));
	//  168  352:aload           12
	//  169  354:invokevirtual   #151 <Method int ArrayList.size()>
	//  170  357:anewarray       Animator[]
	//  171  360:astore_0        
			resources = ((Resources) (arraylist.iterator()));
	//  172  361:aload           12
	//  173  363:invokevirtual   #157 <Method Iterator ArrayList.iterator()>
	//  174  366:astore_1        
			for(int k = 0; ((Iterator) (resources)).hasNext(); k++)
	//* 175  367:iconst_0        
	//* 176  368:istore          8
	//* 177  370:aload_1         
	//* 178  371:invokeinterface #163 <Method boolean Iterator.hasNext()>
	//* 179  376:ifeq            401
				context[k] = ((/*<invalid signature>*/java.lang.Object) ((Animator)((Iterator) (resources)).next()));
	//  180  379:aload_0         
	//  181  380:iload           8
	//  182  382:aload_1         
	//  183  383:invokeinterface #166 <Method Object Iterator.next()>
	//  184  388:checkcast       #153 <Class Animator>
	//  185  391:aastore         

	//  186  392:iload           8
	//  187  394:iconst_1        
	//  188  395:iadd            
	//  189  396:istore          8
	//* 190  398:goto            370
			if(i == 0)
	//* 191  401:iload           6
	//* 192  403:ifne            415
			{
				animatorset.playTogether(((Animator []) (context)));
	//  193  406:aload           5
	//  194  408:aload_0         
	//  195  409:invokevirtual   #170 <Method void AnimatorSet.playTogether(Animator[])>
				return ((Animator) (obj1));
	//  196  412:aload           13
	//  197  414:areturn         
			}
			animatorset.playSequentially(((Animator []) (context)));
	//  198  415:aload           5
	//  199  417:aload_0         
	//  200  418:invokevirtual   #173 <Method void AnimatorSet.playSequentially(Animator[])>
		}
		return ((Animator) (obj1));
	//  201  421:aload           13
	//  202  423:areturn         
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
		if(aobj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          161
		{
			if(aobj.length == 0)
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            10
				return;
	//    5    9:return          
			Log.d("AnimatorInflater", s);
	//    6   10:ldc1            #23  <String "AnimatorInflater">
	//    7   12:aload_1         
	//    8   13:invokestatic    #218 <Method int Log.d(String, String)>
	//    9   16:pop             
			int j = aobj.length;
	//   10   17:aload_0         
	//   11   18:arraylength     
	//   12   19:istore_3        
			for(int i = 0; i < j; i++)
	//*  13   20:iconst_0        
	//*  14   21:istore_2        
	//*  15   22:iload_2         
	//*  16   23:iload_3         
	//*  17   24:icmpge          160
			{
				Keyframe keyframe = (Keyframe)aobj[i];
	//   18   27:aload_0         
	//   19   28:iload_2         
	//   20   29:aaload          
	//   21   30:checkcast       #177 <Class Keyframe>
	//   22   33:astore          5
				StringBuilder stringbuilder = new StringBuilder();
	//   23   35:new             #133 <Class StringBuilder>
	//   24   38:dup             
	//   25   39:invokespecial   #134 <Method void StringBuilder()>
	//   26   42:astore          4
				stringbuilder.append("Keyframe ");
	//   27   44:aload           4
	//   28   46:ldc1            #220 <String "Keyframe ">
	//   29   48:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   30   51:pop             
				stringbuilder.append(i);
	//   31   52:aload           4
	//   32   54:iload_2         
	//   33   55:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   34   58:pop             
				stringbuilder.append(": fraction ");
	//   35   59:aload           4
	//   36   61:ldc1            #225 <String ": fraction ">
	//   37   63:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   38   66:pop             
				if(keyframe.getFraction() < 0.0F)
	//*  39   67:aload           5
	//*  40   69:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//*  41   72:fconst_0        
	//*  42   73:fcmpg           
	//*  43   74:ifge            83
					s = "null";
	//   44   77:ldc1            #227 <String "null">
	//   45   79:astore_1        
				else
	//*  46   80:goto            92
					s = ((String) (Float.valueOf(keyframe.getFraction())));
	//   47   83:aload           5
	//   48   85:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//   49   88:invokestatic    #231 <Method Float Float.valueOf(float)>
	//   50   91:astore_1        
				stringbuilder.append(((Object) (s)));
	//   51   92:aload           4
	//   52   94:aload_1         
	//   53   95:invokevirtual   #234 <Method StringBuilder StringBuilder.append(Object)>
	//   54   98:pop             
				stringbuilder.append(", ");
	//   55   99:aload           4
	//   56  101:ldc1            #236 <String ", ">
	//   57  103:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   58  106:pop             
				stringbuilder.append(", value : ");
	//   59  107:aload           4
	//   60  109:ldc1            #238 <String ", value : ">
	//   61  111:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   62  114:pop             
				if(keyframe.hasValue())
	//*  63  115:aload           5
	//*  64  117:invokevirtual   #241 <Method boolean Keyframe.hasValue()>
	//*  65  120:ifeq            132
					s = ((String) (keyframe.getValue()));
	//   66  123:aload           5
	//   67  125:invokevirtual   #244 <Method Object Keyframe.getValue()>
	//   68  128:astore_1        
				else
	//*  69  129:goto            135
					s = "null";
	//   70  132:ldc1            #227 <String "null">
	//   71  134:astore_1        
				stringbuilder.append(((Object) (s)));
	//   72  135:aload           4
	//   73  137:aload_1         
	//   74  138:invokevirtual   #234 <Method StringBuilder StringBuilder.append(Object)>
	//   75  141:pop             
				Log.d("AnimatorInflater", stringbuilder.toString());
	//   76  142:ldc1            #23  <String "AnimatorInflater">
	//   77  144:aload           4
	//   78  146:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   79  149:invokestatic    #218 <Method int Log.d(String, String)>
	//   80  152:pop             
			}

	//   81  153:iload_2         
	//   82  154:iconst_1        
	//   83  155:iadd            
	//   84  156:istore_2        
	//*  85  157:goto            22
			return;
	//   86  160:return          
		} else
		{
			return;
	//   87  161:return          
		}
	}

	private static PropertyValuesHolder getPVH(TypedArray typedarray, int i, int j, int k, String s)
	{
label0:
		{
			TypedValue typedvalue = typedarray.peekValue(j);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #250 <Method TypedValue TypedArray.peekValue(int)>
	//    3    5:astore          12
			boolean flag;
			if(typedvalue != null)
	//*   4    7:aload           12
	//*   5    9:ifnull          18
				flag = true;
	//    6   12:iconst_1        
	//    7   13:istore          8
			else
	//*   8   15:goto            21
				flag = false;
	//    9   18:iconst_0        
	//   10   19:istore          8
			int i1;
			if(flag)
	//*  11   21:iload           8
	//*  12   23:ifeq            36
				i1 = typedvalue.type;
	//   13   26:aload           12
	//   14   28:getfield        #255 <Field int TypedValue.type>
	//   15   31:istore          10
			else
	//*  16   33:goto            39
				i1 = 0;
	//   17   36:iconst_0        
	//   18   37:istore          10
			typedvalue = typedarray.peekValue(k);
	//   19   39:aload_0         
	//   20   40:iload_3         
	//   21   41:invokevirtual   #250 <Method TypedValue TypedArray.peekValue(int)>
	//   22   44:astore          12
			boolean flag1;
			if(typedvalue != null)
	//*  23   46:aload           12
	//*  24   48:ifnull          57
				flag1 = true;
	//   25   51:iconst_1        
	//   26   52:istore          9
			else
	//*  27   54:goto            60
				flag1 = false;
	//   28   57:iconst_0        
	//   29   58:istore          9
			int j1;
			if(flag1)
	//*  30   60:iload           9
	//*  31   62:ifeq            75
				j1 = typedvalue.type;
	//   32   65:aload           12
	//   33   67:getfield        #255 <Field int TypedValue.type>
	//   34   70:istore          11
			else
	//*  35   72:goto            78
				j1 = 0;
	//   36   75:iconst_0        
	//   37   76:istore          11
			int l = i;
	//   38   78:iload_1         
	//   39   79:istore          7
			if(i == 4)
	//*  40   81:iload_1         
	//*  41   82:iconst_4        
	//*  42   83:icmpne          121
				if(flag && isColorType(i1) || flag1 && isColorType(j1))
	//*  43   86:iload           8
	//*  44   88:ifeq            99
	//*  45   91:iload           10
	//*  46   93:invokestatic    #259 <Method boolean isColorType(int)>
	//*  47   96:ifne            112
	//*  48   99:iload           9
	//*  49  101:ifeq            118
	//*  50  104:iload           11
	//*  51  106:invokestatic    #259 <Method boolean isColorType(int)>
	//*  52  109:ifeq            118
					l = 3;
	//   53  112:iconst_3        
	//   54  113:istore          7
				else
	//*  55  115:goto            121
					l = 0;
	//   56  118:iconst_0        
	//   57  119:istore          7
			if(l == 0)
	//*  58  121:iload           7
	//*  59  123:ifne            131
				i = 1;
	//   60  126:iconst_1        
	//   61  127:istore_1        
			else
	//*  62  128:goto            133
				i = 0;
	//   63  131:iconst_0        
	//   64  132:istore_1        
			typedvalue = null;
	//   65  133:aconst_null     
	//   66  134:astore          12
			String s2 = null;
	//   67  136:aconst_null     
	//   68  137:astore          14
			if(l == 2)
	//*  69  139:iload           7
	//*  70  141:iconst_2        
	//*  71  142:icmpne          338
			{
				String s1 = typedarray.getString(j);
	//   72  145:aload_0         
	//   73  146:iload_2         
	//   74  147:invokevirtual   #263 <Method String TypedArray.getString(int)>
	//   75  150:astore          13
				s2 = typedarray.getString(k);
	//   76  152:aload_0         
	//   77  153:iload_3         
	//   78  154:invokevirtual   #263 <Method String TypedArray.getString(int)>
	//   79  157:astore          14
				android.support.v4.graphics.PathParser.PathDataNode apathdatanode[] = PathParser.createNodesFromPathData(s1);
	//   80  159:aload           13
	//   81  161:invokestatic    #269 <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.createNodesFromPathData(String)>
	//   82  164:astore          15
				android.support.v4.graphics.PathParser.PathDataNode apathdatanode1[] = PathParser.createNodesFromPathData(s2);
	//   83  166:aload           14
	//   84  168:invokestatic    #269 <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.createNodesFromPathData(String)>
	//   85  171:astore          16
				if(apathdatanode == null)
	//*  86  173:aload           15
	//*  87  175:ifnonnull       186
				{
					typedarray = ((TypedArray) (typedvalue));
	//   88  178:aload           12
	//   89  180:astore_0        
					if(apathdatanode1 == null)
						break label0;
	//   90  181:aload           16
	//   91  183:ifnull          726
				}
				if(apathdatanode != null)
	//*  92  186:aload           15
	//*  93  188:ifnull          307
				{
					typedarray = ((TypedArray) (new PathDataEvaluator()));
	//   94  191:new             #8   <Class AnimatorInflaterCompat$PathDataEvaluator>
	//   95  194:dup             
	//   96  195:aconst_null     
	//   97  196:invokespecial   #272 <Method void AnimatorInflaterCompat$PathDataEvaluator(AnimatorInflaterCompat$1)>
	//   98  199:astore_0        
					if(apathdatanode1 != null)
	//*  99  200:aload           16
	//* 100  202:ifnull          289
					{
						if(!PathParser.canMorph(apathdatanode, apathdatanode1))
	//* 101  205:aload           15
	//* 102  207:aload           16
	//* 103  209:invokestatic    #276 <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
	//* 104  212:ifne            265
						{
							typedarray = ((TypedArray) (new StringBuilder()));
	//  105  215:new             #133 <Class StringBuilder>
	//  106  218:dup             
	//  107  219:invokespecial   #134 <Method void StringBuilder()>
	//  108  222:astore_0        
							((StringBuilder) (typedarray)).append(" Can't morph from ");
	//  109  223:aload_0         
	//  110  224:ldc2            #278 <String " Can't morph from ">
	//  111  227:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//  112  230:pop             
							((StringBuilder) (typedarray)).append(s1);
	//  113  231:aload_0         
	//  114  232:aload           13
	//  115  234:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//  116  237:pop             
							((StringBuilder) (typedarray)).append(" to ");
	//  117  238:aload_0         
	//  118  239:ldc2            #280 <String " to ">
	//  119  242:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//  120  245:pop             
							((StringBuilder) (typedarray)).append(s2);
	//  121  246:aload_0         
	//  122  247:aload           14
	//  123  249:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//  124  252:pop             
							throw new InflateException(((StringBuilder) (typedarray)).toString());
	//  125  253:new             #282 <Class InflateException>
	//  126  256:dup             
	//  127  257:aload_0         
	//  128  258:invokevirtual   #145 <Method String StringBuilder.toString()>
	//  129  261:invokespecial   #283 <Method void InflateException(String)>
	//  130  264:athrow          
						}
						typedarray = ((TypedArray) (PropertyValuesHolder.ofObject(s, ((TypeEvaluator) (typedarray)), new Object[] {
							apathdatanode, apathdatanode1
						})));
	//  131  265:aload           4
	//  132  267:aload_0         
	//  133  268:iconst_2        
	//  134  269:anewarray       Object[]
	//  135  272:dup             
	//  136  273:iconst_0        
	//  137  274:aload           15
	//  138  276:aastore         
	//  139  277:dup             
	//  140  278:iconst_1        
	//  141  279:aload           16
	//  142  281:aastore         
	//  143  282:invokestatic    #288 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(String, TypeEvaluator, Object[])>
	//  144  285:astore_0        
					} else
	//* 145  286:goto            305
					{
						typedarray = ((TypedArray) (PropertyValuesHolder.ofObject(s, ((TypeEvaluator) (typedarray)), new Object[] {
							apathdatanode
						})));
	//  146  289:aload           4
	//  147  291:aload_0         
	//  148  292:iconst_1        
	//  149  293:anewarray       Object[]
	//  150  296:dup             
	//  151  297:iconst_0        
	//  152  298:aload           15
	//  153  300:aastore         
	//  154  301:invokestatic    #288 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(String, TypeEvaluator, Object[])>
	//  155  304:astore_0        
					}
					return ((PropertyValuesHolder) (typedarray));
	//  156  305:aload_0         
	//  157  306:areturn         
				}
				typedarray = ((TypedArray) (typedvalue));
	//  158  307:aload           12
	//  159  309:astore_0        
				if(apathdatanode1 != null)
	//* 160  310:aload           16
	//* 161  312:ifnull          726
					return PropertyValuesHolder.ofObject(s, ((TypeEvaluator) (new PathDataEvaluator())), new Object[] {
						apathdatanode1
					});
	//  162  315:aload           4
	//  163  317:new             #8   <Class AnimatorInflaterCompat$PathDataEvaluator>
	//  164  320:dup             
	//  165  321:aconst_null     
	//  166  322:invokespecial   #272 <Method void AnimatorInflaterCompat$PathDataEvaluator(AnimatorInflaterCompat$1)>
	//  167  325:iconst_1        
	//  168  326:anewarray       Object[]
	//  169  329:dup             
	//  170  330:iconst_0        
	//  171  331:aload           16
	//  172  333:aastore         
	//  173  334:invokestatic    #288 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(String, TypeEvaluator, Object[])>
	//  174  337:areturn         
			} else
			{
				ArgbEvaluator argbevaluator;
				if(l == 3)
	//* 175  338:iload           7
	//* 176  340:iconst_3        
	//* 177  341:icmpne          352
					argbevaluator = ArgbEvaluator.getInstance();
	//  178  344:invokestatic    #294 <Method ArgbEvaluator ArgbEvaluator.getInstance()>
	//  179  347:astore          13
				else
	//* 180  349:goto            355
					argbevaluator = null;
	//  181  352:aconst_null     
	//  182  353:astore          13
				Object obj;
				if(i != 0)
	//* 183  355:iload_1         
	//* 184  356:ifeq            503
				{
					if(flag)
	//* 185  359:iload           8
	//* 186  361:ifeq            458
					{
						float f;
						if(i1 == 5)
	//* 187  364:iload           10
	//* 188  366:iconst_5        
	//* 189  367:icmpne          381
							f = typedarray.getDimension(j, 0.0F);
	//  190  370:aload_0         
	//  191  371:iload_2         
	//  192  372:fconst_0        
	//  193  373:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//  194  376:fstore          5
						else
	//* 195  378:goto            389
							f = typedarray.getFloat(j, 0.0F);
	//  196  381:aload_0         
	//  197  382:iload_2         
	//  198  383:fconst_0        
	//  199  384:invokevirtual   #301 <Method float TypedArray.getFloat(int, float)>
	//  200  387:fstore          5
						if(flag1)
	//* 201  389:iload           9
	//* 202  391:ifeq            441
						{
							float f2;
							if(j1 == 5)
	//* 203  394:iload           11
	//* 204  396:iconst_5        
	//* 205  397:icmpne          411
								f2 = typedarray.getDimension(k, 0.0F);
	//  206  400:aload_0         
	//  207  401:iload_3         
	//  208  402:fconst_0        
	//  209  403:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//  210  406:fstore          6
							else
	//* 211  408:goto            419
								f2 = typedarray.getFloat(k, 0.0F);
	//  212  411:aload_0         
	//  213  412:iload_3         
	//  214  413:fconst_0        
	//  215  414:invokevirtual   #301 <Method float TypedArray.getFloat(int, float)>
	//  216  417:fstore          6
							typedarray = ((TypedArray) (PropertyValuesHolder.ofFloat(s, new float[] {
								f, f2
							})));
	//  217  419:aload           4
	//  218  421:iconst_2        
	//  219  422:newarray        float[]
	//  220  424:dup             
	//  221  425:iconst_0        
	//  222  426:fload           5
	//  223  428:fastore         
	//  224  429:dup             
	//  225  430:iconst_1        
	//  226  431:fload           6
	//  227  433:fastore         
	//  228  434:invokestatic    #304 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  229  437:astore_0        
						} else
	//* 230  438:goto            497
						{
							typedarray = ((TypedArray) (PropertyValuesHolder.ofFloat(s, new float[] {
								f
							})));
	//  231  441:aload           4
	//  232  443:iconst_1        
	//  233  444:newarray        float[]
	//  234  446:dup             
	//  235  447:iconst_0        
	//  236  448:fload           5
	//  237  450:fastore         
	//  238  451:invokestatic    #304 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  239  454:astore_0        
						}
					} else
	//* 240  455:goto            497
					{
						float f1;
						if(j1 == 5)
	//* 241  458:iload           11
	//* 242  460:iconst_5        
	//* 243  461:icmpne          475
							f1 = typedarray.getDimension(k, 0.0F);
	//  244  464:aload_0         
	//  245  465:iload_3         
	//  246  466:fconst_0        
	//  247  467:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//  248  470:fstore          5
						else
	//* 249  472:goto            483
							f1 = typedarray.getFloat(k, 0.0F);
	//  250  475:aload_0         
	//  251  476:iload_3         
	//  252  477:fconst_0        
	//  253  478:invokevirtual   #301 <Method float TypedArray.getFloat(int, float)>
	//  254  481:fstore          5
						typedarray = ((TypedArray) (PropertyValuesHolder.ofFloat(s, new float[] {
							f1
						})));
	//  255  483:aload           4
	//  256  485:iconst_1        
	//  257  486:newarray        float[]
	//  258  488:dup             
	//  259  489:iconst_0        
	//  260  490:fload           5
	//  261  492:fastore         
	//  262  493:invokestatic    #304 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  263  496:astore_0        
					}
					obj = ((Object) (typedarray));
	//  264  497:aload_0         
	//  265  498:astore          12
				} else
	//* 266  500:goto            700
				if(flag)
	//* 267  503:iload           8
	//* 268  505:ifeq            635
				{
					if(i1 == 5)
	//* 269  508:iload           10
	//* 270  510:iconst_5        
	//* 271  511:icmpne          525
						i = (int)typedarray.getDimension(j, 0.0F);
	//  272  514:aload_0         
	//  273  515:iload_2         
	//  274  516:fconst_0        
	//  275  517:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//  276  520:f2i             
	//  277  521:istore_1        
					else
	//* 278  522:goto            550
					if(isColorType(i1))
	//* 279  525:iload           10
	//* 280  527:invokestatic    #259 <Method boolean isColorType(int)>
	//* 281  530:ifeq            543
						i = typedarray.getColor(j, 0);
	//  282  533:aload_0         
	//  283  534:iload_2         
	//  284  535:iconst_0        
	//  285  536:invokevirtual   #308 <Method int TypedArray.getColor(int, int)>
	//  286  539:istore_1        
					else
	//* 287  540:goto            550
						i = typedarray.getInt(j, 0);
	//  288  543:aload_0         
	//  289  544:iload_2         
	//  290  545:iconst_0        
	//  291  546:invokevirtual   #311 <Method int TypedArray.getInt(int, int)>
	//  292  549:istore_1        
					if(flag1)
	//* 293  550:iload           9
	//* 294  552:ifeq            618
					{
						if(j1 == 5)
	//* 295  555:iload           11
	//* 296  557:iconst_5        
	//* 297  558:icmpne          572
							j = (int)typedarray.getDimension(k, 0.0F);
	//  298  561:aload_0         
	//  299  562:iload_3         
	//  300  563:fconst_0        
	//  301  564:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//  302  567:f2i             
	//  303  568:istore_2        
						else
	//* 304  569:goto            597
						if(isColorType(j1))
	//* 305  572:iload           11
	//* 306  574:invokestatic    #259 <Method boolean isColorType(int)>
	//* 307  577:ifeq            590
							j = typedarray.getColor(k, 0);
	//  308  580:aload_0         
	//  309  581:iload_3         
	//  310  582:iconst_0        
	//  311  583:invokevirtual   #308 <Method int TypedArray.getColor(int, int)>
	//  312  586:istore_2        
						else
	//* 313  587:goto            597
							j = typedarray.getInt(k, 0);
	//  314  590:aload_0         
	//  315  591:iload_3         
	//  316  592:iconst_0        
	//  317  593:invokevirtual   #311 <Method int TypedArray.getInt(int, int)>
	//  318  596:istore_2        
						obj = ((Object) (PropertyValuesHolder.ofInt(s, new int[] {
							i, j
						})));
	//  319  597:aload           4
	//  320  599:iconst_2        
	//  321  600:newarray        int[]
	//  322  602:dup             
	//  323  603:iconst_0        
	//  324  604:iload_1         
	//  325  605:iastore         
	//  326  606:dup             
	//  327  607:iconst_1        
	//  328  608:iload_2         
	//  329  609:iastore         
	//  330  610:invokestatic    #314 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//  331  613:astore          12
					} else
	//* 332  615:goto            700
					{
						obj = ((Object) (PropertyValuesHolder.ofInt(s, new int[] {
							i
						})));
	//  333  618:aload           4
	//  334  620:iconst_1        
	//  335  621:newarray        int[]
	//  336  623:dup             
	//  337  624:iconst_0        
	//  338  625:iload_1         
	//  339  626:iastore         
	//  340  627:invokestatic    #314 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//  341  630:astore          12
					}
				} else
	//* 342  632:goto            700
				{
					obj = ((Object) (s2));
	//  343  635:aload           14
	//  344  637:astore          12
					if(flag1)
	//* 345  639:iload           9
	//* 346  641:ifeq            700
					{
						if(j1 == 5)
	//* 347  644:iload           11
	//* 348  646:iconst_5        
	//* 349  647:icmpne          661
							i = (int)typedarray.getDimension(k, 0.0F);
	//  350  650:aload_0         
	//  351  651:iload_3         
	//  352  652:fconst_0        
	//  353  653:invokevirtual   #298 <Method float TypedArray.getDimension(int, float)>
	//  354  656:f2i             
	//  355  657:istore_1        
						else
	//* 356  658:goto            686
						if(isColorType(j1))
	//* 357  661:iload           11
	//* 358  663:invokestatic    #259 <Method boolean isColorType(int)>
	//* 359  666:ifeq            679
							i = typedarray.getColor(k, 0);
	//  360  669:aload_0         
	//  361  670:iload_3         
	//  362  671:iconst_0        
	//  363  672:invokevirtual   #308 <Method int TypedArray.getColor(int, int)>
	//  364  675:istore_1        
						else
	//* 365  676:goto            686
							i = typedarray.getInt(k, 0);
	//  366  679:aload_0         
	//  367  680:iload_3         
	//  368  681:iconst_0        
	//  369  682:invokevirtual   #311 <Method int TypedArray.getInt(int, int)>
	//  370  685:istore_1        
						obj = ((Object) (PropertyValuesHolder.ofInt(s, new int[] {
							i
						})));
	//  371  686:aload           4
	//  372  688:iconst_1        
	//  373  689:newarray        int[]
	//  374  691:dup             
	//  375  692:iconst_0        
	//  376  693:iload_1         
	//  377  694:iastore         
	//  378  695:invokestatic    #314 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//  379  698:astore          12
					}
				}
				typedarray = ((TypedArray) (obj));
	//  380  700:aload           12
	//  381  702:astore_0        
				if(obj != null)
	//* 382  703:aload           12
	//* 383  705:ifnull          726
				{
					typedarray = ((TypedArray) (obj));
	//  384  708:aload           12
	//  385  710:astore_0        
					if(argbevaluator != null)
	//* 386  711:aload           13
	//* 387  713:ifnull          726
					{
						((PropertyValuesHolder) (obj)).setEvaluator(((TypeEvaluator) (argbevaluator)));
	//  388  716:aload           12
	//  389  718:aload           13
	//  390  720:invokevirtual   #318 <Method void PropertyValuesHolder.setEvaluator(TypeEvaluator)>
						typedarray = ((TypedArray) (obj));
	//  391  723:aload           12
	//  392  725:astore_0        
					}
				}
			}
		}
		return ((PropertyValuesHolder) (typedarray));
	//  393  726:aload_0         
	//  394  727:areturn         
	}

	private static int inferValueTypeFromValues(TypedArray typedarray, int i, int j)
	{
label0:
		{
			TypedValue typedvalue = typedarray.peekValue(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #250 <Method TypedValue TypedArray.peekValue(int)>
	//    3    5:astore          6
			int l = 1;
	//    4    7:iconst_1        
	//    5    8:istore          4
			boolean flag = false;
	//    6   10:iconst_0        
	//    7   11:istore          5
			if(typedvalue != null)
	//*   8   13:aload           6
	//*   9   15:ifnull          23
				i = 1;
	//   10   18:iconst_1        
	//   11   19:istore_1        
			else
	//*  12   20:goto            25
				i = 0;
	//   13   23:iconst_0        
	//   14   24:istore_1        
			int k;
			if(i != 0)
	//*  15   25:iload_1         
	//*  16   26:ifeq            38
				k = typedvalue.type;
	//   17   29:aload           6
	//   18   31:getfield        #255 <Field int TypedValue.type>
	//   19   34:istore_3        
			else
	//*  20   35:goto            40
				k = 0;
	//   21   38:iconst_0        
	//   22   39:istore_3        
			typedarray = ((TypedArray) (typedarray.peekValue(j)));
	//   23   40:aload_0         
	//   24   41:iload_2         
	//   25   42:invokevirtual   #250 <Method TypedValue TypedArray.peekValue(int)>
	//   26   45:astore_0        
			if(typedarray != null)
	//*  27   46:aload_0         
	//*  28   47:ifnull          56
				j = l;
	//   29   50:iload           4
	//   30   52:istore_2        
			else
	//*  31   53:goto            58
				j = 0;
	//   32   56:iconst_0        
	//   33   57:istore_2        
			if(j != 0)
	//*  34   58:iload_2         
	//*  35   59:ifeq            71
				l = ((TypedValue) (typedarray)).type;
	//   36   62:aload_0         
	//   37   63:getfield        #255 <Field int TypedValue.type>
	//   38   66:istore          4
			else
	//*  39   68:goto            74
				l = 0;
	//   40   71:iconst_0        
	//   41   72:istore          4
			if(i == 0 || !isColorType(k))
	//*  42   74:iload_1         
	//*  43   75:ifeq            85
	//*  44   78:iload_3         
	//*  45   79:invokestatic    #259 <Method boolean isColorType(int)>
	//*  46   82:ifne            103
			{
				i = ((int) (flag));
	//   47   85:iload           5
	//   48   87:istore_1        
				if(j == 0)
					break label0;
	//   49   88:iload_2         
	//   50   89:ifeq            105
				i = ((int) (flag));
	//   51   92:iload           5
	//   52   94:istore_1        
				if(!isColorType(l))
					break label0;
	//   53   95:iload           4
	//   54   97:invokestatic    #259 <Method boolean isColorType(int)>
	//   55  100:ifeq            105
			}
			i = 3;
	//   56  103:iconst_3        
	//   57  104:istore_1        
		}
		return i;
	//   58  105:iload_1         
	//   59  106:ireturn         
	}

	private static int inferValueTypeOfKeyframe(Resources resources, android.content.res.Resources.Theme theme, AttributeSet attributeset, XmlPullParser xmlpullparser)
	{
		resources = ((Resources) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_KEYFRAME)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #325 <Field int[] AndroidResources.STYLEABLE_KEYFRAME>
	//    4    6:invokestatic    #102 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore_0        
		boolean flag1 = false;
	//    6   10:iconst_0        
	//    7   11:istore          6
		theme = ((android.content.res.Resources.Theme) (TypedArrayUtils.peekNamedValue(((TypedArray) (resources)), xmlpullparser, "value", 0)));
	//    8   13:aload_0         
	//    9   14:aload_3         
	//   10   15:ldc2            #326 <String "value">
	//   11   18:iconst_0        
	//   12   19:invokestatic    #330 <Method TypedValue TypedArrayUtils.peekNamedValue(TypedArray, XmlPullParser, String, int)>
	//   13   22:astore_1        
		boolean flag;
		if(theme != null)
	//*  14   23:aload_1         
	//*  15   24:ifnull          33
			flag = true;
	//   16   27:iconst_1        
	//   17   28:istore          4
		else
	//*  18   30:goto            36
			flag = false;
	//   19   33:iconst_0        
	//   20   34:istore          4
		byte byte0 = ((byte) (flag1));
	//   21   36:iload           6
	//   22   38:istore          5
		if(flag)
	//*  23   40:iload           4
	//*  24   42:ifeq            62
		{
			byte0 = ((byte) (flag1));
	//   25   45:iload           6
	//   26   47:istore          5
			if(isColorType(((TypedValue) (theme)).type))
	//*  27   49:aload_1         
	//*  28   50:getfield        #255 <Field int TypedValue.type>
	//*  29   53:invokestatic    #259 <Method boolean isColorType(int)>
	//*  30   56:ifeq            62
				byte0 = 3;
	//   31   59:iconst_3        
	//   32   60:istore          5
		}
		((TypedArray) (resources)).recycle();
	//   33   62:aload_0         
	//   34   63:invokevirtual   #113 <Method void TypedArray.recycle()>
		return ((int) (byte0));
	//   35   66:iload           5
	//   36   68:ireturn         
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
		Object obj;
		Object obj1;
		Object obj2;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		obj2 = null;
	//    2    3:aconst_null     
	//    3    4:astore          8
		obj = null;
	//    4    6:aconst_null     
	//    5    7:astore          5
		XmlResourceParser xmlresourceparser = resources.getAnimation(i);
	//    6    9:aload_1         
	//    7   10:iload_3         
	//    8   11:invokevirtual   #366 <Method XmlResourceParser Resources.getAnimation(int)>
	//    9   14:astore          6
		context = ((Context) (createAnimatorFromXml(context, resources, theme, ((XmlPullParser) (xmlresourceparser)), f)));
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:aload_2         
	//   13   19:aload           6
	//   14   21:fload           4
	//   15   23:invokestatic    #368 <Method Animator createAnimatorFromXml(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, float)>
	//   16   26:astore_0        
		if(xmlresourceparser != null)
	//*  17   27:aload           6
	//*  18   29:ifnull          39
			xmlresourceparser.close();
	//   19   32:aload           6
	//   20   34:invokeinterface #373 <Method void XmlResourceParser.close()>
		return ((Animator) (context));
	//   21   39:aload_0         
	//   22   40:areturn         
		context;
	//   23   41:astore_0        
		obj = ((Object) (xmlresourceparser));
	//   24   42:aload           6
	//   25   44:astore          5
		  goto _L1
	//*  26   46:goto            197
		resources;
	//   27   49:astore_1        
		context = ((Context) (xmlresourceparser));
	//   28   50:aload           6
	//   29   52:astore_0        
		  goto _L2
	//*  30   53:goto            71
		resources;
	//   31   56:astore_1        
		context = ((Context) (xmlresourceparser));
	//   32   57:aload           6
	//   33   59:astore_0        
		  goto _L3
	//*  34   60:goto            134
		context;
	//   35   63:astore_0        
		  goto _L1
	//*  36   64:goto            197
		resources;
	//   37   67:astore_1        
		context = ((Context) (obj1));
	//   38   68:aload           7
	//   39   70:astore_0        
_L2:
		obj = ((Object) (context));
	//   40   71:aload_0         
	//   41   72:astore          5
		theme = ((android.content.res.Resources.Theme) (new StringBuilder()));
	//   42   74:new             #133 <Class StringBuilder>
	//   43   77:dup             
	//   44   78:invokespecial   #134 <Method void StringBuilder()>
	//   45   81:astore_2        
		obj = ((Object) (context));
	//   46   82:aload_0         
	//   47   83:astore          5
		((StringBuilder) (theme)).append("Can't load animation resource ID #0x");
	//   48   85:aload_2         
	//   49   86:ldc2            #375 <String "Can't load animation resource ID #0x">
	//   50   89:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   51   92:pop             
		obj = ((Object) (context));
	//   52   93:aload_0         
	//   53   94:astore          5
		((StringBuilder) (theme)).append(Integer.toHexString(i));
	//   54   96:aload_2         
	//   55   97:iload_3         
	//   56   98:invokestatic    #378 <Method String Integer.toHexString(int)>
	//   57  101:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   58  104:pop             
		obj = ((Object) (context));
	//   59  105:aload_0         
	//   60  106:astore          5
		theme = ((android.content.res.Resources.Theme) (new android.content.res.Resources.NotFoundException(((StringBuilder) (theme)).toString())));
	//   61  108:new             #333 <Class android.content.res.Resources$NotFoundException>
	//   62  111:dup             
	//   63  112:aload_2         
	//   64  113:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   65  116:invokespecial   #379 <Method void android.content.res.Resources$NotFoundException(String)>
	//   66  119:astore_2        
		obj = ((Object) (context));
	//   67  120:aload_0         
	//   68  121:astore          5
		((android.content.res.Resources.NotFoundException) (theme)).initCause(((Throwable) (resources)));
	//   69  123:aload_2         
	//   70  124:aload_1         
	//   71  125:invokevirtual   #383 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
	//   72  128:pop             
		obj = ((Object) (context));
	//   73  129:aload_0         
	//   74  130:astore          5
		throw theme;
	//   75  132:aload_2         
	//   76  133:athrow          
_L3:
		obj = ((Object) (context));
	//   77  134:aload_0         
	//   78  135:astore          5
		theme = ((android.content.res.Resources.Theme) (new StringBuilder()));
	//   79  137:new             #133 <Class StringBuilder>
	//   80  140:dup             
	//   81  141:invokespecial   #134 <Method void StringBuilder()>
	//   82  144:astore_2        
		obj = ((Object) (context));
	//   83  145:aload_0         
	//   84  146:astore          5
		((StringBuilder) (theme)).append("Can't load animation resource ID #0x");
	//   85  148:aload_2         
	//   86  149:ldc2            #375 <String "Can't load animation resource ID #0x">
	//   87  152:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   88  155:pop             
		obj = ((Object) (context));
	//   89  156:aload_0         
	//   90  157:astore          5
		((StringBuilder) (theme)).append(Integer.toHexString(i));
	//   91  159:aload_2         
	//   92  160:iload_3         
	//   93  161:invokestatic    #378 <Method String Integer.toHexString(int)>
	//   94  164:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   95  167:pop             
		obj = ((Object) (context));
	//   96  168:aload_0         
	//   97  169:astore          5
		theme = ((android.content.res.Resources.Theme) (new android.content.res.Resources.NotFoundException(((StringBuilder) (theme)).toString())));
	//   98  171:new             #333 <Class android.content.res.Resources$NotFoundException>
	//   99  174:dup             
	//  100  175:aload_2         
	//  101  176:invokevirtual   #145 <Method String StringBuilder.toString()>
	//  102  179:invokespecial   #379 <Method void android.content.res.Resources$NotFoundException(String)>
	//  103  182:astore_2        
		obj = ((Object) (context));
	//  104  183:aload_0         
	//  105  184:astore          5
		((android.content.res.Resources.NotFoundException) (theme)).initCause(((Throwable) (resources)));
	//  106  186:aload_2         
	//  107  187:aload_1         
	//  108  188:invokevirtual   #383 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
	//  109  191:pop             
		obj = ((Object) (context));
	//  110  192:aload_0         
	//  111  193:astore          5
		throw theme;
	//  112  195:aload_2         
	//  113  196:athrow          
_L1:
		if(obj != null)
	//* 114  197:aload           5
	//* 115  199:ifnull          209
			((XmlResourceParser) (obj)).close();
	//  116  202:aload           5
	//  117  204:invokeinterface #373 <Method void XmlResourceParser.close()>
		throw context;
	//  118  209:aload_0         
	//  119  210:athrow          
		resources;
	//  120  211:astore_1        
		context = ((Context) (obj2));
	//  121  212:aload           8
	//  122  214:astore_0        
		if(true) goto _L3; else goto _L4
	//  123  215:goto            134
_L4:
	}

	private static ValueAnimator loadAnimator(Context context, Resources resources, android.content.res.Resources.Theme theme, AttributeSet attributeset, ValueAnimator valueanimator, float f, XmlPullParser xmlpullparser)
		throws android.content.res.Resources.NotFoundException
	{
		TypedArray typedarray = TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_ANIMATOR);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:getstatic       #386 <Field int[] AndroidResources.STYLEABLE_ANIMATOR>
	//    4    6:invokestatic    #102 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore          8
		theme = ((android.content.res.Resources.Theme) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_PROPERTY_ANIMATOR)));
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:aload_3         
	//    9   14:getstatic       #389 <Field int[] AndroidResources.STYLEABLE_PROPERTY_ANIMATOR>
	//   10   17:invokestatic    #102 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   11   20:astore_2        
		resources = ((Resources) (valueanimator));
	//   12   21:aload           4
	//   13   23:astore_1        
		if(valueanimator == null)
	//*  14   24:aload           4
	//*  15   26:ifnonnull       37
			resources = ((Resources) (new ValueAnimator()));
	//   16   29:new             #121 <Class ValueAnimator>
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
	//   41   79:invokevirtual   #113 <Method void TypedArray.recycle()>
		if(theme != null)
	//*  42   82:aload_2         
	//*  43   83:ifnull          90
			((TypedArray) (theme)).recycle();
	//   44   86:aload_2         
	//   45   87:invokevirtual   #113 <Method void TypedArray.recycle()>
		return ((ValueAnimator) (resources));
	//   46   90:aload_1         
	//   47   91:areturn         
	}

	private static Keyframe loadKeyframe(Context context, Resources resources, android.content.res.Resources.Theme theme, AttributeSet attributeset, int i, XmlPullParser xmlpullparser)
		throws XmlPullParserException, IOException
	{
		float f;
		int j;
		boolean flag;
		theme = ((android.content.res.Resources.Theme) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_KEYFRAME)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:getstatic       #325 <Field int[] AndroidResources.STYLEABLE_KEYFRAME>
	//    4    6:invokestatic    #102 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore_2        
		f = TypedArrayUtils.getNamedFloat(((TypedArray) (theme)), xmlpullparser, "fraction", 3, -1F);
	//    6   10:aload_2         
	//    7   11:aload           5
	//    8   13:ldc2            #413 <String "fraction">
	//    9   16:iconst_3        
	//   10   17:ldc2            #414 <Float -1F>
	//   11   20:invokestatic    #418 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   12   23:fstore          6
		resources = ((Resources) (TypedArrayUtils.peekNamedValue(((TypedArray) (theme)), xmlpullparser, "value", 0)));
	//   13   25:aload_2         
	//   14   26:aload           5
	//   15   28:ldc2            #326 <String "value">
	//   16   31:iconst_0        
	//   17   32:invokestatic    #330 <Method TypedValue TypedArrayUtils.peekNamedValue(TypedArray, XmlPullParser, String, int)>
	//   18   35:astore_1        
		if(resources != null)
	//*  19   36:aload_1         
	//*  20   37:ifnull          46
			flag = true;
	//   21   40:iconst_1        
	//   22   41:istore          8
		else
	//*  23   43:goto            49
			flag = false;
	//   24   46:iconst_0        
	//   25   47:istore          8
		j = i;
	//   26   49:iload           4
	//   27   51:istore          7
		if(i == 4)
	//*  28   53:iload           4
	//*  29   55:iconst_4        
	//*  30   56:icmpne          83
			if(flag && isColorType(((TypedValue) (resources)).type))
	//*  31   59:iload           8
	//*  32   61:ifeq            80
	//*  33   64:aload_1         
	//*  34   65:getfield        #255 <Field int TypedValue.type>
	//*  35   68:invokestatic    #259 <Method boolean isColorType(int)>
	//*  36   71:ifeq            80
				j = 3;
	//   37   74:iconst_3        
	//   38   75:istore          7
			else
	//*  39   77:goto            83
				j = 0;
	//   40   80:iconst_0        
	//   41   81:istore          7
		if(!flag) goto _L2; else goto _L1
	//   42   83:iload           8
	//   43   85:ifeq            165
_L1:
		if(j == 3) goto _L4; else goto _L3
	//   44   88:iload           7
	//   45   90:iconst_3        
	//   46   91:icmpeq          145
_L3:
		j;
	//   47   94:iload           7
		JVM INSTR tableswitch 0 1: default 120
	//	               0 125
	//	               1 145;
	//   48   96:tableswitch     0 1: default 120
	//	               0 125
	//	               1 145
		   goto _L5 _L6 _L4
_L5:
		resources = null;
	//   49  120:aconst_null     
	//   50  121:astore_1        
		break; /* Loop/switch isn't completed */
	//   51  122:goto            185
_L6:
		resources = ((Resources) (Keyframe.ofFloat(f, TypedArrayUtils.getNamedFloat(((TypedArray) (theme)), xmlpullparser, "value", 0, 0.0F))));
	//   52  125:fload           6
	//   53  127:aload_2         
	//   54  128:aload           5
	//   55  130:ldc2            #326 <String "value">
	//   56  133:iconst_0        
	//   57  134:fconst_0        
	//   58  135:invokestatic    #418 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   59  138:invokestatic    #421 <Method Keyframe Keyframe.ofFloat(float, float)>
	//   60  141:astore_1        
		break; /* Loop/switch isn't completed */
	//   61  142:goto            185
_L4:
		resources = ((Resources) (Keyframe.ofInt(f, TypedArrayUtils.getNamedInt(((TypedArray) (theme)), xmlpullparser, "value", 0, 0))));
	//   62  145:fload           6
	//   63  147:aload_2         
	//   64  148:aload           5
	//   65  150:ldc2            #326 <String "value">
	//   66  153:iconst_0        
	//   67  154:iconst_0        
	//   68  155:invokestatic    #108 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   69  158:invokestatic    #424 <Method Keyframe Keyframe.ofInt(float, int)>
	//   70  161:astore_1        
		break; /* Loop/switch isn't completed */
	//   71  162:goto            185
_L2:
		if(j == 0)
	//*  72  165:iload           7
	//*  73  167:ifne            179
			resources = ((Resources) (Keyframe.ofFloat(f)));
	//   74  170:fload           6
	//   75  172:invokestatic    #191 <Method Keyframe Keyframe.ofFloat(float)>
	//   76  175:astore_1        
		else
	//*  77  176:goto            185
			resources = ((Resources) (Keyframe.ofInt(f)));
	//   78  179:fload           6
	//   79  181:invokestatic    #197 <Method Keyframe Keyframe.ofInt(float)>
	//   80  184:astore_1        
		i = TypedArrayUtils.getNamedResourceId(((TypedArray) (theme)), xmlpullparser, "interpolator", 1, 0);
	//   81  185:aload_2         
	//   82  186:aload           5
	//   83  188:ldc2            #396 <String "interpolator">
	//   84  191:iconst_1        
	//   85  192:iconst_0        
	//   86  193:invokestatic    #399 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   87  196:istore          4
		if(i > 0)
	//*  88  198:iload           4
	//*  89  200:ifle            213
			((Keyframe) (resources)).setInterpolator(((android.animation.TimeInterpolator) (AnimationUtilsCompat.loadInterpolator(context, i))));
	//   90  203:aload_1         
	//   91  204:aload_0         
	//   92  205:iload           4
	//   93  207:invokestatic    #405 <Method android.view.animation.Interpolator AnimationUtilsCompat.loadInterpolator(Context, int)>
	//   94  210:invokevirtual   #425 <Method void Keyframe.setInterpolator(android.animation.TimeInterpolator)>
		((TypedArray) (theme)).recycle();
	//   95  213:aload_2         
	//   96  214:invokevirtual   #113 <Method void TypedArray.recycle()>
		return ((Keyframe) (resources));
	//   97  217:aload_1         
	//   98  218:areturn         
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
	//   11   19:invokestatic    #85  <Method ValueAnimator loadAnimator(Context, Resources, android.content.res.Resources$Theme, AttributeSet, ValueAnimator, float, XmlPullParser)>
	//   12   22:pop             
		return objectanimator;
	//   13   23:aload           6
	//   14   25:areturn         
	}

	private static PropertyValuesHolder loadPvh(Context context, Resources resources, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser, String s, int i)
		throws XmlPullParserException, IOException
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          14
		ArrayList arraylist = null;
	//    2    3:aconst_null     
	//    3    4:astore          12
		int k = i;
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
				i = k;
	//   20   45:iload           8
	//   21   47:istore          5
				if(k == 4)
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
	//   40   80:astore          15
				ArrayList arraylist1 = arraylist;
	//   41   82:aload           12
	//   42   84:astore          13
				if(keyframe != null)
	//*  43   86:aload           15
	//*  44   88:ifnull          117
				{
					arraylist1 = arraylist;
	//   45   91:aload           12
	//   46   93:astore          13
					if(arraylist == null)
	//*  47   95:aload           12
	//*  48   97:ifnonnull       109
						arraylist1 = new ArrayList();
	//   49  100:new             #127 <Class ArrayList>
	//   50  103:dup             
	//   51  104:invokespecial   #128 <Method void ArrayList()>
	//   52  107:astore          13
					arraylist1.add(((Object) (keyframe)));
	//   53  109:aload           13
	//   54  111:aload           15
	//   55  113:invokevirtual   #131 <Method boolean ArrayList.add(Object)>
	//   56  116:pop             
				}
				xmlpullparser.next();
	//   57  117:aload_3         
	//   58  118:invokeinterface #63  <Method int XmlPullParser.next()>
	//   59  123:pop             
				k = i;
	//   60  124:iload           5
	//   61  126:istore          8
				arraylist = arraylist1;
	//   62  128:aload           13
	//   63  130:astore          12
			}
		} while(true);
	//   64  132:goto            10
		context = ((Context) (obj));
	//   65  135:aload           14
	//   66  137:astore_0        
		if(arraylist != null)
	//*  67  138:aload           12
	//*  68  140:ifnull          471
		{
			int l = arraylist.size();
	//   69  143:aload           12
	//   70  145:invokevirtual   #151 <Method int ArrayList.size()>
	//   71  148:istore          9
			context = ((Context) (obj));
	//   72  150:aload           14
	//   73  152:astore_0        
			if(l > 0)
	//*  74  153:iload           9
	//*  75  155:ifle            471
			{
				boolean flag = false;
	//   76  158:iconst_0        
	//   77  159:istore          7
				context = ((Context) ((Keyframe)arraylist.get(0)));
	//   78  161:aload           12
	//   79  163:iconst_0        
	//   80  164:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//   81  167:checkcast       #177 <Class Keyframe>
	//   82  170:astore_0        
				resources = ((Resources) ((Keyframe)arraylist.get(l - 1)));
	//   83  171:aload           12
	//   84  173:iload           9
	//   85  175:iconst_1        
	//   86  176:isub            
	//   87  177:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//   88  180:checkcast       #177 <Class Keyframe>
	//   89  183:astore_1        
				float f = ((Keyframe) (resources)).getFraction();
	//   90  184:aload_1         
	//   91  185:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//   92  188:fstore          6
				i = l;
	//   93  190:iload           9
	//   94  192:istore          5
				if(f < 1.0F)
	//*  95  194:fload           6
	//*  96  196:fconst_1        
	//*  97  197:fcmpg           
	//*  98  198:ifge            241
					if(f < 0.0F)
	//*  99  201:fload           6
	//* 100  203:fconst_0        
	//* 101  204:fcmpg           
	//* 102  205:ifge            220
					{
						((Keyframe) (resources)).setFraction(1.0F);
	//  103  208:aload_1         
	//  104  209:fconst_1        
	//  105  210:invokevirtual   #210 <Method void Keyframe.setFraction(float)>
						i = l;
	//  106  213:iload           9
	//  107  215:istore          5
					} else
	//* 108  217:goto            241
					{
						arraylist.add(arraylist.size(), ((Object) (createNewKeyframe(((Keyframe) (resources)), 1.0F))));
	//  109  220:aload           12
	//  110  222:aload           12
	//  111  224:invokevirtual   #151 <Method int ArrayList.size()>
	//  112  227:aload_1         
	//  113  228:fconst_1        
	//  114  229:invokestatic    #442 <Method Keyframe createNewKeyframe(Keyframe, float)>
	//  115  232:invokevirtual   #445 <Method void ArrayList.add(int, Object)>
						i = l + 1;
	//  116  235:iload           9
	//  117  237:iconst_1        
	//  118  238:iadd            
	//  119  239:istore          5
					}
				f = ((Keyframe) (context)).getFraction();
	//  120  241:aload_0         
	//  121  242:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//  122  245:fstore          6
				l = i;
	//  123  247:iload           5
	//  124  249:istore          9
				if(f != 0.0F)
	//* 125  251:fload           6
	//* 126  253:fconst_0        
	//* 127  254:fcmpl           
	//* 128  255:ifeq            294
					if(f < 0.0F)
	//* 129  258:fload           6
	//* 130  260:fconst_0        
	//* 131  261:fcmpg           
	//* 132  262:ifge            277
					{
						((Keyframe) (context)).setFraction(0.0F);
	//  133  265:aload_0         
	//  134  266:fconst_0        
	//  135  267:invokevirtual   #210 <Method void Keyframe.setFraction(float)>
						l = i;
	//  136  270:iload           5
	//  137  272:istore          9
					} else
	//* 138  274:goto            294
					{
						arraylist.add(0, ((Object) (createNewKeyframe(((Keyframe) (context)), 0.0F))));
	//  139  277:aload           12
	//  140  279:iconst_0        
	//  141  280:aload_0         
	//  142  281:fconst_0        
	//  143  282:invokestatic    #442 <Method Keyframe createNewKeyframe(Keyframe, float)>
	//  144  285:invokevirtual   #445 <Method void ArrayList.add(int, Object)>
						l = i + 1;
	//  145  288:iload           5
	//  146  290:iconst_1        
	//  147  291:iadd            
	//  148  292:istore          9
					}
				context = ((Context) (new Keyframe[l]));
	//  149  294:iload           9
	//  150  296:anewarray       Keyframe[]
	//  151  299:astore_0        
				arraylist.toArray(((Object []) (context)));
	//  152  300:aload           12
	//  153  302:aload_0         
	//  154  303:invokevirtual   #449 <Method Object[] ArrayList.toArray(Object[])>
	//  155  306:pop             
				for(i = ((int) (flag)); i < l; i++)
	//* 156  307:iload           7
	//* 157  309:istore          5
	//* 158  311:iload           5
	//* 159  313:iload           9
	//* 160  315:icmpge          447
				{
					resources = ((Resources) (context[i]));
	//  161  318:aload_0         
	//  162  319:iload           5
	//  163  321:aaload          
	//  164  322:astore_1        
					if(((Keyframe) (resources)).getFraction() >= 0.0F)
						continue;
	//  165  323:aload_1         
	//  166  324:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//  167  327:fconst_0        
	//  168  328:fcmpg           
	//  169  329:ifge            438
					if(i == 0)
	//* 170  332:iload           5
	//* 171  334:ifne            345
					{
						((Keyframe) (resources)).setFraction(0.0F);
	//  172  337:aload_1         
	//  173  338:fconst_0        
	//  174  339:invokevirtual   #210 <Method void Keyframe.setFraction(float)>
						continue;
	//  175  342:goto            438
					}
					int j1 = l - 1;
	//  176  345:iload           9
	//  177  347:iconst_1        
	//  178  348:isub            
	//  179  349:istore          11
					if(i == j1)
	//* 180  351:iload           5
	//* 181  353:iload           11
	//* 182  355:icmpne          366
					{
						((Keyframe) (resources)).setFraction(1.0F);
	//  183  358:aload_1         
	//  184  359:fconst_1        
	//  185  360:invokevirtual   #210 <Method void Keyframe.setFraction(float)>
						continue;
	//  186  363:goto            438
					}
					int j = i + 1;
	//  187  366:iload           5
	//  188  368:iconst_1        
	//  189  369:iadd            
	//  190  370:istore          7
					int i1 = i;
	//  191  372:iload           5
	//  192  374:istore          10
					for(; j < j1 && ((Keyframe) (context[j])).getFraction() < 0.0F; j++)
	//* 193  376:iload           7
	//* 194  378:iload           11
	//* 195  380:icmpge          411
	//* 196  383:aload_0         
	//* 197  384:iload           7
	//* 198  386:aaload          
	//* 199  387:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//* 200  390:fconst_0        
	//* 201  391:fcmpl           
	//* 202  392:iflt            398
	//* 203  395:goto            411
						i1 = j;
	//  204  398:iload           7
	//  205  400:istore          10

	//  206  402:iload           7
	//  207  404:iconst_1        
	//  208  405:iadd            
	//  209  406:istore          7
	//* 210  408:goto            376
					distributeKeyframes(((Keyframe []) (context)), ((Keyframe) (context[i1 + 1])).getFraction() - ((Keyframe) (context[i - 1])).getFraction(), i, i1);
	//  211  411:aload_0         
	//  212  412:aload_0         
	//  213  413:iload           10
	//  214  415:iconst_1        
	//  215  416:iadd            
	//  216  417:aaload          
	//  217  418:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//  218  421:aload_0         
	//  219  422:iload           5
	//  220  424:iconst_1        
	//  221  425:isub            
	//  222  426:aaload          
	//  223  427:invokevirtual   #206 <Method float Keyframe.getFraction()>
	//  224  430:fsub            
	//  225  431:iload           5
	//  226  433:iload           10
	//  227  435:invokestatic    #451 <Method void distributeKeyframes(Keyframe[], float, int, int)>
				}

	//  228  438:iload           5
	//  229  440:iconst_1        
	//  230  441:iadd            
	//  231  442:istore          5
	//* 232  444:goto            311
				resources = ((Resources) (PropertyValuesHolder.ofKeyframe(s, ((Keyframe []) (context)))));
	//  233  447:aload           4
	//  234  449:aload_0         
	//  235  450:invokestatic    #455 <Method PropertyValuesHolder PropertyValuesHolder.ofKeyframe(String, Keyframe[])>
	//  236  453:astore_1        
				context = ((Context) (resources));
	//  237  454:aload_1         
	//  238  455:astore_0        
				if(k == 3)
	//* 239  456:iload           8
	//* 240  458:iconst_3        
	//* 241  459:icmpne          471
				{
					((PropertyValuesHolder) (resources)).setEvaluator(((TypeEvaluator) (ArgbEvaluator.getInstance())));
	//  242  462:aload_1         
	//  243  463:invokestatic    #294 <Method ArgbEvaluator ArgbEvaluator.getInstance()>
	//  244  466:invokevirtual   #318 <Method void PropertyValuesHolder.setEvaluator(TypeEvaluator)>
					context = ((Context) (resources));
	//  245  469:aload_1         
	//  246  470:astore_0        
				}
			}
		}
		return ((PropertyValuesHolder) (context));
	//  247  471:aload_0         
	//  248  472:areturn         
	}

	private static PropertyValuesHolder[] loadValues(Context context, Resources resources, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser, AttributeSet attributeset)
		throws XmlPullParserException, IOException
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          10
		ArrayList arraylist = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		int i;
		do
		{
			int j = xmlpullparser.getEventType();
	//    4    6:aload_3         
	//    5    7:invokeinterface #458 <Method int XmlPullParser.getEventType()>
	//    6   12:istore          6
			i = 0;
	//    7   14:iconst_0        
	//    8   15:istore          5
			if(j == 3 || j == 1)
				break;
	//    9   17:iload           6
	//   10   19:iconst_3        
	//   11   20:icmpeq          188
	//   12   23:iload           6
	//   13   25:iconst_1        
	//   14   26:icmpeq          188
			if(j != 2)
	//*  15   29:iload           6
	//*  16   31:iconst_2        
	//*  17   32:icmpeq          45
			{
				xmlpullparser.next();
	//   18   35:aload_3         
	//   19   36:invokeinterface #63  <Method int XmlPullParser.next()>
	//   20   41:pop             
			} else
	//*  21   42:goto            6
			{
				if(xmlpullparser.getName().equals("propertyValuesHolder"))
	//*  22   45:aload_3         
	//*  23   46:invokeinterface #67  <Method String XmlPullParser.getName()>
	//*  24   51:ldc1            #115 <String "propertyValuesHolder">
	//*  25   53:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  26   56:ifeq            178
				{
					TypedArray typedarray = TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER);
	//   27   59:aload_1         
	//   28   60:aload_2         
	//   29   61:aload           4
	//   30   63:getstatic       #461 <Field int[] AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER>
	//   31   66:invokestatic    #102 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   32   69:astore          11
					String s = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "propertyName", 3);
	//   33   71:aload           11
	//   34   73:aload_3         
	//   35   74:ldc2            #463 <String "propertyName">
	//   36   77:iconst_3        
	//   37   78:invokestatic    #467 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   38   81:astore          12
					i = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "valueType", 2, 4);
	//   39   83:aload           11
	//   40   85:aload_3         
	//   41   86:ldc2            #469 <String "valueType">
	//   42   89:iconst_2        
	//   43   90:iconst_4        
	//   44   91:invokestatic    #108 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   45   94:istore          5
					Object obj = ((Object) (loadPvh(context, resources, theme, xmlpullparser, s, i)));
	//   46   96:aload_0         
	//   47   97:aload_1         
	//   48   98:aload_2         
	//   49   99:aload_3         
	//   50  100:aload           12
	//   51  102:iload           5
	//   52  104:invokestatic    #471 <Method PropertyValuesHolder loadPvh(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, String, int)>
	//   53  107:astore          8
					PropertyValuesHolder propertyvaluesholder = ((PropertyValuesHolder) (obj));
	//   54  109:aload           8
	//   55  111:astore          9
					if(obj == null)
	//*  56  113:aload           8
	//*  57  115:ifnonnull       131
						propertyvaluesholder = getPVH(typedarray, i, 0, 1, s);
	//   58  118:aload           11
	//   59  120:iload           5
	//   60  122:iconst_0        
	//   61  123:iconst_1        
	//   62  124:aload           12
	//   63  126:invokestatic    #473 <Method PropertyValuesHolder getPVH(TypedArray, int, int, int, String)>
	//   64  129:astore          9
					obj = ((Object) (arraylist));
	//   65  131:aload           7
	//   66  133:astore          8
					if(propertyvaluesholder != null)
	//*  67  135:aload           9
	//*  68  137:ifnull          166
					{
						obj = ((Object) (arraylist));
	//   69  140:aload           7
	//   70  142:astore          8
						if(arraylist == null)
	//*  71  144:aload           7
	//*  72  146:ifnonnull       158
							obj = ((Object) (new ArrayList()));
	//   73  149:new             #127 <Class ArrayList>
	//   74  152:dup             
	//   75  153:invokespecial   #128 <Method void ArrayList()>
	//   76  156:astore          8
						((ArrayList) (obj)).add(((Object) (propertyvaluesholder)));
	//   77  158:aload           8
	//   78  160:aload           9
	//   79  162:invokevirtual   #131 <Method boolean ArrayList.add(Object)>
	//   80  165:pop             
					}
					typedarray.recycle();
	//   81  166:aload           11
	//   82  168:invokevirtual   #113 <Method void TypedArray.recycle()>
					arraylist = ((ArrayList) (obj));
	//   83  171:aload           8
	//   84  173:astore          7
				}
	//*  85  175:goto            178
				xmlpullparser.next();
	//   86  178:aload_3         
	//   87  179:invokeinterface #63  <Method int XmlPullParser.next()>
	//   88  184:pop             
			}
		} while(true);
	//   89  185:goto            6
		context = ((Context) (obj1));
	//   90  188:aload           10
	//   91  190:astore_0        
		if(arraylist != null)
	//*  92  191:aload           7
	//*  93  193:ifnull          241
		{
			int k = arraylist.size();
	//   94  196:aload           7
	//   95  198:invokevirtual   #151 <Method int ArrayList.size()>
	//   96  201:istore          6
			resources = ((Resources) (new PropertyValuesHolder[k]));
	//   97  203:iload           6
	//   98  205:anewarray       PropertyValuesHolder[]
	//   99  208:astore_1        
			do
			{
				context = ((Context) (resources));
	//  100  209:aload_1         
	//  101  210:astore_0        
				if(i >= k)
					break;
	//  102  211:iload           5
	//  103  213:iload           6
	//  104  215:icmpge          241
				resources[i] = ((/*<invalid signature>*/java.lang.Object) ((PropertyValuesHolder)arraylist.get(i)));
	//  105  218:aload_1         
	//  106  219:iload           5
	//  107  221:aload           7
	//  108  223:iload           5
	//  109  225:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//  110  228:checkcast       #285 <Class PropertyValuesHolder>
	//  111  231:aastore         
				i++;
	//  112  232:iload           5
	//  113  234:iconst_1        
	//  114  235:iadd            
	//  115  236:istore          5
			} while(true);
	//  116  238:goto            209
		}
		return ((PropertyValuesHolder []) (context));
	//  117  241:aload_0         
	//  118  242:areturn         
	}

	private static void parseAnimatorFromTypeArray(ValueAnimator valueanimator, TypedArray typedarray, TypedArray typedarray1, float f, XmlPullParser xmlpullparser)
	{
		long l = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "duration", 1, 300);
	//    0    0:aload_1         
	//    1    1:aload           4
	//    2    3:ldc2            #475 <String "duration">
	//    3    6:iconst_1        
	//    4    7:sipush          300
	//    5   10:invokestatic    #108 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//    6   13:i2l             
	//    7   14:lstore          8
		long l1 = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "startOffset", 2, 0);
	//    8   16:aload_1         
	//    9   17:aload           4
	//   10   19:ldc2            #477 <String "startOffset">
	//   11   22:iconst_2        
	//   12   23:iconst_0        
	//   13   24:invokestatic    #108 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   14   27:i2l             
	//   15   28:lstore          10
		int j = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "valueType", 7, 4);
	//   16   30:aload_1         
	//   17   31:aload           4
	//   18   33:ldc2            #469 <String "valueType">
	//   19   36:bipush          7
	//   20   38:iconst_4        
	//   21   39:invokestatic    #108 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
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
	//   63  126:invokevirtual   #125 <Method void ValueAnimator.setValues(PropertyValuesHolder[])>
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
	//   79  155:invokestatic    #108 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   80  158:invokevirtual   #503 <Method void ValueAnimator.setRepeatCount(int)>
		valueanimator.setRepeatMode(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "repeatMode", 4, 1));
	//   81  161:aload_0         
	//   82  162:aload_1         
	//   83  163:aload           4
	//   84  165:ldc2            #505 <String "repeatMode">
	//   85  168:iconst_4        
	//   86  169:iconst_1        
	//   87  170:invokestatic    #108 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
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
	//*  10   19:ifnull          117
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
			if(i == 2);
	//   23   46:iload_2         
	//   24   47:iconst_2        
	//   25   48:icmpeq          51
			if(s1 == null && xmlpullparser == null)
	//*  26   51:aload           6
	//*  27   53:ifnonnull       98
	//*  28   56:aload           4
	//*  29   58:ifnonnull       98
			{
				valueanimator = ((ValueAnimator) (new StringBuilder()));
	//   30   61:new             #133 <Class StringBuilder>
	//   31   64:dup             
	//   32   65:invokespecial   #134 <Method void StringBuilder()>
	//   33   68:astore_0        
				((StringBuilder) (valueanimator)).append(typedarray.getPositionDescription());
	//   34   69:aload_0         
	//   35   70:aload_1         
	//   36   71:invokevirtual   #521 <Method String TypedArray.getPositionDescription()>
	//   37   74:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   38   77:pop             
				((StringBuilder) (valueanimator)).append(" propertyXName or propertyYName is needed for PathData");
	//   39   78:aload_0         
	//   40   79:ldc2            #523 <String " propertyXName or propertyYName is needed for PathData">
	//   41   82:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   42   85:pop             
				throw new InflateException(((StringBuilder) (valueanimator)).toString());
	//   43   86:new             #282 <Class InflateException>
	//   44   89:dup             
	//   45   90:aload_0         
	//   46   91:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   47   94:invokespecial   #283 <Method void InflateException(String)>
	//   48   97:athrow          
			} else
			{
				setupPathMotion(PathParser.createPathFromPathData(s), ((ObjectAnimator) (valueanimator)), 0.5F * f, s1, ((String) (xmlpullparser)));
	//   49   98:aload           5
	//   50  100:invokestatic    #527 <Method Path PathParser.createPathFromPathData(String)>
	//   51  103:aload_0         
	//   52  104:ldc2            #528 <Float 0.5F>
	//   53  107:fload_3         
	//   54  108:fmul            
	//   55  109:aload           6
	//   56  111:aload           4
	//   57  113:invokestatic    #532 <Method void setupPathMotion(Path, ObjectAnimator, float, String, String)>
				return;
	//   58  116:return          
			}
		} else
		{
			((ObjectAnimator) (valueanimator)).setPropertyName(TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "propertyName", 0));
	//   59  117:aload_0         
	//   60  118:aload_1         
	//   61  119:aload           4
	//   62  121:ldc2            #463 <String "propertyName">
	//   63  124:iconst_0        
	//   64  125:invokestatic    #467 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   65  128:invokevirtual   #535 <Method void ObjectAnimator.setPropertyName(String)>
			return;
	//   66  131:return          
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
		ArrayList arraylist = new ArrayList();
	//    6   11:new             #127 <Class ArrayList>
	//    7   14:dup             
	//    8   15:invokespecial   #128 <Method void ArrayList()>
	//    9   18:astore          14
		arraylist.add(((Object) (Float.valueOf(0.0F))));
	//   10   20:aload           14
	//   11   22:fconst_0        
	//   12   23:invokestatic    #231 <Method Float Float.valueOf(float)>
	//   13   26:invokevirtual   #131 <Method boolean ArrayList.add(Object)>
	//   14   29:pop             
		float f1 = 0.0F;
	//   15   30:fconst_0        
	//   16   31:fstore          5
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
	//   22   43:aload           14
	//   23   45:fload           6
	//   24   47:invokestatic    #231 <Method Float Float.valueOf(float)>
	//   25   50:invokevirtual   #131 <Method boolean ArrayList.add(Object)>
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
		int i1 = Math.min(100, (int)(f3 / f) + 1);
	//   38   76:bipush          100
	//   39   78:fload           6
	//   40   80:fload_2         
	//   41   81:fdiv            
	//   42   82:f2i             
	//   43   83:iconst_1        
	//   44   84:iadd            
	//   45   85:invokestatic    #551 <Method int Math.min(int, int)>
	//   46   88:istore          11
		float af1[] = new float[i1];
	//   47   90:iload           11
	//   48   92:newarray        float[]
	//   49   94:astore          15
		float af[] = new float[i1];
	//   50   96:iload           11
	//   51   98:newarray        float[]
	//   52  100:astore          13
		float af2[] = new float[2];
	//   53  102:iconst_2        
	//   54  103:newarray        float[]
	//   55  105:astore          16
		f3 /= i1 - 1;
	//   56  107:fload           6
	//   57  109:iload           11
	//   58  111:iconst_1        
	//   59  112:isub            
	//   60  113:i2f             
	//   61  114:fdiv            
	//   62  115:fstore          6
		int j = 0;
	//   63  117:iconst_0        
	//   64  118:istore          8
		f = 0.0F;
	//   65  120:fconst_0        
	//   66  121:fstore_2        
		int i = j;
	//   67  122:iload           8
	//   68  124:istore          7
		do
		{
			pathmeasure = null;
	//   69  126:aconst_null     
	//   70  127:astore          12
			if(i >= i1)
				break;
	//   71  129:iload           7
	//   72  131:iload           11
	//   73  133:icmpge          257
			((PathMeasure) (path)).getPosTan(f, af2, ((float []) (null)));
	//   74  136:aload_0         
	//   75  137:fload_2         
	//   76  138:aload           16
	//   77  140:aconst_null     
	//   78  141:invokevirtual   #555 <Method boolean PathMeasure.getPosTan(float, float[], float[])>
	//   79  144:pop             
			af1[i] = af2[0];
	//   80  145:aload           15
	//   81  147:iload           7
	//   82  149:aload           16
	//   83  151:iconst_0        
	//   84  152:faload          
	//   85  153:fastore         
			af[i] = af2[1];
	//   86  154:aload           13
	//   87  156:iload           7
	//   88  158:aload           16
	//   89  160:iconst_1        
	//   90  161:faload          
	//   91  162:fastore         
			float f2 = f + f3;
	//   92  163:fload_2         
	//   93  164:fload           6
	//   94  166:fadd            
	//   95  167:fstore          5
			int l = j + 1;
	//   96  169:iload           8
	//   97  171:iconst_1        
	//   98  172:iadd            
	//   99  173:istore          10
			f = f2;
	//  100  175:fload           5
	//  101  177:fstore_2        
			int k = j;
	//  102  178:iload           8
	//  103  180:istore          9
			if(l < arraylist.size())
	//* 104  182:iload           10
	//* 105  184:aload           14
	//* 106  186:invokevirtual   #151 <Method int ArrayList.size()>
	//* 107  189:icmpge          244
			{
				f = f2;
	//  108  192:fload           5
	//  109  194:fstore_2        
				k = j;
	//  110  195:iload           8
	//  111  197:istore          9
				if(f2 > ((Float)arraylist.get(l)).floatValue())
	//* 112  199:fload           5
	//* 113  201:aload           14
	//* 114  203:iload           10
	//* 115  205:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//* 116  208:checkcast       #183 <Class Float>
	//* 117  211:invokevirtual   #558 <Method float Float.floatValue()>
	//* 118  214:fcmpl           
	//* 119  215:ifle            244
				{
					f = f2 - ((Float)arraylist.get(l)).floatValue();
	//  120  218:fload           5
	//  121  220:aload           14
	//  122  222:iload           10
	//  123  224:invokevirtual   #440 <Method Object ArrayList.get(int)>
	//  124  227:checkcast       #183 <Class Float>
	//  125  230:invokevirtual   #558 <Method float Float.floatValue()>
	//  126  233:fsub            
	//  127  234:fstore_2        
					((PathMeasure) (path)).nextContour();
	//  128  235:aload_0         
	//  129  236:invokevirtual   #546 <Method boolean PathMeasure.nextContour()>
	//  130  239:pop             
					k = l;
	//  131  240:iload           10
	//  132  242:istore          9
				}
			}
			i++;
	//  133  244:iload           7
	//  134  246:iconst_1        
	//  135  247:iadd            
	//  136  248:istore          7
			j = k;
	//  137  250:iload           9
	//  138  252:istore          8
		} while(true);
	//  139  254:goto            126
		if(s != null)
	//* 140  257:aload_3         
	//* 141  258:ifnull          271
			path = ((Path) (PropertyValuesHolder.ofFloat(s, af1)));
	//  142  261:aload_3         
	//  143  262:aload           15
	//  144  264:invokestatic    #304 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  145  267:astore_0        
		else
	//* 146  268:goto            273
			path = null;
	//  147  271:aconst_null     
	//  148  272:astore_0        
		s = ((String) (pathmeasure));
	//  149  273:aload           12
	//  150  275:astore_3        
		if(s1 != null)
	//* 151  276:aload           4
	//* 152  278:ifnull          289
			s = ((String) (PropertyValuesHolder.ofFloat(s1, af)));
	//  153  281:aload           4
	//  154  283:aload           13
	//  155  285:invokestatic    #304 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  156  288:astore_3        
		if(path == null)
	//* 157  289:aload_0         
	//* 158  290:ifnonnull       306
		{
			objectanimator.setValues(new PropertyValuesHolder[] {
				s
			});
	//  159  293:aload_1         
	//  160  294:iconst_1        
	//  161  295:anewarray       PropertyValuesHolder[]
	//  162  298:dup             
	//  163  299:iconst_0        
	//  164  300:aload_3         
	//  165  301:aastore         
	//  166  302:invokevirtual   #559 <Method void ObjectAnimator.setValues(PropertyValuesHolder[])>
			return;
	//  167  305:return          
		}
		if(s == null)
	//* 168  306:aload_3         
	//* 169  307:ifnonnull       323
		{
			objectanimator.setValues(new PropertyValuesHolder[] {
				path
			});
	//  170  310:aload_1         
	//  171  311:iconst_1        
	//  172  312:anewarray       PropertyValuesHolder[]
	//  173  315:dup             
	//  174  316:iconst_0        
	//  175  317:aload_0         
	//  176  318:aastore         
	//  177  319:invokevirtual   #559 <Method void ObjectAnimator.setValues(PropertyValuesHolder[])>
			return;
	//  178  322:return          
		} else
		{
			objectanimator.setValues(new PropertyValuesHolder[] {
				path, s
			});
	//  179  323:aload_1         
	//  180  324:iconst_2        
	//  181  325:anewarray       PropertyValuesHolder[]
	//  182  328:dup             
	//  183  329:iconst_0        
	//  184  330:aload_0         
	//  185  331:aastore         
	//  186  332:dup             
	//  187  333:iconst_1        
	//  188  334:aload_3         
	//  189  335:aastore         
	//  190  336:invokevirtual   #559 <Method void ObjectAnimator.setValues(PropertyValuesHolder[])>
			return;
	//  191  339:return          
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
