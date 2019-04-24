// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import java.lang.reflect.*;
import java.nio.ByteBuffer;
import java.util.List;

// Referenced classes of package android.support.v4.graphics:
//			TypefaceCompatBaseImpl, TypefaceCompatUtil

class TypefaceCompatApi24Impl extends TypefaceCompatBaseImpl
{

	TypefaceCompatApi24Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void TypefaceCompatBaseImpl()>
	//    2    4:return          
	}

	private static boolean addFontWeightStyle(Object obj, ByteBuffer bytebuffer, int i, int j, boolean flag)
	{
		try
		{
			flag = ((Boolean)sAddFontWeightStyle.invoke(obj, new Object[] {
				bytebuffer, Integer.valueOf(i), null, Integer.valueOf(j), Boolean.valueOf(flag)
			})).booleanValue();
	//    0    0:getstatic       #92  <Field Method sAddFontWeightStyle>
	//    1    3:aload_0         
	//    2    4:iconst_5        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:dup             
	//    9   13:iconst_1        
	//   10   14:iload_2         
	//   11   15:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   12   18:aastore         
	//   13   19:dup             
	//   14   20:iconst_2        
	//   15   21:aconst_null     
	//   16   22:aastore         
	//   17   23:dup             
	//   18   24:iconst_3        
	//   19   25:iload_3         
	//   20   26:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_4        
	//   24   32:iload           4
	//   25   34:invokestatic    #110 <Method Boolean Boolean.valueOf(boolean)>
	//   26   37:aastore         
	//   27   38:invokevirtual   #116 <Method Object Method.invoke(Object, Object[])>
	//   28   41:checkcast       #57  <Class Boolean>
	//   29   44:invokevirtual   #120 <Method boolean Boolean.booleanValue()>
	//   30   47:istore          4
		}
	//*  31   49:iload           4
	//*  32   51:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  33   52:astore_0        
		{
			throw new RuntimeException(((Throwable) (obj)));
	//   34   53:new             #122 <Class RuntimeException>
	//   35   56:dup             
	//   36   57:aload_0         
	//   37   58:invokespecial   #125 <Method void RuntimeException(Throwable)>
	//   38   61:athrow          
		}
		return flag;
	}

	private static Typeface createFromFamiliesWithDefault(Object obj)
	{
		try
		{
			Object obj1 = Array.newInstance(sFontFamily, 1);
	//    0    0:getstatic       #90  <Field Class sFontFamily>
	//    1    3:iconst_1        
	//    2    4:invokestatic    #70  <Method Object Array.newInstance(Class, int)>
	//    3    7:astore_1        
			Array.set(obj1, 0, obj);
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:invokestatic    #130 <Method void Array.set(Object, int, Object)>
			obj = ((Object) ((Typeface)sCreateFromFamiliesWithDefault.invoke(((Object) (null)), new Object[] {
				obj1
			})));
	//    8   14:getstatic       #94  <Field Method sCreateFromFamiliesWithDefault>
	//    9   17:aconst_null     
	//   10   18:iconst_1        
	//   11   19:anewarray       Object[]
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:aload_1         
	//   15   25:aastore         
	//   16   26:invokevirtual   #116 <Method Object Method.invoke(Object, Object[])>
	//   17   29:checkcast       #64  <Class Typeface>
	//   18   32:astore_0        
		}
	//*  19   33:aload_0         
	//*  20   34:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  21   35:astore_0        
		{
			throw new RuntimeException(((Throwable) (obj)));
	//   22   36:new             #122 <Class RuntimeException>
	//   23   39:dup             
	//   24   40:aload_0         
	//   25   41:invokespecial   #125 <Method void RuntimeException(Throwable)>
	//   26   44:athrow          
		}
		return ((Typeface) (obj));
	}

	public static boolean isUsable()
	{
		if(sAddFontWeightStyle == null)
	//*   0    0:getstatic       #92  <Field Method sAddFontWeightStyle>
	//*   1    3:ifnonnull       14
			Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
	//    2    6:ldc1            #23  <String "TypefaceCompatApi24Impl">
	//    3    8:ldc1            #133 <String "Unable to collect necessary private methods.Fallback to legacy implementation.">
	//    4   10:invokestatic    #137 <Method int Log.w(String, String)>
	//    5   13:pop             
		return sAddFontWeightStyle != null;
	//    6   14:getstatic       #92  <Field Method sAddFontWeightStyle>
	//    7   17:ifnull          22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private static Object newFamily()
	{
		Object obj;
		try
		{
			obj = sFontFamilyCtor.newInstance(new Object[0]);
	//    0    0:getstatic       #88  <Field Constructor sFontFamilyCtor>
	//    1    3:iconst_0        
	//    2    4:anewarray       Object[]
	//    3    7:invokevirtual   #146 <Method Object Constructor.newInstance(Object[])>
	//    4   10:astore_0        
		}
	//*   5   11:aload_0         
	//*   6   12:areturn         
		catch(Object obj1)
	//*   7   13:astore_0        
		{
			throw new RuntimeException(((Throwable) (obj1)));
	//    8   14:new             #122 <Class RuntimeException>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #125 <Method void RuntimeException(Throwable)>
	//   12   22:athrow          
		}
		return obj;
	}

	public Typeface createFromFontFamilyFilesResourceEntry(Context context, android.support.v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontfamilyfilesresourceentry, Resources resources, int i)
	{
		Object obj = newFamily();
	//    0    0:invokestatic    #150 <Method Object newFamily()>
	//    1    3:astore          6
		fontfamilyfilesresourceentry = ((android.support.v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry) (fontfamilyfilesresourceentry.getEntries()));
	//    2    5:aload_2         
	//    3    6:invokevirtual   #156 <Method android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry[] android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry.getEntries()>
	//    4    9:astore_2        
		int j = fontfamilyfilesresourceentry.length;
	//    5   10:aload_2         
	//    6   11:arraylength     
	//    7   12:istore          5
		for(i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore          4
	//*  10   17:iload           4
	//*  11   19:iload           5
	//*  12   21:icmpge          81
		{
			android.support.v4.content.res.FontResourcesParserCompat.FontFileResourceEntry fontfileresourceentry = ((android.support.v4.content.res.FontResourcesParserCompat.FontFileResourceEntry) (fontfamilyfilesresourceentry[i]));
	//   13   24:aload_2         
	//   14   25:iload           4
	//   15   27:aaload          
	//   16   28:astore          7
			ByteBuffer bytebuffer = TypefaceCompatUtil.copyToDirectBuffer(context, resources, fontfileresourceentry.getResourceId());
	//   17   30:aload_1         
	//   18   31:aload_3         
	//   19   32:aload           7
	//   20   34:invokevirtual   #162 <Method int android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.getResourceId()>
	//   21   37:invokestatic    #168 <Method ByteBuffer TypefaceCompatUtil.copyToDirectBuffer(Context, Resources, int)>
	//   22   40:astore          8
			if(bytebuffer == null)
	//*  23   42:aload           8
	//*  24   44:ifnonnull       49
				return null;
	//   25   47:aconst_null     
	//   26   48:areturn         
			if(!addFontWeightStyle(obj, bytebuffer, 0, fontfileresourceentry.getWeight(), fontfileresourceentry.isItalic()))
	//*  27   49:aload           6
	//*  28   51:aload           8
	//*  29   53:iconst_0        
	//*  30   54:aload           7
	//*  31   56:invokevirtual   #171 <Method int android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.getWeight()>
	//*  32   59:aload           7
	//*  33   61:invokevirtual   #174 <Method boolean android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.isItalic()>
	//*  34   64:invokestatic    #176 <Method boolean addFontWeightStyle(Object, ByteBuffer, int, int, boolean)>
	//*  35   67:ifne            72
				return null;
	//   36   70:aconst_null     
	//   37   71:areturn         
		}

	//   38   72:iload           4
	//   39   74:iconst_1        
	//   40   75:iadd            
	//   41   76:istore          4
	//*  42   78:goto            17
		return createFromFamiliesWithDefault(obj);
	//   43   81:aload           6
	//   44   83:invokestatic    #178 <Method Typeface createFromFamiliesWithDefault(Object)>
	//   45   86:areturn         
	}

	public Typeface createFromFontInfo(Context context, CancellationSignal cancellationsignal, android.support.v4.provider.FontsContractCompat.FontInfo afontinfo[], int i)
	{
		Object obj = newFamily();
	//    0    0:invokestatic    #150 <Method Object newFamily()>
	//    1    3:astore          9
		SimpleArrayMap simplearraymap = new SimpleArrayMap();
	//    2    5:new             #184 <Class SimpleArrayMap>
	//    3    8:dup             
	//    4    9:invokespecial   #185 <Method void SimpleArrayMap()>
	//    5   12:astore          10
		int j = 0;
	//    6   14:iconst_0        
	//    7   15:istore          5
		for(int k = afontinfo.length; j < k; j++)
	//*   8   17:aload_3         
	//*   9   18:arraylength     
	//*  10   19:istore          6
	//*  11   21:iload           5
	//*  12   23:iload           6
	//*  13   25:icmpge          117
		{
			android.support.v4.provider.FontsContractCompat.FontInfo fontinfo = afontinfo[j];
	//   14   28:aload_3         
	//   15   29:iload           5
	//   16   31:aaload          
	//   17   32:astore          11
			android.net.Uri uri = fontinfo.getUri();
	//   18   34:aload           11
	//   19   36:invokevirtual   #191 <Method android.net.Uri android.support.v4.provider.FontsContractCompat$FontInfo.getUri()>
	//   20   39:astore          12
			ByteBuffer bytebuffer1 = (ByteBuffer)simplearraymap.get(((Object) (uri)));
	//   21   41:aload           10
	//   22   43:aload           12
	//   23   45:invokevirtual   #195 <Method Object SimpleArrayMap.get(Object)>
	//   24   48:checkcast       #48  <Class ByteBuffer>
	//   25   51:astore          8
			ByteBuffer bytebuffer = bytebuffer1;
	//   26   53:aload           8
	//   27   55:astore          7
			if(bytebuffer1 == null)
	//*  28   57:aload           8
	//*  29   59:ifnonnull       81
			{
				bytebuffer = TypefaceCompatUtil.mmap(context, cancellationsignal, uri);
	//   30   62:aload_1         
	//   31   63:aload_2         
	//   32   64:aload           12
	//   33   66:invokestatic    #199 <Method ByteBuffer TypefaceCompatUtil.mmap(Context, CancellationSignal, android.net.Uri)>
	//   34   69:astore          7
				simplearraymap.put(((Object) (uri)), ((Object) (bytebuffer)));
	//   35   71:aload           10
	//   36   73:aload           12
	//   37   75:aload           7
	//   38   77:invokevirtual   #203 <Method Object SimpleArrayMap.put(Object, Object)>
	//   39   80:pop             
			}
			if(!addFontWeightStyle(obj, bytebuffer, fontinfo.getTtcIndex(), fontinfo.getWeight(), fontinfo.isItalic()))
	//*  40   81:aload           9
	//*  41   83:aload           7
	//*  42   85:aload           11
	//*  43   87:invokevirtual   #206 <Method int android.support.v4.provider.FontsContractCompat$FontInfo.getTtcIndex()>
	//*  44   90:aload           11
	//*  45   92:invokevirtual   #207 <Method int android.support.v4.provider.FontsContractCompat$FontInfo.getWeight()>
	//*  46   95:aload           11
	//*  47   97:invokevirtual   #208 <Method boolean android.support.v4.provider.FontsContractCompat$FontInfo.isItalic()>
	//*  48  100:invokestatic    #176 <Method boolean addFontWeightStyle(Object, ByteBuffer, int, int, boolean)>
	//*  49  103:ifne            108
				return null;
	//   50  106:aconst_null     
	//   51  107:areturn         
		}

	//   52  108:iload           5
	//   53  110:iconst_1        
	//   54  111:iadd            
	//   55  112:istore          5
	//*  56  114:goto            21
		return Typeface.create(createFromFamiliesWithDefault(obj), i);
	//   57  117:aload           9
	//   58  119:invokestatic    #178 <Method Typeface createFromFamiliesWithDefault(Object)>
	//   59  122:iload           4
	//   60  124:invokestatic    #212 <Method Typeface Typeface.create(Typeface, int)>
	//   61  127:areturn         
	}

	private static final String ADD_FONT_WEIGHT_STYLE_METHOD = "addFontWeightStyle";
	private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
	private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
	private static final String TAG = "TypefaceCompatApi24Impl";
	private static final Method sAddFontWeightStyle;
	private static final Method sCreateFromFamiliesWithDefault;
	private static final Class sFontFamily;
	private static final Constructor sFontFamilyCtor;

	static 
	{
		Object obj3 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		Object obj;
		Class class1;
		Object obj1;
		Object obj2;
		try
		{
			class1 = Class.forName("android.graphics.FontFamily");
	//    2    3:ldc1            #20  <String "android.graphics.FontFamily">
	//    3    5:invokestatic    #42  <Method Class Class.forName(String)>
	//    4    8:astore_1        
			obj = ((Object) (class1.getConstructor(new Class[0])));
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:anewarray       Class[]
	//    8   14:invokevirtual   #46  <Method Constructor Class.getConstructor(Class[])>
	//    9   17:astore_0        
			obj2 = ((Object) (class1.getMethod("addFontWeightStyle", new Class[] {
				java/nio/ByteBuffer, Integer.TYPE, java/util/List, Integer.TYPE, Boolean.TYPE
			})));
	//   10   18:aload_1         
	//   11   19:ldc1            #14  <String "addFontWeightStyle">
	//   12   21:iconst_5        
	//   13   22:anewarray       Class[]
	//   14   25:dup             
	//   15   26:iconst_0        
	//   16   27:ldc1            #48  <Class ByteBuffer>
	//   17   29:aastore         
	//   18   30:dup             
	//   19   31:iconst_1        
	//   20   32:getstatic       #53  <Field Class Integer.TYPE>
	//   21   35:aastore         
	//   22   36:dup             
	//   23   37:iconst_2        
	//   24   38:ldc1            #55  <Class List>
	//   25   40:aastore         
	//   26   41:dup             
	//   27   42:iconst_3        
	//   28   43:getstatic       #53  <Field Class Integer.TYPE>
	//   29   46:aastore         
	//   30   47:dup             
	//   31   48:iconst_4        
	//   32   49:getstatic       #58  <Field Class Boolean.TYPE>
	//   33   52:aastore         
	//   34   53:invokevirtual   #62  <Method Method Class.getMethod(String, Class[])>
	//   35   56:astore_3        
			obj1 = ((Object) (((Class) (android/graphics/Typeface)).getMethod("createFromFamiliesWithDefault", new Class[] {
				Array.newInstance(class1, 1).getClass()
			})));
	//   36   57:ldc1            #64  <Class Typeface>
	//   37   59:ldc1            #17  <String "createFromFamiliesWithDefault">
	//   38   61:iconst_1        
	//   39   62:anewarray       Class[]
	//   40   65:dup             
	//   41   66:iconst_0        
	//   42   67:aload_1         
	//   43   68:iconst_1        
	//   44   69:invokestatic    #70  <Method Object Array.newInstance(Class, int)>
	//   45   72:invokevirtual   #76  <Method Class Object.getClass()>
	//   46   75:aastore         
	//   47   76:invokevirtual   #62  <Method Method Class.getMethod(String, Class[])>
	//   48   79:astore_2        
		}
	//*  49   80:goto            109
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  50   83:astore_0        
		{
			Log.e("TypefaceCompatApi24Impl", obj.getClass().getName(), ((Throwable) (obj)));
	//   51   84:ldc1            #23  <String "TypefaceCompatApi24Impl">
	//   52   86:aload_0         
	//   53   87:invokevirtual   #76  <Method Class Object.getClass()>
	//   54   90:invokevirtual   #80  <Method String Class.getName()>
	//   55   93:aload_0         
	//   56   94:invokestatic    #86  <Method int Log.e(String, String, Throwable)>
	//   57   97:pop             
			class1 = null;
	//   58   98:aconst_null     
	//   59   99:astore_1        
			obj = ((Object) (class1));
	//   60  100:aload_1         
	//   61  101:astore_0        
			obj2 = obj;
	//   62  102:aload_0         
	//   63  103:astore_3        
			obj1 = obj;
	//   64  104:aload_0         
	//   65  105:astore_2        
			obj = ((Object) (obj3));
	//   66  106:aload           4
	//   67  108:astore_0        
		}
		sFontFamilyCtor = ((Constructor) (obj));
	//   68  109:aload_0         
	//   69  110:putstatic       #88  <Field Constructor sFontFamilyCtor>
		sFontFamily = class1;
	//   70  113:aload_1         
	//   71  114:putstatic       #90  <Field Class sFontFamily>
		sAddFontWeightStyle = ((Method) (obj2));
	//   72  117:aload_3         
	//   73  118:putstatic       #92  <Field Method sAddFontWeightStyle>
		sCreateFromFamiliesWithDefault = ((Method) (obj1));
	//   74  121:aload_2         
	//   75  122:putstatic       #94  <Field Method sCreateFromFamiliesWithDefault>
	//   76  125:return          
	}
}
