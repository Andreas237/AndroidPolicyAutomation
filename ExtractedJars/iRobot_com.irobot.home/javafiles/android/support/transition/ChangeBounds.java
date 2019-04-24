// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a.c;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Transition, z, ac, ah, 
//			au, PathMotion, p, ag, 
//			an, at, u, ad

public class ChangeBounds extends Transition
{
	private static class a
	{

		private void a()
		{
			au.a(e, a, b, c, d);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field View e>
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field int a>
		//    4    8:aload_0         
		//    5    9:getfield        #27  <Field int b>
		//    6   12:aload_0         
		//    7   13:getfield        #29  <Field int c>
		//    8   16:aload_0         
		//    9   17:getfield        #31  <Field int d>
		//   10   20:invokestatic    #36  <Method void au.a(View, int, int, int, int)>
			f = 0;
		//   11   23:aload_0         
		//   12   24:iconst_0        
		//   13   25:putfield        #38  <Field int f>
			g = 0;
		//   14   28:aload_0         
		//   15   29:iconst_0        
		//   16   30:putfield        #40  <Field int g>
		//   17   33:return          
		}

		void a(PointF pointf)
		{
			a = Math.round(pointf.x);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #47  <Field float PointF.x>
		//    3    5:invokestatic    #53  <Method int Math.round(float)>
		//    4    8:putfield        #25  <Field int a>
			b = Math.round(pointf.y);
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:getfield        #56  <Field float PointF.y>
		//    8   16:invokestatic    #53  <Method int Math.round(float)>
		//    9   19:putfield        #27  <Field int b>
			f = f + 1;
		//   10   22:aload_0         
		//   11   23:aload_0         
		//   12   24:getfield        #38  <Field int f>
		//   13   27:iconst_1        
		//   14   28:iadd            
		//   15   29:putfield        #38  <Field int f>
			if(f == g)
		//*  16   32:aload_0         
		//*  17   33:getfield        #38  <Field int f>
		//*  18   36:aload_0         
		//*  19   37:getfield        #40  <Field int g>
		//*  20   40:icmpne          47
				a();
		//   21   43:aload_0         
		//   22   44:invokespecial   #58  <Method void a()>
		//   23   47:return          
		}

		void b(PointF pointf)
		{
			c = Math.round(pointf.x);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #47  <Field float PointF.x>
		//    3    5:invokestatic    #53  <Method int Math.round(float)>
		//    4    8:putfield        #29  <Field int c>
			d = Math.round(pointf.y);
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:getfield        #56  <Field float PointF.y>
		//    8   16:invokestatic    #53  <Method int Math.round(float)>
		//    9   19:putfield        #31  <Field int d>
			g = g + 1;
		//   10   22:aload_0         
		//   11   23:aload_0         
		//   12   24:getfield        #40  <Field int g>
		//   13   27:iconst_1        
		//   14   28:iadd            
		//   15   29:putfield        #40  <Field int g>
			if(f == g)
		//*  16   32:aload_0         
		//*  17   33:getfield        #38  <Field int f>
		//*  18   36:aload_0         
		//*  19   37:getfield        #40  <Field int g>
		//*  20   40:icmpne          47
				a();
		//   21   43:aload_0         
		//   22   44:invokespecial   #58  <Method void a()>
		//   23   47:return          
		}

		private int a;
		private int b;
		private int c;
		private int d;
		private View e;
		private int f;
		private int g;

