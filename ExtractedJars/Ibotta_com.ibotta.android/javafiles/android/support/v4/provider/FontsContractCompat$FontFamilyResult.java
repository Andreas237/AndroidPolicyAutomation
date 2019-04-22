// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;


// Referenced classes of package android.support.v4.provider:
//			FontsContractCompat

public static class FontsContractCompat$FontFamilyResult
{

	public FontsContractCompat.FontInfo[] getFonts()
	{
		return mFonts;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field FontsContractCompat$FontInfo[] mFonts>
	//    2    4:areturn         
	}

	public int getStatusCode()
	{
		return mStatusCode;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int mStatusCode>
	//    2    4:ireturn         
	}

	private final FontsContractCompat.FontInfo mFonts[];
	private final int mStatusCode;

	public FontsContractCompat$FontFamilyResult(int i, FontsContractCompat.FontInfo afontinfo[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mStatusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #23  <Field int mStatusCode>
		mFonts = afontinfo;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field FontsContractCompat$FontInfo[] mFonts>
	//    8   14:return          
	}
}
