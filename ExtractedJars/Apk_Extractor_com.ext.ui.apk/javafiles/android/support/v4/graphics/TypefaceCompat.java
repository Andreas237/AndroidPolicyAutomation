// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.support.v4.provider.FontsContractCompat;
import android.support.v4.util.LruCache;
import android.widget.TextView;

// Referenced classes of package android.support.v4.graphics:
//			TypefaceCompatApi26Impl, TypefaceCompatApi24Impl, TypefaceCompatApi21Impl, TypefaceCompatBaseImpl

public class TypefaceCompat
{
	static interface TypefaceCompatImpl
	{

		public abstract Typeface createFromFontFamilyFilesResourceEntry(Context context, android.support.v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontfamilyfilesresourceentry, Resources resources, int i);

		public abstract Typeface createFromFontInfo(Context context, CancellationSignal cancellationsignal, android.support.v4.provider.FontsContractCompat.FontInfo afontinfo[], int i);

		public abstract Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String s, int j);
	}


	private TypefaceCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
	//    2    4:return          
	}

	public static Typeface createFromFontInfo(Context context, CancellationSignal cancellationsignal, android.support.v4.provider.FontsContractCompat.FontInfo afontinfo[], int i)
	{
		return sTypefaceCompatImpl.createFromFontInfo(context, cancellationsignal, afontinfo, i);
	//    0    0:getstatic       #35  <Field TypefaceCompat$TypefaceCompatImpl sTypefaceCompatImpl>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #63  <Method Typeface TypefaceCompat$TypefaceCompatImpl.createFromFontInfo(Context, CancellationSignal, android.support.v4.provider.FontsContractCompat$FontInfo[], int)>
	//    6   12:areturn         
	}

	public static Typeface createFromResourcesFamilyXml(Context context, android.support.v4.content.res.FontResourcesParserCompat.FamilyResourceEntry familyresourceentry, Resources resources, int i, int j, TextView textview)
	{
		if(familyresourceentry instanceof android.support.v4.content.res.FontResourcesParserCompat.ProviderResourceEntry)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #68  <Class android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry>
	//*   2    4:ifeq            54
		{
			familyresourceentry = ((android.support.v4.content.res.FontResourcesParserCompat.FamilyResourceEntry) ((android.support.v4.content.res.FontResourcesParserCompat.ProviderResourceEntry)familyresourceentry));
	//    3    7:aload_1         
	//    4    8:checkcast       #68  <Class android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry>
	//    5   11:astore_1        
			context = ((Context) (FontsContractCompat.getFontSync(context, ((android.support.v4.content.res.FontResourcesParserCompat.ProviderResourceEntry) (familyresourceentry)).getRequest(), textview, ((android.support.v4.content.res.FontResourcesParserCompat.ProviderResourceEntry) (familyresourceentry)).getFetchStrategy(), ((android.support.v4.content.res.FontResourcesParserCompat.ProviderResourceEntry) (familyresourceentry)).getTimeout(), j)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #72  <Method android.support.v4.provider.FontRequest android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry.getRequest()>
	//    9   17:aload           5
	//   10   19:aload_1         
	//   11   20:invokevirtual   #76  <Method int android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry.getFetchStrategy()>
	//   12   23:aload_1         
	//   13   24:invokevirtual   #79  <Method int android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry.getTimeout()>
	//   14   27:iload           4
	//   15   29:invokestatic    #85  <Method Typeface FontsContractCompat.getFontSync(Context, android.support.v4.provider.FontRequest, TextView, int, int, int)>
	//   16   32:astore_0        
		} else
	//*  17   33:aload_0         
	//*  18   34:ifnull          52
	//*  19   37:getstatic       #42  <Field LruCache sTypefaceCache>
	//*  20   40:aload_2         
	//*  21   41:iload_3         
	//*  22   42:iload           4
	//*  23   44:invokestatic    #89  <Method String createResourceUid(Resources, int, int)>
	//*  24   47:aload_0         
	//*  25   48:invokevirtual   #93  <Method Object LruCache.put(Object, Object)>
	//*  26   51:pop             
	//*  27   52:aload_0         
	//*  28   53:areturn         
		{
			context = ((Context) (sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(context, (android.support.v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry)familyresourceentry, resources, j)));
	//   29   54:getstatic       #35  <Field TypefaceCompat$TypefaceCompatImpl sTypefaceCompatImpl>
	//   30   57:aload_0         
	//   31   58:aload_1         
	//   32   59:checkcast       #95  <Class android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry>
	//   33   62:aload_2         
	//   34   63:iload           4
	//   35   65:invokeinterface #99  <Method Typeface TypefaceCompat$TypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(Context, android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry, Resources, int)>
	//   36   70:astore_0        
		}
		if(context != null)
			sTypefaceCache.put(((Object) (createResourceUid(resources, i, j))), ((Object) (context)));
		return ((Typeface) (context));
	//*  37   71:goto            33
	}

	public static Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String s, int j)
	{
		context = ((Context) (sTypefaceCompatImpl.createFromResourcesFontFile(context, resources, i, s, j)));
	//    0    0:getstatic       #35  <Field TypefaceCompat$TypefaceCompatImpl sTypefaceCompatImpl>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokeinterface #103 <Method Typeface TypefaceCompat$TypefaceCompatImpl.createFromResourcesFontFile(Context, Resources, int, String, int)>
	//    7   14:astore_0        
		if(context != null)
	//*   8   15:aload_0         
	//*   9   16:ifnull          34
			sTypefaceCache.put(((Object) (createResourceUid(resources, i, j))), ((Object) (context)));
	//   10   19:getstatic       #42  <Field LruCache sTypefaceCache>
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:iload           4
	//   14   26:invokestatic    #89  <Method String createResourceUid(Resources, int, int)>
	//   15   29:aload_0         
	//   16   30:invokevirtual   #93  <Method Object LruCache.put(Object, Object)>
	//   17   33:pop             
		return ((Typeface) (context));
	//   18   34:aload_0         
	//   19   35:areturn         
	}

	private static String createResourceUid(Resources resources, int i, int j)
	{
		return (new StringBuilder()).append(resources.getResourcePackageName(i)).append("-").append(i).append("-").append(j).toString();
	//    0    0:new             #106 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #113 <Method String Resources.getResourcePackageName(int)>
	//    6   12:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:ldc1            #119 <String "-">
	//    8   17:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:iload_1         
	//   10   21:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
	//   11   24:ldc1            #119 <String "-">
	//   12   26:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:iload_2         
	//   14   30:invokevirtual   #122 <Method StringBuilder StringBuilder.append(int)>
	//   15   33:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   16   36:areturn         
	}

	public static Typeface findFromCache(Resources resources, int i, int j)
	{
		return (Typeface)sTypefaceCache.get(((Object) (createResourceUid(resources, i, j))));
	//    0    0:getstatic       #42  <Field LruCache sTypefaceCache>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #89  <Method String createResourceUid(Resources, int, int)>
	//    5    9:invokevirtual   #132 <Method Object LruCache.get(Object)>
	//    6   12:checkcast       #134 <Class Typeface>
	//    7   15:areturn         
	}

	private static final String TAG = "TypefaceCompat";
	private static final LruCache sTypefaceCache = new LruCache(16);
	private static final TypefaceCompatImpl sTypefaceCompatImpl;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          31
			sTypefaceCompatImpl = ((TypefaceCompatImpl) (new TypefaceCompatApi26Impl()));
	//    3    8:new             #30  <Class TypefaceCompatApi26Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #33  <Method void TypefaceCompatApi26Impl()>
	//    6   15:putstatic       #35  <Field TypefaceCompat$TypefaceCompatImpl sTypefaceCompatImpl>
		else
	//*   7   18:new             #37  <Class LruCache>
	//*   8   21:dup             
	//*   9   22:bipush          16
	//*  10   24:invokespecial   #40  <Method void LruCache(int)>
	//*  11   27:putstatic       #42  <Field LruCache sTypefaceCache>
	//*  12   30:return          
		if(android.os.Build.VERSION.SDK_INT >= 24 && TypefaceCompatApi24Impl.isUsable())
	//*  13   31:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   34:bipush          24
	//*  15   36:icmplt          58
	//*  16   39:invokestatic    #48  <Method boolean TypefaceCompatApi24Impl.isUsable()>
	//*  17   42:ifeq            58
			sTypefaceCompatImpl = ((TypefaceCompatImpl) (new TypefaceCompatApi24Impl()));
	//   18   45:new             #44  <Class TypefaceCompatApi24Impl>
	//   19   48:dup             
	//   20   49:invokespecial   #49  <Method void TypefaceCompatApi24Impl()>
	//   21   52:putstatic       #35  <Field TypefaceCompat$TypefaceCompatImpl sTypefaceCompatImpl>
		else
	//*  22   55:goto            18
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  23   58:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*  24   61:bipush          21
	//*  25   63:icmplt          79
			sTypefaceCompatImpl = ((TypefaceCompatImpl) (new TypefaceCompatApi21Impl()));
	//   26   66:new             #51  <Class TypefaceCompatApi21Impl>
	//   27   69:dup             
	//   28   70:invokespecial   #52  <Method void TypefaceCompatApi21Impl()>
	//   29   73:putstatic       #35  <Field TypefaceCompat$TypefaceCompatImpl sTypefaceCompatImpl>
		else
	//*  30   76:goto            18
			sTypefaceCompatImpl = ((TypefaceCompatImpl) (new TypefaceCompatBaseImpl()));
	//   31   79:new             #54  <Class TypefaceCompatBaseImpl>
	//   32   82:dup             
	//   33   83:invokespecial   #55  <Method void TypefaceCompatBaseImpl()>
	//   34   86:putstatic       #35  <Field TypefaceCompat$TypefaceCompatImpl sTypefaceCompatImpl>
	//*  35   89:goto            18
	}
}
