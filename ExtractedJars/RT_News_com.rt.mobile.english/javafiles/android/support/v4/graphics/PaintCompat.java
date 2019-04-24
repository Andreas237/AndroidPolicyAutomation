// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v4.util.Pair;

public final class PaintCompat
{

	private PaintCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public static boolean hasGlyph(Paint paint, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return paint.hasGlyph(s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #39  <Method boolean Paint.hasGlyph(String)>
	//    6   13:ireturn         
		int k = s.length();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #45  <Method int String.length()>
	//    9   18:istore          8
		if(k == 1 && Character.isWhitespace(s.charAt(0)))
	//*  10   20:iload           8
	//*  11   22:iconst_1        
	//*  12   23:icmpne          39
	//*  13   26:aload_1         
	//*  14   27:iconst_0        
	//*  15   28:invokevirtual   #49  <Method char String.charAt(int)>
	//*  16   31:invokestatic    #55  <Method boolean Character.isWhitespace(char)>
	//*  17   34:ifeq            39
			return true;
	//   18   37:iconst_1        
	//   19   38:ireturn         
		float f1 = paint.measureText("\uDB3F\uDFFD");
	//   20   39:aload_0         
	//   21   40:ldc1            #11  <String "\uDB3F\uDFFD">
	//   22   42:invokevirtual   #59  <Method float Paint.measureText(String)>
	//   23   45:fstore_3        
		float f3 = paint.measureText("m");
	//   24   46:aload_0         
	//   25   47:ldc1            #8   <String "m">
	//   26   49:invokevirtual   #59  <Method float Paint.measureText(String)>
	//   27   52:fstore          5
		float f2 = paint.measureText(s);
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:invokevirtual   #59  <Method float Paint.measureText(String)>
	//   31   59:fstore          4
		float f = 0.0F;
	//   32   61:fconst_0        
	//   33   62:fstore_2        
		if(f2 == 0.0F)
	//*  34   63:fload           4
	//*  35   65:fconst_0        
	//*  36   66:fcmpl           
	//*  37   67:ifne            72
			return false;
	//   38   70:iconst_0        
	//   39   71:ireturn         
		if(s.codePointCount(0, s.length()) > 1)
	//*  40   72:aload_1         
	//*  41   73:iconst_0        
	//*  42   74:aload_1         
	//*  43   75:invokevirtual   #45  <Method int String.length()>
	//*  44   78:invokevirtual   #63  <Method int String.codePointCount(int, int)>
	//*  45   81:iconst_1        
	//*  46   82:icmple          149
		{
			if(f2 > 2.0F * f3)
	//*  47   85:fload           4
	//*  48   87:fconst_2        
	//*  49   88:fload           5
	//*  50   90:fmul            
	//*  51   91:fcmpl           
	//*  52   92:ifle            97
				return false;
	//   53   95:iconst_0        
	//   54   96:ireturn         
			int j;
			for(int i = 0; i < k; i = j)
	//*  55   97:iconst_0        
	//*  56   98:istore          6
	//*  57  100:iload           6
	//*  58  102:iload           8
	//*  59  104:icmpge          140
			{
				j = Character.charCount(s.codePointAt(i)) + i;
	//   60  107:aload_1         
	//   61  108:iload           6
	//   62  110:invokevirtual   #67  <Method int String.codePointAt(int)>
	//   63  113:invokestatic    #70  <Method int Character.charCount(int)>
	//   64  116:iload           6
	//   65  118:iadd            
	//   66  119:istore          7
				f += paint.measureText(s, i, j);
	//   67  121:fload_2         
	//   68  122:aload_0         
	//   69  123:aload_1         
	//   70  124:iload           6
	//   71  126:iload           7
	//   72  128:invokevirtual   #73  <Method float Paint.measureText(String, int, int)>
	//   73  131:fadd            
	//   74  132:fstore_2        
			}

	//   75  133:iload           7
	//   76  135:istore          6
	//*  77  137:goto            100
			if(f2 >= f)
	//*  78  140:fload           4
	//*  79  142:fload_2         
	//*  80  143:fcmpl           
	//*  81  144:iflt            149
				return false;
	//   82  147:iconst_0        
	//   83  148:ireturn         
		}
		if(f2 != f1)
	//*  84  149:fload           4
	//*  85  151:fload_3         
	//*  86  152:fcmpl           
	//*  87  153:ifeq            158
		{
			return true;
	//   88  156:iconst_1        
	//   89  157:ireturn         
		} else
		{
			Pair pair = obtainEmptyRects();
	//   90  158:invokestatic    #77  <Method Pair obtainEmptyRects()>
	//   91  161:astore          9
			paint.getTextBounds("\uDB3F\uDFFD", 0, "\uDB3F\uDFFD".length(), (Rect)pair.first);
	//   92  163:aload_0         
	//   93  164:ldc1            #11  <String "\uDB3F\uDFFD">
	//   94  166:iconst_0        
	//   95  167:ldc1            #11  <String "\uDB3F\uDFFD">
	//   96  169:invokevirtual   #45  <Method int String.length()>
	//   97  172:aload           9
	//   98  174:getfield        #83  <Field Object Pair.first>
	//   99  177:checkcast       #85  <Class Rect>
	//  100  180:invokevirtual   #89  <Method void Paint.getTextBounds(String, int, int, Rect)>
			paint.getTextBounds(s, 0, k, (Rect)pair.second);
	//  101  183:aload_0         
	//  102  184:aload_1         
	//  103  185:iconst_0        
	//  104  186:iload           8
	//  105  188:aload           9
	//  106  190:getfield        #92  <Field Object Pair.second>
	//  107  193:checkcast       #85  <Class Rect>
	//  108  196:invokevirtual   #89  <Method void Paint.getTextBounds(String, int, int, Rect)>
			return ((Rect)pair.first).equals(pair.second) ^ true;
	//  109  199:aload           9
	//  110  201:getfield        #83  <Field Object Pair.first>
	//  111  204:checkcast       #85  <Class Rect>
	//  112  207:aload           9
	//  113  209:getfield        #92  <Field Object Pair.second>
	//  114  212:invokevirtual   #96  <Method boolean Rect.equals(Object)>
	//  115  215:iconst_1        
	//  116  216:ixor            
	//  117  217:ireturn         
		}
	}

	private static Pair obtainEmptyRects()
	{
		Pair pair = (Pair)sRectThreadLocal.get();
	//    0    0:getstatic       #23  <Field ThreadLocal sRectThreadLocal>
	//    1    3:invokevirtual   #101 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #79  <Class Pair>
	//    3    9:astore_0        
		if(pair == null)
	//*   4   10:aload_0         
	//*   5   11:ifnonnull       45
		{
			pair = new Pair(((Object) (new Rect())), ((Object) (new Rect())));
	//    6   14:new             #79  <Class Pair>
	//    7   17:dup             
	//    8   18:new             #85  <Class Rect>
	//    9   21:dup             
	//   10   22:invokespecial   #102 <Method void Rect()>
	//   11   25:new             #85  <Class Rect>
	//   12   28:dup             
	//   13   29:invokespecial   #102 <Method void Rect()>
	//   14   32:invokespecial   #105 <Method void Pair(Object, Object)>
	//   15   35:astore_0        
			sRectThreadLocal.set(((Object) (pair)));
	//   16   36:getstatic       #23  <Field ThreadLocal sRectThreadLocal>
	//   17   39:aload_0         
	//   18   40:invokevirtual   #109 <Method void ThreadLocal.set(Object)>
			return pair;
	//   19   43:aload_0         
	//   20   44:areturn         
		} else
		{
			((Rect)pair.first).setEmpty();
	//   21   45:aload_0         
	//   22   46:getfield        #83  <Field Object Pair.first>
	//   23   49:checkcast       #85  <Class Rect>
	//   24   52:invokevirtual   #112 <Method void Rect.setEmpty()>
			((Rect)pair.second).setEmpty();
	//   25   55:aload_0         
	//   26   56:getfield        #92  <Field Object Pair.second>
	//   27   59:checkcast       #85  <Class Rect>
	//   28   62:invokevirtual   #112 <Method void Rect.setEmpty()>
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
