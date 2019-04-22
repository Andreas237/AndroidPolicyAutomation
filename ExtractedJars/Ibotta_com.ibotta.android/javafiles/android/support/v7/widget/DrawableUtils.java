// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;
import android.graphics.drawable.*;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.graphics.drawable.WrappedDrawable;
import android.support.v7.graphics.drawable.DrawableWrapper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.widget:
//			ThemeUtils

public class DrawableUtils
{

	public static boolean canSafelyMutateDrawable(Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable))
	//*   0    0:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          15
	//*   2    5:icmpge          17
	//*   3    8:aload_0         
	//*   4    9:instanceof      #46  <Class InsetDrawable>
	//*   5   12:ifeq            17
			return false;
	//    6   15:iconst_0        
	//    7   16:ireturn         
		if(android.os.Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable))
	//*   8   17:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   20:bipush          15
	//*  10   22:icmpge          34
	//*  11   25:aload_0         
	//*  12   26:instanceof      #48  <Class GradientDrawable>
	//*  13   29:ifeq            34
			return false;
	//   14   32:iconst_0        
	//   15   33:ireturn         
		if(android.os.Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable))
	//*  16   34:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   37:bipush          17
	//*  18   39:icmpge          51
	//*  19   42:aload_0         
	//*  20   43:instanceof      #50  <Class LayerDrawable>
	//*  21   46:ifeq            51
			return false;
	//   22   49:iconst_0        
	//   23   50:ireturn         
		if(drawable instanceof DrawableContainer)
	//*  24   51:aload_0         
	//*  25   52:instanceof      #52  <Class DrawableContainer>
	//*  26   55:ifeq            106
		{
			drawable = ((Drawable) (drawable.getConstantState()));
	//   27   58:aload_0         
	//   28   59:invokevirtual   #58  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   29   62:astore_0        
			if(drawable instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState)
	//*  30   63:aload_0         
	//*  31   64:instanceof      #60  <Class android.graphics.drawable.DrawableContainer$DrawableContainerState>
	//*  32   67:ifeq            162
			{
				drawable = ((Drawable) (((android.graphics.drawable.DrawableContainer.DrawableContainerState)drawable).getChildren()));
	//   33   70:aload_0         
	//   34   71:checkcast       #60  <Class android.graphics.drawable.DrawableContainer$DrawableContainerState>
	//   35   74:invokevirtual   #64  <Method Drawable[] android.graphics.drawable.DrawableContainer$DrawableContainerState.getChildren()>
	//   36   77:astore_0        
				int j = drawable.length;
	//   37   78:aload_0         
	//   38   79:arraylength     
	//   39   80:istore_2        
				for(int i = 0; i < j; i++)
	//*  40   81:iconst_0        
	//*  41   82:istore_1        
	//*  42   83:iload_1         
	//*  43   84:iload_2         
	//*  44   85:icmpge          162
					if(!canSafelyMutateDrawable(((Drawable) (drawable[i]))))
	//*  45   88:aload_0         
	//*  46   89:iload_1         
	//*  47   90:aaload          
	//*  48   91:invokestatic    #66  <Method boolean canSafelyMutateDrawable(Drawable)>
	//*  49   94:ifne            99
						return false;
	//   50   97:iconst_0        
	//   51   98:ireturn         

	//   52   99:iload_1         
	//   53  100:iconst_1        
	//   54  101:iadd            
	//   55  102:istore_1        
			}
		} else
	//*  56  103:goto            83
		{
			if(drawable instanceof WrappedDrawable)
	//*  57  106:aload_0         
	//*  58  107:instanceof      #68  <Class WrappedDrawable>
	//*  59  110:ifeq            126
				return canSafelyMutateDrawable(((WrappedDrawable)drawable).getWrappedDrawable());
	//   60  113:aload_0         
	//   61  114:checkcast       #68  <Class WrappedDrawable>
	//   62  117:invokeinterface #72  <Method Drawable WrappedDrawable.getWrappedDrawable()>
	//   63  122:invokestatic    #66  <Method boolean canSafelyMutateDrawable(Drawable)>
	//   64  125:ireturn         
			if(drawable instanceof DrawableWrapper)
	//*  65  126:aload_0         
	//*  66  127:instanceof      #74  <Class DrawableWrapper>
	//*  67  130:ifeq            144
				return canSafelyMutateDrawable(((DrawableWrapper)drawable).getWrappedDrawable());
	//   68  133:aload_0         
	//   69  134:checkcast       #74  <Class DrawableWrapper>
	//   70  137:invokevirtual   #75  <Method Drawable DrawableWrapper.getWrappedDrawable()>
	//   71  140:invokestatic    #66  <Method boolean canSafelyMutateDrawable(Drawable)>
	//   72  143:ireturn         
			if(drawable instanceof ScaleDrawable)
	//*  73  144:aload_0         
	//*  74  145:instanceof      #77  <Class ScaleDrawable>
	//*  75  148:ifeq            162
				return canSafelyMutateDrawable(((ScaleDrawable)drawable).getDrawable());
	//   76  151:aload_0         
	//   77  152:checkcast       #77  <Class ScaleDrawable>
	//   78  155:invokevirtual   #80  <Method Drawable ScaleDrawable.getDrawable()>
	//   79  158:invokestatic    #66  <Method boolean canSafelyMutateDrawable(Drawable)>
	//   80  161:ireturn         
		}
		return true;
	//   81  162:iconst_1        
	//   82  163:ireturn         
	}

	static void fixDrawable(Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(((Object) (((Object) (drawable)).getClass().getName()))))
	//*   0    0:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpne          27
	//*   3    8:ldc1            #85  <String "android.graphics.drawable.VectorDrawable">
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #89  <Method Class Object.getClass()>
	//*   6   14:invokevirtual   #93  <Method String Class.getName()>
	//*   7   17:invokevirtual   #99  <Method boolean String.equals(Object)>
	//*   8   20:ifeq            27
			fixVectorDrawableTinting(drawable);
	//    9   23:aload_0         
	//   10   24:invokestatic    #102 <Method void fixVectorDrawableTinting(Drawable)>
	//   11   27:return          
	}

	private static void fixVectorDrawableTinting(Drawable drawable)
	{
		int ai[] = drawable.getState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #106 <Method int[] Drawable.getState()>
	//    2    4:astore_1        
		if(ai != null && ai.length != 0)
	//*   3    5:aload_1         
	//*   4    6:ifnull          28
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:ifne            17
	//*   8   14:goto            28
			drawable.setState(ThemeUtils.EMPTY_STATE_SET);
	//    9   17:aload_0         
	//   10   18:getstatic       #112 <Field int[] ThemeUtils.EMPTY_STATE_SET>
	//   11   21:invokevirtual   #116 <Method boolean Drawable.setState(int[])>
	//   12   24:pop             
		else
	//*  13   25:goto            36
			drawable.setState(ThemeUtils.CHECKED_STATE_SET);
	//   14   28:aload_0         
	//   15   29:getstatic       #119 <Field int[] ThemeUtils.CHECKED_STATE_SET>
	//   16   32:invokevirtual   #116 <Method boolean Drawable.setState(int[])>
	//   17   35:pop             
		drawable.setState(ai);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #116 <Method boolean Drawable.setState(int[])>
	//   21   41:pop             
	//   22   42:return          
	}

	public static Rect getOpticalBounds(Drawable drawable)
	{
		if(sInsetsClazz == null) goto _L2; else goto _L1
	//    0    0:getstatic       #40  <Field Class sInsetsClazz>
	//    1    3:ifnull          242
_L1:
		drawable = DrawableCompat.unwrap(drawable);
	//    2    6:aload_0         
	//    3    7:invokestatic    #129 <Method Drawable DrawableCompat.unwrap(Drawable)>
	//    4   10:astore_0        
		drawable = ((Drawable) (((Object) (drawable)).getClass().getMethod("getOpticalInsets", new Class[0]).invoke(((Object) (drawable)), new Object[0])));
	//    5   11:aload_0         
	//    6   12:invokevirtual   #89  <Method Class Object.getClass()>
	//    7   15:ldc1            #131 <String "getOpticalInsets">
	//    8   17:iconst_0        
	//    9   18:anewarray       Class[]
	//   10   21:invokevirtual   #135 <Method Method Class.getMethod(String, Class[])>
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:anewarray       Object[]
	//   14   29:invokevirtual   #141 <Method Object Method.invoke(Object, Object[])>
	//   15   32:astore_0        
		if(drawable == null) goto _L2; else goto _L3
	//   16   33:aload_0         
	//   17   34:ifnull          242
_L3:
		int k;
		Rect rect;
		Field afield[];
		rect = new Rect();
	//   18   37:new             #19  <Class Rect>
	//   19   40:dup             
	//   20   41:invokespecial   #22  <Method void Rect()>
	//   21   44:astore          4
		afield = sInsetsClazz.getFields();
	//   22   46:getstatic       #40  <Field Class sInsetsClazz>
	//   23   49:invokevirtual   #145 <Method Field[] Class.getFields()>
	//   24   52:astore          5
		k = afield.length;
	//   25   54:aload           5
	//   26   56:arraylength     
	//   27   57:istore_3        
		int j = 0;
	//   28   58:iconst_0        
	//   29   59:istore_2        
_L28:
		if(j >= k) goto _L5; else goto _L4
	//   30   60:iload_2         
	//   31   61:iload_3         
	//   32   62:icmpge          231
_L4:
		Field field = afield[j];
	//   33   65:aload           5
	//   34   67:iload_2         
	//   35   68:aaload          
	//   36   69:astore          6
		int i;
		String s;
		s = field.getName();
	//   37   71:aload           6
	//   38   73:invokevirtual   #148 <Method String Field.getName()>
	//   39   76:astore          7
		i = s.hashCode();
	//   40   78:aload           7
	//   41   80:invokevirtual   #152 <Method int String.hashCode()>
	//   42   83:istore_1        
		if(i == 0xad8d9a2b) goto _L7; else goto _L6
	//   43   84:iload_1         
	//   44   85:ldc1            #153 <Int 0xad8d9a2b>
	//   45   87:icmpeq          156
_L6:
		if(i == 0x1c155) goto _L9; else goto _L8
	//   46   90:iload_1         
	//   47   91:ldc1            #154 <Int 0x1c155>
	//   48   93:icmpeq          141
_L8:
		if(i == 0x32a007) goto _L11; else goto _L10
	//   49   96:iload_1         
	//   50   97:ldc1            #155 <Int 0x32a007>
	//   51   99:icmpeq          126
_L10:
		if(i == 0x677c21c) goto _L13; else goto _L12
	//   52  102:iload_1         
	//   53  103:ldc1            #156 <Int 0x677c21c>
	//   54  105:icmpeq          111
	//*  55  108:goto            250
_L13:
		if(!s.equals("right")) goto _L12; else goto _L14
	//   56  111:aload           7
	//   57  113:ldc1            #158 <String "right">
	//   58  115:invokevirtual   #99  <Method boolean String.equals(Object)>
	//   59  118:ifeq            250
_L14:
		i = 2;
	//   60  121:iconst_2        
	//   61  122:istore_1        
		  goto _L15
	//*  62  123:goto            252
_L11:
		if(!s.equals("left")) goto _L12; else goto _L16
	//   63  126:aload           7
	//   64  128:ldc1            #160 <String "left">
	//   65  130:invokevirtual   #99  <Method boolean String.equals(Object)>
	//   66  133:ifeq            250
_L16:
		i = 0;
	//   67  136:iconst_0        
	//   68  137:istore_1        
		  goto _L15
	//*  69  138:goto            252
_L9:
		if(!s.equals("top")) goto _L12; else goto _L17
	//   70  141:aload           7
	//   71  143:ldc1            #162 <String "top">
	//   72  145:invokevirtual   #99  <Method boolean String.equals(Object)>
	//   73  148:ifeq            250
_L17:
		i = 1;
	//   74  151:iconst_1        
	//   75  152:istore_1        
		  goto _L15
	//*  76  153:goto            252
_L7:
		if(!s.equals("bottom")) goto _L12; else goto _L18
	//   77  156:aload           7
	//   78  158:ldc1            #164 <String "bottom">
	//   79  160:invokevirtual   #99  <Method boolean String.equals(Object)>
	//   80  163:ifeq            250
_L18:
		i = 3;
	//   81  166:iconst_3        
	//   82  167:istore_1        
		  goto _L15
	//*  83  168:goto            252
_L26:
		rect.bottom = field.getInt(((Object) (drawable)));
	//   84  171:aload           4
	//   85  173:aload           6
	//   86  175:aload_0         
	//   87  176:invokevirtual   #168 <Method int Field.getInt(Object)>
	//   88  179:putfield        #170 <Field int Rect.bottom>
		  goto _L19
	//*  89  182:goto            224
_L23:
		rect.right = field.getInt(((Object) (drawable)));
	//   90  185:aload           4
	//   91  187:aload           6
	//   92  189:aload_0         
	//   93  190:invokevirtual   #168 <Method int Field.getInt(Object)>
	//   94  193:putfield        #172 <Field int Rect.right>
		  goto _L19
	//*  95  196:goto            224
_L22:
		rect.top = field.getInt(((Object) (drawable)));
	//   96  199:aload           4
	//   97  201:aload           6
	//   98  203:aload_0         
	//   99  204:invokevirtual   #168 <Method int Field.getInt(Object)>
	//  100  207:putfield        #174 <Field int Rect.top>
		  goto _L19
	//* 101  210:goto            224
_L21:
		rect.left = field.getInt(((Object) (drawable)));
	//  102  213:aload           4
	//  103  215:aload           6
	//  104  217:aload_0         
	//  105  218:invokevirtual   #168 <Method int Field.getInt(Object)>
	//  106  221:putfield        #176 <Field int Rect.left>
_L19:
		j++;
	//  107  224:iload_2         
	//  108  225:iconst_1        
	//  109  226:iadd            
	//  110  227:istore_2        
		continue; /* Loop/switch isn't completed */
	//  111  228:goto            60
_L5:
		return rect;
	//  112  231:aload           4
	//  113  233:areturn         
_L20:
		Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
	//  114  234:ldc1            #178 <String "DrawableUtils">
	//  115  236:ldc1            #180 <String "Couldn't obtain the optical insets. Ignoring.">
	//  116  238:invokestatic    #186 <Method int Log.e(String, String)>
	//  117  241:pop             
_L2:
		return INSETS_NONE;
	//  118  242:getstatic       #24  <Field Rect INSETS_NONE>
	//  119  245:areturn         
		drawable;
	//  120  246:astore_0        
		if(true) goto _L20; else goto _L12
	//  121  247:goto            234
_L12:
		i = -1;
	//  122  250:iconst_m1       
	//  123  251:istore_1        
_L15:
		i;
	//  124  252:iload_1         
		JVM INSTR tableswitch 0 3: default 284
	//	               0 213
	//	               1 199
	//	               2 185
	//	               3 171;
	//  125  253:tableswitch     0 3: default 284
	//	               0 213
	//	               1 199
	//	               2 185
	//	               3 171
		   goto _L19 _L21 _L22 _L23 _L24
_L24:
		if(true) goto _L26; else goto _L25
_L25:
		if(true) goto _L28; else goto _L27
_L27:
	//* 126  284:goto            224
	}

	public static android.graphics.PorterDuff.Mode parseTintMode(int i, android.graphics.PorterDuff.Mode mode)
	{
		if(i != 3)
	//*   0    0:iload_0         
	//*   1    1:iconst_3        
	//*   2    2:icmpeq          66
		{
			if(i != 5)
	//*   3    5:iload_0         
	//*   4    6:iconst_5        
	//*   5    7:icmpeq          62
			{
				if(i != 9)
	//*   6   10:iload_0         
	//*   7   11:bipush          9
	//*   8   13:icmpeq          58
					switch(i)
	//*   9   16:iload_0         
					{
	//*  10   17:tableswitch     14 16: default 44
	//	               14 54
	//	               15 50
	//	               16 46
					default:
						return mode;
	//   11   44:aload_1         
	//   12   45:areturn         

					case 16: // '\020'
						return android.graphics.PorterDuff.Mode.ADD;
	//   13   46:getstatic       #194 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.ADD>
	//   14   49:areturn         

					case 15: // '\017'
						return android.graphics.PorterDuff.Mode.SCREEN;
	//   15   50:getstatic       #197 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SCREEN>
	//   16   53:areturn         

					case 14: // '\016'
						return android.graphics.PorterDuff.Mode.MULTIPLY;
	//   17   54:getstatic       #200 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   18   57:areturn         
					}
				else
					return android.graphics.PorterDuff.Mode.SRC_ATOP;
	//   19   58:getstatic       #203 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_ATOP>
	//   20   61:areturn         
			} else
			{
				return android.graphics.PorterDuff.Mode.SRC_IN;
	//   21   62:getstatic       #206 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   22   65:areturn         
			}
		} else
		{
			return android.graphics.PorterDuff.Mode.SRC_OVER;
	//   23   66:getstatic       #209 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_OVER>
	//   24   69:areturn         
		}
	}

	public static final Rect INSETS_NONE;
	private static Class sInsetsClazz = Class.forName("android.graphics.Insets");

	static 
	{
		INSETS_NONE = new Rect();
	//    0    0:new             #19  <Class Rect>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void Rect()>
	//    3    7:putstatic       #24  <Field Rect INSETS_NONE>
		if(android.os.Build.VERSION.SDK_INT < 18)
			break MISSING_BLOCK_LABEL_26;
	//    4   10:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//    5   13:bipush          18
	//    6   15:icmplt          26
	//    7   18:ldc1            #32  <String "android.graphics.Insets">
	//    8   20:invokestatic    #38  <Method Class Class.forName(String)>
	//    9   23:putstatic       #40  <Field Class sInsetsClazz>
		return;
	//   10   26:return          
		ClassNotFoundException classnotfoundexception;
		classnotfoundexception;
	//   11   27:astore_0        
	//*  12   28:return          
	}
}
