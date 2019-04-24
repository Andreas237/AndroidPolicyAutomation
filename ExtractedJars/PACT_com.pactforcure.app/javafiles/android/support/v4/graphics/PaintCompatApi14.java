// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v4.util.Pair;

class PaintCompatApi14
{

	PaintCompatApi14()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	static boolean hasGlyph(Paint paint, String s)
	{
		int j;
		boolean flag2;
		flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          9
		j = s.length();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #34  <Method int String.length()>
	//    4    7:istore          6
		if(j != 1 || !Character.isWhitespace(s.charAt(0))) goto _L2; else goto _L1
	//    5    9:iload           6
	//    6   11:iconst_1        
	//    7   12:icmpne          32
	//    8   15:aload_1         
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #38  <Method char String.charAt(int)>
	//   11   20:invokestatic    #44  <Method boolean Character.isWhitespace(char)>
	//   12   23:ifeq            32
_L1:
		boolean flag = true;
	//   13   26:iconst_1        
	//   14   27:istore          8
_L4:
		return flag;
	//   15   29:iload           8
	//   16   31:ireturn         
_L2:
		float f;
		float f1;
		float f2;
		f1 = paint.measureText("\uDB3F\uDFFD");
	//   17   32:aload_0         
	//   18   33:ldc1            #11  <String "\uDB3F\uDFFD">
	//   19   35:invokevirtual   #50  <Method float Paint.measureText(String)>
	//   20   38:fstore_3        
		f = paint.measureText("m");
	//   21   39:aload_0         
	//   22   40:ldc1            #8   <String "m">
	//   23   42:invokevirtual   #50  <Method float Paint.measureText(String)>
	//   24   45:fstore_2        
		f2 = paint.measureText(s);
	//   25   46:aload_0         
	//   26   47:aload_1         
	//   27   48:invokevirtual   #50  <Method float Paint.measureText(String)>
	//   28   51:fstore          4
		flag = flag2;
	//   29   53:iload           9
	//   30   55:istore          8
		if(f2 == 0.0F) goto _L4; else goto _L3
	//   31   57:fload           4
	//   32   59:fconst_0        
	//   33   60:fcmpl           
	//   34   61:ifeq            29
_L3:
		if(s.codePointCount(0, s.length()) <= 1)
			break; /* Loop/switch isn't completed */
	//   35   64:aload_1         
	//   36   65:iconst_0        
	//   37   66:aload_1         
	//   38   67:invokevirtual   #34  <Method int String.length()>
	//   39   70:invokevirtual   #54  <Method int String.codePointCount(int, int)>
	//   40   73:iconst_1        
	//   41   74:icmple          149
		flag = flag2;
	//   42   77:iload           9
	//   43   79:istore          8
		if(f2 > 2.0F * f) goto _L4; else goto _L5
	//   44   81:fload           4
	//   45   83:fconst_2        
	//   46   84:fload_2         
	//   47   85:fmul            
	//   48   86:fcmpl           
	//   49   87:ifgt            29
_L5:
		f = 0.0F;
	//   50   90:fconst_0        
	//   51   91:fstore_2        
		int k;
		for(int i = 0; i < j; i += k)
	//*  52   92:iconst_0        
	//*  53   93:istore          5
	//*  54   95:iload           5
	//*  55   97:iload           6
	//*  56   99:icmpge          138
		{
			k = Character.charCount(s.codePointAt(i));
	//   57  102:aload_1         
	//   58  103:iload           5
	//   59  105:invokevirtual   #58  <Method int String.codePointAt(int)>
	//   60  108:invokestatic    #61  <Method int Character.charCount(int)>
	//   61  111:istore          7
			f += paint.measureText(s, i, i + k);
	//   62  113:fload_2         
	//   63  114:aload_0         
	//   64  115:aload_1         
	//   65  116:iload           5
	//   66  118:iload           5
	//   67  120:iload           7
	//   68  122:iadd            
	//   69  123:invokevirtual   #64  <Method float Paint.measureText(String, int, int)>
	//   70  126:fadd            
	//   71  127:fstore_2        
		}

	//   72  128:iload           5
	//   73  130:iload           7
	//   74  132:iadd            
	//   75  133:istore          5
	//*  76  135:goto            95
		flag = flag2;
	//   77  138:iload           9
	//   78  140:istore          8
		if(f2 >= f) goto _L4; else goto _L6
	//   79  142:fload           4
	//   80  144:fload_2         
	//   81  145:fcmpl           
	//   82  146:ifge            29
_L6:
		if(f2 != f1)
	//*  83  149:fload           4
	//*  84  151:fload_3         
	//*  85  152:fcmpl           
	//*  86  153:ifeq            158
			return true;
	//   87  156:iconst_1        
	//   88  157:ireturn         
		Pair pair = obtainEmptyRects();
	//   89  158:invokestatic    #68  <Method Pair obtainEmptyRects()>
	//   90  161:astore          10
		paint.getTextBounds("\uDB3F\uDFFD", 0, "\uDB3F\uDFFD".length(), (Rect)pair.first);
	//   91  163:aload_0         
	//   92  164:ldc1            #11  <String "\uDB3F\uDFFD">
	//   93  166:iconst_0        
	//   94  167:ldc1            #11  <String "\uDB3F\uDFFD">
	//   95  169:invokevirtual   #34  <Method int String.length()>
	//   96  172:aload           10
	//   97  174:getfield        #74  <Field Object Pair.first>
	//   98  177:checkcast       #76  <Class Rect>
	//   99  180:invokevirtual   #80  <Method void Paint.getTextBounds(String, int, int, Rect)>
		paint.getTextBounds(s, 0, j, (Rect)pair.second);
	//  100  183:aload_0         
	//  101  184:aload_1         
	//  102  185:iconst_0        
	//  103  186:iload           6
	//  104  188:aload           10
	//  105  190:getfield        #83  <Field Object Pair.second>
	//  106  193:checkcast       #76  <Class Rect>
	//  107  196:invokevirtual   #80  <Method void Paint.getTextBounds(String, int, int, Rect)>
		boolean flag1;
		if(!((Rect)pair.first).equals(pair.second))
	//* 108  199:aload           10
	//* 109  201:getfield        #74  <Field Object Pair.first>
	//* 110  204:checkcast       #76  <Class Rect>
	//* 111  207:aload           10
	//* 112  209:getfield        #83  <Field Object Pair.second>
	//* 113  212:invokevirtual   #87  <Method boolean Rect.equals(Object)>
	//* 114  215:ifne            224
			flag1 = true;
	//  115  218:iconst_1        
	//  116  219:istore          8
		else
	//* 117  221:iload           8
	//* 118  223:ireturn         
			flag1 = false;
	//  119  224:iconst_0        
	//  120  225:istore          8
		return flag1;
	//* 121  227:goto            221
	}

