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
		//    3    3:checkcast       #23  <Class android.support.v4.graphics.PathParser$PathDataNode[]>
		//    4    6:aload_3         
		//    5    7:checkcast       #23  <Class android.support.v4.graphics.PathParser$PathDataNode[]>
		//    6   10:invokevirtual   #26  <Method android.support.v4.graphics.PathParser$PathDataNode[] evaluate(float, android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
		//    7   13:areturn         
		}

		public android.support.v4.graphics.PathParser.PathDataNode[] evaluate(float f, android.support.v4.graphics.PathParser.PathDataNode apathdatanode[], android.support.v4.graphics.PathParser.PathDataNode apathdatanode1[])
		{
			if(PathParser.canMorph(apathdatanode, apathdatanode1))
		//*   0    0:aload_2         
		//*   1    1:aload_3         
		//*   2    2:invokestatic    #32  <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
		//*   3    5:ifeq            79
			{
				android.support.v4.graphics.PathParser.PathDataNode apathdatanode2[] = mNodeArray;
		//    4    8:aload_0         
		//    5    9:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
		//    6   12:astore          5
				if(apathdatanode2 == null || !PathParser.canMorph(apathdatanode2, apathdatanode))
		//*   7   14:aload           5
		//*   8   16:ifnull          28
		//*   9   19:aload           5
		//*  10   21:aload_2         
		//*  11   22:invokestatic    #32  <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
		//*  12   25:ifne            36
					mNodeArray = PathParser.deepCopyNodes(apathdatanode);
		//   13   28:aload_0         
		//   14   29:aload_2         
		//   15   30:invokestatic    #36  <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.deepCopyNodes(android.support.v4.graphics.PathParser$PathDataNode[])>
		//   16   33:putfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
				for(int i = 0; i < apathdatanode.length; i++)
		//*  17   36:iconst_0        
		//*  18   37:istore          4
		//*  19   39:iload           4
		//*  20   41:aload_2         
		//*  21   42:arraylength     
		//*  22   43:icmpge          74
					mNodeArray[i].interpolatePathDataNode(apathdatanode[i], apathdatanode1[i], f);
		//   23   46:aload_0         
		//   24   47:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
		//   25   50:iload           4
		//   26   52:aaload          
		//   27   53:aload_2         
		//   28   54:iload           4
		//   29   56:aaload          
		//   30   57:aload_3         
		//   31   58:iload           4
		//   32   60:aaload          
		//   33   61:fload_1         
		//   34   62:invokevirtual   #42  <Method void android.support.v4.graphics.PathParser$PathDataNode.interpolatePathDataNode(android.support.v4.graphics.PathParser$PathDataNode, android.support.v4.graphics.PathParser$PathDataNode, float)>

		//   35   65:iload           4
		//   36   67:iconst_1        
		//   37   68:iadd            
		//   38   69:istore          4
		//*  39   71:goto            39
				return mNodeArray;
		//   40   74:aload_0         
		//   41   75:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
		//   42   78:areturn         
			} else
			{
				throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
		//   43   79:new             #44  <Class IllegalArgumentException>
		//   44   82:dup             
		//   45   83:ldc1            #46  <String "Can't interpolate between two incompatible pathData">
		//   46   85:invokespecial   #49  <Method void IllegalArgumentException(String)>
		//   47   88:athrow          
			}
		}

		private android.support.v4.graphics.PathParser.PathDataNode mNodeArray[];

		PathDataEvaluator()
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
		//    4    6:putfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
		//    5    9:return          
		}
	}


	private AnimatorInflaterCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
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
	//    5    5:invokestatic    #48  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//    6    8:aconst_null     
	//    7    9:iconst_0        
	//    8   10:fload           4
	//    9   12:invokestatic    #51  <Method Animator createAnimatorFromXml(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, AttributeSet, AnimatorSet, int, float)>
	//   10   15:areturn         
	}

	private static Animator createAnimatorFromXml(Context context, Resources resources, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser, AttributeSet attributeset, AnimatorSet animatorset, int i, float f)
		throws XmlPullParserException, IOException
	{
		int k;
		ArrayList arraylist;
		Object obj1;
label0:
		{
			int l = xmlpullparser.getDepth();
	//    0    0:aload_3         
	//    1    1:invokeinterface #58  <Method int XmlPullParser.getDepth()>
	//    2    6:istore          10
			obj1 = null;
	//    3    8:aconst_null     
	//    4    9:astore          14
			arraylist = null;
	//    5   11:aconst_null     
	//    6   12:astore          13
			do
			{
				boolean flag;
				int i1;
				do
				{
					i1 = xmlpullparser.next();
	//    7   14:aload_3         
	//    8   15:invokeinterface #61  <Method int XmlPullParser.next()>
	//    9   20:istore          11
					k = 0;
	//   10   22:iconst_0        
	//   11   23:istore          9
					flag = false;
	//   12   25:iconst_0        
	//   13   26:istore          8
					if(i1 == 3 && xmlpullparser.getDepth() <= l || i1 == 1)
						break label0;
	//   14   28:iload           11
	//   15   30:iconst_3        
	//   16   31:icmpne          45
	//   17   34:aload_3         
	//   18   35:invokeinterface #58  <Method int XmlPullParser.getDepth()>
	//   19   40:iload           10
	//   20   42:icmple          342
	//   21   45:iload           11
	//   22   47:iconst_1        
	//   23   48:icmpeq          342
				} while(i1 != 2);
	//   24   51:iload           11
	//   25   53:iconst_2        
	//   26   54:icmpeq          60
	//*  27   57:goto            14
				Object obj = ((Object) (xmlpullparser.getName()));
	//   28   60:aload_3         
	//   29   61:invokeinterface #65  <Method String XmlPullParser.getName()>
	//   30   66:astore          12
				if(((String) (obj)).equals("objectAnimator"))
	//*  31   68:aload           12
	//*  32   70:ldc1            #67  <String "objectAnimator">
	//*  33   72:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  34   75:ifeq            94
					obj = ((Object) (loadObjectAnimator(context, resources, theme, attributeset, f, xmlpullparser)));
	//   35   78:aload_0         
	//   36   79:aload_1         
	//   37   80:aload_2         
	//   38   81:aload           4
	//   39   83:fload           7
	//   40   85:aload_3         
	//   41   86:invokestatic    #77  <Method ObjectAnimator loadObjectAnimator(Context, Resources, android.content.res.Resources$Theme, AttributeSet, float, XmlPullParser)>
	//   42   89:astore          12
				else
	//*  43   91:goto            249
				if(((String) (obj)).equals("animator"))
	//*  44   94:aload           12
	//*  45   96:ldc1            #79  <String "animator">
	//*  46   98:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  47  101:ifeq            121
					obj = ((Object) (loadAnimator(context, resources, theme, attributeset, ((ValueAnimator) (null)), f, xmlpullparser)));
	//   48  104:aload_0         
	//   49  105:aload_1         
	//   50  106:aload_2         
	//   51  107:aload           4
	//   52  109:aconst_null     
	//   53  110:fload           7
	//   54  112:aload_3         
	//   55  113:invokestatic    #83  <Method ValueAnimator loadAnimator(Context, Resources, android.content.res.Resources$Theme, AttributeSet, ValueAnimator, float, XmlPullParser)>
	//   56  116:astore          12
				else
	//*  57  118:goto            249
				if(((String) (obj)).equals("set"))
	//*  58  121:aload           12
	//*  59  123:ldc1            #85  <String "set">
	//*  60  125:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  61  128:ifeq            191
				{
					obj = ((Object) (new AnimatorSet()));
	//   62  131:new             #87  <Class AnimatorSet>
	//   63  134:dup             
	//   64  135:invokespecial   #88  <Method void AnimatorSet()>
	//   65  138:astore          12
					obj1 = ((Object) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_ANIMATOR_SET)));
	//   66  140:aload_1         
	//   67  141:aload_2         
	//   68  142:aload           4
	//   69  144:getstatic       #94  <Field int[] AndroidResources.STYLEABLE_ANIMATOR_SET>
	//   70  147:invokestatic    #100 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   71  150:astore          14
					k = TypedArrayUtils.getNamedInt(((TypedArray) (obj1)), xmlpullparser, "ordering", 0, 0);
	//   72  152:aload           14
	//   73  154:aload_3         
	//   74  155:ldc1            #102 <String "ordering">
	//   75  157:iconst_0        
	//   76  158:iconst_0        
	//   77  159:invokestatic    #106 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   78  162:istore          9
					createAnimatorFromXml(context, resources, theme, xmlpullparser, attributeset, (AnimatorSet)obj, k, f);
	//   79  164:aload_0         
	//   80  165:aload_1         
	//   81  166:aload_2         
	//   82  167:aload_3         
	//   83  168:aload           4
	//   84  170:aload           12
	//   85  172:checkcast       #87  <Class AnimatorSet>
	//   86  175:iload           9
	//   87  177:fload           7
	//   88  179:invokestatic    #51  <Method Animator createAnimatorFromXml(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, AttributeSet, AnimatorSet, int, float)>
	//   89  182:pop             
					((TypedArray) (obj1)).recycle();
	//   90  183:aload           14
	//   91  185:invokevirtual   #111 <Method void TypedArray.recycle()>
				} else
	//*  92  188:goto            249
				{
					if(!((String) (obj)).equals("propertyValuesHolder"))
						break;
	//   93  191:aload           12
	//   94  193:ldc1            #113 <String "propertyValuesHolder">
	//   95  195:invokevirtual   #73  <Method boolean String.equals(Object)>
	//   96  198:ifeq            304
					obj = ((Object) (loadValues(context, resources, theme, xmlpullparser, Xml.asAttributeSet(xmlpullparser))));
	//   97  201:aload_0         
	//   98  202:aload_1         
	//   99  203:aload_2         
	//  100  204:aload_3         
	//  101  205:aload_3         
	//  102  206:invokestatic    #48  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//  103  209:invokestatic    #117 <Method PropertyValuesHolder[] loadValues(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, AttributeSet)>
	//  104  212:astore          12
					if(obj != null && obj1 != null && (obj1 instanceof ValueAnimator))
	//* 105  214:aload           12
	//* 106  216:ifnull          242
	//* 107  219:aload           14
	//* 108  221:ifnull          242
	//* 109  224:aload           14
	//* 110  226:instanceof      #119 <Class ValueAnimator>
	//* 111  229:ifeq            242
						((ValueAnimator)obj1).setValues(((PropertyValuesHolder []) (obj)));
	//  112  232:aload           14
	//  113  234:checkcast       #119 <Class ValueAnimator>
	//  114  237:aload           12
	//  115  239:invokevirtual   #123 <Method void ValueAnimator.setValues(PropertyValuesHolder[])>
					flag = true;
	//  116  242:iconst_1        
	//  117  243:istore          8
					obj = obj1;
	//  118  245:aload           14
	//  119  247:astore          12
				}
				obj1 = obj;
	//  120  249:aload           12
	//  121  251:astore          14
				if(animatorset != null)
	//* 122  253:aload           5
	//* 123  255:ifnull          14
				{
					obj1 = obj;
	//  124  258:aload           12
	//  125  260:astore          14
					if(!flag)
	//* 126  262:iload           8
	//* 127  264:ifne            14
					{
						ArrayList arraylist1 = arraylist;
	//  128  267:aload           13
	//  129  269:astore          15
						if(arraylist == null)
	//* 130  271:aload           13
	//* 131  273:ifnonnull       285
							arraylist1 = new ArrayList();
	//  132  276:new             #125 <Class ArrayList>
	//  133  279:dup             
	//  134  280:invokespecial   #126 <Method void ArrayList()>
	//  135  283:astore          15
						arraylist1.add(obj);
	//  136  285:aload           15
	//  137  287:aload           12
	//  138  289:invokevirtual   #129 <Method boolean ArrayList.add(Object)>
	//  139  292:pop             
						obj1 = obj;
	//  140  293:aload           12
	//  141  295:astore          14
						arraylist = arraylist1;
	//  142  297:aload           15
	//  143  299:astore          13
					}
				}
			} while(true);
	//  144  301:goto            14
			context = ((Context) (new StringBuilder()));
	//  145  304:new             #131 <Class StringBuilder>
	//  146  307:dup             
	//  147  308:invokespecial   #132 <Method void StringBuilder()>
	//  148  311:astore_0        
			((StringBuilder) (context)).append("Unknown animator name: ");
	//  149  312:aload_0         
	//  150  313:ldc1            #134 <String "Unknown animator name: ">
	//  151  315:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//  152  318:pop             
			((StringBuilder) (context)).append(xmlpullparser.getName());
	//  153  319:aload_0         
	//  154  320:aload_3         
	//  155  321:invokeinterface #65  <Method String XmlPullParser.getName()>
	//  156  326:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//  157  329:pop             
			throw new RuntimeException(((StringBuilder) (context)).toString());
	//  158  330:new             #140 <Class RuntimeException>
	//  159  333:dup             
	//  160  334:aload_0         
	//  161  335:invokevirtual   #143 <Method String StringBuilder.toString()>
	//  162  338:invokespecial   #146 <Method void RuntimeException(String)>
	//  163  341:athrow          
		}
		if(animatorset != null && arraylist != null)
	//* 164  342:aload           5
	//* 165  344:ifnull          422
	//* 166  347:aload           13
	//* 167  349:ifnull          422
		{
			context = ((Context) (new Animator[arraylist.size()]));
	//  168  352:aload           13
	//  169  354:invokevirtual   #149 <Method int ArrayList.size()>
	//  170  357:anewarray       Animator[]
	//  171  360:astore_0        
			resources = ((Resources) (arraylist.iterator()));
	//  172  361:aload           13
	//  173  363:invokevirtual   #155 <Method Iterator ArrayList.iterator()>
	//  174  366:astore_1        
			for(int j = k; ((Iterator) (resources)).hasNext(); j++)
	//* 175  367:iload           9
	//* 176  369:istore          8
	//* 177  371:aload_1         
	//* 178  372:invokeinterface #161 <Method boolean Iterator.hasNext()>
	//* 179  377:ifeq            402
				context[j] = ((/*<invalid signature>*/java.lang.Object) ((Animator)((Iterator) (resources)).next()));
	//  180  380:aload_0         
	//  181  381:iload           8
	//  182  383:aload_1         
	//  183  384:invokeinterface #164 <Method Object Iterator.next()>
	//  184  389:checkcast       #151 <Class Animator>
	//  185  392:aastore         

	//  186  393:iload           8
	//  187  395:iconst_1        
	//  188  396:iadd            
	//  189  397:istore          8
	//* 190  399:goto            371
			if(i == 0)
	//* 191  402:iload           6
	//* 192  404:ifne            416
			{
				animatorset.playTogether(((Animator []) (context)));
	//  193  407:aload           5
	//  194  409:aload_0         
	//  195  410:invokevirtual   #168 <Method void AnimatorSet.playTogether(Animator[])>
				return ((Animator) (obj1));
	//  196  413:aload           14
	//  197  415:areturn         
			}
			animatorset.playSequentially(((Animator []) (context)));
	//  198  416:aload           5
	//  199  418:aload_0         
	//  200  419:invokevirtual   #171 <Method void AnimatorSet.playSequentially(Animator[])>
		}
		return ((Animator) (obj1));
	//  201  422:aload           14
	//  202  424:areturn         
	}

	private static Keyframe createNewKeyframe(Keyframe keyframe, float f)
	{
		if(keyframe.getType() == Float.TYPE)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #179 <Method Class Keyframe.getType()>
	//*   2    4:getstatic       #185 <Field Class Float.TYPE>
	//*   3    7:if_acmpne       15
			return Keyframe.ofFloat(f);
	//    4   10:fload_1         
	//    5   11:invokestatic    #189 <Method Keyframe Keyframe.ofFloat(float)>
	//    6   14:areturn         
		if(keyframe.getType() == Integer.TYPE)
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #179 <Method Class Keyframe.getType()>
	//*   9   19:getstatic       #192 <Field Class Integer.TYPE>
	//*  10   22:if_acmpne       30
			return Keyframe.ofInt(f);
	//   11   25:fload_1         
	//   12   26:invokestatic    #195 <Method Keyframe Keyframe.ofInt(float)>
	//   13   29:areturn         
		else
			return Keyframe.ofObject(f);
	//   14   30:fload_1         
	//   15   31:invokestatic    #198 <Method Keyframe Keyframe.ofObject(float)>
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
	//   20   22:invokevirtual   #204 <Method float Keyframe.getFraction()>
	//   21   25:fload_1         
	//   22   26:fadd            
	//   23   27:invokevirtual   #208 <Method void Keyframe.setFraction(float)>

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
	//    6   10:ldc1            #21  <String "AnimatorInflater">
	//    7   12:aload_1         
	//    8   13:invokestatic    #216 <Method int Log.d(String, String)>
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
	//   21   30:checkcast       #175 <Class Keyframe>
	//   22   33:astore          5
				StringBuilder stringbuilder = new StringBuilder();
	//   23   35:new             #131 <Class StringBuilder>
	//   24   38:dup             
	//   25   39:invokespecial   #132 <Method void StringBuilder()>
	//   26   42:astore          4
				stringbuilder.append("Keyframe ");
	//   27   44:aload           4
	//   28   46:ldc1            #218 <String "Keyframe ">
	//   29   48:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   30   51:pop             
				stringbuilder.append(i);
	//   31   52:aload           4
	//   32   54:iload_2         
	//   33   55:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   34   58:pop             
				stringbuilder.append(": fraction ");
	//   35   59:aload           4
	//   36   61:ldc1            #223 <String ": fraction ">
	//   37   63:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   38   66:pop             
				if(keyframe.getFraction() < 0.0F)
	//*  39   67:aload           5
	//*  40   69:invokevirtual   #204 <Method float Keyframe.getFraction()>
	//*  41   72:fconst_0        
	//*  42   73:fcmpg           
	//*  43   74:ifge            83
					s = "null";
	//   44   77:ldc1            #225 <String "null">
	//   45   79:astore_1        
				else
	//*  46   80:goto            92
					s = ((String) (Float.valueOf(keyframe.getFraction())));
	//   47   83:aload           5
	//   48   85:invokevirtual   #204 <Method float Keyframe.getFraction()>
	//   49   88:invokestatic    #229 <Method Float Float.valueOf(float)>
	//   50   91:astore_1        
				stringbuilder.append(((Object) (s)));
	//   51   92:aload           4
	//   52   94:aload_1         
	//   53   95:invokevirtual   #232 <Method StringBuilder StringBuilder.append(Object)>
	//   54   98:pop             
				stringbuilder.append(", ");
	//   55   99:aload           4
	//   56  101:ldc1            #234 <String ", ">
	//   57  103:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   58  106:pop             
				stringbuilder.append(", value : ");
	//   59  107:aload           4
	//   60  109:ldc1            #236 <String ", value : ">
	//   61  111:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   62  114:pop             
				if(keyframe.hasValue())
	//*  63  115:aload           5
	//*  64  117:invokevirtual   #239 <Method boolean Keyframe.hasValue()>
	//*  65  120:ifeq            132
					s = ((String) (keyframe.getValue()));
	//   66  123:aload           5
	//   67  125:invokevirtual   #242 <Method Object Keyframe.getValue()>
	//   68  128:astore_1        
				else
	//*  69  129:goto            135
					s = "null";
	//   70  132:ldc1            #225 <String "null">
	//   71  134:astore_1        
				stringbuilder.append(((Object) (s)));
	//   72  135:aload           4
	//   73  137:aload_1         
	//   74  138:invokevirtual   #232 <Method StringBuilder StringBuilder.append(Object)>
	//   75  141:pop             
				Log.d("AnimatorInflater", stringbuilder.toString());
	//   76  142:ldc1            #21  <String "AnimatorInflater">
	//   77  144:aload           4
	//   78  146:invokevirtual   #143 <Method String StringBuilder.toString()>
	//   79  149:invokestatic    #216 <Method int Log.d(String, String)>
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
	//    2    2:invokevirtual   #248 <Method TypedValue TypedArray.peekValue(int)>
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
	//   14   28:getfield        #253 <Field int TypedValue.type>
	//   15   31:istore          10
			else
	//*  16   33:goto            39
				i1 = 0;
	//   17   36:iconst_0        
	//   18   37:istore          10
			typedvalue = typedarray.peekValue(k);
	//   19   39:aload_0         
	//   20   40:iload_3         
	//   21   41:invokevirtual   #248 <Method TypedValue TypedArray.peekValue(int)>
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
	//   33   67:getfield        #253 <Field int TypedValue.type>
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
	//*  46   93:invokestatic    #257 <Method boolean isColorType(int)>
	//*  47   96:ifne            112
	//*  48   99:iload           9
	//*  49  101:ifeq            118
	//*  50  104:iload           11
	//*  51  106:invokestatic    #257 <Method boolean isColorType(int)>
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
	//*  71  142:icmpne          331
			{
				String s1 = typedarray.getString(j);
	//   72  145:aload_0         
	//   73  146:iload_2         
	//   74  147:invokevirtual   #261 <Method String TypedArray.getString(int)>
	//   75  150:astore          13
				s2 = typedarray.getString(k);
	//   76  152:aload_0         
	//   77  153:iload_3         
	//   78  154:invokevirtual   #261 <Method String TypedArray.getString(int)>
	//   79  157:astore          14
				android.support.v4.graphics.PathParser.PathDataNode apathdatanode[] = PathParser.createNodesFromPathData(s1);
	//   80  159:aload           13
	//   81  161:invokestatic    #267 <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.createNodesFromPathData(String)>
	//   82  164:astore          15
				android.support.v4.graphics.PathParser.PathDataNode apathdatanode1[] = PathParser.createNodesFromPathData(s2);
	//   83  166:aload           14
	//   84  168:invokestatic    #267 <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.createNodesFromPathData(String)>
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
	//   91  183:ifnull          719
				}
				if(apathdatanode != null)
	//*  92  186:aload           15
	//*  93  188:ifnull          301
				{
					typedarray = ((TypedArray) (new PathDataEvaluator()));
	//   94  191:new             #6   <Class AnimatorInflaterCompat$PathDataEvaluator>
	//   95  194:dup             
	//   96  195:invokespecial   #268 <Method void AnimatorInflaterCompat$PathDataEvaluator()>
	//   97  198:astore_0        
					if(apathdatanode1 != null)
	//*  98  199:aload           16
	//*  99  201:ifnull          285
					{
						if(PathParser.canMorph(apathdatanode, apathdatanode1))
	//* 100  204:aload           15
	//* 101  206:aload           16
	//* 102  208:invokestatic    #272 <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
	//* 103  211:ifeq            235
						{
							return PropertyValuesHolder.ofObject(s, ((TypeEvaluator) (typedarray)), new Object[] {
								apathdatanode, apathdatanode1
							});
	//  104  214:aload           4
	//  105  216:aload_0         
	//  106  217:iconst_2        
	//  107  218:anewarray       Object[]
	//  108  221:dup             
	//  109  222:iconst_0        
	//  110  223:aload           15
	//  111  225:aastore         
	//  112  226:dup             
	//  113  227:iconst_1        
	//  114  228:aload           16
	//  115  230:aastore         
	//  116  231:invokestatic    #277 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(String, TypeEvaluator, Object[])>
	//  117  234:areturn         
						} else
						{
							typedarray = ((TypedArray) (new StringBuilder()));
	//  118  235:new             #131 <Class StringBuilder>
	//  119  238:dup             
	//  120  239:invokespecial   #132 <Method void StringBuilder()>
	//  121  242:astore_0        
							((StringBuilder) (typedarray)).append(" Can't morph from ");
	//  122  243:aload_0         
	//  123  244:ldc2            #279 <String " Can't morph from ">
	//  124  247:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//  125  250:pop             
							((StringBuilder) (typedarray)).append(s1);
	//  126  251:aload_0         
	//  127  252:aload           13
	//  128  254:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//  129  257:pop             
							((StringBuilder) (typedarray)).append(" to ");
	//  130  258:aload_0         
	//  131  259:ldc2            #281 <String " to ">
	//  132  262:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//  133  265:pop             
							((StringBuilder) (typedarray)).append(s2);
	//  134  266:aload_0         
	//  135  267:aload           14
	//  136  269:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//  137  272:pop             
							throw new InflateException(((StringBuilder) (typedarray)).toString());
	//  138  273:new             #283 <Class InflateException>
	//  139  276:dup             
	//  140  277:aload_0         
	//  141  278:invokevirtual   #143 <Method String StringBuilder.toString()>
	//  142  281:invokespecial   #284 <Method void InflateException(String)>
	//  143  284:athrow          
						}
					} else
					{
						return PropertyValuesHolder.ofObject(s, ((TypeEvaluator) (typedarray)), new Object[] {
							apathdatanode
						});
	//  144  285:aload           4
	//  145  287:aload_0         
	//  146  288:iconst_1        
	//  147  289:anewarray       Object[]
	//  148  292:dup             
	//  149  293:iconst_0        
	//  150  294:aload           15
	//  151  296:aastore         
	//  152  297:invokestatic    #277 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(String, TypeEvaluator, Object[])>
	//  153  300:areturn         
					}
				}
				typedarray = ((TypedArray) (typedvalue));
	//  154  301:aload           12
	//  155  303:astore_0        
				if(apathdatanode1 != null)
	//* 156  304:aload           16
	//* 157  306:ifnull          719
					return PropertyValuesHolder.ofObject(s, ((TypeEvaluator) (new PathDataEvaluator())), new Object[] {
						apathdatanode1
					});
	//  158  309:aload           4
	//  159  311:new             #6   <Class AnimatorInflaterCompat$PathDataEvaluator>
	//  160  314:dup             
	//  161  315:invokespecial   #268 <Method void AnimatorInflaterCompat$PathDataEvaluator()>
	//  162  318:iconst_1        
	//  163  319:anewarray       Object[]
	//  164  322:dup             
	//  165  323:iconst_0        
	//  166  324:aload           16
	//  167  326:aastore         
	//  168  327:invokestatic    #277 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(String, TypeEvaluator, Object[])>
	//  169  330:areturn         
			} else
			{
				ArgbEvaluator argbevaluator;
				if(l == 3)
	//* 170  331:iload           7
	//* 171  333:iconst_3        
	//* 172  334:icmpne          345
					argbevaluator = ArgbEvaluator.getInstance();
	//  173  337:invokestatic    #290 <Method ArgbEvaluator ArgbEvaluator.getInstance()>
	//  174  340:astore          13
				else
	//* 175  342:goto            348
					argbevaluator = null;
	//  176  345:aconst_null     
	//  177  346:astore          13
				Object obj;
				if(i != 0)
	//* 178  348:iload_1         
	//* 179  349:ifeq            496
				{
					if(flag)
	//* 180  352:iload           8
	//* 181  354:ifeq            453
					{
						float f;
						if(i1 == 5)
	//* 182  357:iload           10
	//* 183  359:iconst_5        
	//* 184  360:icmpne          374
							f = typedarray.getDimension(j, 0.0F);
	//  185  363:aload_0         
	//  186  364:iload_2         
	//  187  365:fconst_0        
	//  188  366:invokevirtual   #294 <Method float TypedArray.getDimension(int, float)>
	//  189  369:fstore          5
						else
	//* 190  371:goto            382
							f = typedarray.getFloat(j, 0.0F);
	//  191  374:aload_0         
	//  192  375:iload_2         
	//  193  376:fconst_0        
	//  194  377:invokevirtual   #297 <Method float TypedArray.getFloat(int, float)>
	//  195  380:fstore          5
						if(flag1)
	//* 196  382:iload           9
	//* 197  384:ifeq            435
						{
							float f2;
							if(j1 == 5)
	//* 198  387:iload           11
	//* 199  389:iconst_5        
	//* 200  390:icmpne          404
								f2 = typedarray.getDimension(k, 0.0F);
	//  201  393:aload_0         
	//  202  394:iload_3         
	//  203  395:fconst_0        
	//  204  396:invokevirtual   #294 <Method float TypedArray.getDimension(int, float)>
	//  205  399:fstore          6
							else
	//* 206  401:goto            412
								f2 = typedarray.getFloat(k, 0.0F);
	//  207  404:aload_0         
	//  208  405:iload_3         
	//  209  406:fconst_0        
	//  210  407:invokevirtual   #297 <Method float TypedArray.getFloat(int, float)>
	//  211  410:fstore          6
							obj = ((Object) (PropertyValuesHolder.ofFloat(s, new float[] {
								f, f2
							})));
	//  212  412:aload           4
	//  213  414:iconst_2        
	//  214  415:newarray        float[]
	//  215  417:dup             
	//  216  418:iconst_0        
	//  217  419:fload           5
	//  218  421:fastore         
	//  219  422:dup             
	//  220  423:iconst_1        
	//  221  424:fload           6
	//  222  426:fastore         
	//  223  427:invokestatic    #300 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  224  430:astore          12
						} else
	//* 225  432:goto            693
						{
							obj = ((Object) (PropertyValuesHolder.ofFloat(s, new float[] {
								f
							})));
	//  226  435:aload           4
	//  227  437:iconst_1        
	//  228  438:newarray        float[]
	//  229  440:dup             
	//  230  441:iconst_0        
	//  231  442:fload           5
	//  232  444:fastore         
	//  233  445:invokestatic    #300 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  234  448:astore          12
						}
					} else
	//* 235  450:goto            693
					{
						float f1;
						if(j1 == 5)
	//* 236  453:iload           11
	//* 237  455:iconst_5        
	//* 238  456:icmpne          470
							f1 = typedarray.getDimension(k, 0.0F);
	//  239  459:aload_0         
	//  240  460:iload_3         
	//  241  461:fconst_0        
	//  242  462:invokevirtual   #294 <Method float TypedArray.getDimension(int, float)>
	//  243  465:fstore          5
						else
	//* 244  467:goto            478
							f1 = typedarray.getFloat(k, 0.0F);
	//  245  470:aload_0         
	//  246  471:iload_3         
	//  247  472:fconst_0        
	//  248  473:invokevirtual   #297 <Method float TypedArray.getFloat(int, float)>
	//  249  476:fstore          5
						obj = ((Object) (PropertyValuesHolder.ofFloat(s, new float[] {
							f1
						})));
	//  250  478:aload           4
	//  251  480:iconst_1        
	//  252  481:newarray        float[]
	//  253  483:dup             
	//  254  484:iconst_0        
	//  255  485:fload           5
	//  256  487:fastore         
	//  257  488:invokestatic    #300 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  258  491:astore          12
					}
				} else
	//* 259  493:goto            693
				if(flag)
	//* 260  496:iload           8
	//* 261  498:ifeq            628
				{
					if(i1 == 5)
	//* 262  501:iload           10
	//* 263  503:iconst_5        
	//* 264  504:icmpne          518
						i = (int)typedarray.getDimension(j, 0.0F);
	//  265  507:aload_0         
	//  266  508:iload_2         
	//  267  509:fconst_0        
	//  268  510:invokevirtual   #294 <Method float TypedArray.getDimension(int, float)>
	//  269  513:f2i             
	//  270  514:istore_1        
					else
	//* 271  515:goto            543
					if(isColorType(i1))
	//* 272  518:iload           10
	//* 273  520:invokestatic    #257 <Method boolean isColorType(int)>
	//* 274  523:ifeq            536
						i = typedarray.getColor(j, 0);
	//  275  526:aload_0         
	//  276  527:iload_2         
	//  277  528:iconst_0        
	//  278  529:invokevirtual   #304 <Method int TypedArray.getColor(int, int)>
	//  279  532:istore_1        
					else
	//* 280  533:goto            543
						i = typedarray.getInt(j, 0);
	//  281  536:aload_0         
	//  282  537:iload_2         
	//  283  538:iconst_0        
	//  284  539:invokevirtual   #307 <Method int TypedArray.getInt(int, int)>
	//  285  542:istore_1        
					if(flag1)
	//* 286  543:iload           9
	//* 287  545:ifeq            611
					{
						if(j1 == 5)
	//* 288  548:iload           11
	//* 289  550:iconst_5        
	//* 290  551:icmpne          565
							j = (int)typedarray.getDimension(k, 0.0F);
	//  291  554:aload_0         
	//  292  555:iload_3         
	//  293  556:fconst_0        
	//  294  557:invokevirtual   #294 <Method float TypedArray.getDimension(int, float)>
	//  295  560:f2i             
	//  296  561:istore_2        
						else
	//* 297  562:goto            590
						if(isColorType(j1))
	//* 298  565:iload           11
	//* 299  567:invokestatic    #257 <Method boolean isColorType(int)>
	//* 300  570:ifeq            583
							j = typedarray.getColor(k, 0);
	//  301  573:aload_0         
	//  302  574:iload_3         
	//  303  575:iconst_0        
	//  304  576:invokevirtual   #304 <Method int TypedArray.getColor(int, int)>
	//  305  579:istore_2        
						else
	//* 306  580:goto            590
							j = typedarray.getInt(k, 0);
	//  307  583:aload_0         
	//  308  584:iload_3         
	//  309  585:iconst_0        
	//  310  586:invokevirtual   #307 <Method int TypedArray.getInt(int, int)>
	//  311  589:istore_2        
						obj = ((Object) (PropertyValuesHolder.ofInt(s, new int[] {
							i, j
						})));
	//  312  590:aload           4
	//  313  592:iconst_2        
	//  314  593:newarray        int[]
	//  315  595:dup             
	//  316  596:iconst_0        
	//  317  597:iload_1         
	//  318  598:iastore         
	//  319  599:dup             
	//  320  600:iconst_1        
	//  321  601:iload_2         
	//  322  602:iastore         
	//  323  603:invokestatic    #310 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//  324  606:astore          12
					} else
	//* 325  608:goto            693
					{
						obj = ((Object) (PropertyValuesHolder.ofInt(s, new int[] {
							i
						})));
	//  326  611:aload           4
	//  327  613:iconst_1        
	//  328  614:newarray        int[]
	//  329  616:dup             
	//  330  617:iconst_0        
	//  331  618:iload_1         
	//  332  619:iastore         
	//  333  620:invokestatic    #310 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//  334  623:astore          12
					}
				} else
	//* 335  625:goto            693
				{
					obj = ((Object) (s2));
	//  336  628:aload           14
	//  337  630:astore          12
					if(flag1)
	//* 338  632:iload           9
	//* 339  634:ifeq            693
					{
						if(j1 == 5)
	//* 340  637:iload           11
	//* 341  639:iconst_5        
	//* 342  640:icmpne          654
							i = (int)typedarray.getDimension(k, 0.0F);
	//  343  643:aload_0         
	//  344  644:iload_3         
	//  345  645:fconst_0        
	//  346  646:invokevirtual   #294 <Method float TypedArray.getDimension(int, float)>
	//  347  649:f2i             
	//  348  650:istore_1        
						else
	//* 349  651:goto            679
						if(isColorType(j1))
	//* 350  654:iload           11
	//* 351  656:invokestatic    #257 <Method boolean isColorType(int)>
	//* 352  659:ifeq            672
							i = typedarray.getColor(k, 0);
	//  353  662:aload_0         
	//  354  663:iload_3         
	//  355  664:iconst_0        
	//  356  665:invokevirtual   #304 <Method int TypedArray.getColor(int, int)>
	//  357  668:istore_1        
						else
	//* 358  669:goto            679
							i = typedarray.getInt(k, 0);
	//  359  672:aload_0         
	//  360  673:iload_3         
	//  361  674:iconst_0        
	//  362  675:invokevirtual   #307 <Method int TypedArray.getInt(int, int)>
	//  363  678:istore_1        
						obj = ((Object) (PropertyValuesHolder.ofInt(s, new int[] {
							i
						})));
	//  364  679:aload           4
	//  365  681:iconst_1        
	//  366  682:newarray        int[]
	//  367  684:dup             
	//  368  685:iconst_0        
	//  369  686:iload_1         
	//  370  687:iastore         
	//  371  688:invokestatic    #310 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
	//  372  691:astore          12
					}
				}
				typedarray = ((TypedArray) (obj));
	//  373  693:aload           12
	//  374  695:astore_0        
				if(obj != null)
	//* 375  696:aload           12
	//* 376  698:ifnull          719
				{
					typedarray = ((TypedArray) (obj));
	//  377  701:aload           12
	//  378  703:astore_0        
					if(argbevaluator != null)
	//* 379  704:aload           13
	//* 380  706:ifnull          719
					{
						((PropertyValuesHolder) (obj)).setEvaluator(((TypeEvaluator) (argbevaluator)));
	//  381  709:aload           12
	//  382  711:aload           13
	//  383  713:invokevirtual   #314 <Method void PropertyValuesHolder.setEvaluator(TypeEvaluator)>
						typedarray = ((TypedArray) (obj));
	//  384  716:aload           12
	//  385  718:astore_0        
					}
				}
			}
		}
		return ((PropertyValuesHolder) (typedarray));
	//  386  719:aload_0         
	//  387  720:areturn         
	}

	private static int inferValueTypeFromValues(TypedArray typedarray, int i, int j)
	{
label0:
		{
			TypedValue typedvalue = typedarray.peekValue(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #248 <Method TypedValue TypedArray.peekValue(int)>
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
	//   18   31:getfield        #253 <Field int TypedValue.type>
	//   19   34:istore_3        
			else
	//*  20   35:goto            40
				k = 0;
	//   21   38:iconst_0        
	//   22   39:istore_3        
			typedarray = ((TypedArray) (typedarray.peekValue(j)));
	//   23   40:aload_0         
	//   24   41:iload_2         
	//   25   42:invokevirtual   #248 <Method TypedValue TypedArray.peekValue(int)>
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
	//   37   63:getfield        #253 <Field int TypedValue.type>
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
	//*  45   79:invokestatic    #257 <Method boolean isColorType(int)>
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
	//   54   97:invokestatic    #257 <Method boolean isColorType(int)>
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
	//    3    3:getstatic       #321 <Field int[] AndroidResources.STYLEABLE_KEYFRAME>
	//    4    6:invokestatic    #100 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore_0        
		boolean flag1 = false;
	//    6   10:iconst_0        
	//    7   11:istore          6
		theme = ((android.content.res.Resources.Theme) (TypedArrayUtils.peekNamedValue(((TypedArray) (resources)), xmlpullparser, "value", 0)));
	//    8   13:aload_0         
	//    9   14:aload_3         
	//   10   15:ldc2            #322 <String "value">
	//   11   18:iconst_0        
	//   12   19:invokestatic    #326 <Method TypedValue TypedArrayUtils.peekNamedValue(TypedArray, XmlPullParser, String, int)>
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
	//*  28   50:getfield        #253 <Field int TypedValue.type>
	//*  29   53:invokestatic    #257 <Method boolean isColorType(int)>
	//*  30   56:ifeq            62
				byte0 = 3;
	//   31   59:iconst_3        
	//   32   60:istore          5
		}
		((TypedArray) (resources)).recycle();
	//   33   62:aload_0         
	//   34   63:invokevirtual   #111 <Method void TypedArray.recycle()>
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
	//*   0    0:getstatic       #335 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          14
			return AnimatorInflater.loadAnimator(context, i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokestatic    #339 <Method Animator AnimatorInflater.loadAnimator(Context, int)>
	//    6   13:areturn         
		else
			return loadAnimator(context, context.getResources(), context.getTheme(), i);
	//    7   14:aload_0         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #345 <Method Resources Context.getResources()>
	//   10   19:aload_0         
	//   11   20:invokevirtual   #349 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   12   23:iload_1         
	//   13   24:invokestatic    #352 <Method Animator loadAnimator(Context, Resources, android.content.res.Resources$Theme, int)>
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
	//    5    5:invokestatic    #356 <Method Animator loadAnimator(Context, Resources, android.content.res.Resources$Theme, int, float)>
	//    6    8:areturn         
	}

	public static Animator loadAnimator(Context context, Resources resources, android.content.res.Resources.Theme theme, int i, float f)
		throws android.content.res.Resources.NotFoundException
	{
		XmlResourceParser xmlresourceparser;
		XmlResourceParser xmlresourceparser1;
		XmlResourceParser xmlresourceparser2;
		xmlresourceparser1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		xmlresourceparser2 = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		xmlresourceparser = null;
	//    4    6:aconst_null     
	//    5    7:astore          5
		XmlResourceParser xmlresourceparser3 = resources.getAnimation(i);
	//    6    9:aload_1         
	//    7   10:iload_3         
	//    8   11:invokevirtual   #362 <Method XmlResourceParser Resources.getAnimation(int)>
	//    9   14:astore          8
		xmlresourceparser = xmlresourceparser3;
	//   10   16:aload           8
	//   11   18:astore          5
		xmlresourceparser1 = xmlresourceparser3;
	//   12   20:aload           8
	//   13   22:astore          6
		xmlresourceparser2 = xmlresourceparser3;
	//   14   24:aload           8
	//   15   26:astore          7
		context = ((Context) (createAnimatorFromXml(context, resources, theme, ((XmlPullParser) (xmlresourceparser3)), f)));
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:aload           8
	//   20   33:fload           4
	//   21   35:invokestatic    #364 <Method Animator createAnimatorFromXml(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, float)>
	//   22   38:astore_0        
		if(xmlresourceparser3 != null)
	//*  23   39:aload           8
	//*  24   41:ifnull          51
			xmlresourceparser3.close();
	//   25   44:aload           8
	//   26   46:invokeinterface #369 <Method void XmlResourceParser.close()>
		return ((Animator) (context));
	//   27   51:aload_0         
	//   28   52:areturn         
		context;
	//   29   53:astore_0        
		break MISSING_BLOCK_LABEL_197;
	//   30   54:goto            197
		context;
	//   31   57:astore_0        
		xmlresourceparser = xmlresourceparser1;
	//   32   58:aload           6
	//   33   60:astore          5
		resources = ((Resources) (new StringBuilder()));
	//   34   62:new             #131 <Class StringBuilder>
	//   35   65:dup             
	//   36   66:invokespecial   #132 <Method void StringBuilder()>
	//   37   69:astore_1        
		xmlresourceparser = xmlresourceparser1;
	//   38   70:aload           6
	//   39   72:astore          5
		((StringBuilder) (resources)).append("Can't load animation resource ID #0x");
	//   40   74:aload_1         
	//   41   75:ldc2            #371 <String "Can't load animation resource ID #0x">
	//   42   78:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   43   81:pop             
		xmlresourceparser = xmlresourceparser1;
	//   44   82:aload           6
	//   45   84:astore          5
		((StringBuilder) (resources)).append(Integer.toHexString(i));
	//   46   86:aload_1         
	//   47   87:iload_3         
	//   48   88:invokestatic    #374 <Method String Integer.toHexString(int)>
	//   49   91:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   50   94:pop             
		xmlresourceparser = xmlresourceparser1;
	//   51   95:aload           6
	//   52   97:astore          5
		resources = ((Resources) (new android.content.res.Resources.NotFoundException(((StringBuilder) (resources)).toString())));
	//   53   99:new             #329 <Class android.content.res.Resources$NotFoundException>
	//   54  102:dup             
	//   55  103:aload_1         
	//   56  104:invokevirtual   #143 <Method String StringBuilder.toString()>
	//   57  107:invokespecial   #375 <Method void android.content.res.Resources$NotFoundException(String)>
	//   58  110:astore_1        
		xmlresourceparser = xmlresourceparser1;
	//   59  111:aload           6
	//   60  113:astore          5
		((android.content.res.Resources.NotFoundException) (resources)).initCause(((Throwable) (context)));
	//   61  115:aload_1         
	//   62  116:aload_0         
	//   63  117:invokevirtual   #379 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
	//   64  120:pop             
		xmlresourceparser = xmlresourceparser1;
	//   65  121:aload           6
	//   66  123:astore          5
		throw resources;
	//   67  125:aload_1         
	//   68  126:athrow          
		context;
	//   69  127:astore_0        
		xmlresourceparser = xmlresourceparser2;
	//   70  128:aload           7
	//   71  130:astore          5
		resources = ((Resources) (new StringBuilder()));
	//   72  132:new             #131 <Class StringBuilder>
	//   73  135:dup             
	//   74  136:invokespecial   #132 <Method void StringBuilder()>
	//   75  139:astore_1        
		xmlresourceparser = xmlresourceparser2;
	//   76  140:aload           7
	//   77  142:astore          5
		((StringBuilder) (resources)).append("Can't load animation resource ID #0x");
	//   78  144:aload_1         
	//   79  145:ldc2            #371 <String "Can't load animation resource ID #0x">
	//   80  148:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   81  151:pop             
		xmlresourceparser = xmlresourceparser2;
	//   82  152:aload           7
	//   83  154:astore          5
		((StringBuilder) (resources)).append(Integer.toHexString(i));
	//   84  156:aload_1         
	//   85  157:iload_3         
	//   86  158:invokestatic    #374 <Method String Integer.toHexString(int)>
	//   87  161:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   88  164:pop             
		xmlresourceparser = xmlresourceparser2;
	//   89  165:aload           7
	//   90  167:astore          5
		resources = ((Resources) (new android.content.res.Resources.NotFoundException(((StringBuilder) (resources)).toString())));
	//   91  169:new             #329 <Class android.content.res.Resources$NotFoundException>
	//   92  172:dup             
	//   93  173:aload_1         
	//   94  174:invokevirtual   #143 <Method String StringBuilder.toString()>
	//   95  177:invokespecial   #375 <Method void android.content.res.Resources$NotFoundException(String)>
	//   96  180:astore_1        
		xmlresourceparser = xmlresourceparser2;
	//   97  181:aload           7
	//   98  183:astore          5
		((android.content.res.Resources.NotFoundException) (resources)).initCause(((Throwable) (context)));
	//   99  185:aload_1         
	//  100  186:aload_0         
	//  101  187:invokevirtual   #379 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
	//  102  190:pop             
		xmlresourceparser = xmlresourceparser2;
	//  103  191:aload           7
	//  104  193:astore          5
		throw resources;
	//  105  195:aload_1         
	//  106  196:athrow          
		if(xmlresourceparser != null)
	//* 107  197:aload           5
	//* 108  199:ifnull          209
			xmlresourceparser.close();
	//  109  202:aload           5
	//  110  204:invokeinterface #369 <Method void XmlResourceParser.close()>
		throw context;
	//  111  209:aload_0         
	//  112  210:athrow          
	}

	private static ValueAnimator loadAnimator(Context context, Resources resources, android.content.res.Resources.Theme theme, AttributeSet attributeset, ValueAnimator valueanimator, float f, XmlPullParser xmlpullparser)
		throws android.content.res.Resources.NotFoundException
	{
		TypedArray typedarray = TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_ANIMATOR);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:getstatic       #382 <Field int[] AndroidResources.STYLEABLE_ANIMATOR>
	//    4    6:invokestatic    #100 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore          8
		theme = ((android.content.res.Resources.Theme) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_PROPERTY_ANIMATOR)));
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:aload_3         
	//    9   14:getstatic       #385 <Field int[] AndroidResources.STYLEABLE_PROPERTY_ANIMATOR>
	//   10   17:invokestatic    #100 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   11   20:astore_2        
		resources = ((Resources) (valueanimator));
	//   12   21:aload           4
	//   13   23:astore_1        
		if(valueanimator == null)
	//*  14   24:aload           4
	//*  15   26:ifnonnull       37
			resources = ((Resources) (new ValueAnimator()));
	//   16   29:new             #119 <Class ValueAnimator>
	//   17   32:dup             
	//   18   33:invokespecial   #386 <Method void ValueAnimator()>
	//   19   36:astore_1        
		parseAnimatorFromTypeArray(((ValueAnimator) (resources)), typedarray, ((TypedArray) (theme)), f, xmlpullparser);
	//   20   37:aload_1         
	//   21   38:aload           8
	//   22   40:aload_2         
	//   23   41:fload           5
	//   24   43:aload           6
	//   25   45:invokestatic    #390 <Method void parseAnimatorFromTypeArray(ValueAnimator, TypedArray, TypedArray, float, XmlPullParser)>
		int i = TypedArrayUtils.getNamedResourceId(typedarray, xmlpullparser, "interpolator", 0, 0);
	//   26   48:aload           8
	//   27   50:aload           6
	//   28   52:ldc2            #392 <String "interpolator">
	//   29   55:iconst_0        
	//   30   56:iconst_0        
	//   31   57:invokestatic    #395 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   32   60:istore          7
		if(i > 0)
	//*  33   62:iload           7
	//*  34   64:ifle            77
			((ValueAnimator) (resources)).setInterpolator(((android.animation.TimeInterpolator) (AnimationUtilsCompat.loadInterpolator(context, i))));
	//   35   67:aload_1         
	//   36   68:aload_0         
	//   37   69:iload           7
	//   38   71:invokestatic    #401 <Method android.view.animation.Interpolator AnimationUtilsCompat.loadInterpolator(Context, int)>
	//   39   74:invokevirtual   #405 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
		typedarray.recycle();
	//   40   77:aload           8
	//   41   79:invokevirtual   #111 <Method void TypedArray.recycle()>
		if(theme != null)
	//*  42   82:aload_2         
	//*  43   83:ifnull          90
			((TypedArray) (theme)).recycle();
	//   44   86:aload_2         
	//   45   87:invokevirtual   #111 <Method void TypedArray.recycle()>
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
	//    3    3:getstatic       #321 <Field int[] AndroidResources.STYLEABLE_KEYFRAME>
	//    4    6:invokestatic    #100 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore_2        
		f = TypedArrayUtils.getNamedFloat(((TypedArray) (theme)), xmlpullparser, "fraction", 3, -1F);
	//    6   10:aload_2         
	//    7   11:aload           5
	//    8   13:ldc2            #409 <String "fraction">
	//    9   16:iconst_3        
	//   10   17:ldc2            #410 <Float -1F>
	//   11   20:invokestatic    #414 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   12   23:fstore          6
		resources = ((Resources) (TypedArrayUtils.peekNamedValue(((TypedArray) (theme)), xmlpullparser, "value", 0)));
	//   13   25:aload_2         
	//   14   26:aload           5
	//   15   28:ldc2            #322 <String "value">
	//   16   31:iconst_0        
	//   17   32:invokestatic    #326 <Method TypedValue TypedArrayUtils.peekNamedValue(TypedArray, XmlPullParser, String, int)>
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
	//*  34   65:getfield        #253 <Field int TypedValue.type>
	//*  35   68:invokestatic    #257 <Method boolean isColorType(int)>
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
	//   55  130:ldc2            #322 <String "value">
	//   56  133:iconst_0        
	//   57  134:fconst_0        
	//   58  135:invokestatic    #414 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   59  138:invokestatic    #417 <Method Keyframe Keyframe.ofFloat(float, float)>
	//   60  141:astore_1        
		break; /* Loop/switch isn't completed */
	//   61  142:goto            185
