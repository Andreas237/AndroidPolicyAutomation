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

	public static Typeface createFromResourcesFamilyXml(Context context, android.support.v4.content.res.FontResourcesParserCompat.FamilyResourceEntry familyresourceentry, Resources resources, int i, int j, android.support.v4.content.res.ResourcesCompat.FontCallback fontcallback, Handler handler, boolean flag)
	{
		if(familyresourceentry instanceof android.support.v4.content.res.FontResourcesParserCompat.ProviderResourceEntry)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #69  <Class android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry>
	//*   2    4:ifeq            83
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
	//*   9   17:ifeq            33
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #73  <Method int android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry.getFetchStrategy()>
	//*  12   24:ifne            41
				flag1 = true;
	//   13   27:iconst_1        
	//   14   28:istore          9
	//   15   30:goto            41
	//   16   33:aload           5
	//   17   35:ifnonnull       41
	//*  18   38:goto            27
			int k;
			if(flag)
	//*  19   41:iload           7
	//*  20   43:ifeq            55
				k = ((android.support.v4.content.res.FontResourcesParserCompat.ProviderResourceEntry) (familyresourceentry)).getTimeout();
	//   21   46:aload_1         
	//   22   47:invokevirtual   #76  <Method int android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry.getTimeout()>
	//   23   50:istore          8
			else
	//*  24   52:goto            61
				k = -1;
	//   25   55:iconst_m1       
	//   26   56:istore          8
	//*  27   58:goto            52
			context = ((Context) (FontsContractCompat.getFontSync(context, ((android.support.v4.content.res.FontResourcesParserCompat.ProviderResourceEntry) (familyresourceentry)).getRequest(), fontcallback, handler, flag1, k, j)));
	//   28   61:aload_0         
	//   29   62:aload_1         
	//   30   63:invokevirtual   #80  <Method android.support.v4.provider.FontRequest android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry.getRequest()>
	//   31   66:aload           5
	//   32   68:aload           6
	//   33   70:iload           9
	//   34   72:iload           8
	//   35   74:iload           4
	//   36   76:invokestatic    #86  <Method Typeface FontsContractCompat.getFontSync(Context, android.support.v4.provider.FontRequest, android.support.v4.content.res.ResourcesCompat$FontCallback, Handler, boolean, int, int)>
	//   37   79:astore_0        
		} else
	//*  38   80:goto            135
		{
			familyresourceentry = ((android.support.v4.content.res.FontResourcesParserCompat.FamilyResourceEntry) (sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(context, (android.support.v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry)familyresourceentry, resources, j)));
	//   39   83:getstatic       #35  <Field TypefaceCompat$TypefaceCompatImpl sTypefaceCompatImpl>
	//   40   86:aload_0         
	//   41   87:aload_1         
	//   42   88:checkcast       #88  <Class android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry>
	//   43   91:aload_2         
	//   44   92:iload           4
	//   45   94:invokeinterface #92  <Method Typeface TypefaceCompat$TypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(Context, android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry, Resources, int)>
	//   46   99:astore_1        
			context = ((Context) (familyresourceentry));
	//   47  100:aload_1         
	//   48  101:astore_0        
			if(fontcallback != null)
	//*  49  102:aload           5
	//*  50  104:ifnull          135
				if(familyresourceentry != null)
	//*  51  107:aload_1         
	//*  52  108:ifnull          124
				{
					fontcallback.callbackSuccessAsync(((Typeface) (familyresourceentry)), handler);
	//   53  111:aload           5
	//   54  113:aload_1         
	//   55  114:aload           6
	//   56  116:invokevirtual   #98  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackSuccessAsync(Typeface, Handler)>
					context = ((Context) (familyresourceentry));
	//   57  119:aload_1         
	//   58  120:astore_0        
				} else
	//*  59  121:goto            135
				{
					fontcallback.callbackFailAsync(-3, handler);
	//   60  124:aload           5
	//   61  126:bipush          -3
	//   62  128:aload           6
	//   63  130:invokevirtual   #102 <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackFailAsync(int, Handler)>
					context = ((Context) (familyresourceentry));
	//   64  133:aload_1         
	//   65  134:astore_0        
				}
		}
		if(context != null)
	//*  66  135:aload_0         
	//*  67  136:ifnull          154
			sTypefaceCache.put(((Object) (createResourceUid(resources, i, j))), ((Object) (context)));
	//   68  139:getstatic       #55  <Field LruCache sTypefaceCache>
	//   69  142:aload_2         
	//   70  143:iload_3         
	//   71  144:iload           4
	//   72  146:invokestatic    #106 <Method String createResourceUid(Resources, int, int)>
	//   73  149:aload_0         
	//   74  150:invokevirtual   #110 <Method Object LruCache.put(Object, Object)>
	//   75  153:pop             
		return ((Typeface) (context));
	//   76  154:aload_0         
	//   77  155:areturn         
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
	//    6    9:invokeinterface #114 <Method Typeface TypefaceCompat$TypefaceCompatImpl.createFromResourcesFontFile(Context, Resources, int, String, int)>
	//    7   14:astore_0        
		if(context != null)
	//*   8   15:aload_0         
	//*   9   16:ifnull          36
		{
			resources = ((Resources) (createResourceUid(resources, i, j)));
	//   10   19:aload_1         
	//   11   20:iload_2         
	//   12   21:iload           4
	//   13   23:invokestatic    #106 <Method String createResourceUid(Resources, int, int)>
	//   14   26:astore_1        
			sTypefaceCache.put(((Object) (resources)), ((Object) (context)));
	//   15   27:getstatic       #55  <Field LruCache sTypefaceCache>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:invokevirtual   #110 <Method Object LruCache.put(Object, Object)>
	//   19   35:pop             
		}
		return ((Typeface) (context));
	//   20   36:aload_0         
	//   21   37:areturn         
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
	private static final TypefaceCompatImpl sTypefaceCompatImpl;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          21
			sTypefaceCompatImpl = ((TypefaceCompatImpl) (new TypefaceCompatApi26Impl()));
	//    3    8:new             #30  <Class TypefaceCompatApi26Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #33  <Method void TypefaceCompatApi26Impl()>
	//    6   15:putstatic       #35  <Field TypefaceCompat$TypefaceCompatImpl sTypefaceCompatImpl>
		else
	//*   7   18:goto            79
		if(android.os.Build.VERSION.SDK_INT >= 24 && TypefaceCompatApi24Impl.isUsable())
	//*   8   21:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   24:bipush          24
	//*  10   26:icmplt          48
	//*  11   29:invokestatic    #41  <Method boolean TypefaceCompatApi24Impl.isUsable()>
	//*  12   32:ifeq            48
			sTypefaceCompatImpl = ((TypefaceCompatImpl) (new TypefaceCompatApi24Impl()));
	//   13   35:new             #37  <Class TypefaceCompatApi24Impl>
	//   14   38:dup             
	//   15   39:invokespecial   #42  <Method void TypefaceCompatApi24Impl()>
	//   16   42:putstatic       #35  <Field TypefaceCompat$TypefaceCompatImpl sTypefaceCompatImpl>
		else
	//*  17   45:goto            79
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  18   48:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*  19   51:bipush          21
	//*  20   53:icmplt          69
			sTypefaceCompatImpl = ((TypefaceCompatImpl) (new TypefaceCompatApi21Impl()));
	//   21   56:new             #44  <Class TypefaceCompatApi21Impl>
	//   22   59:dup             
	//   23   60:invokespecial   #45  <Method void TypefaceCompatApi21Impl()>
	//   24   63:putstatic       #35  <Field TypefaceCompat$TypefaceCompatImpl sTypefaceCompatImpl>
		else
	//*  25   66:goto            79
			sTypefaceCompatImpl = ((TypefaceCompatImpl) (new TypefaceCompatBaseImpl()));
	//   26   69:new             #47  <Class TypefaceCompatBaseImpl>
	//   27   72:dup             
	//   28   73:invokespecial   #48  <Method void TypefaceCompatBaseImpl()>
	//   29   76:putstatic       #35  <Field TypefaceCompat$TypefaceCompatImpl sTypefaceCompatImpl>
	//   30   79:new             #50  <Class LruCache>
	//   31   82:dup             
	//   32   83:bipush          16
	//   33   85:invokespecial   #53  <Method void LruCache(int)>
	//   34   88:putstatic       #55  <Field LruCache sTypefaceCache>
	//*  35   91:return          
	}
}
