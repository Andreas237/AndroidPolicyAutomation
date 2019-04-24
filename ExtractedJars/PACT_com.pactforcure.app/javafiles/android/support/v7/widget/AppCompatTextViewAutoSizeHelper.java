// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.text.*;
import android.util.*;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package android.support.v7.widget:
//			AppCompatEditText

class AppCompatTextViewAutoSizeHelper
{

	AppCompatTextViewAutoSizeHelper(TextView textview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		mAutoSizeTextType = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #59  <Field int mAutoSizeTextType>
		mNeedsAutoSizeText = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #61  <Field boolean mNeedsAutoSizeText>
		mAutoSizeStepGranularityInPx = -1F;
	//    8   14:aload_0         
	//    9   15:ldc1            #20  <Float -1F>
	//   10   17:putfield        #63  <Field float mAutoSizeStepGranularityInPx>
		mAutoSizeMinTextSizeInPx = -1F;
	//   11   20:aload_0         
	//   12   21:ldc1            #20  <Float -1F>
	//   13   23:putfield        #65  <Field float mAutoSizeMinTextSizeInPx>
		mAutoSizeMaxTextSizeInPx = -1F;
	//   14   26:aload_0         
	//   15   27:ldc1            #20  <Float -1F>
	//   16   29:putfield        #67  <Field float mAutoSizeMaxTextSizeInPx>
		mAutoSizeTextSizesInPx = new int[0];
	//   17   32:aload_0         
	//   18   33:iconst_0        
	//   19   34:newarray        int[]
	//   20   36:putfield        #69  <Field int[] mAutoSizeTextSizesInPx>
		mHasPresetAutoSizeValues = false;
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:putfield        #71  <Field boolean mHasPresetAutoSizeValues>
		mTextView = textview;
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:putfield        #73  <Field TextView mTextView>
		mContext = mTextView.getContext();
	//   27   49:aload_0         
	//   28   50:aload_0         
	//   29   51:getfield        #73  <Field TextView mTextView>
	//   30   54:invokevirtual   #79  <Method Context TextView.getContext()>
	//   31   57:putfield        #81  <Field Context mContext>
	//   32   60:return          
	}

	private int[] cleanupAutoSizePresetSizes(int ai[])
	{
		int k = ai.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		if(k != 0)
	//*   3    3:iload_3         
	//*   4    4:ifne            9
	//*   5    7:aload_1         
	//*   6    8:areturn         
		{
			Arrays.sort(ai);
	//    7    9:aload_1         
	//    8   10:invokestatic    #89  <Method void Arrays.sort(int[])>
			ArrayList arraylist = new ArrayList();
	//    9   13:new             #91  <Class ArrayList>
	//   10   16:dup             
	//   11   17:invokespecial   #92  <Method void ArrayList()>
	//   12   20:astore          5
			for(int i = 0; i < k; i++)
	//*  13   22:iconst_0        
	//*  14   23:istore_2        
	//*  15   24:iload_2         
	//*  16   25:iload_3         
	//*  17   26:icmpge          72
			{
				int i1 = ai[i];
	//   18   29:aload_1         
	//   19   30:iload_2         
	//   20   31:iaload          
	//   21   32:istore          4
				if(i1 > 0 && Collections.binarySearch(((List) (arraylist)), ((Object) (Integer.valueOf(i1)))) < 0)
	//*  22   34:iload           4
	//*  23   36:ifle            65
	//*  24   39:aload           5
	//*  25   41:iload           4
	//*  26   43:invokestatic    #98  <Method Integer Integer.valueOf(int)>
	//*  27   46:invokestatic    #104 <Method int Collections.binarySearch(List, Object)>
	//*  28   49:ifge            65
					((List) (arraylist)).add(((Object) (Integer.valueOf(i1))));
	//   29   52:aload           5
	//   30   54:iload           4
	//   31   56:invokestatic    #98  <Method Integer Integer.valueOf(int)>
	//   32   59:invokeinterface #110 <Method boolean List.add(Object)>
	//   33   64:pop             
			}

	//   34   65:iload_2         
	//   35   66:iconst_1        
	//   36   67:iadd            
	//   37   68:istore_2        
	//*  38   69:goto            24
			if(k != ((List) (arraylist)).size())
	//*  39   72:iload_3         
	//*  40   73:aload           5
	//*  41   75:invokeinterface #114 <Method int List.size()>
	//*  42   80:icmpeq          7
			{
				int l = ((List) (arraylist)).size();
	//   43   83:aload           5
	//   44   85:invokeinterface #114 <Method int List.size()>
	//   45   90:istore_3        
				ai = new int[l];
	//   46   91:iload_3         
	//   47   92:newarray        int[]
	//   48   94:astore_1        
				for(int j = 0; j < l; j++)
	//*  49   95:iconst_0        
	//*  50   96:istore_2        
	//*  51   97:iload_2         
	//*  52   98:iload_3         
	//*  53   99:icmpge          126
					ai[j] = ((Integer)((List) (arraylist)).get(j)).intValue();
	//   54  102:aload_1         
	//   55  103:iload_2         
	//   56  104:aload           5
	//   57  106:iload_2         
	//   58  107:invokeinterface #118 <Method Object List.get(int)>
	//   59  112:checkcast       #94  <Class Integer>
	//   60  115:invokevirtual   #121 <Method int Integer.intValue()>
	//   61  118:iastore         

	//   62  119:iload_2         
	//   63  120:iconst_1        
	//   64  121:iadd            
	//   65  122:istore_2        
	//*  66  123:goto            97
				return ai;
	//   67  126:aload_1         
	//   68  127:areturn         
			}
		}
		return ai;
	}

	private void clearAutoSizeConfiguration()
	{
		mAutoSizeTextType = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #59  <Field int mAutoSizeTextType>
		mAutoSizeMinTextSizeInPx = -1F;
	//    3    5:aload_0         
	//    4    6:ldc1            #20  <Float -1F>
	//    5    8:putfield        #65  <Field float mAutoSizeMinTextSizeInPx>
		mAutoSizeMaxTextSizeInPx = -1F;
	//    6   11:aload_0         
	//    7   12:ldc1            #20  <Float -1F>
	//    8   14:putfield        #67  <Field float mAutoSizeMaxTextSizeInPx>
		mAutoSizeStepGranularityInPx = -1F;
	//    9   17:aload_0         
	//   10   18:ldc1            #20  <Float -1F>
	//   11   20:putfield        #63  <Field float mAutoSizeStepGranularityInPx>
		mAutoSizeTextSizesInPx = new int[0];
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:newarray        int[]
	//   15   27:putfield        #69  <Field int[] mAutoSizeTextSizesInPx>
		mNeedsAutoSizeText = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #61  <Field boolean mNeedsAutoSizeText>
	//   19   35:return          
	}

