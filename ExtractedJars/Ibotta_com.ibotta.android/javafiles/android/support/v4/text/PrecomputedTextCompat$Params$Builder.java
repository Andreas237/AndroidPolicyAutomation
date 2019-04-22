// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import android.text.*;

// Referenced classes of package android.support.v4.text:
//			PrecomputedTextCompat

public static class PrecomputedTextCompat$Params$Builder
{

	public PrecomputedTextCompat.Params build()
	{
		return new PrecomputedTextCompat.Params(mPaint, mTextDir, mBreakStrategy, mHyphenationFrequency);
	//    0    0:new             #6   <Class PrecomputedTextCompat$Params>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field TextPaint mPaint>
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field TextDirectionHeuristic mTextDir>
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field int mBreakStrategy>
	//    8   16:aload_0         
	//    9   17:getfield        #34  <Field int mHyphenationFrequency>
	//   10   20:invokespecial   #48  <Method void PrecomputedTextCompat$Params(TextPaint, TextDirectionHeuristic, int, int)>
	//   11   23:areturn         
	}

	public PrecomputedTextCompat$Params$Builder setBreakStrategy(int i)
	{
		mBreakStrategy = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field int mBreakStrategy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PrecomputedTextCompat$Params$Builder setHyphenationFrequency(int i)
	{
		mHyphenationFrequency = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int mHyphenationFrequency>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PrecomputedTextCompat$Params$Builder setTextDirection(TextDirectionHeuristic textdirectionheuristic)
	{
		mTextDir = textdirectionheuristic;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field TextDirectionHeuristic mTextDir>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private int mBreakStrategy;
	private int mHyphenationFrequency;
	private final TextPaint mPaint;
	private TextDirectionHeuristic mTextDir;

	public PrecomputedTextCompat$Params$Builder(TextPaint textpaint)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		mPaint = textpaint;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field TextPaint mPaint>
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   5    9:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          23
	//*   7   14:icmplt          30
		{
			mBreakStrategy = 1;
	//    8   17:aload_0         
	//    9   18:iconst_1        
	//   10   19:putfield        #32  <Field int mBreakStrategy>
			mHyphenationFrequency = 1;
	//   11   22:aload_0         
	//   12   23:iconst_1        
	//   13   24:putfield        #34  <Field int mHyphenationFrequency>
		} else
	//*  14   27:goto            40
		{
			mHyphenationFrequency = 0;
	//   15   30:aload_0         
	//   16   31:iconst_0        
	//   17   32:putfield        #34  <Field int mHyphenationFrequency>
			mBreakStrategy = 0;
	//   18   35:aload_0         
	//   19   36:iconst_0        
	//   20   37:putfield        #32  <Field int mBreakStrategy>
		}
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  21   40:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   43:bipush          18
	//*  23   45:icmplt          56
		{
			mTextDir = TextDirectionHeuristics.FIRSTSTRONG_LTR;
	//   24   48:aload_0         
	//   25   49:getstatic       #39  <Field TextDirectionHeuristic TextDirectionHeuristics.FIRSTSTRONG_LTR>
	//   26   52:putfield        #41  <Field TextDirectionHeuristic mTextDir>
			return;
	//   27   55:return          
		} else
		{
			mTextDir = null;
	//   28   56:aload_0         
	//   29   57:aconst_null     
	//   30   58:putfield        #41  <Field TextDirectionHeuristic mTextDir>
			return;
	//   31   61:return          
		}
	}
}