_L4:
		resources = ((Resources) (Keyframe.ofInt(f, TypedArrayUtils.getNamedInt(((TypedArray) (theme)), xmlpullparser, "value", 0, 0))));
	//   62  145:fload           6
	//   63  147:aload_2         
	//   64  148:aload           5
	//   65  150:ldc2            #322 <String "value">
	//   66  153:iconst_0        
	//   67  154:iconst_0        
	//   68  155:invokestatic    #106 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   69  158:invokestatic    #420 <Method Keyframe Keyframe.ofInt(float, int)>
	//   70  161:astore_1        
		break; /* Loop/switch isn't completed */
	//   71  162:goto            185
_L2:
		if(j == 0)
	//*  72  165:iload           7
	//*  73  167:ifne            179
			resources = ((Resources) (Keyframe.ofFloat(f)));
	//   74  170:fload           6
	//   75  172:invokestatic    #189 <Method Keyframe Keyframe.ofFloat(float)>
	//   76  175:astore_1        
		else
	//*  77  176:goto            185
			resources = ((Resources) (Keyframe.ofInt(f)));
	//   78  179:fload           6
	//   79  181:invokestatic    #195 <Method Keyframe Keyframe.ofInt(float)>
	//   80  184:astore_1        
		i = TypedArrayUtils.getNamedResourceId(((TypedArray) (theme)), xmlpullparser, "interpolator", 1, 0);
	//   81  185:aload_2         
	//   82  186:aload           5
	//   83  188:ldc2            #392 <String "interpolator">
	//   84  191:iconst_1        
	//   85  192:iconst_0        
	//   86  193:invokestatic    #395 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, XmlPullParser, String, int, int)>
	//   87  196:istore          4
		if(i > 0)
	//*  88  198:iload           4
	//*  89  200:ifle            213
			((Keyframe) (resources)).setInterpolator(((android.animation.TimeInterpolator) (AnimationUtilsCompat.loadInterpolator(context, i))));
	//   90  203:aload_1         
	//   91  204:aload_0         
	//   92  205:iload           4
	//   93  207:invokestatic    #401 <Method android.view.animation.Interpolator AnimationUtilsCompat.loadInterpolator(Context, int)>
	//   94  210:invokevirtual   #421 <Method void Keyframe.setInterpolator(android.animation.TimeInterpolator)>
		((TypedArray) (theme)).recycle();
	//   95  213:aload_2         
	//   96  214:invokevirtual   #111 <Method void TypedArray.recycle()>
		return ((Keyframe) (resources));
	//   97  217:aload_1         
	//   98  218:areturn         
	}

	private static ObjectAnimator loadObjectAnimator(Context context, Resources resources, android.content.res.Resources.Theme theme, AttributeSet attributeset, float f, XmlPullParser xmlpullparser)
		throws android.content.res.Resources.NotFoundException
	{
		ObjectAnimator objectanimator = new ObjectAnimator();
	//    0    0:new             #423 <Class ObjectAnimator>
	//    1    3:dup             
	//    2    4:invokespecial   #424 <Method void ObjectAnimator()>
	//    3    7:astore          6
		loadAnimator(context, resources, theme, attributeset, ((ValueAnimator) (objectanimator)), f, xmlpullparser);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:aload           6
	//    9   15:fload           4
	//   10   17:aload           5
	//   11   19:invokestatic    #83  <Method ValueAnimator loadAnimator(Context, Resources, android.content.res.Resources$Theme, AttributeSet, ValueAnimator, float, XmlPullParser)>
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
	//    7   11:invokeinterface #61  <Method int XmlPullParser.next()>
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
	//*  16   31:invokeinterface #65  <Method String XmlPullParser.getName()>
	//*  17   36:ldc2            #428 <String "keyframe">
	//*  18   39:invokevirtual   #73  <Method boolean String.equals(Object)>
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
	//   28   58:invokestatic    #48  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   29   61:aload_3         
	//   30   62:invokestatic    #430 <Method int inferValueTypeOfKeyframe(Resources, android.content.res.Resources$Theme, AttributeSet, XmlPullParser)>
	//   31   65:istore          5
				Keyframe keyframe = loadKeyframe(context, resources, theme, Xml.asAttributeSet(xmlpullparser), i, xmlpullparser);
	//   32   67:aload_0         
	//   33   68:aload_1         
	//   34   69:aload_2         
	//   35   70:aload_3         
	//   36   71:invokestatic    #48  <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   37   74:iload           5
	//   38   76:aload_3         
	//   39   77:invokestatic    #432 <Method Keyframe loadKeyframe(Context, Resources, android.content.res.Resources$Theme, AttributeSet, int, XmlPullParser)>
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
	//   49  100:new             #125 <Class ArrayList>
	//   50  103:dup             
	//   51  104:invokespecial   #126 <Method void ArrayList()>
	//   52  107:astore          13
					arraylist1.add(((Object) (keyframe)));
	//   53  109:aload           13
	//   54  111:aload           15
	//   55  113:invokevirtual   #129 <Method boolean ArrayList.add(Object)>
	//   56  116:pop             
				}
				xmlpullparser.next();
	//   57  117:aload_3         
	//   58  118:invokeinterface #61  <Method int XmlPullParser.next()>
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
	//   70  145:invokevirtual   #149 <Method int ArrayList.size()>
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
	//   80  164:invokevirtual   #436 <Method Object ArrayList.get(int)>
	//   81  167:checkcast       #175 <Class Keyframe>
	//   82  170:astore_0        
				resources = ((Resources) ((Keyframe)arraylist.get(l - 1)));
	//   83  171:aload           12
	//   84  173:iload           9
	//   85  175:iconst_1        
	//   86  176:isub            
	//   87  177:invokevirtual   #436 <Method Object ArrayList.get(int)>
	//   88  180:checkcast       #175 <Class Keyframe>
	//   89  183:astore_1        
				float f = ((Keyframe) (resources)).getFraction();
	//   90  184:aload_1         
	//   91  185:invokevirtual   #204 <Method float Keyframe.getFraction()>
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
	//  105  210:invokevirtual   #208 <Method void Keyframe.setFraction(float)>
						i = l;
	//  106  213:iload           9
	//  107  215:istore          5
					} else
	//* 108  217:goto            241
					{
						arraylist.add(arraylist.size(), ((Object) (createNewKeyframe(((Keyframe) (resources)), 1.0F))));
	//  109  220:aload           12
	//  110  222:aload           12
	//  111  224:invokevirtual   #149 <Method int ArrayList.size()>
	//  112  227:aload_1         
	//  113  228:fconst_1        
	//  114  229:invokestatic    #438 <Method Keyframe createNewKeyframe(Keyframe, float)>
	//  115  232:invokevirtual   #441 <Method void ArrayList.add(int, Object)>
						i = l + 1;
	//  116  235:iload           9
	//  117  237:iconst_1        
	//  118  238:iadd            
	//  119  239:istore          5
					}
				f = ((Keyframe) (context)).getFraction();
	//  120  241:aload_0         
	//  121  242:invokevirtual   #204 <Method float Keyframe.getFraction()>
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
	//  135  267:invokevirtual   #208 <Method void Keyframe.setFraction(float)>
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
	//  143  282:invokestatic    #438 <Method Keyframe createNewKeyframe(Keyframe, float)>
	//  144  285:invokevirtual   #441 <Method void ArrayList.add(int, Object)>
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
	//  154  303:invokevirtual   #445 <Method Object[] ArrayList.toArray(Object[])>
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
	//  166  324:invokevirtual   #204 <Method float Keyframe.getFraction()>
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
	//  174  339:invokevirtual   #208 <Method void Keyframe.setFraction(float)>
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
	//  185  360:invokevirtual   #208 <Method void Keyframe.setFraction(float)>
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
	//* 199  387:invokevirtual   #204 <Method float Keyframe.getFraction()>
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
	//  217  418:invokevirtual   #204 <Method float Keyframe.getFraction()>
	//  218  421:aload_0         
	//  219  422:iload           5
	//  220  424:iconst_1        
	//  221  425:isub            
	//  222  426:aaload          
	//  223  427:invokevirtual   #204 <Method float Keyframe.getFraction()>
	//  224  430:fsub            
	//  225  431:iload           5
	//  226  433:iload           10
	//  227  435:invokestatic    #447 <Method void distributeKeyframes(Keyframe[], float, int, int)>
				}

	//  228  438:iload           5
	//  229  440:iconst_1        
	//  230  441:iadd            
	//  231  442:istore          5
	//* 232  444:goto            311
				resources = ((Resources) (PropertyValuesHolder.ofKeyframe(s, ((Keyframe []) (context)))));
	//  233  447:aload           4
	//  234  449:aload_0         
	//  235  450:invokestatic    #451 <Method PropertyValuesHolder PropertyValuesHolder.ofKeyframe(String, Keyframe[])>
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
	//  243  463:invokestatic    #290 <Method ArgbEvaluator ArgbEvaluator.getInstance()>
	//  244  466:invokevirtual   #314 <Method void PropertyValuesHolder.setEvaluator(TypeEvaluator)>
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
	//    5    7:invokeinterface #454 <Method int XmlPullParser.getEventType()>
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
	//   19   36:invokeinterface #61  <Method int XmlPullParser.next()>
	//   20   41:pop             
			} else
	//*  21   42:goto            6
			{
				if(xmlpullparser.getName().equals("propertyValuesHolder"))
	//*  22   45:aload_3         
	//*  23   46:invokeinterface #65  <Method String XmlPullParser.getName()>
	//*  24   51:ldc1            #113 <String "propertyValuesHolder">
	//*  25   53:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  26   56:ifeq            178
				{
					TypedArray typedarray = TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER);
	//   27   59:aload_1         
	//   28   60:aload_2         
	//   29   61:aload           4
	//   30   63:getstatic       #457 <Field int[] AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER>
	//   31   66:invokestatic    #100 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   32   69:astore          11
					String s = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "propertyName", 3);
	//   33   71:aload           11
	//   34   73:aload_3         
	//   35   74:ldc2            #459 <String "propertyName">
	//   36   77:iconst_3        
	//   37   78:invokestatic    #463 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   38   81:astore          12
					i = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "valueType", 2, 4);
	//   39   83:aload           11
	//   40   85:aload_3         
	//   41   86:ldc2            #465 <String "valueType">
	//   42   89:iconst_2        
	//   43   90:iconst_4        
	//   44   91:invokestatic    #106 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   45   94:istore          5
					Object obj = ((Object) (loadPvh(context, resources, theme, xmlpullparser, s, i)));
	//   46   96:aload_0         
	//   47   97:aload_1         
	//   48   98:aload_2         
	//   49   99:aload_3         
	//   50  100:aload           12
	//   51  102:iload           5
	//   52  104:invokestatic    #467 <Method PropertyValuesHolder loadPvh(Context, Resources, android.content.res.Resources$Theme, XmlPullParser, String, int)>
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
	//   63  126:invokestatic    #469 <Method PropertyValuesHolder getPVH(TypedArray, int, int, int, String)>
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
	//   73  149:new             #125 <Class ArrayList>
	//   74  152:dup             
	//   75  153:invokespecial   #126 <Method void ArrayList()>
	//   76  156:astore          8
						((ArrayList) (obj)).add(((Object) (propertyvaluesholder)));
	//   77  158:aload           8
	//   78  160:aload           9
	//   79  162:invokevirtual   #129 <Method boolean ArrayList.add(Object)>
	//   80  165:pop             
					}
					typedarray.recycle();
	//   81  166:aload           11
	//   82  168:invokevirtual   #111 <Method void TypedArray.recycle()>
					arraylist = ((ArrayList) (obj));
	//   83  171:aload           8
	//   84  173:astore          7
				}
	//*  85  175:goto            178
				xmlpullparser.next();
	//   86  178:aload_3         
	//   87  179:invokeinterface #61  <Method int XmlPullParser.next()>
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
	//   95  198:invokevirtual   #149 <Method int ArrayList.size()>
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
	//  109  225:invokevirtual   #436 <Method Object ArrayList.get(int)>
	//  110  228:checkcast       #274 <Class PropertyValuesHolder>
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
	//    2    3:ldc2            #471 <String "duration">
	//    3    6:iconst_1        
	//    4    7:sipush          300
	//    5   10:invokestatic    #106 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//    6   13:i2l             
	//    7   14:lstore          8
		long l1 = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "startOffset", 2, 0);
	//    8   16:aload_1         
	//    9   17:aload           4
	//   10   19:ldc2            #473 <String "startOffset">
	//   11   22:iconst_2        
	//   12   23:iconst_0        
	//   13   24:invokestatic    #106 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   14   27:i2l             
	//   15   28:lstore          10
		int j = TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "valueType", 7, 4);
	//   16   30:aload_1         
	//   17   31:aload           4
	//   18   33:ldc2            #465 <String "valueType">
	//   19   36:bipush          7
	//   20   38:iconst_4        
	//   21   39:invokestatic    #106 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   22   42:istore          6
		int k = j;
	//   23   44:iload           6
	//   24   46:istore          7
		if(TypedArrayUtils.hasAttribute(xmlpullparser, "valueFrom"))
	//*  25   48:aload           4
	//*  26   50:ldc2            #475 <String "valueFrom">
	//*  27   53:invokestatic    #479 <Method boolean TypedArrayUtils.hasAttribute(XmlPullParser, String)>
	//*  28   56:ifeq            133
		{
			k = j;
	//   29   59:iload           6
	//   30   61:istore          7
			if(TypedArrayUtils.hasAttribute(xmlpullparser, "valueTo"))
	//*  31   63:aload           4
	//*  32   65:ldc2            #481 <String "valueTo">
	//*  33   68:invokestatic    #479 <Method boolean TypedArrayUtils.hasAttribute(XmlPullParser, String)>
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
	//   43   88:invokestatic    #483 <Method int inferValueTypeFromValues(TypedArray, int, int)>
	//   44   91:istore          5
				PropertyValuesHolder propertyvaluesholder = getPVH(typedarray, i, 5, 6, "");
	//   45   93:aload_1         
	//   46   94:iload           5
	//   47   96:iconst_5        
	//   48   97:bipush          6
	//   49   99:ldc2            #485 <String "">
	//   50  102:invokestatic    #469 <Method PropertyValuesHolder getPVH(TypedArray, int, int, int, String)>
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
	//   63  126:invokevirtual   #123 <Method void ValueAnimator.setValues(PropertyValuesHolder[])>
					k = i;
	//   64  129:iload           5
	//   65  131:istore          7
				}
			}
		}
		valueanimator.setDuration(l);
	//   66  133:aload_0         
	//   67  134:lload           8
	//   68  136:invokevirtual   #489 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   69  139:pop             
		valueanimator.setStartDelay(l1);
	//   70  140:aload_0         
	//   71  141:lload           10
	//   72  143:invokevirtual   #493 <Method void ValueAnimator.setStartDelay(long)>
		valueanimator.setRepeatCount(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "repeatCount", 3, 0));
	//   73  146:aload_0         
	//   74  147:aload_1         
	//   75  148:aload           4
	//   76  150:ldc2            #495 <String "repeatCount">
	//   77  153:iconst_3        
	//   78  154:iconst_0        
	//   79  155:invokestatic    #106 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   80  158:invokevirtual   #499 <Method void ValueAnimator.setRepeatCount(int)>
		valueanimator.setRepeatMode(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "repeatMode", 4, 1));
	//   81  161:aload_0         
	//   82  162:aload_1         
	//   83  163:aload           4
	//   84  165:ldc2            #501 <String "repeatMode">
	//   85  168:iconst_4        
	//   86  169:iconst_1        
	//   87  170:invokestatic    #106 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   88  173:invokevirtual   #504 <Method void ValueAnimator.setRepeatMode(int)>
		if(typedarray1 != null)
	//*  89  176:aload_2         
	//*  90  177:ifnull          190
			setupObjectAnimator(valueanimator, typedarray1, k, f, xmlpullparser);
	//   91  180:aload_0         
	//   92  181:aload_2         
	//   93  182:iload           7
	//   94  184:fload_3         
	//   95  185:aload           4
	//   96  187:invokestatic    #508 <Method void setupObjectAnimator(ValueAnimator, TypedArray, int, float, XmlPullParser)>
	//   97  190:return          
	}

	private static void setupObjectAnimator(ValueAnimator valueanimator, TypedArray typedarray, int i, float f, XmlPullParser xmlpullparser)
	{
		valueanimator = ((ValueAnimator) ((ObjectAnimator)valueanimator));
	//    0    0:aload_0         
	//    1    1:checkcast       #423 <Class ObjectAnimator>
	//    2    4:astore_0        
		String s = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "pathData", 1);
	//    3    5:aload_1         
	//    4    6:aload           4
	//    5    8:ldc2            #510 <String "pathData">
	//    6   11:iconst_1        
	//    7   12:invokestatic    #463 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//    8   15:astore          5
		if(s != null)
	//*   9   17:aload           5
	//*  10   19:ifnull          120
		{
			String s1 = TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "propertyXName", 2);
	//   11   22:aload_1         
	//   12   23:aload           4
	//   13   25:ldc2            #512 <String "propertyXName">
	//   14   28:iconst_2        
	//   15   29:invokestatic    #463 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   16   32:astore          6
			xmlpullparser = ((XmlPullParser) (TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "propertyYName", 3)));
	//   17   34:aload_1         
	//   18   35:aload           4
	//   19   37:ldc2            #514 <String "propertyYName">
	//   20   40:iconst_3        
	//   21   41:invokestatic    #463 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   22   44:astore          4
			if(i == 2);
	//   23   46:iload_2         
	//   24   47:iconst_2        
	//   25   48:icmpeq          51
			if(s1 == null && xmlpullparser == null)
	//*  26   51:aload           6
	//*  27   53:ifnonnull       101
	//*  28   56:aload           4
	//*  29   58:ifnull          64
	//*  30   61:goto            101
			{
				valueanimator = ((ValueAnimator) (new StringBuilder()));
	//   31   64:new             #131 <Class StringBuilder>
	//   32   67:dup             
	//   33   68:invokespecial   #132 <Method void StringBuilder()>
	//   34   71:astore_0        
				((StringBuilder) (valueanimator)).append(typedarray.getPositionDescription());
	//   35   72:aload_0         
	//   36   73:aload_1         
	//   37   74:invokevirtual   #517 <Method String TypedArray.getPositionDescription()>
	//   38   77:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   39   80:pop             
				((StringBuilder) (valueanimator)).append(" propertyXName or propertyYName is needed for PathData");
	//   40   81:aload_0         
	//   41   82:ldc2            #519 <String " propertyXName or propertyYName is needed for PathData">
	//   42   85:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   43   88:pop             
				throw new InflateException(((StringBuilder) (valueanimator)).toString());
	//   44   89:new             #283 <Class InflateException>
	//   45   92:dup             
	//   46   93:aload_0         
	//   47   94:invokevirtual   #143 <Method String StringBuilder.toString()>
	//   48   97:invokespecial   #284 <Method void InflateException(String)>
	//   49  100:athrow          
			} else
			{
				setupPathMotion(PathParser.createPathFromPathData(s), ((ObjectAnimator) (valueanimator)), f * 0.5F, s1, ((String) (xmlpullparser)));
	//   50  101:aload           5
	//   51  103:invokestatic    #523 <Method Path PathParser.createPathFromPathData(String)>
	//   52  106:aload_0         
	//   53  107:fload_3         
	//   54  108:ldc2            #524 <Float 0.5F>
	//   55  111:fmul            
	//   56  112:aload           6
	//   57  114:aload           4
	//   58  116:invokestatic    #528 <Method void setupPathMotion(Path, ObjectAnimator, float, String, String)>
				return;
	//   59  119:return          
			}
		} else
		{
			((ObjectAnimator) (valueanimator)).setPropertyName(TypedArrayUtils.getNamedString(typedarray, xmlpullparser, "propertyName", 0));
	//   60  120:aload_0         
	//   61  121:aload_1         
	//   62  122:aload           4
	//   63  124:ldc2            #459 <String "propertyName">
	//   64  127:iconst_0        
	//   65  128:invokestatic    #463 <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   66  131:invokevirtual   #531 <Method void ObjectAnimator.setPropertyName(String)>
			return;
	//   67  134:return          
		}
	}

	private static void setupPathMotion(Path path, ObjectAnimator objectanimator, float f, String s, String s1)
	{
		PathMeasure pathmeasure = new PathMeasure(path, false);
	//    0    0:new             #533 <Class PathMeasure>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #536 <Method void PathMeasure(Path, boolean)>
	//    5    9:astore          12
		ArrayList arraylist = new ArrayList();
	//    6   11:new             #125 <Class ArrayList>
	//    7   14:dup             
	//    8   15:invokespecial   #126 <Method void ArrayList()>
	//    9   18:astore          14
		arraylist.add(((Object) (Float.valueOf(0.0F))));
	//   10   20:aload           14
	//   11   22:fconst_0        
	//   12   23:invokestatic    #229 <Method Float Float.valueOf(float)>
	//   13   26:invokevirtual   #129 <Method boolean ArrayList.add(Object)>
	//   14   29:pop             
		float f1 = 0.0F;
	//   15   30:fconst_0        
	//   16   31:fstore          5
		float f2;
		do
		{
			f2 = f1 + pathmeasure.getLength();
	//   17   33:fload           5
	//   18   35:aload           12
	//   19   37:invokevirtual   #539 <Method float PathMeasure.getLength()>
	//   20   40:fadd            
	//   21   41:fstore          6
			arraylist.add(((Object) (Float.valueOf(f2))));
	//   22   43:aload           14
	//   23   45:fload           6
	//   24   47:invokestatic    #229 <Method Float Float.valueOf(float)>
	//   25   50:invokevirtual   #129 <Method boolean ArrayList.add(Object)>
	//   26   53:pop             
			f1 = f2;
	//   27   54:fload           6
	//   28   56:fstore          5
		} while(pathmeasure.nextContour());
	//   29   58:aload           12
	//   30   60:invokevirtual   #542 <Method boolean PathMeasure.nextContour()>
	//   31   63:ifne            33
		path = ((Path) (new PathMeasure(path, false)));
	//   32   66:new             #533 <Class PathMeasure>
	//   33   69:dup             
	//   34   70:aload_0         
	//   35   71:iconst_0        
	//   36   72:invokespecial   #536 <Method void PathMeasure(Path, boolean)>
	//   37   75:astore_0        
		int i1 = Math.min(100, (int)(f2 / f) + 1);
	//   38   76:bipush          100
	//   39   78:fload           6
	//   40   80:fload_2         
	//   41   81:fdiv            
	//   42   82:f2i             
	//   43   83:iconst_1        
	//   44   84:iadd            
	//   45   85:invokestatic    #547 <Method int Math.min(int, int)>
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
		f1 = f2 / (float)(i1 - 1);
	//   56  107:fload           6
	//   57  109:iload           11
	//   58  111:iconst_1        
	//   59  112:isub            
	//   60  113:i2f             
	//   61  114:fdiv            
	//   62  115:fstore          5
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
	//   73  133:icmpge          246
			((PathMeasure) (path)).getPosTan(f - ((Float)arraylist.get(j)).floatValue(), af2, ((float []) (null)));
	//   74  136:aload_0         
	//   75  137:fload_2         
	//   76  138:aload           14
	//   77  140:iload           8
	//   78  142:invokevirtual   #436 <Method Object ArrayList.get(int)>
	//   79  145:checkcast       #181 <Class Float>
	//   80  148:invokevirtual   #550 <Method float Float.floatValue()>
	//   81  151:fsub            
	//   82  152:aload           16
	//   83  154:aconst_null     
	//   84  155:invokevirtual   #554 <Method boolean PathMeasure.getPosTan(float, float[], float[])>
	//   85  158:pop             
			af1[i] = af2[0];
	//   86  159:aload           15
	//   87  161:iload           7
	//   88  163:aload           16
	//   89  165:iconst_0        
	//   90  166:faload          
	//   91  167:fastore         
			af[i] = af2[1];
	//   92  168:aload           13
	//   93  170:iload           7
	//   94  172:aload           16
	//   95  174:iconst_1        
	//   96  175:faload          
	//   97  176:fastore         
			f += f1;
	//   98  177:fload_2         
	//   99  178:fload           5
	//  100  180:fadd            
	//  101  181:fstore_2        
			int l = j + 1;
	//  102  182:iload           8
	//  103  184:iconst_1        
	//  104  185:iadd            
	//  105  186:istore          10
			int k = j;
	//  106  188:iload           8
	//  107  190:istore          9
			if(l < arraylist.size())
	//* 108  192:iload           10
	//* 109  194:aload           14
	//* 110  196:invokevirtual   #149 <Method int ArrayList.size()>
	//* 111  199:icmpge          233
			{
				k = j;
	//  112  202:iload           8
	//  113  204:istore          9
				if(f > ((Float)arraylist.get(l)).floatValue())
	//* 114  206:fload_2         
	//* 115  207:aload           14
	//* 116  209:iload           10
	//* 117  211:invokevirtual   #436 <Method Object ArrayList.get(int)>
	//* 118  214:checkcast       #181 <Class Float>
	//* 119  217:invokevirtual   #550 <Method float Float.floatValue()>
	//* 120  220:fcmpl           
	//* 121  221:ifle            233
				{
					((PathMeasure) (path)).nextContour();
	//  122  224:aload_0         
	//  123  225:invokevirtual   #542 <Method boolean PathMeasure.nextContour()>
	//  124  228:pop             
					k = l;
	//  125  229:iload           10
	//  126  231:istore          9
				}
			}
			i++;
	//  127  233:iload           7
	//  128  235:iconst_1        
	//  129  236:iadd            
	//  130  237:istore          7
			j = k;
	//  131  239:iload           9
	//  132  241:istore          8
		} while(true);
	//  133  243:goto            126
		if(s != null)
	//* 134  246:aload_3         
	//* 135  247:ifnull          260
			path = ((Path) (PropertyValuesHolder.ofFloat(s, af1)));
	//  136  250:aload_3         
	//  137  251:aload           15
	//  138  253:invokestatic    #300 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  139  256:astore_0        
		else
	//* 140  257:goto            262
			path = null;
	//  141  260:aconst_null     
	//  142  261:astore_0        
		s = ((String) (pathmeasure));
	//  143  262:aload           12
	//  144  264:astore_3        
		if(s1 != null)
	//* 145  265:aload           4
	//* 146  267:ifnull          278
			s = ((String) (PropertyValuesHolder.ofFloat(s1, af)));
	//  147  270:aload           4
	//  148  272:aload           13
	//  149  274:invokestatic    #300 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
	//  150  277:astore_3        
		if(path == null)
	//* 151  278:aload_0         
	//* 152  279:ifnonnull       295
		{
			objectanimator.setValues(new PropertyValuesHolder[] {
				s
			});
	//  153  282:aload_1         
	//  154  283:iconst_1        
	//  155  284:anewarray       PropertyValuesHolder[]
	//  156  287:dup             
	//  157  288:iconst_0        
	//  158  289:aload_3         
	//  159  290:aastore         
	//  160  291:invokevirtual   #555 <Method void ObjectAnimator.setValues(PropertyValuesHolder[])>
			return;
	//  161  294:return          
		}
		if(s == null)
	//* 162  295:aload_3         
	//* 163  296:ifnonnull       312
		{
			objectanimator.setValues(new PropertyValuesHolder[] {
				path
			});
	//  164  299:aload_1         
	//  165  300:iconst_1        
	//  166  301:anewarray       PropertyValuesHolder[]
	//  167  304:dup             
	//  168  305:iconst_0        
	//  169  306:aload_0         
	//  170  307:aastore         
	//  171  308:invokevirtual   #555 <Method void ObjectAnimator.setValues(PropertyValuesHolder[])>
			return;
	//  172  311:return          
		} else
		{
			objectanimator.setValues(new PropertyValuesHolder[] {
				path, s
			});
	//  173  312:aload_1         
	//  174  313:iconst_2        
	//  175  314:anewarray       PropertyValuesHolder[]
	//  176  317:dup             
	//  177  318:iconst_0        
	//  178  319:aload_0         
	//  179  320:aastore         
	//  180  321:dup             
	//  181  322:iconst_1        
	//  182  323:aload_3         
	//  183  324:aastore         
	//  184  325:invokevirtual   #555 <Method void ObjectAnimator.setValues(PropertyValuesHolder[])>
			return;
	//  185  328:return          
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
