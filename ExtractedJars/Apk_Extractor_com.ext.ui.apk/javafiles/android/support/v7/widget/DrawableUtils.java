// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.graphics.drawable.DrawableWrapper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.widget:
//			ThemeUtils

public class DrawableUtils
{

	private DrawableUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
	//    2    4:return          
	}

	public static boolean canSafelyMutateDrawable(Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable))
	//*   0    0:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          15
	//*   2    5:icmpge          17
	//*   3    8:aload_0         
	//*   4    9:instanceof      #54  <Class InsetDrawable>
	//*   5   12:ifeq            17
			return false;
	//    6   15:iconst_0        
	//    7   16:ireturn         
		if(android.os.Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable))
	//*   8   17:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   20:bipush          15
	//*  10   22:icmpge          34
	//*  11   25:aload_0         
	//*  12   26:instanceof      #56  <Class GradientDrawable>
	//*  13   29:ifeq            34
			return false;
	//   14   32:iconst_0        
	//   15   33:ireturn         
		if(android.os.Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable))
	//*  16   34:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   37:bipush          17
	//*  18   39:icmpge          51
	//*  19   42:aload_0         
	//*  20   43:instanceof      #58  <Class LayerDrawable>
	//*  21   46:ifeq            51
			return false;
	//   22   49:iconst_0        
	//   23   50:ireturn         
		if(drawable instanceof DrawableContainer)
	//*  24   51:aload_0         
	//*  25   52:instanceof      #60  <Class DrawableContainer>
	//*  26   55:ifeq            106
		{
			drawable = ((Drawable) (drawable.getConstantState()));
	//   27   58:aload_0         
	//   28   59:invokevirtual   #66  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   29   62:astore_0        
			if(drawable instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState)
	//*  30   63:aload_0         
	//*  31   64:instanceof      #68  <Class android.graphics.drawable.DrawableContainer$DrawableContainerState>
	//*  32   67:ifeq            162
			{
				drawable = ((Drawable) (((android.graphics.drawable.DrawableContainer.DrawableContainerState)drawable).getChildren()));
	//   33   70:aload_0         
	//   34   71:checkcast       #68  <Class android.graphics.drawable.DrawableContainer$DrawableContainerState>
	//   35   74:invokevirtual   #72  <Method Drawable[] android.graphics.drawable.DrawableContainer$DrawableContainerState.getChildren()>
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
	//*  48   91:invokestatic    #74  <Method boolean canSafelyMutateDrawable(Drawable)>
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
			if(drawable instanceof DrawableWrapper)
	//*  57  106:aload_0         
	//*  58  107:instanceof      #76  <Class DrawableWrapper>
	//*  59  110:ifeq            126
				return canSafelyMutateDrawable(((DrawableWrapper)drawable).getWrappedDrawable());
	//   60  113:aload_0         
	//   61  114:checkcast       #76  <Class DrawableWrapper>
	//   62  117:invokeinterface #80  <Method Drawable DrawableWrapper.getWrappedDrawable()>
	//   63  122:invokestatic    #74  <Method boolean canSafelyMutateDrawable(Drawable)>
	//   64  125:ireturn         
			if(drawable instanceof android.support.v7.graphics.drawable.DrawableWrapper)
	//*  65  126:aload_0         
	//*  66  127:instanceof      #82  <Class android.support.v7.graphics.drawable.DrawableWrapper>
	//*  67  130:ifeq            144
				return canSafelyMutateDrawable(((android.support.v7.graphics.drawable.DrawableWrapper)drawable).getWrappedDrawable());
	//   68  133:aload_0         
	//   69  134:checkcast       #82  <Class android.support.v7.graphics.drawable.DrawableWrapper>
	//   70  137:invokevirtual   #83  <Method Drawable android.support.v7.graphics.drawable.DrawableWrapper.getWrappedDrawable()>
	//   71  140:invokestatic    #74  <Method boolean canSafelyMutateDrawable(Drawable)>
	//   72  143:ireturn         
			if(drawable instanceof ScaleDrawable)
	//*  73  144:aload_0         
	//*  74  145:instanceof      #85  <Class ScaleDrawable>
	//*  75  148:ifeq            162
				return canSafelyMutateDrawable(((ScaleDrawable)drawable).getDrawable());
	//   76  151:aload_0         
	//   77  152:checkcast       #85  <Class ScaleDrawable>
	//   78  155:invokevirtual   #88  <Method Drawable ScaleDrawable.getDrawable()>
	//   79  158:invokestatic    #74  <Method boolean canSafelyMutateDrawable(Drawable)>
	//   80  161:ireturn         
		}
		return true;
	//   81  162:iconst_1        
	//   82  163:ireturn         
	}

	static void fixDrawable(Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(((Object) (((Object) (drawable)).getClass().getName()))))
	//*   0    0:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpne          27
	//*   3    8:ldc1            #17  <String "android.graphics.drawable.VectorDrawable">
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #95  <Method Class Object.getClass()>
	//*   6   14:invokevirtual   #99  <Method String Class.getName()>
	//*   7   17:invokevirtual   #105 <Method boolean String.equals(Object)>
	//*   8   20:ifeq            27
			fixVectorDrawableTinting(drawable);
	//    9   23:aload_0         
	//   10   24:invokestatic    #108 <Method void fixVectorDrawableTinting(Drawable)>
	//   11   27:return          
	}

	private static void fixVectorDrawableTinting(Drawable drawable)
	{
		int ai[] = drawable.getState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int[] Drawable.getState()>
	//    2    4:astore_1        
		if(ai == null || ai.length == 0)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:ifne            29
			drawable.setState(ThemeUtils.CHECKED_STATE_SET);
	//    8   14:aload_0         
	//    9   15:getstatic       #118 <Field int[] ThemeUtils.CHECKED_STATE_SET>
	//   10   18:invokevirtual   #122 <Method boolean Drawable.setState(int[])>
	//   11   21:pop             
		else
	//*  12   22:aload_0         
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #122 <Method boolean Drawable.setState(int[])>
	//*  15   27:pop             
	//*  16   28:return          
			drawable.setState(ThemeUtils.EMPTY_STATE_SET);
	//   17   29:aload_0         
	//   18   30:getstatic       #125 <Field int[] ThemeUtils.EMPTY_STATE_SET>
	//   19   33:invokevirtual   #122 <Method boolean Drawable.setState(int[])>
	//   20   36:pop             
		drawable.setState(ai);
	//*  21   37:goto            22
	}

	public static Rect getOpticalBounds(Drawable drawable)
	{
		if(sInsetsClazz == null) goto _L2; else goto _L1
	//    0    0:getstatic       #47  <Field Class sInsetsClazz>
	//    1    3:ifnull          215
_L1:
		Object obj;
		drawable = DrawableCompat.unwrap(drawable);
	//    2    6:aload_0         
	//    3    7:invokestatic    #135 <Method Drawable DrawableCompat.unwrap(Drawable)>
	//    4   10:astore_0        
		obj = ((Object) (drawable)).getClass().getMethod("getOpticalInsets", new Class[0]).invoke(((Object) (drawable)), new Object[0]);
	//    5   11:aload_0         
	//    6   12:invokevirtual   #95  <Method Class Object.getClass()>
	//    7   15:ldc1            #137 <String "getOpticalInsets">
	//    8   17:iconst_0        
	//    9   18:anewarray       Class[]
	//   10   21:invokevirtual   #141 <Method Method Class.getMethod(String, Class[])>
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:anewarray       Object[]
	//   14   29:invokevirtual   #147 <Method Object Method.invoke(Object, Object[])>
	//   15   32:astore          5
		if(obj == null) goto _L2; else goto _L3
	//   16   34:aload           5
	//   17   36:ifnull          215
_L3:
		int j;
		Rect rect;
		Field afield[];
		rect = new Rect();
	//   18   39:new             #26  <Class Rect>
	//   19   42:dup             
	//   20   43:invokespecial   #29  <Method void Rect()>
	//   21   46:astore          4
		afield = sInsetsClazz.getFields();
	//   22   48:getstatic       #47  <Field Class sInsetsClazz>
	//   23   51:invokevirtual   #151 <Method Field[] Class.getFields()>
	//   24   54:astore          6
		j = afield.length;
	//   25   56:aload           6
	//   26   58:arraylength     
	//   27   59:istore_3        
		int i = 0;
	//   28   60:iconst_0        
	//   29   61:istore_2        
_L17:
		drawable = ((Drawable) (rect));
	//   30   62:aload           4
	//   31   64:astore_0        
		if(i >= j) goto _L5; else goto _L4
	//   32   65:iload_2         
	//   33   66:iload_3         
	//   34   67:icmpge          219
_L4:
		drawable = ((Drawable) (afield[i]));
	//   35   70:aload           6
	//   36   72:iload_2         
	//   37   73:aaload          
	//   38   74:astore_0        
		String s = ((Field) (drawable)).getName();
	//   39   75:aload_0         
	//   40   76:invokevirtual   #154 <Method String Field.getName()>
	//   41   79:astore          7
		byte byte0 = -1;
	//   42   81:iconst_m1       
	//   43   82:istore_1        
		s.hashCode();
	//   44   83:aload           7
	//   45   85:invokevirtual   #158 <Method int String.hashCode()>
		JVM INSTR lookupswitch 4: default 263
	//	               -1383228885: 177
	//	               115029: 147
	//	               3317767: 132
	//	               108511772: 162;
	//   46   88:lookupswitch    4: default 263
	//	               -1383228885: 177
	//	               115029: 147
	//	               3317767: 132
	//	               108511772: 162
		   goto _L6 _L7 _L8 _L9 _L10
_L9:
		if(s.equals("left"))
	//*  47  132:aload           7
	//*  48  134:ldc1            #160 <String "left">
	//*  49  136:invokevirtual   #105 <Method boolean String.equals(Object)>
	//*  50  139:ifeq            263
			byte0 = 0;
	//   51  142:iconst_0        
	//   52  143:istore_1        
		  goto _L6
	//*  53  144:goto            263
_L8:
		if(s.equals("top"))
	//*  54  147:aload           7
	//*  55  149:ldc1            #162 <String "top">
	//*  56  151:invokevirtual   #105 <Method boolean String.equals(Object)>
	//*  57  154:ifeq            263
			byte0 = 1;
	//   58  157:iconst_1        
	//   59  158:istore_1        
		  goto _L6
	//*  60  159:goto            263
_L10:
		if(s.equals("right"))
	//*  61  162:aload           7
	//*  62  164:ldc1            #164 <String "right">
	//*  63  166:invokevirtual   #105 <Method boolean String.equals(Object)>
	//*  64  169:ifeq            263
			byte0 = 2;
	//   65  172:iconst_2        
	//   66  173:istore_1        
		  goto _L6
	//*  67  174:goto            263
_L7:
		if(s.equals("bottom"))
	//*  68  177:aload           7
	//*  69  179:ldc1            #166 <String "bottom">
	//*  70  181:invokevirtual   #105 <Method boolean String.equals(Object)>
	//*  71  184:ifeq            263
			byte0 = 3;
	//   72  187:iconst_3        
	//   73  188:istore_1        
		  goto _L6
	//*  74  189:goto            263
_L12:
		rect.left = ((Field) (drawable)).getInt(obj);
	//   75  192:aload           4
	//   76  194:aload_0         
	//   77  195:aload           5
	//   78  197:invokevirtual   #170 <Method int Field.getInt(Object)>
	//   79  200:putfield        #172 <Field int Rect.left>
		  goto _L11
	//*  80  203:goto            296
		drawable;
	//   81  206:astore_0        
		Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
	//   82  207:ldc1            #14  <String "DrawableUtils">
	//   83  209:ldc1            #174 <String "Couldn't obtain the optical insets. Ignoring.">
	//   84  211:invokestatic    #180 <Method int Log.e(String, String)>
	//   85  214:pop             
_L2:
		drawable = ((Drawable) (INSETS_NONE));
	//   86  215:getstatic       #31  <Field Rect INSETS_NONE>
	//   87  218:astore_0        
_L5:
		return ((Rect) (drawable));
	//   88  219:aload_0         
	//   89  220:areturn         
_L13:
		rect.top = ((Field) (drawable)).getInt(obj);
	//   90  221:aload           4
	//   91  223:aload_0         
	//   92  224:aload           5
	//   93  226:invokevirtual   #170 <Method int Field.getInt(Object)>
	//   94  229:putfield        #182 <Field int Rect.top>
		  goto _L11
	//*  95  232:goto            296
_L14:
		rect.right = ((Field) (drawable)).getInt(obj);
	//   96  235:aload           4
	//   97  237:aload_0         
	//   98  238:aload           5
	//   99  240:invokevirtual   #170 <Method int Field.getInt(Object)>
	//  100  243:putfield        #184 <Field int Rect.right>
		  goto _L11
	//* 101  246:goto            296
_L15:
		rect.bottom = ((Field) (drawable)).getInt(obj);
	//  102  249:aload           4
	//  103  251:aload_0         
	//  104  252:aload           5
	//  105  254:invokevirtual   #170 <Method int Field.getInt(Object)>
	//  106  257:putfield        #186 <Field int Rect.bottom>
		  goto _L11
	//* 107  260:goto            296
_L6:
		byte0;
	//  108  263:iload_1         
		JVM INSTR tableswitch 0 3: default 296
	//	               0 192
	//	               1 221
	//	               2 235
	//	               3 249;
	//  109  264:tableswitch     0 3: default 296
	//	               0 192
	//	               1 221
	//	               2 235
	//	               3 249
		   goto _L11 _L12 _L13 _L14 _L15
_L11:
		i++;
	//  110  296:iload_2         
	//  111  297:iconst_1        
	//  112  298:iadd            
	//  113  299:istore_2        
		if(true) goto _L17; else goto _L16
	//  114  300:goto            62
_L16:
	}

	public static android.graphics.PorterDuff.Mode parseTintMode(int i, android.graphics.PorterDuff.Mode mode)
	{
		i;
	//    0    0:iload_0         
		JVM INSTR tableswitch 3 16: default 72
	//	               3 74
	//	               4 72
	//	               5 78
	//	               6 72
	//	               7 72
	//	               8 72
	//	               9 82
	//	               10 72
	//	               11 72
	//	               12 72
	//	               13 72
	//	               14 86
	//	               15 90
	//	               16 94;
	//    1    1:tableswitch     3 16: default 72
	//	               3 74
	//	               4 72
	//	               5 78
	//	               6 72
	//	               7 72
	//	               8 72
	//	               9 82
	//	               10 72
	//	               11 72
	//	               12 72
	//	               13 72
	//	               14 86
	//	               15 90
	//	               16 94
		   goto _L1 _L2 _L1 _L3 _L1 _L1 _L1 _L4 _L1 _L1 _L1 _L1 _L5 _L6 _L7
_L1:
		return mode;
	//    2   72:aload_1         
	//    3   73:areturn         
_L2:
		return android.graphics.PorterDuff.Mode.SRC_OVER;
	//    4   74:getstatic       #194 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_OVER>
	//    5   77:areturn         
_L3:
		return android.graphics.PorterDuff.Mode.SRC_IN;
	//    6   78:getstatic       #197 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    7   81:areturn         
_L4:
		return android.graphics.PorterDuff.Mode.SRC_ATOP;
	//    8   82:getstatic       #200 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_ATOP>
	//    9   85:areturn         
_L5:
		return android.graphics.PorterDuff.Mode.MULTIPLY;
	//   10   86:getstatic       #203 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   11   89:areturn         
_L6:
		return android.graphics.PorterDuff.Mode.SCREEN;
	//   12   90:getstatic       #206 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SCREEN>
	//   13   93:areturn         
_L7:
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*  14   94:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   97:bipush          11
	//*  16   99:icmplt          72
			return android.graphics.PorterDuff.Mode.valueOf("ADD");
	//   17  102:ldc1            #208 <String "ADD">
	//   18  104:invokestatic    #212 <Method android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.valueOf(String)>
	//   19  107:areturn         
		if(true) goto _L1; else goto _L8
_L8:
	}

	public static final Rect INSETS_NONE;
	private static final String TAG = "DrawableUtils";
	private static final String VECTOR_DRAWABLE_CLAZZ_NAME = "android.graphics.drawable.VectorDrawable";
	private static Class sInsetsClazz = Class.forName("android.graphics.Insets");

	static 
	{
		INSETS_NONE = new Rect();
	//    0    0:new             #26  <Class Rect>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void Rect()>
	//    3    7:putstatic       #31  <Field Rect INSETS_NONE>
		if(android.os.Build.VERSION.SDK_INT < 18)
			break MISSING_BLOCK_LABEL_26;
	//    4   10:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//    5   13:bipush          18
	//    6   15:icmplt          26
	//    7   18:ldc1            #39  <String "android.graphics.Insets">
	//    8   20:invokestatic    #45  <Method Class Class.forName(String)>
	//    9   23:putstatic       #47  <Field Class sInsetsClazz>
		return;
	//   10   26:return          
		ClassNotFoundException classnotfoundexception;
		classnotfoundexception;
	//   11   27:astore_0        
	//*  12   28:return          
	}
}
