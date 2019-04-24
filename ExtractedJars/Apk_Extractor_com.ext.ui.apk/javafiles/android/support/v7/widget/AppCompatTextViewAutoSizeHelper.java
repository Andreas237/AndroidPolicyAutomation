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
		if(k != 0) goto _L2; else goto _L1
	//    3    3:iload_3         
	//    4    4:ifne            9
_L1:
		return ai;
	//    5    7:aload_1         
	//    6    8:areturn         
_L2:
		Arrays.sort(ai);
	//    7    9:aload_1         
	//    8   10:invokestatic    #89  <Method void Arrays.sort(int[])>
		ArrayList arraylist = new ArrayList();
	//    9   13:new             #91  <Class ArrayList>
	//   10   16:dup             
	//   11   17:invokespecial   #92  <Method void ArrayList()>
	//   12   20:astore          6
		for(int i = 0; i < k; i++)
	//*  13   22:iconst_0        
	//*  14   23:istore_2        
	//*  15   24:iload_2         
	//*  16   25:iload_3         
	//*  17   26:icmpge          72
		{
			int l = ai[i];
	//   18   29:aload_1         
	//   19   30:iload_2         
	//   20   31:iaload          
	//   21   32:istore          4
			if(l > 0 && Collections.binarySearch(((List) (arraylist)), ((Object) (Integer.valueOf(l)))) < 0)
	//*  22   34:iload           4
	//*  23   36:ifle            65
	//*  24   39:aload           6
	//*  25   41:iload           4
	//*  26   43:invokestatic    #98  <Method Integer Integer.valueOf(int)>
	//*  27   46:invokestatic    #104 <Method int Collections.binarySearch(List, Object)>
	//*  28   49:ifge            65
				((List) (arraylist)).add(((Object) (Integer.valueOf(l))));
	//   29   52:aload           6
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
		if(k == ((List) (arraylist)).size())
			continue;
	//   39   72:iload_3         
	//   40   73:aload           6
	//   41   75:invokeinterface #114 <Method int List.size()>
	//   42   80:icmpeq          7
		k = ((List) (arraylist)).size();
	//   43   83:aload           6
	//   44   85:invokeinterface #114 <Method int List.size()>
	//   45   90:istore_3        
		int ai1[] = new int[k];
	//   46   91:iload_3         
	//   47   92:newarray        int[]
	//   48   94:astore          5
		int j = 0;
	//   49   96:iconst_0        
	//   50   97:istore_2        
		do
		{
			ai = ai1;
	//   51   98:aload           5
	//   52  100:astore_1        
			if(j >= k)
				continue;
	//   53  101:iload_2         
	//   54  102:iload_3         
	//   55  103:icmpge          7
			ai1[j] = ((Integer)((List) (arraylist)).get(j)).intValue();
	//   56  106:aload           5
	//   57  108:iload_2         
	//   58  109:aload           6
	//   59  111:iload_2         
	//   60  112:invokeinterface #118 <Method Object List.get(int)>
	//   61  117:checkcast       #94  <Class Integer>
	//   62  120:invokevirtual   #121 <Method int Integer.intValue()>
	//   63  123:iastore         
			j++;
	//   64  124:iload_2         
	//   65  125:iconst_1        
	//   66  126:iadd            
	//   67  127:istore_2        
		} while(true);
	//   68  128:goto            98
		if(true) goto _L1; else goto _L3
_L3:
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
		int i = 1;
	//   13   24:iconst_1        
	//   14   25:istore_2        
		for(k--; i <= k;)
	//*  15   26:iload           4
	//*  16   28:iconst_1        
	//*  17   29:isub            
	//*  18   30:istore          4
	//*  19   32:iload_2         
	//*  20   33:iload           4
	//*  21   35:icmpgt          83
		{
			int l = (i + k) / 2;
	//   22   38:iload_2         
	//   23   39:iload           4
	//   24   41:iadd            
	//   25   42:iconst_2        
	//   26   43:idiv            
	//   27   44:istore          5
			if(suggestedSizeFitsInSpace(mAutoSizeTextSizesInPx[l], rectf))
	//*  28   46:aload_0         
	//*  29   47:aload_0         
	//*  30   48:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//*  31   51:iload           5
	//*  32   53:iaload          
	//*  33   54:aload_1         
	//*  34   55:invokespecial   #248 <Method boolean suggestedSizeFitsInSpace(int, RectF)>
	//*  35   58:ifeq            71
			{
				j = i;
	//   36   61:iload_2         
	//   37   62:istore_3        
				i = l + 1;
	//   38   63:iload           5
	//   39   65:iconst_1        
	//   40   66:iadd            
	//   41   67:istore_2        
			} else
	//*  42   68:goto            32
			{
				k = l - 1;
	//   43   71:iload           5
	//   44   73:iconst_1        
	//   45   74:isub            
	//   46   75:istore          4
				j = k;
	//   47   77:iload           4
	//   48   79:istore_3        
			}
		}

	//*  49   80:goto            32
		return mAutoSizeTextSizesInPx[j];
	//   50   83:aload_0         
	//   51   84:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//   52   87:iload_3         
	//   53   88:iaload          
	//   54   89:ireturn         
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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		obj = getTextViewMethod(s).invoke(obj, new Object[0]);
	//    2    3:aload_0         
	//    3    4:aload_2         
	//    4    5:invokespecial   #297 <Method Method getTextViewMethod(String)>
	//    5    8:aload_1         
	//    6    9:iconst_0        
	//    7   10:anewarray       Object[]
	//    8   13:invokevirtual   #301 <Method Object Method.invoke(Object, Object[])>
	//    9   16:astore_1        
		obj1 = obj;
	//   10   17:aload_1         
	//   11   18:astore_3        
		if(obj != null);
	//   12   19:aload_1         
	//   13   20:ifnonnull       23
_L2:
		return obj1;
	//   14   23:aload_3         
	//   15   24:areturn         
		obj;
	//   16   25:astore_1        
		flag = true;
	//   17   26:iconst_1        
	//   18   27:istore          4
		Log.w("ACTVAutoSizeHelper", (new StringBuilder()).append("Failed to invoke TextView#").append(s).append("() method").toString(), ((Throwable) (obj)));
	//   19   29:ldc1            #15  <String "ACTVAutoSizeHelper">
	//   20   31:new             #275 <Class StringBuilder>
	//   21   34:dup             
	//   22   35:invokespecial   #276 <Method void StringBuilder()>
	//   23   38:ldc2            #303 <String "Failed to invoke TextView#">
	//   24   41:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   25   44:aload_2         
	//   26   45:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   27   48:ldc2            #284 <String "() method">
	//   28   51:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   29   54:invokevirtual   #288 <Method String StringBuilder.toString()>
	//   30   57:aload_1         
	//   31   58:invokestatic    #294 <Method int Log.w(String, String, Throwable)>
	//   32   61:pop             
		if(true) goto _L2; else goto _L1
	//   33   62:iconst_0        
	//   34   63:ifeq            23
_L1:
		return ((Object) (null));
	//   35   66:aconst_null     
	//   36   67:areturn         
		obj;
	//   37   68:astore_1        
		if(true)
	//*  38   69:iconst_0        
	//*  39   70:ifne            78
			if(!flag);
	//   40   73:iload           4
	//   41   75:ifeq            78
		throw obj;
	//   42   78:aload_1         
	//   43   79:athrow          
	}

	private void setRawTextSize(float f)
	{
		if(f == mTextView.getPaint().getTextSize())
			break MISSING_BLOCK_LABEL_100;
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #73  <Field TextView mTextView>
	//    3    5:invokevirtual   #311 <Method TextPaint TextView.getPaint()>
	//    4    8:invokevirtual   #316 <Method float TextPaint.getTextSize()>
	//    5   11:fcmpl           
	//    6   12:ifeq            100
		mTextView.getPaint().setTextSize(f);
	//    7   15:aload_0         
	//    8   16:getfield        #73  <Field TextView mTextView>
	//    9   19:invokevirtual   #311 <Method TextPaint TextView.getPaint()>
	//   10   22:fload_1         
	//   11   23:invokevirtual   #319 <Method void TextPaint.setTextSize(float)>
		boolean flag;
		Method method;
		Exception exception;
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  12   26:getstatic       #211 <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   29:bipush          18
	//*  14   31:icmplt          125
			flag = mTextView.isInLayout();
	//   15   34:aload_0         
	//   16   35:getfield        #73  <Field TextView mTextView>
	//   17   38:invokevirtual   #322 <Method boolean TextView.isInLayout()>
	//   18   41:istore_2        
		else
	//*  19   42:aload_0         
	//*  20   43:getfield        #73  <Field TextView mTextView>
	//*  21   46:invokevirtual   #326 <Method android.text.Layout TextView.getLayout()>
	//*  22   49:ifnull          100
	//*  23   52:aload_0         
	//*  24   53:iconst_0        
	//*  25   54:putfield        #61  <Field boolean mNeedsAutoSizeText>
	//*  26   57:aload_0         
	//*  27   58:ldc2            #328 <String "nullLayouts">
	//*  28   61:invokespecial   #297 <Method Method getTextViewMethod(String)>
	//*  29   64:astore_3        
	//*  30   65:aload_3         
	//*  31   66:ifnull          82
	//*  32   69:aload_3         
	//*  33   70:aload_0         
	//*  34   71:getfield        #73  <Field TextView mTextView>
	//*  35   74:iconst_0        
	//*  36   75:anewarray       Object[]
	//*  37   78:invokevirtual   #301 <Method Object Method.invoke(Object, Object[])>
	//*  38   81:pop             
	//*  39   82:iload_2         
	//*  40   83:ifne            115
	//*  41   86:aload_0         
	//*  42   87:getfield        #73  <Field TextView mTextView>
	//*  43   90:invokevirtual   #331 <Method void TextView.requestLayout()>
	//*  44   93:aload_0         
	//*  45   94:getfield        #73  <Field TextView mTextView>
	//*  46   97:invokevirtual   #334 <Method void TextView.invalidate()>
	//*  47  100:return          
	//*  48  101:astore_3        
	//*  49  102:ldc1            #15  <String "ACTVAutoSizeHelper">
	//*  50  104:ldc2            #336 <String "Failed to invoke TextView#nullLayouts() method">
	//*  51  107:aload_3         
	//*  52  108:invokestatic    #294 <Method int Log.w(String, String, Throwable)>
	//*  53  111:pop             
	//*  54  112:goto            82
	//*  55  115:aload_0         
	//*  56  116:getfield        #73  <Field TextView mTextView>
	//*  57  119:invokevirtual   #339 <Method void TextView.forceLayout()>
	//*  58  122:goto            93
			flag = false;
	//   59  125:iconst_0        
	//   60  126:istore_2        
		if(mTextView.getLayout() == null)
			break MISSING_BLOCK_LABEL_100;
		mNeedsAutoSizeText = false;
		method = getTextViewMethod("nullLayouts");
		if(method != null)
			try
			{
				method.invoke(((Object) (mTextView)), new Object[0]);
			}
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", ((Throwable) (exception)));
			}
		if(!flag)
			mTextView.requestLayout();
		else
			mTextView.forceLayout();
		mTextView.invalidate();
	//*  61  127:goto            42
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
				float f = Math.round(mAutoSizeMinTextSizeInPx);
	//   14   30:aload_0         
	//   15   31:getfield        #65  <Field float mAutoSizeMinTextSizeInPx>
	//   16   34:invokestatic    #349 <Method int Math.round(float)>
	//   17   37:i2f             
	//   18   38:fstore_1        
				int i = 1;
	//   19   39:iconst_1        
	//   20   40:istore_2        
				for(; Math.round(mAutoSizeStepGranularityInPx + f) <= Math.round(mAutoSizeMaxTextSizeInPx); f += mAutoSizeStepGranularityInPx)
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
				f = mAutoSizeMinTextSizeInPx;
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
					ai[j] = Math.round(f);
	//   51   91:aload           4
	//   52   93:iload_3         
	//   53   94:fload_1         
	//   54   95:invokestatic    #349 <Method int Math.round(float)>
	//   55   98:iastore         
					f += mAutoSizeStepGranularityInPx;
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
		attributeset = ((AttributeSet) (mContext.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextView, i, 0)));
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Context mContext>
	//    2    4:aload_1         
	//    3    5:getstatic       #482 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTextView>
	//    4    8:iload_2         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #488 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    7   13:astore_1        
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeTextType))
	//*   8   14:aload_1         
	//*   9   15:getstatic       #491 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeTextType>
	//*  10   18:invokevirtual   #495 <Method boolean TypedArray.hasValue(int)>
	//*  11   21:ifeq            36
			mAutoSizeTextType = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeTextType, 0);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getstatic       #491 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeTextType>
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #498 <Method int TypedArray.getInt(int, int)>
	//   17   33:putfield        #59  <Field int mAutoSizeTextType>
		float f;
		float f1;
		float f2;
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity))
	//*  18   36:aload_1         
	//*  19   37:getstatic       #501 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeStepGranularity>
	//*  20   40:invokevirtual   #495 <Method boolean TypedArray.hasValue(int)>
	//*  21   43:ifeq            272
			f = ((TypedArray) (attributeset)).getDimension(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity, -1F);
	//   22   46:aload_1         
	//   23   47:getstatic       #501 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeStepGranularity>
	//   24   50:ldc1            #20  <Float -1F>
	//   25   52:invokevirtual   #505 <Method float TypedArray.getDimension(int, float)>
	//   26   55:fstore_3        
		else
	//*  27   56:aload_1         
	//*  28   57:getstatic       #508 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeMinTextSize>
	//*  29   60:invokevirtual   #495 <Method boolean TypedArray.hasValue(int)>
	//*  30   63:ifeq            265
	//*  31   66:aload_1         
	//*  32   67:getstatic       #508 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeMinTextSize>
	//*  33   70:ldc1            #20  <Float -1F>
	//*  34   72:invokevirtual   #505 <Method float TypedArray.getDimension(int, float)>
	//*  35   75:fstore          4
	//*  36   77:aload_1         
	//*  37   78:getstatic       #511 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeMaxTextSize>
	//*  38   81:invokevirtual   #495 <Method boolean TypedArray.hasValue(int)>
	//*  39   84:ifeq            258
	//*  40   87:aload_1         
	//*  41   88:getstatic       #511 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeMaxTextSize>
	//*  42   91:ldc1            #20  <Float -1F>
	//*  43   93:invokevirtual   #505 <Method float TypedArray.getDimension(int, float)>
	//*  44   96:fstore          5
	//*  45   98:aload_1         
	//*  46   99:getstatic       #514 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizePresetSizes>
	//*  47  102:invokevirtual   #495 <Method boolean TypedArray.hasValue(int)>
	//*  48  105:ifeq            142
	//*  49  108:aload_1         
	//*  50  109:getstatic       #514 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizePresetSizes>
	//*  51  112:iconst_0        
	//*  52  113:invokevirtual   #517 <Method int TypedArray.getResourceId(int, int)>
	//*  53  116:istore_2        
	//*  54  117:iload_2         
	//*  55  118:ifle            142
	//*  56  121:aload_1         
	//*  57  122:invokevirtual   #521 <Method Resources TypedArray.getResources()>
	//*  58  125:iload_2         
	//*  59  126:invokevirtual   #527 <Method TypedArray Resources.obtainTypedArray(int)>
	//*  60  129:astore          7
	//*  61  131:aload_0         
	//*  62  132:aload           7
	//*  63  134:invokespecial   #529 <Method void setupAutoSizeUniformPresetSizes(TypedArray)>
	//*  64  137:aload           7
	//*  65  139:invokevirtual   #532 <Method void TypedArray.recycle()>
	//*  66  142:aload_1         
	//*  67  143:invokevirtual   #532 <Method void TypedArray.recycle()>
	//*  68  146:aload_0         
	//*  69  147:invokespecial   #343 <Method boolean supportsAutoSizeText()>
	//*  70  150:ifeq            252
	//*  71  153:aload_0         
	//*  72  154:getfield        #59  <Field int mAutoSizeTextType>
	//*  73  157:iconst_1        
	//*  74  158:icmpne          251
	//*  75  161:aload_0         
	//*  76  162:getfield        #71  <Field boolean mHasPresetAutoSizeValues>
	//*  77  165:ifne            246
	//*  78  168:aload_0         
	//*  79  169:getfield        #81  <Field Context mContext>
	//*  80  172:invokevirtual   #533 <Method Resources Context.getResources()>
	//*  81  175:invokevirtual   #537 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//*  82  178:astore_1        
	//*  83  179:fload           4
	//*  84  181:fstore          6
	//*  85  183:fload           4
	//*  86  185:ldc1            #20  <Float -1F>
	//*  87  187:fcmpl           
	//*  88  188:ifne            201
	//*  89  191:iconst_2        
	//*  90  192:ldc2            #538 <Float 12F>
	//*  91  195:aload_1         
	//*  92  196:invokestatic    #544 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//*  93  199:fstore          6
	//*  94  201:fload           5
	//*  95  203:fstore          4
	//*  96  205:fload           5
	//*  97  207:ldc1            #20  <Float -1F>
	//*  98  209:fcmpl           
	//*  99  210:ifne            223
	//* 100  213:iconst_2        
	//* 101  214:ldc2            #545 <Float 112F>
	//* 102  217:aload_1         
	//* 103  218:invokestatic    #544 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//* 104  221:fstore          4
	//* 105  223:fload_3         
	//* 106  224:fstore          5
	//* 107  226:fload_3         
	//* 108  227:ldc1            #20  <Float -1F>
	//* 109  229:fcmpl           
	//* 110  230:ifne            236
	//* 111  233:fconst_1        
	//* 112  234:fstore          5
	//* 113  236:aload_0         
	//* 114  237:fload           6
	//* 115  239:fload           4
	//* 116  241:fload           5
	//* 117  243:invokespecial   #547 <Method void validateAndSetAutoSizeTextTypeUniformConfiguration(float, float, float)>
	//* 118  246:aload_0         
	//* 119  247:invokespecial   #549 <Method boolean setupAutoSizeText()>
	//* 120  250:pop             
	//* 121  251:return          
	//* 122  252:aload_0         
	//* 123  253:iconst_0        
	//* 124  254:putfield        #59  <Field int mAutoSizeTextType>
	//* 125  257:return          
	//* 126  258:ldc1            #20  <Float -1F>
	//* 127  260:fstore          5
	//* 128  262:goto            98
	//* 129  265:ldc1            #20  <Float -1F>
	//* 130  267:fstore          4
	//* 131  269:goto            77
			f = -1F;
	//  132  272:ldc1            #20  <Float -1F>
	//  133  274:fstore_3        
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize))
			f1 = ((TypedArray) (attributeset)).getDimension(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize, -1F);
		else
			f1 = -1F;
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize))
			f2 = ((TypedArray) (attributeset)).getDimension(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize, -1F);
		else
			f2 = -1F;
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes))
		{
			i = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes, 0);
			if(i > 0)
			{
				TypedArray typedarray = ((TypedArray) (attributeset)).getResources().obtainTypedArray(i);
				setupAutoSizeUniformPresetSizes(typedarray);
				typedarray.recycle();
			}
		}
		((TypedArray) (attributeset)).recycle();
		if(supportsAutoSizeText())
		{
			if(mAutoSizeTextType == 1)
			{
				if(!mHasPresetAutoSizeValues)
				{
					attributeset = ((AttributeSet) (mContext.getResources().getDisplayMetrics()));
					float f3 = f1;
					if(f1 == -1F)
						f3 = TypedValue.applyDimension(2, 12F, ((android.util.DisplayMetrics) (attributeset)));
					f1 = f2;
					if(f2 == -1F)
						f1 = TypedValue.applyDimension(2, 112F, ((android.util.DisplayMetrics) (attributeset)));
					f2 = f;
					if(f == -1F)
						f2 = 1.0F;
					validateAndSetAutoSizeTextTypeUniformConfiguration(f3, f1, f2);
				}
				setupAutoSizeText();
			}
			return;
		} else
		{
			mAutoSizeTextType = 0;
			return;
		}
	//* 134  275:goto            56
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
		int j;
		int k;
		j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(!supportsAutoSizeText())
			break MISSING_BLOCK_LABEL_146;
	//    2    2:aload_0         
	//    3    3:invokespecial   #343 <Method boolean supportsAutoSizeText()>
	//    4    6:ifeq            146
		k = ai.length;
	//    5    9:aload_1         
	//    6   10:arraylength     
	//    7   11:istore          4
		if(k <= 0) goto _L2; else goto _L1
	//    8   13:iload           4
	//    9   15:ifle            130