	private static Pair obtainEmptyRects()
	{
		Pair pair = (Pair)sRectThreadLocal.get();
	//    0    0:getstatic       #23  <Field ThreadLocal sRectThreadLocal>
	//    1    3:invokevirtual   #92  <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #70  <Class Pair>
	//    3    9:astore_0        
		if(pair == null)
	//*   4   10:aload_0         
	//*   5   11:ifnonnull       45
		{
			pair = new Pair(((Object) (new Rect())), ((Object) (new Rect())));
	//    6   14:new             #70  <Class Pair>
	//    7   17:dup             
	//    8   18:new             #76  <Class Rect>
	//    9   21:dup             
	//   10   22:invokespecial   #93  <Method void Rect()>
	//   11   25:new             #76  <Class Rect>
	//   12   28:dup             
	//   13   29:invokespecial   #93  <Method void Rect()>
	//   14   32:invokespecial   #96  <Method void Pair(Object, Object)>
	//   15   35:astore_0        
			sRectThreadLocal.set(((Object) (pair)));
	//   16   36:getstatic       #23  <Field ThreadLocal sRectThreadLocal>
	//   17   39:aload_0         
	//   18   40:invokevirtual   #100 <Method void ThreadLocal.set(Object)>
			return pair;
	//   19   43:aload_0         
	//   20   44:areturn         
		} else
		{
			((Rect)pair.first).setEmpty();
	//   21   45:aload_0         
	//   22   46:getfield        #74  <Field Object Pair.first>
	//   23   49:checkcast       #76  <Class Rect>
	//   24   52:invokevirtual   #103 <Method void Rect.setEmpty()>
			((Rect)pair.second).setEmpty();
	//   25   55:aload_0         
	//   26   56:getfield        #83  <Field Object Pair.second>
	//   27   59:checkcast       #76  <Class Rect>
	//   28   62:invokevirtual   #103 <Method void Rect.setEmpty()>
			return pair;
	//   29   65:aload_0         
	//   30   66:areturn         
		}
	}

	private static final String EM_STRING = "m";
	private static final String TOFU_STRING = "\uDB3F\uDFFD";
	private static final ThreadLocal sRectThreadLocal = new ThreadLocal();

	static 
	{
	//    0    0:new             #18  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ThreadLocal()>
	//    3    7:putstatic       #23  <Field ThreadLocal sRectThreadLocal>
	//*   4   10:return          
	}
}
