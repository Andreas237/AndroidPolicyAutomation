// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.*;
import java.nio.ByteBuffer;

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

	private static void abortCreation(Object obj)
	{
		try
		{
			sAbortCreation.invoke(obj, new Object[0]);
	//    0    0:getstatic       #140 <Field Method sAbortCreation>
	//    1    3:aload_0         
	//    2    4:iconst_0        
	//    3    5:anewarray       Object[]
	//    4    8:invokevirtual   #153 <Method Object Method.invoke(Object, Object[])>
	//    5   11:pop             
			return;
	//    6   12:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   7   13:astore_0        
		{
			throw new RuntimeException(((Throwable) (obj)));
	//    8   14:new             #155 <Class RuntimeException>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #158 <Method void RuntimeException(Throwable)>
	//   12   22:athrow          
		}
	}

	private static boolean addFontFromAssetManager(Context context, Object obj, String s, int i, int j, int k)
	{
		boolean flag;
		try
		{
			flag = ((Boolean)sAddFontFromAssetManager.invoke(obj, new Object[] {
				context.getAssets(), s, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), null
			})).booleanValue();
	//    0    0:getstatic       #134 <Field Method sAddFontFromAssetManager>
	//    1    3:aload_1         
	//    2    4:bipush          8
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:invokevirtual   #165 <Method AssetManager Context.getAssets()>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_2         
	//   12   19:aastore         
	//   13   20:dup             
	//   14   21:iconst_2        
	//   15   22:iconst_0        
	//   16   23:invokestatic    #169 <Method Integer Integer.valueOf(int)>
	//   17   26:aastore         
	//   18   27:dup             
	//   19   28:iconst_3        
	//   20   29:iconst_0        
	//   21   30:invokestatic    #172 <Method Boolean Boolean.valueOf(boolean)>
	//   22   33:aastore         
	//   23   34:dup             
	//   24   35:iconst_4        
	//   25   36:iload_3         
	//   26   37:invokestatic    #169 <Method Integer Integer.valueOf(int)>
	//   27   40:aastore         
	//   28   41:dup             
	//   29   42:iconst_5        
	//   30   43:iload           4
	//   31   45:invokestatic    #169 <Method Integer Integer.valueOf(int)>
	//   32   48:aastore         
	//   33   49:dup             
	//   34   50:bipush          6
	//   35   52:iload           5
	//   36   54:invokestatic    #169 <Method Integer Integer.valueOf(int)>
	//   37   57:aastore         
	//   38   58:dup             
	//   39   59:bipush          7
	//   40   61:aconst_null     
	//   41   62:aastore         
	//   42   63:invokevirtual   #153 <Method Object Method.invoke(Object, Object[])>
	//   43   66:checkcast       #72  <Class Boolean>
	//   44   69:invokevirtual   #176 <Method boolean Boolean.booleanValue()>
	//   45   72:istore          6
		}
	//*  46   74:iload           6
	//*  47   76:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  48   77:astore_0        
		{
			throw new RuntimeException(((Throwable) (context)));
	//   49   78:new             #155 <Class RuntimeException>
	//   50   81:dup             
	//   51   82:aload_0         
	//   52   83:invokespecial   #158 <Method void RuntimeException(Throwable)>
	//   53   86:athrow          
		}
		return flag;
	}

	private static boolean addFontFromBuffer(Object obj, ByteBuffer bytebuffer, int i, int j, int k)
	{
		boolean flag;
		try
		{
			flag = ((Boolean)sAddFontFromBuffer.invoke(obj, new Object[] {
				bytebuffer, Integer.valueOf(i), null, Integer.valueOf(j), Integer.valueOf(k)
			})).booleanValue();
	//    0    0:getstatic       #136 <Field Method sAddFontFromBuffer>
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
	//   11   15:invokestatic    #169 <Method Integer Integer.valueOf(int)>
	//   12   18:aastore         
	//   13   19:dup             
	//   14   20:iconst_2        
	//   15   21:aconst_null     
	//   16   22:aastore         
	//   17   23:dup             
	//   18   24:iconst_3        
	//   19   25:iload_3         
	//   20   26:invokestatic    #169 <Method Integer Integer.valueOf(int)>
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_4        
	//   24   32:iload           4
	//   25   34:invokestatic    #169 <Method Integer Integer.valueOf(int)>
	//   26   37:aastore         
	//   27   38:invokevirtual   #153 <Method Object Method.invoke(Object, Object[])>
	//   28   41:checkcast       #72  <Class Boolean>
	//   29   44:invokevirtual   #176 <Method boolean Boolean.booleanValue()>
	//   30   47:istore          5
		}
	//*  31   49:iload           5
	//*  32   51:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  33   52:astore_0        
		{
			throw new RuntimeException(((Throwable) (obj)));
	//   34   53:new             #155 <Class RuntimeException>
	//   35   56:dup             
	//   36   57:aload_0         
	//   37   58:invokespecial   #158 <Method void RuntimeException(Throwable)>
	//   38   61:athrow          
		}
		return flag;
	}

	private static Typeface createFromFamiliesWithDefault(Object obj)
	{
		try
		{
			Object obj1 = Array.newInstance(sFontFamily, 1);
	//    0    0:getstatic       #132 <Field Class sFontFamily>
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
	//    8   14:getstatic       #142 <Field Method sCreateFromFamiliesWithDefault>
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
	//   19   29:invokestatic    #169 <Method Integer Integer.valueOf(int)>
	//   20   32:aastore         
	//   21   33:dup             
	//   22   34:iconst_2        
	//   23   35:iconst_m1       
	//   24   36:invokestatic    #169 <Method Integer Integer.valueOf(int)>
	//   25   39:aastore         
	//   26   40:invokevirtual   #153 <Method Object Method.invoke(Object, Object[])>
	//   27   43:checkcast       #83  <Class Typeface>
	//   28   46:astore_0        
		}
	//*  29   47:aload_0         
	//*  30   48:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  31   49:astore_0        
		{
			throw new RuntimeException(((Throwable) (obj)));
	//   32   50:new             #155 <Class RuntimeException>
	//   33   53:dup             
	//   34   54:aload_0         
	//   35   55:invokespecial   #158 <Method void RuntimeException(Throwable)>
	//   36   58:athrow          
		}
		return ((Typeface) (obj));
	}

	private static boolean freeze(Object obj)
	{
		boolean flag;
		try
		{
			flag = ((Boolean)sFreeze.invoke(obj, new Object[0])).booleanValue();
	//    0    0:getstatic       #138 <Field Method sFreeze>
	//    1    3:aload_0         
	//    2    4:iconst_0        
	//    3    5:anewarray       Object[]
	//    4    8:invokevirtual   #153 <Method Object Method.invoke(Object, Object[])>
	//    5   11:checkcast       #72  <Class Boolean>
	//    6   14:invokevirtual   #176 <Method boolean Boolean.booleanValue()>
	//    7   17:istore_1        
		}
	//*   8   18:iload_1         
	//*   9   19:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  10   20:astore_0        
		{
			throw new RuntimeException(((Throwable) (obj)));
	//   11   21:new             #155 <Class RuntimeException>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #158 <Method void RuntimeException(Throwable)>
	//   15   29:athrow          
		}
		return flag;
	}

	private static boolean isFontFamilyPrivateAPIAvailable()
	{
		if(sAddFontFromAssetManager == null)
	//*   0    0:getstatic       #134 <Field Method sAddFontFromAssetManager>
	//*   1    3:ifnonnull       14
			Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
	//    2    6:ldc1            #35  <String "TypefaceCompatApi26Impl">
	//    3    8:ldc1            #186 <String "Unable to collect necessary private methods. Fallback to legacy implementation.">
	//    4   10:invokestatic    #190 <Method int Log.w(String, String)>
	//    5   13:pop             
		return sAddFontFromAssetManager != null;
	//    6   14:getstatic       #134 <Field Method sAddFontFromAssetManager>
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
	//    0    0:getstatic       #130 <Field Constructor sFontFamilyCtor>
	//    1    3:iconst_0        
	//    2    4:anewarray       Object[]
	//    3    7:invokevirtual   #199 <Method Object Constructor.newInstance(Object[])>
	//    4   10:astore_0        
		}
	//*   5   11:aload_0         
	//*   6   12:areturn         
		catch(Object obj1)
	//*   7   13:astore_0        
		{
			throw new RuntimeException(((Throwable) (obj1)));
	//    8   14:new             #155 <Class RuntimeException>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #158 <Method void RuntimeException(Throwable)>
	//   12   22:athrow          
		}
		return obj;
	}

	public Typeface createFromFontFamilyFilesResourceEntry(Context context, android.support.v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontfamilyfilesresourceentry, Resources resources, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #155 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #203 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #208 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public Typeface createFromFontInfo(Context context, CancellationSignal cancellationsignal, android.support.v4.provider.FontsContractCompat.FontInfo afontinfo[], int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #155 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #203 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #208 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String s, int j)
	{
		if(!isFontFamilyPrivateAPIAvailable())
	//*   0    0:invokestatic    #217 <Method boolean isFontFamilyPrivateAPIAvailable()>
	//*   1    3:ifne            18
			return super.createFromResourcesFontFile(context, resources, i, s, j);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:iload_3         
	//    6   10:aload           4
	//    7   12:iload           5
	//    8   14:invokespecial   #219 <Method Typeface TypefaceCompatApi21Impl.createFromResourcesFontFile(Context, Resources, int, String, int)>
	//    9   17:areturn         
		resources = ((Resources) (newFamily()));
	//   10   18:invokestatic    #221 <Method Object newFamily()>
	//   11   21:astore_2        
		if(!addFontFromAssetManager(context, ((Object) (resources)), s, 0, -1, -1))
	//*  12   22:aload_1         
	//*  13   23:aload_2         
	//*  14   24:aload           4
	//*  15   26:iconst_0        
	//*  16   27:iconst_m1       
	//*  17   28:iconst_m1       
	//*  18   29:invokestatic    #223 <Method boolean addFontFromAssetManager(Context, Object, String, int, int, int)>
	//*  19   32:ifne            41
		{
			abortCreation(((Object) (resources)));
	//   20   35:aload_2         
	//   21   36:invokestatic    #225 <Method void abortCreation(Object)>
			return null;
	//   22   39:aconst_null     
	//   23   40:areturn         
		}
		if(!freeze(((Object) (resources))))
	//*  24   41:aload_2         
	//*  25   42:invokestatic    #227 <Method boolean freeze(Object)>
	//*  26   45:ifne            50
			return null;
	//   27   48:aconst_null     
	//   28   49:areturn         
		else
			return createFromFamiliesWithDefault(((Object) (resources)));
	//   29   50:aload_2         
	//   30   51:invokestatic    #229 <Method Typeface createFromFamiliesWithDefault(Object)>
	//   31   54:areturn         
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
		Object obj8 = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		Object obj;
		Object obj1;
		Object obj2;
		Object obj3;
		Object obj4;
		Object obj5;
		Object obj6;
		try
		{
			obj1 = ((Object) (Class.forName("android.graphics.FontFamily")));
	//    2    3:ldc1            #26  <String "android.graphics.FontFamily">
	//    3    5:invokestatic    #57  <Method Class Class.forName(String)>
	//    4    8:astore_1        
			obj = ((Object) (((Class) (obj1)).getConstructor(new Class[0])));
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:anewarray       Class[]
	//    8   14:invokevirtual   #61  <Method Constructor Class.getConstructor(Class[])>
	//    9   17:astore_0        
			obj3 = ((Object) (((Class) (obj1)).getMethod("addFontFromAssetManager", new Class[] {
				android/content/res/AssetManager, java/lang/String, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, [Landroid/graphics/fonts/FontVariationAxis;
			})));
	//   10   18:aload_1         
	//   11   19:ldc1            #17  <String "addFontFromAssetManager">
	//   12   21:bipush          8
	//   13   23:anewarray       Class[]
	//   14   26:dup             
	//   15   27:iconst_0        
	//   16   28:ldc1            #63  <Class AssetManager>
	//   17   30:aastore         
	//   18   31:dup             
	//   19   32:iconst_1        
	//   20   33:ldc1            #65  <Class String>
	//   21   35:aastore         
	//   22   36:dup             
	//   23   37:iconst_2        
	//   24   38:getstatic       #70  <Field Class Integer.TYPE>
	//   25   41:aastore         
	//   26   42:dup             
	//   27   43:iconst_3        
	//   28   44:getstatic       #73  <Field Class Boolean.TYPE>
	//   29   47:aastore         
	//   30   48:dup             
	//   31   49:iconst_4        
	//   32   50:getstatic       #70  <Field Class Integer.TYPE>
	//   33   53:aastore         
	//   34   54:dup             
	//   35   55:iconst_5        
	//   36   56:getstatic       #70  <Field Class Integer.TYPE>
	//   37   59:aastore         
	//   38   60:dup             
	//   39   61:bipush          6
	//   40   63:getstatic       #70  <Field Class Integer.TYPE>
	//   41   66:aastore         
	//   42   67:dup             
	//   43   68:bipush          7
	//   44   70:ldc1            #75  <Class android.graphics.fonts.FontVariationAxis[]>
	//   45   72:aastore         
	//   46   73:invokevirtual   #79  <Method Method Class.getMethod(String, Class[])>
	//   47   76:astore_3        
			obj4 = ((Object) (((Class) (obj1)).getMethod("addFontFromBuffer", new Class[] {
				java/nio/ByteBuffer, Integer.TYPE, [Landroid/graphics/fonts/FontVariationAxis;, Integer.TYPE, Integer.TYPE
			})));
	//   48   77:aload_1         
	//   49   78:ldc1            #20  <String "addFontFromBuffer">
	//   50   80:iconst_5        
	//   51   81:anewarray       Class[]
	//   52   84:dup             
	//   53   85:iconst_0        
	//   54   86:ldc1            #81  <Class ByteBuffer>
	//   55   88:aastore         
	//   56   89:dup             
	//   57   90:iconst_1        
	//   58   91:getstatic       #70  <Field Class Integer.TYPE>
	//   59   94:aastore         
	//   60   95:dup             
	//   61   96:iconst_2        
	//   62   97:ldc1            #75  <Class android.graphics.fonts.FontVariationAxis[]>
	//   63   99:aastore         
	//   64  100:dup             
	//   65  101:iconst_3        
	//   66  102:getstatic       #70  <Field Class Integer.TYPE>
	//   67  105:aastore         
	//   68  106:dup             
	//   69  107:iconst_4        
	//   70  108:getstatic       #70  <Field Class Integer.TYPE>
	//   71  111:aastore         
	//   72  112:invokevirtual   #79  <Method Method Class.getMethod(String, Class[])>
	//   73  115:astore          4
			obj5 = ((Object) (((Class) (obj1)).getMethod("freeze", new Class[0])));
	//   74  117:aload_1         
	//   75  118:ldc1            #29  <String "freeze">
	//   76  120:iconst_0        
	//   77  121:anewarray       Class[]
	//   78  124:invokevirtual   #79  <Method Method Class.getMethod(String, Class[])>
	//   79  127:astore          5
			obj6 = ((Object) (((Class) (obj1)).getMethod("abortCreation", new Class[0])));
	//   80  129:aload_1         
	//   81  130:ldc1            #14  <String "abortCreation">
	//   82  132:iconst_0        
	//   83  133:anewarray       Class[]
	//   84  136:invokevirtual   #79  <Method Method Class.getMethod(String, Class[])>
	//   85  139:astore          6
			obj2 = ((Object) (((Class) (android/graphics/Typeface)).getDeclaredMethod("createFromFamiliesWithDefault", new Class[] {
				Array.newInstance(((Class) (obj1)), 1).getClass(), Integer.TYPE, Integer.TYPE
			})));
	//   86  141:ldc1            #83  <Class Typeface>
	//   87  143:ldc1            #23  <String "createFromFamiliesWithDefault">
	//   88  145:iconst_3        
	//   89  146:anewarray       Class[]
	//   90  149:dup             
	//   91  150:iconst_0        
	//   92  151:aload_1         
	//   93  152:iconst_1        
	//   94  153:invokestatic    #89  <Method Object Array.newInstance(Class, int)>
	//   95  156:invokevirtual   #95  <Method Class Object.getClass()>
	//   96  159:aastore         
	//   97  160:dup             
	//   98  161:iconst_1        
	//   99  162:getstatic       #70  <Field Class Integer.TYPE>
	//  100  165:aastore         
	//  101  166:dup             
	//  102  167:iconst_2        
	//  103  168:getstatic       #70  <Field Class Integer.TYPE>
	//  104  171:aastore         
	//  105  172:invokevirtual   #98  <Method Method Class.getDeclaredMethod(String, Class[])>
	//  106  175:astore_2        
			((Method) (obj2)).setAccessible(true);
	//  107  176:aload_2         
	//  108  177:iconst_1        
	//  109  178:invokevirtual   #104 <Method void Method.setAccessible(boolean)>
		}
	//* 110  181:goto            254
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 111  184:astore_0        
		{
			obj1 = ((Object) (new StringBuilder()));
	//  112  185:new             #106 <Class StringBuilder>
	//  113  188:dup             
	//  114  189:invokespecial   #109 <Method void StringBuilder()>
	//  115  192:astore_1        
			((StringBuilder) (obj1)).append("Unable to collect necessary methods for class ");
	//  116  193:aload_1         
	//  117  194:ldc1            #111 <String "Unable to collect necessary methods for class ">
	//  118  196:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  119  199:pop             
			((StringBuilder) (obj1)).append(obj.getClass().getName());
	//  120  200:aload_1         
	//  121  201:aload_0         
	//  122  202:invokevirtual   #95  <Method Class Object.getClass()>
	//  123  205:invokevirtual   #119 <Method String Class.getName()>
	//  124  208:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  125  211:pop             
			Log.e("TypefaceCompatApi26Impl", ((StringBuilder) (obj1)).toString(), ((Throwable) (obj)));
	//  126  212:ldc1            #35  <String "TypefaceCompatApi26Impl">
	//  127  214:aload_1         
	//  128  215:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  129  218:aload_0         
	//  130  219:invokestatic    #128 <Method int Log.e(String, String, Throwable)>
	//  131  222:pop             
			Object obj7 = null;
	//  132  223:aconst_null     
	//  133  224:astore          7
			obj = ((Object) (obj7));
	//  134  226:aload           7
	//  135  228:astore_0        
			obj1 = obj;
	//  136  229:aload_0         
	//  137  230:astore_1        
			obj2 = obj1;
	//  138  231:aload_1         
	//  139  232:astore_2        
			obj3 = obj2;
	//  140  233:aload_2         
	//  141  234:astore_3        
			obj6 = obj3;
	//  142  235:aload_3         
	//  143  236:astore          6
			obj5 = obj3;
	//  144  238:aload_3         
	//  145  239:astore          5
			obj4 = obj2;
	//  146  241:aload_2         
	//  147  242:astore          4
			obj3 = obj1;
	//  148  244:aload_1         
	//  149  245:astore_3        
			obj2 = obj;
	//  150  246:aload_0         
	//  151  247:astore_2        
			obj1 = ((Object) (obj7));
	//  152  248:aload           7
	//  153  250:astore_1        
			obj = ((Object) (obj8));
	//  154  251:aload           8
	//  155  253:astore_0        
		}
		sFontFamilyCtor = ((Constructor) (obj));
	//  156  254:aload_0         
	//  157  255:putstatic       #130 <Field Constructor sFontFamilyCtor>
		sFontFamily = ((Class) (obj1));
	//  158  258:aload_1         
	//  159  259:putstatic       #132 <Field Class sFontFamily>
		sAddFontFromAssetManager = ((Method) (obj3));
	//  160  262:aload_3         
	//  161  263:putstatic       #134 <Field Method sAddFontFromAssetManager>
		sAddFontFromBuffer = ((Method) (obj4));
	//  162  266:aload           4
	//  163  268:putstatic       #136 <Field Method sAddFontFromBuffer>
		sFreeze = ((Method) (obj5));
	//  164  271:aload           5
	//  165  273:putstatic       #138 <Field Method sFreeze>
		sAbortCreation = ((Method) (obj6));
	//  166  276:aload           6
	//  167  278:putstatic       #140 <Field Method sAbortCreation>
		sCreateFromFamiliesWithDefault = ((Method) (obj2));
	//  168  281:aload_2         
	//  169  282:putstatic       #142 <Field Method sCreateFromFamiliesWithDefault>
	//  170  285:return          
	}
}
