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
			return BidiFormatter.access$200();
	//    2    4:invokestatic    #39  <Method BidiFormatter BidiFormatter.access$200()>
	//    3    7:areturn         
		else
			return BidiFormatter.access$300();
	//    4    8:invokestatic    #42  <Method BidiFormatter BidiFormatter.access$300()>
	//    5   11:areturn         
	}

	private void initialize(boolean flag)
	{
		mIsRtlContext = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field boolean mIsRtlContext>
		mTextDirectionHeuristicCompat = BidiFormatter.access$100();
	//    3    5:aload_0         
	//    4    6:invokestatic    #48  <Method TextDirectionHeuristicCompat BidiFormatter.access$100()>
	//    5    9:putfield        #50  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
		mFlags = 2;
	//    6   12:aload_0         
	//    7   13:iconst_2        
	//    8   14:putfield        #52  <Field int mFlags>
	//    9   17:return          
	}

	public BidiFormatter build()
	{
		if(mFlags == 2 && mTextDirectionHeuristicCompat == BidiFormatter.access$100())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int mFlags>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          26
	//*   4    8:aload_0         
	//*   5    9:getfield        #50  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
	//*   6   12:invokestatic    #48  <Method TextDirectionHeuristicCompat BidiFormatter.access$100()>
	//*   7   15:if_acmpne       26
			return getDefaultInstanceFromContext(mIsRtlContext);
	//    8   18:aload_0         
	//    9   19:getfield        #44  <Field boolean mIsRtlContext>
	//   10   22:invokestatic    #55  <Method BidiFormatter getDefaultInstanceFromContext(boolean)>
	//   11   25:areturn         
		else
			return new BidiFormatter(mIsRtlContext, mFlags, mTextDirectionHeuristicCompat, ((BidiFormatter._cls1) (null)));
	//   12   26:new             #6   <Class BidiFormatter>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:getfield        #44  <Field boolean mIsRtlContext>
	//   16   34:aload_0         
	//   17   35:getfield        #52  <Field int mFlags>
	//   18   38:aload_0         
	//   19   39:getfield        #50  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
	//   20   42:aconst_null     
	//   21   43:invokespecial   #58  <Method void BidiFormatter(boolean, int, TextDirectionHeuristicCompat, BidiFormatter$1)>
	//   22   46:areturn         
	}

	public BidiFormatter$Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textdirectionheuristiccompat)
	{
		mTextDirectionHeuristicCompat = textdirectionheuristiccompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public BidiFormatter$Builder stereoReset(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
		{
			mFlags = mFlags | 2;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field int mFlags>
	//    5    9:iconst_2        
	//    6   10:ior             
	//    7   11:putfield        #52  <Field int mFlags>
			return this;
	//    8   14:aload_0         
	//    9   15:areturn         
		} else
		{
			mFlags = mFlags & -3;
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #52  <Field int mFlags>
	//   13   21:bipush          -3
	//   14   23:iand            
	//   15   24:putfield        #52  <Field int mFlags>
			return this;
	//   16   27:aload_0         
	//   17   28:areturn         
		}
	}

	private int mFlags;
	private boolean mIsRtlContext;
	private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

	public BidiFormatter$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		initialize(BidiFormatter.access$000(Locale.getDefault()));
	//    2    4:aload_0         
	//    3    5:invokestatic    #23  <Method Locale Locale.getDefault()>
	//    4    8:invokestatic    #27  <Method boolean BidiFormatter.access$000(Locale)>
	//    5   11:invokespecial   #31  <Method void initialize(boolean)>
	//    6   14:return          
	}

	public BidiFormatter$Builder(Locale locale)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		initialize(BidiFormatter.access$000(locale));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #27  <Method boolean BidiFormatter.access$000(Locale)>
	//    5    9:invokespecial   #31  <Method void initialize(boolean)>
	//    6   12:return          
	}

	public BidiFormatter$Builder(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		initialize(flag);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #31  <Method void initialize(boolean)>
	//    5    9:return          
	}
}