	private StaticLayout createStaticLayoutForMeasuring(CharSequence charsequence, android.text.Layout.Alignment alignment, int i, int j)
	{
		TextDirectionHeuristic textdirectionheuristic = (TextDirectionHeuristic)invokeAndReturnWithDefault(((Object) (mTextView)), "getTextDirectionHeuristic", ((Object) (TextDirectionHeuristics.FIRSTSTRONG_LTR)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #73  <Field TextView mTextView>
	//    3    5:ldc1            #129 <String "getTextDirectionHeuristic">
	//    4    7:getstatic       #135 <Field TextDirectionHeuristic TextDirectionHeuristics.FIRSTSTRONG_LTR>
	//    5   10:invokespecial   #139 <Method Object invokeAndReturnWithDefault(Object, String, Object)>
	//    6   13:checkcast       #141 <Class TextDirectionHeuristic>
	//    7   16:astore          5
		charsequence = ((CharSequence) (android.text.StaticLayout.Builder.obtain(charsequence, 0, charsequence.length(), mTempTextPaint, i).setAlignment(alignment).setLineSpacing(mTextView.getLineSpacingExtra(), mTextView.getLineSpacingMultiplier()).setIncludePad(mTextView.getIncludeFontPadding()).setBreakStrategy(mTextView.getBreakStrategy()).setHyphenationFrequency(mTextView.getHyphenationFrequency())));
	//    8   18:aload_1         
	//    9   19:iconst_0        
	//   10   20:aload_1         
	//   11   21:invokeinterface #146 <Method int CharSequence.length()>
	//   12   26:aload_0         
	//   13   27:getfield        #148 <Field TextPaint mTempTextPaint>
	//   14   30:iload_3         
	//   15   31:invokestatic    #154 <Method android.text.StaticLayout$Builder android.text.StaticLayout$Builder.obtain(CharSequence, int, int, TextPaint, int)>
	//   16   34:aload_2         
	//   17   35:invokevirtual   #158 <Method android.text.StaticLayout$Builder android.text.StaticLayout$Builder.setAlignment(android.text.Layout$Alignment)>
	//   18   38:aload_0         
	//   19   39:getfield        #73  <Field TextView mTextView>
	//   20   42:invokevirtual   #162 <Method float TextView.getLineSpacingExtra()>
	//   21   45:aload_0         
	//   22   46:getfield        #73  <Field TextView mTextView>
	//   23   49:invokevirtual   #165 <Method float TextView.getLineSpacingMultiplier()>
	//   24   52:invokevirtual   #169 <Method android.text.StaticLayout$Builder android.text.StaticLayout$Builder.setLineSpacing(float, float)>
	//   25   55:aload_0         
	//   26   56:getfield        #73  <Field TextView mTextView>
	//   27   59:invokevirtual   #173 <Method boolean TextView.getIncludeFontPadding()>
	//   28   62:invokevirtual   #177 <Method android.text.StaticLayout$Builder android.text.StaticLayout$Builder.setIncludePad(boolean)>
	//   29   65:aload_0         
	//   30   66:getfield        #73  <Field TextView mTextView>
	//   31   69:invokevirtual   #180 <Method int TextView.getBreakStrategy()>
	//   32   72:invokevirtual   #184 <Method android.text.StaticLayout$Builder android.text.StaticLayout$Builder.setBreakStrategy(int)>
	//   33   75:aload_0         
	//   34   76:getfield        #73  <Field TextView mTextView>
	//   35   79:invokevirtual   #187 <Method int TextView.getHyphenationFrequency()>
	//   36   82:invokevirtual   #190 <Method android.text.StaticLayout$Builder android.text.StaticLayout$Builder.setHyphenationFrequency(int)>
	//   37   85:astore_1        
		i = j;
	//   38   86:iload           4
	//   39   88:istore_3        
		if(j == -1)
	//*  40   89:iload           4
	//*  41   91:iconst_m1       
	//*  42   92:icmpne          98
			i = 0x7fffffff;
	//   43   95:ldc1            #191 <Int 0x7fffffff>
	//   44   97:istore_3        
		return ((android.text.StaticLayout.Builder) (charsequence)).setMaxLines(i).setTextDirection(textdirectionheuristic).build();
	//   45   98:aload_1         
	//   46   99:iload_3         
	//   47  100:invokevirtual   #194 <Method android.text.StaticLayout$Builder android.text.StaticLayout$Builder.setMaxLines(int)>
	//   48  103:aload           5
	//   49  105:invokevirtual   #198 <Method android.text.StaticLayout$Builder android.text.StaticLayout$Builder.setTextDirection(TextDirectionHeuristic)>
	//   50  108:invokevirtual   #202 <Method StaticLayout android.text.StaticLayout$Builder.build()>
	//   51  111:areturn         
	}

	private StaticLayout createStaticLayoutForMeasuringPre23(CharSequence charsequence, android.text.Layout.Alignment alignment, int i)
	{
		float f;
		float f1;
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #211 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          56
		{
			f = mTextView.getLineSpacingMultiplier();
	//    3    8:aload_0         
	//    4    9:getfield        #73  <Field TextView mTextView>
	//    5   12:invokevirtual   #165 <Method float TextView.getLineSpacingMultiplier()>
	//    6   15:fstore          4
			f1 = mTextView.getLineSpacingExtra();
	//    7   17:aload_0         
	//    8   18:getfield        #73  <Field TextView mTextView>
	//    9   21:invokevirtual   #162 <Method float TextView.getLineSpacingExtra()>
	//   10   24:fstore          5
			flag = mTextView.getIncludeFontPadding();
	//   11   26:aload_0         
	//   12   27:getfield        #73  <Field TextView mTextView>
	//   13   30:invokevirtual   #173 <Method boolean TextView.getIncludeFontPadding()>
	//   14   33:istore          6
		} else
	//*  15   35:new             #213 <Class StaticLayout>
	//*  16   38:dup             
	//*  17   39:aload_1         
	//*  18   40:aload_0         
	//*  19   41:getfield        #148 <Field TextPaint mTempTextPaint>
	//*  20   44:iload_3         
	//*  21   45:aload_2         
	//*  22   46:fload           4
	//*  23   48:fload           5
	//*  24   50:iload           6
	//*  25   52:invokespecial   #216 <Method void StaticLayout(CharSequence, TextPaint, int, android.text.Layout$Alignment, float, float, boolean)>
	//*  26   55:areturn         
		{
			f = ((Float)invokeAndReturnWithDefault(((Object) (mTextView)), "getLineSpacingMultiplier", ((Object) (Float.valueOf(1.0F))))).floatValue();
	//   27   56:aload_0         
	//   28   57:aload_0         
	//   29   58:getfield        #73  <Field TextView mTextView>
	//   30   61:ldc1            #217 <String "getLineSpacingMultiplier">
	//   31   63:fconst_1        
	//   32   64:invokestatic    #222 <Method Float Float.valueOf(float)>
	//   33   67:invokespecial   #139 <Method Object invokeAndReturnWithDefault(Object, String, Object)>
	//   34   70:checkcast       #219 <Class Float>
	//   35   73:invokevirtual   #225 <Method float Float.floatValue()>
	//   36   76:fstore          4
			f1 = ((Float)invokeAndReturnWithDefault(((Object) (mTextView)), "getLineSpacingExtra", ((Object) (Float.valueOf(0.0F))))).floatValue();
	//   37   78:aload_0         
	//   38   79:aload_0         
	//   39   80:getfield        #73  <Field TextView mTextView>
	//   40   83:ldc1            #226 <String "getLineSpacingExtra">
	//   41   85:fconst_0        
	//   42   86:invokestatic    #222 <Method Float Float.valueOf(float)>
	//   43   89:invokespecial   #139 <Method Object invokeAndReturnWithDefault(Object, String, Object)>
	//   44   92:checkcast       #219 <Class Float>
	//   45   95:invokevirtual   #225 <Method float Float.floatValue()>
	//   46   98:fstore          5
			flag = ((Boolean)invokeAndReturnWithDefault(((Object) (mTextView)), "getIncludeFontPadding", ((Object) (Boolean.valueOf(true))))).booleanValue();
	//   47  100:aload_0         
	//   48  101:aload_0         
	//   49  102:getfield        #73  <Field TextView mTextView>
	//   50  105:ldc1            #227 <String "getIncludeFontPadding">
	//   51  107:iconst_1        
	//   52  108:invokestatic    #232 <Method Boolean Boolean.valueOf(boolean)>
	//   53  111:invokespecial   #139 <Method Object invokeAndReturnWithDefault(Object, String, Object)>
	//   54  114:checkcast       #229 <Class Boolean>
	//   55  117:invokevirtual   #235 <Method boolean Boolean.booleanValue()>
	//   56  120:istore          6
		}
		return new StaticLayout(charsequence, mTempTextPaint, i, alignment, f, f1, flag);
	//*  57  122:goto            35
	}

	private int findLargestTextSizeWhichFits(RectF rectf)
	{
		int k = mAutoSizeTextSizesInPx.length;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//    2    4:arraylength     
	//    3    5:istore          4
		if(k == 0)
	//*   4    7:iload           4
	//*   5    9:ifne            22
			throw new IllegalStateException("No available text sizes to choose from.");
	//    6   12:new             #239 <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #241 <String "No available text sizes to choose from.">
	//    9   18:invokespecial   #244 <Method void IllegalStateException(String)>
	//   10   21:athrow          
		int j = 0;
	//   11   22:iconst_0        
	//   12   23:istore_3        
		int i = 0 + 1;
	//   13   24:iconst_0        
	//   14   25:iconst_1        
	//   15   26:iadd            
	//   16   27:istore_2        
		for(k--; i <= k;)
	//*  17   28:iload           4
	//*  18   30:iconst_1        
	//*  19   31:isub            
	//*  20   32:istore          4
	//*  21   34:iload_2         
	//*  22   35:iload           4
	//*  23   37:icmpgt          85
		{
			j = (i + k) / 2;
	//   24   40:iload_2         
	//   25   41:iload           4
	//   26   43:iadd            
	//   27   44:iconst_2        
	//   28   45:idiv            
	//   29   46:istore_3        
			if(suggestedSizeFitsInSpace(mAutoSizeTextSizesInPx[j], rectf))
	//*  30   47:aload_0         
	//*  31   48:aload_0         
	//*  32   49:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//*  33   52:iload_3         
	//*  34   53:iaload          
	//*  35   54:aload_1         
	//*  36   55:invokespecial   #248 <Method boolean suggestedSizeFitsInSpace(int, RectF)>
	//*  37   58:ifeq            74
			{
				int l = j + 1;
	//   38   61:iload_3         
	//   39   62:iconst_1        
	//   40   63:iadd            
	//   41   64:istore          5
				j = i;
	//   42   66:iload_2         
	//   43   67:istore_3        
				i = l;
	//   44   68:iload           5
	//   45   70:istore_2        
			} else
	//*  46   71:goto            34
			{
				k = j - 1;
	//   47   74:iload_3         
	//   48   75:iconst_1        
	//   49   76:isub            
	//   50   77:istore          4
				j = k;
	//   51   79:iload           4
	//   52   81:istore_3        
			}
		}

	//*  53   82:goto            34
		return mAutoSizeTextSizesInPx[j];
	//   54   85:aload_0         
	//   55   86:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//   56   89:iload_3         
	//   57   90:iaload          
	//   58   91:ireturn         
	}

	private Method getTextViewMethod(String s)
	{
		Method method;
		Method method1;
		try
		{
			method1 = (Method)sTextViewMethodByNameCache.get(((Object) (s)));
	//    0    0:getstatic       #54  <Field Hashtable sTextViewMethodByNameCache>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #257 <Method Object Hashtable.get(Object)>
	//    3    7:checkcast       #259 <Class Method>
	//    4   10:astore_3        
		}
	//*   5   11:aload_3         
	//*   6   12:astore_2        
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       50
	//*   9   17:ldc1            #75  <Class TextView>
	//*  10   19:aload_1         
	//*  11   20:iconst_0        
	//*  12   21:anewarray       Class[]
	//*  13   24:invokevirtual   #265 <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  14   27:astore_3        
	//*  15   28:aload_3         
	//*  16   29:astore_2        
	//*  17   30:aload_3         
	//*  18   31:ifnull          50
	//*  19   34:aload_3         
	//*  20   35:iconst_1        
	//*  21   36:invokevirtual   #269 <Method void Method.setAccessible(boolean)>
	//*  22   39:getstatic       #54  <Field Hashtable sTextViewMethodByNameCache>
	//*  23   42:aload_1         
	//*  24   43:aload_3         
	//*  25   44:invokevirtual   #273 <Method Object Hashtable.put(Object, Object)>
	//*  26   47:pop             
	//*  27   48:aload_3         
	//*  28   49:astore_2        
	//*  29   50:aload_2         
	//*  30   51:areturn         
		catch(Exception exception)
	//*  31   52:astore_2        
		{
			Log.w("ACTVAutoSizeHelper", (new StringBuilder()).append("Failed to retrieve TextView#").append(s).append("() method").toString(), ((Throwable) (exception)));
	//   32   53:ldc1            #15  <String "ACTVAutoSizeHelper">
	//   33   55:new             #275 <Class StringBuilder>
	//   34   58:dup             
	//   35   59:invokespecial   #276 <Method void StringBuilder()>
	//   36   62:ldc2            #278 <String "Failed to retrieve TextView#">
	//   37   65:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   38   68:aload_1         
	//   39   69:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   40   72:ldc2            #284 <String "() method">
	//   41   75:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   42   78:invokevirtual   #288 <Method String StringBuilder.toString()>
	//   43   81:aload_2         
	//   44   82:invokestatic    #294 <Method int Log.w(String, String, Throwable)>
	//   45   85:pop             
			return null;
	//   46   86:aconst_null     
	//   47   87:areturn         
		}
		method = method1;
		if(method1 != null)
			break MISSING_BLOCK_LABEL_50;
		method1 = ((Class) (android/widget/TextView)).getDeclaredMethod(s, new Class[0]);
		method = method1;
		if(method1 == null)
			break MISSING_BLOCK_LABEL_50;
		method1.setAccessible(true);
		sTextViewMethodByNameCache.put(((Object) (s)), ((Object) (method1)));
		method = method1;
		return method;
	}

	private Object invokeAndReturnWithDefault(Object obj, String s, Object obj1)
	{
		boolean flag;
		Object obj2;
		obj2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		flag = false;
	//    2    3:iconst_0        
	//    3    4:istore          4
		obj = getTextViewMethod(s).invoke(obj, new Object[0]);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokespecial   #297 <Method Method getTextViewMethod(String)>
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:anewarray       Object[]
	//   10   16:invokevirtual   #301 <Method Object Method.invoke(Object, Object[])>
	//   11   19:astore_1        
		s = ((String) (obj));
	//   12   20:aload_1         
	//   13   21:astore_2        
		obj = ((Object) (s));
	//   14   22:aload_2         
	//   15   23:astore_1        
		if(s == null)
	//*  16   24:aload_2         
	//*  17   25:ifnonnull       36
		{
			obj = ((Object) (s));
	//   18   28:aload_2         
	//   19   29:astore_1        
			if(false)
	//*  20   30:iconst_0        
	//*  21   31:ifeq            36
				obj = obj1;
	//   22   34:aload_3         
	//   23   35:astore_1        
		}
_L2:
		return obj;
	//   24   36:aload_1         
	//   25   37:areturn         
		obj;
	//   26   38:astore_1        
		flag = true;
	//   27   39:iconst_1        
	//   28   40:istore          4
		Log.w("ACTVAutoSizeHelper", (new StringBuilder()).append("Failed to invoke TextView#").append(s).append("() method").toString(), ((Throwable) (obj)));
	//   29   42:ldc1            #15  <String "ACTVAutoSizeHelper">
	//   30   44:new             #275 <Class StringBuilder>
	//   31   47:dup             
	//   32   48:invokespecial   #276 <Method void StringBuilder()>
	//   33   51:ldc2            #303 <String "Failed to invoke TextView#">
	//   34   54:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   35   57:aload_2         
	//   36   58:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   37   61:ldc2            #284 <String "() method">
	//   38   64:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   39   67:invokevirtual   #288 <Method String StringBuilder.toString()>
	//   40   70:aload_1         
	//   41   71:invokestatic    #294 <Method int Log.w(String, String, Throwable)>
	//   42   74:pop             
		obj = ((Object) (obj2));
	//   43   75:aload           5
	//   44   77:astore_1        
		if(false) goto _L2; else goto _L1
	//   45   78:iconst_0        
	//   46   79:ifne            36
_L1:
		obj = ((Object) (obj2));
	//   47   82:aload           5
	//   48   84:astore_1        
		if(false) goto _L2; else goto _L3
	//   49   85:iconst_1        
	//   50   86:ifeq            36
_L3:
		return obj1;
	//   51   89:aload_3         
	//   52   90:areturn         
		obj;
	//   53   91:astore_1        
		if(true)
	//*  54   92:iconst_0        
	//*  55   93:ifne            101
			if(!flag);
	//   56   96:iload           4
	//   57   98:ifeq            101
		throw obj;
	//   58  101:aload_1         
	//   59  102:athrow          
	}

	private void setRawTextSize(float f)
	{
		boolean flag;
		if(f == mTextView.getPaint().getTextSize())
			break MISSING_BLOCK_LABEL_102;
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #73  <Field TextView mTextView>
	//    3    5:invokevirtual   #311 <Method TextPaint TextView.getPaint()>
	//    4    8:invokevirtual   #316 <Method float TextPaint.getTextSize()>
	//    5   11:fcmpl           
	//    6   12:ifeq            102
		mTextView.getPaint().setTextSize(f);
	//    7   15:aload_0         
	//    8   16:getfield        #73  <Field TextView mTextView>
	//    9   19:invokevirtual   #311 <Method TextPaint TextView.getPaint()>
	//   10   22:fload_1         
	//   11   23:invokevirtual   #319 <Method void TextPaint.setTextSize(float)>
		flag = false;
	//   12   26:iconst_0        
	//   13   27:istore_2        
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  14   28:getstatic       #211 <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   31:bipush          18
	//*  16   33:icmplt          44
			flag = mTextView.isInLayout();
	//   17   36:aload_0         
	//   18   37:getfield        #73  <Field TextView mTextView>
	//   19   40:invokevirtual   #322 <Method boolean TextView.isInLayout()>
	//   20   43:istore_2        
		if(mTextView.getLayout() == null)
			break MISSING_BLOCK_LABEL_102;
	//   21   44:aload_0         
	//   22   45:getfield        #73  <Field TextView mTextView>
	//   23   48:invokevirtual   #326 <Method android.text.Layout TextView.getLayout()>
	//   24   51:ifnull          102
		mNeedsAutoSizeText = false;
	//   25   54:aload_0         
	//   26   55:iconst_0        
	//   27   56:putfield        #61  <Field boolean mNeedsAutoSizeText>
		Method method = getTextViewMethod("nullLayouts");
	//   28   59:aload_0         
	//   29   60:ldc2            #328 <String "nullLayouts">
	//   30   63:invokespecial   #297 <Method Method getTextViewMethod(String)>
	//   31   66:astore_3        
		if(method != null)
	//*  32   67:aload_3         
	//*  33   68:ifnull          84
			try
			{
				method.invoke(((Object) (mTextView)), new Object[0]);
	//   34   71:aload_3         
	//   35   72:aload_0         
	//   36   73:getfield        #73  <Field TextView mTextView>
	//   37   76:iconst_0        
	//   38   77:anewarray       Object[]
	//   39   80:invokevirtual   #301 <Method Object Method.invoke(Object, Object[])>
	//   40   83:pop             
			}
	//*  41   84:iload_2         
	//*  42   85:ifne            117
	//*  43   88:aload_0         
	//*  44   89:getfield        #73  <Field TextView mTextView>
	//*  45   92:invokevirtual   #331 <Method void TextView.requestLayout()>
	//*  46   95:aload_0         
	//*  47   96:getfield        #73  <Field TextView mTextView>
	//*  48   99:invokevirtual   #334 <Method void TextView.invalidate()>
	//*  49  102:return          
			catch(Exception exception)
	//*  50  103:astore_3        
			{
				Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", ((Throwable) (exception)));
	//   51  104:ldc1            #15  <String "ACTVAutoSizeHelper">
	//   52  106:ldc2            #336 <String "Failed to invoke TextView#nullLayouts() method">
	//   53  109:aload_3         
	//   54  110:invokestatic    #294 <Method int Log.w(String, String, Throwable)>
	//   55  113:pop             
			}
		if(!flag)
			mTextView.requestLayout();
		else
	//*  56  114:goto            84
			mTextView.forceLayout();
	//   57  117:aload_0         
	//   58  118:getfield        #73  <Field TextView mTextView>
	//   59  121:invokevirtual   #339 <Method void TextView.forceLayout()>
		mTextView.invalidate();
	//*  60  124:goto            95
	}

	private boolean setupAutoSizeText()
	{
		if(supportsAutoSizeText() && mAutoSizeTextType == 1)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #343 <Method boolean supportsAutoSizeText()>
	//*   2    4:ifeq            133
	//*   3    7:aload_0         
	//*   4    8:getfield        #59  <Field int mAutoSizeTextType>
	//*   5   11:iconst_1        
	//*   6   12:icmpne          133
		{
			if(!mHasPresetAutoSizeValues || mAutoSizeTextSizesInPx.length == 0)
	//*   7   15:aload_0         
	//*   8   16:getfield        #71  <Field boolean mHasPresetAutoSizeValues>
	//*   9   19:ifeq            30
	//*  10   22:aload_0         
	//*  11   23:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//*  12   26:arraylength     
	//*  13   27:ifne            123
			{
				int i = 1;
	//   14   30:iconst_1        
	//   15   31:istore_2        
				for(float f = Math.round(mAutoSizeMinTextSizeInPx); Math.round(mAutoSizeStepGranularityInPx + f) <= Math.round(mAutoSizeMaxTextSizeInPx); f += mAutoSizeStepGranularityInPx)
	//*  16   32:aload_0         
	//*  17   33:getfield        #65  <Field float mAutoSizeMinTextSizeInPx>
	//*  18   36:invokestatic    #349 <Method int Math.round(float)>
	//*  19   39:i2f             
	//*  20   40:fstore_1        
	//*  21   41:aload_0         
	//*  22   42:getfield        #63  <Field float mAutoSizeStepGranularityInPx>
	//*  23   45:fload_1         
	//*  24   46:fadd            
	//*  25   47:invokestatic    #349 <Method int Math.round(float)>
	//*  26   50:aload_0         
	//*  27   51:getfield        #67  <Field float mAutoSizeMaxTextSizeInPx>
	//*  28   54:invokestatic    #349 <Method int Math.round(float)>
	//*  29   57:icmpgt          74
					i++;
	//   30   60:iload_2         
	//   31   61:iconst_1        
	//   32   62:iadd            
	//   33   63:istore_2        

	//   34   64:fload_1         
	//   35   65:aload_0         
	//   36   66:getfield        #63  <Field float mAutoSizeStepGranularityInPx>
	//   37   69:fadd            
	//   38   70:fstore_1        
	//*  39   71:goto            41
				int ai[] = new int[i];
	//   40   74:iload_2         
	//   41   75:newarray        int[]
	//   42   77:astore          4
				float f1 = mAutoSizeMinTextSizeInPx;
	//   43   79:aload_0         
	//   44   80:getfield        #65  <Field float mAutoSizeMinTextSizeInPx>
	//   45   83:fstore_1        
				for(int j = 0; j < i; j++)
	//*  46   84:iconst_0        
	//*  47   85:istore_3        
	//*  48   86:iload_3         
	//*  49   87:iload_2         
	//*  50   88:icmpge          113
				{
					ai[j] = Math.round(f1);
	//   51   91:aload           4
	//   52   93:iload_3         
	//   53   94:fload_1         
	//   54   95:invokestatic    #349 <Method int Math.round(float)>
	//   55   98:iastore         
					f1 += mAutoSizeStepGranularityInPx;
	//   56   99:fload_1         
	//   57  100:aload_0         
	//   58  101:getfield        #63  <Field float mAutoSizeStepGranularityInPx>
	//   59  104:fadd            
	//   60  105:fstore_1        
				}

	//   61  106:iload_3         
	//   62  107:iconst_1        
	//   63  108:iadd            
	//   64  109:istore_3        
	//*  65  110:goto            86
				mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(ai);
	//   66  113:aload_0         
	//   67  114:aload_0         
	//   68  115:aload           4
	//   69  117:invokespecial   #351 <Method int[] cleanupAutoSizePresetSizes(int[])>
	//   70  120:putfield        #69  <Field int[] mAutoSizeTextSizesInPx>
			}
			mNeedsAutoSizeText = true;
	//   71  123:aload_0         
	//   72  124:iconst_1        
	//   73  125:putfield        #61  <Field boolean mNeedsAutoSizeText>
		} else
	//*  74  128:aload_0         
	//*  75  129:getfield        #61  <Field boolean mNeedsAutoSizeText>
	//*  76  132:ireturn         
		{
			mNeedsAutoSizeText = false;
	//   77  133:aload_0         
	//   78  134:iconst_0        
	//   79  135:putfield        #61  <Field boolean mNeedsAutoSizeText>
		}
		return mNeedsAutoSizeText;
	//*  80  138:goto            128
	}

	private void setupAutoSizeUniformPresetSizes(TypedArray typedarray)
	{
		int j = typedarray.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #356 <Method int TypedArray.length()>
	//    2    4:istore_3        
		int ai[] = new int[j];
	//    3    5:iload_3         
	//    4    6:newarray        int[]
	//    5    8:astore          4
		if(j > 0)
	//*   6   10:iload_3         
	//*   7   11:ifle            53
		{
			for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_2        
	//*  10   16:iload_2         
	//*  11   17:iload_3         
	//*  12   18:icmpge          38
				ai[i] = typedarray.getDimensionPixelSize(i, -1);
	//   13   21:aload           4
	//   14   23:iload_2         
	//   15   24:aload_1         
	//   16   25:iload_2         
	//   17   26:iconst_m1       
	//   18   27:invokevirtual   #360 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   19   30:iastore         

	//   20   31:iload_2         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_2        
	//*  24   35:goto            16
			mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(ai);
	//   25   38:aload_0         
	//   26   39:aload_0         
	//   27   40:aload           4
	//   28   42:invokespecial   #351 <Method int[] cleanupAutoSizePresetSizes(int[])>
	//   29   45:putfield        #69  <Field int[] mAutoSizeTextSizesInPx>
			setupAutoSizeUniformPresetSizesConfiguration();
	//   30   48:aload_0         
	//   31   49:invokespecial   #363 <Method boolean setupAutoSizeUniformPresetSizesConfiguration()>
	//   32   52:pop             
		}
	//   33   53:return          
	}

	private boolean setupAutoSizeUniformPresetSizesConfiguration()
	{
		int i = mAutoSizeTextSizesInPx.length;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//    2    4:arraylength     
	//    3    5:istore_1        
		boolean flag;
		if(i > 0)
	//*   4    6:iload_1         
	//*   5    7:ifle            64
			flag = true;
	//    6   10:iconst_1        
	//    7   11:istore_2        
		else
	//*   8   12:aload_0         
	//*   9   13:iload_2         
	//*  10   14:putfield        #71  <Field boolean mHasPresetAutoSizeValues>
	//*  11   17:aload_0         
	//*  12   18:getfield        #71  <Field boolean mHasPresetAutoSizeValues>
	//*  13   21:ifeq            59
	//*  14   24:aload_0         
	//*  15   25:iconst_1        
	//*  16   26:putfield        #59  <Field int mAutoSizeTextType>
	//*  17   29:aload_0         
	//*  18   30:aload_0         
	//*  19   31:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//*  20   34:iconst_0        
	//*  21   35:iaload          
	//*  22   36:i2f             
	//*  23   37:putfield        #65  <Field float mAutoSizeMinTextSizeInPx>
	//*  24   40:aload_0         
	//*  25   41:aload_0         
	//*  26   42:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//*  27   45:iload_1         
	//*  28   46:iconst_1        
	//*  29   47:isub            
	//*  30   48:iaload          
	//*  31   49:i2f             
	//*  32   50:putfield        #67  <Field float mAutoSizeMaxTextSizeInPx>
	//*  33   53:aload_0         
	//*  34   54:ldc1            #20  <Float -1F>
	//*  35   56:putfield        #63  <Field float mAutoSizeStepGranularityInPx>
	//*  36   59:aload_0         
	//*  37   60:getfield        #71  <Field boolean mHasPresetAutoSizeValues>
	//*  38   63:ireturn         
			flag = false;
	//   39   64:iconst_0        
	//   40   65:istore_2        
		mHasPresetAutoSizeValues = flag;
		if(mHasPresetAutoSizeValues)
		{
			mAutoSizeTextType = 1;
			mAutoSizeMinTextSizeInPx = mAutoSizeTextSizesInPx[0];
			mAutoSizeMaxTextSizeInPx = mAutoSizeTextSizesInPx[i - 1];
			mAutoSizeStepGranularityInPx = -1F;
		}
		return mHasPresetAutoSizeValues;
	//*  41   66:goto            12
	}

	private boolean suggestedSizeFitsInSpace(int i, RectF rectf)
	{
		CharSequence charsequence = mTextView.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field TextView mTextView>
	//    2    4:invokevirtual   #367 <Method CharSequence TextView.getText()>
	//    3    7:astore          5
		int j;
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   4    9:getstatic       #211 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   12:bipush          16
	//*   6   14:icmplt          149
			j = mTextView.getMaxLines();
	//    7   17:aload_0         
	//    8   18:getfield        #73  <Field TextView mTextView>
	//    9   21:invokevirtual   #370 <Method int TextView.getMaxLines()>
	//   10   24:istore_3        
		else
	//*  11   25:aload_0         
	//*  12   26:getfield        #148 <Field TextPaint mTempTextPaint>
	//*  13   29:ifnonnull       154
	//*  14   32:aload_0         
	//*  15   33:new             #313 <Class TextPaint>
	//*  16   36:dup             
	//*  17   37:invokespecial   #371 <Method void TextPaint()>
	//*  18   40:putfield        #148 <Field TextPaint mTempTextPaint>
	//*  19   43:aload_0         
	//*  20   44:getfield        #148 <Field TextPaint mTempTextPaint>
	//*  21   47:aload_0         
	//*  22   48:getfield        #73  <Field TextView mTextView>
	//*  23   51:invokevirtual   #311 <Method TextPaint TextView.getPaint()>
	//*  24   54:invokevirtual   #375 <Method void TextPaint.set(TextPaint)>
	//*  25   57:aload_0         
	//*  26   58:getfield        #148 <Field TextPaint mTempTextPaint>
	//*  27   61:iload_1         
	//*  28   62:i2f             
	//*  29   63:invokevirtual   #319 <Method void TextPaint.setTextSize(float)>
	//*  30   66:aload_0         
	//*  31   67:aload_0         
	//*  32   68:getfield        #73  <Field TextView mTextView>
	//*  33   71:ldc2            #377 <String "getLayoutAlignment">
	//*  34   74:getstatic       #383 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//*  35   77:invokespecial   #139 <Method Object invokeAndReturnWithDefault(Object, String, Object)>
	//*  36   80:checkcast       #379 <Class android.text.Layout$Alignment>
	//*  37   83:astore          4
	//*  38   85:getstatic       #211 <Field int android.os.Build$VERSION.SDK_INT>
	//*  39   88:bipush          23
	//*  40   90:icmplt          164
	//*  41   93:aload_0         
	//*  42   94:aload           5
	//*  43   96:aload           4
	//*  44   98:aload_2         
	//*  45   99:getfield        #386 <Field float RectF.right>
	//*  46  102:invokestatic    #349 <Method int Math.round(float)>
	//*  47  105:iload_3         
	//*  48  106:invokespecial   #388 <Method StaticLayout createStaticLayoutForMeasuring(CharSequence, android.text.Layout$Alignment, int, int)>
	//*  49  109:astore          4
	//*  50  111:iload_3         
	//*  51  112:iconst_m1       
	//*  52  113:icmpeq          184
	//*  53  116:aload           4
	//*  54  118:invokevirtual   #391 <Method int StaticLayout.getLineCount()>
	//*  55  121:iload_3         
	//*  56  122:icmpgt          147
	//*  57  125:aload           4
	//*  58  127:aload           4
	//*  59  129:invokevirtual   #391 <Method int StaticLayout.getLineCount()>
	//*  60  132:iconst_1        
	//*  61  133:isub            
	//*  62  134:invokevirtual   #395 <Method int StaticLayout.getLineEnd(int)>
	//*  63  137:aload           5
	//*  64  139:invokeinterface #146 <Method int CharSequence.length()>
	//*  65  144:icmpeq          184
	//*  66  147:iconst_0        
	//*  67  148:ireturn         
			j = -1;
	//   68  149:iconst_m1       
	//   69  150:istore_3        
		if(mTempTextPaint == null)
			mTempTextPaint = new TextPaint();
		else
	//*  70  151:goto            25
			mTempTextPaint.reset();
	//   71  154:aload_0         
	//   72  155:getfield        #148 <Field TextPaint mTempTextPaint>
	//   73  158:invokevirtual   #398 <Method void TextPaint.reset()>
		mTempTextPaint.set(mTextView.getPaint());
		mTempTextPaint.setTextSize(i);
		obj = ((Object) ((android.text.Layout.Alignment)invokeAndReturnWithDefault(((Object) (mTextView)), "getLayoutAlignment", ((Object) (android.text.Layout.Alignment.ALIGN_NORMAL)))));
		if(android.os.Build.VERSION.SDK_INT >= 23)
			obj = ((Object) (createStaticLayoutForMeasuring(charsequence, ((android.text.Layout.Alignment) (obj)), Math.round(rectf.right), j)));
		else
	//*  74  161:goto            43
			obj = ((Object) (createStaticLayoutForMeasuringPre23(charsequence, ((android.text.Layout.Alignment) (obj)), Math.round(rectf.right))));
	//   75  164:aload_0         
	//   76  165:aload           5
	//   77  167:aload           4
	//   78  169:aload_2         
	//   79  170:getfield        #386 <Field float RectF.right>
	//   80  173:invokestatic    #349 <Method int Math.round(float)>
	//   81  176:invokespecial   #400 <Method StaticLayout createStaticLayoutForMeasuringPre23(CharSequence, android.text.Layout$Alignment, int)>
	//   82  179:astore          4
		if(j != -1 && (((StaticLayout) (obj)).getLineCount() > j || ((StaticLayout) (obj)).getLineEnd(((StaticLayout) (obj)).getLineCount() - 1) != charsequence.length()))
			return false;
	//*  83  181:goto            111
		return (float)((StaticLayout) (obj)).getHeight() <= rectf.bottom;
	//   84  184:aload           4
	//   85  186:invokevirtual   #403 <Method int StaticLayout.getHeight()>
	//   86  189:i2f             
	//   87  190:aload_2         
	//   88  191:getfield        #406 <Field float RectF.bottom>
	//   89  194:fcmpl           
	//   90  195:ifle            200
	//   91  198:iconst_0        
	//   92  199:ireturn         
	//   93  200:iconst_1        
	//   94  201:ireturn         
	}

	private boolean supportsAutoSizeText()
	{
		return !(mTextView instanceof AppCompatEditText);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field TextView mTextView>
	//    2    4:instanceof      #408 <Class AppCompatEditText>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	private void validateAndSetAutoSizeTextTypeUniformConfiguration(float f, float f1, float f2)
		throws IllegalArgumentException
	{
		if(f <= 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifgt            40
			throw new IllegalArgumentException((new StringBuilder()).append("Minimum auto-size text size (").append(f).append("px) is less or equal to (0px)").toString());
	//    4    6:new             #412 <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:new             #275 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #276 <Method void StringBuilder()>
	//    9   17:ldc2            #414 <String "Minimum auto-size text size (">
	//   10   20:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:fload_1         
	//   12   24:invokevirtual   #417 <Method StringBuilder StringBuilder.append(float)>
	//   13   27:ldc2            #419 <String "px) is less or equal to (0px)">
	//   14   30:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:invokevirtual   #288 <Method String StringBuilder.toString()>
	//   16   36:invokespecial   #420 <Method void IllegalArgumentException(String)>
	//   17   39:athrow          
		if(f1 <= f)
	//*  18   40:fload_2         
	//*  19   41:fload_1         
	//*  20   42:fcmpg           
	//*  21   43:ifgt            96
			throw new IllegalArgumentException((new StringBuilder()).append("Maximum auto-size text size (").append(f1).append("px) is less or equal to minimum auto-size ").append("text size (").append(f).append("px)").toString());
	//   22   46:new             #412 <Class IllegalArgumentException>
	//   23   49:dup             
	//   24   50:new             #275 <Class StringBuilder>
	//   25   53:dup             
	//   26   54:invokespecial   #276 <Method void StringBuilder()>
	//   27   57:ldc2            #422 <String "Maximum auto-size text size (">
	//   28   60:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:fload_2         
	//   30   64:invokevirtual   #417 <Method StringBuilder StringBuilder.append(float)>
	//   31   67:ldc2            #424 <String "px) is less or equal to minimum auto-size ">
	//   32   70:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:ldc2            #426 <String "text size (">
	//   34   76:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   35   79:fload_1         
	//   36   80:invokevirtual   #417 <Method StringBuilder StringBuilder.append(float)>
	//   37   83:ldc2            #428 <String "px)">
	//   38   86:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   39   89:invokevirtual   #288 <Method String StringBuilder.toString()>
	//   40   92:invokespecial   #420 <Method void IllegalArgumentException(String)>
	//   41   95:athrow          
		if(f2 <= 0.0F)
	//*  42   96:fload_3         
	//*  43   97:fconst_0        
	//*  44   98:fcmpg           
	//*  45   99:ifgt            136
		{
			throw new IllegalArgumentException((new StringBuilder()).append("The auto-size step granularity (").append(f2).append("px) is less or equal to (0px)").toString());
	//   46  102:new             #412 <Class IllegalArgumentException>
	//   47  105:dup             
	//   48  106:new             #275 <Class StringBuilder>
	//   49  109:dup             
	//   50  110:invokespecial   #276 <Method void StringBuilder()>
	//   51  113:ldc2            #430 <String "The auto-size step granularity (">
	//   52  116:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   53  119:fload_3         
	//   54  120:invokevirtual   #417 <Method StringBuilder StringBuilder.append(float)>
	//   55  123:ldc2            #419 <String "px) is less or equal to (0px)">
	//   56  126:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   57  129:invokevirtual   #288 <Method String StringBuilder.toString()>
	//   58  132:invokespecial   #420 <Method void IllegalArgumentException(String)>
	//   59  135:athrow          
		} else
		{
			mAutoSizeTextType = 1;
	//   60  136:aload_0         
	//   61  137:iconst_1        
	//   62  138:putfield        #59  <Field int mAutoSizeTextType>
			mAutoSizeMinTextSizeInPx = f;
	//   63  141:aload_0         
	//   64  142:fload_1         
	//   65  143:putfield        #65  <Field float mAutoSizeMinTextSizeInPx>
			mAutoSizeMaxTextSizeInPx = f1;
	//   66  146:aload_0         
	//   67  147:fload_2         
	//   68  148:putfield        #67  <Field float mAutoSizeMaxTextSizeInPx>
			mAutoSizeStepGranularityInPx = f2;
	//   69  151:aload_0         
	//   70  152:fload_3         
	//   71  153:putfield        #63  <Field float mAutoSizeStepGranularityInPx>
			mHasPresetAutoSizeValues = false;
	//   72  156:aload_0         
	//   73  157:iconst_0        
	//   74  158:putfield        #71  <Field boolean mHasPresetAutoSizeValues>
			return;
	//   75  161:return          
		}
	}

	void autoSizeText()
	{
		if(isAutoSizeEnabled()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #438 <Method boolean isAutoSizeEnabled()>
	//    2    4:ifne            8
_L1:
		return;
	//    3    7:return          
_L2:
		if(!mNeedsAutoSizeText)
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field boolean mNeedsAutoSizeText>
	//    6   12:ifeq            154
		if(mTextView.getMeasuredHeight() <= 0 || mTextView.getMeasuredWidth() <= 0)
			continue; /* Loop/switch isn't completed */
	//    7   15:aload_0         
	//    8   16:getfield        #73  <Field TextView mTextView>
	//    9   19:invokevirtual   #441 <Method int TextView.getMeasuredHeight()>
	//   10   22:ifle            7
	//   11   25:aload_0         
	//   12   26:getfield        #73  <Field TextView mTextView>
	//   13   29:invokevirtual   #444 <Method int TextView.getMeasuredWidth()>
	//   14   32:ifle            7
		int i;
		int j;
		if(((Boolean)invokeAndReturnWithDefault(((Object) (mTextView)), "getHorizontallyScrolling", ((Object) (Boolean.valueOf(false))))).booleanValue())
	//*  15   35:aload_0         
	//*  16   36:aload_0         
	//*  17   37:getfield        #73  <Field TextView mTextView>
	//*  18   40:ldc2            #446 <String "getHorizontallyScrolling">
	//*  19   43:iconst_0        
	//*  20   44:invokestatic    #232 <Method Boolean Boolean.valueOf(boolean)>
	//*  21   47:invokespecial   #139 <Method Object invokeAndReturnWithDefault(Object, String, Object)>
	//*  22   50:checkcast       #229 <Class Boolean>
	//*  23   53:invokevirtual   #235 <Method boolean Boolean.booleanValue()>
	//*  24   56:ifeq            160
			i = 0x100000;
	//   25   59:ldc1            #22  <Int 0x100000>
	//   26   61:istore_2        
		else
	//*  27   62:aload_0         
	//*  28   63:getfield        #73  <Field TextView mTextView>
	//*  29   66:invokevirtual   #447 <Method int TextView.getHeight()>
	//*  30   69:aload_0         
	//*  31   70:getfield        #73  <Field TextView mTextView>
	//*  32   73:invokevirtual   #450 <Method int TextView.getCompoundPaddingBottom()>
	//*  33   76:isub            
	//*  34   77:aload_0         
	//*  35   78:getfield        #73  <Field TextView mTextView>
	//*  36   81:invokevirtual   #453 <Method int TextView.getCompoundPaddingTop()>
	//*  37   84:isub            
	//*  38   85:istore_3        
	//*  39   86:iload_2         
	//*  40   87:ifle            7
	//*  41   90:iload_3         
	//*  42   91:ifle            7
	//*  43   94:getstatic       #49  <Field RectF TEMP_RECTF>
	//*  44   97:astore          4
	//*  45   99:aload           4
	//*  46  101:monitorenter    
	//*  47  102:getstatic       #49  <Field RectF TEMP_RECTF>
	//*  48  105:invokevirtual   #456 <Method void RectF.setEmpty()>
	//*  49  108:getstatic       #49  <Field RectF TEMP_RECTF>
	//*  50  111:iload_2         
	//*  51  112:i2f             
	//*  52  113:putfield        #386 <Field float RectF.right>
	//*  53  116:getstatic       #49  <Field RectF TEMP_RECTF>
	//*  54  119:iload_3         
	//*  55  120:i2f             
	//*  56  121:putfield        #406 <Field float RectF.bottom>
	//*  57  124:aload_0         
	//*  58  125:getstatic       #49  <Field RectF TEMP_RECTF>
	//*  59  128:invokespecial   #458 <Method int findLargestTextSizeWhichFits(RectF)>
	//*  60  131:i2f             
	//*  61  132:fstore_1        
	//*  62  133:fload_1         
	//*  63  134:aload_0         
	//*  64  135:getfield        #73  <Field TextView mTextView>
	//*  65  138:invokevirtual   #459 <Method float TextView.getTextSize()>
	//*  66  141:fcmpl           
	//*  67  142:ifeq            151
	//*  68  145:aload_0         
	//*  69  146:iconst_0        
	//*  70  147:fload_1         
	//*  71  148:invokevirtual   #463 <Method void setTextSizeInternal(int, float)>
	//*  72  151:aload           4
	//*  73  153:monitorexit     
	//*  74  154:aload_0         
	//*  75  155:iconst_1        
	//*  76  156:putfield        #61  <Field boolean mNeedsAutoSizeText>
	//*  77  159:return          
			i = mTextView.getMeasuredWidth() - mTextView.getTotalPaddingLeft() - mTextView.getTotalPaddingRight();
	//   78  160:aload_0         
	//   79  161:getfield        #73  <Field TextView mTextView>
	//   80  164:invokevirtual   #444 <Method int TextView.getMeasuredWidth()>
	//   81  167:aload_0         
	//   82  168:getfield        #73  <Field TextView mTextView>
	//   83  171:invokevirtual   #466 <Method int TextView.getTotalPaddingLeft()>
	//   84  174:isub            
	//   85  175:aload_0         
	//   86  176:getfield        #73  <Field TextView mTextView>
	//   87  179:invokevirtual   #469 <Method int TextView.getTotalPaddingRight()>
	//   88  182:isub            
	//   89  183:istore_2        
		j = mTextView.getHeight() - mTextView.getCompoundPaddingBottom() - mTextView.getCompoundPaddingTop();
		if(i <= 0 || j <= 0)
			continue; /* Loop/switch isn't completed */
		synchronized(TEMP_RECTF)
		{
			TEMP_RECTF.setEmpty();
			TEMP_RECTF.right = i;
			TEMP_RECTF.bottom = j;
			float f = findLargestTextSizeWhichFits(TEMP_RECTF);
			if(f != mTextView.getTextSize())
				setTextSizeInternal(0, f);
		}
		break; /* Loop/switch isn't completed */
	//   90  184:goto            62
		if(true) goto _L1; else goto _L3
_L3:
		mNeedsAutoSizeText = true;
		return;
		exception;
	//   91  187:astore          5
		rectf;
	//   92  189:aload           4
		JVM INSTR monitorexit ;
	//   93  191:monitorexit     
		throw exception;
	//   94  192:aload           5
	//   95  194:athrow          
	}

	int getAutoSizeMaxTextSize()
	{
		return Math.round(mAutoSizeMaxTextSizeInPx);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field float mAutoSizeMaxTextSizeInPx>
	//    2    4:invokestatic    #349 <Method int Math.round(float)>
	//    3    7:ireturn         
	}

	int getAutoSizeMinTextSize()
	{
		return Math.round(mAutoSizeMinTextSizeInPx);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field float mAutoSizeMinTextSizeInPx>
	//    2    4:invokestatic    #349 <Method int Math.round(float)>
	//    3    7:ireturn         
	}

	int getAutoSizeStepGranularity()
	{
		return Math.round(mAutoSizeStepGranularityInPx);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field float mAutoSizeStepGranularityInPx>
	//    2    4:invokestatic    #349 <Method int Math.round(float)>
	//    3    7:ireturn         
	}

	int[] getAutoSizeTextAvailableSizes()
	{
		return mAutoSizeTextSizesInPx;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//    2    4:areturn         
	}

	int getAutoSizeTextType()
	{
		return mAutoSizeTextType;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int mAutoSizeTextType>
	//    2    4:ireturn         
	}

	boolean isAutoSizeEnabled()
	{
		return supportsAutoSizeText() && mAutoSizeTextType != 0;
	//    0    0:aload_0         
	//    1    1:invokespecial   #343 <Method boolean supportsAutoSizeText()>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field int mAutoSizeTextType>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	void loadFromAttributes(AttributeSet attributeset, int i)
	{
		float f1 = -1F;
	//    0    0:ldc1            #20  <Float -1F>
	//    1    2:fstore          4
		float f2 = -1F;
	//    2    4:ldc1            #20  <Float -1F>
	//    3    6:fstore          5
		float f = -1F;
	//    4    8:ldc1            #20  <Float -1F>
	//    5   10:fstore_3        
		attributeset = ((AttributeSet) (mContext.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextView, i, 0)));
	//    6   11:aload_0         
	//    7   12:getfield        #81  <Field Context mContext>
	//    8   15:aload_1         
	//    9   16:getstatic       #482 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTextView>
	//   10   19:iload_2         
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #488 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   13   24:astore_1        
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeTextType))
	//*  14   25:aload_1         
	//*  15   26:getstatic       #491 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeTextType>
	//*  16   29:invokevirtual   #495 <Method boolean TypedArray.hasValue(int)>
	//*  17   32:ifeq            47
			mAutoSizeTextType = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeTextType, 0);
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:getstatic       #491 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeTextType>
	//   21   40:iconst_0        
	//   22   41:invokevirtual   #498 <Method int TypedArray.getInt(int, int)>
	//   23   44:putfield        #59  <Field int mAutoSizeTextType>
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity))
	//*  24   47:aload_1         
	//*  25   48:getstatic       #501 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeStepGranularity>
	//*  26   51:invokevirtual   #495 <Method boolean TypedArray.hasValue(int)>
	//*  27   54:ifeq            67
			f = ((TypedArray) (attributeset)).getDimension(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity, -1F);
	//   28   57:aload_1         
	//   29   58:getstatic       #501 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeStepGranularity>
	//   30   61:ldc1            #20  <Float -1F>
	//   31   63:invokevirtual   #505 <Method float TypedArray.getDimension(int, float)>
	//   32   66:fstore_3        
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize))
	//*  33   67:aload_1         
	//*  34   68:getstatic       #508 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeMinTextSize>
	//*  35   71:invokevirtual   #495 <Method boolean TypedArray.hasValue(int)>
	//*  36   74:ifeq            88
			f1 = ((TypedArray) (attributeset)).getDimension(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize, -1F);
	//   37   77:aload_1         
	//   38   78:getstatic       #508 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeMinTextSize>
	//   39   81:ldc1            #20  <Float -1F>
	//   40   83:invokevirtual   #505 <Method float TypedArray.getDimension(int, float)>
	//   41   86:fstore          4
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize))
	//*  42   88:aload_1         
	//*  43   89:getstatic       #511 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeMaxTextSize>
	//*  44   92:invokevirtual   #495 <Method boolean TypedArray.hasValue(int)>
	//*  45   95:ifeq            109
			f2 = ((TypedArray) (attributeset)).getDimension(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize, -1F);
	//   46   98:aload_1         
	//   47   99:getstatic       #511 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeMaxTextSize>
	//   48  102:ldc1            #20  <Float -1F>
	//   49  104:invokevirtual   #505 <Method float TypedArray.getDimension(int, float)>
	//   50  107:fstore          5
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes))
	//*  51  109:aload_1         
	//*  52  110:getstatic       #514 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizePresetSizes>
	//*  53  113:invokevirtual   #495 <Method boolean TypedArray.hasValue(int)>
	//*  54  116:ifeq            153
		{
			i = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes, 0);
	//   55  119:aload_1         
	//   56  120:getstatic       #514 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizePresetSizes>
	//   57  123:iconst_0        
	//   58  124:invokevirtual   #517 <Method int TypedArray.getResourceId(int, int)>
	//   59  127:istore_2        
			if(i > 0)
	//*  60  128:iload_2         
	//*  61  129:ifle            153
			{
				TypedArray typedarray = ((TypedArray) (attributeset)).getResources().obtainTypedArray(i);
	//   62  132:aload_1         
	//   63  133:invokevirtual   #521 <Method Resources TypedArray.getResources()>
	//   64  136:iload_2         
	//   65  137:invokevirtual   #527 <Method TypedArray Resources.obtainTypedArray(int)>
	//   66  140:astore          7
				setupAutoSizeUniformPresetSizes(typedarray);
	//   67  142:aload_0         
	//   68  143:aload           7
	//   69  145:invokespecial   #529 <Method void setupAutoSizeUniformPresetSizes(TypedArray)>
				typedarray.recycle();
	//   70  148:aload           7
	//   71  150:invokevirtual   #532 <Method void TypedArray.recycle()>
			}
		}
		((TypedArray) (attributeset)).recycle();
	//   72  153:aload_1         
	//   73  154:invokevirtual   #532 <Method void TypedArray.recycle()>
		if(supportsAutoSizeText())
	//*  74  157:aload_0         
	//*  75  158:invokespecial   #343 <Method boolean supportsAutoSizeText()>
	//*  76  161:ifeq            263
		{
			if(mAutoSizeTextType == 1)
	//*  77  164:aload_0         
	//*  78  165:getfield        #59  <Field int mAutoSizeTextType>
	//*  79  168:iconst_1        
	//*  80  169:icmpne          262
			{
				if(!mHasPresetAutoSizeValues)
	//*  81  172:aload_0         
	//*  82  173:getfield        #71  <Field boolean mHasPresetAutoSizeValues>
	//*  83  176:ifne            257
				{
					attributeset = ((AttributeSet) (mContext.getResources().getDisplayMetrics()));
	//   84  179:aload_0         
	//   85  180:getfield        #81  <Field Context mContext>
	//   86  183:invokevirtual   #533 <Method Resources Context.getResources()>
	//   87  186:invokevirtual   #537 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   88  189:astore_1        
					float f3 = f1;
	//   89  190:fload           4
	//   90  192:fstore          6
					if(f1 == -1F)
	//*  91  194:fload           4
	//*  92  196:ldc1            #20  <Float -1F>
	//*  93  198:fcmpl           
	//*  94  199:ifne            212
						f3 = TypedValue.applyDimension(2, 12F, ((android.util.DisplayMetrics) (attributeset)));
	//   95  202:iconst_2        
	//   96  203:ldc2            #538 <Float 12F>
	//   97  206:aload_1         
	//   98  207:invokestatic    #544 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   99  210:fstore          6
					f1 = f2;
	//  100  212:fload           5
	//  101  214:fstore          4
					if(f2 == -1F)
	//* 102  216:fload           5
	//* 103  218:ldc1            #20  <Float -1F>
	//* 104  220:fcmpl           
	//* 105  221:ifne            234
						f1 = TypedValue.applyDimension(2, 112F, ((android.util.DisplayMetrics) (attributeset)));
	//  106  224:iconst_2        
	//  107  225:ldc2            #545 <Float 112F>
	//  108  228:aload_1         
	//  109  229:invokestatic    #544 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//  110  232:fstore          4
					f2 = f;
	//  111  234:fload_3         
	//  112  235:fstore          5
					if(f == -1F)
	//* 113  237:fload_3         
	//* 114  238:ldc1            #20  <Float -1F>
	//* 115  240:fcmpl           
	//* 116  241:ifne            247
						f2 = 1.0F;
	//  117  244:fconst_1        
	//  118  245:fstore          5
					validateAndSetAutoSizeTextTypeUniformConfiguration(f3, f1, f2);
	//  119  247:aload_0         
	//  120  248:fload           6
	//  121  250:fload           4
	//  122  252:fload           5
	//  123  254:invokespecial   #547 <Method void validateAndSetAutoSizeTextTypeUniformConfiguration(float, float, float)>
				}
				setupAutoSizeText();
	//  124  257:aload_0         
	//  125  258:invokespecial   #549 <Method boolean setupAutoSizeText()>
	//  126  261:pop             
			}
			return;
	//  127  262:return          
		} else
		{
			mAutoSizeTextType = 0;
	//  128  263:aload_0         
	//  129  264:iconst_0        
	//  130  265:putfield        #59  <Field int mAutoSizeTextType>
			return;
	//  131  268:return          
		}
	}

	void setAutoSizeTextTypeUniformWithConfiguration(int i, int j, int k, int l)
		throws IllegalArgumentException
	{
		if(supportsAutoSizeText())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #343 <Method boolean supportsAutoSizeText()>
	//*   2    4:ifeq            61
		{
			android.util.DisplayMetrics displaymetrics = mContext.getResources().getDisplayMetrics();
	//    3    7:aload_0         
	//    4    8:getfield        #81  <Field Context mContext>
	//    5   11:invokevirtual   #533 <Method Resources Context.getResources()>
	//    6   14:invokevirtual   #537 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//    7   17:astore          5
			validateAndSetAutoSizeTextTypeUniformConfiguration(TypedValue.applyDimension(l, i, displaymetrics), TypedValue.applyDimension(l, j, displaymetrics), TypedValue.applyDimension(l, k, displaymetrics));
	//    8   19:aload_0         
	//    9   20:iload           4
	//   10   22:iload_1         
	//   11   23:i2f             
	//   12   24:aload           5
	//   13   26:invokestatic    #544 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   14   29:iload           4
	//   15   31:iload_2         
	//   16   32:i2f             
	//   17   33:aload           5
	//   18   35:invokestatic    #544 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   19   38:iload           4
	//   20   40:iload_3         
	//   21   41:i2f             
	//   22   42:aload           5
	//   23   44:invokestatic    #544 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   24   47:invokespecial   #547 <Method void validateAndSetAutoSizeTextTypeUniformConfiguration(float, float, float)>
			if(setupAutoSizeText())
	//*  25   50:aload_0         
	//*  26   51:invokespecial   #549 <Method boolean setupAutoSizeText()>
	//*  27   54:ifeq            61
				autoSizeText();
	//   28   57:aload_0         
	//   29   58:invokevirtual   #553 <Method void autoSizeText()>
		}
	//   30   61:return          
	}

	void setAutoSizeTextTypeUniformWithPresetSizes(int ai[], int i)
		throws IllegalArgumentException
	{
		int k;
		if(!supportsAutoSizeText())
			break MISSING_BLOCK_LABEL_146;
	//    0    0:aload_0         
	//    1    1:invokespecial   #343 <Method boolean supportsAutoSizeText()>
	//    2    4:ifeq            146
		k = ai.length;
	//    3    7:aload_1         
	//    4    8:arraylength     
	//    5    9:istore          4
		if(k <= 0) goto _L2; else goto _L1
	//    6   11:iload           4
	//    7   13:ifle            130
_L1:
		int ai2[] = new int[k];
	//    8   16:iload           4
	//    9   18:newarray        int[]
	//   10   20:astore          6
		if(i != 0) goto _L4; else goto _L3
	//   11   22:iload_2         
	//   12   23:ifne            82
_L3:
		int ai1[] = Arrays.copyOf(ai, k);
	//   13   26:aload_1         
	//   14   27:iload           4
	//   15   29:invokestatic    #559 <Method int[] Arrays.copyOf(int[], int)>
	//   16   32:astore          5
_L6:
		mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(ai1);
	//   17   34:aload_0         
	//   18   35:aload_0         
	//   19   36:aload           5
	//   20   38:invokespecial   #351 <Method int[] cleanupAutoSizePresetSizes(int[])>
	//   21   41:putfield        #69  <Field int[] mAutoSizeTextSizesInPx>
		if(!setupAutoSizeUniformPresetSizesConfiguration())
	//*  22   44:aload_0         
	//*  23   45:invokespecial   #363 <Method boolean setupAutoSizeUniformPresetSizesConfiguration()>
	//*  24   48:ifne            135
			throw new IllegalArgumentException((new StringBuilder()).append("None of the preset sizes is valid: ").append(Arrays.toString(ai)).toString());
	//   25   51:new             #412 <Class IllegalArgumentException>
	//   26   54:dup             
	//   27   55:new             #275 <Class StringBuilder>
	//   28   58:dup             
	//   29   59:invokespecial   #276 <Method void StringBuilder()>
	//   30   62:ldc2            #561 <String "None of the preset sizes is valid: ">
	//   31   65:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   32   68:aload_1         
	//   33   69:invokestatic    #564 <Method String Arrays.toString(int[])>
	//   34   72:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   35   75:invokevirtual   #288 <Method String StringBuilder.toString()>
	//   36   78:invokespecial   #420 <Method void IllegalArgumentException(String)>
	//   37   81:athrow          
		break; /* Loop/switch isn't completed */
_L4:
		android.util.DisplayMetrics displaymetrics = mContext.getResources().getDisplayMetrics();
	//   38   82:aload_0         
	//   39   83:getfield        #81  <Field Context mContext>
	//   40   86:invokevirtual   #533 <Method Resources Context.getResources()>
	//   41   89:invokevirtual   #537 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   42   92:astore          7
		int j = 0;
	//   43   94:iconst_0        
	//   44   95:istore_3        
		do
		{
			ai1 = ai2;
	//   45   96:aload           6
	//   46   98:astore          5
			if(j >= k)
				break;
	//   47  100:iload_3         
	//   48  101:iload           4
	//   49  103:icmpge          34
			ai2[j] = Math.round(TypedValue.applyDimension(i, ai[j], displaymetrics));
	//   50  106:aload           6
	//   51  108:iload_3         
	//   52  109:iload_2         
	//   53  110:aload_1         
	//   54  111:iload_3         
	//   55  112:iaload          
	//   56  113:i2f             
	//   57  114:aload           7
	//   58  116:invokestatic    #544 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   59  119:invokestatic    #349 <Method int Math.round(float)>
	//   60  122:iastore         
			j++;
	//   61  123:iload_3         
	//   62  124:iconst_1        
	//   63  125:iadd            
	//   64  126:istore_3        
		} while(true);
	//   65  127:goto            96
		if(true) goto _L6; else goto _L5
_L2:
		mHasPresetAutoSizeValues = false;
	//   66  130:aload_0         
	//   67  131:iconst_0        
	//   68  132:putfield        #71  <Field boolean mHasPresetAutoSizeValues>
_L5:
		if(setupAutoSizeText())
	//*  69  135:aload_0         
	//*  70  136:invokespecial   #549 <Method boolean setupAutoSizeText()>
	//*  71  139:ifeq            146
			autoSizeText();
	//   72  142:aload_0         
	//   73  143:invokevirtual   #553 <Method void autoSizeText()>
	//   74  146:return          
	}

	void setAutoSizeTextTypeWithDefaults(int i)
	{
		if(!supportsAutoSizeText()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokespecial   #343 <Method boolean supportsAutoSizeText()>
	//    2    4:ifeq            64
_L1:
		i;
	//    3    7:iload_1         
		JVM INSTR tableswitch 0 1: default 32
	//	               0 60
	//	               1 65;
	//    4    8:tableswitch     0 1: default 32
	//	               0 60
	//	               1 65
		   goto _L3 _L4 _L5
_L3:
		throw new IllegalArgumentException((new StringBuilder()).append("Unknown auto-size text type: ").append(i).toString());
	//    5   32:new             #412 <Class IllegalArgumentException>
	//    6   35:dup             
	//    7   36:new             #275 <Class StringBuilder>
	//    8   39:dup             
	//    9   40:invokespecial   #276 <Method void StringBuilder()>
	//   10   43:ldc2            #568 <String "Unknown auto-size text type: ">
	//   11   46:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   12   49:iload_1         
	//   13   50:invokevirtual   #571 <Method StringBuilder StringBuilder.append(int)>
	//   14   53:invokevirtual   #288 <Method String StringBuilder.toString()>
	//   15   56:invokespecial   #420 <Method void IllegalArgumentException(String)>
	//   16   59:athrow          
_L4:
		clearAutoSizeConfiguration();
	//   17   60:aload_0         
	//   18   61:invokespecial   #573 <Method void clearAutoSizeConfiguration()>
_L2:
		return;
	//   19   64:return          
_L5:
		android.util.DisplayMetrics displaymetrics = mContext.getResources().getDisplayMetrics();
	//   20   65:aload_0         
	//   21   66:getfield        #81  <Field Context mContext>
	//   22   69:invokevirtual   #533 <Method Resources Context.getResources()>
	//   23   72:invokevirtual   #537 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   24   75:astore_2        
		validateAndSetAutoSizeTextTypeUniformConfiguration(TypedValue.applyDimension(2, 12F, displaymetrics), TypedValue.applyDimension(2, 112F, displaymetrics), 1.0F);
	//   25   76:aload_0         
	//   26   77:iconst_2        
	//   27   78:ldc2            #538 <Float 12F>
	//   28   81:aload_2         
	//   29   82:invokestatic    #544 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   30   85:iconst_2        
	//   31   86:ldc2            #545 <Float 112F>
	//   32   89:aload_2         
	//   33   90:invokestatic    #544 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   34   93:fconst_1        
	//   35   94:invokespecial   #547 <Method void validateAndSetAutoSizeTextTypeUniformConfiguration(float, float, float)>
		if(setupAutoSizeText())
	//*  36   97:aload_0         
	//*  37   98:invokespecial   #549 <Method boolean setupAutoSizeText()>
	//*  38  101:ifeq            64
		{
			autoSizeText();
	//   39  104:aload_0         
	//   40  105:invokevirtual   #553 <Method void autoSizeText()>
			return;
	//   41  108:return          
		}
		if(true) goto _L2; else goto _L6
_L6:
	}

	void setTextSizeInternal(int i, float f)
	{
		Resources resources;
		if(mContext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field Context mContext>
	//*   2    4:ifnonnull       25
			resources = Resources.getSystem();
	//    3    7:invokestatic    #576 <Method Resources Resources.getSystem()>
	//    4   10:astore_3        
		else
	//*   5   11:aload_0         
	//*   6   12:iload_1         
	//*   7   13:fload_2         
	//*   8   14:aload_3         
	//*   9   15:invokevirtual   #537 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//*  10   18:invokestatic    #544 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//*  11   21:invokespecial   #578 <Method void setRawTextSize(float)>
	//*  12   24:return          
			resources = mContext.getResources();
	//   13   25:aload_0         
	//   14   26:getfield        #81  <Field Context mContext>
	//   15   29:invokevirtual   #533 <Method Resources Context.getResources()>
	//   16   32:astore_3        
		setRawTextSize(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
	//*  17   33:goto            11
	}

	private static final int DEFAULT_AUTO_SIZE_GRANULARITY_IN_PX = 1;
	private static final int DEFAULT_AUTO_SIZE_MAX_TEXT_SIZE_IN_SP = 112;
	private static final int DEFAULT_AUTO_SIZE_MIN_TEXT_SIZE_IN_SP = 12;
	private static final String TAG = "ACTVAutoSizeHelper";
	private static final RectF TEMP_RECTF = new RectF();
	static final float UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE = -1F;
	private static final int VERY_WIDE = 0x100000;
	private static Hashtable sTextViewMethodByNameCache = new Hashtable();
	private float mAutoSizeMaxTextSizeInPx;
	private float mAutoSizeMinTextSizeInPx;
	private float mAutoSizeStepGranularityInPx;
	private int mAutoSizeTextSizesInPx[];
	private int mAutoSizeTextType;
	private final Context mContext;
	private boolean mHasPresetAutoSizeValues;
	private boolean mNeedsAutoSizeText;
	private TextPaint mTempTextPaint;
	private final TextView mTextView;

	static 
	{
	//    0    0:new             #44  <Class RectF>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void RectF()>
	//    3    7:putstatic       #49  <Field RectF TEMP_RECTF>
	//    4   10:new             #51  <Class Hashtable>
	//    5   13:dup             
	//    6   14:invokespecial   #52  <Method void Hashtable()>
	//    7   17:putstatic       #54  <Field Hashtable sTextViewMethodByNameCache>
	//*   8   20:return          
	}
}
