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
	//*  26   55:ifeq            109
		{
			drawable = ((Drawable) (drawable.getConstantState()));
	//   27   58:aload_0         
	//   28   59:invokevirtual   #66  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   29   62:astore_0        
			if(drawable instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState)
	//*  30   63:aload_0         
	//*  31   64:instanceof      #68  <Class android.graphics.drawable.DrawableContainer$DrawableContainerState>
	//*  32   67:ifeq            106
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
	//*  44   85:icmpge          106
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
	//*  57  106:goto            165
		{
			if(drawable instanceof DrawableWrapper)
	//*  58  109:aload_0         
	//*  59  110:instanceof      #76  <Class DrawableWrapper>
	//*  60  113:ifeq            129
				return canSafelyMutateDrawable(((DrawableWrapper)drawable).getWrappedDrawable());
	//   61  116:aload_0         
	//   62  117:checkcast       #76  <Class DrawableWrapper>
	//   63  120:invokeinterface #80  <Method Drawable DrawableWrapper.getWrappedDrawable()>
	//   64  125:invokestatic    #74  <Method boolean canSafelyMutateDrawable(Drawable)>
	//   65  128:ireturn         
			if(drawable instanceof android.support.v7.graphics.drawable.DrawableWrapper)
	//*  66  129:aload_0         
	//*  67  130:instanceof      #82  <Class android.support.v7.graphics.drawable.DrawableWrapper>
	//*  68  133:ifeq            147
				return canSafelyMutateDrawable(((android.support.v7.graphics.drawable.DrawableWrapper)drawable).getWrappedDrawable());
	//   69  136:aload_0         
	//   70  137:checkcast       #82  <Class android.support.v7.graphics.drawable.DrawableWrapper>
	//   71  140:invokevirtual   #83  <Method Drawable android.support.v7.graphics.drawable.DrawableWrapper.getWrappedDrawable()>
	//   72  143:invokestatic    #74  <Method boolean canSafelyMutateDrawable(Drawable)>
	//   73  146:ireturn         
			if(drawable instanceof ScaleDrawable)
	//*  74  147:aload_0         
	//*  75  148:instanceof      #85  <Class ScaleDrawable>
	//*  76  151:ifeq            165
				return canSafelyMutateDrawable(((ScaleDrawable)drawable).getDrawable());
	//   77  154:aload_0         
	//   78  155:checkcast       #85  <Class ScaleDrawable>
	//   79  158:invokevirtual   #88  <Method Drawable ScaleDrawable.getDrawable()>
	//   80  161:invokestatic    #74  <Method boolean canSafelyMutateDrawable(Drawable)>
	//   81  164:ireturn         
		}
		return true;
	//   82  165:iconst_1        
	//   83  166:ireturn         
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
	//*   7   11:ifne            25
			drawable.setState(ThemeUtils.CHECKED_STATE_SET);
	//    8   14:aload_0         
	//    9   15:getstatic       #118 <Field int[] ThemeUtils.CHECKED_STATE_SET>
	//   10   18:invokevirtual   #122 <Method boolean Drawable.setState(int[])>
	//   11   21:pop             
		else
	//*  12   22:goto            33
			drawable.setState(ThemeUtils.EMPTY_STATE_SET);
	//   13   25:aload_0         
	//   14   26:getstatic       #125 <Field int[] ThemeUtils.EMPTY_STATE_SET>
	//   15   29:invokevirtual   #122 <Method boolean Drawable.setState(int[])>
	//   16   32:pop             
		drawable.setState(ai);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #122 <Method boolean Drawable.setState(int[])>
	//   20   38:pop             
	//   21   39:return          
	}

	public static Rect getOpticalBounds(Drawable drawable)
	{
		if(sInsetsClazz == null) goto _L2; else goto _L1
	//    0    0:getstatic       #47  <Field Class sInsetsClazz>
	//    1    3:ifnull          263
_L1:
		drawable = DrawableCompat.unwrap(drawable);
	//    2    6:aload_0         
	//    3    7:invokestatic    #135 <Method Drawable DrawableCompat.unwrap(Drawable)>
	//    4   10:astore_0        
		drawable = ((Drawable) (((Object) (drawable)).getClass().getMethod("getOpticalInsets", new Class[0]).invoke(((Object) (drawable)), new Object[0])));
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
	//   15   32:astore_0        
		if(drawable == null) goto _L2; else goto _L3
	//   16   33:aload_0         
	//   17   34:ifnull          251
_L3:
		int j;
		Rect rect;
		Field afield[];
		rect = new Rect();
	//   18   37:new             #26  <Class Rect>
	//   19   40:dup             
	//   20   41:invokespecial   #29  <Method void Rect()>
	//   21   44:astore          4
		afield = sInsetsClazz.getFields();
	//   22   46:getstatic       #47  <Field Class sInsetsClazz>
	//   23   49:invokevirtual   #151 <Method Field[] Class.getFields()>
	//   24   52:astore          5
		j = afield.length;
	//   25   54:aload           5
	//   26   56:arraylength     
	//   27   57:istore_3        
		int i = 0;
	//   28   58:iconst_0        
	//   29   59:istore_2        
_L12:
		if(i >= j) goto _L5; else goto _L4
	//   30   60:iload_2         
	//   31   61:iload_3         
	//   32   62:icmpge          248
_L4:
		Field field = afield[i];
	//   33   65:aload           5
	//   34   67:iload_2         
	//   35   68:aaload          
	//   36   69:astore          6
		String s = field.getName();
	//   37   71:aload           6
	//   38   73:invokevirtual   #154 <Method String Field.getName()>
	//   39   76:astore          7
		byte byte0 = -1;
	//   40   78:iconst_m1       
	//   41   79:istore_1        
		s.hashCode();
	//   42   80:aload           7
	//   43   82:invokevirtual   #158 <Method int String.hashCode()>
		JVM INSTR lookupswitch 4: default 267
	//	               -1383228885: 173
	//	               115029: 143
	//	               3317767: 128
	//	               108511772: 158;
	//   44   85:lookupswitch    4: default 267
	//	               -1383228885: 173
	//	               115029: 143
	//	               3317767: 128
	//	               108511772: 158
		   goto _L6 _L7 _L8 _L9 _L10
_L9:
		if(s.equals("left"))
	//*  45  128:aload           7
	//*  46  130:ldc1            #160 <String "left">
	//*  47  132:invokevirtual   #105 <Method boolean String.equals(Object)>
	//*  48  135:ifeq            267
			byte0 = 0;
	//   49  138:iconst_0        
	//   50  139:istore_1        
		  goto _L6
	//*  51  140:goto            267
_L8:
		if(s.equals("top"))
	//*  52  143:aload           7
	//*  53  145:ldc1            #162 <String "top">
	//*  54  147:invokevirtual   #105 <Method boolean String.equals(Object)>
	//*  55  150:ifeq            267
			byte0 = 1;
	//   56  153:iconst_1        
	//   57  154:istore_1        
		  goto _L6
	//*  58  155:goto            267
_L10:
		if(s.equals("right"))
	//*  59  158:aload           7
	//*  60  160:ldc1            #164 <String "right">
	//*  61  162:invokevirtual   #105 <Method boolean String.equals(Object)>
	//*  62  165:ifeq            267
			byte0 = 2;
	//   63  168:iconst_2        
	//   64  169:istore_1        
		  goto _L6
	//*  65  170:goto            267
_L7:
		if(s.equals("bottom"))
	//*  66  173:aload           7
	//*  67  175:ldc1            #166 <String "bottom">
	//*  68  177:invokevirtual   #105 <Method boolean String.equals(Object)>
	//*  69  180:ifeq            267
			byte0 = 3;
	//   70  183:iconst_3        
	//   71  184:istore_1        
		  goto _L6
	//*  72  185:goto            267
_L13:
		rect.left = field.getInt(((Object) (drawable)));
	//   73  188:aload           4
	//   74  190:aload           6
	//   75  192:aload_0         
	//   76  193:invokevirtual   #170 <Method int Field.getInt(Object)>
	//   77  196:putfield        #172 <Field int Rect.left>
		  goto _L11
	//*  78  199:goto            241
_L14:
		rect.top = field.getInt(((Object) (drawable)));
	//   79  202:aload           4
	//   80  204:aload           6
	//   81  206:aload_0         
	//   82  207:invokevirtual   #170 <Method int Field.getInt(Object)>
	//   83  210:putfield        #174 <Field int Rect.top>
		  goto _L11
	//*  84  213:goto            241
_L15:
		rect.right = field.getInt(((Object) (drawable)));
	//   85  216:aload           4
	//   86  218:aload           6
	//   87  220:aload_0         
	//   88  221:invokevirtual   #170 <Method int Field.getInt(Object)>
	//   89  224:putfield        #176 <Field int Rect.right>
		  goto _L11
	//*  90  227:goto            241
_L16:
		rect.bottom = field.getInt(((Object) (drawable)));
	//   91  230:aload           4
	//   92  232:aload           6
	//   93  234:aload_0         
	//   94  235:invokevirtual   #170 <Method int Field.getInt(Object)>
	//   95  238:putfield        #178 <Field int Rect.bottom>
_L11:
		i++;
	//   96  241:iload_2         
	//   97  242:iconst_1        
	//   98  243:iadd            
	//   99  244:istore_2        
		  goto _L12
	//* 100  245:goto            60
_L5:
		return rect;
	//  101  248:aload           4
	//  102  250:areturn         
	//* 103  251:goto            263
		drawable;
	//  104  254:astore_0        
		Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
	//  105  255:ldc1            #14  <String "DrawableUtils">
	//  106  257:ldc1            #180 <String "Couldn't obtain the optical insets. Ignoring.">
	//  107  259:invokestatic    #186 <Method int Log.e(String, String)>
	//  108  262:pop             
_L2:
		return INSETS_NONE;
	//  109  263:getstatic       #31  <Field Rect INSETS_NONE>
	//  110  266:areturn         
_L6:
		byte0;
	//  111  267:iload_1         
		JVM INSTR tableswitch 0 3: default 300
	//	               0 188
	//	               1 202
	//	               2 216
	//	               3 230;
	//  112  268:tableswitch     0 3: default 300
	//	               0 188
	//	               1 202
	//	               2 216
	//	               3 230
		   goto _L11 _L13 _L14 _L15 _L16
	//* 113  300:goto            241
	}

	static android.graphics.PorterDuff.Mode parseTintMode(int i, android.graphics.PorterDuff.Mode mode)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     3 16: default 72
	//	               3 74
	//	               4 110
	//	               5 78
	//	               6 110
	//	               7 110
	//	               8 110
	//	               9 82
	//	               10 110
	//	               11 110
	//	               12 110
	//	               13 110
	//	               14 86
	//	               15 90
	//	               16 94
		default:
			return mode;
	//    2   72:aload_1         
	//    3   73:areturn         

		case 3: // '\003'
			return android.graphics.PorterDuff.Mode.SRC_OVER;
	//    4   74:getstatic       #194 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_OVER>
	//    5   77:areturn         

		case 5: // '\005'
			return android.graphics.PorterDuff.Mode.SRC_IN;
	//    6   78:getstatic       #197 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    7   81:areturn         

		case 9: // '\t'
			return android.graphics.PorterDuff.Mode.SRC_ATOP;
	//    8   82:getstatic       #200 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_ATOP>
	//    9   85:areturn         

		case 14: // '\016'
			return android.graphics.PorterDuff.Mode.MULTIPLY;
	//   10   86:getstatic       #203 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   11   89:areturn         

		case 15: // '\017'
			return android.graphics.PorterDuff.Mode.SCREEN;
	//   12   90:getstatic       #206 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SCREEN>
	//   13   93:areturn         

		case 16: // '\020'
			if(android.os.Build.VERSION.SDK_INT >= 11)
	//*  14   94:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   97:bipush          11
	//*  16   99:icmplt          108
				return android.graphics.PorterDuff.Mode.valueOf("ADD");
	//   17  102:ldc1            #208 <String "ADD">
	//   18  104:invokestatic    #212 <Method android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.valueOf(String)>
	//   19  107:areturn         
			else
				return mode;
	//   20  108:aload_1         
	//   21  109:areturn         

		case 4: // '\004'
		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
		case 10: // '\n'
		case 11: // '\013'
		case 12: // '\f'
		case 13: // '\r'
			return mode;
	//   22  110:aload_1         
	//   23  111:areturn         
		}
	}

	public static final Rect INSETS_NONE = new Rect();
	private static final String TAG = "DrawableUtils";
	private static final String VECTOR_DRAWABLE_CLAZZ_NAME = "android.graphics.drawable.VectorDrawable";
	private static Class sInsetsClazz;

	static 
	{
	//    0    0:new             #26  <Class Rect>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void Rect()>
	//    3    7:putstatic       #31  <Field Rect INSETS_NONE>
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   4   10:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   13:bipush          18
	//*   6   15:icmplt          28
			try
			{
				sInsetsClazz = Class.forName("android.graphics.Insets");
	//    7   18:ldc1            #39  <String "android.graphics.Insets">
	//    8   20:invokestatic    #45  <Method Class Class.forName(String)>
	//    9   23:putstatic       #47  <Field Class sInsetsClazz>
	//   10   26:return          
			}
			catch(ClassNotFoundException classnotfoundexception) { }
	//   11   27:astore_0        
	//*  12   28:return          
	}
}
