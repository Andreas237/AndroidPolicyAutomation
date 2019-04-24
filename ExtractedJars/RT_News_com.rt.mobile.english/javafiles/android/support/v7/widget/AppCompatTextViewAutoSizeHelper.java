// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.text.*;
import android.text.method.TransformationMethod;
import android.util.*;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

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
	//    2    2:istore          4
		if(k == 0)
	//*   3    4:iload           4
	//*   4    6:ifne            11
			return ai;
	//    5    9:aload_1         
	//    6   10:areturn         
		Arrays.sort(ai);
	//    7   11:aload_1         
	//    8   12:invokestatic    #89  <Method void Arrays.sort(int[])>
		ArrayList arraylist = new ArrayList();
	//    9   15:new             #91  <Class ArrayList>
	//   10   18:dup             
	//   11   19:invokespecial   #92  <Method void ArrayList()>
	//   12   22:astore          6
		boolean flag = false;
	//   13   24:iconst_0        
	//   14   25:istore_3        
		for(int i = 0; i < k; i++)
	//*  15   26:iconst_0        
	//*  16   27:istore_2        
	//*  17   28:iload_2         
	//*  18   29:iload           4
	//*  19   31:icmpge          77
		{
			int l = ai[i];
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:iaload          
	//   23   37:istore          5
			if(l > 0 && Collections.binarySearch(((List) (arraylist)), ((Object) (Integer.valueOf(l)))) < 0)
	//*  24   39:iload           5
	//*  25   41:ifle            70
	//*  26   44:aload           6
	//*  27   46:iload           5
	//*  28   48:invokestatic    #98  <Method Integer Integer.valueOf(int)>
	//*  29   51:invokestatic    #104 <Method int Collections.binarySearch(List, Object)>
	//*  30   54:ifge            70
				((List) (arraylist)).add(((Object) (Integer.valueOf(l))));
	//   31   57:aload           6
	//   32   59:iload           5
	//   33   61:invokestatic    #98  <Method Integer Integer.valueOf(int)>
	//   34   64:invokeinterface #110 <Method boolean List.add(Object)>
	//   35   69:pop             
		}

	//   36   70:iload_2         
	//   37   71:iconst_1        
	//   38   72:iadd            
	//   39   73:istore_2        
	//*  40   74:goto            28
		if(k == ((List) (arraylist)).size())
	//*  41   77:iload           4
	//*  42   79:aload           6
	//*  43   81:invokeinterface #114 <Method int List.size()>
	//*  44   86:icmpne          91
			return ai;
	//   45   89:aload_1         
	//   46   90:areturn         
		k = ((List) (arraylist)).size();
	//   47   91:aload           6
	//   48   93:invokeinterface #114 <Method int List.size()>
	//   49   98:istore          4
		ai = new int[k];
	//   50  100:iload           4
	//   51  102:newarray        int[]
	//   52  104:astore_1        
		for(int j = ((int) (flag)); j < k; j++)
	//*  53  105:iload_3         
	//*  54  106:istore_2        
	//*  55  107:iload_2         
	//*  56  108:iload           4
	//*  57  110:icmpge          137
			ai[j] = ((Integer)((List) (arraylist)).get(j)).intValue();
	//   58  113:aload_1         
	//   59  114:iload_2         
	//   60  115:aload           6
	//   61  117:iload_2         
	//   62  118:invokeinterface #118 <Method Object List.get(int)>
	//   63  123:checkcast       #94  <Class Integer>
	//   64  126:invokevirtual   #121 <Method int Integer.intValue()>
	//   65  129:iastore         

	//   66  130:iload_2         
	//   67  131:iconst_1        
	//   68  132:iadd            
	//   69  133:istore_2        
	//*  70  134:goto            107
		return ai;
	//   71  137:aload_1         
	//   72  138:areturn         
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
	//*   0    0:getstatic       #210 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          38
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
	//*  15   35:goto            107
		{
			f = ((Float)invokeAndReturnWithDefault(((Object) (mTextView)), "getLineSpacingMultiplier", ((Object) (Float.valueOf(1.0F))))).floatValue();
	//   16   38:aload_0         
	//   17   39:aload_0         
	//   18   40:getfield        #73  <Field TextView mTextView>
	//   19   43:ldc1            #211 <String "getLineSpacingMultiplier">
	//   20   45:fconst_1        
	//   21   46:invokestatic    #216 <Method Float Float.valueOf(float)>
	//   22   49:invokespecial   #139 <Method Object invokeAndReturnWithDefault(Object, String, Object)>
	//   23   52:checkcast       #213 <Class Float>
	//   24   55:invokevirtual   #219 <Method float Float.floatValue()>
	//   25   58:fstore          4
			f1 = ((Float)invokeAndReturnWithDefault(((Object) (mTextView)), "getLineSpacingExtra", ((Object) (Float.valueOf(0.0F))))).floatValue();
	//   26   60:aload_0         
	//   27   61:aload_0         
	//   28   62:getfield        #73  <Field TextView mTextView>
	//   29   65:ldc1            #220 <String "getLineSpacingExtra">
	//   30   67:fconst_0        
	//   31   68:invokestatic    #216 <Method Float Float.valueOf(float)>
	//   32   71:invokespecial   #139 <Method Object invokeAndReturnWithDefault(Object, String, Object)>
	//   33   74:checkcast       #213 <Class Float>
	//   34   77:invokevirtual   #219 <Method float Float.floatValue()>
	//   35   80:fstore          5
			flag = ((Boolean)invokeAndReturnWithDefault(((Object) (mTextView)), "getIncludeFontPadding", ((Object) (Boolean.valueOf(true))))).booleanValue();
	//   36   82:aload_0         
	//   37   83:aload_0         
	//   38   84:getfield        #73  <Field TextView mTextView>
	//   39   87:ldc1            #221 <String "getIncludeFontPadding">
	//   40   89:iconst_1        
	//   41   90:invokestatic    #226 <Method Boolean Boolean.valueOf(boolean)>
	//   42   93:invokespecial   #139 <Method Object invokeAndReturnWithDefault(Object, String, Object)>
	//   43   96:checkcast       #223 <Class Boolean>
	//   44   99:invokevirtual   #229 <Method boolean Boolean.booleanValue()>
	//   45  102:istore          6
		}
	//*  46  104:goto            35
		return new StaticLayout(charsequence, mTempTextPaint, i, alignment, f, f1, flag);
	//   47  107:new             #231 <Class StaticLayout>
	//   48  110:dup             
	//   49  111:aload_1         
	//   50  112:aload_0         
	//   51  113:getfield        #148 <Field TextPaint mTempTextPaint>
	//   52  116:iload_3         
	//   53  117:aload_2         
	//   54  118:fload           4
	//   55  120:fload           5
	//   56  122:iload           6
	//   57  124:invokespecial   #234 <Method void StaticLayout(CharSequence, TextPaint, int, android.text.Layout$Alignment, float, float, boolean)>
	//   58  127:areturn         
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
	//    6   12:new             #238 <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #240 <String "No available text sizes to choose from.">
	//    9   18:invokespecial   #243 <Method void IllegalStateException(String)>
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
	//*  21   35:icmpgt          82
		{
			j = (i + k) / 2;
	//   22   38:iload_2         
	//   23   39:iload           4
	//   24   41:iadd            
	//   25   42:iconst_2        
	//   26   43:idiv            
	//   27   44:istore_3        
			if(suggestedSizeFitsInSpace(mAutoSizeTextSizesInPx[j], rectf))
	//*  28   45:aload_0         
	//*  29   46:aload_0         
	//*  30   47:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//*  31   50:iload_3         
	//*  32   51:iaload          
	//*  33   52:aload_1         
	//*  34   53:invokespecial   #247 <Method boolean suggestedSizeFitsInSpace(int, RectF)>
	//*  35   56:ifeq            72
			{
				int l = j + 1;
	//   36   59:iload_3         
	//   37   60:iconst_1        
	//   38   61:iadd            
	//   39   62:istore          5
				j = i;
	//   40   64:iload_2         
	//   41   65:istore_3        
				i = l;
	//   42   66:iload           5
	//   43   68:istore_2        
			} else
	//*  44   69:goto            32
			{
				j--;
	//   45   72:iload_3         
	//   46   73:iconst_1        
	//   47   74:isub            
	//   48   75:istore_3        
				k = j;
	//   49   76:iload_3         
	//   50   77:istore          4
			}
		}

	//*  51   79:goto            32
		return mAutoSizeTextSizesInPx[j];
	//   52   82:aload_0         
	//   53   83:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//   54   86:iload_3         
	//   55   87:iaload          
	//   56   88:ireturn         
	}

	private Method getTextViewMethod(String s)
	{
		Method method;
		Method method1;
		try
		{
			method1 = (Method)sTextViewMethodByNameCache.get(((Object) (s)));
	//    0    0:getstatic       #54  <Field ConcurrentHashMap sTextViewMethodByNameCache>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #256 <Method Object ConcurrentHashMap.get(Object)>
	//    3    7:checkcast       #258 <Class Method>
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
	//*  13   24:invokevirtual   #264 <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  14   27:astore_3        
	//*  15   28:aload_3         
	//*  16   29:astore_2        
	//*  17   30:aload_3         
	//*  18   31:ifnull          50
	//*  19   34:aload_3         
	//*  20   35:iconst_1        
	//*  21   36:invokevirtual   #268 <Method void Method.setAccessible(boolean)>
	//*  22   39:getstatic       #54  <Field ConcurrentHashMap sTextViewMethodByNameCache>
	//*  23   42:aload_1         
	//*  24   43:aload_3         
	//*  25   44:invokevirtual   #272 <Method Object ConcurrentHashMap.put(Object, Object)>
	//*  26   47:pop             
	//*  27   48:aload_3         
	//*  28   49:astore_2        
	//*  29   50:aload_2         
	//*  30   51:areturn         
		catch(Exception exception)
	//*  31   52:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   32   53:new             #274 <Class StringBuilder>
	//   33   56:dup             
	//   34   57:invokespecial   #275 <Method void StringBuilder()>
	//   35   60:astore_3        
			stringbuilder.append("Failed to retrieve TextView#");
	//   36   61:aload_3         
	//   37   62:ldc2            #277 <String "Failed to retrieve TextView#">
	//   38   65:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   39   68:pop             
			stringbuilder.append(s);
	//   40   69:aload_3         
	//   41   70:aload_1         
	//   42   71:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   43   74:pop             
			stringbuilder.append("() method");
	//   44   75:aload_3         
	//   45   76:ldc2            #283 <String "() method">
	//   46   79:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   47   82:pop             
			Log.w("ACTVAutoSizeHelper", stringbuilder.toString(), ((Throwable) (exception)));
	//   48   83:ldc1            #15  <String "ACTVAutoSizeHelper">
	//   49   85:aload_3         
	//   50   86:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   51   89:aload_2         
	//   52   90:invokestatic    #293 <Method int Log.w(String, String, Throwable)>
	//   53   93:pop             
			return null;
	//   54   94:aconst_null     
	//   55   95:areturn         
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
		obj = getTextViewMethod(s).invoke(obj, new Object[0]);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #296 <Method Method getTextViewMethod(String)>
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:anewarray       Object[]
	//    6   10:invokevirtual   #300 <Method Object Method.invoke(Object, Object[])>
	//    7   13:astore_1        
		return obj;
	//    8   14:aload_1         
	//    9   15:areturn         
		obj;
	//   10   16:astore_1        
		break MISSING_BLOCK_LABEL_69;
	//   11   17:goto            69
		obj;
	//   12   20:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   13   21:new             #274 <Class StringBuilder>
	//   14   24:dup             
	//   15   25:invokespecial   #275 <Method void StringBuilder()>
	//   16   28:astore          4
		stringbuilder.append("Failed to invoke TextView#");
	//   17   30:aload           4
	//   18   32:ldc2            #302 <String "Failed to invoke TextView#">
	//   19   35:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		stringbuilder.append(s);
	//   21   39:aload           4
	//   22   41:aload_2         
	//   23   42:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		stringbuilder.append("() method");
	//   25   46:aload           4
	//   26   48:ldc2            #283 <String "() method">
	//   27   51:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
		Log.w("ACTVAutoSizeHelper", stringbuilder.toString(), ((Throwable) (obj)));
	//   29   55:ldc1            #15  <String "ACTVAutoSizeHelper">
	//   30   57:aload           4
	//   31   59:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   32   62:aload_1         
	//   33   63:invokestatic    #293 <Method int Log.w(String, String, Throwable)>
	//   34   66:pop             
		return obj1;
	//   35   67:aload_3         
	//   36   68:areturn         
		throw obj;
	//   37   69:aload_1         
	//   38   70:athrow          
	}

	private void setRawTextSize(float f)
	{
		boolean flag;
		if(f == mTextView.getPaint().getTextSize())
			break MISSING_BLOCK_LABEL_129;
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #73  <Field TextView mTextView>
	//    3    5:invokevirtual   #310 <Method TextPaint TextView.getPaint()>
	//    4    8:invokevirtual   #315 <Method float TextPaint.getTextSize()>
	//    5   11:fcmpl           
	//    6   12:ifeq            129
		mTextView.getPaint().setTextSize(f);
	//    7   15:aload_0         
	//    8   16:getfield        #73  <Field TextView mTextView>
	//    9   19:invokevirtual   #310 <Method TextPaint TextView.getPaint()>
	//   10   22:fload_1         
	//   11   23:invokevirtual   #318 <Method void TextPaint.setTextSize(float)>
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  12   26:getstatic       #210 <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   29:bipush          18
	//*  14   31:icmplt          45
			flag = mTextView.isInLayout();
	//   15   34:aload_0         
	//   16   35:getfield        #73  <Field TextView mTextView>
	//   17   38:invokevirtual   #321 <Method boolean TextView.isInLayout()>
	//   18   41:istore_2        
		else
	//*  19   42:goto            47
			flag = false;
	//   20   45:iconst_0        
	//   21   46:istore_2        
		if(mTextView.getLayout() == null)
			break MISSING_BLOCK_LABEL_129;
	//   22   47:aload_0         
	//   23   48:getfield        #73  <Field TextView mTextView>
	//   24   51:invokevirtual   #325 <Method android.text.Layout TextView.getLayout()>
	//   25   54:ifnull          129
		mNeedsAutoSizeText = false;
	//   26   57:aload_0         
	//   27   58:iconst_0        
	//   28   59:putfield        #61  <Field boolean mNeedsAutoSizeText>
		Method method = getTextViewMethod("nullLayouts");
	//   29   62:aload_0         
	//   30   63:ldc2            #327 <String "nullLayouts">
	//   31   66:invokespecial   #296 <Method Method getTextViewMethod(String)>
	//   32   69:astore_3        
		if(method != null)
	//*  33   70:aload_3         
	//*  34   71:ifnull          101
			try
			{
				method.invoke(((Object) (mTextView)), new Object[0]);
	//   35   74:aload_3         
	//   36   75:aload_0         
	//   37   76:getfield        #73  <Field TextView mTextView>
	//   38   79:iconst_0        
	//   39   80:anewarray       Object[]
	//   40   83:invokevirtual   #300 <Method Object Method.invoke(Object, Object[])>
	//   41   86:pop             
			}
	//*  42   87:goto            101
			catch(Exception exception)
	//*  43   90:astore_3        
			{
				Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", ((Throwable) (exception)));
	//   44   91:ldc1            #15  <String "ACTVAutoSizeHelper">
	//   45   93:ldc2            #329 <String "Failed to invoke TextView#nullLayouts() method">
	//   46   96:aload_3         
	//   47   97:invokestatic    #293 <Method int Log.w(String, String, Throwable)>
	//   48  100:pop             
			}
		if(!flag)
	//*  49  101:iload_2         
	//*  50  102:ifne            115
			mTextView.requestLayout();
	//   51  105:aload_0         
	//   52  106:getfield        #73  <Field TextView mTextView>
	//   53  109:invokevirtual   #332 <Method void TextView.requestLayout()>
		else
	//*  54  112:goto            122
			mTextView.forceLayout();
	//   55  115:aload_0         
	//   56  116:getfield        #73  <Field TextView mTextView>
	//   57  119:invokevirtual   #335 <Method void TextView.forceLayout()>
		mTextView.invalidate();
	//   58  122:aload_0         
	//   59  123:getfield        #73  <Field TextView mTextView>
	//   60  126:invokevirtual   #338 <Method void TextView.invalidate()>
	//   61  129:return          
	}

	private boolean setupAutoSizeText()
	{
		boolean flag = supportsAutoSizeText();
	//    0    0:aload_0         
	//    1    1:invokespecial   #342 <Method boolean supportsAutoSizeText()>
	//    2    4:istore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(flag && mAutoSizeTextType == 1)
	//*   5    8:iload           4
	//*   6   10:ifeq            135
	//*   7   13:aload_0         
	//*   8   14:getfield        #59  <Field int mAutoSizeTextType>
	//*   9   17:iconst_1        
	//*  10   18:icmpne          135
		{
			if(!mHasPresetAutoSizeValues || mAutoSizeTextSizesInPx.length == 0)
	//*  11   21:aload_0         
	//*  12   22:getfield        #71  <Field boolean mHasPresetAutoSizeValues>
	//*  13   25:ifeq            36
	//*  14   28:aload_0         
	//*  15   29:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//*  16   32:arraylength     
	//*  17   33:ifne            127
			{
				float f = Math.round(mAutoSizeMinTextSizeInPx);
	//   18   36:aload_0         
	//   19   37:getfield        #65  <Field float mAutoSizeMinTextSizeInPx>
	//   20   40:invokestatic    #348 <Method int Math.round(float)>
	//   21   43:i2f             
	//   22   44:fstore_1        
				int i = 1;
	//   23   45:iconst_1        
	//   24   46:istore_2        
				for(; Math.round(mAutoSizeStepGranularityInPx + f) <= Math.round(mAutoSizeMaxTextSizeInPx); f += mAutoSizeStepGranularityInPx)
	//*  25   47:aload_0         
	//*  26   48:getfield        #63  <Field float mAutoSizeStepGranularityInPx>
	//*  27   51:fload_1         
	//*  28   52:fadd            
	//*  29   53:invokestatic    #348 <Method int Math.round(float)>
	//*  30   56:aload_0         
	//*  31   57:getfield        #67  <Field float mAutoSizeMaxTextSizeInPx>
	//*  32   60:invokestatic    #348 <Method int Math.round(float)>
	//*  33   63:icmpgt          80
					i++;
	//   34   66:iload_2         
	//   35   67:iconst_1        
	//   36   68:iadd            
	//   37   69:istore_2        

	//   38   70:fload_1         
	//   39   71:aload_0         
	//   40   72:getfield        #63  <Field float mAutoSizeStepGranularityInPx>
	//   41   75:fadd            
	//   42   76:fstore_1        
	//*  43   77:goto            47
				int ai[] = new int[i];
	//   44   80:iload_2         
	//   45   81:newarray        int[]
	//   46   83:astore          5
				f = mAutoSizeMinTextSizeInPx;
	//   47   85:aload_0         
	//   48   86:getfield        #65  <Field float mAutoSizeMinTextSizeInPx>
	//   49   89:fstore_1        
				for(; j < i; j++)
	//*  50   90:iload_3         
	//*  51   91:iload_2         
	//*  52   92:icmpge          117
				{
					ai[j] = Math.round(f);
	//   53   95:aload           5
	//   54   97:iload_3         
	//   55   98:fload_1         
	//   56   99:invokestatic    #348 <Method int Math.round(float)>
	//   57  102:iastore         
					f += mAutoSizeStepGranularityInPx;
	//   58  103:fload_1         
	//   59  104:aload_0         
	//   60  105:getfield        #63  <Field float mAutoSizeStepGranularityInPx>
	//   61  108:fadd            
	//   62  109:fstore_1        
				}

	//   63  110:iload_3         
	//   64  111:iconst_1        
	//   65  112:iadd            
	//   66  113:istore_3        
	//*  67  114:goto            90
				mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(ai);
	//   68  117:aload_0         
	//   69  118:aload_0         
	//   70  119:aload           5
	//   71  121:invokespecial   #350 <Method int[] cleanupAutoSizePresetSizes(int[])>
	//   72  124:putfield        #69  <Field int[] mAutoSizeTextSizesInPx>
			}
			mNeedsAutoSizeText = true;
	//   73  127:aload_0         
	//   74  128:iconst_1        
	//   75  129:putfield        #61  <Field boolean mNeedsAutoSizeText>
		} else
	//*  76  132:goto            140
		{
			mNeedsAutoSizeText = false;
	//   77  135:aload_0         
	//   78  136:iconst_0        
	//   79  137:putfield        #61  <Field boolean mNeedsAutoSizeText>
		}
		return mNeedsAutoSizeText;
	//   80  140:aload_0         
	//   81  141:getfield        #61  <Field boolean mNeedsAutoSizeText>
	//   82  144:ireturn         
	}

	private void setupAutoSizeUniformPresetSizes(TypedArray typedarray)
	{
		int j = typedarray.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #355 <Method int TypedArray.length()>
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
	//   18   27:invokevirtual   #359 <Method int TypedArray.getDimensionPixelSize(int, int)>
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
	//   28   42:invokespecial   #350 <Method int[] cleanupAutoSizePresetSizes(int[])>
	//   29   45:putfield        #69  <Field int[] mAutoSizeTextSizesInPx>
			setupAutoSizeUniformPresetSizesConfiguration();
	//   30   48:aload_0         
	//   31   49:invokespecial   #362 <Method boolean setupAutoSizeUniformPresetSizesConfiguration()>
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
	//*   5    7:ifle            15
			flag = true;
	//    6   10:iconst_1        
	//    7   11:istore_2        
		else
	//*   8   12:goto            17
			flag = false;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		mHasPresetAutoSizeValues = flag;
	//   11   17:aload_0         
	//   12   18:iload_2         
	//   13   19:putfield        #71  <Field boolean mHasPresetAutoSizeValues>
		if(mHasPresetAutoSizeValues)
	//*  14   22:aload_0         
	//*  15   23:getfield        #71  <Field boolean mHasPresetAutoSizeValues>
	//*  16   26:ifeq            64
		{
			mAutoSizeTextType = 1;
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:putfield        #59  <Field int mAutoSizeTextType>
			mAutoSizeMinTextSizeInPx = mAutoSizeTextSizesInPx[0];
	//   20   34:aload_0         
	//   21   35:aload_0         
	//   22   36:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//   23   39:iconst_0        
	//   24   40:iaload          
	//   25   41:i2f             
	//   26   42:putfield        #65  <Field float mAutoSizeMinTextSizeInPx>
			mAutoSizeMaxTextSizeInPx = mAutoSizeTextSizesInPx[i - 1];
	//   27   45:aload_0         
	//   28   46:aload_0         
	//   29   47:getfield        #69  <Field int[] mAutoSizeTextSizesInPx>
	//   30   50:iload_1         
	//   31   51:iconst_1        
	//   32   52:isub            
	//   33   53:iaload          
	//   34   54:i2f             
	//   35   55:putfield        #67  <Field float mAutoSizeMaxTextSizeInPx>
			mAutoSizeStepGranularityInPx = -1F;
	//   36   58:aload_0         
	//   37   59:ldc1            #20  <Float -1F>
	//   38   61:putfield        #63  <Field float mAutoSizeStepGranularityInPx>
		}
		return mHasPresetAutoSizeValues;
	//   39   64:aload_0         
	//   40   65:getfield        #71  <Field boolean mHasPresetAutoSizeValues>
	//   41   68:ireturn         
	}

	private boolean suggestedSizeFitsInSpace(int i, RectF rectf)
	{
		Object obj = ((Object) (mTextView.getText()));
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field TextView mTextView>
	//    2    4:invokevirtual   #366 <Method CharSequence TextView.getText()>
	//    3    7:astore          5
		Object obj1 = ((Object) (mTextView.getTransformationMethod()));
	//    4    9:aload_0         
	//    5   10:getfield        #73  <Field TextView mTextView>
	//    6   13:invokevirtual   #370 <Method TransformationMethod TextView.getTransformationMethod()>
	//    7   16:astore          6
		CharSequence charsequence = ((CharSequence) (obj));
	//    8   18:aload           5
	//    9   20:astore          4
		if(obj1 != null)
	//*  10   22:aload           6
	//*  11   24:ifnull          55
		{
			obj1 = ((Object) (((TransformationMethod) (obj1)).getTransformation(((CharSequence) (obj)), ((android.view.View) (mTextView)))));
	//   12   27:aload           6
	//   13   29:aload           5
	//   14   31:aload_0         
	//   15   32:getfield        #73  <Field TextView mTextView>
	//   16   35:invokeinterface #376 <Method CharSequence TransformationMethod.getTransformation(CharSequence, android.view.View)>
	//   17   40:astore          6
			charsequence = ((CharSequence) (obj));
	//   18   42:aload           5
	//   19   44:astore          4
			if(obj1 != null)
	//*  20   46:aload           6
	//*  21   48:ifnull          55
				charsequence = ((CharSequence) (obj1));
	//   22   51:aload           6
	//   23   53:astore          4
		}
		int j;
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  24   55:getstatic       #210 <Field int android.os.Build$VERSION.SDK_INT>
	//*  25   58:bipush          16
	//*  26   60:icmplt          74
			j = mTextView.getMaxLines();
	//   27   63:aload_0         
	//   28   64:getfield        #73  <Field TextView mTextView>
	//   29   67:invokevirtual   #379 <Method int TextView.getMaxLines()>
	//   30   70:istore_3        
		else
	//*  31   71:goto            76
			j = -1;
	//   32   74:iconst_m1       
	//   33   75:istore_3        
		if(mTempTextPaint == null)
	//*  34   76:aload_0         
	//*  35   77:getfield        #148 <Field TextPaint mTempTextPaint>
	//*  36   80:ifnonnull       97
			mTempTextPaint = new TextPaint();
	//   37   83:aload_0         
	//   38   84:new             #312 <Class TextPaint>
	//   39   87:dup             
	//   40   88:invokespecial   #380 <Method void TextPaint()>
	//   41   91:putfield        #148 <Field TextPaint mTempTextPaint>
		else
	//*  42   94:goto            104
			mTempTextPaint.reset();
	//   43   97:aload_0         
	//   44   98:getfield        #148 <Field TextPaint mTempTextPaint>
	//   45  101:invokevirtual   #383 <Method void TextPaint.reset()>
		mTempTextPaint.set(mTextView.getPaint());
	//   46  104:aload_0         
	//   47  105:getfield        #148 <Field TextPaint mTempTextPaint>
	//   48  108:aload_0         
	//   49  109:getfield        #73  <Field TextView mTextView>
	//   50  112:invokevirtual   #310 <Method TextPaint TextView.getPaint()>
	//   51  115:invokevirtual   #387 <Method void TextPaint.set(TextPaint)>
		mTempTextPaint.setTextSize(i);
	//   52  118:aload_0         
	//   53  119:getfield        #148 <Field TextPaint mTempTextPaint>
	//   54  122:iload_1         
	//   55  123:i2f             
	//   56  124:invokevirtual   #318 <Method void TextPaint.setTextSize(float)>
		obj = ((Object) ((android.text.Layout.Alignment)invokeAndReturnWithDefault(((Object) (mTextView)), "getLayoutAlignment", ((Object) (android.text.Layout.Alignment.ALIGN_NORMAL)))));
	//   57  127:aload_0         
	//   58  128:aload_0         
	//   59  129:getfield        #73  <Field TextView mTextView>
	//   60  132:ldc2            #389 <String "getLayoutAlignment">
	//   61  135:getstatic       #395 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//   62  138:invokespecial   #139 <Method Object invokeAndReturnWithDefault(Object, String, Object)>
	//   63  141:checkcast       #391 <Class android.text.Layout$Alignment>
	//   64  144:astore          5
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  65  146:getstatic       #210 <Field int android.os.Build$VERSION.SDK_INT>
	//*  66  149:bipush          23
	//*  67  151:icmplt          175
			obj = ((Object) (createStaticLayoutForMeasuring(charsequence, ((android.text.Layout.Alignment) (obj)), Math.round(rectf.right), j)));
	//   68  154:aload_0         
	//   69  155:aload           4
	//   70  157:aload           5
	//   71  159:aload_2         
	//   72  160:getfield        #398 <Field float RectF.right>
	//   73  163:invokestatic    #348 <Method int Math.round(float)>
	//   74  166:iload_3         
	//   75  167:invokespecial   #400 <Method StaticLayout createStaticLayoutForMeasuring(CharSequence, android.text.Layout$Alignment, int, int)>
	//   76  170:astore          5
		else
	//*  77  172:goto            192
			obj = ((Object) (createStaticLayoutForMeasuringPre23(charsequence, ((android.text.Layout.Alignment) (obj)), Math.round(rectf.right))));
	//   78  175:aload_0         
	//   79  176:aload           4
	//   80  178:aload           5
	//   81  180:aload_2         
	//   82  181:getfield        #398 <Field float RectF.right>
	//   83  184:invokestatic    #348 <Method int Math.round(float)>
	//   84  187:invokespecial   #402 <Method StaticLayout createStaticLayoutForMeasuringPre23(CharSequence, android.text.Layout$Alignment, int)>
	//   85  190:astore          5
		if(j != -1 && (((StaticLayout) (obj)).getLineCount() > j || ((StaticLayout) (obj)).getLineEnd(((StaticLayout) (obj)).getLineCount() - 1) != charsequence.length()))
	//*  86  192:iload_3         
	//*  87  193:iconst_m1       
	//*  88  194:icmpeq          230
	//*  89  197:aload           5
	//*  90  199:invokevirtual   #405 <Method int StaticLayout.getLineCount()>
	//*  91  202:iload_3         
	//*  92  203:icmpgt          228
	//*  93  206:aload           5
	//*  94  208:aload           5
	//*  95  210:invokevirtual   #405 <Method int StaticLayout.getLineCount()>
	//*  96  213:iconst_1        
	//*  97  214:isub            
	//*  98  215:invokevirtual   #409 <Method int StaticLayout.getLineEnd(int)>
	//*  99  218:aload           4
	//* 100  220:invokeinterface #146 <Method int CharSequence.length()>
	//* 101  225:icmpeq          230
			return false;
	//  102  228:iconst_0        
	//  103  229:ireturn         
		return (float)((StaticLayout) (obj)).getHeight() <= rectf.bottom;
	//  104  230:aload           5
	//  105  232:invokevirtual   #412 <Method int StaticLayout.getHeight()>
	//  106  235:i2f             
	//  107  236:aload_2         
	//  108  237:getfield        #415 <Field float RectF.bottom>
	//  109  240:fcmpl           
	//  110  241:ifle            246
	//  111  244:iconst_0        
	//  112  245:ireturn         
	//  113  246:iconst_1        
	//  114  247:ireturn         
	}

	private boolean supportsAutoSizeText()
	{
		return !(mTextView instanceof AppCompatEditText);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field TextView mTextView>
	//    2    4:instanceof      #417 <Class AppCompatEditText>
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
	//*   3    3:ifgt            53
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    6:new             #274 <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #275 <Method void StringBuilder()>
	//    7   13:astore          4
			stringbuilder.append("Minimum auto-size text size (");
	//    8   15:aload           4
	//    9   17:ldc2            #423 <String "Minimum auto-size text size (">
	//   10   20:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(f);
	//   12   24:aload           4
	//   13   26:fload_1         
	//   14   27:invokevirtual   #426 <Method StringBuilder StringBuilder.append(float)>
	//   15   30:pop             
			stringbuilder.append("px) is less or equal to (0px)");
	//   16   31:aload           4
	//   17   33:ldc2            #428 <String "px) is less or equal to (0px)">
	//   18   36:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   40:new             #421 <Class IllegalArgumentException>
	//   21   43:dup             
	//   22   44:aload           4
	//   23   46:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   24   49:invokespecial   #429 <Method void IllegalArgumentException(String)>
	//   25   52:athrow          
		}
		if(f1 <= f)
	//*  26   53:fload_2         
	//*  27   54:fload_1         
	//*  28   55:fcmpg           
	//*  29   56:ifgt            131
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   30   59:new             #274 <Class StringBuilder>
	//   31   62:dup             
	//   32   63:invokespecial   #275 <Method void StringBuilder()>
	//   33   66:astore          4
			stringbuilder1.append("Maximum auto-size text size (");
	//   34   68:aload           4
	//   35   70:ldc2            #431 <String "Maximum auto-size text size (">
	//   36   73:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   37   76:pop             
			stringbuilder1.append(f1);
	//   38   77:aload           4
	//   39   79:fload_2         
	//   40   80:invokevirtual   #426 <Method StringBuilder StringBuilder.append(float)>
	//   41   83:pop             
			stringbuilder1.append("px) is less or equal to minimum auto-size ");
	//   42   84:aload           4
	//   43   86:ldc2            #433 <String "px) is less or equal to minimum auto-size ">
	//   44   89:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   45   92:pop             
			stringbuilder1.append("text size (");
	//   46   93:aload           4
	//   47   95:ldc2            #435 <String "text size (">
	//   48   98:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   49  101:pop             
			stringbuilder1.append(f);
	//   50  102:aload           4
	//   51  104:fload_1         
	//   52  105:invokevirtual   #426 <Method StringBuilder StringBuilder.append(float)>
	//   53  108:pop             
			stringbuilder1.append("px)");
	//   54  109:aload           4
	//   55  111:ldc2            #437 <String "px)">
	//   56  114:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   57  117:pop             
			throw new IllegalArgumentException(stringbuilder1.toString());
	//   58  118:new             #421 <Class IllegalArgumentException>
	//   59  121:dup             
	//   60  122:aload           4
	//   61  124:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   62  127:invokespecial   #429 <Method void IllegalArgumentException(String)>
	//   63  130:athrow          
		}
		if(f2 <= 0.0F)
	//*  64  131:fload_3         
	//*  65  132:fconst_0        
	//*  66  133:fcmpg           
	//*  67  134:ifgt            184
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   68  137:new             #274 <Class StringBuilder>
	//   69  140:dup             
	//   70  141:invokespecial   #275 <Method void StringBuilder()>
	//   71  144:astore          4
			stringbuilder2.append("The auto-size step granularity (");
	//   72  146:aload           4
	//   73  148:ldc2            #439 <String "The auto-size step granularity (">
	//   74  151:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   75  154:pop             
			stringbuilder2.append(f2);
	//   76  155:aload           4
	//   77  157:fload_3         
	//   78  158:invokevirtual   #426 <Method StringBuilder StringBuilder.append(float)>
	//   79  161:pop             
			stringbuilder2.append("px) is less or equal to (0px)");
	//   80  162:aload           4
	//   81  164:ldc2            #428 <String "px) is less or equal to (0px)">
	//   82  167:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   83  170:pop             
			throw new IllegalArgumentException(stringbuilder2.toString());
	//   84  171:new             #421 <Class IllegalArgumentException>
	//   85  174:dup             
	//   86  175:aload           4
	//   87  177:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   88  180:invokespecial   #429 <Method void IllegalArgumentException(String)>
	//   89  183:athrow          
		} else
		{
			mAutoSizeTextType = 1;
	//   90  184:aload_0         
	//   91  185:iconst_1        
	//   92  186:putfield        #59  <Field int mAutoSizeTextType>
			mAutoSizeMinTextSizeInPx = f;
	//   93  189:aload_0         
	//   94  190:fload_1         
	//   95  191:putfield        #65  <Field float mAutoSizeMinTextSizeInPx>
			mAutoSizeMaxTextSizeInPx = f1;
	//   96  194:aload_0         
	//   97  195:fload_2         
	//   98  196:putfield        #67  <Field float mAutoSizeMaxTextSizeInPx>
			mAutoSizeStepGranularityInPx = f2;
	//   99  199:aload_0         
	//  100  200:fload_3         
	//  101  201:putfield        #63  <Field float mAutoSizeStepGranularityInPx>
			mHasPresetAutoSizeValues = false;
	//  102  204:aload_0         
	//  103  205:iconst_0        
	//  104  206:putfield        #71  <Field boolean mHasPresetAutoSizeValues>
			return;
	//  105  209:return          
		}
	}

	void autoSizeText()
	{
		if(!isAutoSizeEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #447 <Method boolean isAutoSizeEnabled()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(mNeedsAutoSizeText)
	//*   4    8:aload_0         
	//*   5    9:getfield        #61  <Field boolean mNeedsAutoSizeText>
	//*   6   12:ifeq            196
			if(mTextView.getMeasuredHeight() > 0)
	//*   7   15:aload_0         
	//*   8   16:getfield        #73  <Field TextView mTextView>
	//*   9   19:invokevirtual   #450 <Method int TextView.getMeasuredHeight()>
	//*  10   22:ifle            195
			{
				if(mTextView.getMeasuredWidth() <= 0)
	//*  11   25:aload_0         
	//*  12   26:getfield        #73  <Field TextView mTextView>
	//*  13   29:invokevirtual   #453 <Method int TextView.getMeasuredWidth()>
	//*  14   32:ifgt            36
					return;
	//   15   35:return          
				int i;
				if(((Boolean)invokeAndReturnWithDefault(((Object) (mTextView)), "getHorizontallyScrolling", ((Object) (Boolean.valueOf(false))))).booleanValue())
	//*  16   36:aload_0         
	//*  17   37:aload_0         
	//*  18   38:getfield        #73  <Field TextView mTextView>
	//*  19   41:ldc2            #455 <String "getHorizontallyScrolling">
	//*  20   44:iconst_0        
	//*  21   45:invokestatic    #226 <Method Boolean Boolean.valueOf(boolean)>
	//*  22   48:invokespecial   #139 <Method Object invokeAndReturnWithDefault(Object, String, Object)>
	//*  23   51:checkcast       #223 <Class Boolean>
	//*  24   54:invokevirtual   #229 <Method boolean Boolean.booleanValue()>
	//*  25   57:ifeq            66
					i = 0x100000;
	//   26   60:ldc1            #22  <Int 0x100000>
	//   27   62:istore_2        
				else
	//*  28   63:goto            90
					i = mTextView.getMeasuredWidth() - mTextView.getTotalPaddingLeft() - mTextView.getTotalPaddingRight();
	//   29   66:aload_0         
	//   30   67:getfield        #73  <Field TextView mTextView>
	//   31   70:invokevirtual   #453 <Method int TextView.getMeasuredWidth()>
	//   32   73:aload_0         
	//   33   74:getfield        #73  <Field TextView mTextView>
	//   34   77:invokevirtual   #458 <Method int TextView.getTotalPaddingLeft()>
	//   35   80:isub            
	//   36   81:aload_0         
	//   37   82:getfield        #73  <Field TextView mTextView>
	//   38   85:invokevirtual   #461 <Method int TextView.getTotalPaddingRight()>
	//   39   88:isub            
	//   40   89:istore_2        
				int j = mTextView.getHeight() - mTextView.getCompoundPaddingBottom() - mTextView.getCompoundPaddingTop();
	//   41   90:aload_0         
	//   42   91:getfield        #73  <Field TextView mTextView>
	//   43   94:invokevirtual   #462 <Method int TextView.getHeight()>
	//   44   97:aload_0         
	//   45   98:getfield        #73  <Field TextView mTextView>
	//   46  101:invokevirtual   #465 <Method int TextView.getCompoundPaddingBottom()>
	//   47  104:isub            
	//   48  105:aload_0         
	//   49  106:getfield        #73  <Field TextView mTextView>
	//   50  109:invokevirtual   #468 <Method int TextView.getCompoundPaddingTop()>
	//   51  112:isub            
	//   52  113:istore_3        
				if(i > 0)
	//*  53  114:iload_2         
	//*  54  115:ifle            194
				{
					if(j <= 0)
	//*  55  118:iload_3         
	//*  56  119:ifgt            123
						return;
	//   57  122:return          
					synchronized(TEMP_RECTF)
	//*  58  123:getstatic       #49  <Field RectF TEMP_RECTF>
	//*  59  126:astore          4
	//*  60  128:aload           4
	//*  61  130:monitorenter    
					{
						TEMP_RECTF.setEmpty();
	//   62  131:getstatic       #49  <Field RectF TEMP_RECTF>
	//   63  134:invokevirtual   #471 <Method void RectF.setEmpty()>
						TEMP_RECTF.right = i;
	//   64  137:getstatic       #49  <Field RectF TEMP_RECTF>
	//   65  140:iload_2         
	//   66  141:i2f             
	//   67  142:putfield        #398 <Field float RectF.right>
						TEMP_RECTF.bottom = j;
	//   68  145:getstatic       #49  <Field RectF TEMP_RECTF>
	//   69  148:iload_3         
	//   70  149:i2f             
	//   71  150:putfield        #415 <Field float RectF.bottom>
						float f = findLargestTextSizeWhichFits(TEMP_RECTF);
	//   72  153:aload_0         
	//   73  154:getstatic       #49  <Field RectF TEMP_RECTF>
	//   74  157:invokespecial   #473 <Method int findLargestTextSizeWhichFits(RectF)>
	//   75  160:i2f             
	//   76  161:fstore_1        
						if(f != mTextView.getTextSize())
	//*  77  162:fload_1         
	//*  78  163:aload_0         
	//*  79  164:getfield        #73  <Field TextView mTextView>
	//*  80  167:invokevirtual   #474 <Method float TextView.getTextSize()>
	//*  81  170:fcmpl           
	//*  82  171:ifeq            180
							setTextSizeInternal(0, f);
	//   83  174:aload_0         
	//   84  175:iconst_0        
	//   85  176:fload_1         
	//   86  177:invokevirtual   #478 <Method void setTextSizeInternal(int, float)>
					}
	//   87  180:aload           4
	//   88  182:monitorexit     
				} else
	//*  89  183:goto            196
	//*  90  186:astore          5
	//*  91  188:aload           4
	//*  92  190:monitorexit     
	//*  93  191:aload           5
	//*  94  193:athrow          
				{
					return;
	//   95  194:return          
				}
			} else
			{
				return;
	//   96  195:return          
			}
		break MISSING_BLOCK_LABEL_196;
		exception;
		rectf;
		JVM INSTR monitorexit ;
		throw exception;
		mNeedsAutoSizeText = true;
	//   97  196:aload_0         
	//   98  197:iconst_1        
	//   99  198:putfield        #61  <Field boolean mNeedsAutoSizeText>
		return;
	//  100  201:return          
	}

	int getAutoSizeMaxTextSize()
	{
		return Math.round(mAutoSizeMaxTextSizeInPx);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field float mAutoSizeMaxTextSizeInPx>
	//    2    4:invokestatic    #348 <Method int Math.round(float)>
	//    3    7:ireturn         
	}

	int getAutoSizeMinTextSize()
	{
		return Math.round(mAutoSizeMinTextSizeInPx);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field float mAutoSizeMinTextSizeInPx>
	//    2    4:invokestatic    #348 <Method int Math.round(float)>
	//    3    7:ireturn         
	}

	int getAutoSizeStepGranularity()
	{
		return Math.round(mAutoSizeStepGranularityInPx);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field float mAutoSizeStepGranularityInPx>
	//    2    4:invokestatic    #348 <Method int Math.round(float)>
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
	//    1    1:invokespecial   #342 <Method boolean supportsAutoSizeText()>
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
	//    3    5:getstatic       #491 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTextView>
	//    4    8:iload_2         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #497 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    7   13:astore_1        
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeTextType))
	//*   8   14:aload_1         
	//*   9   15:getstatic       #500 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeTextType>
	//*  10   18:invokevirtual   #504 <Method boolean TypedArray.hasValue(int)>
	//*  11   21:ifeq            36
			mAutoSizeTextType = ((TypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeTextType, 0);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getstatic       #500 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeTextType>
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #507 <Method int TypedArray.getInt(int, int)>
	//   17   33:putfield        #59  <Field int mAutoSizeTextType>
		float f;
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity))
	//*  18   36:aload_1         
	//*  19   37:getstatic       #510 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeStepGranularity>
	//*  20   40:invokevirtual   #504 <Method boolean TypedArray.hasValue(int)>
	//*  21   43:ifeq            59
			f = ((TypedArray) (attributeset)).getDimension(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity, -1F);
	//   22   46:aload_1         
	//   23   47:getstatic       #510 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeStepGranularity>
	//   24   50:ldc1            #20  <Float -1F>
	//   25   52:invokevirtual   #514 <Method float TypedArray.getDimension(int, float)>
	//   26   55:fstore_3        
		else
	//*  27   56:goto            62
			f = -1F;
	//   28   59:ldc1            #20  <Float -1F>
	//   29   61:fstore_3        
		float f1;
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize))
	//*  30   62:aload_1         
	//*  31   63:getstatic       #517 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeMinTextSize>
	//*  32   66:invokevirtual   #504 <Method boolean TypedArray.hasValue(int)>
	//*  33   69:ifeq            86
			f1 = ((TypedArray) (attributeset)).getDimension(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize, -1F);
	//   34   72:aload_1         
	//   35   73:getstatic       #517 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeMinTextSize>
	//   36   76:ldc1            #20  <Float -1F>
	//   37   78:invokevirtual   #514 <Method float TypedArray.getDimension(int, float)>
	//   38   81:fstore          4
		else
	//*  39   83:goto            90
			f1 = -1F;
	//   40   86:ldc1            #20  <Float -1F>
	//   41   88:fstore          4
		float f2;
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize))
	//*  42   90:aload_1         
	//*  43   91:getstatic       #520 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeMaxTextSize>
	//*  44   94:invokevirtual   #504 <Method boolean TypedArray.hasValue(int)>
	//*  45   97:ifeq            114
			f2 = ((TypedArray) (attributeset)).getDimension(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize, -1F);
	//   46  100:aload_1         
	//   47  101:getstatic       #520 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizeMaxTextSize>
	//   48  104:ldc1            #20  <Float -1F>
	//   49  106:invokevirtual   #514 <Method float TypedArray.getDimension(int, float)>
	//   50  109:fstore          5
		else
	//*  51  111:goto            118
			f2 = -1F;
	//   52  114:ldc1            #20  <Float -1F>
	//   53  116:fstore          5
		if(((TypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes))
	//*  54  118:aload_1         
	//*  55  119:getstatic       #523 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizePresetSizes>
	//*  56  122:invokevirtual   #504 <Method boolean TypedArray.hasValue(int)>
	//*  57  125:ifeq            162
		{
			i = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes, 0);
	//   58  128:aload_1         
	//   59  129:getstatic       #523 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_autoSizePresetSizes>
	//   60  132:iconst_0        
	//   61  133:invokevirtual   #526 <Method int TypedArray.getResourceId(int, int)>
	//   62  136:istore_2        
			if(i > 0)
	//*  63  137:iload_2         
	//*  64  138:ifle            162
			{
				TypedArray typedarray = ((TypedArray) (attributeset)).getResources().obtainTypedArray(i);
	//   65  141:aload_1         
	//   66  142:invokevirtual   #530 <Method Resources TypedArray.getResources()>
	//   67  145:iload_2         
	//   68  146:invokevirtual   #536 <Method TypedArray Resources.obtainTypedArray(int)>
	//   69  149:astore          7
				setupAutoSizeUniformPresetSizes(typedarray);
	//   70  151:aload_0         
	//   71  152:aload           7
	//   72  154:invokespecial   #538 <Method void setupAutoSizeUniformPresetSizes(TypedArray)>
				typedarray.recycle();
	//   73  157:aload           7
	//   74  159:invokevirtual   #541 <Method void TypedArray.recycle()>
			}
		}
		((TypedArray) (attributeset)).recycle();
	//   75  162:aload_1         
	//   76  163:invokevirtual   #541 <Method void TypedArray.recycle()>
		if(supportsAutoSizeText())
	//*  77  166:aload_0         
	//*  78  167:invokespecial   #342 <Method boolean supportsAutoSizeText()>
	//*  79  170:ifeq            272
		{
			if(mAutoSizeTextType == 1)
	//*  80  173:aload_0         
	//*  81  174:getfield        #59  <Field int mAutoSizeTextType>
	//*  82  177:iconst_1        
	//*  83  178:icmpne          277
			{
				if(!mHasPresetAutoSizeValues)
	//*  84  181:aload_0         
	//*  85  182:getfield        #71  <Field boolean mHasPresetAutoSizeValues>
	//*  86  185:ifne            266
				{
					attributeset = ((AttributeSet) (mContext.getResources().getDisplayMetrics()));
	//   87  188:aload_0         
	//   88  189:getfield        #81  <Field Context mContext>
	//   89  192:invokevirtual   #542 <Method Resources Context.getResources()>
	//   90  195:invokevirtual   #546 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   91  198:astore_1        
					float f3 = f1;
	//   92  199:fload           4
	//   93  201:fstore          6
					if(f1 == -1F)
	//*  94  203:fload           4
	//*  95  205:ldc1            #20  <Float -1F>
	//*  96  207:fcmpl           
	//*  97  208:ifne            221
						f3 = TypedValue.applyDimension(2, 12F, ((android.util.DisplayMetrics) (attributeset)));
	//   98  211:iconst_2        
	//   99  212:ldc2            #547 <Float 12F>
	//  100  215:aload_1         
	//  101  216:invokestatic    #553 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//  102  219:fstore          6
					f1 = f2;
	//  103  221:fload           5
	//  104  223:fstore          4
					if(f2 == -1F)
	//* 105  225:fload           5
	//* 106  227:ldc1            #20  <Float -1F>
	//* 107  229:fcmpl           
	//* 108  230:ifne            243
						f1 = TypedValue.applyDimension(2, 112F, ((android.util.DisplayMetrics) (attributeset)));
	//  109  233:iconst_2        
	//  110  234:ldc2            #554 <Float 112F>
	//  111  237:aload_1         
	//  112  238:invokestatic    #553 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//  113  241:fstore          4
					f2 = f;
	//  114  243:fload_3         
	//  115  244:fstore          5
					if(f == -1F)
	//* 116  246:fload_3         
	//* 117  247:ldc1            #20  <Float -1F>
	//* 118  249:fcmpl           
	//* 119  250:ifne            256
						f2 = 1.0F;
	//  120  253:fconst_1        
	//  121  254:fstore          5
					validateAndSetAutoSizeTextTypeUniformConfiguration(f3, f1, f2);
	//  122  256:aload_0         
	//  123  257:fload           6
	//  124  259:fload           4
	//  125  261:fload           5
	//  126  263:invokespecial   #556 <Method void validateAndSetAutoSizeTextTypeUniformConfiguration(float, float, float)>
				}
				setupAutoSizeText();
	//  127  266:aload_0         
	//  128  267:invokespecial   #558 <Method boolean setupAutoSizeText()>
	//  129  270:pop             
				return;
	//  130  271:return          
			}
		} else
		{
			mAutoSizeTextType = 0;
	//  131  272:aload_0         
	//  132  273:iconst_0        
	//  133  274:putfield        #59  <Field int mAutoSizeTextType>
		}
	//  134  277:return          
	}

	void setAutoSizeTextTypeUniformWithConfiguration(int i, int j, int k, int l)
		throws IllegalArgumentException
	{
		if(supportsAutoSizeText())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #342 <Method boolean supportsAutoSizeText()>
	//*   2    4:ifeq            61
		{
			android.util.DisplayMetrics displaymetrics = mContext.getResources().getDisplayMetrics();
	//    3    7:aload_0         
	//    4    8:getfield        #81  <Field Context mContext>
	//    5   11:invokevirtual   #542 <Method Resources Context.getResources()>
	//    6   14:invokevirtual   #546 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//    7   17:astore          5
			validateAndSetAutoSizeTextTypeUniformConfiguration(TypedValue.applyDimension(l, i, displaymetrics), TypedValue.applyDimension(l, j, displaymetrics), TypedValue.applyDimension(l, k, displaymetrics));
	//    8   19:aload_0         
	//    9   20:iload           4
	//   10   22:iload_1         
	//   11   23:i2f             
	//   12   24:aload           5
	//   13   26:invokestatic    #553 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   14   29:iload           4
	//   15   31:iload_2         
	//   16   32:i2f             
	//   17   33:aload           5
	//   18   35:invokestatic    #553 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   19   38:iload           4
	//   20   40:iload_3         
	//   21   41:i2f             
	//   22   42:aload           5
	//   23   44:invokestatic    #553 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   24   47:invokespecial   #556 <Method void validateAndSetAutoSizeTextTypeUniformConfiguration(float, float, float)>
			if(setupAutoSizeText())
	//*  25   50:aload_0         
	//*  26   51:invokespecial   #558 <Method boolean setupAutoSizeText()>
	//*  27   54:ifeq            61
				autoSizeText();
	//   28   57:aload_0         
	//   29   58:invokevirtual   #562 <Method void autoSizeText()>
		}
	//   30   61:return          
	}

	void setAutoSizeTextTypeUniformWithPresetSizes(int ai[], int i)
		throws IllegalArgumentException
	{
		if(supportsAutoSizeText())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #342 <Method boolean supportsAutoSizeText()>
	//*   2    4:ifeq            159
		{
			int j = 0;
	//    3    7:iconst_0        
	//    4    8:istore_3        
			int k = ai.length;
	//    5    9:aload_1         
	//    6   10:arraylength     
	//    7   11:istore          4
			if(k > 0)
	//*   8   13:iload           4
	//*   9   15:ifle            143
			{
				int ai2[] = new int[k];
	//   10   18:iload           4
	//   11   20:newarray        int[]
	//   12   22:astore          6
				int ai1[];
				if(i == 0)
	//*  13   24:iload_2         
	//*  14   25:ifne            39
				{
					ai1 = Arrays.copyOf(ai, k);
	//   15   28:aload_1         
	//   16   29:iload           4
	//   17   31:invokestatic    #568 <Method int[] Arrays.copyOf(int[], int)>
	//   18   34:astore          5
				} else
	//*  19   36:goto            85
				{
					android.util.DisplayMetrics displaymetrics = mContext.getResources().getDisplayMetrics();
	//   20   39:aload_0         
	//   21   40:getfield        #81  <Field Context mContext>
	//   22   43:invokevirtual   #542 <Method Resources Context.getResources()>
	//   23   46:invokevirtual   #546 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   24   49:astore          7
					do
					{
						ai1 = ai2;
	//   25   51:aload           6
	//   26   53:astore          5
						if(j >= k)
							break;
	//   27   55:iload_3         
	//   28   56:iload           4
	//   29   58:icmpge          85
						ai2[j] = Math.round(TypedValue.applyDimension(i, ai[j], displaymetrics));
	//   30   61:aload           6
	//   31   63:iload_3         
	//   32   64:iload_2         
	//   33   65:aload_1         
	//   34   66:iload_3         
	//   35   67:iaload          
	//   36   68:i2f             
	//   37   69:aload           7
	//   38   71:invokestatic    #553 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   39   74:invokestatic    #348 <Method int Math.round(float)>
	//   40   77:iastore         
						j++;
	//   41   78:iload_3         
	//   42   79:iconst_1        
	//   43   80:iadd            
	//   44   81:istore_3        
					} while(true);
	//   45   82:goto            51
				}
				mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(ai1);
	//   46   85:aload_0         
	//   47   86:aload_0         
	//   48   87:aload           5
	//   49   89:invokespecial   #350 <Method int[] cleanupAutoSizePresetSizes(int[])>
	//   50   92:putfield        #69  <Field int[] mAutoSizeTextSizesInPx>
				if(!setupAutoSizeUniformPresetSizesConfiguration())
	//*  51   95:aload_0         
	//*  52   96:invokespecial   #362 <Method boolean setupAutoSizeUniformPresetSizesConfiguration()>
	//*  53   99:ifne            148
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   54  102:new             #274 <Class StringBuilder>
	//   55  105:dup             
	//   56  106:invokespecial   #275 <Method void StringBuilder()>
	//   57  109:astore          5
					stringbuilder.append("None of the preset sizes is valid: ");
	//   58  111:aload           5
	//   59  113:ldc2            #570 <String "None of the preset sizes is valid: ">
	//   60  116:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   61  119:pop             
					stringbuilder.append(Arrays.toString(ai));
	//   62  120:aload           5
	//   63  122:aload_1         
	//   64  123:invokestatic    #573 <Method String Arrays.toString(int[])>
	//   65  126:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   66  129:pop             
					throw new IllegalArgumentException(stringbuilder.toString());
	//   67  130:new             #421 <Class IllegalArgumentException>
	//   68  133:dup             
	//   69  134:aload           5
	//   70  136:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   71  139:invokespecial   #429 <Method void IllegalArgumentException(String)>
	//   72  142:athrow          
				}
			} else
			{
				mHasPresetAutoSizeValues = false;
	//   73  143:aload_0         
	//   74  144:iconst_0        
	//   75  145:putfield        #71  <Field boolean mHasPresetAutoSizeValues>
			}
			if(setupAutoSizeText())
	//*  76  148:aload_0         
	//*  77  149:invokespecial   #558 <Method boolean setupAutoSizeText()>
	//*  78  152:ifeq            159
				autoSizeText();
	//   79  155:aload_0         
	//   80  156:invokevirtual   #562 <Method void autoSizeText()>
		}
	//   81  159:return          
	}

	void setAutoSizeTextTypeWithDefaults(int i)
	{
		if(supportsAutoSizeText())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #342 <Method boolean supportsAutoSizeText()>
	//*   2    4:ifeq            114
			switch(i)
	//*   3    7:iload_1         
			{
	//*   4    8:tableswitch     0 1: default 32
	//	               0 110
	//	               1 66
			default:
				StringBuilder stringbuilder = new StringBuilder();
	//    5   32:new             #274 <Class StringBuilder>
	//    6   35:dup             
	//    7   36:invokespecial   #275 <Method void StringBuilder()>
	//    8   39:astore_2        
				stringbuilder.append("Unknown auto-size text type: ");
	//    9   40:aload_2         
	//   10   41:ldc2            #577 <String "Unknown auto-size text type: ">
	//   11   44:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//   12   47:pop             
				stringbuilder.append(i);
	//   13   48:aload_2         
	//   14   49:iload_1         
	//   15   50:invokevirtual   #580 <Method StringBuilder StringBuilder.append(int)>
	//   16   53:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   17   54:new             #421 <Class IllegalArgumentException>
	//   18   57:dup             
	//   19   58:aload_2         
	//   20   59:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   21   62:invokespecial   #429 <Method void IllegalArgumentException(String)>
	//   22   65:athrow          

			case 1: // '\001'
				android.util.DisplayMetrics displaymetrics = mContext.getResources().getDisplayMetrics();
	//   23   66:aload_0         
	//   24   67:getfield        #81  <Field Context mContext>
	//   25   70:invokevirtual   #542 <Method Resources Context.getResources()>
	//   26   73:invokevirtual   #546 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   27   76:astore_2        
				validateAndSetAutoSizeTextTypeUniformConfiguration(TypedValue.applyDimension(2, 12F, displaymetrics), TypedValue.applyDimension(2, 112F, displaymetrics), 1.0F);
	//   28   77:aload_0         
	//   29   78:iconst_2        
	//   30   79:ldc2            #547 <Float 12F>
	//   31   82:aload_2         
	//   32   83:invokestatic    #553 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   33   86:iconst_2        
	//   34   87:ldc2            #554 <Float 112F>
	//   35   90:aload_2         
	//   36   91:invokestatic    #553 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   37   94:fconst_1        
	//   38   95:invokespecial   #556 <Method void validateAndSetAutoSizeTextTypeUniformConfiguration(float, float, float)>
				if(setupAutoSizeText())
	//*  39   98:aload_0         
	//*  40   99:invokespecial   #558 <Method boolean setupAutoSizeText()>
	//*  41  102:ifeq            114
				{
					autoSizeText();
	//   42  105:aload_0         
	//   43  106:invokevirtual   #562 <Method void autoSizeText()>
					return;
	//   44  109:return          
				}
				break;

			case 0: // '\0'
				clearAutoSizeConfiguration();
	//   45  110:aload_0         
	//   46  111:invokespecial   #582 <Method void clearAutoSizeConfiguration()>
				break;
			}
	//   47  114:return          
	}

	void setTextSizeInternal(int i, float f)
	{
		Resources resources;
		if(mContext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field Context mContext>
	//*   2    4:ifnonnull       14
			resources = Resources.getSystem();
	//    3    7:invokestatic    #585 <Method Resources Resources.getSystem()>
	//    4   10:astore_3        
		else
	//*   5   11:goto            22
			resources = mContext.getResources();
	//    6   14:aload_0         
	//    7   15:getfield        #81  <Field Context mContext>
	//    8   18:invokevirtual   #542 <Method Resources Context.getResources()>
	//    9   21:astore_3        
		setRawTextSize(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:fload_2         
	//   13   25:aload_3         
	//   14   26:invokevirtual   #546 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   15   29:invokestatic    #553 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   16   32:invokespecial   #587 <Method void setRawTextSize(float)>
	//   17   35:return          
	}

	private static final int DEFAULT_AUTO_SIZE_GRANULARITY_IN_PX = 1;
	private static final int DEFAULT_AUTO_SIZE_MAX_TEXT_SIZE_IN_SP = 112;
	private static final int DEFAULT_AUTO_SIZE_MIN_TEXT_SIZE_IN_SP = 12;
	private static final String TAG = "ACTVAutoSizeHelper";
	private static final RectF TEMP_RECTF = new RectF();
	static final float UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE = -1F;
	private static final int VERY_WIDE = 0x100000;
	private static ConcurrentHashMap sTextViewMethodByNameCache = new ConcurrentHashMap();
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
	//    4   10:new             #51  <Class ConcurrentHashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #52  <Method void ConcurrentHashMap()>
	//    7   17:putstatic       #54  <Field ConcurrentHashMap sTextViewMethodByNameCache>
	//*   8   20:return          
	}
}
