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
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	static boolean hasGlyph(Paint paint, String s)
	{
		int j = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #31  <Method int String.length()>
	//    2    4:istore          6
		if(j == 1 && Character.isWhitespace(s.charAt(0)))
	//*   3    6:iload           6
	//*   4    8:iconst_1        
	//*   5    9:icmpne          25
	//*   6   12:aload_1         
	//*   7   13:iconst_0        
	//*   8   14:invokevirtual   #35  <Method char String.charAt(int)>
	//*   9   17:invokestatic    #41  <Method boolean Character.isWhitespace(char)>
	//*  10   20:ifeq            25
			return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		float f1 = paint.measureText("\uDB3F\uDFFD");
	//   13   25:aload_0         
	//   14   26:ldc1            #8   <String "\uDB3F\uDFFD">
	//   15   28:invokevirtual   #47  <Method float Paint.measureText(String)>
	//   16   31:fstore_3        
		float f2 = paint.measureText(s);
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:invokevirtual   #47  <Method float Paint.measureText(String)>
	//   20   37:fstore          4
		if(f2 == 0.0F)
	//*  21   39:fload           4
	//*  22   41:fconst_0        
	//*  23   42:fcmpl           
	//*  24   43:ifne            48
			return false;
	//   25   46:iconst_0        
	//   26   47:ireturn         
		if(s.codePointCount(0, s.length()) > 1)
	//*  27   48:aload_1         
	//*  28   49:iconst_0        
	//*  29   50:aload_1         
	//*  30   51:invokevirtual   #31  <Method int String.length()>
	//*  31   54:invokevirtual   #51  <Method int String.codePointCount(int, int)>
	//*  32   57:iconst_1        
	//*  33   58:icmple          129
		{
			if(f2 > 2.0F * f1)
	//*  34   61:fload           4
	//*  35   63:fconst_2        
	//*  36   64:fload_3         
	//*  37   65:fmul            
	//*  38   66:fcmpl           
	//*  39   67:ifle            72
				return false;
	//   40   70:iconst_0        
	//   41   71:ireturn         
			float f = 0.0F;
	//   42   72:fconst_0        
	//   43   73:fstore_2        
			int k;
			for(int i = 0; i < j; i += k)
	//*  44   74:iconst_0        
	//*  45   75:istore          5
	//*  46   77:iload           5
	//*  47   79:iload           6
	//*  48   81:icmpge          120
			{
				k = Character.charCount(s.codePointAt(i));
	//   49   84:aload_1         
	//   50   85:iload           5
	//   51   87:invokevirtual   #55  <Method int String.codePointAt(int)>
	//   52   90:invokestatic    #58  <Method int Character.charCount(int)>
	//   53   93:istore          7
				f += paint.measureText(s, i, i + k);
	//   54   95:fload_2         
	//   55   96:aload_0         
	//   56   97:aload_1         
	//   57   98:iload           5
	//   58  100:iload           5
	//   59  102:iload           7
	//   60  104:iadd            
	//   61  105:invokevirtual   #61  <Method float Paint.measureText(String, int, int)>
	//   62  108:fadd            
	//   63  109:fstore_2        
			}

	//   64  110:iload           5
	//   65  112:iload           7
	//   66  114:iadd            
	//   67  115:istore          5
	//*  68  117:goto            77
			if(f2 >= f)
	//*  69  120:fload           4
	//*  70  122:fload_2         
	//*  71  123:fcmpl           
	//*  72  124:iflt            129
				return false;
	//   73  127:iconst_0        
	//   74  128:ireturn         
		}
		if(f2 != f1)
	//*  75  129:fload           4
	//*  76  131:fload_3         
	//*  77  132:fcmpl           
	//*  78  133:ifeq            138
			return true;
	//   79  136:iconst_1        
	//   80  137:ireturn         
		Pair pair = obtainEmptyRects();
	//   81  138:invokestatic    #65  <Method Pair obtainEmptyRects()>
	//   82  141:astore          8
		paint.getTextBounds("\uDB3F\uDFFD", 0, "\uDB3F\uDFFD".length(), (Rect)pair.first);
	//   83  143:aload_0         
	//   84  144:ldc1            #8   <String "\uDB3F\uDFFD">
	//   85  146:iconst_0        
	//   86  147:ldc1            #8   <String "\uDB3F\uDFFD">
	//   87  149:invokevirtual   #31  <Method int String.length()>
	//   88  152:aload           8
	//   89  154:getfield        #71  <Field Object Pair.first>
	//   90  157:checkcast       #73  <Class Rect>
	//   91  160:invokevirtual   #77  <Method void Paint.getTextBounds(String, int, int, Rect)>
		paint.getTextBounds(s, 0, j, (Rect)pair.second);
	//   92  163:aload_0         
	//   93  164:aload_1         
	//   94  165:iconst_0        
	//   95  166:iload           6
	//   96  168:aload           8
	//   97  170:getfield        #80  <Field Object Pair.second>
	//   98  173:checkcast       #73  <Class Rect>
	//   99  176:invokevirtual   #77  <Method void Paint.getTextBounds(String, int, int, Rect)>
		return !((Rect)pair.first).equals(pair.second);
	//  100  179:aload           8
	//  101  181:getfield        #71  <Field Object Pair.first>
	//  102  184:checkcast       #73  <Class Rect>
	//  103  187:aload           8
	//  104  189:getfield        #80  <Field Object Pair.second>
	//  105  192:invokevirtual   #84  <Method boolean Rect.equals(Object)>
	//  106  195:ifne            200
	//  107  198:iconst_1        
	//  108  199:ireturn         
	//  109  200:iconst_0        
	//  110  201:ireturn         
	}

	private static Pair obtainEmptyRects()
	{
		Pair pair = (Pair)sRectThreadLocal.get();
	//    0    0:getstatic       #20  <Field ThreadLocal sRectThreadLocal>
	//    1    3:invokevirtual   #89  <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #67  <Class Pair>
	//    3    9:astore_0        
		if(pair == null)
	//*   4   10:aload_0         
	//*   5   11:ifnonnull       45
		{
			pair = new Pair(((Object) (new Rect())), ((Object) (new Rect())));
	//    6   14:new             #67  <Class Pair>
	//    7   17:dup             
	//    8   18:new             #73  <Class Rect>
	//    9   21:dup             
	//   10   22:invokespecial   #90  <Method void Rect()>
	//   11   25:new             #73  <Class Rect>
	//   12   28:dup             
	//   13   29:invokespecial   #90  <Method void Rect()>
	//   14   32:invokespecial   #93  <Method void Pair(Object, Object)>
	//   15   35:astore_0        
			sRectThreadLocal.set(((Object) (pair)));
	//   16   36:getstatic       #20  <Field ThreadLocal sRectThreadLocal>
	//   17   39:aload_0         
	//   18   40:invokevirtual   #97  <Method void ThreadLocal.set(Object)>
			return pair;
	//   19   43:aload_0         
	//   20   44:areturn         
		} else
		{
			((Rect)pair.first).setEmpty();
	//   21   45:aload_0         
	//   22   46:getfield        #71  <Field Object Pair.first>
	//   23   49:checkcast       #73  <Class Rect>
	//   24   52:invokevirtual   #100 <Method void Rect.setEmpty()>
			((Rect)pair.second).setEmpty();
	//   25   55:aload_0         
	//   26   56:getfield        #80  <Field Object Pair.second>
	//   27   59:checkcast       #73  <Class Rect>
	//   28   62:invokevirtual   #100 <Method void Rect.setEmpty()>
			return pair;
	//   29   65:aload_0         
	//   30   66:areturn         
		}
	}

	private static final String TOFU_STRING = "\uDB3F\uDFFD";
	private static final ThreadLocal sRectThreadLocal = new ThreadLocal();

	static 
	{
	//    0    0:new             #15  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void ThreadLocal()>
	//    3    7:putstatic       #20  <Field ThreadLocal sRectThreadLocal>
	//*   4   10:return          
	}
}
