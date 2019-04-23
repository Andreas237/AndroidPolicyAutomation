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
{
	private static interface StyleExtractor
	{

		public abstract int getWeight(Object obj);

		public abstract boolean isItalic(Object obj);
	}


	TypefaceCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
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
	//    1    1:invokevirtual   #35  <Method android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry[] android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry.getEntries()>
	//    2    4:iload_2         
	//    3    5:new             #8   <Class TypefaceCompatBaseImpl$2>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #38  <Method void TypefaceCompatBaseImpl$2(TypefaceCompatBaseImpl)>
	//    7   13:invokestatic    #42  <Method Object findBestFont(Object[], int, TypefaceCompatBaseImpl$StyleExtractor)>
	//    8   16:checkcast       #44  <Class android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry>
	//    9   19:areturn         
	}

	private static Object findBestFont(Object aobj[], int i, StyleExtractor styleextractor)
	{
		char c;
		if((i & 1) == 0)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifne            13
			c = '\u0190';
	//    4    6:sipush          400
	//    5    9:istore_3        
		else
	//*   6   10:goto            17
			c = '\u02BC';
	//    7   13:sipush          700
	//    8   16:istore_3        
		boolean flag;
		if((i & 2) != 0)
	//*   9   17:iload_1         
	//*  10   18:iconst_2        
	//*  11   19:iand            
	//*  12   20:ifeq            29
			flag = true;
	//   13   23:iconst_1        
	//   14   24:istore          8
		else
	//*  15   26:goto            32
			flag = false;
	//   16   29:iconst_0        
	//   17   30:istore          8
		int i1 = aobj.length;
	//   18   32:aload_0         
	//   19   33:arraylength     
	//   20   34:istore          7
		int j = 0x7fffffff;
	//   21   36:ldc1            #45  <Int 0x7fffffff>
	//   22   38:istore          4
		Object obj = null;
	//   23   40:aconst_null     
	//   24   41:astore          9
		for(i = 0; i < i1;)
	//*  25   43:iconst_0        
	//*  26   44:istore_1        
	//*  27   45:iload_1         
	//*  28   46:iload           7
	//*  29   48:icmpge          137
		{
			int k;
label0:
			{
				Object obj1 = aobj[i];
	//   30   51:aload_0         
	//   31   52:iload_1         
	//   32   53:aaload          
	//   33   54:astore          10
				int l = Math.abs(styleextractor.getWeight(obj1) - c);
	//   34   56:aload_2         
	//   35   57:aload           10
	//   36   59:invokeinterface #49  <Method int TypefaceCompatBaseImpl$StyleExtractor.getWeight(Object)>
	//   37   64:iload_3         
	//   38   65:isub            
	//   39   66:invokestatic    #55  <Method int Math.abs(int)>
	//   40   69:istore          6
				if(styleextractor.isItalic(obj1) == flag)
	//*  41   71:aload_2         
	//*  42   72:aload           10
	//*  43   74:invokeinterface #59  <Method boolean TypefaceCompatBaseImpl$StyleExtractor.isItalic(Object)>
	//*  44   79:iload           8
	//*  45   81:icmpne          90
					k = 0;
	//   46   84:iconst_0        
	//   47   85:istore          5
				else
	//*  48   87:goto            93
					k = 1;
	//   49   90:iconst_1        
	//   50   91:istore          5
				l = l * 2 + k;
	//   51   93:iload           6
	//   52   95:iconst_2        
	//   53   96:imul            
	//   54   97:iload           5
	//   55   99:iadd            
	//   56  100:istore          6
				if(obj != null)
	//*  57  102:aload           9
	//*  58  104:ifnull          118
				{
					k = j;
	//   59  107:iload           4
	//   60  109:istore          5
					if(j <= l)
						break label0;
	//   61  111:iload           4
	//   62  113:iload           6
	//   63  115:icmple          126
				}
				obj = obj1;
	//   64  118:aload           10
	//   65  120:astore          9
				k = l;
	//   66  122:iload           6
	//   67  124:istore          5
			}
			i++;
	//   68  126:iload_1         
	//   69  127:iconst_1        
	//   70  128:iadd            
	//   71  129:istore_1        
			j = k;
	//   72  130:iload           5
	//   73  132:istore          4
		}

	//*  74  134:goto            45
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
	//    3    4:invokespecial   #66  <Method android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry findBestEntry(android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry, int)>
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
	//   12   17:invokevirtual   #70  <Method int android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.getResourceId()>
	//   13   20:aload_2         
	//   14   21:invokevirtual   #74  <Method String android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry.getFileName()>
	//   15   24:iload           4
	//   16   26:invokestatic    #80  <Method Typeface TypefaceCompat.createFromResourcesFontFile(Context, Resources, int, String, int)>
	//   17   29:areturn         
	}

	public Typeface createFromFontInfo(Context context, CancellationSignal cancellationsignal, android.support.v4.provider.FontsContractCompat.FontInfo afontinfo[], int i)
	{
		Object obj;
		int j = afontinfo.length;
	//    0    0:aload_3         
	//    1    1:arraylength     
	//    2    2:istore          5
		obj = null;
	//    3    4:aconst_null     
	//    4    5:astore          6
		if(j < 1)
	//*   5    7:iload           5
	//*   6    9:iconst_1        
	//*   7   10:icmpge          15
			return null;
	//    8   13:aconst_null     
	//    9   14:areturn         
		cancellationsignal = ((CancellationSignal) (findBestInfo(afontinfo, i)));
	//   10   15:aload_0         
	//   11   16:aload_3         
	//   12   17:iload           4
	//   13   19:invokevirtual   #90  <Method android.support.v4.provider.FontsContractCompat$FontInfo findBestInfo(android.support.v4.provider.FontsContractCompat$FontInfo[], int)>
	//   14   22:astore_2        
		cancellationsignal = ((CancellationSignal) (context.getContentResolver().openInputStream(((android.support.v4.provider.FontsContractCompat.FontInfo) (cancellationsignal)).getUri())));
	//   15   23:aload_1         
	//   16   24:invokevirtual   #96  <Method ContentResolver Context.getContentResolver()>
	//   17   27:aload_2         
	//   18   28:invokevirtual   #102 <Method android.net.Uri android.support.v4.provider.FontsContractCompat$FontInfo.getUri()>
	//   19   31:invokevirtual   #108 <Method InputStream ContentResolver.openInputStream(android.net.Uri)>
	//   20   34:astore_2        
		context = ((Context) (createFromInputStream(context, ((InputStream) (cancellationsignal)))));
	//   21   35:aload_0         
	//   22   36:aload_1         
	//   23   37:aload_2         
	//   24   38:invokevirtual   #112 <Method Typeface createFromInputStream(Context, InputStream)>
	//   25   41:astore_1        
		TypefaceCompatUtil.closeQuietly(((java.io.Closeable) (cancellationsignal)));
	//   26   42:aload_2         
	//   27   43:invokestatic    #118 <Method void TypefaceCompatUtil.closeQuietly(java.io.Closeable)>
		return ((Typeface) (context));
	//   28   46:aload_1         
	//   29   47:areturn         
		afontinfo;
	//   30   48:astore_3        
		context = ((Context) (cancellationsignal));
	//   31   49:aload_2         
	//   32   50:astore_1        
		cancellationsignal = ((CancellationSignal) (afontinfo));
	//   33   51:aload_3         
	//   34   52:astore_2        
		break MISSING_BLOCK_LABEL_60;
	//   35   53:goto            60
		cancellationsignal;
	//   36   56:astore_2        
		context = ((Context) (obj));
	//   37   57:aload           6
	//   38   59:astore_1        
		TypefaceCompatUtil.closeQuietly(((java.io.Closeable) (context)));
	//   39   60:aload_1         
	//   40   61:invokestatic    #118 <Method void TypefaceCompatUtil.closeQuietly(java.io.Closeable)>
		throw cancellationsignal;
	//   41   64:aload_2         
	//   42   65:athrow          
_L1:
		cancellationsignal = null;
	//   43   66:aconst_null     
	//   44   67:astore_2        
_L2:
		TypefaceCompatUtil.closeQuietly(((java.io.Closeable) (cancellationsignal)));
	//   45   68:aload_2         
	//   46   69:invokestatic    #118 <Method void TypefaceCompatUtil.closeQuietly(java.io.Closeable)>
		return null;
	//   47   72:aconst_null     
	//   48   73:areturn         
		context;
	//   49   74:astore_1        
		  goto _L1
	//*  50   75:goto            66
		context;
	//   51   78:astore_1        
		  goto _L2
	//*  52   79:goto            68
	}

	protected Typeface createFromInputStream(Context context, InputStream inputstream)
	{
		context = ((Context) (TypefaceCompatUtil.getTempFile(context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #125 <Method File TypefaceCompatUtil.getTempFile(Context)>
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
	//    9   13:invokestatic    #129 <Method boolean TypefaceCompatUtil.copyToFile(File, InputStream)>
	//   10   16:istore_3        
		}
	//*  11   17:iload_3         
	//*  12   18:ifne            28
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #135 <Method boolean File.delete()>
	//*  15   25:pop             
	//*  16   26:aconst_null     
	//*  17   27:areturn         
	//*  18   28:aload_1         
	//*  19   29:invokevirtual   #138 <Method String File.getPath()>
	//*  20   32:invokestatic    #144 <Method Typeface Typeface.createFromFile(String)>
	//*  21   35:astore_2        
	//*  22   36:aload_1         
	//*  23   37:invokevirtual   #135 <Method boolean File.delete()>
	//*  24   40:pop             
	//*  25   41:aload_2         
	//*  26   42:areturn         
	//*  27   43:astore_2        
	//*  28   44:aload_1         
	//*  29   45:invokevirtual   #135 <Method boolean File.delete()>
	//*  30   48:pop             
	//*  31   49:aload_2         
	//*  32   50:athrow          
	//*  33   51:aload_1         
	//*  34   52:invokevirtual   #135 <Method boolean File.delete()>
	//*  35   55:pop             
	//*  36   56:aconst_null     
	//*  37   57:areturn         
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
		{
			((File) (context)).delete();
			return null;
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
		((File) (context)).delete();
		throw inputstream;
	//*  38   58:astore_2        
	//*  39   59:goto            51
	}

	public Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String s, int j)
	{
		context = ((Context) (TypefaceCompatUtil.getTempFile(context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #125 <Method File TypefaceCompatUtil.getTempFile(Context)>
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
	//   10   14:invokestatic    #147 <Method boolean TypefaceCompatUtil.copyToFile(File, Resources, int)>
	//   11   17:istore          6
		}
	//*  12   19:iload           6
	//*  13   21:ifne            31
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #135 <Method boolean File.delete()>
	//*  16   28:pop             
	//*  17   29:aconst_null     
	//*  18   30:areturn         
	//*  19   31:aload_1         
	//*  20   32:invokevirtual   #138 <Method String File.getPath()>
	//*  21   35:invokestatic    #144 <Method Typeface Typeface.createFromFile(String)>
	//*  22   38:astore_2        
	//*  23   39:aload_1         
	//*  24   40:invokevirtual   #135 <Method boolean File.delete()>
	//*  25   43:pop             
	//*  26   44:aload_2         
	//*  27   45:areturn         
	//*  28   46:astore_2        
	//*  29   47:aload_1         
	//*  30   48:invokevirtual   #135 <Method boolean File.delete()>
	//*  31   51:pop             
	//*  32   52:aload_2         
	//*  33   53:athrow          
	//*  34   54:aload_1         
	//*  35   55:invokevirtual   #135 <Method boolean File.delete()>
	//*  36   58:pop             
	//*  37   59:aconst_null     
	//*  38   60:areturn         
		// Misplaced declaration of an exception variable
		catch(Resources resources)
		{
			((File) (context)).delete();
			return null;
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
		((File) (context)).delete();
		throw resources;
	//*  39   61:astore_2        
	//*  40   62:goto            54
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
	//    2    2:new             #6   <Class TypefaceCompatBaseImpl$1>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #148 <Method void TypefaceCompatBaseImpl$1(TypefaceCompatBaseImpl)>
	//    6   10:invokestatic    #42  <Method Object findBestFont(Object[], int, TypefaceCompatBaseImpl$StyleExtractor)>
	//    7   13:checkcast       #98  <Class android.support.v4.provider.FontsContractCompat$FontInfo>
	//    8   16:areturn         
	}

	private static final String CACHE_FILE_PREFIX = "cached_font_";
	private static final String TAG = "TypefaceCompatBaseImpl";
}
