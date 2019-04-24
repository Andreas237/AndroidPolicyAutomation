// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.support.v4.provider.FontsContractCompat;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.*;
import java.nio.ByteBuffer;
import java.util.Map;

// Referenced classes of package android.support.v4.graphics:
//			TypefaceCompatApi21Impl

public class TypefaceCompatApi26Impl extends TypefaceCompatApi21Impl
{

	public TypefaceCompatApi26Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #144 <Method void TypefaceCompatApi21Impl()>
	//    2    4:return          
	}

	private static boolean abortCreation(Object obj)
	{
		boolean flag = ((Boolean)sAbortCreation.invoke(obj, new Object[0])).booleanValue();
	//    0    0:getstatic       #116 <Field Method sAbortCreation>
	//    1    3:aload_0         
	//    2    4:iconst_0        
	//    3    5:anewarray       Object[]
	//    4    8:invokevirtual   #153 <Method Object Method.invoke(Object, Object[])>
	//    5   11:checkcast       #72  <Class Boolean>
	//    6   14:invokevirtual   #157 <Method boolean Boolean.booleanValue()>
	//    7   17:istore_1        
		return flag;
	//    8   18:iload_1         
	//    9   19:ireturn         
		obj;
	//   10   20:astore_0        
_L2:
		throw new RuntimeException(((Throwable) (obj)));
	//   11   21:new             #159 <Class RuntimeException>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #162 <Method void RuntimeException(Throwable)>
	//   15   29:athrow          
		obj;
	//   16   30:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  17   31:goto            21
	}

	private static boolean addFontFromAssetManager(Context context, Object obj, String s, int i, int j, int k)
	{
		boolean flag = ((Boolean)sAddFontFromAssetManager.invoke(obj, new Object[] {
			context.getAssets(), s, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), null
		})).booleanValue();
	//    0    0:getstatic       #110 <Field Method sAddFontFromAssetManager>
	//    1    3:aload_1         
	//    2    4:bipush          8
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:invokevirtual   #169 <Method AssetManager Context.getAssets()>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_2         
	//   12   19:aastore         
	//   13   20:dup             
	//   14   21:iconst_2        
	//   15   22:iconst_0        
	//   16   23:invokestatic    #173 <Method Integer Integer.valueOf(int)>
	//   17   26:aastore         
	//   18   27:dup             
	//   19   28:iconst_3        
	//   20   29:iconst_0        
	//   21   30:invokestatic    #176 <Method Boolean Boolean.valueOf(boolean)>
	//   22   33:aastore         
	//   23   34:dup             
	//   24   35:iconst_4        
	//   25   36:iload_3         
	//   26   37:invokestatic    #173 <Method Integer Integer.valueOf(int)>
	//   27   40:aastore         
	//   28   41:dup             
	//   29   42:iconst_5        
	//   30   43:iload           4
	//   31   45:invokestatic    #173 <Method Integer Integer.valueOf(int)>
	//   32   48:aastore         
	//   33   49:dup             
	//   34   50:bipush          6
	//   35   52:iload           5
	//   36   54:invokestatic    #173 <Method Integer Integer.valueOf(int)>
	//   37   57:aastore         
	//   38   58:dup             
	//   39   59:bipush          7
	//   40   61:aconst_null     
	//   41   62:aastore         
	//   42   63:invokevirtual   #153 <Method Object Method.invoke(Object, Object[])>
	//   43   66:checkcast       #72  <Class Boolean>
	//   44   69:invokevirtual   #157 <Method boolean Boolean.booleanValue()>
	//   45   72:istore          6
		return flag;
	//   46   74:iload           6
	//   47   76:ireturn         
		context;
	//   48   77:astore_0        
