// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.Typeface;
import java.lang.reflect.*;

// Referenced classes of package android.support.v4.graphics:
//			TypefaceCompatApi26Impl

public class TypefaceCompatApi28Impl extends TypefaceCompatApi26Impl
{

	public TypefaceCompatApi28Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void TypefaceCompatApi26Impl()>
	//    2    4:return          
	}

	protected Typeface createFromFamiliesWithDefault(Object obj)
	{
		Object obj1 = Array.newInstance(mFontFamily, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Class mFontFamily>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #43  <Method Object Array.newInstance(Class, int)>
	//    4    8:astore_2        
		Array.set(obj1, 0, obj);
	//    5    9:aload_2         
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:invokestatic    #47  <Method void Array.set(Object, int, Object)>
		obj = ((Object) ((Typeface)mCreateFromFamiliesWithDefault.invoke(((Object) (null)), new Object[] {
			obj1, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1)
		})));
	//    9   15:aload_0         
	//   10   16:getfield        #51  <Field Method mCreateFromFamiliesWithDefault>
	//   11   19:aconst_null     
	//   12   20:iconst_4        
	//   13   21:anewarray       Object[]
	//   14   24:dup             
	//   15   25:iconst_0        
	//   16   26:aload_2         
	//   17   27:aastore         
	//   18   28:dup             
	//   19   29:iconst_1        
	//   20   30:ldc1            #17  <String "sans-serif">
	//   21   32:aastore         
	//   22   33:dup             
	//   23   34:iconst_2        
	//   24   35:iconst_m1       
	//   25   36:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//   26   39:aastore         
	//   27   40:dup             
	//   28   41:iconst_3        
	//   29   42:iconst_m1       
	//   30   43:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//   31   46:aastore         
	//   32   47:invokevirtual   #65  <Method Object Method.invoke(Object, Object[])>
	//   33   50:checkcast       #67  <Class Typeface>
	//   34   53:astore_1        
		return ((Typeface) (obj));
	//   35   54:aload_1         
	//   36   55:areturn         
		obj;
	//   37   56:astore_1        
		break MISSING_BLOCK_LABEL_61;
	//   38   57:goto            61
		obj;
	//   39   60:astore_1        
		throw new RuntimeException(((Throwable) (obj)));
	//   40   61:new             #69  <Class RuntimeException>
	//   41   64:dup             
	//   42   65:aload_1         
	//   43   66:invokespecial   #72  <Method void RuntimeException(Throwable)>
	//   44   69:athrow          
	}

	protected Method obtainCreateFromFamiliesWithDefaultMethod(Class class1)
		throws NoSuchMethodException
	{
		class1 = ((Class) (((Class) (android/graphics/Typeface)).getDeclaredMethod("createFromFamiliesWithDefault", new Class[] {
			Array.newInstance(class1, 1).getClass(), java/lang/String, Integer.TYPE, Integer.TYPE
		})));
	//    0    0:ldc1            #67  <Class Typeface>
	//    1    2:ldc1            #14  <String "createFromFamiliesWithDefault">
	//    2    4:iconst_4        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:invokestatic    #43  <Method Object Array.newInstance(Class, int)>
	//    9   15:invokevirtual   #82  <Method Class Object.getClass()>
	//   10   18:aastore         
	//   11   19:dup             
	//   12   20:iconst_1        
	//   13   21:ldc1            #84  <Class String>
	//   14   23:aastore         
	//   15   24:dup             
	//   16   25:iconst_2        
	//   17   26:getstatic       #87  <Field Class Integer.TYPE>
	//   18   29:aastore         
	//   19   30:dup             
	//   20   31:iconst_3        
	//   21   32:getstatic       #87  <Field Class Integer.TYPE>
	//   22   35:aastore         
	//   23   36:invokevirtual   #91  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   24   39:astore_1        
		((Method) (class1)).setAccessible(true);
	//   25   40:aload_1         
	//   26   41:iconst_1        
	//   27   42:invokevirtual   #95  <Method void Method.setAccessible(boolean)>
		return ((Method) (class1));
	//   28   45:aload_1         
	//   29   46:areturn         
	}

	private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
	private static final String DEFAULT_FAMILY = "sans-serif";
	private static final int RESOLVE_BY_FONT_TABLE = -1;
	private static final String TAG = "TypefaceCompatApi28Impl";
}