		a(View view)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			e = view;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field View e>
		//    5    9:return          
		}
	}


	public ChangeBounds()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void Transition()>
		n = new int[2];
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:putfield        #103 <Field int[] n>
		o = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #105 <Field boolean o>
		p = false;
	//    9   16:aload_0         
	//   10   17:iconst_0        
	//   11   18:putfield        #107 <Field boolean p>
	//   12   21:return          
	}

	public ChangeBounds(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #110 <Method void Transition(Context, AttributeSet)>
		n = new int[2];
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:newarray        int[]
	//    7   10:putfield        #103 <Field int[] n>
		o = false;
	//    8   13:aload_0         
	//    9   14:iconst_0        
	//   10   15:putfield        #105 <Field boolean o>
		p = false;
	//   11   18:aload_0         
	//   12   19:iconst_0        
	//   13   20:putfield        #107 <Field boolean p>
		context = ((Context) (context.obtainStyledAttributes(attributeset, ac.d)));
	//   14   23:aload_1         
	//   15   24:aload_2         
	//   16   25:getstatic       #115 <Field int[] ac.d>
	//   17   28:invokevirtual   #121 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   18   31:astore_1        
		boolean flag = c.a(((TypedArray) (context)), ((org.xmlpull.v1.XmlPullParser) ((XmlResourceParser)attributeset)), "resizeClip", 0, false);
	//   19   32:aload_1         
	//   20   33:aload_2         
	//   21   34:checkcast       #123 <Class XmlResourceParser>
	//   22   37:ldc1            #125 <String "resizeClip">
	//   23   39:iconst_0        
	//   24   40:iconst_0        
	//   25   41:invokestatic    #130 <Method boolean c.a(TypedArray, org.xmlpull.v1.XmlPullParser, String, int, boolean)>
	//   26   44:istore_3        
		((TypedArray) (context)).recycle();
	//   27   45:aload_1         
	//   28   46:invokevirtual   #135 <Method void TypedArray.recycle()>
		a(flag);
	//   29   49:aload_0         
	//   30   50:iload_3         
	//   31   51:invokevirtual   #138 <Method void a(boolean)>
	//   32   54:return          
	}

	private boolean a(View view, View view1)
	{
		if(!p) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field boolean p>
	//    2    4:ifeq            35
_L1:
		ah ah1 = b(view, true);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #143 <Method ah b(View, boolean)>
	//    7   13:astore_3        
		if(ah1 != null) goto _L4; else goto _L3
	//    8   14:aload_3         
	//    9   15:ifnonnull       27
_L3:
		if(view == view1)
	//*  10   18:aload_1         
	//*  11   19:aload_2         
	//*  12   20:if_acmpne       25
			return true;
	//   13   23:iconst_1        
	//   14   24:ireturn         
_L5:
		return false;
	//   15   25:iconst_0        
	//   16   26:ireturn         
_L4:
		if(view1 != ah1.b) goto _L5; else goto _L2
	//   17   27:aload_2         
	//   18   28:aload_3         
	//   19   29:getfield        #148 <Field View ah.b>
	//   20   32:if_acmpne       25
_L2:
		return true;
	//   21   35:iconst_1        
	//   22   36:ireturn         
	}

	private void d(ah ah1)
	{
		View view = ah1.b;
	//    0    0:aload_1         
	//    1    1:getfield        #148 <Field View ah.b>
	//    2    4:astore_2        
		if(s.x(view) || view.getWidth() != 0 || view.getHeight() != 0)
	//*   3    5:aload_2         
	//*   4    6:invokestatic    #155 <Method boolean s.x(View)>
	//*   5    9:ifne            26
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #161 <Method int View.getWidth()>
	//*   8   16:ifne            26
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #164 <Method int View.getHeight()>
	//*  11   23:ifeq            163
		{
			ah1.a.put("android:changeBounds:bounds", ((Object) (new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))));
	//   12   26:aload_1         
	//   13   27:getfield        #167 <Field Map ah.a>
	//   14   30:ldc1            #52  <String "android:changeBounds:bounds">
	//   15   32:new             #169 <Class Rect>
	//   16   35:dup             
	//   17   36:aload_2         
	//   18   37:invokevirtual   #172 <Method int View.getLeft()>
	//   19   40:aload_2         
	//   20   41:invokevirtual   #175 <Method int View.getTop()>
	//   21   44:aload_2         
	//   22   45:invokevirtual   #178 <Method int View.getRight()>
	//   23   48:aload_2         
	//   24   49:invokevirtual   #181 <Method int View.getBottom()>
	//   25   52:invokespecial   #184 <Method void Rect(int, int, int, int)>
	//   26   55:invokeinterface #190 <Method Object Map.put(Object, Object)>
	//   27   60:pop             
			ah1.a.put("android:changeBounds:parent", ((Object) (ah1.b.getParent())));
	//   28   61:aload_1         
	//   29   62:getfield        #167 <Field Map ah.a>
	//   30   65:ldc1            #56  <String "android:changeBounds:parent">
	//   31   67:aload_1         
	//   32   68:getfield        #148 <Field View ah.b>
	//   33   71:invokevirtual   #194 <Method android.view.ViewParent View.getParent()>
	//   34   74:invokeinterface #190 <Method Object Map.put(Object, Object)>
	//   35   79:pop             
			if(p)
	//*  36   80:aload_0         
	//*  37   81:getfield        #107 <Field boolean p>
	//*  38   84:ifeq            140
			{
				ah1.b.getLocationInWindow(n);
	//   39   87:aload_1         
	//   40   88:getfield        #148 <Field View ah.b>
	//   41   91:aload_0         
	//   42   92:getfield        #103 <Field int[] n>
	//   43   95:invokevirtual   #198 <Method void View.getLocationInWindow(int[])>
				ah1.a.put("android:changeBounds:windowX", ((Object) (Integer.valueOf(n[0]))));
	//   44   98:aload_1         
	//   45   99:getfield        #167 <Field Map ah.a>
	//   46  102:ldc1            #58  <String "android:changeBounds:windowX">
	//   47  104:aload_0         
	//   48  105:getfield        #103 <Field int[] n>
	//   49  108:iconst_0        
	//   50  109:iaload          
	//   51  110:invokestatic    #204 <Method Integer Integer.valueOf(int)>
	//   52  113:invokeinterface #190 <Method Object Map.put(Object, Object)>
	//   53  118:pop             
				ah1.a.put("android:changeBounds:windowY", ((Object) (Integer.valueOf(n[1]))));
	//   54  119:aload_1         
	//   55  120:getfield        #167 <Field Map ah.a>
	//   56  123:ldc1            #60  <String "android:changeBounds:windowY">
	//   57  125:aload_0         
	//   58  126:getfield        #103 <Field int[] n>
	//   59  129:iconst_1        
	//   60  130:iaload          
	//   61  131:invokestatic    #204 <Method Integer Integer.valueOf(int)>
	//   62  134:invokeinterface #190 <Method Object Map.put(Object, Object)>
	//   63  139:pop             
			}
			if(o)
	//*  64  140:aload_0         
	//*  65  141:getfield        #105 <Field boolean o>
	//*  66  144:ifeq            163
				ah1.a.put("android:changeBounds:clip", ((Object) (s.z(view))));
	//   67  147:aload_1         
	//   68  148:getfield        #167 <Field Map ah.a>
	//   69  151:ldc1            #54  <String "android:changeBounds:clip">
	//   70  153:aload_2         
	//   71  154:invokestatic    #208 <Method Rect s.z(View)>
	//   72  157:invokeinterface #190 <Method Object Map.put(Object, Object)>
	//   73  162:pop             
		}
	//   74  163:return          
	}

	public Animator a(ViewGroup viewgroup, ah ah1, ah ah2)
	{
label0:
		{
label1:
			{
				int j1;
				int i2;
				int k2;
				int i3;
				Object obj;
label2:
				{
label3:
					{
label4:
						{
							int i1;
							int j2;
							int l2;
							int j3;
							int k3;
							int l3;
							int i4;
							int j4;
							int k4;
							int l4;
							int i5;
							int j5;
							int k5;
							Object obj1;
label5:
							{
								if(ah1 == null || ah2 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          1095
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       11
									break label0;
	//    4    8:goto            1095
								obj1 = ((Object) (ah1.a));
	//    5   11:aload_2         
	//    6   12:getfield        #167 <Field Map ah.a>
	//    7   15:astore          20
								obj = ((Object) (ah2.a));
	//    8   17:aload_3         
	//    9   18:getfield        #167 <Field Map ah.a>
	//   10   21:astore          19
								obj1 = ((Object) ((ViewGroup)((Map) (obj1)).get("android:changeBounds:parent")));
	//   11   23:aload           20
	//   12   25:ldc1            #56  <String "android:changeBounds:parent">
	//   13   27:invokeinterface #213 <Method Object Map.get(Object)>
	//   14   32:checkcast       #215 <Class ViewGroup>
	//   15   35:astore          20
								ViewGroup viewgroup1 = (ViewGroup)((Map) (obj)).get("android:changeBounds:parent");
	//   16   37:aload           19
	//   17   39:ldc1            #56  <String "android:changeBounds:parent">
	//   18   41:invokeinterface #213 <Method Object Map.get(Object)>
	//   19   46:checkcast       #215 <Class ViewGroup>
	//   20   49:astore          21
								if(obj1 == null || viewgroup1 == null)
	//*  21   51:aload           20
	//*  22   53:ifnull          1093
	//*  23   56:aload           21
	//*  24   58:ifnonnull       64
									break label1;
	//   25   61:goto            1093
								obj = ((Object) (ah2.b));
	//   26   64:aload_3         
	//   27   65:getfield        #148 <Field View ah.b>
	//   28   68:astore          19
								if(!a(((View) (obj1)), ((View) (viewgroup1))))
									break label4;
	//   29   70:aload_0         
	//   30   71:aload           20
	//   31   73:aload           21
	//   32   75:invokespecial   #217 <Method boolean a(View, View)>
	//   33   78:ifeq            841
								viewgroup = ((ViewGroup) ((Rect)ah1.a.get("android:changeBounds:bounds")));
	//   34   81:aload_2         
	//   35   82:getfield        #167 <Field Map ah.a>
	//   36   85:ldc1            #52  <String "android:changeBounds:bounds">
	//   37   87:invokeinterface #213 <Method Object Map.get(Object)>
	//   38   92:checkcast       #169 <Class Rect>
	//   39   95:astore_1        
								obj1 = ((Object) ((Rect)ah2.a.get("android:changeBounds:bounds")));
	//   40   96:aload_3         
	//   41   97:getfield        #167 <Field Map ah.a>
	//   42  100:ldc1            #52  <String "android:changeBounds:bounds">
	//   43  102:invokeinterface #213 <Method Object Map.get(Object)>
	//   44  107:checkcast       #169 <Class Rect>
	//   45  110:astore          20
								j2 = ((Rect) (viewgroup)).left;
	//   46  112:aload_1         
	//   47  113:getfield        #221 <Field int Rect.left>
	//   48  116:istore          7
								l2 = ((Rect) (obj1)).left;
	//   49  118:aload           20
	//   50  120:getfield        #221 <Field int Rect.left>
	//   51  123:istore          8
								j3 = ((Rect) (viewgroup)).top;
	//   52  125:aload_1         
	//   53  126:getfield        #224 <Field int Rect.top>
	//   54  129:istore          9
								k3 = ((Rect) (obj1)).top;
	//   55  131:aload           20
	//   56  133:getfield        #224 <Field int Rect.top>
	//   57  136:istore          10
								l3 = ((Rect) (viewgroup)).right;
	//   58  138:aload_1         
	//   59  139:getfield        #227 <Field int Rect.right>
	//   60  142:istore          11
								i4 = ((Rect) (obj1)).right;
	//   61  144:aload           20
	//   62  146:getfield        #227 <Field int Rect.right>
	//   63  149:istore          12
								j4 = ((Rect) (viewgroup)).bottom;
	//   64  151:aload_1         
	//   65  152:getfield        #230 <Field int Rect.bottom>
	//   66  155:istore          13
								k4 = ((Rect) (obj1)).bottom;
	//   67  157:aload           20
	//   68  159:getfield        #230 <Field int Rect.bottom>
	//   69  162:istore          14
								l4 = l3 - j2;
	//   70  164:iload           11
	//   71  166:iload           7
	//   72  168:isub            
	//   73  169:istore          15
								i5 = j4 - j3;
	//   74  171:iload           13
	//   75  173:iload           9
	//   76  175:isub            
	//   77  176:istore          16
								j5 = i4 - l2;
	//   78  178:iload           12
	//   79  180:iload           8
	//   80  182:isub            
	//   81  183:istore          17
								k5 = k4 - k3;
	//   82  185:iload           14
	//   83  187:iload           10
	//   84  189:isub            
	//   85  190:istore          18
								ah1 = ((ah) ((Rect)ah1.a.get("android:changeBounds:clip")));
	//   86  192:aload_2         
	//   87  193:getfield        #167 <Field Map ah.a>
	//   88  196:ldc1            #54  <String "android:changeBounds:clip">
	//   89  198:invokeinterface #213 <Method Object Map.get(Object)>
	//   90  203:checkcast       #169 <Class Rect>
	//   91  206:astore_2        
								obj1 = ((Object) ((Rect)ah2.a.get("android:changeBounds:clip")));
	//   92  207:aload_3         
	//   93  208:getfield        #167 <Field Map ah.a>
	//   94  211:ldc1            #54  <String "android:changeBounds:clip">
	//   95  213:invokeinterface #213 <Method Object Map.get(Object)>
	//   96  218:checkcast       #169 <Class Rect>
	//   97  221:astore          20
								if(l4 != 0 && i5 != 0 || j5 != 0 && k5 != 0)
	//*  98  223:iload           15
	//*  99  225:ifeq            233
	//* 100  228:iload           16
	//* 101  230:ifne            243
	//* 102  233:iload           17
	//* 103  235:ifeq            296
	//* 104  238:iload           18
	//* 105  240:ifeq            296
								{
									int k1;
									if(j2 == l2 && j3 == k3)
	//* 106  243:iload           7
	//* 107  245:iload           8
	//* 108  247:icmpne          266
	//* 109  250:iload           9
	//* 110  252:iload           10
	//* 111  254:icmpeq          260
	//* 112  257:goto            266
										k1 = 0;
	//  113  260:iconst_0        
	//  114  261:istore          6
									else
	//* 115  263:goto            269
										k1 = 1;
	//  116  266:iconst_1        
	//  117  267:istore          6
									if(l3 == i4)
	//* 118  269:iload           11
	//* 119  271:iload           12
	//* 120  273:icmpne          287
									{
										i1 = k1;
	//  121  276:iload           6
	//  122  278:istore          5
										if(j4 == k4)
											break label5;
	//  123  280:iload           13
	//  124  282:iload           14
	//  125  284:icmpeq          299
									}
									i1 = k1 + 1;
	//  126  287:iload           6
	//  127  289:iconst_1        
	//  128  290:iadd            
	//  129  291:istore          5
								} else
	//* 130  293:goto            299
								{
									i1 = 0;
	//  131  296:iconst_0        
	//  132  297:istore          5
								}
							}
							int l1;
label6:
							{
								if(ah1 == null || ((Rect) (ah1)).equals(obj1))
	//* 133  299:aload_2         
	//* 134  300:ifnull          312
	//* 135  303:aload_2         
	//* 136  304:aload           20
	//* 137  306:invokevirtual   #234 <Method boolean Rect.equals(Object)>
	//* 138  309:ifeq            329
								{
									l1 = i1;
	//  139  312:iload           5
	//  140  314:istore          6
									if(ah1 != null)
										break label6;
	//  141  316:aload_2         
	//  142  317:ifnonnull       335
									l1 = i1;
	//  143  320:iload           5
	//  144  322:istore          6
									if(obj1 == null)
										break label6;
	//  145  324:aload           20
	//  146  326:ifnull          335
								}
								l1 = i1 + 1;
	//  147  329:iload           5
	//  148  331:iconst_1        
	//  149  332:iadd            
	//  150  333:istore          6
							}
label7:
							{
								if(l1 <= 0)
									break label3;
	//  151  335:iload           6
	//  152  337:ifle            934
								if(!o)
	//* 153  340:aload_0         
	//* 154  341:getfield        #105 <Field boolean o>
	//* 155  344:ifne            596
								{
									ah2 = ((ah) (obj));
	//  156  347:aload           19
	//  157  349:astore_3        
									au.a(((View) (ah2)), j2, j3, l3, j4);
	//  158  350:aload_3         
	//  159  351:iload           7
	//  160  353:iload           9
	//  161  355:iload           11
	//  162  357:iload           13
	//  163  359:invokestatic    #239 <Method void au.a(View, int, int, int, int)>
									if(l1 == 2)
	//* 164  362:iload           6
	//* 165  364:iconst_2        
	//* 166  365:icmpne          518
									{
										if(l4 == j5 && i5 == k5)
	//* 167  368:iload           15
	//* 168  370:iload           17
	//* 169  372:icmpne          409
	//* 170  375:iload           16
	//* 171  377:iload           18
	//* 172  379:icmpne          409
										{
											viewgroup = ((ViewGroup) (h().a(j2, j3, l2, k3)));
	//  173  382:aload_0         
	//  174  383:invokevirtual   #242 <Method PathMotion h()>
	//  175  386:iload           7
	//  176  388:i2f             
	//  177  389:iload           9
	//  178  391:i2f             
	//  179  392:iload           8
	//  180  394:i2f             
	//  181  395:iload           10
	//  182  397:i2f             
	//  183  398:invokevirtual   #247 <Method android.graphics.Path PathMotion.a(float, float, float, float)>
	//  184  401:astore_1        
											ah1 = ((ah) (m));
	//  185  402:getstatic       #93  <Field Property m>
	//  186  405:astore_2        
										} else
	//* 187  406:goto            586
										{
											ah1 = ((ah) (new a(((View) (ah2)))));
	//  188  409:new             #26  <Class ChangeBounds$a>
	//  189  412:dup             
	//  190  413:aload_3         
	//  191  414:invokespecial   #250 <Method void ChangeBounds$a(View)>
	//  192  417:astore_2        
											viewgroup = ((ViewGroup) (h().a(j2, j3, l2, k3)));
	//  193  418:aload_0         
	//  194  419:invokevirtual   #242 <Method PathMotion h()>
	//  195  422:iload           7
	//  196  424:i2f             
	//  197  425:iload           9
	//  198  427:i2f             
	//  199  428:iload           8
	//  200  430:i2f             
	//  201  431:iload           10
	//  202  433:i2f             
	//  203  434:invokevirtual   #247 <Method android.graphics.Path PathMotion.a(float, float, float, float)>
	//  204  437:astore_1        
											ah2 = ((ah) (android.support.transition.p.a(((Object) (ah1)), i, ((android.graphics.Path) (viewgroup)))));
	//  205  438:aload_2         
	//  206  439:getstatic       #77  <Field Property i>
	//  207  442:aload_1         
	//  208  443:invokestatic    #255 <Method ObjectAnimator p.a(Object, Property, android.graphics.Path)>
	//  209  446:astore_3        
											viewgroup = ((ViewGroup) (h().a(l3, j4, i4, k4)));
	//  210  447:aload_0         
	//  211  448:invokevirtual   #242 <Method PathMotion h()>
	//  212  451:iload           11
	//  213  453:i2f             
	//  214  454:iload           13
	//  215  456:i2f             
	//  216  457:iload           12
	//  217  459:i2f             
	//  218  460:iload           14
	//  219  462:i2f             
	//  220  463:invokevirtual   #247 <Method android.graphics.Path PathMotion.a(float, float, float, float)>
	//  221  466:astore_1        
											obj1 = ((Object) (android.support.transition.p.a(((Object) (ah1)), j, ((android.graphics.Path) (viewgroup)))));
	//  222  467:aload_2         
	//  223  468:getstatic       #82  <Field Property j>
	//  224  471:aload_1         
	//  225  472:invokestatic    #255 <Method ObjectAnimator p.a(Object, Property, android.graphics.Path)>
	//  226  475:astore          20
											viewgroup = ((ViewGroup) (new AnimatorSet()));
	//  227  477:new             #257 <Class AnimatorSet>
	//  228  480:dup             
	//  229  481:invokespecial   #258 <Method void AnimatorSet()>
	//  230  484:astore_1        
											((AnimatorSet) (viewgroup)).playTogether(new Animator[] {
												ah2, obj1
											});
	//  231  485:aload_1         
	//  232  486:iconst_2        
	//  233  487:anewarray       Animator[]
	//  234  490:dup             
	//  235  491:iconst_0        
	//  236  492:aload_3         
	//  237  493:aastore         
	//  238  494:dup             
	//  239  495:iconst_1        
	//  240  496:aload           20
	//  241  498:aastore         
	//  242  499:invokevirtual   #264 <Method void AnimatorSet.playTogether(Animator[])>
											((AnimatorSet) (viewgroup)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(((a) (ah1))) {

												final a a;
												final ChangeBounds b;
												private a c;

			
			{
				b = ChangeBounds.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ChangeBounds b>
				a = a1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field ChangeBounds$a a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
				c = a;
			//    8   14:aload_0         
			//    9   15:aload_0         
			//   10   16:getfield        #19  <Field ChangeBounds$a a>
			//   11   19:putfield        #24  <Field ChangeBounds$a c>
			//   12   22:return          
			}
											}
)));
	//  243  502:aload_1         
	//  244  503:new             #22  <Class ChangeBounds$8>
	//  245  506:dup             
	//  246  507:aload_0         
	//  247  508:aload_2         
	//  248  509:invokespecial   #267 <Method void ChangeBounds$8(ChangeBounds, ChangeBounds$a)>
	//  249  512:invokevirtual   #271 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
											break label7;
	//  250  515:goto            800
										}
									} else
									if(j2 == l2 && j3 == k3)
	//* 251  518:iload           7
	//* 252  520:iload           8
	//* 253  522:icmpne          562
	//* 254  525:iload           9
	//* 255  527:iload           10
	//* 256  529:icmpeq          535
	//* 257  532:goto            562
									{
										viewgroup = ((ViewGroup) (h().a(l3, j4, i4, k4)));
	//  258  535:aload_0         
	//  259  536:invokevirtual   #242 <Method PathMotion h()>
	//  260  539:iload           11
	//  261  541:i2f             
	//  262  542:iload           13
	//  263  544:i2f             
	//  264  545:iload           12
	//  265  547:i2f             
	//  266  548:iload           14
	//  267  550:i2f             
	//  268  551:invokevirtual   #247 <Method android.graphics.Path PathMotion.a(float, float, float, float)>
	//  269  554:astore_1        
										ah1 = ((ah) (k));
	//  270  555:getstatic       #85  <Field Property k>
	//  271  558:astore_2        
									} else
	//* 272  559:goto            586
									{
										viewgroup = ((ViewGroup) (h().a(j2, j3, l2, k3)));
	//  273  562:aload_0         
	//  274  563:invokevirtual   #242 <Method PathMotion h()>
	//  275  566:iload           7
	//  276  568:i2f             
	//  277  569:iload           9
	//  278  571:i2f             
	//  279  572:iload           8
	//  280  574:i2f             
	//  281  575:iload           10
	//  282  577:i2f             
	//  283  578:invokevirtual   #247 <Method android.graphics.Path PathMotion.a(float, float, float, float)>
	//  284  581:astore_1        
										ah1 = ((ah) (l));
	//  285  582:getstatic       #88  <Field Property l>
	//  286  585:astore_2        
									}
									viewgroup = ((ViewGroup) (android.support.transition.p.a(((Object) (ah2)), ((Property) (ah1)), ((android.graphics.Path) (viewgroup)))));
	//  287  586:aload_3         
	//  288  587:aload_2         
	//  289  588:aload_1         
	//  290  589:invokestatic    #255 <Method ObjectAnimator p.a(Object, Property, android.graphics.Path)>
	//  291  592:astore_1        
								} else
	//* 292  593:goto            800
								{
									View view = ((View) (obj));
	//  293  596:aload           19
	//  294  598:astore          21
									au.a(view, j2, j3, Math.max(l4, j5) + j2, Math.max(i5, k5) + j3);
	//  295  600:aload           21
	//  296  602:iload           7
	//  297  604:iload           9
	//  298  606:iload           15
	//  299  608:iload           17
	//  300  610:invokestatic    #277 <Method int Math.max(int, int)>
	//  301  613:iload           7
	//  302  615:iadd            
	//  303  616:iload           16
	//  304  618:iload           18
	//  305  620:invokestatic    #277 <Method int Math.max(int, int)>
	//  306  623:iload           9
	//  307  625:iadd            
	//  308  626:invokestatic    #239 <Method void au.a(View, int, int, int, int)>
									if(j2 == l2 && j3 == k3)
	//* 309  629:iload           7
	//* 310  631:iload           8
	//* 311  633:icmpne          651
	//* 312  636:iload           9
	//* 313  638:iload           10
	//* 314  640:icmpeq          646
	//* 315  643:goto            651
									{
										viewgroup = null;
	//  316  646:aconst_null     
	//  317  647:astore_1        
									} else
	//* 318  648:goto            681
									{
										viewgroup = ((ViewGroup) (h().a(j2, j3, l2, k3)));
	//  319  651:aload_0         
	//  320  652:invokevirtual   #242 <Method PathMotion h()>
	//  321  655:iload           7
	//  322  657:i2f             
	//  323  658:iload           9
	//  324  660:i2f             
	//  325  661:iload           8
	//  326  663:i2f             
	//  327  664:iload           10
	//  328  666:i2f             
	//  329  667:invokevirtual   #247 <Method android.graphics.Path PathMotion.a(float, float, float, float)>
	//  330  670:astore_1        
										viewgroup = ((ViewGroup) (android.support.transition.p.a(((Object) (view)), m, ((android.graphics.Path) (viewgroup)))));
	//  331  671:aload           21
	//  332  673:getstatic       #93  <Field Property m>
	//  333  676:aload_1         
	//  334  677:invokestatic    #255 <Method ObjectAnimator p.a(Object, Property, android.graphics.Path)>
	//  335  680:astore_1        
									}
									if(ah1 == null)
	//* 336  681:aload_2         
	//* 337  682:ifnonnull       702
										ah1 = ((ah) (new Rect(0, 0, l4, i5)));
	//  338  685:new             #169 <Class Rect>
	//  339  688:dup             
	//  340  689:iconst_0        
	//  341  690:iconst_0        
	//  342  691:iload           15
	//  343  693:iload           16
	//  344  695:invokespecial   #184 <Method void Rect(int, int, int, int)>
	//  345  698:astore_2        
	//* 346  699:goto            702
									if(obj1 == null)
	//* 347  702:aload           20
	//* 348  704:ifnonnull       724
										ah2 = ((ah) (new Rect(0, 0, j5, k5)));
	//  349  707:new             #169 <Class Rect>
	//  350  710:dup             
	//  351  711:iconst_0        
	//  352  712:iconst_0        
	//  353  713:iload           17
	//  354  715:iload           18
	//  355  717:invokespecial   #184 <Method void Rect(int, int, int, int)>
	//  356  720:astore_3        
									else
	//* 357  721:goto            727
										ah2 = ((ah) (obj1));
	//  358  724:aload           20
	//  359  726:astore_3        
									if(!((Rect) (ah1)).equals(((Object) (ah2))))
	//* 360  727:aload_2         
	//* 361  728:aload_3         
	//* 362  729:invokevirtual   #234 <Method boolean Rect.equals(Object)>
	//* 363  732:ifne            792
									{
										s.a(view, ((Rect) (ah1)));
	//  364  735:aload           21
	//  365  737:aload_2         
	//  366  738:invokestatic    #280 <Method void s.a(View, Rect)>
										ah1 = ((ah) (ObjectAnimator.ofObject(((Object) (view)), "clipBounds", ((android.animation.TypeEvaluator) (q)), new Object[] {
											ah1, ah2
										})));
	//  367  741:aload           21
	//  368  743:ldc2            #282 <String "clipBounds">
	//  369  746:getstatic       #99  <Field z q>
	//  370  749:iconst_2        
	//  371  750:anewarray       Object[]
	//  372  753:dup             
	//  373  754:iconst_0        
	//  374  755:aload_2         
	//  375  756:aastore         
	//  376  757:dup             
	//  377  758:iconst_1        
	//  378  759:aload_3         
	//  379  760:aastore         
	//  380  761:invokestatic    #290 <Method ObjectAnimator ObjectAnimator.ofObject(Object, String, android.animation.TypeEvaluator, Object[])>
	//  381  764:astore_2        
										((ObjectAnimator) (ah1)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(view, ((Rect) (obj1)), l2, k3, i4, k4) {

											public void onAnimationCancel(Animator animator)
											{
												h = true;
											//    0    0:aload_0         
											//    1    1:iconst_1        
											//    2    2:putfield        #45  <Field boolean h>
											//    3    5:return          
											}

											public void onAnimationEnd(Animator animator)
											{
												if(!h)
											//*   0    0:aload_0         
											//*   1    1:getfield        #45  <Field boolean h>
											//*   2    4:ifne            41
												{
													s.a(a, b);
											//    3    7:aload_0         
											//    4    8:getfield        #27  <Field View a>
											//    5   11:aload_0         
											//    6   12:getfield        #29  <Field Rect b>
											//    7   15:invokestatic    #51  <Method void s.a(View, Rect)>
													au.a(a, c, d, e, f);
											//    8   18:aload_0         
											//    9   19:getfield        #27  <Field View a>
											//   10   22:aload_0         
											//   11   23:getfield        #31  <Field int c>
											//   12   26:aload_0         
											//   13   27:getfield        #33  <Field int d>
											//   14   30:aload_0         
											//   15   31:getfield        #35  <Field int e>
											//   16   34:aload_0         
											//   17   35:getfield        #37  <Field int f>
											//   18   38:invokestatic    #56  <Method void au.a(View, int, int, int, int)>
												}
											//   19   41:return          
											}

											final View a;
											final Rect b;
											final int c;
											final int d;
											final int e;
											final int f;
											final ChangeBounds g;
											private boolean h;

			
			{
				g = ChangeBounds.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field ChangeBounds g>
				a = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field View a>
				b = rect;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field Rect b>
				c = i1;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #31  <Field int c>
				d = j1;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #33  <Field int d>
				e = k1;
			//   15   27:aload_0         
			//   16   28:iload           6
			//   17   30:putfield        #35  <Field int e>
				f = l1;
			//   18   33:aload_0         
			//   19   34:iload           7
			//   20   36:putfield        #37  <Field int f>
				super();
			//   21   39:aload_0         
			//   22   40:invokespecial   #40  <Method void AnimatorListenerAdapter()>
			//   23   43:return          
			}
										}
)));
	//  382  765:aload_2         
	//  383  766:new             #24  <Class ChangeBounds$9>
	//  384  769:dup             
	//  385  770:aload_0         
	//  386  771:aload           21
	//  387  773:aload           20
	//  388  775:iload           8
	//  389  777:iload           10
	//  390  779:iload           12
	//  391  781:iload           14
	//  392  783:invokespecial   #293 <Method void ChangeBounds$9(ChangeBounds, View, Rect, int, int, int, int)>
	//  393  786:invokevirtual   #294 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
									} else
	//* 394  789:goto            794
									{
										ah1 = null;
	//  395  792:aconst_null     
	//  396  793:astore_2        
									}
									viewgroup = ((ViewGroup) (ag.a(((Animator) (viewgroup)), ((Animator) (ah1)))));
	//  397  794:aload_1         
	//  398  795:aload_2         
	//  399  796:invokestatic    #299 <Method Animator ag.a(Animator, Animator)>
	//  400  799:astore_1        
								}
							}
							if(((View) (obj)).getParent() instanceof ViewGroup)
	//* 401  800:aload           19
	//* 402  802:invokevirtual   #194 <Method android.view.ViewParent View.getParent()>
	//* 403  805:instanceof      #215 <Class ViewGroup>
	//* 404  808:ifeq            839
							{
								ah1 = ((ah) ((ViewGroup)((View) (obj)).getParent()));
	//  405  811:aload           19
	//  406  813:invokevirtual   #194 <Method android.view.ViewParent View.getParent()>
	//  407  816:checkcast       #215 <Class ViewGroup>
	//  408  819:astore_2        
								an.a(((ViewGroup) (ah1)), true);
	//  409  820:aload_2         
	//  410  821:iconst_1        
	//  411  822:invokestatic    #304 <Method void an.a(ViewGroup, boolean)>
								a(((Transition.c) (new ad(((ViewGroup) (ah1))) {

									public void a(Transition transition)
									{
										if(!a)
									//*   0    0:aload_0         
									//*   1    1:getfield        #25  <Field boolean a>
									//*   2    4:ifne            15
											an.a(b, false);
									//    3    7:aload_0         
									//    4    8:getfield        #20  <Field ViewGroup b>
									//    5   11:iconst_0        
									//    6   12:invokestatic    #32  <Method void an.a(ViewGroup, boolean)>
										transition.b(((Transition.c) (this)));
									//    7   15:aload_1         
									//    8   16:aload_0         
									//    9   17:invokevirtual   #37  <Method Transition Transition.b(Transition$c)>
									//   10   20:pop             
									//   11   21:return          
									}

									public void b(Transition transition)
									{
										an.a(b, false);
									//    0    0:aload_0         
									//    1    1:getfield        #20  <Field ViewGroup b>
									//    2    4:iconst_0        
									//    3    5:invokestatic    #32  <Method void an.a(ViewGroup, boolean)>
									//    4    8:return          
									}

									public void c(Transition transition)
									{
										an.a(b, true);
									//    0    0:aload_0         
									//    1    1:getfield        #20  <Field ViewGroup b>
									//    2    4:iconst_1        
									//    3    5:invokestatic    #32  <Method void an.a(ViewGroup, boolean)>
									//    4    8:return          
									}

									boolean a;
									final ViewGroup b;
									final ChangeBounds c;

			
			{
				c = ChangeBounds.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ChangeBounds c>
				b = viewgroup;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field ViewGroup b>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void ad()>
				a = false;
			//    8   14:aload_0         
			//    9   15:iconst_0        
			//   10   16:putfield        #25  <Field boolean a>
			//   11   19:return          
			}
								}
)));
	//  412  825:aload_0         
	//  413  826:new             #8   <Class ChangeBounds$10>
	//  414  829:dup             
	//  415  830:aload_0         
	//  416  831:aload_2         
	//  417  832:invokespecial   #307 <Method void ChangeBounds$10(ChangeBounds, ViewGroup)>
	//  418  835:invokevirtual   #310 <Method Transition a(Transition$c)>
	//  419  838:pop             
							}
							return ((Animator) (viewgroup));
	//  420  839:aload_1         
	//  421  840:areturn         
						}
						j1 = ((Integer)ah1.a.get("android:changeBounds:windowX")).intValue();
	//  422  841:aload_2         
	//  423  842:getfield        #167 <Field Map ah.a>
	//  424  845:ldc1            #58  <String "android:changeBounds:windowX">
	//  425  847:invokeinterface #213 <Method Object Map.get(Object)>
	//  426  852:checkcast       #200 <Class Integer>
	//  427  855:invokevirtual   #313 <Method int Integer.intValue()>
	//  428  858:istore          5
						i2 = ((Integer)ah1.a.get("android:changeBounds:windowY")).intValue();
	//  429  860:aload_2         
	//  430  861:getfield        #167 <Field Map ah.a>
	//  431  864:ldc1            #60  <String "android:changeBounds:windowY">
	//  432  866:invokeinterface #213 <Method Object Map.get(Object)>
	//  433  871:checkcast       #200 <Class Integer>
	//  434  874:invokevirtual   #313 <Method int Integer.intValue()>
	//  435  877:istore          6
						k2 = ((Integer)ah2.a.get("android:changeBounds:windowX")).intValue();
	//  436  879:aload_3         
	//  437  880:getfield        #167 <Field Map ah.a>
	//  438  883:ldc1            #58  <String "android:changeBounds:windowX">
	//  439  885:invokeinterface #213 <Method Object Map.get(Object)>
	//  440  890:checkcast       #200 <Class Integer>
	//  441  893:invokevirtual   #313 <Method int Integer.intValue()>
	//  442  896:istore          7
						i3 = ((Integer)ah2.a.get("android:changeBounds:windowY")).intValue();
	//  443  898:aload_3         
	//  444  899:getfield        #167 <Field Map ah.a>
	//  445  902:ldc1            #60  <String "android:changeBounds:windowY">
	//  446  904:invokeinterface #213 <Method Object Map.get(Object)>
	//  447  909:checkcast       #200 <Class Integer>
	//  448  912:invokevirtual   #313 <Method int Integer.intValue()>
	//  449  915:istore          8
						if(j1 != k2 || i2 != i3)
	//* 450  917:iload           5
	//* 451  919:iload           7
	//* 452  921:icmpne          936
	//* 453  924:iload           6
	//* 454  926:iload           8
	//* 455  928:icmpeq          934
							break label2;
	//  456  931:goto            936
					}
					return null;
	//  457  934:aconst_null     
	//  458  935:areturn         
				}
				viewgroup.getLocationInWindow(n);
	//  459  936:aload_1         
	//  460  937:aload_0         
	//  461  938:getfield        #103 <Field int[] n>
	//  462  941:invokevirtual   #314 <Method void ViewGroup.getLocationInWindow(int[])>
				ah1 = ((ah) (Bitmap.createBitmap(((View) (obj)).getWidth(), ((View) (obj)).getHeight(), android.graphics.Bitmap.Config.ARGB_8888)));
	//  463  944:aload           19
	//  464  946:invokevirtual   #161 <Method int View.getWidth()>
	//  465  949:aload           19
	//  466  951:invokevirtual   #164 <Method int View.getHeight()>
	//  467  954:getstatic       #320 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//  468  957:invokestatic    #326 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//  469  960:astore_2        
				((View) (obj)).draw(new Canvas(((Bitmap) (ah1))));
	//  470  961:aload           19
	//  471  963:new             #328 <Class Canvas>
	//  472  966:dup             
	//  473  967:aload_2         
	//  474  968:invokespecial   #331 <Method void Canvas(Bitmap)>
	//  475  971:invokevirtual   #335 <Method void View.draw(Canvas)>
				ah1 = ((ah) (new BitmapDrawable(((Bitmap) (ah1)))));
	//  476  974:new             #337 <Class BitmapDrawable>
	//  477  977:dup             
	//  478  978:aload_2         
	//  479  979:invokespecial   #338 <Method void BitmapDrawable(Bitmap)>
	//  480  982:astore_2        
				float f = android.support.transition.au.c(((View) (obj)));
	//  481  983:aload           19
	//  482  985:invokestatic    #342 <Method float android.support.transition.au.c(View)>
	//  483  988:fstore          4
				au.a(((View) (obj)), 0.0F);
	//  484  990:aload           19
	//  485  992:fconst_0        
	//  486  993:invokestatic    #345 <Method void au.a(View, float)>
				au.a(((View) (viewgroup))).a(((Drawable) (ah1)));
	//  487  996:aload_1         
	//  488  997:invokestatic    #348 <Method at au.a(View)>
	//  489 1000:aload_2         
	//  490 1001:invokeinterface #353 <Method void at.a(Drawable)>
				ah2 = ((ah) (h().a(j1 - n[0], i2 - n[1], k2 - n[0], i3 - n[1])));
	//  491 1006:aload_0         
	//  492 1007:invokevirtual   #242 <Method PathMotion h()>
	//  493 1010:iload           5
	//  494 1012:aload_0         
	//  495 1013:getfield        #103 <Field int[] n>
	//  496 1016:iconst_0        
	//  497 1017:iaload          
	//  498 1018:isub            
	//  499 1019:i2f             
	//  500 1020:iload           6
	//  501 1022:aload_0         
	//  502 1023:getfield        #103 <Field int[] n>
	//  503 1026:iconst_1        
	//  504 1027:iaload          
	//  505 1028:isub            
	//  506 1029:i2f             
	//  507 1030:iload           7
	//  508 1032:aload_0         
	//  509 1033:getfield        #103 <Field int[] n>
	//  510 1036:iconst_0        
	//  511 1037:iaload          
	//  512 1038:isub            
	//  513 1039:i2f             
	//  514 1040:iload           8
	//  515 1042:aload_0         
	//  516 1043:getfield        #103 <Field int[] n>
	//  517 1046:iconst_1        
	//  518 1047:iaload          
	//  519 1048:isub            
	//  520 1049:i2f             
	//  521 1050:invokevirtual   #247 <Method android.graphics.Path PathMotion.a(float, float, float, float)>
	//  522 1053:astore_3        
				ah2 = ((ah) (ObjectAnimator.ofPropertyValuesHolder(((Object) (ah1)), new PropertyValuesHolder[] {
					u.a(h, ((android.graphics.Path) (ah2)))
				})));
	//  523 1054:aload_2         
	//  524 1055:iconst_1        
	//  525 1056:anewarray       PropertyValuesHolder[]
	//  526 1059:dup             
	//  527 1060:iconst_0        
	//  528 1061:getstatic       #72  <Field Property h>
	//  529 1064:aload_3         
	//  530 1065:invokestatic    #360 <Method PropertyValuesHolder u.a(Property, android.graphics.Path)>
	//  531 1068:aastore         
	//  532 1069:invokestatic    #364 <Method ObjectAnimator ObjectAnimator.ofPropertyValuesHolder(Object, PropertyValuesHolder[])>
	//  533 1072:astore_3        
				((ObjectAnimator) (ah2)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(viewgroup, ((BitmapDrawable) (ah1)), ((View) (obj)), f) {

					public void onAnimationEnd(Animator animator)
					{
						au.a(((View) (a))).b(((Drawable) (b)));
					//    0    0:aload_0         
					//    1    1:getfield        #24  <Field ViewGroup a>
					//    2    4:invokestatic    #41  <Method at au.a(View)>
					//    3    7:aload_0         
					//    4    8:getfield        #26  <Field BitmapDrawable b>
					//    5   11:invokeinterface #46  <Method void at.b(Drawable)>
						au.a(c, d);
					//    6   16:aload_0         
					//    7   17:getfield        #28  <Field View c>
					//    8   20:aload_0         
					//    9   21:getfield        #30  <Field float d>
					//   10   24:invokestatic    #49  <Method void au.a(View, float)>
					//   11   27:return          
					}

					final ViewGroup a;
					final BitmapDrawable b;
					final View c;
					final float d;
					final ChangeBounds e;

			
			{
				e = ChangeBounds.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ChangeBounds e>
				a = viewgroup;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field ViewGroup a>
				b = bitmapdrawable;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field BitmapDrawable b>
				c = view;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field View c>
				d = f;
			//   12   21:aload_0         
			//   13   22:fload           5
			//   14   24:putfield        #30  <Field float d>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #33  <Method void AnimatorListenerAdapter()>
			//   17   31:return          
			}
				}
)));
	//  534 1073:aload_3         
	//  535 1074:new             #10  <Class ChangeBounds$2>
	//  536 1077:dup             
	//  537 1078:aload_0         
	//  538 1079:aload_1         
	//  539 1080:aload_2         
	//  540 1081:aload           19
	//  541 1083:fload           4
	//  542 1085:invokespecial   #367 <Method void ChangeBounds$2(ChangeBounds, ViewGroup, BitmapDrawable, View, float)>
	//  543 1088:invokevirtual   #294 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
				return ((Animator) (ah2));
	//  544 1091:aload_3         
	//  545 1092:areturn         
			}
			return null;
	//  546 1093:aconst_null     
	//  547 1094:areturn         
		}
		return null;
	//  548 1095:aconst_null     
	//  549 1096:areturn         
	}

	public void a(ah ah1)
	{
		d(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #369 <Method void d(ah)>
	//    3    5:return          
	}

	public void a(boolean flag)
	{
		o = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #105 <Field boolean o>
	//    3    5:return          
	}

	public String[] a()
	{
		return g;
	//    0    0:getstatic       #62  <Field String[] g>
	//    1    3:areturn         
	}

	public void b(ah ah1)
	{
		d(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #369 <Method void d(ah)>
	//    3    5:return          
	}

	private static final String g[] = {
		"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"
	};
	private static final Property h = new Property(android/graphics/PointF, "boundsOrigin") {

		public PointF a(Drawable drawable)
		{
			drawable.copyBounds(a);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field Rect a>
		//    3    5:invokevirtual   #28  <Method void Drawable.copyBounds(Rect)>
			return new PointF(a.left, a.top);
		//    4    8:new             #30  <Class PointF>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:getfield        #20  <Field Rect a>
		//    8   16:getfield        #34  <Field int Rect.left>
		//    9   19:i2f             
		//   10   20:aload_0         
		//   11   21:getfield        #20  <Field Rect a>
		//   12   24:getfield        #37  <Field int Rect.top>
		//   13   27:i2f             
		//   14   28:invokespecial   #40  <Method void PointF(float, float)>
		//   15   31:areturn         
		}

		public void a(Drawable drawable, PointF pointf)
		{
			drawable.copyBounds(a);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field Rect a>
		//    3    5:invokevirtual   #28  <Method void Drawable.copyBounds(Rect)>
			a.offsetTo(Math.round(pointf.x), Math.round(pointf.y));
		//    4    8:aload_0         
		//    5    9:getfield        #20  <Field Rect a>
		//    6   12:aload_2         
		//    7   13:getfield        #45  <Field float PointF.x>
		//    8   16:invokestatic    #51  <Method int Math.round(float)>
		//    9   19:aload_2         
		//   10   20:getfield        #54  <Field float PointF.y>
		//   11   23:invokestatic    #51  <Method int Math.round(float)>
		//   12   26:invokevirtual   #58  <Method void Rect.offsetTo(int, int)>
			drawable.setBounds(a);
		//   13   29:aload_1         
		//   14   30:aload_0         
		//   15   31:getfield        #20  <Field Rect a>
		//   16   34:invokevirtual   #61  <Method void Drawable.setBounds(Rect)>
		//   17   37:return          
		}

		public Object get(Object obj)
		{
			return ((Object) (a((Drawable)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #24  <Class Drawable>
		//    3    5:invokevirtual   #65  <Method PointF a(Drawable)>
		//    4    8:areturn         
		}

		public void set(Object obj, Object obj1)
		{
			a((Drawable)obj, (PointF)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #24  <Class Drawable>
		//    3    5:aload_2         
		//    4    6:checkcast       #30  <Class PointF>
		//    5    9:invokevirtual   #69  <Method void a(Drawable, PointF)>
		//    6   12:return          
		}

		private Rect a;

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #13  <Method void Property(Class, String)>
				a = new Rect();
			//    4    6:aload_0         
			//    5    7:new             #15  <Class Rect>
			//    6   10:dup             
			//    7   11:invokespecial   #18  <Method void Rect()>
			//    8   14:putfield        #20  <Field Rect a>
			//    9   17:return          
			}
	}
;
	private static final Property i = new Property(android/graphics/PointF, "topLeft") {

		public PointF a(a a1)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void a(a a1, PointF pointf)
		{
			a1.a(pointf);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #20  <Method void ChangeBounds$a.a(PointF)>
		//    3    5:return          
		}

		public Object get(Object obj)
		{
			return ((Object) (a((a)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class ChangeBounds$a>
		//    3    5:invokevirtual   #24  <Method PointF a(ChangeBounds$a)>
		//    4    8:areturn         
		}

		public void set(Object obj, Object obj1)
		{
			a((a)obj, (PointF)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class ChangeBounds$a>
		//    3    5:aload_2         
		//    4    6:checkcast       #28  <Class PointF>
		//    5    9:invokevirtual   #30  <Method void a(ChangeBounds$a, PointF)>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private static final Property j = new Property(android/graphics/PointF, "bottomRight") {

		public PointF a(a a1)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void a(a a1, PointF pointf)
		{
			a1.b(pointf);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #21  <Method void ChangeBounds$a.b(PointF)>
		//    3    5:return          
		}

		public Object get(Object obj)
		{
			return ((Object) (a((a)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class ChangeBounds$a>
		//    3    5:invokevirtual   #25  <Method PointF a(ChangeBounds$a)>
		//    4    8:areturn         
		}

		public void set(Object obj, Object obj1)
		{
			a((a)obj, (PointF)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class ChangeBounds$a>
		//    3    5:aload_2         
		//    4    6:checkcast       #29  <Class PointF>
		//    5    9:invokevirtual   #31  <Method void a(ChangeBounds$a, PointF)>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private static final Property k = new Property(android/graphics/PointF, "bottomRight") {

		public PointF a(View view)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void a(View view, PointF pointf)
		{
			au.a(view, view.getLeft(), view.getTop(), Math.round(pointf.x), Math.round(pointf.y));
		//    0    0:aload_1         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #21  <Method int View.getLeft()>
		//    3    5:aload_1         
		//    4    6:invokevirtual   #24  <Method int View.getTop()>
		//    5    9:aload_2         
		//    6   10:getfield        #30  <Field float PointF.x>
		//    7   13:invokestatic    #36  <Method int Math.round(float)>
		//    8   16:aload_2         
		//    9   17:getfield        #39  <Field float PointF.y>
		//   10   20:invokestatic    #36  <Method int Math.round(float)>
		//   11   23:invokestatic    #44  <Method void au.a(View, int, int, int, int)>
		//   12   26:return          
		}

		public Object get(Object obj)
		{
			return ((Object) (a((View)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class View>
		//    3    5:invokevirtual   #48  <Method PointF a(View)>
		//    4    8:areturn         
		}

		public void set(Object obj, Object obj1)
		{
			a((View)obj, (PointF)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class View>
		//    3    5:aload_2         
		//    4    6:checkcast       #26  <Class PointF>
		//    5    9:invokevirtual   #52  <Method void a(View, PointF)>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private static final Property l = new Property(android/graphics/PointF, "topLeft") {

		public PointF a(View view)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void a(View view, PointF pointf)
		{
			au.a(view, Math.round(pointf.x), Math.round(pointf.y), view.getRight(), view.getBottom());
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:getfield        #21  <Field float PointF.x>
		//    3    5:invokestatic    #27  <Method int Math.round(float)>
		//    4    8:aload_2         
		//    5    9:getfield        #30  <Field float PointF.y>
		//    6   12:invokestatic    #27  <Method int Math.round(float)>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #36  <Method int View.getRight()>
		//    9   19:aload_1         
		//   10   20:invokevirtual   #39  <Method int View.getBottom()>
		//   11   23:invokestatic    #44  <Method void au.a(View, int, int, int, int)>
		//   12   26:return          
		}

		public Object get(Object obj)
		{
			return ((Object) (a((View)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #32  <Class View>
		//    3    5:invokevirtual   #48  <Method PointF a(View)>
		//    4    8:areturn         
		}

		public void set(Object obj, Object obj1)
		{
			a((View)obj, (PointF)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #32  <Class View>
		//    3    5:aload_2         
		//    4    6:checkcast       #17  <Class PointF>
		//    5    9:invokevirtual   #52  <Method void a(View, PointF)>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private static final Property m = new Property(android/graphics/PointF, "position") {

		public PointF a(View view)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void a(View view, PointF pointf)
		{
			int i1 = Math.round(pointf.x);
		//    0    0:aload_2         
		//    1    1:getfield        #21  <Field float PointF.x>
		//    2    4:invokestatic    #27  <Method int Math.round(float)>
		//    3    7:istore_3        
			int j1 = Math.round(pointf.y);
		//    4    8:aload_2         
		//    5    9:getfield        #30  <Field float PointF.y>
		//    6   12:invokestatic    #27  <Method int Math.round(float)>
		//    7   15:istore          4
			au.a(view, i1, j1, view.getWidth() + i1, view.getHeight() + j1);
		//    8   17:aload_1         
		//    9   18:iload_3         
		//   10   19:iload           4
		//   11   21:aload_1         
		//   12   22:invokevirtual   #36  <Method int View.getWidth()>
		//   13   25:iload_3         
		//   14   26:iadd            
		//   15   27:aload_1         
		//   16   28:invokevirtual   #39  <Method int View.getHeight()>
		//   17   31:iload           4
		//   18   33:iadd            
		//   19   34:invokestatic    #44  <Method void au.a(View, int, int, int, int)>
		//   20   37:return          
		}

		public Object get(Object obj)
		{
			return ((Object) (a((View)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #32  <Class View>
		//    3    5:invokevirtual   #48  <Method PointF a(View)>
		//    4    8:areturn         
		}

		public void set(Object obj, Object obj1)
		{
			a((View)obj, (PointF)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #32  <Class View>
		//    3    5:aload_2         
		//    4    6:checkcast       #17  <Class PointF>
		//    5    9:invokevirtual   #52  <Method void a(View, PointF)>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private static z q = new z();
	private int n[];
	private boolean o;
	private boolean p;

	static 
	{
	//    0    0:iconst_5        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #52  <String "android:changeBounds:bounds">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #54  <String "android:changeBounds:clip">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #56  <String "android:changeBounds:parent">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #58  <String "android:changeBounds:windowX">
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #60  <String "android:changeBounds:windowY">
	//   21   28:aastore         
	//   22   29:putstatic       #62  <Field String[] g>
	//   23   32:new             #6   <Class ChangeBounds$1>
	//   24   35:dup             
	//   25   36:ldc1            #64  <Class PointF>
	//   26   38:ldc1            #66  <String "boundsOrigin">
	//   27   40:invokespecial   #70  <Method void ChangeBounds$1(Class, String)>
	//   28   43:putstatic       #72  <Field Property h>
	//   29   46:new             #12  <Class ChangeBounds$3>
	//   30   49:dup             
	//   31   50:ldc1            #64  <Class PointF>
	//   32   52:ldc1            #74  <String "topLeft">
	//   33   54:invokespecial   #75  <Method void ChangeBounds$3(Class, String)>
	//   34   57:putstatic       #77  <Field Property i>
	//   35   60:new             #14  <Class ChangeBounds$4>
	//   36   63:dup             
	//   37   64:ldc1            #64  <Class PointF>
	//   38   66:ldc1            #79  <String "bottomRight">
	//   39   68:invokespecial   #80  <Method void ChangeBounds$4(Class, String)>
	//   40   71:putstatic       #82  <Field Property j>
	//   41   74:new             #16  <Class ChangeBounds$5>
	//   42   77:dup             
	//   43   78:ldc1            #64  <Class PointF>
	//   44   80:ldc1            #79  <String "bottomRight">
	//   45   82:invokespecial   #83  <Method void ChangeBounds$5(Class, String)>
	//   46   85:putstatic       #85  <Field Property k>
	//   47   88:new             #18  <Class ChangeBounds$6>
	//   48   91:dup             
	//   49   92:ldc1            #64  <Class PointF>
	//   50   94:ldc1            #74  <String "topLeft">
	//   51   96:invokespecial   #86  <Method void ChangeBounds$6(Class, String)>
	//   52   99:putstatic       #88  <Field Property l>
	//   53  102:new             #20  <Class ChangeBounds$7>
	//   54  105:dup             
	//   55  106:ldc1            #64  <Class PointF>
	//   56  108:ldc1            #90  <String "position">
	//   57  110:invokespecial   #91  <Method void ChangeBounds$7(Class, String)>
	//   58  113:putstatic       #93  <Field Property m>
	//   59  116:new             #95  <Class z>
	//   60  119:dup             
	//   61  120:invokespecial   #97  <Method void z()>
	//   62  123:putstatic       #99  <Field z q>
	//*  63  126:return          
	}
}
