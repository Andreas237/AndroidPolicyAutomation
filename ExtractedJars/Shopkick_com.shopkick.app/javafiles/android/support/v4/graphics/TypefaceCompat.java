// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.provider.FontsContractCompat;
import android.support.v4.util.LruCache;

// Referenced classes of package android.support.v4.graphics:
//			TypefaceCompatApi28Impl, TypefaceCompatApi26Impl, TypefaceCompatApi24Impl, TypefaceCompatApi21Impl, 
//			TypefaceCompatBaseImpl

public class TypefaceCompat
{

	private TypefaceCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
	//    2    4:return          
	}

	public static Typeface createFromFontInfo(Context context, CancellationSignal cancellationsignal, android.support.v4.provider.FontsContractCompat.FontInfo afontinfo[], int i)
	{
		return sTypefaceCompatImpl.createFromFontInfo(context, cancellationsignal, afontinfo, i);
	//    0    0:getstatic       #32  <Field TypefaceCompatBaseImpl sTypefaceCompatImpl>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #63  <Method Typeface TypefaceCompatBaseImpl.createFromFontInfo(Context, CancellationSignal, android.support.v4.provider.FontsContractCompat$FontInfo[], int)>
	//    6   10:areturn         
	}

	public static Typeface createFromResourcesFamilyXml(Context context, android.support.v4.content.res.FontResourcesParserCompat.FamilyResourceEntry familyresourceentry, Resources resources, int i, int j, android.support.v4.content.res.ResourcesCompat.FontCallback fontcallback, Handler handler, boolean flag)
	{
		if(familyresourceentry instanceof android.support.v4.content.res.FontResourcesParserCompat.ProviderResourceEntry)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #69  <Class android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry>
	//*   2    4:ifeq            77
		{
			familyresourceentry = ((android.support.v4.content.res.FontResourcesParserCompat.FamilyResourceEntry) ((android.support.v4.content.res.FontResourcesParserCompat.ProviderResourceEntry)familyresourceentry));
	//    3    7:aload_1         
	//    4    8:checkcast       #69  <Class android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry>
	//    5   11:astore_1        
			boolean flag1 = false;
	//    6   12:iconst_0        
	//    7   13:istore          9
			if(flag ? ((android.support.v4.content.res.FontResourcesParserCompat.ProviderResourceEntry) (familyresourceentry)).getFetchStrategy() == 0 : fontcallback == null)
	//*   8   15:iload           7
	//*   9   17:ifeq            30
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #73  <Method int android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry.getFetchStrategy()>
	//*  12   24:ifne            38
	//*  13   27:goto            35
	//*  14   30:aload           5
	//*  15   32:ifnonnull       38
				flag1 = true;
	//   16   35:iconst_1        
	//   17   36:istore          9
			int k;
			if(flag)
	//*  18   38:iload           7
	//*  19   40:ifeq            52
				k = ((android.support.v4.content.res.FontResourcesParserCompat.ProviderResourceEntry) (familyresourceentry)).getTimeout();
	//   20   43:aload_1         
	//   21   44:invokevirtual   #76  <Method int android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry.getTimeout()>
	//   22   47:istore          8
			else
	//*  23   49:goto            55
				k = -1;
	//   24   52:iconst_m1       
	//   25   53:istore          8
			context = ((Context) (FontsContractCompat.getFontSync(context, ((android.support.v4.content.res.FontResourcesParserCompat.ProviderResourceEntry) (familyresourceentry)).getRequest(), fontcallback, handler, flag1, k, j)));
	//   26   55:aload_0         
	//   27   56:aload_1         
	//   28   57:invokevirtual   #80  <Method android.support.v4.provider.FontRequest android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry.getRequest()>
	//   29   60:aload           5
	//   30   62:aload           6
	//   31   64:iload           9
	//   32   66:iload           8
	//   33   68:iload           4
	//   34   70:invokestatic    #86  <Method Typeface FontsContractCompat.getFontSync(Context, android.support.v4.provider.FontRequest, android.support.v4.content.res.ResourcesCompat$FontCallback, Handler, boolean, int, int)>
	//   35   73:astore_0        
		} else
	//*  36   74:goto            127
		{
			familyresourceentry = ((android.support.v4.content.res.FontResourcesParserCompat.FamilyResourceEntry) (sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(context, (android.support.v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry)familyresourceentry, resources, j)));
	//   37   77:getstatic       #32  <Field TypefaceCompatBaseImpl sTypefaceCompatImpl>
	//   38   80:aload_0         
	//   39   81:aload_1         
	//   40   82:checkcast       #88  <Class android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry>
	//   41   85:aload_2         
	//   42   86:iload           4
	//   43   88:invokevirtual   #92  <Method Typeface TypefaceCompatBaseImpl.createFromFontFamilyFilesResourceEntry(Context, android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry, Resources, int)>
	//   44   91:astore_1        
			context = ((Context) (familyresourceentry));
	//   45   92:aload_1         
	//   46   93:astore_0        
			if(fontcallback != null)
	//*  47   94:aload           5
	//*  48   96:ifnull          127
				if(familyresourceentry != null)
	//*  49   99:aload_1         
	//*  50  100:ifnull          116
				{
					fontcallback.callbackSuccessAsync(((Typeface) (familyresourceentry)), handler);
	//   51  103:aload           5
	//   52  105:aload_1         
	//   53  106:aload           6
	//   54  108:invokevirtual   #98  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackSuccessAsync(Typeface, Handler)>
					context = ((Context) (familyresourceentry));
	//   55  111:aload_1         
	//   56  112:astore_0        
				} else
	//*  57  113:goto            127
				{
					fontcallback.callbackFailAsync(-3, handler);
	//   58  116:aload           5
	//   59  118:bipush          -3
	//   60  120:aload           6
	//   61  122:invokevirtual   #102 <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackFailAsync(int, Handler)>
					context = ((Context) (familyresourceentry));
	//   62  125:aload_1         
	//   63  126:astore_0        
				}
		}
		if(context != null)
	//*  64  127:aload_0         
	//*  65  128:ifnull          146
			sTypefaceCache.put(((Object) (createResourceUid(resources, i, j))), ((Object) (context)));
	//   66  131:getstatic       #55  <Field LruCache sTypefaceCache>
	//   67  134:aload_2         
	//   68  135:iload_3         
	//   69  136:iload           4
	//   70  138:invokestatic    #106 <Method String createResourceUid(Resources, int, int)>
	//   71  141:aload_0         
	//   72  142:invokevirtual   #110 <Method Object LruCache.put(Object, Object)>
	//   73  145:pop             
		return ((Typeface) (context));
	//   74  146:aload_0         
	//   75  147:areturn         
	}

	public static Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String s, int j)
	{
		context = ((Context) (sTypefaceCompatImpl.createFromResourcesFontFile(context, resources, i, s, j)));
	//    0    0:getstatic       #32  <Field TypefaceCompatBaseImpl sTypefaceCompatImpl>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #114 <Method Typeface TypefaceCompatBaseImpl.createFromResourcesFontFile(Context, Resources, int, String, int)>
	//    7   12:astore_0        
		if(context != null)
	//*   8   13:aload_0         
	//*   9   14:ifnull          34
		{
			resources = ((Resources) (createResourceUid(resources, i, j)));
	//   10   17:aload_1         
	//   11   18:iload_2         
	//   12   19:iload           4
	//   13   21:invokestatic    #106 <Method String createResourceUid(Resources, int, int)>
	//   14   24:astore_1        
			sTypefaceCache.put(((Object) (resources)), ((Object) (context)));
	//   15   25:getstatic       #55  <Field LruCache sTypefaceCache>
	//   16   28:aload_1         
	//   17   29:aload_0         
	//   18   30:invokevirtual   #110 <Method Object LruCache.put(Object, Object)>
	//   19   33:pop             
		}
		return ((Typeface) (context));
	//   20   34:aload_0         
	//   21   35:areturn         
	}

	private static String createResourceUid(Resources resources, int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #116 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #117 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(resources.getResourcePackageName(i));
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #123 <Method String Resources.getResourcePackageName(int)>
	//    8   14:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//    9   17:pop             
		stringbuilder.append("-");
	//   10   18:aload_3         
	//   11   19:ldc1            #129 <String "-">
	//   12   21:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
		stringbuilder.append(i);
	//   14   25:aload_3         
	//   15   26:iload_1         
	//   16   27:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   17   30:pop             
		stringbuilder.append("-");
	//   18   31:aload_3         
	//   19   32:ldc1            #129 <String "-">
	//   20   34:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   21   37:pop             
		stringbuilder.append(j);
	//   22   38:aload_3         
	//   23   39:iload_2         
	//   24   40:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   25   43:pop             
		return stringbuilder.toString();
	//   26   44:aload_3         
	//   27   45:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   28   48:areturn         
	}

	public static Typeface findFromCache(Resources resources, int i, int j)
	{
		return (Typeface)sTypefaceCache.get(((Object) (createResourceUid(resources, i, j))));
	//    0    0:getstatic       #55  <Field LruCache sTypefaceCache>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #106 <Method String createResourceUid(Resources, int, int)>
	//    5    9:invokevirtual   #142 <Method Object LruCache.get(Object)>
	//    6   12:checkcast       #144 <Class Typeface>
	//    7   15:areturn         
	}

	private static final String TAG = "TypefaceCompat";
	private static final LruCache sTypefaceCache = new LruCache(16);
	private static final TypefaceCompatBaseImpl sTypefaceCompatImpl;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          21
			sTypefaceCompatImpl = ((TypefaceCompatBaseImpl) (new TypefaceCompatApi28Impl()));
	//    3    8:new             #27  <Class TypefaceCompatApi28Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #30  <Method void TypefaceCompatApi28Impl()>
	//    6   15:putstatic       #32  <Field TypefaceCompatBaseImpl sTypefaceCompatImpl>
		else
	//*   7   18:goto            100
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   8   21:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   24:bipush          26
	//*  10   26:icmplt          42
			sTypefaceCompatImpl = ((TypefaceCompatBaseImpl) (new TypefaceCompatApi26Impl()));
	//   11   29:new             #34  <Class TypefaceCompatApi26Impl>
	//   12   32:dup             
	//   13   33:invokespecial   #35  <Method void TypefaceCompatApi26Impl()>
	//   14   36:putstatic       #32  <Field TypefaceCompatBaseImpl sTypefaceCompatImpl>
		else
	//*  15   39:goto            100
		if(android.os.Build.VERSION.SDK_INT >= 24 && TypefaceCompatApi24Impl.isUsable())
	//*  16   42:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   45:bipush          24
	//*  18   47:icmplt          69
	//*  19   50:invokestatic    #41  <Method boolean TypefaceCompatApi24Impl.isUsable()>
	//*  20   53:ifeq            69
			sTypefaceCompatImpl = ((TypefaceCompatBaseImpl) (new TypefaceCompatApi24Impl()));
	//   21   56:new             #37  <Class TypefaceCompatApi24Impl>
	//   22   59:dup             
	//   23   60:invokespecial   #42  <Method void TypefaceCompatApi24Impl()>
	//   24   63:putstatic       #32  <Field TypefaceCompatBaseImpl sTypefaceCompatImpl>
		else
	//*  25   66:goto            100
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  26   69:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   72:bipush          21
	//*  28   74:icmplt          90
			sTypefaceCompatImpl = ((TypefaceCompatBaseImpl) (new TypefaceCompatApi21Impl()));
	//   29   77:new             #44  <Class TypefaceCompatApi21Impl>
	//   30   80:dup             
	//   31   81:invokespecial   #45  <Method void TypefaceCompatApi21Impl()>
	//   32   84:putstatic       #32  <Field TypefaceCompatBaseImpl sTypefaceCompatImpl>
		else
	//*  33   87:goto            100
			sTypefaceCompatImpl = new TypefaceCompatBaseImpl();
	//   34   90:new             #47  <Class TypefaceCompatBaseImpl>
	//   35   93:dup             
	//   36   94:invokespecial   #48  <Method void TypefaceCompatBaseImpl()>
	//   37   97:putstatic       #32  <Field TypefaceCompatBaseImpl sTypefaceCompatImpl>
	//   38  100:new             #50  <Class LruCache>
	//   39  103:dup             
	//   40  104:bipush          16
	//   41  106:invokespecial   #53  <Method void LruCache(int)>
	//   42  109:putstatic       #55  <Field LruCache sTypefaceCache>
	//*  43  112:return          
	}
}
