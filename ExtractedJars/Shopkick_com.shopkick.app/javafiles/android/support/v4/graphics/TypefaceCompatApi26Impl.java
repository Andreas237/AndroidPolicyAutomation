// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
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
		Object obj;
		Object obj1;
		Object obj2;
		Object obj3;
		Object obj4;
		Object obj5;
		Object obj6;
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void TypefaceCompatApi21Impl()>
			Object obj8 = null;
	//    2    4:aconst_null     
	//    3    5:astore          9
			try
			{
				obj = ((Object) (obtainFontFamily()));
	//    4    7:aload_0         
	//    5    8:invokevirtual   #60  <Method Class obtainFontFamily()>
	//    6   11:astore_1        
				obj2 = ((Object) (obtainFontFamilyCtor(((Class) (obj)))));
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:invokevirtual   #64  <Method Constructor obtainFontFamilyCtor(Class)>
	//   10   17:astore_3        
				obj3 = ((Object) (obtainAddFontFromAssetManagerMethod(((Class) (obj)))));
	//   11   18:aload_0         
	//   12   19:aload_1         
	//   13   20:invokevirtual   #68  <Method Method obtainAddFontFromAssetManagerMethod(Class)>
	//   14   23:astore          4
				obj4 = ((Object) (obtainAddFontFromBufferMethod(((Class) (obj)))));
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:invokevirtual   #71  <Method Method obtainAddFontFromBufferMethod(Class)>
	//   18   30:astore          5
				obj5 = ((Object) (obtainFreezeMethod(((Class) (obj)))));
	//   19   32:aload_0         
	//   20   33:aload_1         
	//   21   34:invokevirtual   #74  <Method Method obtainFreezeMethod(Class)>
	//   22   37:astore          6
				obj6 = ((Object) (obtainAbortCreationMethod(((Class) (obj)))));
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:invokevirtual   #77  <Method Method obtainAbortCreationMethod(Class)>
	//   26   44:astore          7
				obj1 = ((Object) (obtainCreateFromFamiliesWithDefaultMethod(((Class) (obj)))));
	//   27   46:aload_0         
	//   28   47:aload_1         
	//   29   48:invokevirtual   #80  <Method Method obtainCreateFromFamiliesWithDefaultMethod(Class)>
	//   30   51:astore_2        
				break label0;
	//   31   52:goto            133
			}
	//*  32   55:astore_1        
	//*  33   56:goto            60
			// Misplaced declaration of an exception variable
			catch(Object obj) { }
	//   34   59:astore_1        
			// Misplaced declaration of an exception variable
			catch(Object obj) { }
			obj1 = ((Object) (new StringBuilder()));
	//   35   60:new             #82  <Class StringBuilder>
	//   36   63:dup             
	//   37   64:invokespecial   #83  <Method void StringBuilder()>
	//   38   67:astore_2        
			((StringBuilder) (obj1)).append("Unable to collect necessary methods for class ");
	//   39   68:aload_2         
	//   40   69:ldc1            #85  <String "Unable to collect necessary methods for class ">
	//   41   71:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   42   74:pop             
			((StringBuilder) (obj1)).append(obj.getClass().getName());
	//   43   75:aload_2         
	//   44   76:aload_1         
	//   45   77:invokevirtual   #94  <Method Class Object.getClass()>
	//   46   80:invokevirtual   #100 <Method String Class.getName()>
	//   47   83:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   48   86:pop             
			Log.e("TypefaceCompatApi26Impl", ((StringBuilder) (obj1)).toString(), ((Throwable) (obj)));
	//   49   87:ldc1            #38  <String "TypefaceCompatApi26Impl">
	//   50   89:aload_2         
	//   51   90:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   52   93:aload_1         
	//   53   94:invokestatic    #109 <Method int Log.e(String, String, Throwable)>
	//   54   97:pop             
			Object obj7 = null;
	//   55   98:aconst_null     
	//   56   99:astore          8
			obj = ((Object) (obj7));
	//   57  101:aload           8
	//   58  103:astore_1        
			obj1 = obj;
	//   59  104:aload_1         
	//   60  105:astore_2        
			obj2 = obj1;
	//   61  106:aload_2         
	//   62  107:astore_3        
			obj3 = obj2;
	//   63  108:aload_3         
	//   64  109:astore          4
			obj6 = obj3;
	//   65  111:aload           4
	//   66  113:astore          7
			obj5 = obj3;
	//   67  115:aload           4
	//   68  117:astore          6
			obj4 = obj2;
	//   69  119:aload_3         
	//   70  120:astore          5
			obj3 = obj1;
	//   71  122:aload_2         
	//   72  123:astore          4
			obj2 = obj;
	//   73  125:aload_1         
	//   74  126:astore_3        
			obj1 = ((Object) (obj7));
	//   75  127:aload           8
	//   76  129:astore_2        
			obj = ((Object) (obj8));
	//   77  130:aload           9
	//   78  132:astore_1        
		}
		mFontFamily = ((Class) (obj));
	//   79  133:aload_0         
	//   80  134:aload_1         
	//   81  135:putfield        #111 <Field Class mFontFamily>
		mFontFamilyCtor = ((Constructor) (obj2));
	//   82  138:aload_0         
	//   83  139:aload_3         
	//   84  140:putfield        #113 <Field Constructor mFontFamilyCtor>
		mAddFontFromAssetManager = ((Method) (obj3));
	//   85  143:aload_0         
	//   86  144:aload           4
	//   87  146:putfield        #115 <Field Method mAddFontFromAssetManager>
		mAddFontFromBuffer = ((Method) (obj4));
	//   88  149:aload_0         
	//   89  150:aload           5
	//   90  152:putfield        #117 <Field Method mAddFontFromBuffer>
		mFreeze = ((Method) (obj5));
	//   91  155:aload_0         
	//   92  156:aload           6
	//   93  158:putfield        #119 <Field Method mFreeze>
		mAbortCreation = ((Method) (obj6));
	//   94  161:aload_0         
	//   95  162:aload           7
	//   96  164:putfield        #121 <Field Method mAbortCreation>
		mCreateFromFamiliesWithDefault = ((Method) (obj1));
	//   97  167:aload_0         
	//   98  168:aload_2         
	//   99  169:putfield        #123 <Field Method mCreateFromFamiliesWithDefault>
	//  100  172:return          
	}

	private void abortCreation(Object obj)
	{
		try
		{
			mAbortCreation.invoke(obj, new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Method mAbortCreation>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:anewarray       Object[]
	//    5    9:invokevirtual   #135 <Method Object Method.invoke(Object, Object[])>
	//    6   12:pop             
			return;
	//    7   13:return          
		}
	//*   8   14:astore_1        
	//*   9   15:goto            19
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   10   18:astore_1        
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		throw new RuntimeException(((Throwable) (obj)));
	//   11   19:new             #137 <Class RuntimeException>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:invokespecial   #140 <Method void RuntimeException(Throwable)>
	//   15   27:athrow          
	}

	private boolean addFontFromAssetManager(Context context, Object obj, String s, int i, int j, int k, FontVariationAxis afontvariationaxis[])
	{
		boolean flag = ((Boolean)mAddFontFromAssetManager.invoke(obj, new Object[] {
			context.getAssets(), s, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), afontvariationaxis
		})).booleanValue();
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Method mAddFontFromAssetManager>
	//    2    4:aload_2         
	//    3    5:bipush          8
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:aload_1         
	//    8   13:invokevirtual   #148 <Method AssetManager Context.getAssets()>
	//    9   16:aastore         
	//   10   17:dup             
	//   11   18:iconst_1        
	//   12   19:aload_3         
	//   13   20:aastore         
	//   14   21:dup             
	//   15   22:iconst_2        
	//   16   23:iconst_0        
	//   17   24:invokestatic    #154 <Method Integer Integer.valueOf(int)>
	//   18   27:aastore         
	//   19   28:dup             
	//   20   29:iconst_3        
	//   21   30:iconst_0        
	//   22   31:invokestatic    #159 <Method Boolean Boolean.valueOf(boolean)>
	//   23   34:aastore         
	//   24   35:dup             
	//   25   36:iconst_4        
	//   26   37:iload           4
	//   27   39:invokestatic    #154 <Method Integer Integer.valueOf(int)>
	//   28   42:aastore         
	//   29   43:dup             
	//   30   44:iconst_5        
	//   31   45:iload           5
	//   32   47:invokestatic    #154 <Method Integer Integer.valueOf(int)>
	//   33   50:aastore         
	//   34   51:dup             
	//   35   52:bipush          6
	//   36   54:iload           6
	//   37   56:invokestatic    #154 <Method Integer Integer.valueOf(int)>
	//   38   59:aastore         
	//   39   60:dup             
	//   40   61:bipush          7
	//   41   63:aload           7
	//   42   65:aastore         
	//   43   66:invokevirtual   #135 <Method Object Method.invoke(Object, Object[])>
	//   44   69:checkcast       #156 <Class Boolean>
	//   45   72:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
	//   46   75:istore          8
		return flag;
	//   47   77:iload           8
	//   48   79:ireturn         
		context;
	//   49   80:astore_1        
		break MISSING_BLOCK_LABEL_85;
	//   50   81:goto            85
		context;
	//   51   84:astore_1        
		throw new RuntimeException(((Throwable) (context)));
	//   52   85:new             #137 <Class RuntimeException>
	//   53   88:dup             
	//   54   89:aload_1         
	//   55   90:invokespecial   #140 <Method void RuntimeException(Throwable)>
	//   56   93:athrow          
	}

	private boolean addFontFromBuffer(Object obj, ByteBuffer bytebuffer, int i, int j, int k)
	{
		boolean flag = ((Boolean)mAddFontFromBuffer.invoke(obj, new Object[] {
			bytebuffer, Integer.valueOf(i), null, Integer.valueOf(j), Integer.valueOf(k)
		})).booleanValue();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field Method mAddFontFromBuffer>
	//    2    4:aload_1         
	//    3    5:iconst_5        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_2         
	//    8   12:aastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:iload_3         
	//   12   16:invokestatic    #154 <Method Integer Integer.valueOf(int)>
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aconst_null     
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:iload           4
	//   21   28:invokestatic    #154 <Method Integer Integer.valueOf(int)>
	//   22   31:aastore         
	//   23   32:dup             
	//   24   33:iconst_4        
	//   25   34:iload           5
	//   26   36:invokestatic    #154 <Method Integer Integer.valueOf(int)>
	//   27   39:aastore         
	//   28   40:invokevirtual   #135 <Method Object Method.invoke(Object, Object[])>
	//   29   43:checkcast       #156 <Class Boolean>
	//   30   46:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
	//   31   49:istore          6
		return flag;
	//   32   51:iload           6
	//   33   53:ireturn         
		obj;
	//   34   54:astore_1        
		break MISSING_BLOCK_LABEL_59;
	//   35   55:goto            59
		obj;
	//   36   58:astore_1        
		throw new RuntimeException(((Throwable) (obj)));
	//   37   59:new             #137 <Class RuntimeException>
	//   38   62:dup             
	//   39   63:aload_1         
	//   40   64:invokespecial   #140 <Method void RuntimeException(Throwable)>
	//   41   67:athrow          
	}

	private boolean freeze(Object obj)
	{
		boolean flag = ((Boolean)mFreeze.invoke(obj, new Object[0])).booleanValue();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field Method mFreeze>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:anewarray       Object[]
	//    5    9:invokevirtual   #135 <Method Object Method.invoke(Object, Object[])>
	//    6   12:checkcast       #156 <Class Boolean>
	//    7   15:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
	//    8   18:istore_2        
		return flag;
	//    9   19:iload_2         
	//   10   20:ireturn         
		obj;
	//   11   21:astore_1        
		break MISSING_BLOCK_LABEL_26;
	//   12   22:goto            26
		obj;
	//   13   25:astore_1        
		throw new RuntimeException(((Throwable) (obj)));
	//   14   26:new             #137 <Class RuntimeException>
	//   15   29:dup             
	//   16   30:aload_1         
	//   17   31:invokespecial   #140 <Method void RuntimeException(Throwable)>
	//   18   34:athrow          
	}

	private boolean isFontFamilyPrivateAPIAvailable()
	{
		if(mAddFontFromAssetManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field Method mAddFontFromAssetManager>
	//*   2    4:ifnonnull       15
			Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
	//    3    7:ldc1            #38  <String "TypefaceCompatApi26Impl">
	//    4    9:ldc1            #169 <String "Unable to collect necessary private methods. Fallback to legacy implementation.">
	//    5   11:invokestatic    #173 <Method int Log.w(String, String)>
	//    6   14:pop             
		return mAddFontFromAssetManager != null;
	//    7   15:aload_0         
	//    8   16:getfield        #115 <Field Method mAddFontFromAssetManager>
	//    9   19:ifnull          24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	private Object newFamily()
	{
		Object obj = mFontFamilyCtor.newInstance(new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Constructor mFontFamilyCtor>
	//    2    4:iconst_0        
	//    3    5:anewarray       Object[]
	//    4    8:invokevirtual   #183 <Method Object Constructor.newInstance(Object[])>
	//    5   11:astore_1        
		return obj;
	//    6   12:aload_1         
	//    7   13:areturn         
		Object obj1;
		obj1;
	//    8   14:astore_1        
		break MISSING_BLOCK_LABEL_23;
	//    9   15:goto            23
		obj1;
	//   10   18:astore_1        
		break MISSING_BLOCK_LABEL_23;
	//   11   19:goto            23
		obj1;
	//   12   22:astore_1        
		throw new RuntimeException(((Throwable) (obj1)));
	//   13   23:new             #137 <Class RuntimeException>
	//   14   26:dup             
	//   15   27:aload_1         
	//   16   28:invokespecial   #140 <Method void RuntimeException(Throwable)>
	//   17   31:athrow          
	}

	protected Typeface createFromFamiliesWithDefault(Object obj)
	{
		Object obj1 = Array.newInstance(mFontFamily, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Class mFontFamily>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #189 <Method Object Array.newInstance(Class, int)>
	//    4    8:astore_2        
		Array.set(obj1, 0, obj);
	//    5    9:aload_2         
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:invokestatic    #193 <Method void Array.set(Object, int, Object)>
		obj = ((Object) ((Typeface)mCreateFromFamiliesWithDefault.invoke(((Object) (null)), new Object[] {
			obj1, Integer.valueOf(-1), Integer.valueOf(-1)
		})));
	//    9   15:aload_0         
	//   10   16:getfield        #123 <Field Method mCreateFromFamiliesWithDefault>
	//   11   19:aconst_null     
	//   12   20:iconst_3        
	//   13   21:anewarray       Object[]
	//   14   24:dup             
	//   15   25:iconst_0        
	//   16   26:aload_2         
	//   17   27:aastore         
	//   18   28:dup             
	//   19   29:iconst_1        
	//   20   30:iconst_m1       
	//   21   31:invokestatic    #154 <Method Integer Integer.valueOf(int)>
	//   22   34:aastore         
	//   23   35:dup             
	//   24   36:iconst_2        
	//   25   37:iconst_m1       
	//   26   38:invokestatic    #154 <Method Integer Integer.valueOf(int)>
	//   27   41:aastore         
	//   28   42:invokevirtual   #135 <Method Object Method.invoke(Object, Object[])>
	//   29   45:checkcast       #195 <Class Typeface>
	//   30   48:astore_1        
		return ((Typeface) (obj));
	//   31   49:aload_1         
	//   32   50:areturn         
		obj;
	//   33   51:astore_1        
		break MISSING_BLOCK_LABEL_56;
	//   34   52:goto            56
		obj;
	//   35   55:astore_1        
		throw new RuntimeException(((Throwable) (obj)));
	//   36   56:new             #137 <Class RuntimeException>
	//   37   59:dup             
	//   38   60:aload_1         
	//   39   61:invokespecial   #140 <Method void RuntimeException(Throwable)>
	//   40   64:athrow          
	}

	public Typeface createFromFontFamilyFilesResourceEntry(Context context, android.support.v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontfamilyfilesresourceentry, Resources resources, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #137 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #199 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #204 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public Typeface createFromFontInfo(Context context, CancellationSignal cancellationsignal, android.support.v4.provider.FontsContractCompat.FontInfo afontinfo[], int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #137 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #199 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #204 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String s, int j)
	{
		if(!isFontFamilyPrivateAPIAvailable())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #211 <Method boolean isFontFamilyPrivateAPIAvailable()>
	//*   2    4:ifne            19
			return super.createFromResourcesFontFile(context, resources, i, s, j);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:iload           5
	//    9   15:invokespecial   #213 <Method Typeface TypefaceCompatApi21Impl.createFromResourcesFontFile(Context, Resources, int, String, int)>
	//   10   18:areturn         
		resources = ((Resources) (newFamily()));
	//   11   19:aload_0         
	//   12   20:invokespecial   #215 <Method Object newFamily()>
	//   13   23:astore_2        
		if(!addFontFromAssetManager(context, ((Object) (resources)), s, 0, -1, -1, ((FontVariationAxis []) (null))))
	//*  14   24:aload_0         
	//*  15   25:aload_1         
	//*  16   26:aload_2         
	//*  17   27:aload           4
	//*  18   29:iconst_0        
	//*  19   30:iconst_m1       
	//*  20   31:iconst_m1       
	//*  21   32:aconst_null     
	//*  22   33:invokespecial   #217 <Method boolean addFontFromAssetManager(Context, Object, String, int, int, int, FontVariationAxis[])>
	//*  23   36:ifne            46
		{
			abortCreation(((Object) (resources)));
	//   24   39:aload_0         
	//   25   40:aload_2         
	//   26   41:invokespecial   #219 <Method void abortCreation(Object)>
			return null;
	//   27   44:aconst_null     
	//   28   45:areturn         
		}
		if(!freeze(((Object) (resources))))
	//*  29   46:aload_0         
	//*  30   47:aload_2         
	//*  31   48:invokespecial   #221 <Method boolean freeze(Object)>
	//*  32   51:ifne            56
			return null;
	//   33   54:aconst_null     
	//   34   55:areturn         
		else
			return createFromFamiliesWithDefault(((Object) (resources)));
	//   35   56:aload_0         
	//   36   57:aload_2         
	//   37   58:invokevirtual   #223 <Method Typeface createFromFamiliesWithDefault(Object)>
	//   38   61:areturn         
	}

	protected Method obtainAbortCreationMethod(Class class1)
		throws NoSuchMethodException
	{
		return class1.getMethod("abortCreation", new Class[0]);
	//    0    0:aload_1         
	//    1    1:ldc1            #14  <String "abortCreation">
	//    2    3:iconst_0        
	//    3    4:anewarray       Class[]
	//    4    7:invokevirtual   #228 <Method Method Class.getMethod(String, Class[])>
	//    5   10:areturn         
	}

	protected Method obtainAddFontFromAssetManagerMethod(Class class1)
		throws NoSuchMethodException
	{
		return class1.getMethod("addFontFromAssetManager", new Class[] {
			android/content/res/AssetManager, java/lang/String, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, [Landroid/graphics/fonts/FontVariationAxis;
		});
	//    0    0:aload_1         
	//    1    1:ldc1            #17  <String "addFontFromAssetManager">
	//    2    3:bipush          8
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #231 <Class AssetManager>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:ldc1            #233 <Class String>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:getstatic       #236 <Field Class Integer.TYPE>
	//   15   23:aastore         
	//   16   24:dup             
	//   17   25:iconst_3        
	//   18   26:getstatic       #237 <Field Class Boolean.TYPE>
	//   19   29:aastore         
	//   20   30:dup             
	//   21   31:iconst_4        
	//   22   32:getstatic       #236 <Field Class Integer.TYPE>
	//   23   35:aastore         
	//   24   36:dup             
	//   25   37:iconst_5        
	//   26   38:getstatic       #236 <Field Class Integer.TYPE>
	//   27   41:aastore         
	//   28   42:dup             
	//   29   43:bipush          6
	//   30   45:getstatic       #236 <Field Class Integer.TYPE>
	//   31   48:aastore         
	//   32   49:dup             
	//   33   50:bipush          7
	//   34   52:ldc1            #239 <Class FontVariationAxis[]>
	//   35   54:aastore         
	//   36   55:invokevirtual   #228 <Method Method Class.getMethod(String, Class[])>
	//   37   58:areturn         
	}

	protected Method obtainAddFontFromBufferMethod(Class class1)
		throws NoSuchMethodException
	{
		return class1.getMethod("addFontFromBuffer", new Class[] {
			java/nio/ByteBuffer, Integer.TYPE, [Landroid/graphics/fonts/FontVariationAxis;, Integer.TYPE, Integer.TYPE
		});
	//    0    0:aload_1         
	//    1    1:ldc1            #20  <String "addFontFromBuffer">
	//    2    3:iconst_5        
	//    3    4:anewarray       Class[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc1            #241 <Class ByteBuffer>
	//    7   11:aastore         
	//    8   12:dup             
	//    9   13:iconst_1        
	//   10   14:getstatic       #236 <Field Class Integer.TYPE>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:ldc1            #239 <Class FontVariationAxis[]>
	//   15   22:aastore         
	//   16   23:dup             
	//   17   24:iconst_3        
	//   18   25:getstatic       #236 <Field Class Integer.TYPE>
	//   19   28:aastore         
	//   20   29:dup             
	//   21   30:iconst_4        
	//   22   31:getstatic       #236 <Field Class Integer.TYPE>
	//   23   34:aastore         
	//   24   35:invokevirtual   #228 <Method Method Class.getMethod(String, Class[])>
	//   25   38:areturn         
	}

	protected Method obtainCreateFromFamiliesWithDefaultMethod(Class class1)
		throws NoSuchMethodException
	{
		class1 = ((Class) (((Class) (android/graphics/Typeface)).getDeclaredMethod("createFromFamiliesWithDefault", new Class[] {
			Array.newInstance(class1, 1).getClass(), Integer.TYPE, Integer.TYPE
		})));
	//    0    0:ldc1            #195 <Class Typeface>
	//    1    2:ldc1            #23  <String "createFromFamiliesWithDefault">
	//    2    4:iconst_3        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:invokestatic    #189 <Method Object Array.newInstance(Class, int)>
	//    9   15:invokevirtual   #94  <Method Class Object.getClass()>
	//   10   18:aastore         
	//   11   19:dup             
	//   12   20:iconst_1        
	//   13   21:getstatic       #236 <Field Class Integer.TYPE>
	//   14   24:aastore         
	//   15   25:dup             
	//   16   26:iconst_2        
	//   17   27:getstatic       #236 <Field Class Integer.TYPE>
	//   18   30:aastore         
	//   19   31:invokevirtual   #244 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   20   34:astore_1        
		((Method) (class1)).setAccessible(true);
	//   21   35:aload_1         
	//   22   36:iconst_1        
	//   23   37:invokevirtual   #248 <Method void Method.setAccessible(boolean)>
		return ((Method) (class1));
	//   24   40:aload_1         
	//   25   41:areturn         
	}

	protected Class obtainFontFamily()
		throws ClassNotFoundException
	{
		return Class.forName("android.graphics.FontFamily");
	//    0    0:ldc1            #29  <String "android.graphics.FontFamily">
	//    1    2:invokestatic    #252 <Method Class Class.forName(String)>
	//    2    5:areturn         
	}

	protected Constructor obtainFontFamilyCtor(Class class1)
		throws NoSuchMethodException
	{
		return class1.getConstructor(new Class[0]);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:anewarray       Class[]
	//    3    5:invokevirtual   #256 <Method Constructor Class.getConstructor(Class[])>
	//    4    8:areturn         
	}

	protected Method obtainFreezeMethod(Class class1)
		throws NoSuchMethodException
	{
		return class1.getMethod("freeze", new Class[0]);
	//    0    0:aload_1         
	//    1    1:ldc1            #32  <String "freeze">
	//    2    3:iconst_0        
	//    3    4:anewarray       Class[]
	//    4    7:invokevirtual   #228 <Method Method Class.getMethod(String, Class[])>
	//    5   10:areturn         
	}

	private static final String ABORT_CREATION_METHOD = "abortCreation";
	private static final String ADD_FONT_FROM_ASSET_MANAGER_METHOD = "addFontFromAssetManager";
	private static final String ADD_FONT_FROM_BUFFER_METHOD = "addFontFromBuffer";
	private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
	private static final String DEFAULT_FAMILY = "sans-serif";
	private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
	private static final String FREEZE_METHOD = "freeze";
	private static final int RESOLVE_BY_FONT_TABLE = -1;
	private static final String TAG = "TypefaceCompatApi26Impl";
	protected final Method mAbortCreation;
	protected final Method mAddFontFromAssetManager;
	protected final Method mAddFontFromBuffer;
	protected final Method mCreateFromFamiliesWithDefault;
	protected final Class mFontFamily;
	protected final Constructor mFontFamilyCtor;
	protected final Method mFreeze;
}
