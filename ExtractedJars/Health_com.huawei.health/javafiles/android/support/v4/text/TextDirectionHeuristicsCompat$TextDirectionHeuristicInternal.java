// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//			TextDirectionHeuristicsCompat

static class TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal extends TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
{

	protected boolean defaultIsRtl()
	{
		return mDefaultIsRtl;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field boolean mDefaultIsRtl>
	//    2    4:ireturn         
	}

	private final boolean mDefaultIsRtl;

	TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(TextDirectionHeuristicsCompat.TextDirectionAlgorithm textdirectionalgorithm, boolean flag)
	{
		super(textdirectionalgorithm);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl(TextDirectionHeuristicsCompat$TextDirectionAlgorithm)>
		mDefaultIsRtl = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #16  <Field boolean mDefaultIsRtl>
	//    6   10:return          
	}
}