_L1:
		int ai2[] = new int[k];
	//   10   18:iload           4
	//   11   20:newarray        int[]
	//   12   22:astore          6
		if(i != 0) goto _L4; else goto _L3
	//   13   24:iload_2         
	//   14   25:ifne            84
_L3:
		int ai1[] = Arrays.copyOf(ai, k);
	//   15   28:aload_1         
	//   16   29:iload           4
	//   17   31:invokestatic    #559 <Method int[] Arrays.copyOf(int[], int)>
	//   18   34:astore          5
_L6:
		mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(ai1);
	//   19   36:aload_0         
	//   20   37:aload_0         
	//   21   38:aload           5
	//   22   40:invokespecial   #351 <Method int[] cleanupAutoSizePresetSizes(int[])>
	//   23   43:putfield        #69  <Field int[] mAutoSizeTextSizesInPx>
		if(!setupAutoSizeUniformPresetSizesConfiguration())
	//*  24   46:aload_0         
	//*  25   47:invokespecial   #363 <Method boolean setupAutoSizeUniformPresetSizesConfiguration()>
	//*  26   50:ifne            135
			throw new IllegalArgumentException((new StringBuilder()).append("None of the preset sizes is valid: ").append(Arrays.toString(ai)).toString());
	//   27   53:new             #412 <Class IllegalArgumentException>
	//   28   56:dup             
	//   29   57:new             #275 <Class StringBuilder>
	//   30   60:dup             
	//   31   61:invokespecial   #276 <Method void StringBuilder()>
	//   32   64:ldc2            #561 <String "None of the preset sizes is valid: ">
	//   33   67:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   34   70:aload_1         
	//   35   71:invokestatic    #564 <Method String Arrays.toString(int[])>
	//   36   74:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:invokevirtual   #288 <Method String StringBuilder.toString()>
	//   38   80:invokespecial   #420 <Method void IllegalArgumentException(String)>
	//   39   83:athrow          
		break; /* Loop/switch isn't completed */
_L4:
		android.util.DisplayMetrics displaymetrics = mContext.getResources().getDisplayMetrics();
	//   40   84:aload_0         
	//   41   85:getfield        #81  <Field Context mContext>
	//   42   88:invokevirtual   #533 <Method Resources Context.getResources()>
	//   43   91:invokevirtual   #537 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   44   94:astore          7
		do
		{
			ai1 = ai2;
	//   45   96:aload           6
	//   46   98:astore          5
			if(j >= k)
				break;
	//   47  100:iload_3         
	//   48  101:iload           4
	//   49  103:icmpge          36
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
