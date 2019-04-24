// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.*;

// Referenced classes of package android.support.v4.graphics:
//			TypefaceCompat, TypefaceCompatUtil

class TypefaceCompatBaseImpl
	implements TypefaceCompat.TypefaceCompatImpl
{
	private static interface StyleExtractor
	{

		public abstract int getWeight(Object obj);

		public abstract boolean isItalic(Object obj);
	}


	TypefaceCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	private android.support.v4.content.res.FontResourcesParserCompat.FontFileResourceEntry findBestEntry(android.support.v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontfamilyfilesresourceentry, int i)
	{
		return (android.support.v4.content.res.FontResourcesParserCompat.FontFileResourceEntry)findBestFont(((Object []) (fontfamilyfilesresourceentry.getEntries())), i, new StyleExtractor() {

			public int getWeight(android.support.v4.content.res.FontResourcesParserCompat.FontFileResourceEntry fontfileresourceentry)
			{
				return fontfileresourceentry.getWeight();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #29  <Method int android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.getWeight()>
			//    2    4:ireturn         
			}

			public volatile int getWeight(Object obj)
			{
				return getWeight((android.support.v4.content.res.FontResourcesParserCompat.FontFileResourceEntry)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry>
			//    3    5:invokevirtual   #32  <Method int getWeight(android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry)>
			//    4    8:ireturn         
			}

			public boolean isItalic(android.support.v4.content.res.FontResourcesParserCompat.FontFileResourceEntry fontfileresourceentry)
			{
				return fontfileresourceentry.isItalic();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #37  <Method boolean android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.isItalic()>
			//    2    4:ireturn         
			}

			public volatile boolean isItalic(Object obj)
			{
				return isItalic((android.support.v4.content.res.FontResourcesParserCompat.FontFileResourceEntry)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry>
			//    3    5:invokevirtual   #40  <Method boolean isItalic(android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry)>
			//    4    8:ireturn         
			}

			final TypefaceCompatBaseImpl this$0;

			
			{
				this$0 = TypefaceCompatBaseImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TypefaceCompatBaseImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #39  <Method android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry[] android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry.getEntries()>
	//    2    4:iload_2         
	//    3    5:new             #10  <Class TypefaceCompatBaseImpl$2>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #42  <Method void TypefaceCompatBaseImpl$2(TypefaceCompatBaseImpl)>
	//    7   13:invokestatic    #46  <Method Object findBestFont(Object[], int, TypefaceCompatBaseImpl$StyleExtractor)>
	//    8   16:checkcast       #48  <Class android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry>
	//    9   19:areturn         
	}

	private static Object findBestFont(Object aobj[], int i, StyleExtractor styleextractor)
	{
		char c;
		int j;
		int i1;
		boolean flag;
		Object obj;
		if((i & 1) == 0)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifne            118
			c = '\u0190';
	//    4    6:sipush          400
	//    5    9:istore_3        
		else
	//*   6   10:iload_1         
	//*   7   11:iconst_2        
	//*   8   12:iand            
	//*   9   13:ifeq            125
	//*  10   16:iconst_1        
	//*  11   17:istore          8
	//*  12   19:aconst_null     
	//*  13   20:astore          9
	//*  14   22:ldc1            #49  <Int 0x7fffffff>
	//*  15   24:istore          4
	//*  16   26:aload_0         
	//*  17   27:arraylength     
	//*  18   28:istore          7
	//*  19   30:iconst_0        
	//*  20   31:istore_1        
	//*  21   32:iload_1         
	//*  22   33:iload           7
	//*  23   35:icmpge          137
	//*  24   38:aload_0         
	//*  25   39:iload_1         
	//*  26   40:aaload          
	//*  27   41:astore          10
	//*  28   43:aload_2         
	//*  29   44:aload           10
	//*  30   46:invokeinterface #53  <Method int TypefaceCompatBaseImpl$StyleExtractor.getWeight(Object)>
	//*  31   51:iload_3         
	//*  32   52:isub            
	//*  33   53:invokestatic    #59  <Method int Math.abs(int)>
	//*  34   56:istore          6
	//*  35   58:aload_2         
	//*  36   59:aload           10
	//*  37   61:invokeinterface #63  <Method boolean TypefaceCompatBaseImpl$StyleExtractor.isItalic(Object)>
	//*  38   66:iload           8
	//*  39   68:icmpne          131
	//*  40   71:iconst_0        
	//*  41   72:istore          5
	//*  42   74:iload           6
	//*  43   76:iconst_2        
	//*  44   77:imul            
	//*  45   78:iload           5
	//*  46   80:iadd            
	//*  47   81:istore          6
	//*  48   83:aload           9
	//*  49   85:ifnull          99
	//*  50   88:iload           4
	//*  51   90:istore          5
	//*  52   92:iload           4
	//*  53   94:iload           6
	//*  54   96:icmple          107
	//*  55   99:aload           10
	//*  56  101:astore          9
	//*  57  103:iload           6
	//*  58  105:istore          5
	//*  59  107:iload_1         
	//*  60  108:iconst_1        
	//*  61  109:iadd            
	//*  62  110:istore_1        
	//*  63  111:iload           5
	//*  64  113:istore          4
	//*  65  115:goto            32
			c = '\u02BC';
	//   66  118:sipush          700
	//   67  121:istore_3        
		if((i & 2) != 0)
			flag = true;
		else
	//*  68  122:goto            10
			flag = false;
	//   69  125:iconst_0        
	//   70  126:istore          8
		obj = null;
		j = 0x7fffffff;
		i1 = aobj.length;
		i = 0;
		while(i < i1) 
		{
label0:
			{
				Object obj1 = aobj[i];
				int l = Math.abs(styleextractor.getWeight(obj1) - c);
				int k;
				if(styleextractor.isItalic(obj1) == flag)
					k = 0;
				else
	//*  71  128:goto            19
					k = 1;
	//   72  131:iconst_1        
	//   73  132:istore          5
				l = l * 2 + k;
				if(obj != null)
				{
					k = j;
					if(j <= l)
						break label0;
				}
				obj = obj1;
				k = l;
			}
			i++;
			j = k;
		}
	//*  74  134:goto            74
		return obj;
	//   75  137:aload           9
	//   76  139:areturn         
	}

	public Typeface createFromFontFamilyFilesResourceEntry(Context context, android.support.v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontfamilyfilesresourceentry, Resources resources, int i)
	{
		fontfamilyfilesresourceentry = ((android.support.v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry) (findBestEntry(fontfamilyfilesresourceentry, i)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:iload           4
	//    3    4:invokespecial   #70  <Method android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry findBestEntry(android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry, int)>
	//    4    7:astore_2        
		if(fontfamilyfilesresourceentry == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       14
			return null;
	//    7   12:aconst_null     
	//    8   13:areturn         
		else
			return TypefaceCompat.createFromResourcesFontFile(context, resources, ((android.support.v4.content.res.FontResourcesParserCompat.FontFileResourceEntry) (fontfamilyfilesresourceentry)).getResourceId(), ((android.support.v4.content.res.FontResourcesParserCompat.FontFileResourceEntry) (fontfamilyfilesresourceentry)).getFileName(), i);
	//    9   14:aload_1         
	//   10   15:aload_3         
	//   11   16:aload_2         
	//   12   17:invokevirtual   #74  <Method int android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.getResourceId()>
	//   13   20:aload_2         
	//   14   21:invokevirtual   #78  <Method String android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.getFileName()>
	//   15   24:iload           4
	//   16   26:invokestatic    #84  <Method Typeface TypefaceCompat.createFromResourcesFontFile(Context, Resources, int, String, int)>
	//   17   29:areturn         
	}

	public Typeface createFromFontInfo(Context context, CancellationSignal cancellationsignal, android.support.v4.provider.FontsContractCompat.FontInfo afontinfo[], int i)
	{
		Object obj;
		if(afontinfo.length < 1)
	//*   0    0:aload_3         
	//*   1    1:arraylength     
	//*   2    2:iconst_1        
	//*   3    3:icmpge          8
			return null;
	//    4    6:aconst_null     
	//    5    7:areturn         
		obj = ((Object) (findBestInfo(afontinfo, i)));
	//    6    8:aload_0         
	//    7    9:aload_3         
	//    8   10:iload           4
	//    9   12:invokevirtual   #94  <Method android.support.v4.provider.FontsContractCompat$FontInfo findBestInfo(android.support.v4.provider.FontsContractCompat$FontInfo[], int)>
	//   10   15:astore          5
		afontinfo = null;
	//   11   17:aconst_null     
	//   12   18:astore_3        
		cancellationsignal = null;
	//   13   19:aconst_null     
	//   14   20:astore_2        
		try
		{
			obj = ((Object) (context.getContentResolver().openInputStream(((android.support.v4.provider.FontsContractCompat.FontInfo) (obj)).getUri())));
	//   15   21:aload_1         
	//   16   22:invokevirtual   #100 <Method ContentResolver Context.getContentResolver()>
	//   17   25:aload           5
	//   18   27:invokevirtual   #106 <Method android.net.Uri android.support.v4.provider.FontsContractCompat$FontInfo.getUri()>
	//   19   30:invokevirtual   #112 <Method InputStream ContentResolver.openInputStream(android.net.Uri)>
	//   20   33:astore          5
		}
	//*  21   35:aload           5
	//*  22   37:astore_2        
	//*  23   38:aload           5
	//*  24   40:astore_3        
	//*  25   41:aload_0         
	//*  26   42:aload_1         
	//*  27   43:aload           5
	//*  28   45:invokevirtual   #116 <Method Typeface createFromInputStream(Context, InputStream)>
	//*  29   48:astore_1        
	//*  30   49:aload           5
	//*  31   51:invokestatic    #122 <Method void TypefaceCompatUtil.closeQuietly(java.io.Closeable)>
	//*  32   54:aload_1         
	//*  33   55:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  34   56:astore_1        
		{
			TypefaceCompatUtil.closeQuietly(((java.io.Closeable) (cancellationsignal)));
	//   35   57:aload_2         
	//   36   58:invokestatic    #122 <Method void TypefaceCompatUtil.closeQuietly(java.io.Closeable)>
			return null;
	//   37   61:aconst_null     
	//   38   62:areturn         
		}
		cancellationsignal = ((CancellationSignal) (obj));
		afontinfo = ((android.support.v4.provider.FontsContractCompat.FontInfo []) (obj));
		context = ((Context) (createFromInputStream(context, ((InputStream) (obj)))));
		TypefaceCompatUtil.closeQuietly(((java.io.Closeable) (obj)));
		return ((Typeface) (context));
		context;
	//   39   63:astore_1        
		TypefaceCompatUtil.closeQuietly(((java.io.Closeable) (afontinfo)));
	//   40   64:aload_3         
	//   41   65:invokestatic    #122 <Method void TypefaceCompatUtil.closeQuietly(java.io.Closeable)>
		throw context;
	//   42   68:aload_1         
	//   43   69:athrow          
	}

	protected Typeface createFromInputStream(Context context, InputStream inputstream)
	{
		context = ((Context) (TypefaceCompatUtil.getTempFile(context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #129 <Method File TypefaceCompatUtil.getTempFile(Context)>
	//    2    4:astore_1        
		if(context == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		boolean flag;
		try
		{
			flag = TypefaceCompatUtil.copyToFile(((File) (context)), inputstream);
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokestatic    #133 <Method boolean TypefaceCompatUtil.copyToFile(File, InputStream)>
	//   10   16:istore_3        
		}
	//*  11   17:iload_3         
	//*  12   18:ifne            28
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #139 <Method boolean File.delete()>
	//*  15   25:pop             
	//*  16   26:aconst_null     
	//*  17   27:areturn         
	//*  18   28:aload_1         
	//*  19   29:invokevirtual   #142 <Method String File.getPath()>
	//*  20   32:invokestatic    #148 <Method Typeface Typeface.createFromFile(String)>
	//*  21   35:astore_2        
	//*  22   36:aload_1         
	//*  23   37:invokevirtual   #139 <Method boolean File.delete()>
	//*  24   40:pop             
	//*  25   41:aload_2         
	//*  26   42:areturn         
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  27   43:astore_2        
		{
			((File) (context)).delete();
	//   28   44:aload_1         
	//   29   45:invokevirtual   #139 <Method boolean File.delete()>
	//   30   48:pop             
			return null;
	//   31   49:aconst_null     
	//   32   50:areturn         
		}
		if(!flag)
		{
			((File) (context)).delete();
			return null;
		}
		inputstream = ((InputStream) (Typeface.createFromFile(((File) (context)).getPath())));
		((File) (context)).delete();
		return ((Typeface) (inputstream));
		inputstream;
	//   33   51:astore_2        
		((File) (context)).delete();
	//   34   52:aload_1         
	//   35   53:invokevirtual   #139 <Method boolean File.delete()>
	//   36   56:pop             
		throw inputstream;
	//   37   57:aload_2         
	//   38   58:athrow          
	}

	public Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String s, int j)
	{
		context = ((Context) (TypefaceCompatUtil.getTempFile(context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #129 <Method File TypefaceCompatUtil.getTempFile(Context)>
	//    2    4:astore_1        
		if(context == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		boolean flag;
		try
		{
			flag = TypefaceCompatUtil.copyToFile(((File) (context)), resources, i);
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:iload_3         
	//   10   14:invokestatic    #151 <Method boolean TypefaceCompatUtil.copyToFile(File, Resources, int)>
	//   11   17:istore          6
		}
	//*  12   19:iload           6
	//*  13   21:ifne            31
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #139 <Method boolean File.delete()>
	//*  16   28:pop             
	//*  17   29:aconst_null     
	//*  18   30:areturn         
	//*  19   31:aload_1         
	//*  20   32:invokevirtual   #142 <Method String File.getPath()>
	//*  21   35:invokestatic    #148 <Method Typeface Typeface.createFromFile(String)>
	//*  22   38:astore_2        
	//*  23   39:aload_1         
	//*  24   40:invokevirtual   #139 <Method boolean File.delete()>
	//*  25   43:pop             
	//*  26   44:aload_2         
	//*  27   45:areturn         
		// Misplaced declaration of an exception variable
		catch(Resources resources)
	//*  28   46:astore_2        
		{
			((File) (context)).delete();
	//   29   47:aload_1         
	//   30   48:invokevirtual   #139 <Method boolean File.delete()>
	//   31   51:pop             
			return null;
	//   32   52:aconst_null     
	//   33   53:areturn         
		}
		if(!flag)
		{
			((File) (context)).delete();
			return null;
		}
		resources = ((Resources) (Typeface.createFromFile(((File) (context)).getPath())));
		((File) (context)).delete();
		return ((Typeface) (resources));
		resources;
	//   34   54:astore_2        
		((File) (context)).delete();
	//   35   55:aload_1         
	//   36   56:invokevirtual   #139 <Method boolean File.delete()>
	//   37   59:pop             
		throw resources;
	//   38   60:aload_2         
	//   39   61:athrow          
	}

	protected android.support.v4.provider.FontsContractCompat.FontInfo findBestInfo(android.support.v4.provider.FontsContractCompat.FontInfo afontinfo[], int i)
	{
		return (android.support.v4.provider.FontsContractCompat.FontInfo)findBestFont(((Object []) (afontinfo)), i, new StyleExtractor() {

			public int getWeight(android.support.v4.provider.FontsContractCompat.FontInfo fontinfo)
			{
				return fontinfo.getWeight();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #29  <Method int android.support.v4.provider.FontsContractCompat$FontInfo.getWeight()>
			//    2    4:ireturn         
			}

			public volatile int getWeight(Object obj)
			{
				return getWeight((android.support.v4.provider.FontsContractCompat.FontInfo)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class android.support.v4.provider.FontsContractCompat$FontInfo>
			//    3    5:invokevirtual   #32  <Method int getWeight(android.support.v4.provider.FontsContractCompat$FontInfo)>
			//    4    8:ireturn         
			}

			public boolean isItalic(android.support.v4.provider.FontsContractCompat.FontInfo fontinfo)
			{
				return fontinfo.isItalic();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #37  <Method boolean android.support.v4.provider.FontsContractCompat$FontInfo.isItalic()>
			//    2    4:ireturn         
			}

			public volatile boolean isItalic(Object obj)
			{
				return isItalic((android.support.v4.provider.FontsContractCompat.FontInfo)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class android.support.v4.provider.FontsContractCompat$FontInfo>
			//    3    5:invokevirtual   #40  <Method boolean isItalic(android.support.v4.provider.FontsContractCompat$FontInfo)>
			//    4    8:ireturn         
			}

			final TypefaceCompatBaseImpl this$0;

			
			{
				this$0 = TypefaceCompatBaseImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TypefaceCompatBaseImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:new             #8   <Class TypefaceCompatBaseImpl$1>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #152 <Method void TypefaceCompatBaseImpl$1(TypefaceCompatBaseImpl)>
	//    6   10:invokestatic    #46  <Method Object findBestFont(Object[], int, TypefaceCompatBaseImpl$StyleExtractor)>
	//    7   13:checkcast       #102 <Class android.support.v4.provider.FontsContractCompat$FontInfo>
	//    8   16:areturn         
	}

	private static final String CACHE_FILE_PREFIX = "cached_font_";
	private static final String TAG = "TypefaceCompatBaseImpl";
}