_L2:
		throw new RuntimeException(((Throwable) (context)));
	//   49   78:new             #159 <Class RuntimeException>
	//   50   81:dup             
	//   51   82:aload_0         
	//   52   83:invokespecial   #162 <Method void RuntimeException(Throwable)>
	//   53   86:athrow          
		context;
	//   54   87:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  55   88:goto            78
	}

	private static boolean addFontFromBuffer(Object obj, ByteBuffer bytebuffer, int i, int j, int k)
	{
		boolean flag = ((Boolean)sAddFontFromBuffer.invoke(obj, new Object[] {
			bytebuffer, Integer.valueOf(i), null, Integer.valueOf(j), Integer.valueOf(k)
		})).booleanValue();
	//    0    0:getstatic       #112 <Field Method sAddFontFromBuffer>
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
	//   11   15:invokestatic    #173 <Method Integer Integer.valueOf(int)>
	//   12   18:aastore         
	//   13   19:dup             
	//   14   20:iconst_2        
	//   15   21:aconst_null     
	//   16   22:aastore         
	//   17   23:dup             
	//   18   24:iconst_3        
	//   19   25:iload_3         
	//   20   26:invokestatic    #173 <Method Integer Integer.valueOf(int)>
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_4        
	//   24   32:iload           4
	//   25   34:invokestatic    #173 <Method Integer Integer.valueOf(int)>
	//   26   37:aastore         
	//   27   38:invokevirtual   #153 <Method Object Method.invoke(Object, Object[])>
	//   28   41:checkcast       #72  <Class Boolean>
	//   29   44:invokevirtual   #157 <Method boolean Boolean.booleanValue()>
	//   30   47:istore          5
		return flag;
	//   31   49:iload           5
	//   32   51:ireturn         
		obj;
	//   33   52:astore_0        
_L2:
		throw new RuntimeException(((Throwable) (obj)));
	//   34   53:new             #159 <Class RuntimeException>
	//   35   56:dup             
	//   36   57:aload_0         
	//   37   58:invokespecial   #162 <Method void RuntimeException(Throwable)>
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
	//    0    0:getstatic       #108 <Field Class sFontFamily>
	//    1    3:iconst_1        
	//    2    4:invokestatic    #89  <Method Object Array.newInstance(Class, int)>
	//    3    7:astore_1        
		Array.set(obj1, 0, obj);
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:invokestatic    #182 <Method void Array.set(Object, int, Object)>
		obj = ((Object) ((Typeface)sCreateFromFamiliesWithDefault.invoke(((Object) (null)), new Object[] {
			obj1, Integer.valueOf(-1), Integer.valueOf(-1)
		})));
	//    8   14:getstatic       #118 <Field Method sCreateFromFamiliesWithDefault>
	//    9   17:aconst_null     
	//   10   18:iconst_3        
	//   11   19:anewarray       Object[]
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:aload_1         
	//   15   25:aastore         
	//   16   26:dup             
	//   17   27:iconst_1        
	//   18   28:iconst_m1       
	//   19   29:invokestatic    #173 <Method Integer Integer.valueOf(int)>
	//   20   32:aastore         
	//   21   33:dup             
	//   22   34:iconst_2        
	//   23   35:iconst_m1       
	//   24   36:invokestatic    #173 <Method Integer Integer.valueOf(int)>
	//   25   39:aastore         
	//   26   40:invokevirtual   #153 <Method Object Method.invoke(Object, Object[])>
	//   27   43:checkcast       #83  <Class Typeface>
	//   28   46:astore_0        
		return ((Typeface) (obj));
	//   29   47:aload_0         
	//   30   48:areturn         
		obj;
	//   31   49:astore_0        
_L2:
		throw new RuntimeException(((Throwable) (obj)));
	//   32   50:new             #159 <Class RuntimeException>
	//   33   53:dup             
	//   34   54:aload_0         
	//   35   55:invokespecial   #162 <Method void RuntimeException(Throwable)>
	//   36   58:athrow          
		obj;
	//   37   59:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  38   60:goto            50
	}

	private static boolean freeze(Object obj)
	{
		boolean flag = ((Boolean)sFreeze.invoke(obj, new Object[0])).booleanValue();
	//    0    0:getstatic       #114 <Field Method sFreeze>
	//    1    3:aload_0         
	//    2    4:iconst_0        
	//    3    5:anewarray       Object[]
	//    4    8:invokevirtual   #153 <Method Object Method.invoke(Object, Object[])>
	//    5   11:checkcast       #72  <Class Boolean>
	//    6   14:invokevirtual   #157 <Method boolean Boolean.booleanValue()>
	//    7   17:istore_1        
		return flag;
	//    8   18:iload_1         
	//    9   19:ireturn         
		obj;
	//   10   20:astore_0        
_L2:
		throw new RuntimeException(((Throwable) (obj)));
	//   11   21:new             #159 <Class RuntimeException>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #162 <Method void RuntimeException(Throwable)>
	//   15   29:athrow          
		obj;
	//   16   30:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  17   31:goto            21
	}

	private static boolean isFontFamilyPrivateAPIAvailable()
	{
		if(sAddFontFromAssetManager == null)
	//*   0    0:getstatic       #110 <Field Method sAddFontFromAssetManager>
	//*   1    3:ifnonnull       14
			Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
	//    2    6:ldc1            #35  <String "TypefaceCompatApi26Impl">
	//    3    8:ldc1            #185 <String "Unable to collect necessary private methods.Fallback to legacy implementation.">
	//    4   10:invokestatic    #189 <Method int Log.w(String, String)>
	//    5   13:pop             
		return sAddFontFromAssetManager != null;
	//    6   14:getstatic       #110 <Field Method sAddFontFromAssetManager>
	//    7   17:ifnull          22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private static Object newFamily()
	{
		Object obj = sFontFamilyCtor.newInstance(new Object[0]);
	//    0    0:getstatic       #106 <Field Constructor sFontFamilyCtor>
	//    1    3:iconst_0        
	//    2    4:anewarray       Object[]
	//    3    7:invokevirtual   #198 <Method Object Constructor.newInstance(Object[])>
	//    4   10:astore_0        
		return obj;
	//    5   11:aload_0         
	//    6   12:areturn         
		Object obj1;
		obj1;
	//    7   13:astore_0        
_L2:
		throw new RuntimeException(((Throwable) (obj1)));
	//    8   14:new             #159 <Class RuntimeException>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #162 <Method void RuntimeException(Throwable)>
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
		if(!isFontFamilyPrivateAPIAvailable())
	//*   0    0:invokestatic    #202 <Method boolean isFontFamilyPrivateAPIAvailable()>
	//*   1    3:ifne            16
			return super.createFromFontFamilyFilesResourceEntry(context, fontfamilyfilesresourceentry, resources, i);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:iload           4
	//    7   12:invokespecial   #204 <Method Typeface TypefaceCompatApi21Impl.createFromFontFamilyFilesResourceEntry(Context, android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry, Resources, int)>
	//    8   15:areturn         
		resources = ((Resources) (newFamily()));
	//    9   16:invokestatic    #206 <Method Object newFamily()>
	//   10   19:astore_3        
		fontfamilyfilesresourceentry = ((android.support.v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry) (fontfamilyfilesresourceentry.getEntries()));
	//   11   20:aload_2         
	//   12   21:invokevirtual   #212 <Method android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry[] android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry.getEntries()>
	//   13   24:astore_2        
		int k = fontfamilyfilesresourceentry.length;
	//   14   25:aload_2         
	//   15   26:arraylength     
	//   16   27:istore          6
		int j;
		for(i = 0; i < k; i++)
	//*  17   29:iconst_0        
	//*  18   30:istore          4
	//*  19   32:iload           4
	//*  20   34:iload           6
	//*  21   36:icmpge          107
		{
			android.support.v4.content.res.FontResourcesParserCompat.FontFileResourceEntry fontfileresourceentry = ((android.support.v4.content.res.FontResourcesParserCompat.FontFileResourceEntry) (fontfamilyfilesresourceentry[i]));
	//   22   39:aload_2         
	//   23   40:iload           4
	//   24   42:aaload          
	//   25   43:astore          8
			String s = fontfileresourceentry.getFileName();
	//   26   45:aload           8
	//   27   47:invokevirtual   #217 <Method String android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.getFileName()>
	//   28   50:astore          9
			int l = fontfileresourceentry.getWeight();
	//   29   52:aload           8
	//   30   54:invokevirtual   #221 <Method int android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.getWeight()>
	//   31   57:istore          7
			if(fontfileresourceentry.isItalic())
	//*  32   59:aload           8
	//*  33   61:invokevirtual   #224 <Method boolean android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.isItalic()>
	//*  34   64:ifeq            92
				j = 1;
	//   35   67:iconst_1        
	//   36   68:istore          5
			else
	//*  37   70:aload_1         
	//*  38   71:aload_3         
	//*  39   72:aload           9
	//*  40   74:iconst_0        
	//*  41   75:iload           7
	//*  42   77:iload           5
	//*  43   79:invokestatic    #226 <Method boolean addFontFromAssetManager(Context, Object, String, int, int, int)>
	//*  44   82:ifne            98
	//*  45   85:aload_3         
	//*  46   86:invokestatic    #228 <Method boolean abortCreation(Object)>
	//*  47   89:pop             
	//*  48   90:aconst_null     
	//*  49   91:areturn         
				j = 0;
	//   50   92:iconst_0        
	//   51   93:istore          5
			if(!addFontFromAssetManager(context, ((Object) (resources)), s, 0, l, j))
			{
				abortCreation(((Object) (resources)));
				return null;
			}
		}

	//   52   95:goto            70
	//   53   98:iload           4
	//   54  100:iconst_1        
	//   55  101:iadd            
	//   56  102:istore          4
	//*  57  104:goto            32
		if(!freeze(((Object) (resources))))
	//*  58  107:aload_3         
	//*  59  108:invokestatic    #230 <Method boolean freeze(Object)>
	//*  60  111:ifne            116
			return null;
	//   61  114:aconst_null     
	//   62  115:areturn         
		else
			return createFromFamiliesWithDefault(((Object) (resources)));
	//   63  116:aload_3         
	//   64  117:invokestatic    #232 <Method Typeface createFromFamiliesWithDefault(Object)>
	//   65  120:areturn         
	}

	public Typeface createFromFontInfo(Context context, CancellationSignal cancellationsignal, android.support.v4.provider.FontsContractCompat.FontInfo afontinfo[], int i)
	{
		if(afontinfo.length >= 1) goto _L2; else goto _L1
	//    0    0:aload_3         
	//    1    1:arraylength     
	//    2    2:iconst_1        
	//    3    3:icmpge          10
_L1:
		cancellationsignal = null;
	//    4    6:aconst_null     
	//    5    7:astore_2        
_L6:
		return ((Typeface) (cancellationsignal));
	//    6    8:aload_2         
	//    7    9:areturn         
_L2:
		if(isFontFamilyPrivateAPIAvailable()) goto _L4; else goto _L3
	//    8   10:invokestatic    #202 <Method boolean isFontFamilyPrivateAPIAvailable()>
	//    9   13:ifne            142
_L3:
		Object obj = ((Object) (findBestInfo(afontinfo, i)));
	//   10   16:aload_0         
	//   11   17:aload_3         
	//   12   18:iload           4
	//   13   20:invokevirtual   #244 <Method android.support.v4.provider.FontsContractCompat$FontInfo findBestInfo(android.support.v4.provider.FontsContractCompat$FontInfo[], int)>
	//   14   23:astore          9
		context = ((Context) (context.getContentResolver()));
	//   15   25:aload_1         
	//   16   26:invokevirtual   #248 <Method ContentResolver Context.getContentResolver()>
	//   17   29:astore_1        
		int j;
		int k;
		int l;
		int i1;
		Map map;
		try
		{
			afontinfo = ((android.support.v4.provider.FontsContractCompat.FontInfo []) (((ContentResolver) (context)).openFileDescriptor(((android.support.v4.provider.FontsContractCompat.FontInfo) (obj)).getUri(), "r", cancellationsignal)));
	//   18   30:aload_1         
	//   19   31:aload           9
	//   20   33:invokevirtual   #254 <Method android.net.Uri android.support.v4.provider.FontsContractCompat$FontInfo.getUri()>
	//   21   36:ldc2            #256 <String "r">
	//   22   39:aload_2         
	//   23   40:invokevirtual   #262 <Method ParcelFileDescriptor ContentResolver.openFileDescriptor(android.net.Uri, String, CancellationSignal)>
	//   24   43:astore_3        
		}
	//*  25   44:aconst_null     
	//*  26   45:astore_2        
	//*  27   46:new             #264 <Class android.graphics.Typeface$Builder>
	//*  28   49:dup             
	//*  29   50:aload_3         
	//*  30   51:invokevirtual   #270 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//*  31   54:invokespecial   #273 <Method void android.graphics.Typeface$Builder(java.io.FileDescriptor)>
	//*  32   57:aload           9
	//*  33   59:invokevirtual   #274 <Method int android.support.v4.provider.FontsContractCompat$FontInfo.getWeight()>
	//*  34   62:invokevirtual   #278 <Method android.graphics.Typeface$Builder android.graphics.Typeface$Builder.setWeight(int)>
	//*  35   65:aload           9
	//*  36   67:invokevirtual   #279 <Method boolean android.support.v4.provider.FontsContractCompat$FontInfo.isItalic()>
	//*  37   70:invokevirtual   #283 <Method android.graphics.Typeface$Builder android.graphics.Typeface$Builder.setItalic(boolean)>
	//*  38   73:invokevirtual   #287 <Method Typeface android.graphics.Typeface$Builder.build()>
	//*  39   76:astore_1        
	//*  40   77:aload_1         
	//*  41   78:astore_2        
	//*  42   79:aload_3         
	//*  43   80:ifnull          8
	//*  44   83:iconst_0        
	//*  45   84:ifeq            102
	//*  46   87:aload_3         
	//*  47   88:invokevirtual   #290 <Method void ParcelFileDescriptor.close()>
	//*  48   91:aload_1         
	//*  49   92:areturn         
	//*  50   93:astore_1        
	//*  51   94:new             #292 <Class NullPointerException>
	//*  52   97:dup             
	//*  53   98:invokespecial   #293 <Method void NullPointerException()>
	//*  54  101:athrow          
	//*  55  102:aload_3         
	//*  56  103:invokevirtual   #290 <Method void ParcelFileDescriptor.close()>
	//*  57  106:aload_1         
	//*  58  107:areturn         
	//*  59  108:astore_2        
	//*  60  109:aload_2         
	//*  61  110:athrow          
	//*  62  111:astore_1        
	//*  63  112:aload_3         
	//*  64  113:ifnull          124
	//*  65  116:aload_2         
	//*  66  117:ifnull          135
	//*  67  120:aload_3         
	//*  68  121:invokevirtual   #290 <Method void ParcelFileDescriptor.close()>
	//*  69  124:aload_1         
	//*  70  125:athrow          
	//*  71  126:astore_3        
	//*  72  127:aload_2         
	//*  73  128:aload_3         
	//*  74  129:invokevirtual   #296 <Method void Throwable.addSuppressed(Throwable)>
	//*  75  132:goto            124
	//*  76  135:aload_3         
	//*  77  136:invokevirtual   #290 <Method void ParcelFileDescriptor.close()>
	//*  78  139:goto            124
	//*  79  142:aload_1         
	//*  80  143:aload_3         
	//*  81  144:aload_2         
	//*  82  145:invokestatic    #302 <Method Map FontsContractCompat.prepareFontData(Context, android.support.v4.provider.FontsContractCompat$FontInfo[], CancellationSignal)>
	//*  83  148:astore          10
	//*  84  150:invokestatic    #206 <Method Object newFamily()>
	//*  85  153:astore_2        
	//*  86  154:iconst_0        
	//*  87  155:istore          5
	//*  88  157:aload_3         
	//*  89  158:arraylength     
	//*  90  159:istore          6
	//*  91  161:iconst_0        
	//*  92  162:istore          4
	//*  93  164:iload           4
	//*  94  166:iload           6
	//*  95  168:icmpge          262
	//*  96  171:aload_3         
	//*  97  172:iload           4
	//*  98  174:aaload          
	//*  99  175:astore_1        
	//* 100  176:aload           10
	//* 101  178:aload_1         
	//* 102  179:invokevirtual   #254 <Method android.net.Uri android.support.v4.provider.FontsContractCompat$FontInfo.getUri()>
	//* 103  182:invokeinterface #308 <Method Object Map.get(Object)>
	//* 104  187:checkcast       #81  <Class ByteBuffer>
	//* 105  190:astore          9
	//* 106  192:aload           9
	//* 107  194:ifnonnull       206
	//* 108  197:iload           4
	//* 109  199:iconst_1        
	//* 110  200:iadd            
	//* 111  201:istore          4
	//* 112  203:goto            164
	//* 113  206:aload_1         
	//* 114  207:invokevirtual   #311 <Method int android.support.v4.provider.FontsContractCompat$FontInfo.getTtcIndex()>
	//* 115  210:istore          8
	//* 116  212:aload_1         
	//* 117  213:invokevirtual   #274 <Method int android.support.v4.provider.FontsContractCompat$FontInfo.getWeight()>
	//* 118  216:istore          7
	//* 119  218:aload_1         
	//* 120  219:invokevirtual   #279 <Method boolean android.support.v4.provider.FontsContractCompat$FontInfo.isItalic()>
	//* 121  222:ifeq            250
	//* 122  225:iconst_1        
	//* 123  226:istore          5
	//* 124  228:aload_2         
	//* 125  229:aload           9
	//* 126  231:iload           8
	//* 127  233:iload           7
	//* 128  235:iload           5
	//* 129  237:invokestatic    #313 <Method boolean addFontFromBuffer(Object, ByteBuffer, int, int, int)>
	//* 130  240:ifne            256
	//* 131  243:aload_2         
	//* 132  244:invokestatic    #228 <Method boolean abortCreation(Object)>
	//* 133  247:pop             
	//* 134  248:aconst_null     
	//* 135  249:areturn         
	//* 136  250:iconst_0        
	//* 137  251:istore          5
	//* 138  253:goto            228
	//* 139  256:iconst_1        
	//* 140  257:istore          5
	//* 141  259:goto            197
	//* 142  262:iload           5
	//* 143  264:ifne            274
	//* 144  267:aload_2         
	//* 145  268:invokestatic    #228 <Method boolean abortCreation(Object)>
	//* 146  271:pop             
	//* 147  272:aconst_null     
	//* 148  273:areturn         
	//* 149  274:aload_2         
	//* 150  275:invokestatic    #230 <Method boolean freeze(Object)>
	//* 151  278:ifne            283
	//* 152  281:aconst_null     
	//* 153  282:areturn         
	//* 154  283:aload_2         
	//* 155  284:invokestatic    #232 <Method Typeface createFromFamiliesWithDefault(Object)>
	//* 156  287:areturn         
	//* 157  288:astore_1        
	//* 158  289:goto            112
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 159  292:astore_1        
		{
			return null;
	//  160  293:aconst_null     
	//  161  294:areturn         
		}
		cancellationsignal = null;
		context = ((Context) ((new android.graphics.Typeface.Builder(((ParcelFileDescriptor) (afontinfo)).getFileDescriptor())).setWeight(((android.support.v4.provider.FontsContractCompat.FontInfo) (obj)).getWeight()).setItalic(((android.support.v4.provider.FontsContractCompat.FontInfo) (obj)).isItalic()).build()));
		cancellationsignal = ((CancellationSignal) (context));
		if(afontinfo == null) goto _L6; else goto _L5
_L5:
		if(true)
			break MISSING_BLOCK_LABEL_102;
		((ParcelFileDescriptor) (afontinfo)).close();
		return ((Typeface) (context));
		context;
		throw new NullPointerException();
		((ParcelFileDescriptor) (afontinfo)).close();
		return ((Typeface) (context));
		cancellationsignal;
		throw cancellationsignal;
		context;
_L9:
		if(afontinfo == null)
			break MISSING_BLOCK_LABEL_124;
		if(cancellationsignal == null)
			break MISSING_BLOCK_LABEL_135;
		((ParcelFileDescriptor) (afontinfo)).close();
_L7:
		throw context;
		afontinfo;
		((Throwable) (cancellationsignal)).addSuppressed(((Throwable) (afontinfo)));
		  goto _L7
		((ParcelFileDescriptor) (afontinfo)).close();
		  goto _L7
_L4:
		map = FontsContractCompat.prepareFontData(context, afontinfo, cancellationsignal);
		cancellationsignal = ((CancellationSignal) (newFamily()));
		j = 0;
		k = afontinfo.length;
		i = 0;
		while(i < k) 
		{
			context = ((Context) (afontinfo[i]));
			obj = ((Object) ((ByteBuffer)map.get(((Object) (((android.support.v4.provider.FontsContractCompat.FontInfo) (context)).getUri())))));
			if(obj != null)
			{
				i1 = ((android.support.v4.provider.FontsContractCompat.FontInfo) (context)).getTtcIndex();
				l = ((android.support.v4.provider.FontsContractCompat.FontInfo) (context)).getWeight();
				if(((android.support.v4.provider.FontsContractCompat.FontInfo) (context)).isItalic())
					j = 1;
				else
					j = 0;
				if(!addFontFromBuffer(((Object) (cancellationsignal)), ((ByteBuffer) (obj)), i1, l, j))
				{
					abortCreation(((Object) (cancellationsignal)));
					return null;
				}
				j = 1;
			}
			i++;
		}
		if(j == 0)
		{
			abortCreation(((Object) (cancellationsignal)));
			return null;
		}
		if(!freeze(((Object) (cancellationsignal))))
			return null;
		else
			return createFromFamiliesWithDefault(((Object) (cancellationsignal)));
		context;
		if(true) goto _L9; else goto _L8
_L8:
	}

	public Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String s, int j)
	{
		if(!isFontFamilyPrivateAPIAvailable())
	//*   0    0:invokestatic    #202 <Method boolean isFontFamilyPrivateAPIAvailable()>
	//*   1    3:ifne            18
			return super.createFromResourcesFontFile(context, resources, i, s, j);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:iload_3         
	//    6   10:aload           4
	//    7   12:iload           5
	//    8   14:invokespecial   #318 <Method Typeface TypefaceCompatApi21Impl.createFromResourcesFontFile(Context, Resources, int, String, int)>
	//    9   17:areturn         
		resources = ((Resources) (newFamily()));
	//   10   18:invokestatic    #206 <Method Object newFamily()>
	//   11   21:astore_2        
		if(!addFontFromAssetManager(context, ((Object) (resources)), s, 0, -1, -1))
	//*  12   22:aload_1         
	//*  13   23:aload_2         
	//*  14   24:aload           4
	//*  15   26:iconst_0        
	//*  16   27:iconst_m1       
	//*  17   28:iconst_m1       
	//*  18   29:invokestatic    #226 <Method boolean addFontFromAssetManager(Context, Object, String, int, int, int)>
	//*  19   32:ifne            42
		{
			abortCreation(((Object) (resources)));
	//   20   35:aload_2         
	//   21   36:invokestatic    #228 <Method boolean abortCreation(Object)>
	//   22   39:pop             
			return null;
	//   23   40:aconst_null     
	//   24   41:areturn         
		}
		if(!freeze(((Object) (resources))))
	//*  25   42:aload_2         
	//*  26   43:invokestatic    #230 <Method boolean freeze(Object)>
	//*  27   46:ifne            51
			return null;
	//   28   49:aconst_null     
	//   29   50:areturn         
		else
			return createFromFamiliesWithDefault(((Object) (resources)));
	//   30   51:aload_2         
	//   31   52:invokestatic    #232 <Method Typeface createFromFamiliesWithDefault(Object)>
	//   32   55:areturn         
	}

	private static final String ABORT_CREATION_METHOD = "abortCreation";
	private static final String ADD_FONT_FROM_ASSET_MANAGER_METHOD = "addFontFromAssetManager";
	private static final String ADD_FONT_FROM_BUFFER_METHOD = "addFontFromBuffer";
	private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
	private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
	private static final String FREEZE_METHOD = "freeze";
	private static final int RESOLVE_BY_FONT_TABLE = -1;
	private static final String TAG = "TypefaceCompatApi26Impl";
	private static final Method sAbortCreation;
	private static final Method sAddFontFromAssetManager;
	private static final Method sAddFontFromBuffer;
	private static final Method sCreateFromFamiliesWithDefault;
	private static final Class sFontFamily;
	private static final Constructor sFontFamilyCtor;
	private static final Method sFreeze;

	static 
	{
		Object obj;
		Method method;
		Method method1;
		Method method2;
		Class class1;
		Constructor constructor;
		Method method3;
		class1 = Class.forName("android.graphics.FontFamily");
	//    0    0:ldc1            #26  <String "android.graphics.FontFamily">
	//    1    2:invokestatic    #57  <Method Class Class.forName(String)>
	//    2    5:astore          4
		constructor = class1.getConstructor(new Class[0]);
	//    3    7:aload           4
	//    4    9:iconst_0        
	//    5   10:anewarray       Class[]
	//    6   13:invokevirtual   #61  <Method Constructor Class.getConstructor(Class[])>
	//    7   16:astore          5
		method = class1.getMethod("addFontFromAssetManager", new Class[] {
			android/content/res/AssetManager, java/lang/String, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, [Landroid/graphics/fonts/FontVariationAxis;
		});
	//    8   18:aload           4
	//    9   20:ldc1            #17  <String "addFontFromAssetManager">
	//   10   22:bipush          8
	//   11   24:anewarray       Class[]
	//   12   27:dup             
	//   13   28:iconst_0        
	//   14   29:ldc1            #63  <Class AssetManager>
	//   15   31:aastore         
	//   16   32:dup             
	//   17   33:iconst_1        
	//   18   34:ldc1            #65  <Class String>
	//   19   36:aastore         
	//   20   37:dup             
	//   21   38:iconst_2        
	//   22   39:getstatic       #70  <Field Class Integer.TYPE>
	//   23   42:aastore         
	//   24   43:dup             
	//   25   44:iconst_3        
	//   26   45:getstatic       #73  <Field Class Boolean.TYPE>
	//   27   48:aastore         
	//   28   49:dup             
	//   29   50:iconst_4        
	//   30   51:getstatic       #70  <Field Class Integer.TYPE>
	//   31   54:aastore         
	//   32   55:dup             
	//   33   56:iconst_5        
	//   34   57:getstatic       #70  <Field Class Integer.TYPE>
	//   35   60:aastore         
	//   36   61:dup             
	//   37   62:bipush          6
	//   38   64:getstatic       #70  <Field Class Integer.TYPE>
	//   39   67:aastore         
	//   40   68:dup             
	//   41   69:bipush          7
	//   42   71:ldc1            #75  <Class android.graphics.fonts.FontVariationAxis[]>
	//   43   73:aastore         
	//   44   74:invokevirtual   #79  <Method Method Class.getMethod(String, Class[])>
	//   45   77:astore_1        
		method1 = class1.getMethod("addFontFromBuffer", new Class[] {
			java/nio/ByteBuffer, Integer.TYPE, [Landroid/graphics/fonts/FontVariationAxis;, Integer.TYPE, Integer.TYPE
		});
	//   46   78:aload           4
	//   47   80:ldc1            #20  <String "addFontFromBuffer">
	//   48   82:iconst_5        
	//   49   83:anewarray       Class[]
	//   50   86:dup             
	//   51   87:iconst_0        
	//   52   88:ldc1            #81  <Class ByteBuffer>
	//   53   90:aastore         
	//   54   91:dup             
	//   55   92:iconst_1        
	//   56   93:getstatic       #70  <Field Class Integer.TYPE>
	//   57   96:aastore         
	//   58   97:dup             
	//   59   98:iconst_2        
	//   60   99:ldc1            #75  <Class android.graphics.fonts.FontVariationAxis[]>
	//   61  101:aastore         
	//   62  102:dup             
	//   63  103:iconst_3        
	//   64  104:getstatic       #70  <Field Class Integer.TYPE>
	//   65  107:aastore         
	//   66  108:dup             
	//   67  109:iconst_4        
	//   68  110:getstatic       #70  <Field Class Integer.TYPE>
	//   69  113:aastore         
	//   70  114:invokevirtual   #79  <Method Method Class.getMethod(String, Class[])>
	//   71  117:astore_2        
		method3 = class1.getMethod("freeze", new Class[0]);
	//   72  118:aload           4
	//   73  120:ldc1            #29  <String "freeze">
	//   74  122:iconst_0        
	//   75  123:anewarray       Class[]
	//   76  126:invokevirtual   #79  <Method Method Class.getMethod(String, Class[])>
	//   77  129:astore          6
		obj = ((Object) (class1.getMethod("abortCreation", new Class[0])));
	//   78  131:aload           4
	//   79  133:ldc1            #14  <String "abortCreation">
	//   80  135:iconst_0        
	//   81  136:anewarray       Class[]
	//   82  139:invokevirtual   #79  <Method Method Class.getMethod(String, Class[])>
	//   83  142:astore_0        
		method2 = ((Class) (android/graphics/Typeface)).getDeclaredMethod("createFromFamiliesWithDefault", new Class[] {
			Array.newInstance(class1, 1).getClass(), Integer.TYPE, Integer.TYPE
		});
	//   84  143:ldc1            #83  <Class Typeface>
	//   85  145:ldc1            #23  <String "createFromFamiliesWithDefault">
	//   86  147:iconst_3        
	//   87  148:anewarray       Class[]
	//   88  151:dup             
	//   89  152:iconst_0        
	//   90  153:aload           4
	//   91  155:iconst_1        
	//   92  156:invokestatic    #89  <Method Object Array.newInstance(Class, int)>
	//   93  159:invokevirtual   #95  <Method Class Object.getClass()>
	//   94  162:aastore         
	//   95  163:dup             
	//   96  164:iconst_1        
	//   97  165:getstatic       #70  <Field Class Integer.TYPE>
	//   98  168:aastore         
	//   99  169:dup             
	//  100  170:iconst_2        
	//  101  171:getstatic       #70  <Field Class Integer.TYPE>
	//  102  174:aastore         
	//  103  175:invokevirtual   #98  <Method Method Class.getDeclaredMethod(String, Class[])>
	//  104  178:astore_3        
		method2.setAccessible(true);
	//  105  179:aload_3         
	//  106  180:iconst_1        
	//  107  181:invokevirtual   #104 <Method void Method.setAccessible(boolean)>
_L2:
		sFontFamilyCtor = constructor;
	//  108  184:aload           5
	//  109  186:putstatic       #106 <Field Constructor sFontFamilyCtor>
		sFontFamily = class1;
	//  110  189:aload           4
	//  111  191:putstatic       #108 <Field Class sFontFamily>
		sAddFontFromAssetManager = method;
	//  112  194:aload_1         
	//  113  195:putstatic       #110 <Field Method sAddFontFromAssetManager>
		sAddFontFromBuffer = method1;
	//  114  198:aload_2         
	//  115  199:putstatic       #112 <Field Method sAddFontFromBuffer>
		sFreeze = method3;
	//  116  202:aload           6
	//  117  204:putstatic       #114 <Field Method sFreeze>
		sAbortCreation = ((Method) (obj));
	//  118  207:aload_0         
	//  119  208:putstatic       #116 <Field Method sAbortCreation>
		sCreateFromFamiliesWithDefault = method2;
	//  120  211:aload_3         
	//  121  212:putstatic       #118 <Field Method sCreateFromFamiliesWithDefault>
		return;
	//  122  215:return          
		ClassNotFoundException classnotfoundexception;
		classnotfoundexception;
	//  123  216:astore_0        
_L3:
		Log.e("TypefaceCompatApi26Impl", (new StringBuilder()).append("Unable to collect necessary methods for class ").append(((Object) (classnotfoundexception)).getClass().getName()).toString(), ((Throwable) (classnotfoundexception)));
	//  124  217:ldc1            #35  <String "TypefaceCompatApi26Impl">
	//  125  219:new             #120 <Class StringBuilder>
	//  126  222:dup             
	//  127  223:invokespecial   #123 <Method void StringBuilder()>
	//  128  226:ldc1            #125 <String "Unable to collect necessary methods for class ">
	//  129  228:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  130  231:aload_0         
	//  131  232:invokevirtual   #95  <Method Class Object.getClass()>
	//  132  235:invokevirtual   #133 <Method String Class.getName()>
	//  133  238:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  134  241:invokevirtual   #136 <Method String StringBuilder.toString()>
	//  135  244:aload_0         
	//  136  245:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//  137  248:pop             
		class1 = null;
	//  138  249:aconst_null     
	//  139  250:astore          4
		constructor = null;
	//  140  252:aconst_null     
	//  141  253:astore          5
		method = null;
	//  142  255:aconst_null     
	//  143  256:astore_1        
		method1 = null;
	//  144  257:aconst_null     
	//  145  258:astore_2        
		method3 = null;
	//  146  259:aconst_null     
	//  147  260:astore          6
		classnotfoundexception = null;
	//  148  262:aconst_null     
	//  149  263:astore_0        
		method2 = null;
	//  150  264:aconst_null     
	//  151  265:astore_3        
		if(true) goto _L2; else goto _L1
	//  152  266:goto            184
_L1:
		classnotfoundexception;
	//  153  269:astore_0        
		  goto _L3
	//* 154  270:goto            217
	}
}
