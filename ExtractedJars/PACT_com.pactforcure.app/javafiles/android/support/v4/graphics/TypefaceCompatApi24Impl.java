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
		flag = ((Boolean)sAddFontWeightStyle.invoke(obj, new Object[] {
			bytebuffer, Integer.valueOf(i), null, Integer.valueOf(j), Boolean.valueOf(flag)
		})).booleanValue();
	//    0    0:getstatic       #82  <Field Method sAddFontWeightStyle>
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
		return flag;
	//   31   49:iload           4
	//   32   51:ireturn         
		obj;
	//   33   52:astore_0        
_L2:
		throw new RuntimeException(((Throwable) (obj)));
	//   34   53:new             #122 <Class RuntimeException>
	//   35   56:dup             
	//   36   57:aload_0         
	//   37   58:invokespecial   #125 <Method void RuntimeException(Throwable)>
	//   38   61:athrow          
		obj;
	//   39   62:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  40   63:goto            53
	}

	private static Typeface createFromFamiliesWithDefault(Object obj)
	{
		Object obj1 = Array.newInstance(sFontFamily, 1);
	//    0    0:getstatic       #80  <Field Class sFontFamily>
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
	//    8   14:getstatic       #84  <Field Method sCreateFromFamiliesWithDefault>
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
		return ((Typeface) (obj));
	//   19   33:aload_0         
	//   20   34:areturn         
		obj;
	//   21   35:astore_0        
_L2:
		throw new RuntimeException(((Throwable) (obj)));
	//   22   36:new             #122 <Class RuntimeException>
	//   23   39:dup             
	//   24   40:aload_0         
	//   25   41:invokespecial   #125 <Method void RuntimeException(Throwable)>
	//   26   44:athrow          
		obj;
	//   27   45:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  28   46:goto            36
	}

	public static boolean isUsable()
	{
		if(sAddFontWeightStyle == null)
	//*   0    0:getstatic       #82  <Field Method sAddFontWeightStyle>
	//*   1    3:ifnonnull       14
			Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
	//    2    6:ldc1            #23  <String "TypefaceCompatApi24Impl">
	//    3    8:ldc1            #133 <String "Unable to collect necessary private methods.Fallback to legacy implementation.">
	//    4   10:invokestatic    #137 <Method int Log.w(String, String)>
	//    5   13:pop             
		return sAddFontWeightStyle != null;
	//    6   14:getstatic       #82  <Field Method sAddFontWeightStyle>
	//    7   17:ifnull          22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private static Object newFamily()
	{
		Object obj = sFontFamilyCtor.newInstance(new Object[0]);
	//    0    0:getstatic       #78  <Field Constructor sFontFamilyCtor>
	//    1    3:iconst_0        
	//    2    4:anewarray       Object[]
	//    3    7:invokevirtual   #146 <Method Object Constructor.newInstance(Object[])>
	//    4   10:astore_0        
		return obj;
	//    5   11:aload_0         
	//    6   12:areturn         
		Object obj1;
		obj1;
	//    7   13:astore_0        
_L2:
		throw new RuntimeException(((Throwable) (obj1)));
	//    8   14:new             #122 <Class RuntimeException>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #125 <Method void RuntimeException(Throwable)>
	//   12   22:athrow          
		obj1;
	//   13   23:astore_0        
		continue; /* Loop/switch isn't completed */
	//   14   24:goto            14
		obj1;
	//   15   27:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  16   28:goto            14
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
	//*  12   21:icmpge          70
		{
			android.support.v4.content.res.FontResourcesParserCompat.FontFileResourceEntry fontfileresourceentry = ((android.support.v4.content.res.FontResourcesParserCompat.FontFileResourceEntry) (fontfamilyfilesresourceentry[i]));
	//   13   24:aload_2         
	//   14   25:iload           4
	//   15   27:aaload          
	//   16   28:astore          7
			if(!addFontWeightStyle(obj, TypefaceCompatUtil.copyToDirectBuffer(context, resources, fontfileresourceentry.getResourceId()), 0, fontfileresourceentry.getWeight(), fontfileresourceentry.isItalic()))
	//*  17   30:aload           6
	//*  18   32:aload_1         
	//*  19   33:aload_3         
	//*  20   34:aload           7
	//*  21   36:invokevirtual   #162 <Method int android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.getResourceId()>
	//*  22   39:invokestatic    #168 <Method ByteBuffer TypefaceCompatUtil.copyToDirectBuffer(Context, Resources, int)>
	//*  23   42:iconst_0        
	//*  24   43:aload           7
	//*  25   45:invokevirtual   #171 <Method int android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.getWeight()>
	//*  26   48:aload           7
	//*  27   50:invokevirtual   #174 <Method boolean android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.isItalic()>
	//*  28   53:invokestatic    #176 <Method boolean addFontWeightStyle(Object, ByteBuffer, int, int, boolean)>
	//*  29   56:ifne            61
				return null;
	//   30   59:aconst_null     
	//   31   60:areturn         
		}

	//   32   61:iload           4
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore          4
	//*  36   67:goto            17
		return createFromFamiliesWithDefault(obj);
	//   37   70:aload           6
	//   38   72:invokestatic    #178 <Method Typeface createFromFamiliesWithDefault(Object)>
	//   39   75:areturn         
	}

	public Typeface createFromFontInfo(Context context, CancellationSignal cancellationsignal, android.support.v4.provider.FontsContractCompat.FontInfo afontinfo[], int i)
	{
		Object obj = newFamily();
	//    0    0:invokestatic    #150 <Method Object newFamily()>
	//    1    3:astore          8
		SimpleArrayMap simplearraymap = new SimpleArrayMap();
	//    2    5:new             #184 <Class SimpleArrayMap>
	//    3    8:dup             
	//    4    9:invokespecial   #185 <Method void SimpleArrayMap()>
	//    5   12:astore          9
		int j = afontinfo.length;
	//    6   14:aload_3         
	//    7   15:arraylength     
	//    8   16:istore          5
		for(i = 0; i < j; i++)
	//*   9   18:iconst_0        
	//*  10   19:istore          4
	//*  11   21:iload           4
	//*  12   23:iload           5
	//*  13   25:icmpge          117
		{
			android.support.v4.provider.FontsContractCompat.FontInfo fontinfo = afontinfo[i];
	//   14   28:aload_3         
	//   15   29:iload           4
	//   16   31:aaload          
	//   17   32:astore          10
			android.net.Uri uri = fontinfo.getUri();
	//   18   34:aload           10
	//   19   36:invokevirtual   #191 <Method android.net.Uri android.support.v4.provider.FontsContractCompat$FontInfo.getUri()>
	//   20   39:astore          11
			ByteBuffer bytebuffer1 = (ByteBuffer)simplearraymap.get(((Object) (uri)));
	//   21   41:aload           9
	//   22   43:aload           11
	//   23   45:invokevirtual   #195 <Method Object SimpleArrayMap.get(Object)>
	//   24   48:checkcast       #48  <Class ByteBuffer>
	//   25   51:astore          7
			ByteBuffer bytebuffer = bytebuffer1;
	//   26   53:aload           7
	//   27   55:astore          6
			if(bytebuffer1 == null)
	//*  28   57:aload           7
	//*  29   59:ifnonnull       81
			{
				bytebuffer = TypefaceCompatUtil.mmap(context, cancellationsignal, uri);
	//   30   62:aload_1         
	//   31   63:aload_2         
	//   32   64:aload           11
	//   33   66:invokestatic    #199 <Method ByteBuffer TypefaceCompatUtil.mmap(Context, CancellationSignal, android.net.Uri)>
	//   34   69:astore          6
				simplearraymap.put(((Object) (uri)), ((Object) (bytebuffer)));
	//   35   71:aload           9
	//   36   73:aload           11
	//   37   75:aload           6
	//   38   77:invokevirtual   #203 <Method Object SimpleArrayMap.put(Object, Object)>
	//   39   80:pop             
			}
			if(!addFontWeightStyle(obj, bytebuffer, fontinfo.getTtcIndex(), fontinfo.getWeight(), fontinfo.isItalic()))
	//*  40   81:aload           8
	//*  41   83:aload           6
	//*  42   85:aload           10
	//*  43   87:invokevirtual   #206 <Method int android.support.v4.provider.FontsContractCompat$FontInfo.getTtcIndex()>
	//*  44   90:aload           10
	//*  45   92:invokevirtual   #207 <Method int android.support.v4.provider.FontsContractCompat$FontInfo.getWeight()>
	//*  46   95:aload           10
	//*  47   97:invokevirtual   #208 <Method boolean android.support.v4.provider.FontsContractCompat$FontInfo.isItalic()>
	//*  48  100:invokestatic    #176 <Method boolean addFontWeightStyle(Object, ByteBuffer, int, int, boolean)>
	//*  49  103:ifne            108
				return null;
	//   50  106:aconst_null     
	//   51  107:areturn         
		}

	//   52  108:iload           4
	//   53  110:iconst_1        
	//   54  111:iadd            
	//   55  112:istore          4
	//*  56  114:goto            21
		return createFromFamiliesWithDefault(obj);
	//   57  117:aload           8
	//   58  119:invokestatic    #178 <Method Typeface createFromFamiliesWithDefault(Object)>
	//   59  122:areturn         
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
		Object obj;
		Method method;
		Class class1;
		Constructor constructor;
		class1 = Class.forName("android.graphics.FontFamily");
	//    0    0:ldc1            #20  <String "android.graphics.FontFamily">
	//    1    2:invokestatic    #42  <Method Class Class.forName(String)>
	//    2    5:astore_2        
		constructor = class1.getConstructor(new Class[0]);
	//    3    6:aload_2         
	//    4    7:iconst_0        
	//    5    8:anewarray       Class[]
	//    6   11:invokevirtual   #46  <Method Constructor Class.getConstructor(Class[])>
	//    7   14:astore_3        
		obj = ((Object) (class1.getMethod("addFontWeightStyle", new Class[] {
			java/nio/ByteBuffer, Integer.TYPE, java/util/List, Integer.TYPE, Boolean.TYPE
		})));
	//    8   15:aload_2         
	//    9   16:ldc1            #14  <String "addFontWeightStyle">
	//   10   18:iconst_5        
	//   11   19:anewarray       Class[]
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:ldc1            #48  <Class ByteBuffer>
	//   15   26:aastore         
	//   16   27:dup             
	//   17   28:iconst_1        
	//   18   29:getstatic       #53  <Field Class Integer.TYPE>
	//   19   32:aastore         
	//   20   33:dup             
	//   21   34:iconst_2        
	//   22   35:ldc1            #55  <Class List>
	//   23   37:aastore         
	//   24   38:dup             
	//   25   39:iconst_3        
	//   26   40:getstatic       #53  <Field Class Integer.TYPE>
	//   27   43:aastore         
	//   28   44:dup             
	//   29   45:iconst_4        
	//   30   46:getstatic       #58  <Field Class Boolean.TYPE>
	//   31   49:aastore         
	//   32   50:invokevirtual   #62  <Method Method Class.getMethod(String, Class[])>
	//   33   53:astore_0        
		method = ((Class) (android/graphics/Typeface)).getMethod("createFromFamiliesWithDefault", new Class[] {
			Array.newInstance(class1, 1).getClass()
		});
	//   34   54:ldc1            #64  <Class Typeface>
	//   35   56:ldc1            #17  <String "createFromFamiliesWithDefault">
	//   36   58:iconst_1        
	//   37   59:anewarray       Class[]
	//   38   62:dup             
	//   39   63:iconst_0        
	//   40   64:aload_2         
	//   41   65:iconst_1        
	//   42   66:invokestatic    #70  <Method Object Array.newInstance(Class, int)>
	//   43   69:invokevirtual   #76  <Method Class Object.getClass()>
	//   44   72:aastore         
	//   45   73:invokevirtual   #62  <Method Method Class.getMethod(String, Class[])>
	//   46   76:astore_1        
_L2:
		sFontFamilyCtor = constructor;
	//   47   77:aload_3         
	//   48   78:putstatic       #78  <Field Constructor sFontFamilyCtor>
		sFontFamily = class1;
	//   49   81:aload_2         
	//   50   82:putstatic       #80  <Field Class sFontFamily>
		sAddFontWeightStyle = ((Method) (obj));
	//   51   85:aload_0         
	//   52   86:putstatic       #82  <Field Method sAddFontWeightStyle>
		sCreateFromFamiliesWithDefault = method;
	//   53   89:aload_1         
	//   54   90:putstatic       #84  <Field Method sCreateFromFamiliesWithDefault>
		return;
	//   55   93:return          
		ClassNotFoundException classnotfoundexception;
		classnotfoundexception;
	//   56   94:astore_0        
_L3:
		Log.e("TypefaceCompatApi24Impl", ((Object) (classnotfoundexception)).getClass().getName(), ((Throwable) (classnotfoundexception)));
	//   57   95:ldc1            #23  <String "TypefaceCompatApi24Impl">
	//   58   97:aload_0         
	//   59   98:invokevirtual   #76  <Method Class Object.getClass()>
	//   60  101:invokevirtual   #88  <Method String Class.getName()>
	//   61  104:aload_0         
	//   62  105:invokestatic    #94  <Method int Log.e(String, String, Throwable)>
	//   63  108:pop             
		class1 = null;
	//   64  109:aconst_null     
	//   65  110:astore_2        
		constructor = null;
	//   66  111:aconst_null     
	//   67  112:astore_3        
		classnotfoundexception = null;
	//   68  113:aconst_null     
	//   69  114:astore_0        
		method = null;
	//   70  115:aconst_null     
	//   71  116:astore_1        
		if(true) goto _L2; else goto _L1
	//   72  117:goto            77
_L1:
		classnotfoundexception;
	//   73  120:astore_0        
		  goto _L3
	//*  74  121:goto            95
	}
}
