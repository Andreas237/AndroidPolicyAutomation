// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//			BidiFormatter, TextDirectionHeuristicCompat

public static final class BidiFormatter$Builder
{

	private static BidiFormatter getDefaultInstanceFromContext(boolean flag)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            8
			return BidiFormatter.DEFAULT_RTL_INSTANCE;
	//    2    4:getstatic       #38  <Field BidiFormatter BidiFormatter.DEFAULT_RTL_INSTANCE>
	//    3    7:areturn         
		else
			return BidiFormatter.DEFAULT_LTR_INSTANCE;
	//    4    8:getstatic       #41  <Field BidiFormatter BidiFormatter.DEFAULT_LTR_INSTANCE>
	//    5   11:areturn         
	}

	private void initialize(boolean flag)
	{
		mIsRtlContext = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean mIsRtlContext>
		mTextDirectionHeuristicCompat = BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC;
	//    3    5:aload_0         
	//    4    6:getstatic       #46  <Field TextDirectionHeuristicCompat BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC>
	//    5    9:putfield        #48  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
		mFlags = 2;
	//    6   12:aload_0         
	//    7   13:iconst_2        
	//    8   14:putfield        #50  <Field int mFlags>
	//    9   17:return          
	}

	public BidiFormatter build()
	{
		if(mFlags == 2 && mTextDirectionHeuristicCompat == BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field int mFlags>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          26
	//*   4    8:aload_0         
	//*   5    9:getfield        #48  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
	//*   6   12:getstatic       #46  <Field TextDirectionHeuristicCompat BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC>
	//*   7   15:if_acmpne       26
			return getDefaultInstanceFromContext(mIsRtlContext);
	//    8   18:aload_0         
	//    9   19:getfield        #43  <Field boolean mIsRtlContext>
	//   10   22:invokestatic    #54  <Method BidiFormatter getDefaultInstanceFromContext(boolean)>
	//   11   25:areturn         
		else
			return new BidiFormatter(mIsRtlContext, mFlags, mTextDirectionHeuristicCompat);
	//   12   26:new             #6   <Class BidiFormatter>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:getfield        #43  <Field boolean mIsRtlContext>
	//   16   34:aload_0         
	//   17   35:getfield        #50  <Field int mFlags>
	//   18   38:aload_0         
	//   19   39:getfield        #48  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
	//   20   42:invokespecial   #57  <Method void BidiFormatter(boolean, int, TextDirectionHeuristicCompat)>
	//   21   45:areturn         
	}

	private int mFlags;
	private boolean mIsRtlContext;
	private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

	public BidiFormatter$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		initialize(BidiFormatter.isRtlLocale(Locale.getDefault()));
	//    2    4:aload_0         
	//    3    5:invokestatic    #23  <Method Locale Locale.getDefault()>
	//    4    8:invokestatic    #27  <Method boolean BidiFormatter.isRtlLocale(Locale)>
	//    5   11:invokespecial   #31  <Method void initialize(boolean)>
	//    6   14:return          
	}
}
